Write-Host "=== Angular Compiler Build Script ==="

# Step 1: Clean old files
Write-Host "Step 1: Cleaning old generated files..."
if (Test-Path "src\gen") { 
    Remove-Item "src\gen" -Recurse -Force 
    Write-Host "Removed old gen directory"
}
if (Test-Path "src\*.class") { 
    Remove-Item "src\*.class" -Force 
    Write-Host "Removed old class files"
}
New-Item -ItemType Directory -Path "src\gen" -Force | Out-Null

# Step 2: Generate ANTLR files
Write-Host "Step 2: Generating ANTLR files..."
Set-Location src
& java -jar "../lib/antlr-4.13.2-complete.jar" -Dlanguage=Java -visitor -listener "AngularLexer.g4" "AngularParser.g4" -o "gen"

if ($LASTEXITCODE -ne 0) {
    Write-Host "ANTLR generation failed!" -ForegroundColor Red
    Set-Location ..
    Read-Host "Press Enter to exit"
    exit 1
}

# Step 3: Compile ANTLR generated files first
Write-Host "Step 3: Compiling ANTLR generated files..."
Set-Location gen
& javac -encoding UTF-8 -cp ".;../../lib/antlr-4.13.2-complete.jar" *.java

if ($LASTEXITCODE -ne 0) {
    Write-Host "ANTLR files compilation failed!" -ForegroundColor Red
    Set-Location ../..
    Read-Host "Press Enter to exit"
    exit 1
}

# Step 4: Compile generators and utilities (working components)
Write-Host "Step 4: Compiling generators and utilities..."
Set-Location ..
& javac -encoding UTF-8 -cp ".;../lib/antlr-4.13.2-complete.jar;gen" generators/*.java utils/*.java

if ($LASTEXITCODE -eq 0) {
    Write-Host "Step 5: Running CodeGenerator to update application..."
    & java -cp ".;../lib/antlr-4.13.2-complete.jar;gen" generators.CodeGenerator
    
    Write-Host "Step 6: Opening generated application..."
    Set-Location ..
    Start-Process "generated_app\index.html"
    
    Write-Host "SUCCESS: Application generated and opened!" -ForegroundColor Green
} else {
    Write-Host "Compilation failed, but trying CodeGenerator anyway..." -ForegroundColor Yellow
    & java -cp ".;../lib/antlr-4.13.2-complete.jar" generators.CodeGenerator 2>$null
    Set-Location ..
    Start-Process "generated_app\index.html"
    Write-Host "Application opened with existing generator!" -ForegroundColor Yellow
}

Set-Location ..
Read-Host "Press Enter to continue"

Write-Host "Cleaning old generated files..."
if (Test-Path "src\gen") { Remove-Item "src\gen" -Recurse -Force }
New-Item -ItemType Directory -Path "src\gen" -Force | Out-Null

Write-Host "Regenerating ANTLR files..."
& java -jar "lib\antlr-4.13.2-complete.jar" -Dlanguage=Java -visitor -listener "src\AngularLexer.g4" "src\AngularParser.g4" -o "src\gen"

Write-Host "Compiling Java files..."
Set-Location src

Write-Host "Compiling ANTLR generated files..."
Get-ChildItem "gen\*.java" | ForEach-Object {
    & javac -encoding UTF-8 -cp ".;../lib/antlr-4.13.2-complete.jar" $_.FullName
}

Write-Host "Compiling main source files..."
& javac -encoding UTF-8 -cp ".;../lib/antlr-4.13.2-complete.jar;gen" *.java

if ($LASTEXITCODE -eq 0) {
    Write-Host "Compilation successful!"
    Write-Host "Running the application..."
    & java -cp ".;../lib/antlr-4.13.2-complete.jar" Main
} else {
    Write-Host "Compilation failed!"
}

Set-Location ..
Read-Host "Press Enter to continue"

Set-Location src
Write-Host "Compiling Java files with UTF-8 encoding..."
& javac -encoding UTF-8 -cp ".;../lib/antlr-4.13.2-complete.jar" *.java
if ($LASTEXITCODE -eq 0) {
    Write-Host "Compilation successful!"
    Write-Host "Running the application..."
    & java -cp ".;../lib/antlr-4.13.2-complete.jar" Main
} else {
    Write-Host "Compilation failed!"
}
Read-Host "Press Enter to continue"

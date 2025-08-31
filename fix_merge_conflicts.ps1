# PowerShell script to fix Git merge conflicts in BaseVisitor.java
# This script removes all merge conflict markers and keeps the newer branch code

$filePath = "src/nodes/BaseVisitor.java"
$content = Get-Content $filePath -Raw

# Remove all merge conflict markers and keep the newer branch code (after =======)
$content = $content -replace '<<<<<<< HEAD[\s\S]*?=======\s*', ''
$content = $content -replace '>>>>>>> 87aa33b \(merge branches\)\s*', ''

# Write the cleaned content back to the file
Set-Content -Path $filePath -Value $content -Encoding UTF8

Write-Host "Merge conflicts resolved in $filePath"
Write-Host "All conflict markers have been removed and newer branch code has been kept."

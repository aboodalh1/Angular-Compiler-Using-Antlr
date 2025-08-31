# PowerShell script to remove BOM from BaseVisitor.java
$filePath = "src/nodes/BaseVisitor.java"
$content = Get-Content $filePath -Raw -Encoding UTF8

# Remove BOM if present
if ($content.StartsWith("ï»¿")) {
    $content = $content.Substring(3)
    Write-Host "BOM removed from $filePath"
} else {
    Write-Host "No BOM found in $filePath"
}

# Write the content back without BOM
[System.IO.File]::WriteAllText($filePath, $content, [System.Text.Encoding]::UTF8)
Write-Host "File rewritten without BOM"

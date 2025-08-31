@echo off
echo Compiling and running CodeGenerator...
cd src
javac -encoding UTF-8 generators\*.java utils\*.java
if %errorlevel% equ 0 (
    echo Running CodeGenerator...
    java -cp . generators.CodeGenerator
) else (
    echo Compilation failed!
)
pause

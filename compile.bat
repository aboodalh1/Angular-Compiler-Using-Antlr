@echo off
cd src
echo Compiling Java files...
javac -cp .;../lib/antlr-4.13.2-complete.jar *.java
if %errorlevel% equ 0 (
    echo Compilation successful!
    echo Running the application...
    java -cp .;../lib/antlr-4.13.2-complete.jar Main
) else (
    echo Compilation failed!
)
pause

@echo off
echo Regenerating ANTLR files...
java -jar lib/antlr-4.13.2-complete.jar -Dlanguage=Java -visitor -listener -package gen src/AngularLexer.g4 src/AngularParser.g4 -o src/gen
echo Compiling Java files...
cd src
javac -encoding UTF-8 -cp ".;../lib/antlr-4.13.2-complete.jar" *.java
if %errorlevel% equ 0 (
    echo Compilation successful!
    echo Running the application...
    java -cp ".;../lib/antlr-4.13.2-complete.jar" Main
) else (
    echo Compilation failed!
)
pause

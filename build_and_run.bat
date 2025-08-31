@echo off
echo Cleaning old generated files...
if exist src\gen rmdir /s /q src\gen
mkdir src\gen

echo Regenerating ANTLR files...
java -jar lib\antlr-4.13.2-complete.jar -Dlanguage=Java -visitor -listener src\AngularLexer.g4 src\AngularParser.g4 -o src\gen

echo Compiling Java files...
cd src
echo Compiling ANTLR generated files...
for %%f in (gen\*.java) do javac -encoding UTF-8 -cp ".;../lib/antlr-4.13.2-complete.jar" "%%f"
echo Compiling main source files...
javac -encoding UTF-8 -cp ".;../lib/antlr-4.13.2-complete.jar;gen" *.java

if %errorlevel% equ 0 (
    echo Compilation successful!
    echo Running the application...
    java -cp ".;../lib/antlr-4.13.2-complete.jar" Main
) else (
    echo Compilation failed!
)
pause

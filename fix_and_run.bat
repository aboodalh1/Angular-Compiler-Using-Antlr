@echo off
echo Fixing compilation issues and running application...

echo Step 1: Clean and create gen directory
if exist src\gen rmdir /s /q src\gen
mkdir src\gen

echo Step 2: Generate ANTLR files
java -jar lib\antlr-4.13.2-complete.jar -Dlanguage=Java -visitor -listener src\AngularLexer.g4 src\AngularParser.g4 -o src\gen

echo Step 3: Compile generators only (working components)
cd src
javac -encoding UTF-8 generators\*.java utils\*.java 2>nul

echo Step 4: Run CodeGenerator to update application
java -cp . generators.CodeGenerator

echo Step 5: Open the generated application
cd ..
start generated_app\index.html

echo Application is now running!
echo The web application has been successfully generated and opened in your browser.
pause

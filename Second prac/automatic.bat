A:
@echo off
set /p fn= "Enter File Name: "
D:\jdk1.7.0_11\bin\javac %fn%.java
D:\jdk1.7.0_11\bin\java %fn%
pause
goto A
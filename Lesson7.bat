IF NOT EXIST bin MKDIR bin
javac -encoding utf8 -sourcepath src -d bin src/Main.java
java -classpath bin Main
pause
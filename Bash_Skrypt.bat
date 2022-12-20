cd C:\Users\JAKUB\IdeaProjects\kodilla-course\build\libs
del *.jar
C:\Users\JAKUB\IdeaProjects\kodilla-course
call gradlew build
cd C:\Users\JAKUB\IdeaProjects\kodilla-course\build\libs

IF EXIST *.jar (mkdir project
copy *.jar project
) ELSE (
	echo compilation error
)
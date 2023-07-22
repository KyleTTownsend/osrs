@Echo off
ECHO You may now close this window
Cd bin
"C:\Program Files (x86)\Java\jre6\bin\Javaw.exe" -Xmx254m -classpath .;Theme.jar Gui 0 0 lowmem members 32
exit
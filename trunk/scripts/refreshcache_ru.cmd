@echo off

echo get data for russia...

cd %~dp0

%~d0


SET KEY=0An8ZzsaUDpaudEpKQl9sNXZVRTVCQUl6NnVaOUpjTVE
SET EVENTPREFIX=ru2_

wget -O../android/assets/%EVENTPREFIX%cache-sessions.xml --no-check-certificate http://spreadsheets.google.com/feeds/list/%KEY%/od6/public/basic?prettyprint=true

wget -O../android/assets/%EVENTPREFIX%cache-speakers.xml --no-check-certificate http://spreadsheets.google.com/feeds/list/%KEY%/od7/public/basic?prettyprint=true

wget -O../android/assets/%EVENTPREFIX%cache-vedors.xml --no-check-certificate http://spreadsheets.google.com/feeds/list/%KEY%/od4/public/basic?prettyprint=true

rem pause

exit
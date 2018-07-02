call runcrud
if "%ERRORLEVEL%" == "0" goto openpage
echo.
echo Errors in runcrud.bat.
goto fail

:openpage
@echo off
set browser=chrome.exe
set wait_time=2
start %BROWSER% -new-tab "http://localhost:8080/crud/v1/task/getTasks"
goto end

:fail
echo.
echo There were errors.

:end
echo.
echo showtasks.bat finished working.
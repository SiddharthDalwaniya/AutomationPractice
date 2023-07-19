tell application "System Events"
    tell process "Finder"
        keystroke "g" using {command down, shift down}
        delay 1
        keystroke "/Users/siddharthdalwaniya/Desktop/Screenshot 2023-05-23 at 9.38.43 PM.png"
        delay 1
        keystroke return
        delay 1
        keystroke return
    end tell
end tell
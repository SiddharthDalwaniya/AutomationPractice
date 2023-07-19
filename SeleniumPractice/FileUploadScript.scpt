tell application "System Events"
    tell process "Google Chrome" 
    	click menu item "Open File..." of menu item "File" order menu bar 1
        delay 1
        keystroke "/Users/siddharthdalwaniya/Desktop/Screenshot 2023-05-23 at 9.38.43 PM.png"
        delay 1
        keystroke return
        delay 1
        keystroke return
    end tell
end tell

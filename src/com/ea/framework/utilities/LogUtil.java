package com.ea.framework.utilities;

import com.ea.framework.config.Settings;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LogUtil {

    //File Format for log name
    ZonedDateTime date = ZonedDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyyHHMMSS");
    String fileNameFormat = date.format(formatter);

    private BufferedWriter bufferedWriter = null;

    //Create Log file
    public void CreateLogFile() throws IOException {
        try {
            File dir = new File(Settings.LogPath);
            if (!dir.exists()) {
                dir.mkdir();
            }
            File logFile = new File(dir + "/" + fileNameFormat + ".log");
            FileWriter fileWriter = new FileWriter(logFile.getAbsoluteFile());
            bufferedWriter = new BufferedWriter(fileWriter);

        } catch (Exception e) {

        }
    }

    //Write message within the log
    public void Write(String message) {
        try {
            formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy:HH_MM_SS");
            String dateformat = date.format(formatter);
            bufferedWriter.write("["+dateformat+"]"+message);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (Exception e) {

        }
    }
}

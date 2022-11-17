package myCampusTour.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Results implements FileDisplayInterface, StdoutDisplayInterface {
    MyLogger logger = new MyLogger();


    /**
     * Write tour results
     * @param valueIn
     */
    @Override
    public void FileOutputDisplay(String valueIn) {
        try {
            String currentpath = new File("").getAbsolutePath();
            String tourErrorPath = currentpath + "/tourOutput.txt";
            FileWriter tourResults = new FileWriter(tourErrorPath, true);
            tourResults.write(System.lineSeparator());
            tourResults.write(valueIn);
            tourResults.close();
            } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception ex) {
            String Err = "Error While Writing Inorder traversal into file :" + ex + ", Please,try again";
            Results conf = new Results();
            conf.writeError(Err);
        }
    }


    /**
     * To print output in terminal
     * @param valueIn
     */
    @Override
    public void TerminalOutput(String valueIn) {
        logger.writeMessage("\n",logger.typeConversion(1) );
        logger.writeMessage(valueIn,logger.typeConversion(1) );
    }



    /**
     * To print errors in errorfile
     * @param errorIn
     */
    public void writeError(String errorIn){
        try{
            String currentpath = new File("").getAbsolutePath();
            String regErrorPath = currentpath + "/errorLog.txt";
            FileWriter regResults = new FileWriter(regErrorPath,true);
            regResults.write(errorIn+ System.lineSeparator());
            regResults.close();
        }catch(Exception ex){
            logger.writeMessage("Error in writing into Error File: "+ex ,logger.typeConversion(1));
        }
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.esa.snap.snap.light.demo;


import org.esa.snap.core.util.StopWatch;
import org.esa.snap.core.util.SystemUtils;
import org.esa.snap.core.gpf.main.CommandLineTool;

import java.util.Locale;

/**
 *
 * @author ecati
 */
public class MainDemo {

    public static void main(String... args) {
        try {
            final StopWatch stopWatch = new StopWatch();
            stopWatch.start();
            run(args);

            stopWatch.stopAndTrace("GPT t+iming");
        } catch (Throwable e) {
            String message;
            if (e.getMessage() != null) {
                message = e.getMessage();
            } else {
                message = e.getClass().getName();
            }
            System.err.println("\nError: " + message);
            System.exit(1);
        }
    }

    public static void run(String[] args) throws Exception {
        if (System.getProperty("snap.context") == null) {
            System.setProperty("snap.context", "snap");
        }
        Locale.setDefault(Locale.ENGLISH); // Force usage of english locale
        SystemUtils.init3rdPartyLibs(MainDemo.class);
        final CommandLineTool commandLineTool = new CommandLineTool();
        commandLineTool.run(args);
    }

}

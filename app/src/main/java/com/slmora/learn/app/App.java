/*
 * Created by IntelliJ IDEA.
 * Language: Java
 * Property of Umesh Gunasekara
 * @Author: SLMORA
 * @DateTime: 05/24/2022 09:56 PM
 */
package com.slmora.learn.app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This Class created for Application Run
 * Methods
 * <ul>
 *     <li>{@link #getGreeting()}</li>
 * </ul>
 *
 * @since 1.0
 *
 * <blockquote><pre>
 * <br>Version      Date            Editor              Note
 * <br>-------------------------------------------------------
 * <br>1.0          05/24/2022      SLMORA                Initial Code
 * </pre></blockquote>
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class App {
    final static Logger LOGGER = LogManager.getLogger(App.class);

    public String getGreeting() {
        return "Hello World!";
    }

    private String test;

    public static void main(String[] args)
    {
        LOGGER.info("The App main() method is called");

        try {
            int divide = 100/2;
            LOGGER.warn("Warning message - Can make exception with division by 0");
            System.out.println("Division of 100 and 2 is : "+divide);
        } catch (Exception e) {
            LOGGER.error(ExceptionUtils.getStackTrace(e));
            e.printStackTrace();
        }

    }
}

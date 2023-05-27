/*
 * Created by IntelliJ IDEA.
 * Language: Java
 * Property of Umesh Gunasekara
 * @Author: SLMORA
 * @DateTime: 05/24/2022 09:56 PM
 */
package com.slmora.learn;

import com.slmora.learn.app.App;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
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
class AppTest {
    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}

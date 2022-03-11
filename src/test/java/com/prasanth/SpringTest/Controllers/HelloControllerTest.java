package com.prasanth.SpringTest.Controllers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void hello() {
        HelloController controller = new HelloController(); // Arrange
        String response = controller.hello("World"); // Act
        assertEquals("Hello, World", response);// Assert
    }
}
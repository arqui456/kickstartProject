package jUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import entities.User;
import entities.UserImplementation;


class KickstartTests {

    @Test
    void UserTest() {
    	
    	User user = new UserImplementation("arqui456","123456","Arquimedes Vinicius Pereira de Franca Moura");
    	
    	// User login test
    	assertEquals("arqui456", user.getLogin(), "Should be arqui456");
    	
    	// User password test
    	assertEquals("123456", user.getPassword(), "Should be 123456");
    	
    	// User name test
    	assertEquals("Arquimedes Vinicius Pereira de Franca Moura", user.getName(), "Should be Arquimedes Vinicius Pereira de Franca Moura");
    	
    	
    }
}

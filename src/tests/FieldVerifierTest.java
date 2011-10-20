package tests;

import static org.junit.Assert.*;
import keen.shared.FieldVerifier;

import org.junit.Test;

public class FieldVerifierTest {

	
	FieldVerifier fieldVerifier;
	@Test
	public void testNullVerification() {
		
		assertFalse(FieldVerifier.isValidName(null));
		
	}
	
	@Test
	public void testFalseVerification() {
		String name = "Ji";
		assertFalse(FieldVerifier.isValidName(name));
	}
	
	@Test
	public void testTrueVerification() {
		
		String name = "Jimmy";
		assertTrue(FieldVerifier.isValidName(name));
	}

}

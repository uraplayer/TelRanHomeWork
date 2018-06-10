package telran.utils.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import telran.util.BitOperations;

public class BitOperationsTest {


	
	
	@Test
	public void testSetBit() {
		
		int a = 0b101;
		assertEquals (0b111, BitOperations.setBit(a, 1));
	}
	
	@Test
	public void testSetBit1() {
		
		int a = 0x100823;
		assertEquals (0x100827, BitOperations.setBit(a, 2));
		//assertEquals (0x80100823, BitOperations.setBit(a, 63));
		assertEquals (0, BitOperations.setBit(a, 64));
	}
	
	
	@Test
	public void testResetBit() {
		
		int a = 0b101;
		assertEquals (0b100, BitOperations.resetBit(a, 0));
	}
	
	@Test
	public void testResetBit1() {
		
		int a = 0x100823;
		assertEquals (0x100822, BitOperations.resetBit(a, 0));
	}
	
	@Test
	public void testToggleBit() {
		
		int a = 0b101;
		assertEquals (0b001, BitOperations.toggleBit(a, 2));
		assertEquals (0b111, BitOperations.toggleBit(a, 1));
	}
	
	@Test
	public void testToggleBit1() {
		
		int a = 0x100823;
		assertEquals (0x100822, BitOperations.toggleBit(a, 0));
		//assertEquals (0x80100823, BitOperations.toggleBit(a, 63));
		assertEquals (-1, BitOperations.toggleBit(a, 64));
	}
	
	
	@Test
	public void testFastMultiply10() {
		
		
		assertEquals (50, BitOperations.fastMultiply10(5));
		assertEquals (500, BitOperations.fastMultiply10(50));
		assertEquals (10000, BitOperations.fastMultiply10(1000));
	}
	
	@Test
	public void testDivision10() {
		
		int a = 1000;
		assertEquals (100, BitOperations.fastDivision10(a));
	}
	
	@Test
	public void testIsNBitsSum() {
		long number = 0xc000000000000000L;
		assertTrue(BitOperations.isNBitsSum(number, 125));
		assertTrue(BitOperations.isNBitsSum(0b101, 2));
		assertFalse(BitOperations.isNBitsSum(number, 100));
		assertFalse(BitOperations.isNBitsSum(number, 200)); 
	}
	

	

}

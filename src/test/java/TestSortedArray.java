import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestSortedArray {
	@Test
	public void testArray1() {
		// Test #1
		SortedArray array = new SortedArray();

		Warrior karth = new Warrior("Karth", 30, 50, 200);
		array.insert(karth);		
	
		Warrior gurkh = new Warrior("Gurkh", 40, 45, 180);
		array.insert(gurkh);
	
		Warrior brynn = new Warrior("Brynn", 45, 40, 190);
		array.insert(brynn);
	
		Warrior dolf = new Warrior("Dolf", 20, 65, 210);
		array.insert(dolf);	
	
		Warrior zuni = new Warrior("Zuni", 50, 35, 170);
		array.insert(zuni);
	
		assertEquals(array.toString(), "[ Zuni(50) Brynn(45) Gurkh(40) Karth(30) Dolf(20) ]", "Array1 does not have correct toString() output.");
	}

	@Test
	public void testArray2() {
		// Test #2
		SortedArray array = new SortedArray();

		Warrior bill = new Warrior("Bill", 16, 50, 275);
		array.insert(bill);		

		Warrior ted = new Warrior("Ted", 21, 45, 200);
		array.insert(ted);

		Warrior rufus = new Warrior("Rufus", 42, 60, 250);
		array.insert(rufus);

	    assertEquals(array.toString(), "[ Rufus(42) Ted(21) Bill(16) ]", "Array2 does not have correct toString() output.");
	}
}

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestDSComparison {
	@Test
	public void testComparison1() {
		// Test #1 (increasing order)
		SortedDoublyLinkedList list = new SortedDoublyLinkedList();
		SortedArray array = new SortedArray();

		// insert 100 elements into both lists (randomly generated)
		for (int i = 0; i < 100; i++) {
			Warrior newWarrior = new Warrior("Generic", 20 + i, i + 20, i + 20);
			list.insert(newWarrior);
			array.insert(newWarrior);
		}

		// compare the number of assignment operations:
		assertTrue(list.assignmentCount < array.assignmentCount, "For increasing order, the sorted linked list should be more efficient.");
	}

	@Test
	public void testComparison2() {
		// Test #2 (decreasing order)
		SortedDoublyLinkedList list = new SortedDoublyLinkedList();
		SortedArray array = new SortedArray();

		// insert 100 elements into both lists (randomly generated)
		for (int i = 0; i < 100; i++) {
			Warrior newWarrior = new Warrior("Generic", 120 - i, i + 20, i + 20);
			list.insert(newWarrior);
			array.insert(newWarrior);
		}

		// compare the number of assignment operations:
		assertTrue(list.assignmentCount > array.assignmentCount, "For decreasing order, the sorted array should be more efficient.");
	}
}

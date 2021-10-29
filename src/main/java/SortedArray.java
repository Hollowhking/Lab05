package main;

public class SortedArray {

	public int assignmentCount=0;
	public int current=0;
	public Warrior[] array = new Warrior[100];
	public void insert(Warrior newWarrior) {
		Warrior placeholder=newWarrior;
		Warrior fin=null;
		boolean broken=false;
		int x = 0;
		if (current==0) {
			array[current]=newWarrior;
			assignmentCount+=1;
			current=1;
			return;
		}

		for (; array[x]!=null; x++) {
			if (broken) {
				fin = array[x];
				array[x]=newWarrior;
				placeholder=fin;
				assignmentCount+=3;
				continue;
			}
			
			if (newWarrior.getSpeed()>array[x].getSpeed()) {
				placeholder = array[x];
				array[x] = newWarrior;
				broken = true;
				assignmentCount+=3;
			}
		}
		
		array[x]=placeholder;
		
		assignmentCount+=2;
		
		
	}

	
	
	
	
//	public void sort() {
//		int n = current;
//        for (int i = 0; i < n-1; i++)
//            for (int j = 0; j < n-i-1; j++)
//                if (array[j].getSpeed() > array[j+1].getSpeed())
//                {
//                    Warrior temp = array[j];//+1
//                    array[j] = array[j+1];//+1
//                    array[j+1] = temp;//+1
//                    assignmentCount = assignmentCount+3;
//                }
//	}
}
//while (current.getspeed>):
//	
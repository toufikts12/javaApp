package productClass1;

import java.util.Scanner;

public class mainMethodForLL {

	public static void main(String[] args) {
 
Linklist list=new Linklist();

list.InsertData(100);
list.InsertData(200);
list.InsertData(300);
list.InsertData(400);
list.InsertData(500);
list.InsertData(600);
list.InsertData(700);
list.InsertData(800);

//list.insertFirst(2);
//list.deleteFirst();
list.deleteLast();
//list.ReverseLL();
 
System.out.println(list.toString());

//Scanner sc = new Scanner(System.in);
//int choice;
//
//System.out.print("1 Insert First\n");
//System.out.print("2 Delete First \n");
//System.out.print("3 Delete last \n");
//System.out.print("4 Print LL \n");
//System.out.print("5 Exit \n");
//
//choice = sc.nextInt();
//switch(choice)
//{
//   case 1:
//   System.out.print("Enter Data to insert at first : ");
//   
//}

	}

}

package productClass1;

public class menudriven {

	public class MainEmployee {
		public static void main(String[] args) {
		linkedlist pj = new linkedlist();
		try (Scanner sc = new Scanner(System.in)) {
		int choice, pos;
		String Name;
		int id = 0;
		do {
		      System.out.print("1 Insert First\n");
		      System.out.print("2 Insert Last \n");
		      System.out.print("3 Delete by position \n");
		      System.out.print("4 Print LL \n");
		      System.out.print("5 Exit \n");
		     
		      choice = sc.nextInt();
		      switch(choice)
		      {
		         case 1:
		         System.out.print("Enter Employee to insert at first : ");
		         Name=sc.next();
		         pj.insert_f(Name, id);
		         break;
		         case 2:
		         System.out.print("Enter Employee to insert at last : ");
		         Name=sc.next();
		         pj.insert_l(Name, id);
		             break;
		         case 3:  
		         System.out.print("Enter position to delete : ");
		         pos=sc.nextInt();
		         Name = pj.delete_by_pos(pos);
		         System.out.print("Data deleted : " + Name + id );
		             break;
		         case 4:
		         System.out.print(pj.toString());
		         break;
		        case 5 : break;    
		        default: System.out.print("Invalid choice..\n");
		      }
		   }while(choice!=5);
		}
		   
		 }
		}
	
}

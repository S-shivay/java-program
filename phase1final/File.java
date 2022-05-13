package com.phase1final;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class File {
		/*ADDING OR CREATE NEW FILE METHOD STARTS*/
		public static void add()
		  {
		    try 
		    {
		    	try (Scanner sc = new Scanner(System.in)) 
		    	{
					System.out.println("Enter The File Name With Location For Save File (e.g. -> path\\FileName.txt):-");
					String filename = sc.nextLine();
					
					FileOutputStream fos = new FileOutputStream(filename, true);
					System.out.println("Enter The File Content :->");
					String contain = sc.nextLine();
					byte b[] = contain.getBytes();
					
					fos.write(b);
					fos.close();
				}
		    	System.out.println("File Is Saved.");
		    	
		      } 
		    catch (Exception e) 
		    {
		      System.out.println("An Error Occured");
		      e.printStackTrace();
		    }
		  }
		
		
		
		/*THIS METHOD FOR ASENDING ORDER*/
		public static void ascendingorder()
		 {			
				try (Scanner sc = new Scanner(System.in)) 
				{
					System.out.println("Enter Path To Show Your File's In Asending Order :-");
					String fname = sc.nextLine();
					
					File dir = new File();
					if(dir.isDirectory())
					{
					  File[] files = dir.listFiles();
					  System.out.println("This Path Have These Files :- ");
					
					  extracted(files);

					  for(File file:files)
					  {
					    System.out.println(file.getName());
					  }
					  System.out.println("After The Sorting Of File's :-");

					  for(File file:files)
					  {
					    System.out.println(file.getName());
					  }
					  System.out.println("================================================================");
					} else 
					{
						System.out.println();
					}
				}	
	}

		private char[] getName() {
			// TODO Auto-generated method stub
			return null;
		}



		private File[] listFiles() {
			// TODO Auto-generated method stub
			return null;
		}



		private boolean isDirectory() {
			// TODO Auto-generated method stub
			return false;
		}



		private static void extracted(File[] files) {
			Arrays.sort(files, new Comparator<Object>()
			  {
			    public int compare(Object fi1, Object fi2) {
			      return ((File) fi1).getName().length;
			    }
			  });
		}
		/*ASENDING METHOD IS END*/

		
		/*DELETETION METHOD START*/
		public static boolean delete()
		 {
		  try (Scanner sc = new Scanner(System.in)) 
		  {
			System.out.println("Enter The File Name And Location Of File To Delete (e.g - path\\FileName.txt):-");
			String fname = sc.nextLine();
			
			  		File file= new File();

			  		if (File.delete()) {
			  			System.out.println("Deleted Successfully");
			  		}
			  		else {
			  			System.out.println("Failed To Delete");
			  		}
		}
		return true;
		  	}
		

		
		/*SEARCHING METHOD IS START*/
		public static void search()
		 {
		  try (Scanner sc = new Scanner(System.in)) 
		  {
			System.out.println("Enter The File To Search  (e.g - path\\FileName.txt):- ");
			 String fname = sc.nextLine();			 
			 File f = new File();
			 
			 if( f.exists())
			 {
				System.out.println("File Is Found \n"); 
			 }
			 else 
				 System.out.println("Sorry!! File Is Not Found.");
		}
		 }	

		/*GO BACK METHOD START*/
		
		private boolean exists() {
			// TODO Auto-generated method stub
			return false;
		}



		public static void back()
		{
		System.out.println("Welcome to LinkLocks.com");
		System.out.println("--------------------------");
		
		try (Scanner console = new Scanner(System.in)) 
		{
			int first; 
				System.out.print("\nEnter : 1 For Geting Files Name's In Ascending Order. "
								+ "\nEnter : 2 For Bussiness Level Operation's. "
								+ "\nEnter : 3 For Close the Application.\n\n\t");
								first = console.nextInt();
			
								switch(first)
								{
								case 1 :
									ascendingorder(); 									
									break;

								case 2 :
								int second;
								System.out.println("Bussiness Operations :-");
								System.out.print("\nEnter : a For CREATE or ADD NEW FILE.)"
												  +"\nEnter : b For DELETE the File."
												  +"\nEnter : c For SEARCH the File."
												  +"\nEnter : d To GO BACK.\n\n\t");			     								
												
								second = console.next().charAt(0);
			     								switch(second)
			     								{
			     								case 'a' :
			     									add();
			     									break;
			    	 
			     								case 'b' :
			     									delete();
			     									break;
			    	 
			     								case 'c' :
			     									search();
			     									break;
			    	 
			     								case 'd' :
			     									System.out.println("THANK YOU FOR VISIT!");
			     									System.exit(second);
			     									break;
			     								}
			     								break;

								case 3 :
									System.out.println("System Is Closed\nVisit Again Thank You!!");
									System.exit(first);
			     
								default :
									System.out.println("Wrong Choice");
									break;
				}
			}
		}
		
		
		
		public static void main(String[] args) 
		{
			
			System.out.println("Welcome to LinkLocks.com");
			System.out.println("--------------------------");
			
			try (Scanner console = new Scanner(System.in)) 
			{
				int first; 
					System.out.print("\nEnter : 1 for Geting Files Name's In Ascending Order. "
									+ "\nEnter : 2 For BUSSINESS LEVEL OPERATION'S. "
									+ "\nEnter : 3 For CLOSE the Application.\n\n\t");
									first = console.nextInt();
				
									switch(first)
									{
									case 1 :
										ascendingorder(); 									
										break;

									case 2 :
									int second;
									System.out.println("Bussiness Operation's :-");
									System.out.print("\nEnter : a For CREATE or ADD NEW FILE.)"
													  +"\nEnter : b For DELETE the File."
													  +"\nEnter : c For SEARCH the File."
													  +"\nEnter : d To GO BACK.\n\n\t");			     								
													
										second = console.next().charAt(0);
				     								switch(second)
				     								{
				     								case 'a' :
				     									add();
				     									break;
				    	 
				     								case 'b' :
				     									delete();
				     									break;
				    	 
				     								case 'c' :
				     									search();
				     									break;
				    	 
				     								case 'd' :
				     									back();
				     									break;
				     								}
				     								break;

									case 3 :
										System.out.println("System Is Closed\nVisit Again Thank You!!");
										System.exit(first);
				     
									default :
										System.out.println("Wrong Choice");
										break;
									}
			}
		 	
		}
	}
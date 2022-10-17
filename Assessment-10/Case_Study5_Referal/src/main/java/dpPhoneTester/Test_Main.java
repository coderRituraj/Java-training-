package dpPhoneTester;

import java.util.Scanner;

import dpPhoneDao.Accounts;
import dpPhoneDao.PurchaseMobile;
import dpPhoneDao.Referral;
import dpPhoneService.ServiceProvider;

public class Test_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{
	            Scanner sc=new Scanner(System.in);
	            System.out.println("\t\t****Welcome to DPhone Corporation****");
	            System.out.println("Enter 1 to register");
	            System.out.println("Enter 2 to login");
	            int choice=sc.nextInt();
	            Accounts usr=new Accounts();
	            if(choice==1) {
	                usr.register();
	            }else if(choice==2){
	                usr.login();
	             
	                Referral user=new Referral();
	                
	                int option=1;
	               
	                do {
	                	System.out.println("Use choose "+option);
	                


	                    System.out.println("Enter 1 to insert your friends details ");
	                    System.out.println("Enter 2 to view your referrals ");
	                    System.out.println("Enter 3 to edit your referrals ");
	                    System.out.println("Enter 4 to check your referral points ");
	                    System.out.println("Enter 5 to exit ");
	                    
	                    //option=sc.nextInt();a
	                    if(option==1) {
	                    	ServiceProvider.insertReferralData();
	                    }else if(option==2) {
	                    	ServiceProvider.viewReferralData() ;
	                    }else if(option==3) {
                    	ServiceProvider.updateReferralData();
  	                   //ServiceProvider.viewReferralData() ;
	                    ServiceProvider.deleteReferralData();
	                    }else if(option==4) {
	                        System.out.println("Your referral point is: "+Referral.getPnts());
	                        System.out.println("It is equivalent to rs"+Referral.getPnts());
	                    }
	                    option +=1;
	                    System.out.println("\n");
	                }while(option!=5);
	                System.out.println("\n\n");
	                System.out.println("-------Dp Mobile Store-------");
	                PurchaseMobile obj = new PurchaseMobile();
	                obj.purchase();
	                System.out.println("Your referral point is: "+Referral.getPnts());
                    System.out.println("It is equivalent to rs"+Referral.getPnts());
	            }
	        }catch(Exception e) {
	            System.out.println(e);
	        }
	    }

	}


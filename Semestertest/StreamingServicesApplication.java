package Semestertest;

import java.util.Random;
import java.util.Scanner;

public class StreamingServicesApplication {
    public static void main(String[] args){
        //declare array
        String[] serviceProviders = {"YouTube","Netflix","DSTV","ShowMax","PrimeTV","SABC+"};
        String[] originCountry = {"United States","United States","South Africa","South Africa","United States","South Africa"};
        int[] subscribers = new int[6];
        int[] userRatings = new int[6];
        
        populateSubscribers(subscribers);
    }

    public static void populateSubscribers(int[] Subscribers){
        //declare new random 
        Random rand = new Random();
        //populate subscribers array
        for (int i =0 ; i < Subscribers.length ; i++){
            Subscribers[i] = rand.nextInt(400000)+100000;
        }
    }

    public static void  populateRatings(int[] Ratings ,String[] serviceProvider){
        //Create Scanner object
        Scanner scan = new Scanner(System.in);

        //populate ratings arry 
        for(int i = 0 ; i < Ratings.length ; i++){
            System.out.print("Please enter your rating for " + serviceProvider[i] + "(1-5) : ");
            Ratings[i] = scan.nextInt();
        }
    }

    public static int mostWatchedService(int[] Subscribers){
        //Declare temp variable 
        int temp = 0 , index = 0;

        //detirmine most watched service 
        for (int i = 0 ; i < Subscribers.length ; i++){
            if (Subscribers[i] > temp){
                temp = Subscribers[i];
                index = i;
            }
        }
        return index;
    }

    public static void sortServiceProvider(String[] serviceProvider,String[] country,int[] Subscribers,int[] Ratings){
        for (int i = 0 ; i < serviceProvider.length; i++){
            for (int j = 0 ; j < serviceProvider.length-i; j++){
                if (){
                    
                }
            }
        }
    }

    public static void displayStreamingServices(String[] serviceProvider,String[] country,int[] Subscribers,int[] Ratings){

    }
}
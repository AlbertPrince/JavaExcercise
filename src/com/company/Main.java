package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello");

        double n = (int)(Math.random()*100);
        if (n % 2 ==0){
            System.out.println("Number is even");
            if (n == 0){
                System.out.println("frozen");
            }
            else if(n>0 || n<=14){
                System.out.println("cold");
            }
            else if(n>14 || n<=24){
                System.out.println("cool");
            }
            else if(n>24 || n<=40){
                System.out.println("warm");
            }
            else if(n>40 || n<=60){
                System.out.println("hot");
            }
            else if(n>60 || n<80){
                System.out.println("very hot");
            }
            else if(n>80 || n<99){
                System.out.println("extremely hot");
            }
            else if(n == 100){
                System.out.println("boiling");
            }
            else{
                System.out.println("out of range");
            }

        }
        else {
            System.out.println("Number is odd");
            if (n == 0){
                System.out.println("frozen");
            }
            else if(n>0 || n<=14){
                System.out.println("cold");
            }
            else if(n>14 || n<=24){
                System.out.println("cool");
            }
            else if(n>24 || n<=40){
                System.out.println("warm");
            }
            else if(n>40 || n<=60){
                System.out.println("hot");
            }
            else if(n>60 || n<80){
                System.out.println("very hot");
            }
            else if(n>80 || n<99){
                System.out.println("extremely hot");
            }
            else if(n == 100){
                System.out.println("boiling");
            }
            else{
                System.out.println("out of range");
            }
        }

        double n2 = (int)(Math.random()*10);
        if (n2 == 0){
            System.out.println("0");
        }
        else if (n2 == 1){
            System.out.println("1");
        }
        else if (n2 == 2){
            System.out.println("2");
        }
        else if (n2 == 3){
            System.out.println("3");
        }
        else if (n2 == 4){
            System.out.println("4");
        }
        else if (n2 == 5){
            System.out.println("5");
        }
        else if (n2 == 6){
            System.out.println("6");
        }
        else if (n2 == 7){
            System.out.println("7");
        }
        else if (n2 == 8){
            System.out.println("8");
        }
         else if (n2 == 9){
            System.out.println("9");
        }
         else{
            System.out.println("out of range");
        }

    }
}

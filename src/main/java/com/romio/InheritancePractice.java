package com.romio;

    interface Parent1 {
        void fun(int number);
    }

    // Interface 2
    interface Parent2 {
        void fun(int number);
    }

    // Class implementing both interfaces
    class InheritancePractice implements Parent1, Parent2 {

        // Implementing fun() method of Parent1
        public int fun(String msg ) {
            System.out.println("Parent1: " + msg);
            return 1;
        }

        // Implementing fun() method of Parent2
        public void fun(int number) {
            System.out.println("Parent2: " + number);
        }

        // Main driver method
        public static void main(String args[]) {

            // Creating object of class in main() method
            InheritancePractice t = new InheritancePractice();

            // Calling fun() methods
            t.fun(20);
            t.fun(10);
        }
    }



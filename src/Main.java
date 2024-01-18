public static void main(String[] args) {
    // Creating a new Cat object with the 'new' keyword and the constructor
    Cat myCat = new Cat("black", "sleepy");

    // Accessing the public methods of the Cat class
    System.out.println("The cat is " + myCat.getColor() + " and feels " + myCat.getMood());
    myCat.makeHappy();  // Makes the cat happy which internally changes its mood and makes it purr

    int maxValue = Integer.MAX_VALUE;
    int overflow = maxValue + 1;
    
}

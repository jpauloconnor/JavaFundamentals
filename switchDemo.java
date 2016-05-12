class switchDemo{
  public static void main(String args[]){
    int numberOfCupsOfCoffee;
    numberOfCupsOfCoffee = 6;
    
    switch (numberOfCupsOfCoffee){
      case 1: 
        System.out.println("You will feel great");
        break;
      case 2: 
        System.out.println("That's probably enough for today");
        break;
      case 3:
        System.out.println("You're probably going to be jittery today");
        break;
      case 4: 
        System.out.println("You're going to be bouncing off the walls");
        break;
      case 5:
        System.out.println("We're going to be worried about your health");
        break;
      case 6:
        System.out.println("Break out the debrillator.");
        break;      
    }
  }
}
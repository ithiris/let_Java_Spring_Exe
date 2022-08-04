package Practices;

 class Dog extends Animal {
     public String type="elephant";
     public void display(){
         System.out.println("I am a dog");
     }
     public void printMessage(){

         // this calls overridden method
         super.display();
     }
     public void printType() {
         System.out.println("I am a " + type);
         System.out.println("I am an " + super.type);
     }
}

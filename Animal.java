public class Animal {
    int color;
     int num;


     Animal(){
         color = 0;
         num = 1;
     }
     Animal(int color,int num){
         color = color;
         num = num;
     }

     public void scream(){
         System.out.println("吱吱");
     }
     public void jiao(){
         System.out.println("我是一个动物");
     }
}

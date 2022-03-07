package Day1.示例代码找感觉;


public class Puppy {
    int puppyAge;
    public Puppy(String name){
        System.out.println("dog's name is "+name);
    }
    public void setAge(int age){
        puppyAge = age;
    }
    public int getAge(){
        System.out.println("dog's age is "+puppyAge);
        return puppyAge;
    }




    public static void main(String[] args){
        Puppy bigpuppy = new Puppy("tommy");
        bigpuppy.setAge(2);
        bigpuppy.getAge();
        System.out.println("func retrun a int"+bigpuppy.getAge());
    }
}

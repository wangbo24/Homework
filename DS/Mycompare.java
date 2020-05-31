public class MyCompare {
}
/*
自定义类型要进行比较
    1. 需要实现Comparable接口中的compareTo方法--->自然排序的实现方式
    2. 实现比较器Comparator接口中的compare方法--->非自然排序的实现方式
 */
class Person implements Comparable<Person>{
    public String name;
    public String gender;
    public int age;
    public String ID;
    
    public Person(String name,String gender,int age,String ID){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
    }

    @Override
    public int compareTo(Person o) {
        int ret = age - o.age;
        
        if(ret > 0){
            return 1;
        }else if(ret < 0){
            return -1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return name + "--" + gender + "--" + age + "--"+ ID;
    }
}
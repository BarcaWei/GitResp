public class TestArry {

    public static void main(String[] args) {
        People people[]=new People[10];
        People p1=new People(22,"许威",2021325140624L);
        People p2=new People(18,"张三",2021325410321L);
        people[0]=p1;
        people[1]=p2;
        System.out.println(people[0].age+people[0].id+people[0].name);
    }
    static class People {
       public int age;
        public String name;
        public long id;

        public  People(int age,String name,long id){
            this.age=age;
            this.name=name;
            this.id=id;

        }

    }

}


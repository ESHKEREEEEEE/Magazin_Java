public abstract class person<T> {
    String name;
    int age;
    T id;
    public person(String name, int age, T id){
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public T get_id(){
        return id;
    }
    public void set_id(T id){
        this.id = id;
    }
    public String get_name(){
        return name;
    }
    public void set_name(String name){
        this.name = name;
    }
    public int get_age(){
        return age;
    }
    public void set_age(int age){
        this.age = age;
    }
}

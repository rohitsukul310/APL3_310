
class Juet {
    private String name; 
  private int age;
    
    public String getName() {
      return name;
    }
  
  
    public void setName(String newName) {
      this.name = newName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        this.age=newAge;
    }
  }
  
  
  
  public class Main {
    public static void main(String[] args) {
      Juet Obj = new Juet();
      Obj.setName("Amit"); 
      Obj.setAge(21);
      System.out.println("Name : "+Obj.getName());
       System.out.println("Age : "+Obj.getAge());
      
      
    }
  }
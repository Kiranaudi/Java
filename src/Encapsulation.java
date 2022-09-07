
public class Encapsulation {
	private int id;
	private String name;
		
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
    
	public String getName()
	{
		return name;
	}
    
	public void setName(String name)
	{
		this.name=name;
	}
	public static void main(String[] args) {
		Encapsulation e=new Encapsulation();
		e.setId(22);
        e.setName("java");
        System.out.println(e.getId()+ "   " + e.getName());
	}

}

package java_itrPractice;

public class HashCodeAndEquql {
	
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HashCodeAndEquql(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public HashCodeAndEquql() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "HashCodeAndEquql [id=" + id + ", name=" + name + "]";
	}

	
	public boolean equals(Object o)
	{
		if(o==null || getClass() != o.getClass())
		{
			return false;
		}
		if(o == this)
		{
			return true;
		}
		
		HashCodeAndEquql e=(HashCodeAndEquql)o;
		return(this.getId()==e.getId());
	}
}

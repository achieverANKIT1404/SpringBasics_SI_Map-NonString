package MyPack;

public class PostedBy {

	private int id;
	private String postBy;
	private String email;
	
	public PostedBy() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPostBy() {
		return postBy;
	}

	public void setPostBy(String postBy) {
		this.postBy = postBy;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "PostedBy [id=" + id + ", postBy=" + postBy + ", email=" + email + "]";
	}
	
}

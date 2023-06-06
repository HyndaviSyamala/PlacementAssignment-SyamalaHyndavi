package in.ineuron.model;

public class BlogPost {
    private Integer sno; 
	private String title;
	private String description;
	private String content;
	public BlogPost(Integer sno, String title, String description, String content) {
		super();
		this.sno = sno;
		this.title = title;
		this.description = description;
		this.content = content;
	}
	public BlogPost() {
		// TODO Auto-generated constructor stub
	}
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "BlogPost [sno=" + sno + ", title=" + title + ", description=" + description + ", content=" + content
				+ "]";
	}
	
}

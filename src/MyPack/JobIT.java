package MyPack;

import java.util.Date;

public class JobIT {

	private int id;
	private String jobName;
	private Date postDate;
	
	public JobIT() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	@Override
	public String toString() {
		return "JobIT [id=" + id + ", jobName=" + jobName + ", postDate=" + postDate + "]";
	}
	
}

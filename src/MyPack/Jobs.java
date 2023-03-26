package MyPack;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Jobs {

	private int srNo;
	private String jobType;
	private Map<JobIT, PostedBy> jobs;
	
	public Jobs() {
		super();
	}

	public int getSrNo() {
		return srNo;
	}

	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public Map<JobIT, PostedBy> getJobs() {
		return jobs;
	}

	public void setJobs(Map<JobIT, PostedBy> jobs) {
		this.jobs = jobs;
	}
	
	public void JobInfo(){
		
		System.out.println(srNo+" "+jobType);
		System.out.println("Available Jobs...");
		
		Set<Entry<JobIT, PostedBy>> set = jobs.entrySet();
		
		Iterator<Entry<JobIT, PostedBy>> itr = set.iterator();
		while(itr.hasNext()){
			
			Entry<JobIT, PostedBy> entry = itr.next();
			
			JobIT jbit = entry.getKey();
			PostedBy pb = entry.getValue();
			System.out.println("Job Name : "+jbit);
			System.out.println("Posted By : "+pb);
		}
	}
}

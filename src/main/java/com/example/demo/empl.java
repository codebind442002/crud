package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class empl {

	

	
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    
		private int eid;
		private String ename;
		private String eadd;
		

		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public String getEadd() {
			return eadd;
		}
		public void setEadd(String eadd) {
			this.eadd = eadd;
		}
		
}

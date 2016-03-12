package com.dd.mdr.bean;

public class Skill {

	private String skill;			
	private int skill_no;			
	private int acd;			
	private String skill_ACD;			
	private String description;			
	private String client_Code;			
	private String client_Name;			
	private String cSID_Code;			
	private String site_Name;			
	private String skill_Full_Reference;
	
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getSkill_no() {
		return skill_no;
	}
	public void setSkill_no(int skill_no) {
		this.skill_no = skill_no;
	}
	public int getAcd() {
		return acd;
	}
	public void setAcd(int acd) {
		this.acd = acd;
	}
	public String getSkill_ACD() {
		return skill_ACD;
	}
	public void setSkill_ACD(String skill_ACD) {
		this.skill_ACD = skill_ACD;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getClient_Code() {
		return client_Code;
	}
	public void setClient_Code(String client_Code) {
		this.client_Code = client_Code;
	}
	public String getClient_Name() {
		return client_Name;
	}
	public void setClient_Name(String client_Name) {
		this.client_Name = client_Name;
	}
	public String getcSID_Code() {
		return cSID_Code;
	}
	public void setcSID_Code(String cSID_Code) {
		this.cSID_Code = cSID_Code;
	}
	public String getSite_Name() {
		return site_Name;
	}
	public void setSite_Name(String site_Name) {
		this.site_Name = site_Name;
	}
	public String getSkill_Full_Reference() {
		return skill_Full_Reference;
	}
	public void setSkill_Full_Reference(String skill_Full_Reference) {
		this.skill_Full_Reference = skill_Full_Reference;
	}
	@Override
	public String toString() {
		return "Skill [skill=" + skill + ", skill_no=" + skill_no + ", acd=" + acd + ", skill_ACD=" + skill_ACD
				+ ", description=" + description + ", client_Code=" + client_Code + ", client_Name=" + client_Name
				+ ", cSID_Code=" + cSID_Code + ", site_Name=" + site_Name + ", skill_Full_Reference="
				+ skill_Full_Reference + "]";
	}	
	
	

}

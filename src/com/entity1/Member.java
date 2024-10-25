package com.entity1;

public class Member {
	 private int memberId;
	    private String name;
	    private String email;
		@Override
		public String toString() {
			return "Member [memberId=" + memberId + ", name=" + name + "]";
		}
		public int getMemberId() {
			return memberId;
		}
		public void setMemberId(int memberId) {
			this.memberId = memberId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Member() {
			super();
		}
		public Member(int memberId, String name, String email) {
			super();
			this.memberId = memberId;
			this.name = name;
			this.email = email;
		}
}

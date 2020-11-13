package com.grganzy2.www.src;

public class Member {
	private String idx;
	private String name;
	private String gender;
	private String id;
	private String password;
	private String passwordCheck;
	private String address;
	private String phone;
	private String emali;
	private String hobbyArray;
	private String regdate;

	// alt + shift + s + r -> getter&setter
	// alt + shift + s + o -> 생성자

	// public Member() {
	// }

	public Member() {
	}

	public Member(String idx, String name, String gender, String id, String password, String passwordCheck,
			String address, String phone, String emali, String hobbyArray, String regdate) {
		super();
		this.idx = idx;
		this.name = name;
		this.gender = gender;
		this.id = id;
		this.password = password;
		this.passwordCheck = passwordCheck;
		this.address = address;
		this.phone = phone;
		this.emali = emali;
		this.hobbyArray = hobbyArray;
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Member [idx=" + idx + ", name=" + name + ", gender=" + gender + ", id=" + id + ", password=" + password
				+ ", passwordCheck=" + passwordCheck + ", address=" + address + ", phone=" + phone + ", emali=" + emali
				+ ", hobbyArray=" + hobbyArray + ", regdate=" + regdate + "]";
	}

	public String getIdx() {
		return idx;
	}

	public void setIdx(String idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordCheck() {
		return passwordCheck;
	}

	public void setPasswordCheck(String passwordCheck) {
		this.passwordCheck = passwordCheck;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmali() {
		return emali;
	}

	public void setEmali(String emali) {
		this.emali = emali;
	}

	public String getHobbyArray() {
		return hobbyArray;
	}

	public void setHobbyArray(String hobbyArray) {
		this.hobbyArray = hobbyArray;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	
}

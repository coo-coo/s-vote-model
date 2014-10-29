package com.coo.s.vote.model;

/**
 * 账号用户信息
 * @deprecated 参见Account
 */

public class Profile extends BasicObject{

	public static String C_NAME = "vote_account";
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 158671910669530606L;
	/**
	 * 性别类型:男
	 */
	public static String GENDER_MAN = "0";
	/**
	 * 性别类型:女
	 */
	public static String GENDER_WOMAN = "1";
	/**
	 * 婚姻状况：未婚
	 */
	public static String MARITAL_SINGLE ="0";
	/**
	 * 婚姻状况：已婚
	 */
	public static String MARITAL_MARRIED ="1";
	/**
	 * 关联Account表中的uuid
	 */
	private String accountUuid="";
	/**
	 * 类型，精英，屌丝，文艺小青年
	 */
	private String type = "";
	/**
	 * 个人图标
	 */
	private String icon = "";
	/**
	 * 性别
	 */
	private String gender = "";
	/**
	 * 昵称
	 */
	private String nickname ="";
	/**
	 * 个人简介
	 */
	private String introduction = "";
	/**
	 * 工作领域
	 */
	private String workfield = "";
	/**
	 * 毕业院校
	 */
	private String school = "";
	/**
	 * 专业
	 */
	private String major = "";
	/**
	 * 身高
	 */
	private String height="";
	/**
	 * 体重
	 */
	private String weight = "";
	/**
	 * 星座
	 */
	private String constellation = "";
	/**
	 * 爱好
	 */
	private String hobby = "";
	/**
	 * 生日
	 */
	private String birthday = "";
	/**
	 * 出生地
	 */
	private String birthPlace = "";
	/**
	 * 出生年
	 */
	private String birthYear = "";
	/**
	 * 出生月
	 */
	private String birthMonth = "";
	/**
	 * 出生日
	 */
	private String birthDay = "";
	/**
	 * 婚姻状况
	 */
	private String marital = "";
	/**
	 * 等级
	 */
	private String grade = "" ;
	/**
	 * 血型
	 */
	private String blood = "" ;
	/**
	 * 学历
	 */
	private String education = "";
	/**
	 * 职位
	 */
	private String position = "";
	/**
	 * 所在的
	 */
	private String location = "";
	/**
	 * 中文名称
	 */
	private String cname = "";
	/**
	 * 英文名称
	 */
	private String ename = "" ;
	/**
	 * 个性签名
	 */
	private String signature = "";
	/**
	 * 二维码
	 */
	private String qrCode = "";
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getWorkfield() {
		return workfield;
	}

	public void setWorkfield(String workfield) {
		this.workfield = workfield;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getConstellation() {
		return constellation;
	}

	public void setConstellation(String constellation) {
		this.constellation = constellation;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	public String getBirthMonth() {
		return birthMonth;
	}

	public void setBirthMonth(String birthMonth) {
		this.birthMonth = birthMonth;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}


	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}


//	public String getUuid() {
//		return uuid;
//	}
//
//	public void setUuid(String uuid) {
//		this.uuid = uuid;
//	}

	public String getAccountUuid() {
		return accountUuid;
	}

	public void setAccountUuid(String accountUuid) {
		this.accountUuid = accountUuid;
	}

	public String getMarital() {
		return marital;
	}

	public void setMarital(String marital) {
		this.marital = marital;
	}

	public String getBlood() {
		return blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}
	
}

package com.internetdb.wepapp.Dto;

public class UserRes {
    private int user_idx;
    private String user_nickname;
    private String user_email;
    private String profile_image;
	private String member_introduce;
    private String user_location;

    public UserRes(int user_idx, String user_nickname, String user_email, String profile_image, String member_introduce, String user_location) {
        this.user_idx = user_idx;
        this.user_nickname = user_nickname;
        this.user_email = user_email;
        this.profile_image = profile_image;
        this.member_introduce = member_introduce;
        this.user_location = user_location;
    }
    
    public int getUser_idx() {
		return user_idx;
	}

	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}

	public String getUser_nickname() {
		return user_nickname;
	}

	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getProfile_image() {
		return profile_image;
	}

	public void setProfile_image(String profile_image) {
		this.profile_image = profile_image;
	}

	public String getMember_introduce() {
		return member_introduce;
	}

	public void setMember_introduce(String member_introduce) {
		this.member_introduce = member_introduce;
	}

	public String getUser_location() {
		return user_location;
	}

	public void setUser_location(String user_location) {
		this.user_location = user_location;
	}
}

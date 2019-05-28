package com.studyboot.sms.domain;

public class SpaceReview {
  
  private int no;
  private int memberNo;
  private int spaceNo;
  private String nickName;
  private String photo;
  private double rating;
  private String review;
  
  @Override
  public String toString() {
    return "SpaceReview [no=" + no + ", memberNo=" + memberNo + ", spaceNo=" + spaceNo
        + ", nickName=" + nickName + ", photo=" + photo + ", rating=" + rating + ", review="
        + review + "]";
  }
  
  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }
  public int getMemberNo() {
    return memberNo;
  }
  public void setMemberNo(int memberNo) {
    this.memberNo = memberNo;
  }
  public int getSpaceNo() {
    return spaceNo;
  }
  public void setSpaceNo(int spaceNo) {
    this.spaceNo = spaceNo;
  }
  public String getNickName() {
    return nickName;
  }
  public void setNickName(String nickName) {
    this.nickName = nickName;
  }
  public String getPhoto() {
    return photo;
  }
  public void setPhoto(String photo) {
    this.photo = photo;
  }
  public double getRating() {
    return rating;
  }
  public void setRating(double rating) {
    this.rating = rating;
  }
  public String getReview() {
    return review;
  }
  public void setReview(String review) {
    this.review = review;
  }
  
}

package com.school.twohand.entity;

public class LikeTbl {
	Integer likeId;
	User likeUserMe;
	User likeUserOther;
	Goods likeGoodsId;
	public Integer getLikeId() {
		return likeId;
	}
	public void setLikeId(Integer likeId) {
		this.likeId = likeId;
	}
	public User getLikeUserMe() {
		return likeUserMe;
	}
	public void setLikeUserMe(User likeUserMe) {
		this.likeUserMe = likeUserMe;
	}
	public User getLikeUserOther() {
		return likeUserOther;
	}
	public void setLikeUserOther(User likeUserOther) {
		this.likeUserOther = likeUserOther;
	}
	public Goods getLikeGoods() {
		return likeGoodsId;
	}
	public void setLikeGoods(Goods likeGoods) {
		this.likeGoodsId = likeGoodsId;
	}
	public LikeTbl(Integer likeId, User likeUserMe, User likeUserOther,
			Goods likeGoods) {
		super();
		this.likeId = likeId;
		this.likeUserMe = likeUserMe;
		this.likeUserOther = likeUserOther;
		this.likeGoodsId = likeGoods;
	}
	public LikeTbl() {
		super();
	}
	
}

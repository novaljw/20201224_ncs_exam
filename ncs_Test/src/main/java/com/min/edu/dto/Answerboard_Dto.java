package com.min.edu.dto;

import java.io.Serializable;

public class Answerboard_Dto implements Serializable{

	
	
	private static final long serialVersionUID = -3697227032450332153L;
	
	private int seq;
	private String id;
	private String title;
	private String content;
	private int readcount;
	private int refer;
	private int step;
	private int depth;
	private String regdate;
	private String delflag;
	
	public Answerboard_Dto() {
	}

	public Answerboard_Dto(int seq, String id, String title, String content) {
		super();
		this.seq = seq;
		this.id = id;
		this.title = title;
		this.content = content;
	}

	@Override
	public String toString() {
		return "Answerboard_Dto [seq=" + seq + ", id=" + id + ", title=" + title + ", content=" + content
				+ ", readcount=" + readcount + ", refer=" + refer + ", step=" + step + ", depth=" + depth + ", regdate="
				+ regdate + ", delflag=" + delflag + "]";
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getReadcount() {
		return readcount;
	}

	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}

	public int getRefer() {
		return refer;
	}

	public void setRefer(int refer) {
		this.refer = refer;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getDelflag() {
		return delflag;
	}

	public void setDelflag(String delflag) {
		this.delflag = delflag;
	}
	
	
}

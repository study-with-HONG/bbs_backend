package mul.camp.a.dto;

/*	CREATE TABLE TESTBBS(
	    SEQ NUMBER(8) PRIMARY KEY,
	    REF NUMBER(8) NOT NULL,
	    STEP NUMBER(8) NOT NULL,
	    DEPTH NUMBER(8) NOT NULL,
	    ID VARCHAR2(50) NOT NULL,
	    TITLE VARCHAR2(200) NOT NULL,
	    CONTENT VARCHAR2(4000) NOT NULL,
	    WDATE DATE NOT NULL,
	    DEL NUMBER(1) NOT NULL,
	    READCOUNT NUMBER(8) NOT NULL
	);
	CREATE SEQUENCE SEQ_TESTBBS
	START WITH 1 INCREMENT BY 1;
	
	ALTER TABLE TESTBBS
	ADD CONSTRAINT FK_TESTBBS_ID FOREIGN KEY(ID)
	REFERENCES TESTMEMBER(ID);*/
public class BbsDto {
	private int seq;
	private int ref;
	private int step;
	private int depth;

	private String id;
	private String title;
	private String content;
	private String wdate;
	
	private int del;
	private int readcount;
	
	public BbsDto() {}
	public BbsDto(int seq, int ref, int step, int depth, String id, String title, String content, String wdate, int del,
			int readcount) {
		super();
		this.seq = seq;
		this.ref = ref;
		this.step = step;
		this.depth = depth;
		this.id = id;
		this.title = title;
		this.content = content;
		this.wdate = wdate;
		this.del = del;
		this.readcount = readcount;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getRef() {
		return ref;
	}
	public void setRef(int ref) {
		this.ref = ref;
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
	public String getWdate() {
		return wdate;
	}
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
	public int getDel() {
		return del;
	}
	public void setDel(int del) {
		this.del = del;
	}
	public int getReadcount() {
		return readcount;
	}
	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}
	@Override
	public String toString() {
		return "BbsDto [seq=" + seq + ", ref=" + ref + ", step=" + step + ", depth=" + depth + ", id=" + id + ", title="
				+ title + ", content=" + content + ", wdate=" + wdate + ", del=" + del + ", readcount=" + readcount
				+ "]";
	}
}
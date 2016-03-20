package de.holobp.newsletter;

import java.sql.Date;

import de.holobp.kernel.Interessen;
import de.holobp.kernel.User;

public class Beitrag {

	private String title;
	private String text;
	private boolean sent;
	private Date sentDate;
	private User author;
	private User authorModify;
	private Date createDate;
	private Interessen interessen;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public boolean isSent() {
		return sent;
	}
	public void setSent(boolean sent) {
		this.sent = sent;
	}
	public Date getSentDate() {
		return sentDate;
	}
	public void setSentDate(Date sentDate) {
		this.sentDate = sentDate;
	}
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	public User getAuthorModify() {
		return authorModify;
	}
	public void setAuthorModify(User authorModify) {
		this.authorModify = authorModify;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Interessen getInteressen() {
		return interessen;
	}
	public void setInteressen(Interessen interessen) {
		this.interessen = interessen;
	}
	
	
}

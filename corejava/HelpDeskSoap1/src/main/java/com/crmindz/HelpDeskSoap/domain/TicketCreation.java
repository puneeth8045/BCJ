package com.crmindz.HelpDeskSoap.domain;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * @author Puneeth Entity class for Ticket Creation.
 */
@XmlRootElement(name = "Ticket")
public class TicketCreation implements Serializable {

	private static final long serialVersionUID = 1L;
	private int ticketId;
	private int ticketreferenceno;
	private String category;
	private String subCategory;
	private String subject;
	private String description;
	private String status;
	private String comments;
	/**
	 * @return the ticketId
	 */
	public int getTicketId() {
		return ticketId;
	}
	/**
	 * @param ticketId the ticketId to set
	 */
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	/**
	 * @return the ticketreferenceno
	 */
	public int getTicketreferenceno() {
		return ticketreferenceno;
	}
	/**
	 * @param ticketreferenceno the ticketreferenceno to set
	 */
	public void setTicketreferenceno(int ticketreferenceno) {
		this.ticketreferenceno = ticketreferenceno;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the subCategory
	 */
	public String getSubCategory() {
		return subCategory;
	}
	/**
	 * @param subCategory the subCategory to set
	 */
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
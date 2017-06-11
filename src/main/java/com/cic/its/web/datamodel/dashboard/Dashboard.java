package com.cic.its.web.datamodel.dashboard;

import java.util.List;

public class Dashboard {

	private List<Sales> sales;
	private Cpu cpu;
	private List<Browser> browser;
	private User user;
	private List<Completed> completed;
	private List<Comments> comments;
	private List<RecentSales> recentsales;
	private Quote quote;
	private List<Numbers> numbers;
	public List<Sales> getSales() {
		return sales;
	}
	public void setSales(List<Sales> sales) {
		this.sales = sales;
	}
	public Cpu getCpu() {
		return cpu;
	}
	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}
	public List<Browser> getBrowser() {
		return browser;
	}
	public void setBrowser(List<Browser> browser) {
		this.browser = browser;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Completed> getCompleted() {
		return completed;
	}
	public void setCompleted(List<Completed> completed) {
		this.completed = completed;
	}
	public List<Comments> getComments() {
		return comments;
	}
	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}
	public List<RecentSales> getRecentsales() {
		return recentsales;
	}
	public void setRecentsales(List<RecentSales> recentsales) {
		this.recentsales = recentsales;
	}
	public Quote getQuote() {
		return quote;
	}
	public void setQuote(Quote quote) {
		this.quote = quote;
	}
	public List<Numbers> getNumbers() {
		return numbers;
	}
	public void setNumbers(List<Numbers> numbers) {
		this.numbers = numbers;
	}
	
	
}

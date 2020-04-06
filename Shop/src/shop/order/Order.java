package shop.order;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;

import shop.account.BankPaymentMethod;

public class Order {
	private String orderNumber;
	private LocalDateTime shipped;
	private OrderAddress shippedTo;
	private Date paid;
	private BankPaymentMethod paidWith;
	private OrderItem[] items;

	public Order(String orderNumber, LocalDateTime shipped, OrderAddress shippedTo, Date paid,
			BankPaymentMethod paidWith, OrderItem[] items) {
		super();
		this.orderNumber = orderNumber;
		this.shipped = shipped;
		this.shippedTo = shippedTo;
		this.paid = paid;
		this.paidWith = paidWith;
		this.items = items;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public LocalDateTime getShipped() {
		return shipped;
	}

	public void setShipped(LocalDateTime shipped) {
		this.shipped = shipped;
	}

	public OrderAddress getShippedTo() {
		return shippedTo;
	}

	public void setShippedTo(OrderAddress shippedTo) {
		this.shippedTo = shippedTo;
	}

	public Date getPaid() {
		return paid;
	}

	public void setPaid(Date paid) {
		this.paid = paid;
	}

	public BankPaymentMethod getPaidWith() {
		return paidWith;
	}

	public void setPaidWith(BankPaymentMethod paidWith) {
		this.paidWith = paidWith;
	}

	public OrderItem[] getItems() {
		return items;
	}

	public void setItems(OrderItem[] items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Order [orderNumber=" + orderNumber + ", shipped=" + shipped + ", shippedTo=" + shippedTo + ", paid="
				+ paid + ", paidWith=" + paidWith + ", items=" + Arrays.toString(items) + "]";
	}
	
	

}

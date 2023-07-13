package beans;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="CustomerEntity")
public class CustomerEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="customer_gen")
	@SequenceGenerator(name="customer_gen",sequenceName = "customer_seq")
	private int custid;
	
	@Column(length=20)
	private String custname;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="customer_sub", joinColumns = {@JoinColumn(name="custid")},inverseJoinColumns = {@JoinColumn(name="subsid")})
	private Set<SubscriptionEntity> subscriptions;
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public Set<SubscriptionEntity> getSubscriptions() {
		return subscriptions;
	}
	public void setSubscriptions(Set<SubscriptionEntity> subscriptions) {
		this.subscriptions = subscriptions;
	}
	
}

package beans;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="SubscriptionEntity")
public class SubscriptionEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sub_gen")
	@SequenceGenerator(name="sub_gen",sequenceName = "sub_seq")
	private int subsid;
	@Column(length=20)
	private String subsname;
	@ManyToMany(mappedBy="subscriptions")
	private Set<CustomerEntity> customers;
	public int getSubsid() {
		return subsid;
	}
	public void setSubsid(int subsid) {
		this.subsid = subsid;
	}
	public String getSubsname() {
		return subsname;
	}
	public void setSubsname(String subsname) {
		this.subsname = subsname;
	}
	public Set<CustomerEntity> getCustomers() {
		return customers;
	}
	public void setCustomers(Set<CustomerEntity> customers) {
		this.customers = customers;
	}

}

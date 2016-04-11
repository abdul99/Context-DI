package restjpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the organization database table.
 * 
 */
@Entity
@Table(name="organization")
@NamedQuery(name="Organization.findAll", query="SELECT o FROM Organization o")
public class Organization implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private String id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDateTime;

	@Column(length=250)
	private String description;

	private byte isDeleted;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModifiedDateTime;

	@Column(nullable=false, length=50)
	private String name;

	@Column(nullable=false)
	private int organizationclassId;

	private java.math.BigInteger parentId;

	public Organization() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(byte isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Date getLastModifiedDateTime() {
		return this.lastModifiedDateTime;
	}

	public void setLastModifiedDateTime(Date lastModifiedDateTime) {
		this.lastModifiedDateTime = lastModifiedDateTime;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOrganizationclassId() {
		return this.organizationclassId;
	}

	public void setOrganizationclassId(int organizationclassId) {
		this.organizationclassId = organizationclassId;
	}

	public java.math.BigInteger getParentId() {
		return this.parentId;
	}

	public void setParentId(java.math.BigInteger parentId) {
		this.parentId = parentId;
	}

}
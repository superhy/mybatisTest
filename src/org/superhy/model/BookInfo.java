package org.superhy.model;

import java.sql.Timestamp;

public class BookInfo {

	private Integer id;
	private String name;
	private String publish;
	private Timestamp publishtime;
	private UserInfo userInfo;

	public BookInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookInfo(Integer id, String name, String publish,
			Timestamp publishtime) {
		super();
		this.id = id;
		this.name = name;
		this.publish = publish;
		this.publishtime = publishtime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public Timestamp getPublishtime() {
		return publishtime;
	}

	public void setPublishtime(Timestamp publishtime) {
		this.publishtime = publishtime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((publish == null) ? 0 : publish.hashCode());
		result = prime * result
				+ ((publishtime == null) ? 0 : publishtime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookInfo other = (BookInfo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (publish == null) {
			if (other.publish != null)
				return false;
		} else if (!publish.equals(other.publish))
			return false;
		if (publishtime == null) {
			if (other.publishtime != null)
				return false;
		} else if (!publishtime.equals(other.publishtime))
			return false;
		return true;
	}

}

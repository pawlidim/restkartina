/*
 * Copyright (C) 2016 Maximilian Pawlidi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.pawlidi.restkartina.dto.client;

import com.google.gson.annotations.SerializedName;

import de.pawlidi.restkartina.dto.RestDTO;

public class ClientResponse extends RestDTO {

	private String sid;
	@SerializedName("sid_name")
	private String sidName;
	private Account account;
	private Services services;
	private Geo geo;
	private Settings settings;
	private String message;
	private Long messages;
	@SerializedName("servertime")
	private String serverTime;

	public ClientResponse() {
		super();
	}

	/**
	 * @return the sid
	 */
	public String getSid() {
		return sid;
	}

	/**
	 * @param sid
	 *            the sid to set
	 */
	public void setSid(String sid) {
		this.sid = sid;
	}

	/**
	 * @return the sidName
	 */
	public String getSidName() {
		return sidName;
	}

	/**
	 * @param sidName
	 *            the sidName to set
	 */
	public void setSidName(String sidName) {
		this.sidName = sidName;
	}

	/**
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}

	/**
	 * @param account
	 *            the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
	}

	/**
	 * @return the services
	 */
	public Services getServices() {
		return services;
	}

	/**
	 * @param services
	 *            the services to set
	 */
	public void setServices(Services services) {
		this.services = services;
	}

	/**
	 * @return the geo
	 */
	public Geo getGeo() {
		return geo;
	}

	/**
	 * @param geo
	 *            the geo to set
	 */
	public void setGeo(Geo geo) {
		this.geo = geo;
	}

	/**
	 * @return the settings
	 */
	public Settings getSettings() {
		return settings;
	}

	/**
	 * @param settings
	 *            the settings to set
	 */
	public void setSettings(Settings settings) {
		this.settings = settings;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the messages
	 */
	public Long getMessages() {
		return messages;
	}

	/**
	 * @param messages
	 *            the messages to set
	 */
	public void setMessages(Long messages) {
		this.messages = messages;
	}

	/**
	 * @return the serverTime
	 */
	public String getServerTime() {
		return serverTime;
	}

	/**
	 * @param serverTime
	 *            the serverTime to set
	 */
	public void setServerTime(String serverTime) {
		this.serverTime = serverTime;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((messages == null) ? 0 : messages.hashCode());
		result = prime * result + ((serverTime == null) ? 0 : serverTime.hashCode());
		result = prime * result + ((sid == null) ? 0 : sid.hashCode());
		result = prime * result + ((sidName == null) ? 0 : sidName.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof ClientResponse)) {
			return false;
		}
		ClientResponse other = (ClientResponse) obj;
		if (messages == null) {
			if (other.messages != null) {
				return false;
			}
		} else if (!messages.equals(other.messages)) {
			return false;
		}
		if (serverTime == null) {
			if (other.serverTime != null) {
				return false;
			}
		} else if (!serverTime.equals(other.serverTime)) {
			return false;
		}
		if (sid == null) {
			if (other.sid != null) {
				return false;
			}
		} else if (!sid.equals(other.sid)) {
			return false;
		}
		if (sidName == null) {
			if (other.sidName != null) {
				return false;
			}
		} else if (!sidName.equals(other.sidName)) {
			return false;
		}
		return true;
	}

}

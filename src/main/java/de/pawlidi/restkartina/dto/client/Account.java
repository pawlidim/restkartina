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

public class Account extends RestDTO {

	private String login;
	@SerializedName("packet_name")
	private String packetName;
	@SerializedName("packet_id")
	private String packetId;
	@SerializedName("packet_expire")
	private String packetExpire;

	public Account() {
		super();
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login
	 *            the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the packetName
	 */
	public String getPacketName() {
		return packetName;
	}

	/**
	 * @param packetName
	 *            the packetName to set
	 */
	public void setPacketName(String packetName) {
		this.packetName = packetName;
	}

	/**
	 * @return the packetId
	 */
	public String getPacketId() {
		return packetId;
	}

	/**
	 * @param packetId
	 *            the packetId to set
	 */
	public void setPacketId(String packetId) {
		this.packetId = packetId;
	}

	/**
	 * @return the packetExpire
	 */
	public String getPacketExpire() {
		return packetExpire;
	}

	/**
	 * @param packetExpire
	 *            the packetExpire to set
	 */
	public void setPacketExpire(String packetExpire) {
		this.packetExpire = packetExpire;
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
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((packetExpire == null) ? 0 : packetExpire.hashCode());
		result = prime * result + ((packetId == null) ? 0 : packetId.hashCode());
		result = prime * result + ((packetName == null) ? 0 : packetName.hashCode());
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
		if (!(obj instanceof Account)) {
			return false;
		}
		Account other = (Account) obj;
		if (login == null) {
			if (other.login != null) {
				return false;
			}
		} else if (!login.equals(other.login)) {
			return false;
		}
		if (packetExpire == null) {
			if (other.packetExpire != null) {
				return false;
			}
		} else if (!packetExpire.equals(other.packetExpire)) {
			return false;
		}
		if (packetId == null) {
			if (other.packetId != null) {
				return false;
			}
		} else if (!packetId.equals(other.packetId)) {
			return false;
		}
		if (packetName == null) {
			if (other.packetName != null) {
				return false;
			}
		} else if (!packetName.equals(other.packetName)) {
			return false;
		}
		return true;
	}

}

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
package de.pawlidi.restkartina.dto.system;

import com.google.gson.annotations.SerializedName;

import de.pawlidi.restkartina.dto.RestDTO;

public class System extends RestDTO {

	private String ip;
	@SerializedName("descr")
	private String description;
	@SerializedName("speedtest_url")
	private String speedtestUrl;

	/**
	 * 
	 */
	public System() {
		super();
	}

	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * @param ip
	 *            the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the speedtestUrl
	 */
	public String getSpeedtestUrl() {
		return speedtestUrl;
	}

	/**
	 * @param speedtestUrl
	 *            the speedtestUrl to set
	 */
	public void setSpeedtestUrl(String speedtestUrl) {
		this.speedtestUrl = speedtestUrl;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((ip == null) ? 0 : ip.hashCode());
		result = prime * result + ((speedtestUrl == null) ? 0 : speedtestUrl.hashCode());
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
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof System)) {
			return false;
		}
		System other = (System) obj;
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (ip == null) {
			if (other.ip != null) {
				return false;
			}
		} else if (!ip.equals(other.ip)) {
			return false;
		}
		if (speedtestUrl == null) {
			if (other.speedtestUrl != null) {
				return false;
			}
		} else if (!speedtestUrl.equals(other.speedtestUrl)) {
			return false;
		}
		return true;
	}

}

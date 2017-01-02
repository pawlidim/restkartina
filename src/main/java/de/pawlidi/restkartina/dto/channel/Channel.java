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
package de.pawlidi.restkartina.dto.channel;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import de.pawlidi.restkartina.dto.RestDTO;

public class Channel extends RestDTO {

	private Long id;
	private String number;
	@SerializedName("stream_params")
	private List<StreamParam> streamParams;
	@SerializedName("is_video")
	private Integer isVideo;
	@SerializedName("have_archive")
	private Integer haveArchive;
	@SerializedName("epg_progname")
	private String epgProgName;
	@SerializedName("epg_start")
	private String epgStart;
	@SerializedName("epg_stop")
	private String epgStop;
	private String icon;
	@SerializedName("icon_link")
	private String iconLink;
	@SerializedName("protected")
	private Integer isProtected;
	@SerializedName("hide")
	private Integer isHide;

	public Channel() {
		super();
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the streamParams
	 */
	public List<StreamParam> getStreamParams() {
		return streamParams;
	}

	/**
	 * @param streamParams
	 *            the streamParams to set
	 */
	public void setStreamParams(List<StreamParam> streamParams) {
		this.streamParams = streamParams;
	}

	/**
	 * @return the isVideo
	 */
	public Integer getIsVideo() {
		return isVideo;
	}

	/**
	 * @param isVideo
	 *            the isVideo to set
	 */
	public void setIsVideo(Integer isVideo) {
		this.isVideo = isVideo;
	}

	/**
	 * @return the haveArchive
	 */
	public Integer getHaveArchive() {
		return haveArchive;
	}

	/**
	 * @param haveArchive
	 *            the haveArchive to set
	 */
	public void setHaveArchive(Integer haveArchive) {
		this.haveArchive = haveArchive;
	}

	/**
	 * @return the epgProgname
	 */
	public String getEpgProgName() {
		return epgProgName;
	}

	/**
	 * @param epgProgname
	 *            the epgProgname to set
	 */
	public void setEpgProgName(String epgProgName) {
		this.epgProgName = epgProgName;
	}

	/**
	 * @return the epgStart
	 */
	public String getEpgStart() {
		return epgStart;
	}

	/**
	 * @param epgStart
	 *            the epgStart to set
	 */
	public void setEpgStart(String epgStart) {
		this.epgStart = epgStart;
	}

	/**
	 * @return the epgStop
	 */
	public String getEpgStop() {
		return epgStop;
	}

	/**
	 * @param epgStop
	 *            the epgStop to set
	 */
	public void setEpgStop(String epgStop) {
		this.epgStop = epgStop;
	}

	/**
	 * @return the icon
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * @param icon
	 *            the icon to set
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**
	 * @return the iconLink
	 */
	public String getIconLink() {
		return iconLink;
	}

	/**
	 * @param iconLink
	 *            the iconLink to set
	 */
	public void setIconLink(String iconLink) {
		this.iconLink = iconLink;
	}

	/**
	 * @return the isProtected
	 */
	public Integer getIsProtected() {
		return isProtected;
	}

	/**
	 * @param isProtected
	 *            the isProtected to set
	 */
	public void setIsProtected(Integer isProtected) {
		this.isProtected = isProtected;
	}

	/**
	 * @return the isHide
	 */
	public Integer getIsHide() {
		return isHide;
	}

	/**
	 * @param isHide
	 *            the isHide to set
	 */
	public void setIsHide(Integer isHide) {
		this.isHide = isHide;
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
		result = prime * result + ((epgProgName == null) ? 0 : epgProgName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
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
		if (!(obj instanceof Channel)) {
			return false;
		}
		Channel other = (Channel) obj;
		if (epgProgName == null) {
			if (other.epgProgName != null) {
				return false;
			}
		} else if (!epgProgName.equals(other.epgProgName)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (number == null) {
			if (other.number != null) {
				return false;
			}
		} else if (!number.equals(other.number)) {
			return false;
		}
		return true;
	}

}

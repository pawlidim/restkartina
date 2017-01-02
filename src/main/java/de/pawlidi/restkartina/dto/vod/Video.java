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
package de.pawlidi.restkartina.dto.vod;

import com.google.gson.annotations.SerializedName;

import de.pawlidi.restkartina.dto.RestDTO;

public class Video extends RestDTO {

	private String id;
	@SerializedName("id_content")
	private String idContent;
	private String num;
	private String title;
	private String format;
	private String url;
	private String size;
	private String length;
	private String codec;
	private String width;
	private String height;
	@SerializedName("track1_codec")
	private String track1Codec;
	@SerializedName("track1_lang")
	private String track1Lang;
	@SerializedName("track2_codec")
	private String track2Codec;
	@SerializedName("track2_lang")
	private String track2Lang;
	@SerializedName("track3_codec")
	private String track3Codec;
	@SerializedName("track3_lang")
	private String track3Lang;

	/**
	 * 
	 */
	public Video() {
		super();
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the idContent
	 */
	public String getIdContent() {
		return idContent;
	}

	/**
	 * @param idContent
	 *            the idContent to set
	 */
	public void setIdContent(String idContent) {
		this.idContent = idContent;
	}

	/**
	 * @return the num
	 */
	public String getNum() {
		return num;
	}

	/**
	 * @param num
	 *            the num to set
	 */
	public void setNum(String num) {
		this.num = num;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the format
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * @param format
	 *            the format to set
	 */
	public void setFormat(String format) {
		this.format = format;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * @return the length
	 */
	public String getLength() {
		return length;
	}

	/**
	 * @param length
	 *            the length to set
	 */
	public void setLength(String length) {
		this.length = length;
	}

	/**
	 * @return the codec
	 */
	public String getCodec() {
		return codec;
	}

	/**
	 * @param codec
	 *            the codec to set
	 */
	public void setCodec(String codec) {
		this.codec = codec;
	}

	/**
	 * @return the width
	 */
	public String getWidth() {
		return width;
	}

	/**
	 * @param width
	 *            the width to set
	 */
	public void setWidth(String width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public String getHeight() {
		return height;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	public void setHeight(String height) {
		this.height = height;
	}

	/**
	 * @return the track1Codec
	 */
	public String getTrack1Codec() {
		return track1Codec;
	}

	/**
	 * @param track1Codec
	 *            the track1Codec to set
	 */
	public void setTrack1Codec(String track1Codec) {
		this.track1Codec = track1Codec;
	}

	/**
	 * @return the track1Lang
	 */
	public String getTrack1Lang() {
		return track1Lang;
	}

	/**
	 * @param track1Lang
	 *            the track1Lang to set
	 */
	public void setTrack1Lang(String track1Lang) {
		this.track1Lang = track1Lang;
	}

	/**
	 * @return the track2Codec
	 */
	public String getTrack2Codec() {
		return track2Codec;
	}

	/**
	 * @param track2Codec
	 *            the track2Codec to set
	 */
	public void setTrack2Codec(String track2Codec) {
		this.track2Codec = track2Codec;
	}

	/**
	 * @return the track2Lang
	 */
	public String getTrack2Lang() {
		return track2Lang;
	}

	/**
	 * @param track2Lang
	 *            the track2Lang to set
	 */
	public void setTrack2Lang(String track2Lang) {
		this.track2Lang = track2Lang;
	}

	/**
	 * @return the track3Codec
	 */
	public String getTrack3Codec() {
		return track3Codec;
	}

	/**
	 * @param track3Codec
	 *            the track3Codec to set
	 */
	public void setTrack3Codec(String track3Codec) {
		this.track3Codec = track3Codec;
	}

	/**
	 * @return the track3Lang
	 */
	public String getTrack3Lang() {
		return track3Lang;
	}

	/**
	 * @param track3Lang
	 *            the track3Lang to set
	 */
	public void setTrack3Lang(String track3Lang) {
		this.track3Lang = track3Lang;
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
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((idContent == null) ? 0 : idContent.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		if (!(obj instanceof Video)) {
			return false;
		}
		Video other = (Video) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (idContent == null) {
			if (other.idContent != null) {
				return false;
			}
		} else if (!idContent.equals(other.idContent)) {
			return false;
		}
		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}
		return true;
	}

}

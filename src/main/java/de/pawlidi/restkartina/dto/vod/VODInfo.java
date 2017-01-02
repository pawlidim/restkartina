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

import java.util.List;

import com.google.gson.annotations.SerializedName;

import de.pawlidi.restkartina.dto.RestDTO;

public class VODInfo extends RestDTO {

	private String id;
	@SerializedName("dt_modify")
	private String modify;
	@SerializedName("dt_create")
	private String create;
	private String viewed;
	private String name;
	@SerializedName("name_orig")
	private String origName;
	private String description;
	private String poster;
	@SerializedName("poster_link")
	private String posterLink;
	private String lenght;
	private String year;
	private String director;
	private String scenario;
	private String actors;
	@SerializedName("rate_imdb")
	private String rateImdb;
	@SerializedName("rate_kinopoisk")
	private String rateKinopoisk;
	@SerializedName("rate_mpaa")
	private String rateMPAA;
	private String country;
	private List<Video> videos;
	private List<Image> images;
	private List<Gerne> genres;
	@SerializedName("genre_str")
	private String gerne;
	@SerializedName("pass_protect")
	private Boolean passProtected;
	private List<Favorite> favorites;
	private Long messages;
	@SerializedName("servertime")
	private String serverTime;

	/**
	 * 
	 */
	public VODInfo() {
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
	 * @return the modify
	 */
	public String getModify() {
		return modify;
	}

	/**
	 * @param modify
	 *            the modify to set
	 */
	public void setModify(String modify) {
		this.modify = modify;
	}

	/**
	 * @return the create
	 */
	public String getCreate() {
		return create;
	}

	/**
	 * @param create
	 *            the create to set
	 */
	public void setCreate(String create) {
		this.create = create;
	}

	/**
	 * @return the viewed
	 */
	public String getViewed() {
		return viewed;
	}

	/**
	 * @param viewed
	 *            the viewed to set
	 */
	public void setViewed(String viewed) {
		this.viewed = viewed;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the origName
	 */
	public String getOrigName() {
		return origName;
	}

	/**
	 * @param origName
	 *            the origName to set
	 */
	public void setOrigName(String origName) {
		this.origName = origName;
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
	 * @return the poster
	 */
	public String getPoster() {
		return poster;
	}

	/**
	 * @param poster
	 *            the poster to set
	 */
	public void setPoster(String poster) {
		this.poster = poster;
	}

	/**
	 * @return the posterLink
	 */
	public String getPosterLink() {
		return posterLink;
	}

	/**
	 * @param posterLink
	 *            the posterLink to set
	 */
	public void setPosterLink(String posterLink) {
		this.posterLink = posterLink;
	}

	/**
	 * @return the lenght
	 */
	public String getLenght() {
		return lenght;
	}

	/**
	 * @param lenght
	 *            the lenght to set
	 */
	public void setLenght(String lenght) {
		this.lenght = lenght;
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}

	/**
	 * @param year
	 *            the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}

	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * @param director
	 *            the director to set
	 */
	public void setDirector(String director) {
		this.director = director;
	}

	/**
	 * @return the scenario
	 */
	public String getScenario() {
		return scenario;
	}

	/**
	 * @param scenario
	 *            the scenario to set
	 */
	public void setScenario(String scenario) {
		this.scenario = scenario;
	}

	/**
	 * @return the actors
	 */
	public String getActors() {
		return actors;
	}

	/**
	 * @param actors
	 *            the actors to set
	 */
	public void setActors(String actors) {
		this.actors = actors;
	}

	/**
	 * @return the rateImdb
	 */
	public String getRateImdb() {
		return rateImdb;
	}

	/**
	 * @param rateImdb
	 *            the rateImdb to set
	 */
	public void setRateImdb(String rateImdb) {
		this.rateImdb = rateImdb;
	}

	/**
	 * @return the rateKinopoisk
	 */
	public String getRateKinopoisk() {
		return rateKinopoisk;
	}

	/**
	 * @param rateKinopoisk
	 *            the rateKinopoisk to set
	 */
	public void setRateKinopoisk(String rateKinopoisk) {
		this.rateKinopoisk = rateKinopoisk;
	}

	/**
	 * @return the rateMPAA
	 */
	public String getRateMPAA() {
		return rateMPAA;
	}

	/**
	 * @param rateMPAA
	 *            the rateMPAA to set
	 */
	public void setRateMPAA(String rateMPAA) {
		this.rateMPAA = rateMPAA;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the videos
	 */
	public List<Video> getVideos() {
		return videos;
	}

	/**
	 * @param videos
	 *            the videos to set
	 */
	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}

	/**
	 * @return the images
	 */
	public List<Image> getImages() {
		return images;
	}

	/**
	 * @param images
	 *            the images to set
	 */
	public void setImages(List<Image> images) {
		this.images = images;
	}

	/**
	 * @return the genres
	 */
	public List<Gerne> getGenres() {
		return genres;
	}

	/**
	 * @param genres
	 *            the genres to set
	 */
	public void setGenres(List<Gerne> genres) {
		this.genres = genres;
	}

	/**
	 * @return the gerne
	 */
	public String getGerne() {
		return gerne;
	}

	/**
	 * @param gerne
	 *            the gerne to set
	 */
	public void setGerne(String gerne) {
		this.gerne = gerne;
	}

	/**
	 * @return the passProtected
	 */
	public Boolean getPassProtected() {
		return passProtected;
	}

	/**
	 * @param passProtected
	 *            the passProtected to set
	 */
	public void setPassProtected(Boolean passProtected) {
		this.passProtected = passProtected;
	}

	/**
	 * @return the favorites
	 */
	public List<Favorite> getFavorites() {
		return favorites;
	}

	/**
	 * @param favorites
	 *            the favorites to set
	 */
	public void setFavorites(List<Favorite> favorites) {
		this.favorites = favorites;
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
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((origName == null) ? 0 : origName.hashCode());
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
		if (!(obj instanceof VODInfo)) {
			return false;
		}
		VODInfo other = (VODInfo) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (origName == null) {
			if (other.origName != null) {
				return false;
			}
		} else if (!origName.equals(other.origName)) {
			return false;
		}
		return true;
	}

}

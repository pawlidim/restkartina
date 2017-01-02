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

import de.pawlidi.restkartina.dto.RestDTO;

/**
 * 
 * @author pawlidim
 *
 */
public class Services extends RestDTO {

	private String vod;
	private String archive;

	public Services() {
		super();
	}

	/**
	 * @return the vod
	 */
	public String getVod() {
		return vod;
	}

	/**
	 * @param vod
	 *            the vod to set
	 */
	public void setVod(String vod) {
		this.vod = vod;
	}

	/**
	 * @return the archive
	 */
	public String getArchive() {
		return archive;
	}

	/**
	 * @param archive
	 *            the archive to set
	 */
	public void setArchive(String archive) {
		this.archive = archive;
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
		result = prime * result + ((archive == null) ? 0 : archive.hashCode());
		result = prime * result + ((vod == null) ? 0 : vod.hashCode());
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
		if (!(obj instanceof Services)) {
			return false;
		}
		Services other = (Services) obj;
		if (archive == null) {
			if (other.archive != null) {
				return false;
			}
		} else if (!archive.equals(other.archive)) {
			return false;
		}
		if (vod == null) {
			if (other.vod != null) {
				return false;
			}
		} else if (!vod.equals(other.vod)) {
			return false;
		}
		return true;
	}

}

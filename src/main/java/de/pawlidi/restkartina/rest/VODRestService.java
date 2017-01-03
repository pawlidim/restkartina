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
package de.pawlidi.restkartina.rest;

import de.pawlidi.restkartina.dto.vod.VODInfo;
import de.pawlidi.restkartina.dto.vod.VODResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * 
 * @author pawlidim
 *
 */
public interface VODRestService {

	/**
	 * 
	 * @param format
	 * @param category
	 * @return
	 */
	@GET("{format}/vod_index")
	Call<VODResponse> index(@Path("format") String format, @Query("category") Long category);

	/**
	 * 
	 * @param format
	 * @param id
	 * @param protectCode
	 * @return
	 */
	@GET("{format}/vod_info")
	Call<VODInfo> info(@Path("format") String format, @Query("id") Long id, @Query("protect_code") Long protectCode);

	@GET("{format}/vod_selection")
	Call<VODResponse> select(@Path("format") String format, @Query("id") Long id);

	@GET("{format}/vod_geturl")
	Call<VODResponse> getUrl(@Path("format") String format, @Query("fileid") Long fileid,
			@Query("protect_code") Long protectCode);

	@GET("{format}/vod_genres")
	Call<VODResponse> getGenres(@Path("format") String format);

	@GET("{format}/vod_manage")
	Call<VODResponse> manage(@Path("format") String format, @Query("cmd") String cmd,
			@Query("protect_code") Long protectCode, @Query("blood") String blood, @Query("violence") String violence,
			@Query("obsence") String obsence, @Query("porn") String porn, @Query("horror") String horror);

	@GET("{format}/vod_favlist")
	Call<VODResponse> getFavoriteList(@Path("format") String format);

	@GET("{format}/vod_favadd")
	Call<VODResponse> getFavoriteAdd(@Path("format") String format, @Query("id") Long id);

	@GET("{format}/vod_favsub")
	Call<VODResponse> getFavoriteSub(@Path("format") String format, @Query("id") Long id);

}

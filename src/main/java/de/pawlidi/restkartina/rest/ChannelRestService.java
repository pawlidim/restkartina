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

import java.util.Date;

import de.pawlidi.restkartina.dto.channel.ChannelResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * 
 * @author pawlidim
 *
 */
public interface ChannelRestService {

	/**
	 * 
	 * @param format
	 * @param show
	 * @param protectCode
	 * @return
	 */
	@GET("{format}/channel_list")
	Call<ChannelResponse> channelList(@Path("format") String format, @Query("show") Boolean show,
			@Query("protect_code") Long protectCode);

	/**
	 * 
	 * @param format
	 * @param cid
	 * @param timestamp
	 * @param protectCode
	 * @return
	 */
	@GET("{format}/get_url")
	Call<ChannelResponse> getUrl(@Path("format") String format, @Query("cid") Long cid, @Query("gmt") Date timestamp,
			@Query("protect_code") Long protectCode);

	/**
	 * Returns channel response for defined channel filter rule.
	 * 
	 * @param format
	 *            possible values <code>xml, json</code>
	 * @param cmd
	 *            possible values
	 *            <code>get_list, hide_channel, show_channel, reset_channels</code>
	 * @param protectCode
	 *            code for protected channels
	 * @param cid
	 *            required only if cmd is
	 *            <code>show_channel, hide_channel</code>
	 * @return channelResponse
	 */
	@GET("{format}/rule")
	Call<ChannelResponse> filterRule(@Path("format") String format, @Query("cmd") Long cmd,
			@Query("protect_code") Long protectCode, @Query("cid") Long cid);
}

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

import de.pawlidi.restkartina.dto.client.ClientResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * 
 * @author pawlidim
 *
 */
public interface ClientService {

	/**
	 * 
	 * @param format
	 * @param login
	 * @param password
	 * @param softid
	 * @param serial
	 * @return
	 */
	@POST("{format}/login")
	Call<ClientResponse> login(@Path("format") String format, @Query("login") String login,
			@Query("pass") String password, @Query("softid") String softid, @Query("cli_serial") String serial);

	/**
	 * 
	 * @param format
	 * @param settings
	 * @return
	 */
	@GET("{format}/account")
	Call<ClientResponse> account(@Path("format") String format, @Query("settings") Boolean settings);

	/**
	 * Returns settings for given format.
	 * 
	 * @param format
	 *            possible values <code>xml, json</code>
	 * @param var
	 *            possible values
	 *            <code>stream_server, stream_standard, bitrate, timeshift,timezone</code>
	 * @return
	 */
	@GET("{format}/settings")
	Call<ClientResponse> settings(@Path("format") String format, @Query("var") String var);

	/**
	 * 
	 * @param format
	 * @param var
	 * @param val
	 * @return
	 */
	@GET("{format}/settings_set")
	Call<ClientResponse> settingsSet(@Path("format") String format, @Query("var") String var, @Query("val") String val);

	/**
	 * 
	 * @param format
	 * @return
	 */
	@GET("{format}/logout")
	Call<ClientResponse> logout(@Path("format") String format);

}

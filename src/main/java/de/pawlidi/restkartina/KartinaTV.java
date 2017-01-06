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
package de.pawlidi.restkartina;

import java.io.Serializable;

import de.pawlidi.restkartina.dto.channel.ChannelResponse;
import de.pawlidi.restkartina.dto.client.ClientResponse;
import de.pawlidi.restkartina.rest.utils.RetrofitFactory;
import retrofit2.Retrofit;

public class KartinaTV implements Serializable {

	private static final String API = "http://iptv.kartina.tv/api/";
	private static final String API_FORMAT_XML = "xml";
	private static final String API_FORMAT_JSON = "json";

	private final Retrofit retrofit;
	private final String format;
	private ClientService clientService;
	private ChannelService channelService;

	/**
	 * 
	 */
	public KartinaTV() {
		super();
		retrofit = RetrofitFactory.createRetrofit(API);
		format = API_FORMAT_JSON;
		clientService = new ClientService(this);
		channelService = new ChannelService(this);
	}

	protected Retrofit getRetrofit() {
		return retrofit;
	}

	/**
	 * @return the format
	 */
	protected String getFormat() {
		return format;
	}

	public boolean login(final String login, final String password) {
		ClientResponse response = clientService.login(login, password);
		ChannelResponse channelResponse = channelService.list();
		return response != null;
	}

}

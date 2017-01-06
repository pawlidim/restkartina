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

import java.io.IOException;
import java.io.Serializable;

import de.pawlidi.restkartina.dto.channel.ChannelResponse;
import de.pawlidi.restkartina.rest.ChannelRestService;
import retrofit2.Call;
import retrofit2.Response;

/**
 * @author pawlidim
 *
 */
class ChannelService implements Serializable {

	private final ChannelRestService service;
	private final String format;

	protected ChannelService(KartinaTV kartinaTV) {
		this.service = kartinaTV.getRetrofit().create(ChannelRestService.class);
		this.format = kartinaTV.getFormat();
	}

	public ChannelResponse list() {
		Call<ChannelResponse> call = service.channelList(format, null, null);
		try {
			Response<ChannelResponse> response = call.execute();
			if (response.isSuccessful()) {
				return response.body();

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}

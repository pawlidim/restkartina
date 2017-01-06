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
import java.util.UUID;

import de.pawlidi.restkartina.dto.client.ClientResponse;
import de.pawlidi.restkartina.rest.ClientRestService;
import de.pawlidi.restkartina.rest.utils.Utils;
import retrofit2.Call;
import retrofit2.Response;

class ClientService implements Serializable {

	private final ClientRestService service;
	private final String format;

	protected ClientService(KartinaTV kartinaTV) {
		this.service = kartinaTV.getRetrofit().create(ClientRestService.class);
		this.format = kartinaTV.getFormat();
	}

	public ClientResponse login(final String login, final String password) {
		if (Utils.isBlank(login) || Utils.isBlank(password)) {
			return null;
		}
		Call<ClientResponse> call = service.login(format, login, password, "de.pawlidi.restkartina",
				UUID.randomUUID().toString());
		try {
			Response<ClientResponse> response = call.execute();
			if (response.isSuccessful()) {
				return response.body();

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}

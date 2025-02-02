/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.client.opensearch.snapshot;

import jakarta.json.JsonValue;
import org.opensearch.client.base.OpenSearchError;
import org.opensearch.client.base.Endpoint;
import org.opensearch.client.opensearch._types.RequestBase;
import org.opensearch.client.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// typedef: snapshot.delete.Request
public final class DeleteRequest extends RequestBase {
	private final String repository;

	private final String snapshot;

	@Nullable
	private final JsonValue masterTimeout;

	// ---------------------------------------------------------------------------------------------

	protected DeleteRequest(Builder builder) {

		this.repository = Objects.requireNonNull(builder.repository, "repository");
		this.snapshot = Objects.requireNonNull(builder.snapshot, "snapshot");
		this.masterTimeout = builder.masterTimeout;

	}

	/**
	 * API name: {@code repository}
	 */
	public String repository() {
		return this.repository;
	}

	/**
	 * API name: {@code snapshot}
	 */
	public String snapshot() {
		return this.snapshot;
	}

	/**
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public JsonValue masterTimeout() {
		return this.masterTimeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteRequest}.
	 */
	public static class Builder implements ObjectBuilder<DeleteRequest> {
		private String repository;

		private String snapshot;

		@Nullable
		private JsonValue masterTimeout;

		/**
		 * API name: {@code repository}
		 */
		public Builder repository(String value) {
			this.repository = value;
			return this;
		}

		/**
		 * API name: {@code snapshot}
		 */
		public Builder snapshot(String value) {
			this.snapshot = value;
			return this;
		}

		/**
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable JsonValue value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Builds a {@link DeleteRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteRequest build() {

			return new DeleteRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code snapshot.delete}".
	 */
	public static final Endpoint<DeleteRequest, DeleteResponse, OpenSearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _repository = 1 << 0;
				final int _snapshot = 1 << 1;

				int propsSet = 0;

				if (request.repository() != null)
					propsSet |= _repository;
				if (request.snapshot() != null)
					propsSet |= _snapshot;

				if (propsSet == (_repository | _snapshot)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_snapshot");
					buf.append("/");
					buf.append(request.repository);
					buf.append("/");
					buf.append(request.snapshot);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, DeleteResponse.DESERIALIZER);
}

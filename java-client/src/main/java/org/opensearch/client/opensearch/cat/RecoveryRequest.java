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

package org.opensearch.client.opensearch.cat;

import jakarta.json.JsonValue;
import org.opensearch.client.base.OpenSearchError;
import org.opensearch.client.base.Endpoint;
import org.opensearch.client.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// typedef: cat.recovery.Request
public final class RecoveryRequest extends CatRequestBase {
	@Nullable
	private final List<String> index;

	@Nullable
	private final Boolean activeOnly;

	@Nullable
	private final JsonValue bytes;

	@Nullable
	private final Boolean detailed;

	// ---------------------------------------------------------------------------------------------

	protected RecoveryRequest(Builder builder) {

		this.index = builder.index;
		this.activeOnly = builder.activeOnly;
		this.bytes = builder.bytes;
		this.detailed = builder.detailed;

	}

	/**
	 * API name: {@code index}
	 */
	@Nullable
	public List<String> index() {
		return this.index;
	}

	/**
	 * API name: {@code active_only}
	 */
	@Nullable
	public Boolean activeOnly() {
		return this.activeOnly;
	}

	/**
	 * API name: {@code bytes}
	 */
	@Nullable
	public JsonValue bytes() {
		return this.bytes;
	}

	/**
	 * API name: {@code detailed}
	 */
	@Nullable
	public Boolean detailed() {
		return this.detailed;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RecoveryRequest}.
	 */
	public static class Builder implements ObjectBuilder<RecoveryRequest> {
		@Nullable
		private List<String> index;

		@Nullable
		private Boolean activeOnly;

		@Nullable
		private JsonValue bytes;

		@Nullable
		private Boolean detailed;

		/**
		 * API name: {@code index}
		 */
		public Builder index(@Nullable List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #index(List)}, creating the list if needed.
		 */
		public Builder addIndex(String value) {
			if (this.index == null) {
				this.index = new ArrayList<>();
			}
			this.index.add(value);
			return this;
		}

		/**
		 * API name: {@code active_only}
		 */
		public Builder activeOnly(@Nullable Boolean value) {
			this.activeOnly = value;
			return this;
		}

		/**
		 * API name: {@code bytes}
		 */
		public Builder bytes(@Nullable JsonValue value) {
			this.bytes = value;
			return this;
		}

		/**
		 * API name: {@code detailed}
		 */
		public Builder detailed(@Nullable Boolean value) {
			this.detailed = value;
			return this;
		}

		/**
		 * Builds a {@link RecoveryRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RecoveryRequest build() {

			return new RecoveryRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.recovery}".
	 */
	public static final Endpoint<RecoveryRequest, RecoveryResponse, OpenSearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= _index;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/recovery");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/recovery");
					buf.append("/");
					buf.append(request.index.stream().map(v -> v).collect(Collectors.joining(",")));
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.activeOnly != null) {
					params.put("active_only", String.valueOf(request.activeOnly));
				}
				if (request.bytes != null) {
					params.put("bytes", request.bytes.toString());
				}
				if (request.detailed != null) {
					params.put("detailed", String.valueOf(request.detailed));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, RecoveryResponse.DESERIALIZER);
}

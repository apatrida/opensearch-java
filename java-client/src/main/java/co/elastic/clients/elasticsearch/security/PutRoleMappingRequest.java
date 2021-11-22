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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.Refresh;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: security.put_role_mapping.Request
@JsonpDeserializable
public class PutRoleMappingRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean enabled;

	private final Map<String, JsonData> metadata;

	private final String name;

	@Nullable
	private final Refresh refresh;

	private final List<String> roles;

	@Nullable
	private final RoleMappingRule rules;

	private final List<String> runAs;

	// ---------------------------------------------------------------------------------------------

	private PutRoleMappingRequest(Builder builder) {

		this.enabled = builder.enabled;
		this.metadata = ModelTypeHelper.unmodifiable(builder.metadata);
		this.name = ModelTypeHelper.requireNonNull(builder.name, this, "name");
		this.refresh = builder.refresh;
		this.roles = ModelTypeHelper.unmodifiable(builder.roles);
		this.rules = builder.rules;
		this.runAs = ModelTypeHelper.unmodifiable(builder.runAs);

	}

	public static PutRoleMappingRequest of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * API name: {@code enabled}
	 */
	@Nullable
	public final Boolean enabled() {
		return this.enabled;
	}

	/**
	 * API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * Required - Role-mapping name
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * If <code>true</code> (the default) then refresh the affected shards to make
	 * this operation visible to search, if <code>wait_for</code> then wait for a
	 * refresh to make this operation visible to search, if <code>false</code> then
	 * do nothing with refreshes.
	 * <p>
	 * API name: {@code refresh}
	 */
	@Nullable
	public final Refresh refresh() {
		return this.refresh;
	}

	/**
	 * API name: {@code roles}
	 */
	public final List<String> roles() {
		return this.roles;
	}

	/**
	 * API name: {@code rules}
	 */
	@Nullable
	public final RoleMappingRule rules() {
		return this.rules;
	}

	/**
	 * API name: {@code run_as}
	 */
	public final List<String> runAs() {
		return this.runAs;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.enabled != null) {
			generator.writeKey("enabled");
			generator.write(this.enabled);

		}
		if (ModelTypeHelper.isDefined(this.metadata)) {
			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.roles)) {
			generator.writeKey("roles");
			generator.writeStartArray();
			for (String item0 : this.roles) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.rules != null) {
			generator.writeKey("rules");
			this.rules.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.runAs)) {
			generator.writeKey("run_as");
			generator.writeStartArray();
			for (String item0 : this.runAs) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutRoleMappingRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PutRoleMappingRequest> {
		@Nullable
		private Boolean enabled;

		@Nullable
		private Map<String, JsonData> metadata;

		private String name;

		@Nullable
		private Refresh refresh;

		@Nullable
		private List<String> roles;

		@Nullable
		private RoleMappingRule rules;

		@Nullable
		private List<String> runAs;

		/**
		 * API name: {@code enabled}
		 */
		public final Builder enabled(@Nullable Boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * API name: {@code metadata}
		 */
		public final Builder metadata(@Nullable Map<String, JsonData> value) {
			this.metadata = value;
			return this;
		}

		/**
		 * Required - Role-mapping name
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * If <code>true</code> (the default) then refresh the affected shards to make
		 * this operation visible to search, if <code>wait_for</code> then wait for a
		 * refresh to make this operation visible to search, if <code>false</code> then
		 * do nothing with refreshes.
		 * <p>
		 * API name: {@code refresh}
		 */
		public final Builder refresh(@Nullable Refresh value) {
			this.refresh = value;
			return this;
		}

		/**
		 * API name: {@code roles}
		 */
		public final Builder roles(@Nullable List<String> value) {
			this.roles = value;
			return this;
		}

		/**
		 * API name: {@code roles}
		 */
		public final Builder roles(String... value) {
			this.roles = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code rules}
		 */
		public final Builder rules(@Nullable RoleMappingRule value) {
			this.rules = value;
			return this;
		}

		/**
		 * API name: {@code rules}
		 */
		public final Builder rules(Consumer<RoleMappingRule.Builder> fn) {
			RoleMappingRule.Builder builder = new RoleMappingRule.Builder();
			fn.accept(builder);
			return this.rules(builder.build());
		}

		/**
		 * API name: {@code run_as}
		 */
		public final Builder runAs(@Nullable List<String> value) {
			this.runAs = value;
			return this;
		}

		/**
		 * API name: {@code run_as}
		 */
		public final Builder runAs(String... value) {
			this.runAs = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link PutRoleMappingRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutRoleMappingRequest build() {
			_checkSingleUse();

			return new PutRoleMappingRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutRoleMappingRequest}
	 */
	public static final JsonpDeserializer<PutRoleMappingRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutRoleMappingRequest::setupPutRoleMappingRequestDeserializer);

	protected static void setupPutRoleMappingRequestDeserializer(ObjectDeserializer<PutRoleMappingRequest.Builder> op) {

		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::roles, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "roles");
		op.add(Builder::rules, RoleMappingRule._DESERIALIZER, "rules");
		op.add(Builder::runAs, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "run_as");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.put_role_mapping}".
	 */
	public static final Endpoint<PutRoleMappingRequest, PutRoleMappingResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/role_mapping");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.refresh != null) {
					params.put("refresh", request.refresh.jsonValue());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutRoleMappingResponse._DESERIALIZER);
}
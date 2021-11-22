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

import co.elastic.clients.elasticsearch.security.authenticate.ServiceToken;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: security.authenticate.Response
@JsonpDeserializable
public class AuthenticateResponse implements JsonpSerializable {
	private final RealmInfo authenticationRealm;

	@Nullable
	private final String email;

	@Nullable
	private final String fullName;

	private final RealmInfo lookupRealm;

	private final Map<String, JsonData> metadata;

	private final List<String> roles;

	private final String username;

	private final boolean enabled;

	private final String authenticationType;

	@Nullable
	private final ServiceToken token;

	// ---------------------------------------------------------------------------------------------

	private AuthenticateResponse(Builder builder) {

		this.authenticationRealm = ModelTypeHelper.requireNonNull(builder.authenticationRealm, this,
				"authenticationRealm");
		this.email = builder.email;
		this.fullName = builder.fullName;
		this.lookupRealm = ModelTypeHelper.requireNonNull(builder.lookupRealm, this, "lookupRealm");
		this.metadata = ModelTypeHelper.unmodifiableRequired(builder.metadata, this, "metadata");
		this.roles = ModelTypeHelper.unmodifiableRequired(builder.roles, this, "roles");
		this.username = ModelTypeHelper.requireNonNull(builder.username, this, "username");
		this.enabled = ModelTypeHelper.requireNonNull(builder.enabled, this, "enabled");
		this.authenticationType = ModelTypeHelper.requireNonNull(builder.authenticationType, this,
				"authenticationType");
		this.token = builder.token;

	}

	public static AuthenticateResponse of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code authentication_realm}
	 */
	public final RealmInfo authenticationRealm() {
		return this.authenticationRealm;
	}

	/**
	 * API name: {@code email}
	 */
	@Nullable
	public final String email() {
		return this.email;
	}

	/**
	 * API name: {@code full_name}
	 */
	@Nullable
	public final String fullName() {
		return this.fullName;
	}

	/**
	 * Required - API name: {@code lookup_realm}
	 */
	public final RealmInfo lookupRealm() {
		return this.lookupRealm;
	}

	/**
	 * Required - API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * Required - API name: {@code roles}
	 */
	public final List<String> roles() {
		return this.roles;
	}

	/**
	 * Required - API name: {@code username}
	 */
	public final String username() {
		return this.username;
	}

	/**
	 * Required - API name: {@code enabled}
	 */
	public final boolean enabled() {
		return this.enabled;
	}

	/**
	 * Required - API name: {@code authentication_type}
	 */
	public final String authenticationType() {
		return this.authenticationType;
	}

	/**
	 * API name: {@code token}
	 */
	@Nullable
	public final ServiceToken token() {
		return this.token;
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

		generator.writeKey("authentication_realm");
		this.authenticationRealm.serialize(generator, mapper);

		if (this.email != null) {
			generator.writeKey("email");
			generator.write(this.email);

		}
		if (this.fullName != null) {
			generator.writeKey("full_name");
			generator.write(this.fullName);

		}
		generator.writeKey("lookup_realm");
		this.lookupRealm.serialize(generator, mapper);

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
		generator.writeKey("username");
		generator.write(this.username);

		generator.writeKey("enabled");
		generator.write(this.enabled);

		generator.writeKey("authentication_type");
		generator.write(this.authenticationType);

		if (this.token != null) {
			generator.writeKey("token");
			this.token.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AuthenticateResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<AuthenticateResponse> {
		private RealmInfo authenticationRealm;

		@Nullable
		private String email;

		@Nullable
		private String fullName;

		private RealmInfo lookupRealm;

		private Map<String, JsonData> metadata;

		private List<String> roles;

		private String username;

		private Boolean enabled;

		private String authenticationType;

		@Nullable
		private ServiceToken token;

		/**
		 * Required - API name: {@code authentication_realm}
		 */
		public final Builder authenticationRealm(RealmInfo value) {
			this.authenticationRealm = value;
			return this;
		}

		/**
		 * Required - API name: {@code authentication_realm}
		 */
		public final Builder authenticationRealm(Consumer<RealmInfo.Builder> fn) {
			RealmInfo.Builder builder = new RealmInfo.Builder();
			fn.accept(builder);
			return this.authenticationRealm(builder.build());
		}

		/**
		 * API name: {@code email}
		 */
		public final Builder email(@Nullable String value) {
			this.email = value;
			return this;
		}

		/**
		 * API name: {@code full_name}
		 */
		public final Builder fullName(@Nullable String value) {
			this.fullName = value;
			return this;
		}

		/**
		 * Required - API name: {@code lookup_realm}
		 */
		public final Builder lookupRealm(RealmInfo value) {
			this.lookupRealm = value;
			return this;
		}

		/**
		 * Required - API name: {@code lookup_realm}
		 */
		public final Builder lookupRealm(Consumer<RealmInfo.Builder> fn) {
			RealmInfo.Builder builder = new RealmInfo.Builder();
			fn.accept(builder);
			return this.lookupRealm(builder.build());
		}

		/**
		 * Required - API name: {@code metadata}
		 */
		public final Builder metadata(Map<String, JsonData> value) {
			this.metadata = value;
			return this;
		}

		/**
		 * Required - API name: {@code roles}
		 */
		public final Builder roles(List<String> value) {
			this.roles = value;
			return this;
		}

		/**
		 * Required - API name: {@code roles}
		 */
		public final Builder roles(String... value) {
			this.roles = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code username}
		 */
		public final Builder username(String value) {
			this.username = value;
			return this;
		}

		/**
		 * Required - API name: {@code enabled}
		 */
		public final Builder enabled(boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * Required - API name: {@code authentication_type}
		 */
		public final Builder authenticationType(String value) {
			this.authenticationType = value;
			return this;
		}

		/**
		 * API name: {@code token}
		 */
		public final Builder token(@Nullable ServiceToken value) {
			this.token = value;
			return this;
		}

		/**
		 * API name: {@code token}
		 */
		public final Builder token(Consumer<ServiceToken.Builder> fn) {
			ServiceToken.Builder builder = new ServiceToken.Builder();
			fn.accept(builder);
			return this.token(builder.build());
		}

		/**
		 * Builds a {@link AuthenticateResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AuthenticateResponse build() {
			_checkSingleUse();

			return new AuthenticateResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AuthenticateResponse}
	 */
	public static final JsonpDeserializer<AuthenticateResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AuthenticateResponse::setupAuthenticateResponseDeserializer);

	protected static void setupAuthenticateResponseDeserializer(ObjectDeserializer<AuthenticateResponse.Builder> op) {

		op.add(Builder::authenticationRealm, RealmInfo._DESERIALIZER, "authentication_realm");
		op.add(Builder::email, JsonpDeserializer.stringDeserializer(), "email");
		op.add(Builder::fullName, JsonpDeserializer.stringDeserializer(), "full_name");
		op.add(Builder::lookupRealm, RealmInfo._DESERIALIZER, "lookup_realm");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::roles, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "roles");
		op.add(Builder::username, JsonpDeserializer.stringDeserializer(), "username");
		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::authenticationType, JsonpDeserializer.stringDeserializer(), "authentication_type");
		op.add(Builder::token, ServiceToken._DESERIALIZER, "token");

	}

}
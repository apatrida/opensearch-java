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
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: security._types.GlobalPrivilege
@JsonpDeserializable
public class GlobalPrivilege implements JsonpSerializable {
	private final ApplicationGlobalUserPrivileges application;

	// ---------------------------------------------------------------------------------------------

	private GlobalPrivilege(Builder builder) {

		this.application = ModelTypeHelper.requireNonNull(builder.application, this, "application");

	}

	public static GlobalPrivilege of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code application}
	 */
	public final ApplicationGlobalUserPrivileges application() {
		return this.application;
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

		generator.writeKey("application");
		this.application.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GlobalPrivilege}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GlobalPrivilege> {
		private ApplicationGlobalUserPrivileges application;

		/**
		 * Required - API name: {@code application}
		 */
		public final Builder application(ApplicationGlobalUserPrivileges value) {
			this.application = value;
			return this;
		}

		/**
		 * Required - API name: {@code application}
		 */
		public final Builder application(Consumer<ApplicationGlobalUserPrivileges.Builder> fn) {
			ApplicationGlobalUserPrivileges.Builder builder = new ApplicationGlobalUserPrivileges.Builder();
			fn.accept(builder);
			return this.application(builder.build());
		}

		/**
		 * Builds a {@link GlobalPrivilege}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GlobalPrivilege build() {
			_checkSingleUse();

			return new GlobalPrivilege(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GlobalPrivilege}
	 */
	public static final JsonpDeserializer<GlobalPrivilege> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GlobalPrivilege::setupGlobalPrivilegeDeserializer);

	protected static void setupGlobalPrivilegeDeserializer(ObjectDeserializer<GlobalPrivilege.Builder> op) {

		op.add(Builder::application, ApplicationGlobalUserPrivileges._DESERIALIZER, "application");

	}

}
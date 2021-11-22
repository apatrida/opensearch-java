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

package co.elastic.clients.elasticsearch.watcher;

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

// typedef: watcher.deactivate_watch.Response
@JsonpDeserializable
public class DeactivateWatchResponse implements JsonpSerializable {
	private final ActivationStatus status;

	// ---------------------------------------------------------------------------------------------

	private DeactivateWatchResponse(Builder builder) {

		this.status = ModelTypeHelper.requireNonNull(builder.status, this, "status");

	}

	public static DeactivateWatchResponse of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code status}
	 */
	public final ActivationStatus status() {
		return this.status;
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

		generator.writeKey("status");
		this.status.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeactivateWatchResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DeactivateWatchResponse> {
		private ActivationStatus status;

		/**
		 * Required - API name: {@code status}
		 */
		public final Builder status(ActivationStatus value) {
			this.status = value;
			return this;
		}

		/**
		 * Required - API name: {@code status}
		 */
		public final Builder status(Consumer<ActivationStatus.Builder> fn) {
			ActivationStatus.Builder builder = new ActivationStatus.Builder();
			fn.accept(builder);
			return this.status(builder.build());
		}

		/**
		 * Builds a {@link DeactivateWatchResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeactivateWatchResponse build() {
			_checkSingleUse();

			return new DeactivateWatchResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DeactivateWatchResponse}
	 */
	public static final JsonpDeserializer<DeactivateWatchResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DeactivateWatchResponse::setupDeactivateWatchResponseDeserializer);

	protected static void setupDeactivateWatchResponseDeserializer(
			ObjectDeserializer<DeactivateWatchResponse.Builder> op) {

		op.add(Builder::status, ActivationStatus._DESERIALIZER, "status");

	}

}
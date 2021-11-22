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
import java.lang.String;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: watcher._types.Logging
@JsonpDeserializable
public class Logging implements JsonpSerializable {
	@Nullable
	private final String level;

	private final String text;

	@Nullable
	private final String category;

	// ---------------------------------------------------------------------------------------------

	private Logging(Builder builder) {

		this.level = builder.level;
		this.text = ModelTypeHelper.requireNonNull(builder.text, this, "text");
		this.category = builder.category;

	}

	public static Logging of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * API name: {@code level}
	 */
	@Nullable
	public final String level() {
		return this.level;
	}

	/**
	 * Required - API name: {@code text}
	 */
	public final String text() {
		return this.text;
	}

	/**
	 * API name: {@code category}
	 */
	@Nullable
	public final String category() {
		return this.category;
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

		if (this.level != null) {
			generator.writeKey("level");
			generator.write(this.level);

		}
		generator.writeKey("text");
		generator.write(this.text);

		if (this.category != null) {
			generator.writeKey("category");
			generator.write(this.category);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Logging}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Logging> {
		@Nullable
		private String level;

		private String text;

		@Nullable
		private String category;

		/**
		 * API name: {@code level}
		 */
		public final Builder level(@Nullable String value) {
			this.level = value;
			return this;
		}

		/**
		 * Required - API name: {@code text}
		 */
		public final Builder text(String value) {
			this.text = value;
			return this;
		}

		/**
		 * API name: {@code category}
		 */
		public final Builder category(@Nullable String value) {
			this.category = value;
			return this;
		}

		/**
		 * Builds a {@link Logging}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Logging build() {
			_checkSingleUse();

			return new Logging(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Logging}
	 */
	public static final JsonpDeserializer<Logging> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Logging::setupLoggingDeserializer);

	protected static void setupLoggingDeserializer(ObjectDeserializer<Logging.Builder> op) {

		op.add(Builder::level, JsonpDeserializer.stringDeserializer(), "level");
		op.add(Builder::text, JsonpDeserializer.stringDeserializer(), "text");
		op.add(Builder::category, JsonpDeserializer.stringDeserializer(), "category");

	}

}
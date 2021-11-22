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

package co.elastic.clients.elasticsearch.indices;

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

// typedef: indices._types.IndexVersioning
@JsonpDeserializable
public class IndexVersioning implements JsonpSerializable {
	private final String created;

	// ---------------------------------------------------------------------------------------------

	private IndexVersioning(Builder builder) {

		this.created = ModelTypeHelper.requireNonNull(builder.created, this, "created");

	}

	public static IndexVersioning of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code created}
	 */
	public final String created() {
		return this.created;
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

		generator.writeKey("created");
		generator.write(this.created);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexVersioning}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<IndexVersioning> {
		private String created;

		/**
		 * Required - API name: {@code created}
		 */
		public final Builder created(String value) {
			this.created = value;
			return this;
		}

		/**
		 * Builds a {@link IndexVersioning}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexVersioning build() {
			_checkSingleUse();

			return new IndexVersioning(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexVersioning}
	 */
	public static final JsonpDeserializer<IndexVersioning> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IndexVersioning::setupIndexVersioningDeserializer);

	protected static void setupIndexVersioningDeserializer(ObjectDeserializer<IndexVersioning.Builder> op) {

		op.add(Builder::created, JsonpDeserializer.stringDeserializer(), "created");

	}

}
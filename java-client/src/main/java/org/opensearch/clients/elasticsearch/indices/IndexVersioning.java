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

package org.opensearch.clients.elasticsearch.indices;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;

import java.lang.String;
import java.util.function.Function;

// typedef: indices._types.IndexVersioning
@JsonpDeserializable
public class IndexVersioning implements JsonpSerializable {
	private final String created;

	// ---------------------------------------------------------------------------------------------

	private IndexVersioning(Builder builder) {

		this.created = ModelTypeHelper.requireNonNull(builder.created, this, "created");

	}

	public static IndexVersioning of(Function<Builder, ObjectBuilder<IndexVersioning>> fn) {
		return fn.apply(new Builder()).build();
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
			IndexVersioning::setupIndexVersioningDeserializer, Builder::build);

	protected static void setupIndexVersioningDeserializer(DelegatingDeserializer<IndexVersioning.Builder> op) {

		op.add(Builder::created, JsonpDeserializer.stringDeserializer(), "created");

	}

}
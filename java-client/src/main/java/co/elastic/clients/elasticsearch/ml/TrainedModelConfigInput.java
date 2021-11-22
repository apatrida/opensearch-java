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

package co.elastic.clients.elasticsearch.ml;

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
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: ml._types.TrainedModelConfigInput
@JsonpDeserializable
public class TrainedModelConfigInput implements JsonpSerializable {
	private final List<String> fieldNames;

	// ---------------------------------------------------------------------------------------------

	private TrainedModelConfigInput(Builder builder) {

		this.fieldNames = ModelTypeHelper.unmodifiableRequired(builder.fieldNames, this, "fieldNames");

	}

	public static TrainedModelConfigInput of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - An array of input field names for the model.
	 * <p>
	 * API name: {@code field_names}
	 */
	public final List<String> fieldNames() {
		return this.fieldNames;
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

		if (ModelTypeHelper.isDefined(this.fieldNames)) {
			generator.writeKey("field_names");
			generator.writeStartArray();
			for (String item0 : this.fieldNames) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TrainedModelConfigInput}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TrainedModelConfigInput> {
		private List<String> fieldNames;

		/**
		 * Required - An array of input field names for the model.
		 * <p>
		 * API name: {@code field_names}
		 */
		public final Builder fieldNames(List<String> value) {
			this.fieldNames = value;
			return this;
		}

		/**
		 * Required - An array of input field names for the model.
		 * <p>
		 * API name: {@code field_names}
		 */
		public final Builder fieldNames(String... value) {
			this.fieldNames = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link TrainedModelConfigInput}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrainedModelConfigInput build() {
			_checkSingleUse();

			return new TrainedModelConfigInput(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TrainedModelConfigInput}
	 */
	public static final JsonpDeserializer<TrainedModelConfigInput> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TrainedModelConfigInput::setupTrainedModelConfigInputDeserializer);

	protected static void setupTrainedModelConfigInputDeserializer(
			ObjectDeserializer<TrainedModelConfigInput.Builder> op) {

		op.add(Builder::fieldNames, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"field_names");

	}

}
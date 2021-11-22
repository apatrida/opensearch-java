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

package co.elastic.clients.elasticsearch.transform;

import co.elastic.clients.elasticsearch.indices.IndexState;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.NamedDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: transform.preview_transform.Response
@JsonpDeserializable
public class PreviewTransformResponse<TTransform> implements JsonpSerializable {
	private final IndexState generatedDestIndex;

	private final List<TTransform> preview;

	@Nullable
	private final JsonpSerializer<TTransform> tTransformSerializer;

	// ---------------------------------------------------------------------------------------------

	private PreviewTransformResponse(Builder<TTransform> builder) {

		this.generatedDestIndex = ModelTypeHelper.requireNonNull(builder.generatedDestIndex, this,
				"generatedDestIndex");
		this.preview = ModelTypeHelper.unmodifiableRequired(builder.preview, this, "preview");
		this.tTransformSerializer = builder.tTransformSerializer;

	}

	public static <TTransform> PreviewTransformResponse<TTransform> of(Consumer<Builder<TTransform>> fn) {
		Builder<TTransform> builder = new Builder<>();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code generated_dest_index}
	 */
	public final IndexState generatedDestIndex() {
		return this.generatedDestIndex;
	}

	/**
	 * Required - API name: {@code preview}
	 */
	public final List<TTransform> preview() {
		return this.preview;
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

		generator.writeKey("generated_dest_index");
		this.generatedDestIndex.serialize(generator, mapper);

		if (ModelTypeHelper.isDefined(this.preview)) {
			generator.writeKey("preview");
			generator.writeStartArray();
			for (TTransform item0 : this.preview) {
				JsonpUtils.serialize(item0, generator, tTransformSerializer, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PreviewTransformResponse}.
	 */
	public static class Builder<TTransform> extends ObjectBuilderBase
			implements
				ObjectBuilder<PreviewTransformResponse<TTransform>> {
		private IndexState generatedDestIndex;

		private List<TTransform> preview;

		@Nullable
		private JsonpSerializer<TTransform> tTransformSerializer;

		/**
		 * Required - API name: {@code generated_dest_index}
		 */
		public final Builder<TTransform> generatedDestIndex(IndexState value) {
			this.generatedDestIndex = value;
			return this;
		}

		/**
		 * Required - API name: {@code generated_dest_index}
		 */
		public final Builder<TTransform> generatedDestIndex(Consumer<IndexState.Builder> fn) {
			IndexState.Builder builder = new IndexState.Builder();
			fn.accept(builder);
			return this.generatedDestIndex(builder.build());
		}

		/**
		 * Required - API name: {@code preview}
		 */
		public final Builder<TTransform> preview(List<TTransform> value) {
			this.preview = value;
			return this;
		}

		/**
		 * Required - API name: {@code preview}
		 */
		public final Builder<TTransform> preview(TTransform... value) {
			this.preview = Arrays.asList(value);
			return this;
		}

		/**
		 * Serializer for TTransform. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public final Builder<TTransform> tTransformSerializer(@Nullable JsonpSerializer<TTransform> value) {
			this.tTransformSerializer = value;
			return this;
		}

		/**
		 * Builds a {@link PreviewTransformResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PreviewTransformResponse<TTransform> build() {
			_checkSingleUse();

			return new PreviewTransformResponse<TTransform>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for PreviewTransformResponse
	 */
	public static <TTransform> JsonpDeserializer<PreviewTransformResponse<TTransform>> createPreviewTransformResponseDeserializer(
			JsonpDeserializer<TTransform> tTransformDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TTransform>>) Builder::new,
				op -> PreviewTransformResponse.setupPreviewTransformResponseDeserializer(op, tTransformDeserializer));
	};

	/**
	 * Json deserializer for {@link PreviewTransformResponse} based on named
	 * deserializers provided by the calling {@code JsonMapper}.
	 */
	public static final JsonpDeserializer<PreviewTransformResponse<Object>> _DESERIALIZER = createPreviewTransformResponseDeserializer(
			new NamedDeserializer<>("co.elastic.clients:Deserializer:transform.preview_transform.TTransform"));

	protected static <TTransform> void setupPreviewTransformResponseDeserializer(
			ObjectDeserializer<PreviewTransformResponse.Builder<TTransform>> op,
			JsonpDeserializer<TTransform> tTransformDeserializer) {

		op.add(Builder::generatedDestIndex, IndexState._DESERIALIZER, "generated_dest_index");
		op.add(Builder::preview, JsonpDeserializer.arrayDeserializer(tTransformDeserializer), "preview");

	}

}
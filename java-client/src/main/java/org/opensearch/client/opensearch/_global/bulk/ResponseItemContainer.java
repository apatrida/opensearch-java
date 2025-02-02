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

package org.opensearch.client.opensearch._global.bulk;

import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.BuildFunctionDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.StringEnum;
import org.opensearch.client.util.TaggedUnion;

public class ResponseItemContainer extends TaggedUnion<ResponseItemContainer.Tag, Object> implements ToJsonp {

	public enum Tag implements StringEnum {

		index("index"),

		create("create"),

		update("update"),

		delete("delete"),

		;

		private final String jsonValue;

		Tag(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

		public static StringEnum.Deserializer<Tag> DESERIALIZER = new StringEnum.Deserializer<>(Tag.values());
	}

	private ResponseItemContainer(Builder builder) {
		super(builder.$tag, builder.$variant);

	}

	/**
	 * Is this {@link ResponseItemContainer} of a {@code index} kind?
	 */
	public boolean isIndex() {
		return is(Tag.index);
	}

	/**
	 * Get the {@code index} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code index} kind.
	 */
	public JsonValue index() {
		return get(Tag.index);
	}

	/**
	 * Is this {@link ResponseItemContainer} of a {@code create} kind?
	 */
	public boolean isCreate() {
		return is(Tag.create);
	}

	/**
	 * Get the {@code create} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code create} kind.
	 */
	public JsonValue create() {
		return get(Tag.create);
	}

	/**
	 * Is this {@link ResponseItemContainer} of a {@code update} kind?
	 */
	public boolean isUpdate() {
		return is(Tag.update);
	}

	/**
	 * Get the {@code update} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code update} kind.
	 */
	public JsonValue update() {
		return get(Tag.update);
	}

	/**
	 * Is this {@link ResponseItemContainer} of a {@code delete} kind?
	 */
	public boolean isDelete() {
		return is(Tag.delete);
	}

	/**
	 * Get the {@code delete} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code delete} kind.
	 */
	public JsonValue delete() {
		return get(Tag.delete);
	}

	@Override
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		generator.writeKey(tag.jsonValue);
		if (value instanceof ToJsonp) {
			((ToJsonp) value).toJsonp(generator, mapper);
		} else {
			switch (this.tag) {
				case index :
					generator.write(this.<JsonValue>get(Tag.index));

					break;
				case create :
					generator.write(this.<JsonValue>get(Tag.create));

					break;
				case update :
					generator.write(this.<JsonValue>get(Tag.update));

					break;
				case delete :
					generator.write(this.<JsonValue>get(Tag.delete));

					break;
			}
		}

		generator.writeEnd();
	}
	public static class Builder {
		private Tag $tag;
		private Object $variant;

		public ObjectBuilder<ResponseItemContainer> index(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.index;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ResponseItemContainer> create(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.create;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ResponseItemContainer> update(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.update;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ResponseItemContainer> delete(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.delete;
			return new ObjectBuilder.Constant<>(this.build());
		}

		protected ResponseItemContainer build() {
			return new ResponseItemContainer(this);
		}

	}

	// Variants can be recursive data structures. Building the union's deserializer
	// lazily
	// avoids cyclic dependencies between static class initialization code, which
	// can lead to unwanted things like NPEs or stack overflows

	public static final JsonpDeserializer<ResponseItemContainer> DESERIALIZER = JsonpDeserializer
			.lazy(ResponseItemContainer::buildDeserializer);

	private static JsonpDeserializer<ResponseItemContainer> buildDeserializer() {
		ObjectDeserializer<Builder> op = new ObjectDeserializer<>(Builder::new);

		op.add(Builder::index, JsonpDeserializer.jsonValueDeserializer(), "index");
		op.add(Builder::create, JsonpDeserializer.jsonValueDeserializer(), "create");
		op.add(Builder::update, JsonpDeserializer.jsonValueDeserializer(), "update");
		op.add(Builder::delete, JsonpDeserializer.jsonValueDeserializer(), "delete");

		return new BuildFunctionDeserializer<>(op, Builder::build);
	}

}

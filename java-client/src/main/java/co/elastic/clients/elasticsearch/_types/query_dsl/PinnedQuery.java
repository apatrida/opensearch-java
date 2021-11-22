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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.PinnedQuery
// union type: Container[]
@JsonpDeserializable
public class PinnedQuery extends QueryBase
		implements
			TaggedUnion<PinnedQuery.Kind, Object>,
			QueryVariant,
			JsonpSerializable {

	/**
	 * {@link PinnedQuery} variant kinds.
	 */

	public enum Kind implements JsonEnum {
		Ids("ids"),

		Docs("docs"),

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.Pinned;
	}

	private final Kind _kind;
	private final Object _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	private final Query organic;

	private PinnedQuery(Builder builder) {
		super(builder);

		this._kind = ModelTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

		this.organic = ModelTypeHelper.requireNonNull(builder.organic, this, "organic");

	}

	public static PinnedQuery of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code organic}
	 */
	public final Query organic() {
		return this.organic;
	}

	/**
	 * Is this variant instance of kind {@code ids}?
	 */
	public boolean isIds() {
		return _kind == Kind.Ids;
	}

	/**
	 * Get the {@code ids} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code ids} kind.
	 */
	public List<String> ids() {
		return TaggedUnionUtils.get(this, Kind.Ids);
	}

	/**
	 * Is this variant instance of kind {@code docs}?
	 */
	public boolean isDocs() {
		return _kind == Kind.Docs;
	}

	/**
	 * Get the {@code docs} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code docs} kind.
	 */
	public List<PinnedDoc> docs() {
		return TaggedUnionUtils.get(this, Kind.Docs);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		super.serializeInternal(generator, mapper);
		generator.writeKey("organic");
		this.organic.serialize(generator, mapper);

		generator.writeKey(_kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Ids :
					generator.writeStartArray();
					for (String item0 : ((List<String>) this._value)) {
						generator.write(item0);

					}
					generator.writeEnd();

					break;
				case Docs :
					generator.writeStartArray();
					for (PinnedDoc item0 : ((List<PinnedDoc>) this._value)) {
						item0.serialize(generator, mapper);

					}
					generator.writeEnd();

					break;
			}
		}

		generator.writeEnd();

	}

	public static class Builder extends QueryBase.AbstractBuilder<Builder> {
		private Kind _kind;
		private Object _value;

		private Query organic;

		/**
		 * Required - API name: {@code organic}
		 */
		public final Builder organic(Query value) {
			this.organic = value;
			return this;
		}

		/**
		 * Required - API name: {@code organic}
		 */
		public final Builder organic(Consumer<Query.Builder> fn) {
			Query.Builder builder = new Query.Builder();
			fn.accept(builder);
			return this.organic(builder.build());
		}

		@Override
		protected Builder self() {
			return this;
		}
		public ContainerBuilder ids(List<String> v) {
			this._kind = Kind.Ids;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder docs(List<PinnedDoc> v) {
			this._kind = Kind.Docs;
			this._value = v;
			return new ContainerBuilder();
		}

		protected PinnedQuery build() {
			_checkSingleUse();
			return new PinnedQuery(this);
		}

		public class ContainerBuilder implements ObjectBuilder<PinnedQuery> {

			/**
			 * Required - API name: {@code organic}
			 */
			public final ContainerBuilder organic(Query value) {
				Builder.this.organic = value;
				return this;
			}

			/**
			 * Required - API name: {@code organic}
			 */
			public final ContainerBuilder organic(Consumer<Query.Builder> fn) {
				Query.Builder builder = new Query.Builder();
				fn.accept(builder);
				return this.organic(builder.build());
			}

			public PinnedQuery build() {
				return Builder.this.build();
			}
		}
	}

	protected static void setupPinnedQueryDeserializer(ObjectDeserializer<Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::organic, Query._DESERIALIZER, "organic");
		op.add(Builder::ids, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "ids");
		op.add(Builder::docs, JsonpDeserializer.arrayDeserializer(PinnedDoc._DESERIALIZER), "docs");

	}

	public static final JsonpDeserializer<PinnedQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PinnedQuery::setupPinnedQueryDeserializer, Builder::build);
}
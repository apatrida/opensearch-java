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

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: transform._types.RetentionPolicyContainer
// union type: Container[]
@JsonpDeserializable
public class RetentionPolicy implements TaggedUnion<RetentionPolicy.Kind, Object>, JsonpSerializable {

	/**
	 * {@link RetentionPolicy} variant kinds.
	 */

	public enum Kind implements JsonEnum {
		Time("time"),

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

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

	public RetentionPolicy(RetentionPolicyVariant value) {

		this._kind = ModelTypeHelper.requireNonNull(value._retentionPolicyKind(), this, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private RetentionPolicy(Builder builder) {

		this._kind = ModelTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static RetentionPolicy of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Is this variant instance of kind {@code time}?
	 */
	public boolean isTime() {
		return _kind == Kind.Time;
	}

	/**
	 * Get the {@code time} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code time} kind.
	 */
	public TimeRetentionPolicy time() {
		return TaggedUnionUtils.get(this, Kind.Time);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		generator.writeKey(_kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RetentionPolicy> {
		private Kind _kind;
		private Object _value;

		public Builder time(TimeRetentionPolicy v) {
			this._kind = Kind.Time;
			this._value = v;
			return this;
		}

		public Builder time(Consumer<TimeRetentionPolicy.Builder> fn) {
			TimeRetentionPolicy.Builder builder = new TimeRetentionPolicy.Builder();
			fn.accept(builder);
			return this.time(builder.build());
		}

		public RetentionPolicy build() {
			_checkSingleUse();
			return new RetentionPolicy(this);
		}

	}

	protected static void setupRetentionPolicyDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::time, TimeRetentionPolicy._DESERIALIZER, "time");

	}

	public static final JsonpDeserializer<RetentionPolicy> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RetentionPolicy::setupRetentionPolicyDeserializer, Builder::build);
}
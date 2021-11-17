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

package org.opensearch.clients.elasticsearch._types.mapping;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;

import java.util.function.Function;

// typedef: _types.mapping.FloatRangeProperty
@JsonpDeserializable
public class FloatRangeProperty extends RangePropertyBase implements PropertyVariant {
	// ---------------------------------------------------------------------------------------------

	private FloatRangeProperty(Builder builder) {
		super(builder);

	}

	public static FloatRangeProperty of(Function<Builder, ObjectBuilder<FloatRangeProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Property} variant type
	 */
	@Override
	public String _variantType() {
		return "float_range";
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "float_range");
		super.serializeInternal(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FloatRangeProperty}.
	 */
	public static class Builder extends RangePropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<FloatRangeProperty> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FloatRangeProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FloatRangeProperty build() {
			_checkSingleUse();

			return new FloatRangeProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FloatRangeProperty}
	 */
	public static final JsonpDeserializer<FloatRangeProperty> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FloatRangeProperty::setupFloatRangePropertyDeserializer, Builder::build);

	protected static void setupFloatRangePropertyDeserializer(DelegatingDeserializer<FloatRangeProperty.Builder> op) {
		setupRangePropertyBaseDeserializer(op);

		op.ignore("type");
	}

}
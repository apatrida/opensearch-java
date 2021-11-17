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

package org.opensearch.clients.elasticsearch._types.analysis;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.function.Function;

// typedef: _types.analysis.TruncateTokenFilter
@JsonpDeserializable
public class TruncateTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final int length;

	// ---------------------------------------------------------------------------------------------

	private TruncateTokenFilter(Builder builder) {
		super(builder);

		this.length = ModelTypeHelper.requireNonNull(builder.length, this, "length");

	}

	public static TruncateTokenFilter of(Function<Builder, ObjectBuilder<TruncateTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "truncate";
	}

	/**
	 * Required - API name: {@code length}
	 */
	public final int length() {
		return this.length;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "truncate");
		super.serializeInternal(generator, mapper);
		generator.writeKey("length");
		generator.write(this.length);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TruncateTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<TruncateTokenFilter> {
		private Integer length;

		/**
		 * Required - API name: {@code length}
		 */
		public final Builder length(int value) {
			this.length = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TruncateTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TruncateTokenFilter build() {
			_checkSingleUse();

			return new TruncateTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TruncateTokenFilter}
	 */
	public static final JsonpDeserializer<TruncateTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TruncateTokenFilter::setupTruncateTokenFilterDeserializer, Builder::build);

	protected static void setupTruncateTokenFilterDeserializer(DelegatingDeserializer<TruncateTokenFilter.Builder> op) {
		setupTokenFilterBaseDeserializer(op);
		op.add(Builder::length, JsonpDeserializer.integerDeserializer(), "length");

		op.ignore("type");
	}

}
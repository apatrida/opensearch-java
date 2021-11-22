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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Consumer;

// typedef: _types.query_dsl.MatchNoneQuery
@JsonpDeserializable
public class MatchNoneQuery extends QueryBase implements QueryVariant {
	// ---------------------------------------------------------------------------------------------

	private MatchNoneQuery(Builder builder) {
		super(builder);

	}

	public static MatchNoneQuery of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.MatchNone;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MatchNoneQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<MatchNoneQuery> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MatchNoneQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MatchNoneQuery build() {
			_checkSingleUse();

			return new MatchNoneQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MatchNoneQuery}
	 */
	public static final JsonpDeserializer<MatchNoneQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MatchNoneQuery::setupMatchNoneQueryDeserializer);

	protected static void setupMatchNoneQueryDeserializer(ObjectDeserializer<MatchNoneQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);

	}

}
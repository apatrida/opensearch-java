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

package org.opensearch.client.opensearch._types.aggregations;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import java.util.Objects;

// typedef: _types.aggregations.ChiSquareHeuristic
public final class ChiSquareHeuristic implements ToJsonp {
	private final Boolean backgroundIsSuperset;

	private final Boolean includeNegatives;

	// ---------------------------------------------------------------------------------------------

	protected ChiSquareHeuristic(Builder builder) {

		this.backgroundIsSuperset = Objects.requireNonNull(builder.backgroundIsSuperset, "background_is_superset");
		this.includeNegatives = Objects.requireNonNull(builder.includeNegatives, "include_negatives");

	}

	/**
	 * API name: {@code background_is_superset}
	 */
	public Boolean backgroundIsSuperset() {
		return this.backgroundIsSuperset;
	}

	/**
	 * API name: {@code include_negatives}
	 */
	public Boolean includeNegatives() {
		return this.includeNegatives;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("background_is_superset");
		generator.write(this.backgroundIsSuperset);

		generator.writeKey("include_negatives");
		generator.write(this.includeNegatives);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ChiSquareHeuristic}.
	 */
	public static class Builder implements ObjectBuilder<ChiSquareHeuristic> {
		private Boolean backgroundIsSuperset;

		private Boolean includeNegatives;

		/**
		 * API name: {@code background_is_superset}
		 */
		public Builder backgroundIsSuperset(Boolean value) {
			this.backgroundIsSuperset = value;
			return this;
		}

		/**
		 * API name: {@code include_negatives}
		 */
		public Builder includeNegatives(Boolean value) {
			this.includeNegatives = value;
			return this;
		}

		/**
		 * Builds a {@link ChiSquareHeuristic}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ChiSquareHeuristic build() {

			return new ChiSquareHeuristic(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ChiSquareHeuristic
	 */
	public static final JsonpDeserializer<ChiSquareHeuristic> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ChiSquareHeuristic::setupChiSquareHeuristicDeserializer);

	protected static void setupChiSquareHeuristicDeserializer(DelegatingDeserializer<ChiSquareHeuristic.Builder> op) {

		op.add(Builder::backgroundIsSuperset, JsonpDeserializer.booleanDeserializer(), "background_is_superset");
		op.add(Builder::includeNegatives, JsonpDeserializer.booleanDeserializer(), "include_negatives");

	}

}

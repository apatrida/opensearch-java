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

package org.opensearch.client.opensearch.cluster.reroute;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import java.util.Objects;

// typedef: cluster.reroute.RerouteDecision
public final class RerouteDecision implements ToJsonp {
	private final String decider;

	private final String decision;

	private final String explanation;

	// ---------------------------------------------------------------------------------------------

	protected RerouteDecision(Builder builder) {

		this.decider = Objects.requireNonNull(builder.decider, "decider");
		this.decision = Objects.requireNonNull(builder.decision, "decision");
		this.explanation = Objects.requireNonNull(builder.explanation, "explanation");

	}

	/**
	 * API name: {@code decider}
	 */
	public String decider() {
		return this.decider;
	}

	/**
	 * API name: {@code decision}
	 */
	public String decision() {
		return this.decision;
	}

	/**
	 * API name: {@code explanation}
	 */
	public String explanation() {
		return this.explanation;
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

		generator.writeKey("decider");
		generator.write(this.decider);

		generator.writeKey("decision");
		generator.write(this.decision);

		generator.writeKey("explanation");
		generator.write(this.explanation);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RerouteDecision}.
	 */
	public static class Builder implements ObjectBuilder<RerouteDecision> {
		private String decider;

		private String decision;

		private String explanation;

		/**
		 * API name: {@code decider}
		 */
		public Builder decider(String value) {
			this.decider = value;
			return this;
		}

		/**
		 * API name: {@code decision}
		 */
		public Builder decision(String value) {
			this.decision = value;
			return this;
		}

		/**
		 * API name: {@code explanation}
		 */
		public Builder explanation(String value) {
			this.explanation = value;
			return this;
		}

		/**
		 * Builds a {@link RerouteDecision}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RerouteDecision build() {

			return new RerouteDecision(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RerouteDecision
	 */
	public static final JsonpDeserializer<RerouteDecision> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RerouteDecision::setupRerouteDecisionDeserializer);

	protected static void setupRerouteDecisionDeserializer(DelegatingDeserializer<RerouteDecision.Builder> op) {

		op.add(Builder::decider, JsonpDeserializer.stringDeserializer(), "decider");
		op.add(Builder::decision, JsonpDeserializer.stringDeserializer(), "decision");
		op.add(Builder::explanation, JsonpDeserializer.stringDeserializer(), "explanation");

	}

}

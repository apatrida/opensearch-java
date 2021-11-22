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

package co.elastic.clients.elasticsearch.enrich;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ListBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: enrich.get_policy.Response
@JsonpDeserializable
public class GetPolicyResponse implements JsonpSerializable {
	private final List<EnrichSummary> policies;

	// ---------------------------------------------------------------------------------------------

	private GetPolicyResponse(Builder builder) {

		this.policies = ModelTypeHelper.unmodifiableRequired(builder.policies, this, "policies");

	}

	public static GetPolicyResponse of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code policies}
	 */
	public final List<EnrichSummary> policies() {
		return this.policies;
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

		if (ModelTypeHelper.isDefined(this.policies)) {
			generator.writeKey("policies");
			generator.writeStartArray();
			for (EnrichSummary item0 : this.policies) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetPolicyResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetPolicyResponse> {
		private List<EnrichSummary> policies;

		/**
		 * Required - API name: {@code policies}
		 */
		public final Builder policies(List<EnrichSummary> value) {
			this.policies = value;
			return this;
		}

		/**
		 * Required - API name: {@code policies}
		 */
		public final Builder policies(EnrichSummary... value) {
			this.policies = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code policies}
		 */
		public final Builder policies(
				Function<ListBuilder<EnrichSummary, EnrichSummary.Builder>, ObjectBuilder<List<EnrichSummary>>> fn) {
			return policies(fn.apply(new ListBuilder<>(EnrichSummary.Builder::new)).build());
		}

		/**
		 * Builds a {@link GetPolicyResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetPolicyResponse build() {
			_checkSingleUse();

			return new GetPolicyResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetPolicyResponse}
	 */
	public static final JsonpDeserializer<GetPolicyResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetPolicyResponse::setupGetPolicyResponseDeserializer);

	protected static void setupGetPolicyResponseDeserializer(ObjectDeserializer<GetPolicyResponse.Builder> op) {

		op.add(Builder::policies, JsonpDeserializer.arrayDeserializer(EnrichSummary._DESERIALIZER), "policies");

	}

}
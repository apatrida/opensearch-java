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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.elasticsearch._types.AcknowledgedResponseBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Consumer;

// typedef: ml.delete_job.Response
@JsonpDeserializable
public class DeleteJobResponse extends AcknowledgedResponseBase {
	// ---------------------------------------------------------------------------------------------

	private DeleteJobResponse(Builder builder) {
		super(builder);

	}

	public static DeleteJobResponse of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteJobResponse}.
	 */
	public static class Builder extends AcknowledgedResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DeleteJobResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DeleteJobResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteJobResponse build() {
			_checkSingleUse();

			return new DeleteJobResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DeleteJobResponse}
	 */
	public static final JsonpDeserializer<DeleteJobResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DeleteJobResponse::setupDeleteJobResponseDeserializer);

	protected static void setupDeleteJobResponseDeserializer(ObjectDeserializer<DeleteJobResponse.Builder> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseDeserializer(op);

	}

}
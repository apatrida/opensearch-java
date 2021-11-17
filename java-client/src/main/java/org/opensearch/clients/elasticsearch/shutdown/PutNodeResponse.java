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

package org.opensearch.clients.elasticsearch.shutdown;

import org.opensearch.clients.elasticsearch._types.AcknowledgedResponseBase;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ObjectBuilder;

import java.util.function.Function;

// typedef: shutdown.put_node.Response
@JsonpDeserializable
public class PutNodeResponse extends AcknowledgedResponseBase {
	// ---------------------------------------------------------------------------------------------

	private PutNodeResponse(Builder builder) {
		super(builder);

	}

	public static PutNodeResponse of(Function<Builder, ObjectBuilder<PutNodeResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutNodeResponse}.
	 */
	public static class Builder extends AcknowledgedResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutNodeResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutNodeResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutNodeResponse build() {
			_checkSingleUse();

			return new PutNodeResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutNodeResponse}
	 */
	public static final JsonpDeserializer<PutNodeResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PutNodeResponse::setupPutNodeResponseDeserializer, Builder::build);

	protected static void setupPutNodeResponseDeserializer(DelegatingDeserializer<Builder> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseDeserializer(op);

	}

}
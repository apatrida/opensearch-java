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

package org.opensearch.client.opensearch._global;

import org.opensearch.client.opensearch.task.ListResponse;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ObjectBuilder;

// typedef: _global.delete_by_query_rethrottle.Response
public final class DeleteByQueryRethrottleResponse extends ListResponse {
	// ---------------------------------------------------------------------------------------------

	protected DeleteByQueryRethrottleResponse(Builder builder) {
		super(builder);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteByQueryRethrottleResponse}.
	 */
	public static class Builder extends ListResponse.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DeleteByQueryRethrottleResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DeleteByQueryRethrottleResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteByQueryRethrottleResponse build() {

			return new DeleteByQueryRethrottleResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for DeleteByQueryRethrottleResponse
	 */
	public static final JsonpDeserializer<DeleteByQueryRethrottleResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					DeleteByQueryRethrottleResponse::setupDeleteByQueryRethrottleResponseDeserializer);

	protected static void setupDeleteByQueryRethrottleResponseDeserializer(
			DelegatingDeserializer<DeleteByQueryRethrottleResponse.Builder> op) {
		ListResponse.setupListResponseDeserializer(op);

	}

}

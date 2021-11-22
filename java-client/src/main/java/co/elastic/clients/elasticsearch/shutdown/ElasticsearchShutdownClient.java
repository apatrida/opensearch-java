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

package co.elastic.clients.elasticsearch.shutdown;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Consumer;
import javax.annotation.Nullable;

/**
 * Client for the shutdown namespace.
 */
public class ElasticsearchShutdownClient extends ApiClient<ElasticsearchTransport, ElasticsearchShutdownClient> {

	public ElasticsearchShutdownClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchShutdownClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchShutdownClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchShutdownClient(this.transport, transportOptions);
	}

	// ----- Endpoint: shutdown.delete_node

	/**
	 * Removes a node from the shutdown list. Designed for indirect use by ECE/ESS
	 * and ECK. Direct use is not supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteNodeResponse deleteNode(DeleteNodeRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteNodeRequest, DeleteNodeResponse, ErrorResponse> endpoint = (Endpoint<DeleteNodeRequest, DeleteNodeResponse, ErrorResponse>) DeleteNodeRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Removes a node from the shutdown list. Designed for indirect use by ECE/ESS
	 * and ECK. Direct use is not supported.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteNodeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteNodeResponse deleteNode(Consumer<DeleteNodeRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		DeleteNodeRequest.Builder builder = new DeleteNodeRequest.Builder();
		fn.accept(builder);
		return deleteNode(builder.build());
	}

	// ----- Endpoint: shutdown.get_node

	/**
	 * Retrieve status of a node or nodes that are currently marked as shutting
	 * down. Designed for indirect use by ECE/ESS and ECK. Direct use is not
	 * supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current">Documentation
	 *      on elastic.co</a>
	 */

	public GetNodeResponse getNode(GetNodeRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetNodeRequest, GetNodeResponse, ErrorResponse> endpoint = (Endpoint<GetNodeRequest, GetNodeResponse, ErrorResponse>) GetNodeRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieve status of a node or nodes that are currently marked as shutting
	 * down. Designed for indirect use by ECE/ESS and ECK. Direct use is not
	 * supported.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetNodeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current">Documentation
	 *      on elastic.co</a>
	 */

	public final GetNodeResponse getNode(Consumer<GetNodeRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		GetNodeRequest.Builder builder = new GetNodeRequest.Builder();
		fn.accept(builder);
		return getNode(builder.build());
	}

	/**
	 * Retrieve status of a node or nodes that are currently marked as shutting
	 * down. Designed for indirect use by ECE/ESS and ECK. Direct use is not
	 * supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current">Documentation
	 *      on elastic.co</a>
	 */

	public GetNodeResponse getNode() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetNodeRequest.Builder().build(), GetNodeRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: shutdown.put_node

	/**
	 * Adds a node to be shut down. Designed for indirect use by ECE/ESS and ECK.
	 * Direct use is not supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current">Documentation
	 *      on elastic.co</a>
	 */

	public PutNodeResponse putNode(PutNodeRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PutNodeRequest, PutNodeResponse, ErrorResponse> endpoint = (Endpoint<PutNodeRequest, PutNodeResponse, ErrorResponse>) PutNodeRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Adds a node to be shut down. Designed for indirect use by ECE/ESS and ECK.
	 * Direct use is not supported.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutNodeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current">Documentation
	 *      on elastic.co</a>
	 */

	public final PutNodeResponse putNode(Consumer<PutNodeRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		PutNodeRequest.Builder builder = new PutNodeRequest.Builder();
		fn.accept(builder);
		return putNode(builder.build());
	}

}
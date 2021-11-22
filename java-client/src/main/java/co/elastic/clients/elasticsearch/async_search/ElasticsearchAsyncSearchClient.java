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

package co.elastic.clients.elasticsearch.async_search;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.endpoints.EndpointWithResponseMapperAttr;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Consumer;
import javax.annotation.Nullable;

/**
 * Client for the async_search namespace.
 */
public class ElasticsearchAsyncSearchClient extends ApiClient<ElasticsearchTransport, ElasticsearchAsyncSearchClient> {

	public ElasticsearchAsyncSearchClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchAsyncSearchClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchAsyncSearchClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchAsyncSearchClient(this.transport, transportOptions);
	}

	// ----- Endpoint: async_search.delete

	/**
	 * Deletes an async search by ID. If the search is still running, the search
	 * request will be cancelled. Otherwise, the saved search results are deleted.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteAsyncSearchResponse delete(DeleteAsyncSearchRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteAsyncSearchRequest, DeleteAsyncSearchResponse, ErrorResponse> endpoint = (Endpoint<DeleteAsyncSearchRequest, DeleteAsyncSearchResponse, ErrorResponse>) DeleteAsyncSearchRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes an async search by ID. If the search is still running, the search
	 * request will be cancelled. Otherwise, the saved search results are deleted.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteAsyncSearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteAsyncSearchResponse delete(Consumer<DeleteAsyncSearchRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		DeleteAsyncSearchRequest.Builder builder = new DeleteAsyncSearchRequest.Builder();
		fn.accept(builder);
		return delete(builder.build());
	}

	// ----- Endpoint: async_search.get

	/**
	 * Retrieves the results of a previously submitted async search request given
	 * its ID.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> GetAsyncSearchResponse<TDocument> get(GetAsyncSearchRequest request,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetAsyncSearchRequest, GetAsyncSearchResponse<TDocument>, ErrorResponse> endpoint = (Endpoint<GetAsyncSearchRequest, GetAsyncSearchResponse<TDocument>, ErrorResponse>) GetAsyncSearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:async_search.get.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves the results of a previously submitted async search request given
	 * its ID.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetAsyncSearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> GetAsyncSearchResponse<TDocument> get(Consumer<GetAsyncSearchRequest.Builder> fn,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		GetAsyncSearchRequest.Builder builder = new GetAsyncSearchRequest.Builder();
		fn.accept(builder);
		return get(builder.build(), tDocumentClass);
	}

	// ----- Endpoint: async_search.status

	/**
	 * Retrieves the status of a previously submitted async search request given its
	 * ID.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> AsyncSearchStatusResponse<TDocument> status(AsyncSearchStatusRequest request,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<AsyncSearchStatusRequest, AsyncSearchStatusResponse<TDocument>, ErrorResponse> endpoint = (Endpoint<AsyncSearchStatusRequest, AsyncSearchStatusResponse<TDocument>, ErrorResponse>) AsyncSearchStatusRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:async_search.status.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves the status of a previously submitted async search request given its
	 * ID.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link AsyncSearchStatusRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> AsyncSearchStatusResponse<TDocument> status(Consumer<AsyncSearchStatusRequest.Builder> fn,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		AsyncSearchStatusRequest.Builder builder = new AsyncSearchStatusRequest.Builder();
		fn.accept(builder);
		return status(builder.build(), tDocumentClass);
	}

	// ----- Endpoint: async_search.submit

	/**
	 * Executes a search request asynchronously.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> SubmitResponse<TDocument> submit(SubmitRequest request, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<SubmitRequest, SubmitResponse<TDocument>, ErrorResponse> endpoint = (Endpoint<SubmitRequest, SubmitResponse<TDocument>, ErrorResponse>) SubmitRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:async_search.submit.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Executes a search request asynchronously.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SubmitRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> SubmitResponse<TDocument> submit(Consumer<SubmitRequest.Builder> fn,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		SubmitRequest.Builder builder = new SubmitRequest.Builder();
		fn.accept(builder);
		return submit(builder.build(), tDocumentClass);
	}

}
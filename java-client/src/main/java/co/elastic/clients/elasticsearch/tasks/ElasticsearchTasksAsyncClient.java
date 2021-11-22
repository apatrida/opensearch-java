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

package co.elastic.clients.elasticsearch.tasks;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import javax.annotation.Nullable;

/**
 * Client for the tasks namespace.
 */
public class ElasticsearchTasksAsyncClient extends ApiClient<ElasticsearchTransport, ElasticsearchTasksAsyncClient> {

	public ElasticsearchTasksAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchTasksAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchTasksAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchTasksAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: tasks.cancel

	/**
	 * Cancels a task, if it can be cancelled through an API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CancelResponse> cancel(CancelRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<CancelRequest, CancelResponse, ErrorResponse> endpoint = (Endpoint<CancelRequest, CancelResponse, ErrorResponse>) CancelRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Cancels a task, if it can be cancelled through an API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CancelRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CancelResponse> cancel(Consumer<CancelRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		CancelRequest.Builder builder = new CancelRequest.Builder();
		fn.accept(builder);
		return cancel(builder.build());
	}

	/**
	 * Cancels a task, if it can be cancelled through an API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CancelResponse> cancel() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new CancelRequest.Builder().build(), CancelRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: tasks.get

	/**
	 * Returns information about a task.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetTasksResponse> get(GetTasksRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetTasksRequest, GetTasksResponse, ErrorResponse> endpoint = (Endpoint<GetTasksRequest, GetTasksResponse, ErrorResponse>) GetTasksRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about a task.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetTasksRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetTasksResponse> get(Consumer<GetTasksRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		GetTasksRequest.Builder builder = new GetTasksRequest.Builder();
		fn.accept(builder);
		return get(builder.build());
	}

	// ----- Endpoint: tasks.list

	/**
	 * Returns a list of tasks.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ListResponse> list(ListRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ListRequest, ListResponse, ErrorResponse> endpoint = (Endpoint<ListRequest, ListResponse, ErrorResponse>) ListRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns a list of tasks.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ListRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ListResponse> list(Consumer<ListRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		ListRequest.Builder builder = new ListRequest.Builder();
		fn.accept(builder);
		return list(builder.build());
	}

	/**
	 * Returns a list of tasks.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ListResponse> list() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new ListRequest.Builder().build(), ListRequest._ENDPOINT,
				this.transportOptions);
	}

}
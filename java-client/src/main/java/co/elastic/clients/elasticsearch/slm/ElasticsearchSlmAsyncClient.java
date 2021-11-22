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

package co.elastic.clients.elasticsearch.slm;

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
 * Client for the slm namespace.
 */
public class ElasticsearchSlmAsyncClient extends ApiClient<ElasticsearchTransport, ElasticsearchSlmAsyncClient> {

	public ElasticsearchSlmAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchSlmAsyncClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchSlmAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchSlmAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: slm.delete_lifecycle

	/**
	 * Deletes an existing snapshot lifecycle policy.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-delete-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteLifecycleResponse> deleteLifecycle(DeleteLifecycleRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteLifecycleRequest, DeleteLifecycleResponse, ErrorResponse> endpoint = (Endpoint<DeleteLifecycleRequest, DeleteLifecycleResponse, ErrorResponse>) DeleteLifecycleRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes an existing snapshot lifecycle policy.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteLifecycleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-delete-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteLifecycleResponse> deleteLifecycle(Consumer<DeleteLifecycleRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		DeleteLifecycleRequest.Builder builder = new DeleteLifecycleRequest.Builder();
		fn.accept(builder);
		return deleteLifecycle(builder.build());
	}

	// ----- Endpoint: slm.execute_lifecycle

	/**
	 * Immediately creates a snapshot according to the lifecycle policy, without
	 * waiting for the scheduled time.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-execute-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ExecuteLifecycleResponse> executeLifecycle(ExecuteLifecycleRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ExecuteLifecycleRequest, ExecuteLifecycleResponse, ErrorResponse> endpoint = (Endpoint<ExecuteLifecycleRequest, ExecuteLifecycleResponse, ErrorResponse>) ExecuteLifecycleRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Immediately creates a snapshot according to the lifecycle policy, without
	 * waiting for the scheduled time.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExecuteLifecycleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-execute-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ExecuteLifecycleResponse> executeLifecycle(
			Consumer<ExecuteLifecycleRequest.Builder> fn) throws IOException, ElasticsearchException {
		ExecuteLifecycleRequest.Builder builder = new ExecuteLifecycleRequest.Builder();
		fn.accept(builder);
		return executeLifecycle(builder.build());
	}

	// ----- Endpoint: slm.execute_retention

	/**
	 * Deletes any snapshots that are expired according to the policy's retention
	 * rules.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-execute-retention.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<ExecuteRetentionResponse> executeRetention() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(ExecuteRetentionRequest._INSTANCE, ExecuteRetentionRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: slm.get_lifecycle

	/**
	 * Retrieves one or more snapshot lifecycle policy definitions and information
	 * about the latest snapshot attempts.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-get-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetLifecycleResponse> getLifecycle(GetLifecycleRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetLifecycleRequest, GetLifecycleResponse, ErrorResponse> endpoint = (Endpoint<GetLifecycleRequest, GetLifecycleResponse, ErrorResponse>) GetLifecycleRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves one or more snapshot lifecycle policy definitions and information
	 * about the latest snapshot attempts.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetLifecycleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-get-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetLifecycleResponse> getLifecycle(Consumer<GetLifecycleRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		GetLifecycleRequest.Builder builder = new GetLifecycleRequest.Builder();
		fn.accept(builder);
		return getLifecycle(builder.build());
	}

	/**
	 * Retrieves one or more snapshot lifecycle policy definitions and information
	 * about the latest snapshot attempts.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-get-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetLifecycleResponse> getLifecycle() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new GetLifecycleRequest.Builder().build(),
				GetLifecycleRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: slm.get_stats

	/**
	 * Returns global and policy-level statistics about actions taken by snapshot
	 * lifecycle management.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/slm-api-get-stats.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<GetStatsResponse> getStats() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(GetStatsRequest._INSTANCE, GetStatsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: slm.get_status

	/**
	 * Retrieves the status of snapshot lifecycle management (SLM).
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-get-status.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<GetSlmStatusResponse> getStatus() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(GetSlmStatusRequest._INSTANCE, GetSlmStatusRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: slm.put_lifecycle

	/**
	 * Creates or updates a snapshot lifecycle policy.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-put-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutLifecycleResponse> putLifecycle(PutLifecycleRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PutLifecycleRequest, PutLifecycleResponse, ErrorResponse> endpoint = (Endpoint<PutLifecycleRequest, PutLifecycleResponse, ErrorResponse>) PutLifecycleRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates or updates a snapshot lifecycle policy.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutLifecycleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-put-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutLifecycleResponse> putLifecycle(Consumer<PutLifecycleRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		PutLifecycleRequest.Builder builder = new PutLifecycleRequest.Builder();
		fn.accept(builder);
		return putLifecycle(builder.build());
	}

	// ----- Endpoint: slm.start

	/**
	 * Turns on snapshot lifecycle management (SLM).
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-start.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<StartSlmResponse> start() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(StartSlmRequest._INSTANCE, StartSlmRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: slm.stop

	/**
	 * Turns off snapshot lifecycle management (SLM).
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-stop.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<StopSlmResponse> stop() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(StopSlmRequest._INSTANCE, StopSlmRequest._ENDPOINT,
				this.transportOptions);
	}

}
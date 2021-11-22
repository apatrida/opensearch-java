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

package co.elastic.clients.elasticsearch.watcher;

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
 * Client for the watcher namespace.
 */
public class ElasticsearchWatcherClient extends ApiClient<ElasticsearchTransport, ElasticsearchWatcherClient> {

	public ElasticsearchWatcherClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchWatcherClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchWatcherClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchWatcherClient(this.transport, transportOptions);
	}

	// ----- Endpoint: watcher.ack_watch

	/**
	 * Acknowledges a watch, manually throttling the execution of the watch's
	 * actions.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-ack-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public AckWatchResponse ackWatch(AckWatchRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<AckWatchRequest, AckWatchResponse, ErrorResponse> endpoint = (Endpoint<AckWatchRequest, AckWatchResponse, ErrorResponse>) AckWatchRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Acknowledges a watch, manually throttling the execution of the watch's
	 * actions.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link AckWatchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-ack-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public final AckWatchResponse ackWatch(Consumer<AckWatchRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		AckWatchRequest.Builder builder = new AckWatchRequest.Builder();
		fn.accept(builder);
		return ackWatch(builder.build());
	}

	// ----- Endpoint: watcher.activate_watch

	/**
	 * Activates a currently inactive watch.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-activate-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public ActivateWatchResponse activateWatch(ActivateWatchRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ActivateWatchRequest, ActivateWatchResponse, ErrorResponse> endpoint = (Endpoint<ActivateWatchRequest, ActivateWatchResponse, ErrorResponse>) ActivateWatchRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Activates a currently inactive watch.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ActivateWatchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-activate-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ActivateWatchResponse activateWatch(Consumer<ActivateWatchRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		ActivateWatchRequest.Builder builder = new ActivateWatchRequest.Builder();
		fn.accept(builder);
		return activateWatch(builder.build());
	}

	// ----- Endpoint: watcher.deactivate_watch

	/**
	 * Deactivates a currently active watch.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-deactivate-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeactivateWatchResponse deactivateWatch(DeactivateWatchRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DeactivateWatchRequest, DeactivateWatchResponse, ErrorResponse> endpoint = (Endpoint<DeactivateWatchRequest, DeactivateWatchResponse, ErrorResponse>) DeactivateWatchRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Deactivates a currently active watch.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeactivateWatchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-deactivate-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeactivateWatchResponse deactivateWatch(Consumer<DeactivateWatchRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		DeactivateWatchRequest.Builder builder = new DeactivateWatchRequest.Builder();
		fn.accept(builder);
		return deactivateWatch(builder.build());
	}

	// ----- Endpoint: watcher.delete_watch

	/**
	 * Removes a watch from Watcher.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-delete-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteWatchResponse deleteWatch(DeleteWatchRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteWatchRequest, DeleteWatchResponse, ErrorResponse> endpoint = (Endpoint<DeleteWatchRequest, DeleteWatchResponse, ErrorResponse>) DeleteWatchRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Removes a watch from Watcher.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteWatchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-delete-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteWatchResponse deleteWatch(Consumer<DeleteWatchRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		DeleteWatchRequest.Builder builder = new DeleteWatchRequest.Builder();
		fn.accept(builder);
		return deleteWatch(builder.build());
	}

	// ----- Endpoint: watcher.execute_watch

	/**
	 * Forces the execution of a stored watch.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-execute-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public ExecuteWatchResponse executeWatch(ExecuteWatchRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ExecuteWatchRequest, ExecuteWatchResponse, ErrorResponse> endpoint = (Endpoint<ExecuteWatchRequest, ExecuteWatchResponse, ErrorResponse>) ExecuteWatchRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Forces the execution of a stored watch.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExecuteWatchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-execute-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ExecuteWatchResponse executeWatch(Consumer<ExecuteWatchRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		ExecuteWatchRequest.Builder builder = new ExecuteWatchRequest.Builder();
		fn.accept(builder);
		return executeWatch(builder.build());
	}

	/**
	 * Forces the execution of a stored watch.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-execute-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public ExecuteWatchResponse executeWatch() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new ExecuteWatchRequest.Builder().build(), ExecuteWatchRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: watcher.get_watch

	/**
	 * Retrieves a watch by its ID.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-get-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetWatchResponse getWatch(GetWatchRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetWatchRequest, GetWatchResponse, ErrorResponse> endpoint = (Endpoint<GetWatchRequest, GetWatchResponse, ErrorResponse>) GetWatchRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves a watch by its ID.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetWatchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-get-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetWatchResponse getWatch(Consumer<GetWatchRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		GetWatchRequest.Builder builder = new GetWatchRequest.Builder();
		fn.accept(builder);
		return getWatch(builder.build());
	}

	// ----- Endpoint: watcher.put_watch

	/**
	 * Creates a new watch, or updates an existing one.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-put-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutWatchResponse putWatch(PutWatchRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PutWatchRequest, PutWatchResponse, ErrorResponse> endpoint = (Endpoint<PutWatchRequest, PutWatchResponse, ErrorResponse>) PutWatchRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates a new watch, or updates an existing one.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutWatchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-put-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutWatchResponse putWatch(Consumer<PutWatchRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		PutWatchRequest.Builder builder = new PutWatchRequest.Builder();
		fn.accept(builder);
		return putWatch(builder.build());
	}

	// ----- Endpoint: watcher.query_watches

	/**
	 * Retrieves stored watches.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-query-watches.html">Documentation
	 *      on elastic.co</a>
	 */

	public QueryWatchesResponse queryWatches(QueryWatchesRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<QueryWatchesRequest, QueryWatchesResponse, ErrorResponse> endpoint = (Endpoint<QueryWatchesRequest, QueryWatchesResponse, ErrorResponse>) QueryWatchesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves stored watches.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link QueryWatchesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-query-watches.html">Documentation
	 *      on elastic.co</a>
	 */

	public final QueryWatchesResponse queryWatches(Consumer<QueryWatchesRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		QueryWatchesRequest.Builder builder = new QueryWatchesRequest.Builder();
		fn.accept(builder);
		return queryWatches(builder.build());
	}

	/**
	 * Retrieves stored watches.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-query-watches.html">Documentation
	 *      on elastic.co</a>
	 */

	public QueryWatchesResponse queryWatches() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new QueryWatchesRequest.Builder().build(), QueryWatchesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: watcher.start

	/**
	 * Starts Watcher if it is not already running.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-start.html">Documentation
	 *      on elastic.co</a>
	 */
	public StartWatcherResponse start() throws IOException, ElasticsearchException {
		return this.transport.performRequest(StartWatcherRequest._INSTANCE, StartWatcherRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: watcher.stats

	/**
	 * Retrieves the current Watcher metrics.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public WatcherStatsResponse stats(WatcherStatsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<WatcherStatsRequest, WatcherStatsResponse, ErrorResponse> endpoint = (Endpoint<WatcherStatsRequest, WatcherStatsResponse, ErrorResponse>) WatcherStatsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves the current Watcher metrics.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link WatcherStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public final WatcherStatsResponse stats(Consumer<WatcherStatsRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		WatcherStatsRequest.Builder builder = new WatcherStatsRequest.Builder();
		fn.accept(builder);
		return stats(builder.build());
	}

	/**
	 * Retrieves the current Watcher metrics.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public WatcherStatsResponse stats() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new WatcherStatsRequest.Builder().build(), WatcherStatsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: watcher.stop

	/**
	 * Stops Watcher if it is running.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-stop.html">Documentation
	 *      on elastic.co</a>
	 */
	public StopWatcherResponse stop() throws IOException, ElasticsearchException {
		return this.transport.performRequest(StopWatcherRequest._INSTANCE, StopWatcherRequest._ENDPOINT,
				this.transportOptions);
	}

}
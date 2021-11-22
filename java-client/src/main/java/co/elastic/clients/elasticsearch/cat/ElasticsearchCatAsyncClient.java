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

package co.elastic.clients.elasticsearch.cat;

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
 * Client for the cat namespace.
 */
public class ElasticsearchCatAsyncClient extends ApiClient<ElasticsearchTransport, ElasticsearchCatAsyncClient> {

	public ElasticsearchCatAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchCatAsyncClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchCatAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchCatAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: cat.aliases

	/**
	 * Shows information about currently configured aliases to indices including
	 * filter and routing infos.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-alias.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<AliasesResponse> aliases(AliasesRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<AliasesRequest, AliasesResponse, ErrorResponse> endpoint = (Endpoint<AliasesRequest, AliasesResponse, ErrorResponse>) AliasesRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Shows information about currently configured aliases to indices including
	 * filter and routing infos.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link AliasesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-alias.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<AliasesResponse> aliases(Consumer<AliasesRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		AliasesRequest.Builder builder = new AliasesRequest.Builder();
		fn.accept(builder);
		return aliases(builder.build());
	}

	/**
	 * Shows information about currently configured aliases to indices including
	 * filter and routing infos.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-alias.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<AliasesResponse> aliases() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new AliasesRequest.Builder().build(), AliasesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.allocation

	/**
	 * Provides a snapshot of how many shards are allocated to each data node and
	 * how much disk space they are using.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-allocation.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<AllocationResponse> allocation(AllocationRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<AllocationRequest, AllocationResponse, ErrorResponse> endpoint = (Endpoint<AllocationRequest, AllocationResponse, ErrorResponse>) AllocationRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Provides a snapshot of how many shards are allocated to each data node and
	 * how much disk space they are using.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link AllocationRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-allocation.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<AllocationResponse> allocation(Consumer<AllocationRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		AllocationRequest.Builder builder = new AllocationRequest.Builder();
		fn.accept(builder);
		return allocation(builder.build());
	}

	/**
	 * Provides a snapshot of how many shards are allocated to each data node and
	 * how much disk space they are using.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-allocation.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<AllocationResponse> allocation() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new AllocationRequest.Builder().build(), AllocationRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.count

	/**
	 * Provides quick access to the document count of the entire cluster, or
	 * individual indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-count.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CountResponse> count(CountRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<CountRequest, CountResponse, ErrorResponse> endpoint = (Endpoint<CountRequest, CountResponse, ErrorResponse>) CountRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Provides quick access to the document count of the entire cluster, or
	 * individual indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CountRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-count.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CountResponse> count(Consumer<CountRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		CountRequest.Builder builder = new CountRequest.Builder();
		fn.accept(builder);
		return count(builder.build());
	}

	/**
	 * Provides quick access to the document count of the entire cluster, or
	 * individual indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-count.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CountResponse> count() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new CountRequest.Builder().build(), CountRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.fielddata

	/**
	 * Shows how much heap memory is currently being used by fielddata on every data
	 * node in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-fielddata.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<FielddataResponse> fielddata(FielddataRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<FielddataRequest, FielddataResponse, ErrorResponse> endpoint = (Endpoint<FielddataRequest, FielddataResponse, ErrorResponse>) FielddataRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Shows how much heap memory is currently being used by fielddata on every data
	 * node in the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FielddataRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-fielddata.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<FielddataResponse> fielddata(Consumer<FielddataRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		FielddataRequest.Builder builder = new FielddataRequest.Builder();
		fn.accept(builder);
		return fielddata(builder.build());
	}

	/**
	 * Shows how much heap memory is currently being used by fielddata on every data
	 * node in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-fielddata.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<FielddataResponse> fielddata() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new FielddataRequest.Builder().build(), FielddataRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.health

	/**
	 * Returns a concise representation of the cluster health.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-health.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<HealthResponse> health(HealthRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<HealthRequest, HealthResponse, ErrorResponse> endpoint = (Endpoint<HealthRequest, HealthResponse, ErrorResponse>) HealthRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns a concise representation of the cluster health.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link HealthRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-health.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<HealthResponse> health(Consumer<HealthRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		HealthRequest.Builder builder = new HealthRequest.Builder();
		fn.accept(builder);
		return health(builder.build());
	}

	/**
	 * Returns a concise representation of the cluster health.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-health.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<HealthResponse> health() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new HealthRequest.Builder().build(), HealthRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.help

	/**
	 * Returns help for the Cat APIs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<HelpResponse> help() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(HelpRequest._INSTANCE, HelpRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cat.indices

	/**
	 * Returns information about indices: number of primaries and replicas, document
	 * counts, disk size, ...
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<IndicesResponse> indices(IndicesRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<IndicesRequest, IndicesResponse, ErrorResponse> endpoint = (Endpoint<IndicesRequest, IndicesResponse, ErrorResponse>) IndicesRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about indices: number of primaries and replicas, document
	 * counts, disk size, ...
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link IndicesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<IndicesResponse> indices(Consumer<IndicesRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		IndicesRequest.Builder builder = new IndicesRequest.Builder();
		fn.accept(builder);
		return indices(builder.build());
	}

	/**
	 * Returns information about indices: number of primaries and replicas, document
	 * counts, disk size, ...
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<IndicesResponse> indices() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new IndicesRequest.Builder().build(), IndicesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.master

	/**
	 * Returns information about the master node.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-master.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<MasterResponse> master() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(MasterRequest._INSTANCE, MasterRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.ml_data_frame_analytics

	/**
	 * Gets configuration and usage information about data frame analytics jobs.
	 * 
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/cat-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MlDataFrameAnalyticsResponse> mlDataFrameAnalytics(MlDataFrameAnalyticsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<MlDataFrameAnalyticsRequest, MlDataFrameAnalyticsResponse, ErrorResponse> endpoint = (Endpoint<MlDataFrameAnalyticsRequest, MlDataFrameAnalyticsResponse, ErrorResponse>) MlDataFrameAnalyticsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Gets configuration and usage information about data frame analytics jobs.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MlDataFrameAnalyticsRequest}
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/cat-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<MlDataFrameAnalyticsResponse> mlDataFrameAnalytics(
			Consumer<MlDataFrameAnalyticsRequest.Builder> fn) throws IOException, ElasticsearchException {
		MlDataFrameAnalyticsRequest.Builder builder = new MlDataFrameAnalyticsRequest.Builder();
		fn.accept(builder);
		return mlDataFrameAnalytics(builder.build());
	}

	/**
	 * Gets configuration and usage information about data frame analytics jobs.
	 * 
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/cat-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MlDataFrameAnalyticsResponse> mlDataFrameAnalytics()
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new MlDataFrameAnalyticsRequest.Builder().build(),
				MlDataFrameAnalyticsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cat.ml_datafeeds

	/**
	 * Gets configuration and usage information about datafeeds.
	 * 
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/cat-datafeeds.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MlDatafeedsResponse> mlDatafeeds(MlDatafeedsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<MlDatafeedsRequest, MlDatafeedsResponse, ErrorResponse> endpoint = (Endpoint<MlDatafeedsRequest, MlDatafeedsResponse, ErrorResponse>) MlDatafeedsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Gets configuration and usage information about datafeeds.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MlDatafeedsRequest}
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/cat-datafeeds.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<MlDatafeedsResponse> mlDatafeeds(Consumer<MlDatafeedsRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		MlDatafeedsRequest.Builder builder = new MlDatafeedsRequest.Builder();
		fn.accept(builder);
		return mlDatafeeds(builder.build());
	}

	/**
	 * Gets configuration and usage information about datafeeds.
	 * 
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/cat-datafeeds.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MlDatafeedsResponse> mlDatafeeds() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new MlDatafeedsRequest.Builder().build(),
				MlDatafeedsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cat.ml_jobs

	/**
	 * Gets configuration and usage information about anomaly detection jobs.
	 * 
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/cat-anomaly-detectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MlJobsResponse> mlJobs(MlJobsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<MlJobsRequest, MlJobsResponse, ErrorResponse> endpoint = (Endpoint<MlJobsRequest, MlJobsResponse, ErrorResponse>) MlJobsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Gets configuration and usage information about anomaly detection jobs.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MlJobsRequest}
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/cat-anomaly-detectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<MlJobsResponse> mlJobs(Consumer<MlJobsRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		MlJobsRequest.Builder builder = new MlJobsRequest.Builder();
		fn.accept(builder);
		return mlJobs(builder.build());
	}

	/**
	 * Gets configuration and usage information about anomaly detection jobs.
	 * 
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/cat-anomaly-detectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MlJobsResponse> mlJobs() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new MlJobsRequest.Builder().build(), MlJobsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.ml_trained_models

	/**
	 * Gets configuration and usage information about inference trained models.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/cat-trained-model.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MlTrainedModelsResponse> mlTrainedModels(MlTrainedModelsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<MlTrainedModelsRequest, MlTrainedModelsResponse, ErrorResponse> endpoint = (Endpoint<MlTrainedModelsRequest, MlTrainedModelsResponse, ErrorResponse>) MlTrainedModelsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Gets configuration and usage information about inference trained models.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MlTrainedModelsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/cat-trained-model.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<MlTrainedModelsResponse> mlTrainedModels(Consumer<MlTrainedModelsRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		MlTrainedModelsRequest.Builder builder = new MlTrainedModelsRequest.Builder();
		fn.accept(builder);
		return mlTrainedModels(builder.build());
	}

	/**
	 * Gets configuration and usage information about inference trained models.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/cat-trained-model.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MlTrainedModelsResponse> mlTrainedModels() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new MlTrainedModelsRequest.Builder().build(),
				MlTrainedModelsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cat.nodeattrs

	/**
	 * Returns information about custom node attributes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-nodeattrs.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<NodeattrsResponse> nodeattrs() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(NodeattrsRequest._INSTANCE, NodeattrsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.nodes

	/**
	 * Returns basic statistics about performance of cluster nodes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-nodes.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<NodesResponse> nodes(NodesRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<NodesRequest, NodesResponse, ErrorResponse> endpoint = (Endpoint<NodesRequest, NodesResponse, ErrorResponse>) NodesRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns basic statistics about performance of cluster nodes.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link NodesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-nodes.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<NodesResponse> nodes(Consumer<NodesRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		NodesRequest.Builder builder = new NodesRequest.Builder();
		fn.accept(builder);
		return nodes(builder.build());
	}

	/**
	 * Returns basic statistics about performance of cluster nodes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-nodes.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<NodesResponse> nodes() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new NodesRequest.Builder().build(), NodesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.pending_tasks

	/**
	 * Returns a concise representation of the cluster pending tasks.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-pending-tasks.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<PendingTasksResponse> pendingTasks() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(PendingTasksRequest._INSTANCE, PendingTasksRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.plugins

	/**
	 * Returns information about installed plugins across nodes node.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-plugins.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<PluginsResponse> plugins() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(PluginsRequest._INSTANCE, PluginsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.recovery

	/**
	 * Returns information about index shard recoveries, both on-going completed.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-recovery.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RecoveryResponse> recovery(RecoveryRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<RecoveryRequest, RecoveryResponse, ErrorResponse> endpoint = (Endpoint<RecoveryRequest, RecoveryResponse, ErrorResponse>) RecoveryRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about index shard recoveries, both on-going completed.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RecoveryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-recovery.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<RecoveryResponse> recovery(Consumer<RecoveryRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		RecoveryRequest.Builder builder = new RecoveryRequest.Builder();
		fn.accept(builder);
		return recovery(builder.build());
	}

	/**
	 * Returns information about index shard recoveries, both on-going completed.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-recovery.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RecoveryResponse> recovery() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new RecoveryRequest.Builder().build(), RecoveryRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.repositories

	/**
	 * Returns information about snapshot repositories registered in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-repositories.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<RepositoriesResponse> repositories() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(RepositoriesRequest._INSTANCE, RepositoriesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.segments

	/**
	 * Provides low-level information about the segments in the shards of an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-segments.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SegmentsResponse> segments(SegmentsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<SegmentsRequest, SegmentsResponse, ErrorResponse> endpoint = (Endpoint<SegmentsRequest, SegmentsResponse, ErrorResponse>) SegmentsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Provides low-level information about the segments in the shards of an index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SegmentsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-segments.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SegmentsResponse> segments(Consumer<SegmentsRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		SegmentsRequest.Builder builder = new SegmentsRequest.Builder();
		fn.accept(builder);
		return segments(builder.build());
	}

	/**
	 * Provides low-level information about the segments in the shards of an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-segments.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SegmentsResponse> segments() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new SegmentsRequest.Builder().build(), SegmentsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.shards

	/**
	 * Provides a detailed view of shard allocation on nodes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-shards.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ShardsResponse> shards(ShardsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ShardsRequest, ShardsResponse, ErrorResponse> endpoint = (Endpoint<ShardsRequest, ShardsResponse, ErrorResponse>) ShardsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Provides a detailed view of shard allocation on nodes.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ShardsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-shards.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ShardsResponse> shards(Consumer<ShardsRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		ShardsRequest.Builder builder = new ShardsRequest.Builder();
		fn.accept(builder);
		return shards(builder.build());
	}

	/**
	 * Provides a detailed view of shard allocation on nodes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-shards.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ShardsResponse> shards() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new ShardsRequest.Builder().build(), ShardsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.snapshots

	/**
	 * Returns all snapshots in a specific repository.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SnapshotsResponse> snapshots(SnapshotsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<SnapshotsRequest, SnapshotsResponse, ErrorResponse> endpoint = (Endpoint<SnapshotsRequest, SnapshotsResponse, ErrorResponse>) SnapshotsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns all snapshots in a specific repository.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SnapshotsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SnapshotsResponse> snapshots(Consumer<SnapshotsRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		SnapshotsRequest.Builder builder = new SnapshotsRequest.Builder();
		fn.accept(builder);
		return snapshots(builder.build());
	}

	/**
	 * Returns all snapshots in a specific repository.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SnapshotsResponse> snapshots() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new SnapshotsRequest.Builder().build(), SnapshotsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.tasks

	/**
	 * Returns information about the tasks currently executing on one or more nodes
	 * in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<TasksResponse> tasks(TasksRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<TasksRequest, TasksResponse, ErrorResponse> endpoint = (Endpoint<TasksRequest, TasksResponse, ErrorResponse>) TasksRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about the tasks currently executing on one or more nodes
	 * in the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link TasksRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<TasksResponse> tasks(Consumer<TasksRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		TasksRequest.Builder builder = new TasksRequest.Builder();
		fn.accept(builder);
		return tasks(builder.build());
	}

	/**
	 * Returns information about the tasks currently executing on one or more nodes
	 * in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<TasksResponse> tasks() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new TasksRequest.Builder().build(), TasksRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.templates

	/**
	 * Returns information about existing templates.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<TemplatesResponse> templates(TemplatesRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<TemplatesRequest, TemplatesResponse, ErrorResponse> endpoint = (Endpoint<TemplatesRequest, TemplatesResponse, ErrorResponse>) TemplatesRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about existing templates.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link TemplatesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<TemplatesResponse> templates(Consumer<TemplatesRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		TemplatesRequest.Builder builder = new TemplatesRequest.Builder();
		fn.accept(builder);
		return templates(builder.build());
	}

	/**
	 * Returns information about existing templates.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<TemplatesResponse> templates() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new TemplatesRequest.Builder().build(), TemplatesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.thread_pool

	/**
	 * Returns cluster-wide thread pool statistics per node. By default the active,
	 * queue and rejected statistics are returned for all thread pools.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-thread-pool.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ThreadPoolResponse> threadPool(ThreadPoolRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ThreadPoolRequest, ThreadPoolResponse, ErrorResponse> endpoint = (Endpoint<ThreadPoolRequest, ThreadPoolResponse, ErrorResponse>) ThreadPoolRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns cluster-wide thread pool statistics per node. By default the active,
	 * queue and rejected statistics are returned for all thread pools.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ThreadPoolRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-thread-pool.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ThreadPoolResponse> threadPool(Consumer<ThreadPoolRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		ThreadPoolRequest.Builder builder = new ThreadPoolRequest.Builder();
		fn.accept(builder);
		return threadPool(builder.build());
	}

	/**
	 * Returns cluster-wide thread pool statistics per node. By default the active,
	 * queue and rejected statistics are returned for all thread pools.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-thread-pool.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ThreadPoolResponse> threadPool() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new ThreadPoolRequest.Builder().build(), ThreadPoolRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.transforms

	/**
	 * Gets configuration and usage information about transforms.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/cat-transforms.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<TransformsResponse> transforms(TransformsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<TransformsRequest, TransformsResponse, ErrorResponse> endpoint = (Endpoint<TransformsRequest, TransformsResponse, ErrorResponse>) TransformsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Gets configuration and usage information about transforms.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link TransformsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/cat-transforms.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<TransformsResponse> transforms(Consumer<TransformsRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		TransformsRequest.Builder builder = new TransformsRequest.Builder();
		fn.accept(builder);
		return transforms(builder.build());
	}

	/**
	 * Gets configuration and usage information about transforms.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/cat-transforms.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<TransformsResponse> transforms() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new TransformsRequest.Builder().build(), TransformsRequest._ENDPOINT,
				this.transportOptions);
	}

}
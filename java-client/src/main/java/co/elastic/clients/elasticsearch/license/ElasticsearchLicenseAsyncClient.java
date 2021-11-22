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

package co.elastic.clients.elasticsearch.license;

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
 * Client for the license namespace.
 */
public class ElasticsearchLicenseAsyncClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchLicenseAsyncClient> {

	public ElasticsearchLicenseAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchLicenseAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchLicenseAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchLicenseAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: license.delete

	/**
	 * Deletes licensing information for the cluster
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-license.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<DeleteLicenseResponse> delete() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(DeleteLicenseRequest._INSTANCE, DeleteLicenseRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: license.get

	/**
	 * Retrieves licensing information for the cluster
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-license.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetLicenseResponse> get(GetLicenseRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetLicenseRequest, GetLicenseResponse, ErrorResponse> endpoint = (Endpoint<GetLicenseRequest, GetLicenseResponse, ErrorResponse>) GetLicenseRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves licensing information for the cluster
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetLicenseRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-license.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetLicenseResponse> get(Consumer<GetLicenseRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		GetLicenseRequest.Builder builder = new GetLicenseRequest.Builder();
		fn.accept(builder);
		return get(builder.build());
	}

	/**
	 * Retrieves licensing information for the cluster
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-license.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetLicenseResponse> get() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new GetLicenseRequest.Builder().build(), GetLicenseRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: license.get_basic_status

	/**
	 * Retrieves information about the status of the basic license.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-basic-status.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<GetBasicStatusResponse> getBasicStatus() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(GetBasicStatusRequest._INSTANCE, GetBasicStatusRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: license.get_trial_status

	/**
	 * Retrieves information about the status of the trial license.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-trial-status.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<GetTrialStatusResponse> getTrialStatus() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(GetTrialStatusRequest._INSTANCE, GetTrialStatusRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: license.post

	/**
	 * Updates the license for the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/update-license.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PostResponse> post(PostRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PostRequest, PostResponse, ErrorResponse> endpoint = (Endpoint<PostRequest, PostResponse, ErrorResponse>) PostRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Updates the license for the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PostRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/update-license.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PostResponse> post(Consumer<PostRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		PostRequest.Builder builder = new PostRequest.Builder();
		fn.accept(builder);
		return post(builder.build());
	}

	/**
	 * Updates the license for the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/update-license.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PostResponse> post() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new PostRequest.Builder().build(), PostRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: license.post_start_basic

	/**
	 * Starts an indefinite basic license.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/start-basic.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PostStartBasicResponse> postStartBasic(PostStartBasicRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PostStartBasicRequest, PostStartBasicResponse, ErrorResponse> endpoint = (Endpoint<PostStartBasicRequest, PostStartBasicResponse, ErrorResponse>) PostStartBasicRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Starts an indefinite basic license.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PostStartBasicRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/start-basic.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PostStartBasicResponse> postStartBasic(Consumer<PostStartBasicRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		PostStartBasicRequest.Builder builder = new PostStartBasicRequest.Builder();
		fn.accept(builder);
		return postStartBasic(builder.build());
	}

	/**
	 * Starts an indefinite basic license.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/start-basic.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PostStartBasicResponse> postStartBasic() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new PostStartBasicRequest.Builder().build(),
				PostStartBasicRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: license.post_start_trial

	/**
	 * starts a limited time trial license.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/start-trial.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PostStartTrialResponse> postStartTrial(PostStartTrialRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PostStartTrialRequest, PostStartTrialResponse, ErrorResponse> endpoint = (Endpoint<PostStartTrialRequest, PostStartTrialResponse, ErrorResponse>) PostStartTrialRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * starts a limited time trial license.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PostStartTrialRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/start-trial.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PostStartTrialResponse> postStartTrial(Consumer<PostStartTrialRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		PostStartTrialRequest.Builder builder = new PostStartTrialRequest.Builder();
		fn.accept(builder);
		return postStartTrial(builder.build());
	}

	/**
	 * starts a limited time trial license.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/start-trial.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PostStartTrialResponse> postStartTrial() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new PostStartTrialRequest.Builder().build(),
				PostStartTrialRequest._ENDPOINT, this.transportOptions);
	}

}
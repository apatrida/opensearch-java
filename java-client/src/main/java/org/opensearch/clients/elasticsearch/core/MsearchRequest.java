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

package org.opensearch.clients.elasticsearch.core;

import org.opensearch.clients.elasticsearch._types.ErrorResponse;
import org.opensearch.clients.elasticsearch._types.ExpandWildcardOptions;
import org.opensearch.clients.elasticsearch._types.RequestBase;
import org.opensearch.clients.elasticsearch._types.SearchType;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.transport.Endpoint;
import org.opensearch.clients.transport.SimpleEndpoint;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: _global.msearch.Request
@JsonpDeserializable
public class MsearchRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean allowNoIndices;

	@Nullable
	private final Boolean ccsMinimizeRoundtrips;

	private final List<ExpandWildcardOptions> expandWildcards;

	@Nullable
	private final Boolean ignoreThrottled;

	@Nullable
	private final Boolean ignoreUnavailable;

	private final List<String> index;

	@Nullable
	private final Long maxConcurrentSearches;

	@Nullable
	private final Long maxConcurrentShardRequests;

	@Nullable
	private final Long preFilterShardSize;

	@Nullable
	private final SearchType searchType;

	private final List<JsonValue /* Union(_global.msearch.Body | _global.msearch.Header) */> searches;

	// ---------------------------------------------------------------------------------------------

	private MsearchRequest(Builder builder) {

		this.allowNoIndices = builder.allowNoIndices;
		this.ccsMinimizeRoundtrips = builder.ccsMinimizeRoundtrips;
		this.expandWildcards = ModelTypeHelper.unmodifiable(builder.expandWildcards);
		this.ignoreThrottled = builder.ignoreThrottled;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.index = ModelTypeHelper.unmodifiable(builder.index);
		this.maxConcurrentSearches = builder.maxConcurrentSearches;
		this.maxConcurrentShardRequests = builder.maxConcurrentShardRequests;
		this.preFilterShardSize = builder.preFilterShardSize;
		this.searchType = builder.searchType;
		this.searches = ModelTypeHelper.unmodifiableRequired(builder.searches, this, "searches");

	}

	public static MsearchRequest of(Function<Builder, ObjectBuilder<MsearchRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If false, the request returns an error if any wildcard expression, index
	 * alias, or _all value targets only missing or closed indices. This behavior
	 * applies even if the request targets other open indices. For example, a
	 * request targeting foo*,bar* returns an error if an index starts with foo but
	 * no index starts with bar.
	 * <p>
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public final Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * If true, network roundtrips between the coordinating node and remote clusters
	 * are minimized for cross-cluster search requests.
	 * <p>
	 * API name: {@code ccs_minimize_roundtrips}
	 */
	@Nullable
	public final Boolean ccsMinimizeRoundtrips() {
		return this.ccsMinimizeRoundtrips;
	}

	/**
	 * Type of index that wildcard expressions can match. If the request can target
	 * data streams, this argument determines whether wildcard expressions match
	 * hidden data streams.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	public final List<ExpandWildcardOptions> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * If true, concrete, expanded or aliased indices are ignored when frozen.
	 * <p>
	 * API name: {@code ignore_throttled}
	 */
	@Nullable
	public final Boolean ignoreThrottled() {
		return this.ignoreThrottled;
	}

	/**
	 * If true, missing or closed indices are not included in the response.
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public final Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * Comma-separated list of data streams, indices, and index aliases to search.
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * Maximum number of concurrent searches the multi search API can execute.
	 * <p>
	 * API name: {@code max_concurrent_searches}
	 */
	@Nullable
	public final Long maxConcurrentSearches() {
		return this.maxConcurrentSearches;
	}

	/**
	 * Maximum number of concurrent shard requests that each sub-search request
	 * executes per node.
	 * <p>
	 * API name: {@code max_concurrent_shard_requests}
	 */
	@Nullable
	public final Long maxConcurrentShardRequests() {
		return this.maxConcurrentShardRequests;
	}

	/**
	 * Defines a threshold that enforces a pre-filter roundtrip to prefilter search
	 * shards based on query rewriting if the number of shards the search request
	 * expands to exceeds the threshold. This filter roundtrip can limit the number
	 * of shards significantly if for instance a shard can not match any documents
	 * based on its rewrite method i.e., if date filters are mandatory to match but
	 * the shard bounds and the query are disjoint.
	 * <p>
	 * API name: {@code pre_filter_shard_size}
	 */
	@Nullable
	public final Long preFilterShardSize() {
		return this.preFilterShardSize;
	}

	/**
	 * Indicates whether global term and document frequencies should be used when
	 * scoring returned documents.
	 * <p>
	 * API name: {@code search_type}
	 */
	@Nullable
	public final SearchType searchType() {
		return this.searchType;
	}

	/**
	 * Required - Request body.
	 * <p>
	 * API name: {@code _value_body}
	 */
	public final List<JsonValue /* Union(_global.msearch.Body | _global.msearch.Header) */> searches() {
		return this.searches;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (JsonValue /* Union(_global.msearch.Body | _global.msearch.Header) */ item0 : this.searches) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MsearchRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<MsearchRequest> {
		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private Boolean ccsMinimizeRoundtrips;

		@Nullable
		private List<ExpandWildcardOptions> expandWildcards;

		@Nullable
		private Boolean ignoreThrottled;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private List<String> index;

		@Nullable
		private Long maxConcurrentSearches;

		@Nullable
		private Long maxConcurrentShardRequests;

		@Nullable
		private Long preFilterShardSize;

		@Nullable
		private SearchType searchType;

		private List<JsonValue /* Union(_global.msearch.Body | _global.msearch.Header) */> searches;

		/**
		 * If false, the request returns an error if any wildcard expression, index
		 * alias, or _all value targets only missing or closed indices. This behavior
		 * applies even if the request targets other open indices. For example, a
		 * request targeting foo*,bar* returns an error if an index starts with foo but
		 * no index starts with bar.
		 * <p>
		 * API name: {@code allow_no_indices}
		 */
		public final Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * If true, network roundtrips between the coordinating node and remote clusters
		 * are minimized for cross-cluster search requests.
		 * <p>
		 * API name: {@code ccs_minimize_roundtrips}
		 */
		public final Builder ccsMinimizeRoundtrips(@Nullable Boolean value) {
			this.ccsMinimizeRoundtrips = value;
			return this;
		}

		/**
		 * Type of index that wildcard expressions can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams.
		 * <p>
		 * API name: {@code expand_wildcards}
		 */
		public final Builder expandWildcards(@Nullable List<ExpandWildcardOptions> value) {
			this.expandWildcards = value;
			return this;
		}

		/**
		 * Type of index that wildcard expressions can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams.
		 * <p>
		 * API name: {@code expand_wildcards}
		 */
		public final Builder expandWildcards(ExpandWildcardOptions... value) {
			this.expandWildcards = Arrays.asList(value);
			return this;
		}

		/**
		 * If true, concrete, expanded or aliased indices are ignored when frozen.
		 * <p>
		 * API name: {@code ignore_throttled}
		 */
		public final Builder ignoreThrottled(@Nullable Boolean value) {
			this.ignoreThrottled = value;
			return this;
		}

		/**
		 * If true, missing or closed indices are not included in the response.
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public final Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * Comma-separated list of data streams, indices, and index aliases to search.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * Comma-separated list of data streams, indices, and index aliases to search.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Maximum number of concurrent searches the multi search API can execute.
		 * <p>
		 * API name: {@code max_concurrent_searches}
		 */
		public final Builder maxConcurrentSearches(@Nullable Long value) {
			this.maxConcurrentSearches = value;
			return this;
		}

		/**
		 * Maximum number of concurrent shard requests that each sub-search request
		 * executes per node.
		 * <p>
		 * API name: {@code max_concurrent_shard_requests}
		 */
		public final Builder maxConcurrentShardRequests(@Nullable Long value) {
			this.maxConcurrentShardRequests = value;
			return this;
		}

		/**
		 * Defines a threshold that enforces a pre-filter roundtrip to prefilter search
		 * shards based on query rewriting if the number of shards the search request
		 * expands to exceeds the threshold. This filter roundtrip can limit the number
		 * of shards significantly if for instance a shard can not match any documents
		 * based on its rewrite method i.e., if date filters are mandatory to match but
		 * the shard bounds and the query are disjoint.
		 * <p>
		 * API name: {@code pre_filter_shard_size}
		 */
		public final Builder preFilterShardSize(@Nullable Long value) {
			this.preFilterShardSize = value;
			return this;
		}

		/**
		 * Indicates whether global term and document frequencies should be used when
		 * scoring returned documents.
		 * <p>
		 * API name: {@code search_type}
		 */
		public final Builder searchType(@Nullable SearchType value) {
			this.searchType = value;
			return this;
		}

		/**
		 * Required - Request body.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public final Builder searches(
				List<JsonValue /* Union(_global.msearch.Body | _global.msearch.Header) */> value) {
			this.searches = value;
			return this;
		}

		/**
		 * Required - Request body.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public final Builder searches(JsonValue /* Union(_global.msearch.Body | _global.msearch.Header) */... value) {
			this.searches = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link MsearchRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MsearchRequest build() {
			_checkSingleUse();

			return new MsearchRequest(this);
		}
	}

	public static final JsonpDeserializer<MsearchRequest> _DESERIALIZER = createMsearchRequestDeserializer();
	protected static JsonpDeserializer<MsearchRequest> createMsearchRequestDeserializer() {

		JsonpDeserializer<List<JsonValue /* Union(_global.msearch.Body | _global.msearch.Header) */>> valueDeserializer = JsonpDeserializer
				.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer());

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.searches(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code msearch}".
	 */
	private static final SimpleEndpoint<MsearchRequest, Void> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (ModelTypeHelper.isDefined(request.index()))
					propsSet |= _index;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_msearch");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_msearch");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("typed_keys", "true");
				if (request.preFilterShardSize != null) {
					params.put("pre_filter_shard_size", String.valueOf(request.preFilterShardSize));
				}
				if (request.maxConcurrentShardRequests != null) {
					params.put("max_concurrent_shard_requests", String.valueOf(request.maxConcurrentShardRequests));
				}
				if (ModelTypeHelper.isDefined(request.expandWildcards)) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (request.allowNoIndices != null) {
					params.put("allow_no_indices", String.valueOf(request.allowNoIndices));
				}
				if (request.ignoreThrottled != null) {
					params.put("ignore_throttled", String.valueOf(request.ignoreThrottled));
				}
				if (request.maxConcurrentSearches != null) {
					params.put("max_concurrent_searches", String.valueOf(request.maxConcurrentSearches));
				}
				if (request.searchType != null) {
					params.put("search_type", request.searchType.jsonValue());
				}
				if (request.ccsMinimizeRoundtrips != null) {
					params.put("ccs_minimize_roundtrips", String.valueOf(request.ccsMinimizeRoundtrips));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, null);

	/**
	 * Create an "{@code msearch}" endpoint.
	 */
	public static <TDocument> Endpoint<MsearchRequest, MsearchResponse<TDocument>, ErrorResponse> createMsearchEndpoint(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ENDPOINT
				.withResponseDeserializer(MsearchResponse.createMsearchResponseDeserializer(tDocumentDeserializer));
	}
}
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
import org.opensearch.clients.elasticsearch._types.OpType;
import org.opensearch.clients.elasticsearch._types.RequestBase;
import org.opensearch.clients.elasticsearch._types.VersionType;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.JsonpSerializer;
import org.opensearch.clients.json.JsonpUtils;
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
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.index.Request

public class IndexRequest<TDocument> extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String id;

	@Nullable
	private final Long ifPrimaryTerm;

	@Nullable
	private final Long ifSeqNo;

	private final String index;

	@Nullable
	private final OpType opType;

	@Nullable
	private final String pipeline;

	@Nullable
	private final JsonValue /* _types.Refresh */ refresh;

	@Nullable
	private final Boolean requireAlias;

	@Nullable
	private final String routing;

	@Nullable
	private final String timeout;

	@Nullable
	private final Long version;

	@Nullable
	private final VersionType versionType;

	@Nullable
	private final JsonValue /* _types.WaitForActiveShards */ waitForActiveShards;

	private final TDocument document;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	private IndexRequest(Builder<TDocument> builder) {

		this.id = builder.id;
		this.ifPrimaryTerm = builder.ifPrimaryTerm;
		this.ifSeqNo = builder.ifSeqNo;
		this.index = ModelTypeHelper.requireNonNull(builder.index, this, "index");
		this.opType = builder.opType;
		this.pipeline = builder.pipeline;
		this.refresh = builder.refresh;
		this.requireAlias = builder.requireAlias;
		this.routing = builder.routing;
		this.timeout = builder.timeout;
		this.version = builder.version;
		this.versionType = builder.versionType;
		this.waitForActiveShards = builder.waitForActiveShards;
		this.document = ModelTypeHelper.requireNonNull(builder.document, this, "document");
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	public static <TDocument> IndexRequest<TDocument> of(
			Function<Builder<TDocument>, ObjectBuilder<IndexRequest<TDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * Document ID
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * only perform the index operation if the last operation that has changed the
	 * document has the specified primary term
	 * <p>
	 * API name: {@code if_primary_term}
	 */
	@Nullable
	public final Long ifPrimaryTerm() {
		return this.ifPrimaryTerm;
	}

	/**
	 * only perform the index operation if the last operation that has changed the
	 * document has the specified sequence number
	 * <p>
	 * API name: {@code if_seq_no}
	 */
	@Nullable
	public final Long ifSeqNo() {
		return this.ifSeqNo;
	}

	/**
	 * Required - The name of the index
	 * <p>
	 * API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Explicit operation type. Defaults to <code>index</code> for requests with an
	 * explicit document ID, and to <code>create</code>for requests without an
	 * explicit document ID
	 * <p>
	 * API name: {@code op_type}
	 */
	@Nullable
	public final OpType opType() {
		return this.opType;
	}

	/**
	 * The pipeline id to preprocess incoming documents with
	 * <p>
	 * API name: {@code pipeline}
	 */
	@Nullable
	public final String pipeline() {
		return this.pipeline;
	}

	/**
	 * If <code>true</code> then refresh the affected shards to make this operation
	 * visible to search, if <code>wait_for</code> then wait for a refresh to make
	 * this operation visible to search, if <code>false</code> (the default) then do
	 * nothing with refreshes.
	 * <p>
	 * API name: {@code refresh}
	 */
	@Nullable
	public final JsonValue /* _types.Refresh */ refresh() {
		return this.refresh;
	}

	/**
	 * When true, requires destination to be an alias. Default is false
	 * <p>
	 * API name: {@code require_alias}
	 */
	@Nullable
	public final Boolean requireAlias() {
		return this.requireAlias;
	}

	/**
	 * Specific routing value
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public final String routing() {
		return this.routing;
	}

	/**
	 * Explicit operation timeout
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final String timeout() {
		return this.timeout;
	}

	/**
	 * Explicit version number for concurrency control
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public final Long version() {
		return this.version;
	}

	/**
	 * Specific version type
	 * <p>
	 * API name: {@code version_type}
	 */
	@Nullable
	public final VersionType versionType() {
		return this.versionType;
	}

	/**
	 * Sets the number of shard copies that must be active before proceeding with
	 * the index operation. Defaults to 1, meaning the primary shard only. Set to
	 * <code>all</code> for all shard copies, otherwise set to any non-negative
	 * value less than or equal to the total number of copies for the shard (number
	 * of replicas + 1)
	 * <p>
	 * API name: {@code wait_for_active_shards}
	 */
	@Nullable
	public final JsonValue /* _types.WaitForActiveShards */ waitForActiveShards() {
		return this.waitForActiveShards;
	}

	/**
	 * Required - Request body.
	 * <p>
	 * API name: {@code _value_body}
	 */
	public final TDocument document() {
		return this.document;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		JsonpUtils.serialize(this.document, generator, tDocumentSerializer, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexRequest}.
	 */
	public static class Builder<TDocument> extends ObjectBuilderBase implements ObjectBuilder<IndexRequest<TDocument>> {
		@Nullable
		private String id;

		@Nullable
		private Long ifPrimaryTerm;

		@Nullable
		private Long ifSeqNo;

		private String index;

		@Nullable
		private OpType opType;

		@Nullable
		private String pipeline;

		@Nullable
		private JsonValue /* _types.Refresh */ refresh;

		@Nullable
		private Boolean requireAlias;

		@Nullable
		private String routing;

		@Nullable
		private String timeout;

		@Nullable
		private Long version;

		@Nullable
		private VersionType versionType;

		@Nullable
		private JsonValue /* _types.WaitForActiveShards */ waitForActiveShards;

		private TDocument document;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * Document ID
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder<TDocument> id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * only perform the index operation if the last operation that has changed the
		 * document has the specified primary term
		 * <p>
		 * API name: {@code if_primary_term}
		 */
		public final Builder<TDocument> ifPrimaryTerm(@Nullable Long value) {
			this.ifPrimaryTerm = value;
			return this;
		}

		/**
		 * only perform the index operation if the last operation that has changed the
		 * document has the specified sequence number
		 * <p>
		 * API name: {@code if_seq_no}
		 */
		public final Builder<TDocument> ifSeqNo(@Nullable Long value) {
			this.ifSeqNo = value;
			return this;
		}

		/**
		 * Required - The name of the index
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder<TDocument> index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Explicit operation type. Defaults to <code>index</code> for requests with an
		 * explicit document ID, and to <code>create</code>for requests without an
		 * explicit document ID
		 * <p>
		 * API name: {@code op_type}
		 */
		public final Builder<TDocument> opType(@Nullable OpType value) {
			this.opType = value;
			return this;
		}

		/**
		 * The pipeline id to preprocess incoming documents with
		 * <p>
		 * API name: {@code pipeline}
		 */
		public final Builder<TDocument> pipeline(@Nullable String value) {
			this.pipeline = value;
			return this;
		}

		/**
		 * If <code>true</code> then refresh the affected shards to make this operation
		 * visible to search, if <code>wait_for</code> then wait for a refresh to make
		 * this operation visible to search, if <code>false</code> (the default) then do
		 * nothing with refreshes.
		 * <p>
		 * API name: {@code refresh}
		 */
		public final Builder<TDocument> refresh(@Nullable JsonValue /* _types.Refresh */ value) {
			this.refresh = value;
			return this;
		}

		/**
		 * When true, requires destination to be an alias. Default is false
		 * <p>
		 * API name: {@code require_alias}
		 */
		public final Builder<TDocument> requireAlias(@Nullable Boolean value) {
			this.requireAlias = value;
			return this;
		}

		/**
		 * Specific routing value
		 * <p>
		 * API name: {@code routing}
		 */
		public final Builder<TDocument> routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * Explicit operation timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder<TDocument> timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Explicit version number for concurrency control
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder<TDocument> version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * Specific version type
		 * <p>
		 * API name: {@code version_type}
		 */
		public final Builder<TDocument> versionType(@Nullable VersionType value) {
			this.versionType = value;
			return this;
		}

		/**
		 * Sets the number of shard copies that must be active before proceeding with
		 * the index operation. Defaults to 1, meaning the primary shard only. Set to
		 * <code>all</code> for all shard copies, otherwise set to any non-negative
		 * value less than or equal to the total number of copies for the shard (number
		 * of replicas + 1)
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public final Builder<TDocument> waitForActiveShards(
				@Nullable JsonValue /* _types.WaitForActiveShards */ value) {
			this.waitForActiveShards = value;
			return this;
		}

		/**
		 * Required - Request body.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public final Builder<TDocument> document(TDocument value) {
			this.document = value;
			return this;
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public final Builder<TDocument> tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return this;
		}

		/**
		 * Builds a {@link IndexRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexRequest<TDocument> build() {
			_checkSingleUse();

			return new IndexRequest<TDocument>(this);
		}
	}

	public static <TDocument> JsonpDeserializer<IndexRequest<TDocument>> createIndexRequestDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {

		JsonpDeserializer<TDocument> valueDeserializer = tDocumentDeserializer;

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(),
				(parser, mapper, event) -> new Builder<TDocument>()
						.document(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code index}".
	 */
	public static final Endpoint<IndexRequest<?>, IndexResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				final int _index = 1 << 0;
				final int _id = 1 << 1;

				int propsSet = 0;

				propsSet |= _index;
				if (request.id() != null)
					propsSet |= _id;

				if (propsSet == (_index | _id))
					return "PUT";
				if (propsSet == (_index))
					return "POST";
				throw SimpleEndpoint.noPathTemplateFound("method");

			},

			// Request path
			request -> {
				final int _index = 1 << 0;
				final int _id = 1 << 1;

				int propsSet = 0;

				propsSet |= _index;
				if (request.id() != null)
					propsSet |= _id;

				if (propsSet == (_index | _id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/_doc");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/_doc");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.pipeline != null) {
					params.put("pipeline", request.pipeline);
				}
				if (request.routing != null) {
					params.put("routing", request.routing);
				}
				if (request.requireAlias != null) {
					params.put("require_alias", String.valueOf(request.requireAlias));
				}
				if (request.versionType != null) {
					params.put("version_type", request.versionType.jsonValue());
				}
				if (request.ifPrimaryTerm != null) {
					params.put("if_primary_term", String.valueOf(request.ifPrimaryTerm));
				}
				if (request.ifSeqNo != null) {
					params.put("if_seq_no", String.valueOf(request.ifSeqNo));
				}
				if (request.refresh != null) {
					params.put("refresh", JsonpUtils.toString(request.refresh));
				}
				if (request.waitForActiveShards != null) {
					params.put("wait_for_active_shards", JsonpUtils.toString(request.waitForActiveShards));
				}
				if (request.opType != null) {
					params.put("op_type", request.opType.jsonValue());
				}
				if (request.version != null) {
					params.put("version", String.valueOf(request.version));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, IndexResponse._DESERIALIZER);
}
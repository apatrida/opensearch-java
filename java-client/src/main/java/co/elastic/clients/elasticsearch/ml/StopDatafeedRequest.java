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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.stop_datafeed.Request
@JsonpDeserializable
public class StopDatafeedRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean allowNoDatafeeds;

	@Nullable
	private final Boolean allowNoMatch;

	private final String datafeedId;

	@Nullable
	private final Boolean force;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private StopDatafeedRequest(Builder builder) {

		this.allowNoDatafeeds = builder.allowNoDatafeeds;
		this.allowNoMatch = builder.allowNoMatch;
		this.datafeedId = ModelTypeHelper.requireNonNull(builder.datafeedId, this, "datafeedId");
		this.force = builder.force;
		this.timeout = builder.timeout;

	}

	public static StopDatafeedRequest of(Function<Builder, ObjectBuilder<StopDatafeedRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Whether to ignore if a wildcard expression matches no datafeeds. (This
	 * includes <code>_all</code> string or when no datafeeds have been specified)
	 * <p>
	 * API name: {@code allow_no_datafeeds}
	 */
	@Nullable
	public final Boolean allowNoDatafeeds() {
		return this.allowNoDatafeeds;
	}

	/**
	 * Whether to ignore if a wildcard expression matches no datafeeds. (This
	 * includes <code>_all</code> string or when no datafeeds have been specified)
	 * <p>
	 * API name: {@code allow_no_match}
	 */
	@Nullable
	public final Boolean allowNoMatch() {
		return this.allowNoMatch;
	}

	/**
	 * Required - The ID of the datafeed to stop
	 * <p>
	 * API name: {@code datafeed_id}
	 */
	public final String datafeedId() {
		return this.datafeedId;
	}

	/**
	 * API name: {@code force}
	 */
	@Nullable
	public final Boolean force() {
		return this.force;
	}

	/**
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.force != null) {
			generator.writeKey("force");
			generator.write(this.force);

		}
		if (this.timeout != null) {
			generator.writeKey("timeout");
			this.timeout.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StopDatafeedRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<StopDatafeedRequest> {
		@Nullable
		private Boolean allowNoDatafeeds;

		@Nullable
		private Boolean allowNoMatch;

		private String datafeedId;

		@Nullable
		private Boolean force;

		@Nullable
		private Time timeout;

		/**
		 * Whether to ignore if a wildcard expression matches no datafeeds. (This
		 * includes <code>_all</code> string or when no datafeeds have been specified)
		 * <p>
		 * API name: {@code allow_no_datafeeds}
		 */
		public final Builder allowNoDatafeeds(@Nullable Boolean value) {
			this.allowNoDatafeeds = value;
			return this;
		}

		/**
		 * Whether to ignore if a wildcard expression matches no datafeeds. (This
		 * includes <code>_all</code> string or when no datafeeds have been specified)
		 * <p>
		 * API name: {@code allow_no_match}
		 */
		public final Builder allowNoMatch(@Nullable Boolean value) {
			this.allowNoMatch = value;
			return this;
		}

		/**
		 * Required - The ID of the datafeed to stop
		 * <p>
		 * API name: {@code datafeed_id}
		 */
		public final Builder datafeedId(String value) {
			this.datafeedId = value;
			return this;
		}

		/**
		 * API name: {@code force}
		 */
		public final Builder force(@Nullable Boolean value) {
			this.force = value;
			return this;
		}

		/**
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Builds a {@link StopDatafeedRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StopDatafeedRequest build() {
			_checkSingleUse();

			return new StopDatafeedRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StopDatafeedRequest}
	 */
	public static final JsonpDeserializer<StopDatafeedRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, StopDatafeedRequest::setupStopDatafeedRequestDeserializer);

	protected static void setupStopDatafeedRequestDeserializer(ObjectDeserializer<StopDatafeedRequest.Builder> op) {

		op.add(Builder::force, JsonpDeserializer.booleanDeserializer(), "force");
		op.add(Builder::timeout, Time._DESERIALIZER, "timeout");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.stop_datafeed}".
	 */
	public static final Endpoint<StopDatafeedRequest, StopDatafeedResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.stop_datafeed",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _datafeedId = 1 << 0;

				int propsSet = 0;

				propsSet |= _datafeedId;

				if (propsSet == (_datafeedId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/datafeeds");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.datafeedId, buf);
					buf.append("/_stop");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.allowNoDatafeeds != null) {
					params.put("allow_no_datafeeds", String.valueOf(request.allowNoDatafeeds));
				}
				if (request.allowNoMatch != null) {
					params.put("allow_no_match", String.valueOf(request.allowNoMatch));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, StopDatafeedResponse._DESERIALIZER);
}

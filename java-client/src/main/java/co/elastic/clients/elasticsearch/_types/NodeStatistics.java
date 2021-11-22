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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ListBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.NodeStatistics
@JsonpDeserializable
public class NodeStatistics implements JsonpSerializable {
	private final List<ErrorCause> failures;

	private final int total;

	private final int successful;

	private final int failed;

	// ---------------------------------------------------------------------------------------------

	private NodeStatistics(Builder builder) {

		this.failures = ModelTypeHelper.unmodifiable(builder.failures);
		this.total = ModelTypeHelper.requireNonNull(builder.total, this, "total");
		this.successful = ModelTypeHelper.requireNonNull(builder.successful, this, "successful");
		this.failed = ModelTypeHelper.requireNonNull(builder.failed, this, "failed");

	}

	public static NodeStatistics of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * API name: {@code failures}
	 */
	public final List<ErrorCause> failures() {
		return this.failures;
	}

	/**
	 * Required - Total number of nodes selected by the request.
	 * <p>
	 * API name: {@code total}
	 */
	public final int total() {
		return this.total;
	}

	/**
	 * Required - Number of nodes that responded successfully to the request.
	 * <p>
	 * API name: {@code successful}
	 */
	public final int successful() {
		return this.successful;
	}

	/**
	 * Required - Number of nodes that rejected the request or failed to respond. If
	 * this value is not 0, a reason for the rejection or failure is included in the
	 * response.
	 * <p>
	 * API name: {@code failed}
	 */
	public final int failed() {
		return this.failed;
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

		if (ModelTypeHelper.isDefined(this.failures)) {
			generator.writeKey("failures");
			generator.writeStartArray();
			for (ErrorCause item0 : this.failures) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("total");
		generator.write(this.total);

		generator.writeKey("successful");
		generator.write(this.successful);

		generator.writeKey("failed");
		generator.write(this.failed);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeStatistics}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NodeStatistics> {
		@Nullable
		private List<ErrorCause> failures;

		private Integer total;

		private Integer successful;

		private Integer failed;

		/**
		 * API name: {@code failures}
		 */
		public final Builder failures(@Nullable List<ErrorCause> value) {
			this.failures = value;
			return this;
		}

		/**
		 * API name: {@code failures}
		 */
		public final Builder failures(ErrorCause... value) {
			this.failures = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code failures}
		 */
		public final Builder failures(
				Function<ListBuilder<ErrorCause, ErrorCause.Builder>, ObjectBuilder<List<ErrorCause>>> fn) {
			return failures(fn.apply(new ListBuilder<>(ErrorCause.Builder::new)).build());
		}

		/**
		 * Required - Total number of nodes selected by the request.
		 * <p>
		 * API name: {@code total}
		 */
		public final Builder total(int value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - Number of nodes that responded successfully to the request.
		 * <p>
		 * API name: {@code successful}
		 */
		public final Builder successful(int value) {
			this.successful = value;
			return this;
		}

		/**
		 * Required - Number of nodes that rejected the request or failed to respond. If
		 * this value is not 0, a reason for the rejection or failure is included in the
		 * response.
		 * <p>
		 * API name: {@code failed}
		 */
		public final Builder failed(int value) {
			this.failed = value;
			return this;
		}

		/**
		 * Builds a {@link NodeStatistics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeStatistics build() {
			_checkSingleUse();

			return new NodeStatistics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeStatistics}
	 */
	public static final JsonpDeserializer<NodeStatistics> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodeStatistics::setupNodeStatisticsDeserializer);

	protected static void setupNodeStatisticsDeserializer(ObjectDeserializer<NodeStatistics.Builder> op) {

		op.add(Builder::failures, JsonpDeserializer.arrayDeserializer(ErrorCause._DESERIALIZER), "failures");
		op.add(Builder::total, JsonpDeserializer.integerDeserializer(), "total");
		op.add(Builder::successful, JsonpDeserializer.integerDeserializer(), "successful");
		op.add(Builder::failed, JsonpDeserializer.integerDeserializer(), "failed");

	}

}
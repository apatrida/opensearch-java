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

package co.elastic.clients.elasticsearch.indices.recovery;

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: indices.recovery.RecoveryIndexStatus
@JsonpDeserializable
public class RecoveryIndexStatus implements JsonpSerializable {
	@Nullable
	private final RecoveryBytes bytes;

	private final RecoveryFiles files;

	private final RecoveryBytes size;

	@Nullable
	private final Time sourceThrottleTime;

	private final String sourceThrottleTimeInMillis;

	@Nullable
	private final Time targetThrottleTime;

	private final String targetThrottleTimeInMillis;

	private final String totalTimeInMillis;

	@Nullable
	private final Time totalTime;

	// ---------------------------------------------------------------------------------------------

	private RecoveryIndexStatus(Builder builder) {

		this.bytes = builder.bytes;
		this.files = ModelTypeHelper.requireNonNull(builder.files, this, "files");
		this.size = ModelTypeHelper.requireNonNull(builder.size, this, "size");
		this.sourceThrottleTime = builder.sourceThrottleTime;
		this.sourceThrottleTimeInMillis = ModelTypeHelper.requireNonNull(builder.sourceThrottleTimeInMillis, this,
				"sourceThrottleTimeInMillis");
		this.targetThrottleTime = builder.targetThrottleTime;
		this.targetThrottleTimeInMillis = ModelTypeHelper.requireNonNull(builder.targetThrottleTimeInMillis, this,
				"targetThrottleTimeInMillis");
		this.totalTimeInMillis = ModelTypeHelper.requireNonNull(builder.totalTimeInMillis, this, "totalTimeInMillis");
		this.totalTime = builder.totalTime;

	}

	public static RecoveryIndexStatus of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * API name: {@code bytes}
	 */
	@Nullable
	public final RecoveryBytes bytes() {
		return this.bytes;
	}

	/**
	 * Required - API name: {@code files}
	 */
	public final RecoveryFiles files() {
		return this.files;
	}

	/**
	 * Required - API name: {@code size}
	 */
	public final RecoveryBytes size() {
		return this.size;
	}

	/**
	 * API name: {@code source_throttle_time}
	 */
	@Nullable
	public final Time sourceThrottleTime() {
		return this.sourceThrottleTime;
	}

	/**
	 * Required - API name: {@code source_throttle_time_in_millis}
	 */
	public final String sourceThrottleTimeInMillis() {
		return this.sourceThrottleTimeInMillis;
	}

	/**
	 * API name: {@code target_throttle_time}
	 */
	@Nullable
	public final Time targetThrottleTime() {
		return this.targetThrottleTime;
	}

	/**
	 * Required - API name: {@code target_throttle_time_in_millis}
	 */
	public final String targetThrottleTimeInMillis() {
		return this.targetThrottleTimeInMillis;
	}

	/**
	 * Required - API name: {@code total_time_in_millis}
	 */
	public final String totalTimeInMillis() {
		return this.totalTimeInMillis;
	}

	/**
	 * API name: {@code total_time}
	 */
	@Nullable
	public final Time totalTime() {
		return this.totalTime;
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

		if (this.bytes != null) {
			generator.writeKey("bytes");
			this.bytes.serialize(generator, mapper);

		}
		generator.writeKey("files");
		this.files.serialize(generator, mapper);

		generator.writeKey("size");
		this.size.serialize(generator, mapper);

		if (this.sourceThrottleTime != null) {
			generator.writeKey("source_throttle_time");
			this.sourceThrottleTime.serialize(generator, mapper);

		}
		generator.writeKey("source_throttle_time_in_millis");
		generator.write(this.sourceThrottleTimeInMillis);

		if (this.targetThrottleTime != null) {
			generator.writeKey("target_throttle_time");
			this.targetThrottleTime.serialize(generator, mapper);

		}
		generator.writeKey("target_throttle_time_in_millis");
		generator.write(this.targetThrottleTimeInMillis);

		generator.writeKey("total_time_in_millis");
		generator.write(this.totalTimeInMillis);

		if (this.totalTime != null) {
			generator.writeKey("total_time");
			this.totalTime.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RecoveryIndexStatus}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RecoveryIndexStatus> {
		@Nullable
		private RecoveryBytes bytes;

		private RecoveryFiles files;

		private RecoveryBytes size;

		@Nullable
		private Time sourceThrottleTime;

		private String sourceThrottleTimeInMillis;

		@Nullable
		private Time targetThrottleTime;

		private String targetThrottleTimeInMillis;

		private String totalTimeInMillis;

		@Nullable
		private Time totalTime;

		/**
		 * API name: {@code bytes}
		 */
		public final Builder bytes(@Nullable RecoveryBytes value) {
			this.bytes = value;
			return this;
		}

		/**
		 * API name: {@code bytes}
		 */
		public final Builder bytes(Consumer<RecoveryBytes.Builder> fn) {
			RecoveryBytes.Builder builder = new RecoveryBytes.Builder();
			fn.accept(builder);
			return this.bytes(builder.build());
		}

		/**
		 * Required - API name: {@code files}
		 */
		public final Builder files(RecoveryFiles value) {
			this.files = value;
			return this;
		}

		/**
		 * Required - API name: {@code files}
		 */
		public final Builder files(Consumer<RecoveryFiles.Builder> fn) {
			RecoveryFiles.Builder builder = new RecoveryFiles.Builder();
			fn.accept(builder);
			return this.files(builder.build());
		}

		/**
		 * Required - API name: {@code size}
		 */
		public final Builder size(RecoveryBytes value) {
			this.size = value;
			return this;
		}

		/**
		 * Required - API name: {@code size}
		 */
		public final Builder size(Consumer<RecoveryBytes.Builder> fn) {
			RecoveryBytes.Builder builder = new RecoveryBytes.Builder();
			fn.accept(builder);
			return this.size(builder.build());
		}

		/**
		 * API name: {@code source_throttle_time}
		 */
		public final Builder sourceThrottleTime(@Nullable Time value) {
			this.sourceThrottleTime = value;
			return this;
		}

		/**
		 * API name: {@code source_throttle_time}
		 */
		public final Builder sourceThrottleTime(Consumer<Time.Builder> fn) {
			Time.Builder builder = new Time.Builder();
			fn.accept(builder);
			return this.sourceThrottleTime(builder.build());
		}

		/**
		 * Required - API name: {@code source_throttle_time_in_millis}
		 */
		public final Builder sourceThrottleTimeInMillis(String value) {
			this.sourceThrottleTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code target_throttle_time}
		 */
		public final Builder targetThrottleTime(@Nullable Time value) {
			this.targetThrottleTime = value;
			return this;
		}

		/**
		 * API name: {@code target_throttle_time}
		 */
		public final Builder targetThrottleTime(Consumer<Time.Builder> fn) {
			Time.Builder builder = new Time.Builder();
			fn.accept(builder);
			return this.targetThrottleTime(builder.build());
		}

		/**
		 * Required - API name: {@code target_throttle_time_in_millis}
		 */
		public final Builder targetThrottleTimeInMillis(String value) {
			this.targetThrottleTimeInMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_time_in_millis}
		 */
		public final Builder totalTimeInMillis(String value) {
			this.totalTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code total_time}
		 */
		public final Builder totalTime(@Nullable Time value) {
			this.totalTime = value;
			return this;
		}

		/**
		 * API name: {@code total_time}
		 */
		public final Builder totalTime(Consumer<Time.Builder> fn) {
			Time.Builder builder = new Time.Builder();
			fn.accept(builder);
			return this.totalTime(builder.build());
		}

		/**
		 * Builds a {@link RecoveryIndexStatus}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RecoveryIndexStatus build() {
			_checkSingleUse();

			return new RecoveryIndexStatus(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RecoveryIndexStatus}
	 */
	public static final JsonpDeserializer<RecoveryIndexStatus> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RecoveryIndexStatus::setupRecoveryIndexStatusDeserializer);

	protected static void setupRecoveryIndexStatusDeserializer(ObjectDeserializer<RecoveryIndexStatus.Builder> op) {

		op.add(Builder::bytes, RecoveryBytes._DESERIALIZER, "bytes");
		op.add(Builder::files, RecoveryFiles._DESERIALIZER, "files");
		op.add(Builder::size, RecoveryBytes._DESERIALIZER, "size");
		op.add(Builder::sourceThrottleTime, Time._DESERIALIZER, "source_throttle_time");
		op.add(Builder::sourceThrottleTimeInMillis, JsonpDeserializer.stringDeserializer(),
				"source_throttle_time_in_millis");
		op.add(Builder::targetThrottleTime, Time._DESERIALIZER, "target_throttle_time");
		op.add(Builder::targetThrottleTimeInMillis, JsonpDeserializer.stringDeserializer(),
				"target_throttle_time_in_millis");
		op.add(Builder::totalTimeInMillis, JsonpDeserializer.stringDeserializer(), "total_time_in_millis");
		op.add(Builder::totalTime, Time._DESERIALIZER, "total_time");

	}

}
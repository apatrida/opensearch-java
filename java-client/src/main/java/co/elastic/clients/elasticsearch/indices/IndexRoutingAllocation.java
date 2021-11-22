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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: indices._types.IndexRoutingAllocation
@JsonpDeserializable
public class IndexRoutingAllocation implements JsonpSerializable {
	@Nullable
	private final IndexRoutingAllocationOptions enable;

	@Nullable
	private final IndexRoutingAllocationInclude include;

	@Nullable
	private final IndexRoutingAllocationInitialRecovery initialRecovery;

	@Nullable
	private final IndexRoutingAllocationDisk disk;

	// ---------------------------------------------------------------------------------------------

	private IndexRoutingAllocation(Builder builder) {

		this.enable = builder.enable;
		this.include = builder.include;
		this.initialRecovery = builder.initialRecovery;
		this.disk = builder.disk;

	}

	public static IndexRoutingAllocation of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * API name: {@code enable}
	 */
	@Nullable
	public final IndexRoutingAllocationOptions enable() {
		return this.enable;
	}

	/**
	 * API name: {@code include}
	 */
	@Nullable
	public final IndexRoutingAllocationInclude include() {
		return this.include;
	}

	/**
	 * API name: {@code initial_recovery}
	 */
	@Nullable
	public final IndexRoutingAllocationInitialRecovery initialRecovery() {
		return this.initialRecovery;
	}

	/**
	 * API name: {@code disk}
	 */
	@Nullable
	public final IndexRoutingAllocationDisk disk() {
		return this.disk;
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

		if (this.enable != null) {
			generator.writeKey("enable");
			this.enable.serialize(generator, mapper);
		}
		if (this.include != null) {
			generator.writeKey("include");
			this.include.serialize(generator, mapper);

		}
		if (this.initialRecovery != null) {
			generator.writeKey("initial_recovery");
			this.initialRecovery.serialize(generator, mapper);

		}
		if (this.disk != null) {
			generator.writeKey("disk");
			this.disk.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexRoutingAllocation}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<IndexRoutingAllocation> {
		@Nullable
		private IndexRoutingAllocationOptions enable;

		@Nullable
		private IndexRoutingAllocationInclude include;

		@Nullable
		private IndexRoutingAllocationInitialRecovery initialRecovery;

		@Nullable
		private IndexRoutingAllocationDisk disk;

		/**
		 * API name: {@code enable}
		 */
		public final Builder enable(@Nullable IndexRoutingAllocationOptions value) {
			this.enable = value;
			return this;
		}

		/**
		 * API name: {@code include}
		 */
		public final Builder include(@Nullable IndexRoutingAllocationInclude value) {
			this.include = value;
			return this;
		}

		/**
		 * API name: {@code include}
		 */
		public final Builder include(Consumer<IndexRoutingAllocationInclude.Builder> fn) {
			IndexRoutingAllocationInclude.Builder builder = new IndexRoutingAllocationInclude.Builder();
			fn.accept(builder);
			return this.include(builder.build());
		}

		/**
		 * API name: {@code initial_recovery}
		 */
		public final Builder initialRecovery(@Nullable IndexRoutingAllocationInitialRecovery value) {
			this.initialRecovery = value;
			return this;
		}

		/**
		 * API name: {@code initial_recovery}
		 */
		public final Builder initialRecovery(Consumer<IndexRoutingAllocationInitialRecovery.Builder> fn) {
			IndexRoutingAllocationInitialRecovery.Builder builder = new IndexRoutingAllocationInitialRecovery.Builder();
			fn.accept(builder);
			return this.initialRecovery(builder.build());
		}

		/**
		 * API name: {@code disk}
		 */
		public final Builder disk(@Nullable IndexRoutingAllocationDisk value) {
			this.disk = value;
			return this;
		}

		/**
		 * API name: {@code disk}
		 */
		public final Builder disk(Consumer<IndexRoutingAllocationDisk.Builder> fn) {
			IndexRoutingAllocationDisk.Builder builder = new IndexRoutingAllocationDisk.Builder();
			fn.accept(builder);
			return this.disk(builder.build());
		}

		/**
		 * Builds a {@link IndexRoutingAllocation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexRoutingAllocation build() {
			_checkSingleUse();

			return new IndexRoutingAllocation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexRoutingAllocation}
	 */
	public static final JsonpDeserializer<IndexRoutingAllocation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndexRoutingAllocation::setupIndexRoutingAllocationDeserializer);

	protected static void setupIndexRoutingAllocationDeserializer(
			ObjectDeserializer<IndexRoutingAllocation.Builder> op) {

		op.add(Builder::enable, IndexRoutingAllocationOptions._DESERIALIZER, "enable");
		op.add(Builder::include, IndexRoutingAllocationInclude._DESERIALIZER, "include");
		op.add(Builder::initialRecovery, IndexRoutingAllocationInitialRecovery._DESERIALIZER, "initial_recovery");
		op.add(Builder::disk, IndexRoutingAllocationDisk._DESERIALIZER, "disk");

	}

}
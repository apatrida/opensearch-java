/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

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

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.client.opensearch._types;

import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.util.Objects;

// typedef: _types.FieldMemoryUsage
public final class FieldMemoryUsage implements ToJsonp {
	@Nullable
	private final JsonValue memorySize;

	private final Number memorySizeInBytes;

	// ---------------------------------------------------------------------------------------------

	protected FieldMemoryUsage(Builder builder) {

		this.memorySize = builder.memorySize;
		this.memorySizeInBytes = Objects.requireNonNull(builder.memorySizeInBytes, "memory_size_in_bytes");

	}

	/**
	 * API name: {@code memory_size}
	 */
	@Nullable
	public JsonValue memorySize() {
		return this.memorySize;
	}

	/**
	 * API name: {@code memory_size_in_bytes}
	 */
	public Number memorySizeInBytes() {
		return this.memorySizeInBytes;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.memorySize != null) {

			generator.writeKey("memory_size");
			generator.write(this.memorySize);

		}

		generator.writeKey("memory_size_in_bytes");
		generator.write(this.memorySizeInBytes.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldMemoryUsage}.
	 */
	public static class Builder implements ObjectBuilder<FieldMemoryUsage> {
		@Nullable
		private JsonValue memorySize;

		private Number memorySizeInBytes;

		/**
		 * API name: {@code memory_size}
		 */
		public Builder memorySize(@Nullable JsonValue value) {
			this.memorySize = value;
			return this;
		}

		/**
		 * API name: {@code memory_size_in_bytes}
		 */
		public Builder memorySizeInBytes(Number value) {
			this.memorySizeInBytes = value;
			return this;
		}

		/**
		 * Builds a {@link FieldMemoryUsage}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldMemoryUsage build() {

			return new FieldMemoryUsage(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for FieldMemoryUsage
	 */
	public static final JsonpDeserializer<FieldMemoryUsage> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, FieldMemoryUsage::setupFieldMemoryUsageDeserializer);

	protected static void setupFieldMemoryUsageDeserializer(DelegatingDeserializer<FieldMemoryUsage.Builder> op) {

		op.add(Builder::memorySize, JsonpDeserializer.jsonValueDeserializer(), "memory_size");
		op.add(Builder::memorySizeInBytes, JsonpDeserializer.numberDeserializer(), "memory_size_in_bytes");

	}

}

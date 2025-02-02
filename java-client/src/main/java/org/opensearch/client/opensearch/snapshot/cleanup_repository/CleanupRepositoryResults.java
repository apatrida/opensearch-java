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

package org.opensearch.client.opensearch.snapshot.cleanup_repository;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import java.util.Objects;

// typedef: snapshot.cleanup_repository.CleanupRepositoryResults
public final class CleanupRepositoryResults implements ToJsonp {
	private final Number deletedBlobs;

	private final Number deletedBytes;

	// ---------------------------------------------------------------------------------------------

	protected CleanupRepositoryResults(Builder builder) {

		this.deletedBlobs = Objects.requireNonNull(builder.deletedBlobs, "deleted_blobs");
		this.deletedBytes = Objects.requireNonNull(builder.deletedBytes, "deleted_bytes");

	}

	/**
	 * API name: {@code deleted_blobs}
	 */
	public Number deletedBlobs() {
		return this.deletedBlobs;
	}

	/**
	 * API name: {@code deleted_bytes}
	 */
	public Number deletedBytes() {
		return this.deletedBytes;
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

		generator.writeKey("deleted_blobs");
		generator.write(this.deletedBlobs.doubleValue());

		generator.writeKey("deleted_bytes");
		generator.write(this.deletedBytes.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CleanupRepositoryResults}.
	 */
	public static class Builder implements ObjectBuilder<CleanupRepositoryResults> {
		private Number deletedBlobs;

		private Number deletedBytes;

		/**
		 * API name: {@code deleted_blobs}
		 */
		public Builder deletedBlobs(Number value) {
			this.deletedBlobs = value;
			return this;
		}

		/**
		 * API name: {@code deleted_bytes}
		 */
		public Builder deletedBytes(Number value) {
			this.deletedBytes = value;
			return this;
		}

		/**
		 * Builds a {@link CleanupRepositoryResults}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CleanupRepositoryResults build() {

			return new CleanupRepositoryResults(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for CleanupRepositoryResults
	 */
	public static final JsonpDeserializer<CleanupRepositoryResults> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, CleanupRepositoryResults::setupCleanupRepositoryResultsDeserializer);

	protected static void setupCleanupRepositoryResultsDeserializer(
			DelegatingDeserializer<CleanupRepositoryResults.Builder> op) {

		op.add(Builder::deletedBlobs, JsonpDeserializer.numberDeserializer(), "deleted_blobs");
		op.add(Builder::deletedBytes, JsonpDeserializer.numberDeserializer(), "deleted_bytes");

	}

}

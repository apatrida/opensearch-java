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

package co.elastic.clients.elasticsearch.nodes.info;

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

// typedef: nodes.info.NodeInfoBootstrap
@JsonpDeserializable
public class NodeInfoBootstrap implements JsonpSerializable {
	private final String memoryLock;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoBootstrap(Builder builder) {

		this.memoryLock = ModelTypeHelper.requireNonNull(builder.memoryLock, this, "memoryLock");

	}

	public static NodeInfoBootstrap of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code memory_lock}
	 */
	public final String memoryLock() {
		return this.memoryLock;
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

		generator.writeKey("memory_lock");
		generator.write(this.memoryLock);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoBootstrap}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NodeInfoBootstrap> {
		private String memoryLock;

		/**
		 * Required - API name: {@code memory_lock}
		 */
		public final Builder memoryLock(String value) {
			this.memoryLock = value;
			return this;
		}

		/**
		 * Builds a {@link NodeInfoBootstrap}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoBootstrap build() {
			_checkSingleUse();

			return new NodeInfoBootstrap(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoBootstrap}
	 */
	public static final JsonpDeserializer<NodeInfoBootstrap> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodeInfoBootstrap::setupNodeInfoBootstrapDeserializer);

	protected static void setupNodeInfoBootstrapDeserializer(ObjectDeserializer<NodeInfoBootstrap.Builder> op) {

		op.add(Builder::memoryLock, JsonpDeserializer.stringDeserializer(), "memory_lock");

	}

}
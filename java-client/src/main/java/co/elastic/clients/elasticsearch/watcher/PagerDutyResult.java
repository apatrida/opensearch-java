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

package co.elastic.clients.elasticsearch.watcher;

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
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: watcher._types.PagerDutyResult
@JsonpDeserializable
public class PagerDutyResult implements JsonpSerializable {
	private final PagerDutyActionEventResult sentEvent;

	// ---------------------------------------------------------------------------------------------

	private PagerDutyResult(Builder builder) {

		this.sentEvent = ModelTypeHelper.requireNonNull(builder.sentEvent, this, "sentEvent");

	}

	public static PagerDutyResult of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code sent_event}
	 */
	public final PagerDutyActionEventResult sentEvent() {
		return this.sentEvent;
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

		generator.writeKey("sent_event");
		this.sentEvent.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PagerDutyResult}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PagerDutyResult> {
		private PagerDutyActionEventResult sentEvent;

		/**
		 * Required - API name: {@code sent_event}
		 */
		public final Builder sentEvent(PagerDutyActionEventResult value) {
			this.sentEvent = value;
			return this;
		}

		/**
		 * Required - API name: {@code sent_event}
		 */
		public final Builder sentEvent(Consumer<PagerDutyActionEventResult.Builder> fn) {
			PagerDutyActionEventResult.Builder builder = new PagerDutyActionEventResult.Builder();
			fn.accept(builder);
			return this.sentEvent(builder.build());
		}

		/**
		 * Builds a {@link PagerDutyResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PagerDutyResult build() {
			_checkSingleUse();

			return new PagerDutyResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PagerDutyResult}
	 */
	public static final JsonpDeserializer<PagerDutyResult> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PagerDutyResult::setupPagerDutyResultDeserializer);

	protected static void setupPagerDutyResultDeserializer(ObjectDeserializer<PagerDutyResult.Builder> op) {

		op.add(Builder::sentEvent, PagerDutyActionEventResult._DESERIALIZER, "sent_event");

	}

}
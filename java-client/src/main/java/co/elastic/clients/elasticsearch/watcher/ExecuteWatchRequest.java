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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonData;
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
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: watcher.execute_watch.Request
@JsonpDeserializable
public class ExecuteWatchRequest extends RequestBase implements JsonpSerializable {
	private final Map<String, ActionExecutionMode> actionModes;

	private final Map<String, JsonData> alternativeInput;

	@Nullable
	private final Boolean debug;

	@Nullable
	private final String id;

	@Nullable
	private final Boolean ignoreCondition;

	@Nullable
	private final Boolean recordExecution;

	@Nullable
	private final SimulatedActions simulatedActions;

	@Nullable
	private final ScheduleTriggerEvent triggerData;

	@Nullable
	private final Watch watch;

	// ---------------------------------------------------------------------------------------------

	private ExecuteWatchRequest(Builder builder) {

		this.actionModes = ModelTypeHelper.unmodifiable(builder.actionModes);
		this.alternativeInput = ModelTypeHelper.unmodifiable(builder.alternativeInput);
		this.debug = builder.debug;
		this.id = builder.id;
		this.ignoreCondition = builder.ignoreCondition;
		this.recordExecution = builder.recordExecution;
		this.simulatedActions = builder.simulatedActions;
		this.triggerData = builder.triggerData;
		this.watch = builder.watch;

	}

	public static ExecuteWatchRequest of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * API name: {@code action_modes}
	 */
	public final Map<String, ActionExecutionMode> actionModes() {
		return this.actionModes;
	}

	/**
	 * API name: {@code alternative_input}
	 */
	public final Map<String, JsonData> alternativeInput() {
		return this.alternativeInput;
	}

	/**
	 * indicates whether the watch should execute in debug mode
	 * <p>
	 * API name: {@code debug}
	 */
	@Nullable
	public final Boolean debug() {
		return this.debug;
	}

	/**
	 * Watch ID
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * API name: {@code ignore_condition}
	 */
	@Nullable
	public final Boolean ignoreCondition() {
		return this.ignoreCondition;
	}

	/**
	 * API name: {@code record_execution}
	 */
	@Nullable
	public final Boolean recordExecution() {
		return this.recordExecution;
	}

	/**
	 * API name: {@code simulated_actions}
	 */
	@Nullable
	public final SimulatedActions simulatedActions() {
		return this.simulatedActions;
	}

	/**
	 * API name: {@code trigger_data}
	 */
	@Nullable
	public final ScheduleTriggerEvent triggerData() {
		return this.triggerData;
	}

	/**
	 * API name: {@code watch}
	 */
	@Nullable
	public final Watch watch() {
		return this.watch;
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

		if (ModelTypeHelper.isDefined(this.actionModes)) {
			generator.writeKey("action_modes");
			generator.writeStartObject();
			for (Map.Entry<String, ActionExecutionMode> item0 : this.actionModes.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);
			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.alternativeInput)) {
			generator.writeKey("alternative_input");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.alternativeInput.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.ignoreCondition != null) {
			generator.writeKey("ignore_condition");
			generator.write(this.ignoreCondition);

		}
		if (this.recordExecution != null) {
			generator.writeKey("record_execution");
			generator.write(this.recordExecution);

		}
		if (this.simulatedActions != null) {
			generator.writeKey("simulated_actions");
			this.simulatedActions.serialize(generator, mapper);

		}
		if (this.triggerData != null) {
			generator.writeKey("trigger_data");
			this.triggerData.serialize(generator, mapper);

		}
		if (this.watch != null) {
			generator.writeKey("watch");
			this.watch.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecuteWatchRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ExecuteWatchRequest> {
		@Nullable
		private Map<String, ActionExecutionMode> actionModes;

		@Nullable
		private Map<String, JsonData> alternativeInput;

		@Nullable
		private Boolean debug;

		@Nullable
		private String id;

		@Nullable
		private Boolean ignoreCondition;

		@Nullable
		private Boolean recordExecution;

		@Nullable
		private SimulatedActions simulatedActions;

		@Nullable
		private ScheduleTriggerEvent triggerData;

		@Nullable
		private Watch watch;

		/**
		 * API name: {@code action_modes}
		 */
		public final Builder actionModes(@Nullable Map<String, ActionExecutionMode> value) {
			this.actionModes = value;
			return this;
		}

		/**
		 * API name: {@code alternative_input}
		 */
		public final Builder alternativeInput(@Nullable Map<String, JsonData> value) {
			this.alternativeInput = value;
			return this;
		}

		/**
		 * indicates whether the watch should execute in debug mode
		 * <p>
		 * API name: {@code debug}
		 */
		public final Builder debug(@Nullable Boolean value) {
			this.debug = value;
			return this;
		}

		/**
		 * Watch ID
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code ignore_condition}
		 */
		public final Builder ignoreCondition(@Nullable Boolean value) {
			this.ignoreCondition = value;
			return this;
		}

		/**
		 * API name: {@code record_execution}
		 */
		public final Builder recordExecution(@Nullable Boolean value) {
			this.recordExecution = value;
			return this;
		}

		/**
		 * API name: {@code simulated_actions}
		 */
		public final Builder simulatedActions(@Nullable SimulatedActions value) {
			this.simulatedActions = value;
			return this;
		}

		/**
		 * API name: {@code simulated_actions}
		 */
		public final Builder simulatedActions(Consumer<SimulatedActions.Builder> fn) {
			SimulatedActions.Builder builder = new SimulatedActions.Builder();
			fn.accept(builder);
			return this.simulatedActions(builder.build());
		}

		/**
		 * API name: {@code trigger_data}
		 */
		public final Builder triggerData(@Nullable ScheduleTriggerEvent value) {
			this.triggerData = value;
			return this;
		}

		/**
		 * API name: {@code trigger_data}
		 */
		public final Builder triggerData(Consumer<ScheduleTriggerEvent.Builder> fn) {
			ScheduleTriggerEvent.Builder builder = new ScheduleTriggerEvent.Builder();
			fn.accept(builder);
			return this.triggerData(builder.build());
		}

		/**
		 * API name: {@code watch}
		 */
		public final Builder watch(@Nullable Watch value) {
			this.watch = value;
			return this;
		}

		/**
		 * API name: {@code watch}
		 */
		public final Builder watch(Consumer<Watch.Builder> fn) {
			Watch.Builder builder = new Watch.Builder();
			fn.accept(builder);
			return this.watch(builder.build());
		}

		/**
		 * Builds a {@link ExecuteWatchRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExecuteWatchRequest build() {
			_checkSingleUse();

			return new ExecuteWatchRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExecuteWatchRequest}
	 */
	public static final JsonpDeserializer<ExecuteWatchRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ExecuteWatchRequest::setupExecuteWatchRequestDeserializer);

	protected static void setupExecuteWatchRequestDeserializer(ObjectDeserializer<ExecuteWatchRequest.Builder> op) {

		op.add(Builder::actionModes, JsonpDeserializer.stringMapDeserializer(ActionExecutionMode._DESERIALIZER),
				"action_modes");
		op.add(Builder::alternativeInput, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER),
				"alternative_input");
		op.add(Builder::ignoreCondition, JsonpDeserializer.booleanDeserializer(), "ignore_condition");
		op.add(Builder::recordExecution, JsonpDeserializer.booleanDeserializer(), "record_execution");
		op.add(Builder::simulatedActions, SimulatedActions._DESERIALIZER, "simulated_actions");
		op.add(Builder::triggerData, ScheduleTriggerEvent._DESERIALIZER, "trigger_data");
		op.add(Builder::watch, Watch._DESERIALIZER, "watch");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code watcher.execute_watch}".
	 */
	public static final Endpoint<ExecuteWatchRequest, ExecuteWatchResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				if (request.id() != null)
					propsSet |= _id;

				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_watcher");
					buf.append("/watch");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					buf.append("/_execute");
					return buf.toString();
				}
				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_watcher");
					buf.append("/watch");
					buf.append("/_execute");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.debug != null) {
					params.put("debug", String.valueOf(request.debug));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, ExecuteWatchResponse._DESERIALIZER);
}
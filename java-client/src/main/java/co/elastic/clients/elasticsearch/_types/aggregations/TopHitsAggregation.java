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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.elasticsearch._types.ScriptField;
import co.elastic.clients.elasticsearch.core.search.Highlight;
import co.elastic.clients.elasticsearch.core.search.SortOptions;
import co.elastic.clients.elasticsearch.core.search.SourceConfig;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ListBuilder;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.TopHitsAggregation
@JsonpDeserializable
public class TopHitsAggregation extends MetricAggregationBase implements AggregationVariant {
	private final List<String> docvalueFields;

	@Nullable
	private final Boolean explain;

	@Nullable
	private final Integer from;

	@Nullable
	private final Highlight highlight;

	private final Map<String, ScriptField> scriptFields;

	@Nullable
	private final Integer size;

	private final List<SortOptions> sort;

	@Nullable
	private final SourceConfig source;

	private final List<String> storedFields;

	@Nullable
	private final Boolean trackScores;

	@Nullable
	private final Boolean version;

	@Nullable
	private final Boolean seqNoPrimaryTerm;

	// ---------------------------------------------------------------------------------------------

	private TopHitsAggregation(Builder builder) {
		super(builder);

		this.docvalueFields = ModelTypeHelper.unmodifiable(builder.docvalueFields);
		this.explain = builder.explain;
		this.from = builder.from;
		this.highlight = builder.highlight;
		this.scriptFields = ModelTypeHelper.unmodifiable(builder.scriptFields);
		this.size = builder.size;
		this.sort = ModelTypeHelper.unmodifiable(builder.sort);
		this.source = builder.source;
		this.storedFields = ModelTypeHelper.unmodifiable(builder.storedFields);
		this.trackScores = builder.trackScores;
		this.version = builder.version;
		this.seqNoPrimaryTerm = builder.seqNoPrimaryTerm;

	}

	public static TopHitsAggregation of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.TopHits;
	}

	/**
	 * API name: {@code docvalue_fields}
	 */
	public final List<String> docvalueFields() {
		return this.docvalueFields;
	}

	/**
	 * API name: {@code explain}
	 */
	@Nullable
	public final Boolean explain() {
		return this.explain;
	}

	/**
	 * API name: {@code from}
	 */
	@Nullable
	public final Integer from() {
		return this.from;
	}

	/**
	 * API name: {@code highlight}
	 */
	@Nullable
	public final Highlight highlight() {
		return this.highlight;
	}

	/**
	 * API name: {@code script_fields}
	 */
	public final Map<String, ScriptField> scriptFields() {
		return this.scriptFields;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * API name: {@code sort}
	 */
	public final List<SortOptions> sort() {
		return this.sort;
	}

	/**
	 * API name: {@code _source}
	 */
	@Nullable
	public final SourceConfig source() {
		return this.source;
	}

	/**
	 * API name: {@code stored_fields}
	 */
	public final List<String> storedFields() {
		return this.storedFields;
	}

	/**
	 * API name: {@code track_scores}
	 */
	@Nullable
	public final Boolean trackScores() {
		return this.trackScores;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public final Boolean version() {
		return this.version;
	}

	/**
	 * API name: {@code seq_no_primary_term}
	 */
	@Nullable
	public final Boolean seqNoPrimaryTerm() {
		return this.seqNoPrimaryTerm;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ModelTypeHelper.isDefined(this.docvalueFields)) {
			generator.writeKey("docvalue_fields");
			generator.writeStartArray();
			for (String item0 : this.docvalueFields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.explain != null) {
			generator.writeKey("explain");
			generator.write(this.explain);

		}
		if (this.from != null) {
			generator.writeKey("from");
			generator.write(this.from);

		}
		if (this.highlight != null) {
			generator.writeKey("highlight");
			this.highlight.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.scriptFields)) {
			generator.writeKey("script_fields");
			generator.writeStartObject();
			for (Map.Entry<String, ScriptField> item0 : this.scriptFields.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}
		if (ModelTypeHelper.isDefined(this.sort)) {
			generator.writeKey("sort");
			generator.writeStartArray();
			for (SortOptions item0 : this.sort) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.source != null) {
			generator.writeKey("_source");
			this.source.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.storedFields)) {
			generator.writeKey("stored_fields");
			generator.writeStartArray();
			for (String item0 : this.storedFields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.trackScores != null) {
			generator.writeKey("track_scores");
			generator.write(this.trackScores);

		}
		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.seqNoPrimaryTerm != null) {
			generator.writeKey("seq_no_primary_term");
			generator.write(this.seqNoPrimaryTerm);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TopHitsAggregation}.
	 */
	public static class Builder extends MetricAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<TopHitsAggregation> {
		@Nullable
		private List<String> docvalueFields;

		@Nullable
		private Boolean explain;

		@Nullable
		private Integer from;

		@Nullable
		private Highlight highlight;

		@Nullable
		private Map<String, ScriptField> scriptFields;

		@Nullable
		private Integer size;

		@Nullable
		private List<SortOptions> sort;

		@Nullable
		private SourceConfig source;

		@Nullable
		private List<String> storedFields;

		@Nullable
		private Boolean trackScores;

		@Nullable
		private Boolean version;

		@Nullable
		private Boolean seqNoPrimaryTerm;

		/**
		 * API name: {@code docvalue_fields}
		 */
		public final Builder docvalueFields(@Nullable List<String> value) {
			this.docvalueFields = value;
			return this;
		}

		/**
		 * API name: {@code docvalue_fields}
		 */
		public final Builder docvalueFields(String... value) {
			this.docvalueFields = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code explain}
		 */
		public final Builder explain(@Nullable Boolean value) {
			this.explain = value;
			return this;
		}

		/**
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * API name: {@code highlight}
		 */
		public final Builder highlight(@Nullable Highlight value) {
			this.highlight = value;
			return this;
		}

		/**
		 * API name: {@code highlight}
		 */
		public final Builder highlight(Consumer<Highlight.Builder> fn) {
			Highlight.Builder builder = new Highlight.Builder();
			fn.accept(builder);
			return this.highlight(builder.build());
		}

		/**
		 * API name: {@code script_fields}
		 */
		public final Builder scriptFields(@Nullable Map<String, ScriptField> value) {
			this.scriptFields = value;
			return this;
		}

		public final Builder scriptFields(
				Function<MapBuilder<String, ScriptField, ScriptField.Builder>, ObjectBuilder<Map<String, ScriptField>>> fn) {
			return scriptFields(fn.apply(new MapBuilder<>(ScriptField.Builder::new)).build());
		}

		/**
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public final Builder sort(@Nullable List<SortOptions> value) {
			this.sort = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public final Builder sort(SortOptions... value) {
			this.sort = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public final Builder sort(
				Function<ListBuilder<SortOptions, SortOptions.Builder>, ObjectBuilder<List<SortOptions>>> fn) {
			return sort(fn.apply(new ListBuilder<>(SortOptions.Builder::new)).build());
		}

		/**
		 * API name: {@code _source}
		 */
		public final Builder source(@Nullable SourceConfig value) {
			this.source = value;
			return this;
		}

		/**
		 * API name: {@code _source}
		 */
		public final Builder source(Consumer<SourceConfig.Builder> fn) {
			SourceConfig.Builder builder = new SourceConfig.Builder();
			fn.accept(builder);
			return this.source(builder.build());
		}

		/**
		 * API name: {@code stored_fields}
		 */
		public final Builder storedFields(@Nullable List<String> value) {
			this.storedFields = value;
			return this;
		}

		/**
		 * API name: {@code stored_fields}
		 */
		public final Builder storedFields(String... value) {
			this.storedFields = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code track_scores}
		 */
		public final Builder trackScores(@Nullable Boolean value) {
			this.trackScores = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable Boolean value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code seq_no_primary_term}
		 */
		public final Builder seqNoPrimaryTerm(@Nullable Boolean value) {
			this.seqNoPrimaryTerm = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TopHitsAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TopHitsAggregation build() {
			_checkSingleUse();

			return new TopHitsAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TopHitsAggregation}
	 */
	public static final JsonpDeserializer<TopHitsAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TopHitsAggregation::setupTopHitsAggregationDeserializer);

	protected static void setupTopHitsAggregationDeserializer(ObjectDeserializer<TopHitsAggregation.Builder> op) {
		MetricAggregationBase.setupMetricAggregationBaseDeserializer(op);
		op.add(Builder::docvalueFields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"docvalue_fields");
		op.add(Builder::explain, JsonpDeserializer.booleanDeserializer(), "explain");
		op.add(Builder::from, JsonpDeserializer.integerDeserializer(), "from");
		op.add(Builder::highlight, Highlight._DESERIALIZER, "highlight");
		op.add(Builder::scriptFields, JsonpDeserializer.stringMapDeserializer(ScriptField._DESERIALIZER),
				"script_fields");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(SortOptions._DESERIALIZER), "sort");
		op.add(Builder::source, SourceConfig._DESERIALIZER, "_source");
		op.add(Builder::storedFields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stored_fields");
		op.add(Builder::trackScores, JsonpDeserializer.booleanDeserializer(), "track_scores");
		op.add(Builder::version, JsonpDeserializer.booleanDeserializer(), "version");
		op.add(Builder::seqNoPrimaryTerm, JsonpDeserializer.booleanDeserializer(), "seq_no_primary_term");

	}

}
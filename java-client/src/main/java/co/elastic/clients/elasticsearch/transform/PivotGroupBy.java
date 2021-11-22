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

package co.elastic.clients.elasticsearch.transform;

import co.elastic.clients.elasticsearch._types.aggregations.DateHistogramAggregation;
import co.elastic.clients.elasticsearch._types.aggregations.GeoTileGridAggregation;
import co.elastic.clients.elasticsearch._types.aggregations.HistogramAggregation;
import co.elastic.clients.elasticsearch._types.aggregations.TermsAggregation;
import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: transform._types.PivotGroupByContainer
// union type: Container[]
@JsonpDeserializable
public class PivotGroupBy implements TaggedUnion<PivotGroupBy.Kind, Object>, JsonpSerializable {

	/**
	 * {@link PivotGroupBy} variant kinds.
	 */

	public enum Kind implements JsonEnum {
		DateHistogram("date_histogram"),

		GeotileGrid("geotile_grid"),

		Histogram("histogram"),

		Terms("terms"),

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

	}

	private final Kind _kind;
	private final Object _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	public PivotGroupBy(PivotGroupByVariant value) {

		this._kind = ModelTypeHelper.requireNonNull(value._pivotGroupByKind(), this, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private PivotGroupBy(Builder builder) {

		this._kind = ModelTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static PivotGroupBy of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Is this variant instance of kind {@code date_histogram}?
	 */
	public boolean isDateHistogram() {
		return _kind == Kind.DateHistogram;
	}

	/**
	 * Get the {@code date_histogram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code date_histogram} kind.
	 */
	public DateHistogramAggregation dateHistogram() {
		return TaggedUnionUtils.get(this, Kind.DateHistogram);
	}

	/**
	 * Is this variant instance of kind {@code geotile_grid}?
	 */
	public boolean isGeotileGrid() {
		return _kind == Kind.GeotileGrid;
	}

	/**
	 * Get the {@code geotile_grid} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geotile_grid} kind.
	 */
	public GeoTileGridAggregation geotileGrid() {
		return TaggedUnionUtils.get(this, Kind.GeotileGrid);
	}

	/**
	 * Is this variant instance of kind {@code histogram}?
	 */
	public boolean isHistogram() {
		return _kind == Kind.Histogram;
	}

	/**
	 * Get the {@code histogram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code histogram} kind.
	 */
	public HistogramAggregation histogram() {
		return TaggedUnionUtils.get(this, Kind.Histogram);
	}

	/**
	 * Is this variant instance of kind {@code terms}?
	 */
	public boolean isTerms() {
		return _kind == Kind.Terms;
	}

	/**
	 * Get the {@code terms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code terms} kind.
	 */
	public TermsAggregation terms() {
		return TaggedUnionUtils.get(this, Kind.Terms);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		generator.writeKey(_kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PivotGroupBy> {
		private Kind _kind;
		private Object _value;

		public Builder dateHistogram(DateHistogramAggregation v) {
			this._kind = Kind.DateHistogram;
			this._value = v;
			return this;
		}

		public Builder dateHistogram(Consumer<DateHistogramAggregation.Builder> fn) {
			DateHistogramAggregation.Builder builder = new DateHistogramAggregation.Builder();
			fn.accept(builder);
			return this.dateHistogram(builder.build());
		}

		public Builder geotileGrid(GeoTileGridAggregation v) {
			this._kind = Kind.GeotileGrid;
			this._value = v;
			return this;
		}

		public Builder geotileGrid(Consumer<GeoTileGridAggregation.Builder> fn) {
			GeoTileGridAggregation.Builder builder = new GeoTileGridAggregation.Builder();
			fn.accept(builder);
			return this.geotileGrid(builder.build());
		}

		public Builder histogram(HistogramAggregation v) {
			this._kind = Kind.Histogram;
			this._value = v;
			return this;
		}

		public Builder histogram(Consumer<HistogramAggregation.Builder> fn) {
			HistogramAggregation.Builder builder = new HistogramAggregation.Builder();
			fn.accept(builder);
			return this.histogram(builder.build());
		}

		public Builder terms(TermsAggregation v) {
			this._kind = Kind.Terms;
			this._value = v;
			return this;
		}

		public Builder terms(Consumer<TermsAggregation.Builder> fn) {
			TermsAggregation.Builder builder = new TermsAggregation.Builder();
			fn.accept(builder);
			return this.terms(builder.build());
		}

		public PivotGroupBy build() {
			_checkSingleUse();
			return new PivotGroupBy(this);
		}

	}

	protected static void setupPivotGroupByDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::dateHistogram, DateHistogramAggregation._DESERIALIZER, "date_histogram");
		op.add(Builder::geotileGrid, GeoTileGridAggregation._DESERIALIZER, "geotile_grid");
		op.add(Builder::histogram, HistogramAggregation._DESERIALIZER, "histogram");
		op.add(Builder::terms, TermsAggregation._DESERIALIZER, "terms");

	}

	public static final JsonpDeserializer<PivotGroupBy> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PivotGroupBy::setupPivotGroupByDeserializer, Builder::build);
}
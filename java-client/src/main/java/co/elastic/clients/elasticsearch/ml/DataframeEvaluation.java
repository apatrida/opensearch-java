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

package co.elastic.clients.elasticsearch.ml;

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

// typedef: ml._types.DataframeEvaluationContainer
// union type: Container[]
@JsonpDeserializable
public class DataframeEvaluation implements TaggedUnion<DataframeEvaluation.Kind, Object>, JsonpSerializable {

	/**
	 * {@link DataframeEvaluation} variant kinds.
	 */

	public enum Kind implements JsonEnum {
		Classification("classification"),

		OutlierDetection("outlier_detection"),

		Regression("regression"),

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

	public DataframeEvaluation(DataframeEvaluationVariant value) {

		this._kind = ModelTypeHelper.requireNonNull(value._dataframeEvaluationKind(), this, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private DataframeEvaluation(Builder builder) {

		this._kind = ModelTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static DataframeEvaluation of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Is this variant instance of kind {@code classification}?
	 */
	public boolean isClassification() {
		return _kind == Kind.Classification;
	}

	/**
	 * Get the {@code classification} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code classification} kind.
	 */
	public DataframeEvaluationClassification classification() {
		return TaggedUnionUtils.get(this, Kind.Classification);
	}

	/**
	 * Is this variant instance of kind {@code outlier_detection}?
	 */
	public boolean isOutlierDetection() {
		return _kind == Kind.OutlierDetection;
	}

	/**
	 * Get the {@code outlier_detection} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code outlier_detection}
	 *             kind.
	 */
	public DataframeEvaluationOutlierDetection outlierDetection() {
		return TaggedUnionUtils.get(this, Kind.OutlierDetection);
	}

	/**
	 * Is this variant instance of kind {@code regression}?
	 */
	public boolean isRegression() {
		return _kind == Kind.Regression;
	}

	/**
	 * Get the {@code regression} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code regression} kind.
	 */
	public DataframeEvaluationRegression regression() {
		return TaggedUnionUtils.get(this, Kind.Regression);
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

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DataframeEvaluation> {
		private Kind _kind;
		private Object _value;

		public Builder classification(DataframeEvaluationClassification v) {
			this._kind = Kind.Classification;
			this._value = v;
			return this;
		}

		public Builder classification(Consumer<DataframeEvaluationClassification.Builder> fn) {
			DataframeEvaluationClassification.Builder builder = new DataframeEvaluationClassification.Builder();
			fn.accept(builder);
			return this.classification(builder.build());
		}

		public Builder outlierDetection(DataframeEvaluationOutlierDetection v) {
			this._kind = Kind.OutlierDetection;
			this._value = v;
			return this;
		}

		public Builder outlierDetection(Consumer<DataframeEvaluationOutlierDetection.Builder> fn) {
			DataframeEvaluationOutlierDetection.Builder builder = new DataframeEvaluationOutlierDetection.Builder();
			fn.accept(builder);
			return this.outlierDetection(builder.build());
		}

		public Builder regression(DataframeEvaluationRegression v) {
			this._kind = Kind.Regression;
			this._value = v;
			return this;
		}

		public Builder regression(Consumer<DataframeEvaluationRegression.Builder> fn) {
			DataframeEvaluationRegression.Builder builder = new DataframeEvaluationRegression.Builder();
			fn.accept(builder);
			return this.regression(builder.build());
		}

		public DataframeEvaluation build() {
			_checkSingleUse();
			return new DataframeEvaluation(this);
		}

	}

	protected static void setupDataframeEvaluationDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::classification, DataframeEvaluationClassification._DESERIALIZER, "classification");
		op.add(Builder::outlierDetection, DataframeEvaluationOutlierDetection._DESERIALIZER, "outlier_detection");
		op.add(Builder::regression, DataframeEvaluationRegression._DESERIALIZER, "regression");

	}

	public static final JsonpDeserializer<DataframeEvaluation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataframeEvaluation::setupDataframeEvaluationDeserializer, Builder::build);
}
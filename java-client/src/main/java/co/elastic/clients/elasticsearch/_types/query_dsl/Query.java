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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.elasticsearch._types.aggregations.Aggregation;
import co.elastic.clients.elasticsearch._types.aggregations.AggregationVariant;
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

// typedef: _types.query_dsl.QueryContainer
// union type: Container[]
@JsonpDeserializable
public class Query implements TaggedUnion<Query.Kind, Object>, AggregationVariant, JsonpSerializable {

	/**
	 * {@link Query} variant kinds.
	 */

	public enum Kind implements JsonEnum {
		Bool("bool"),

		Boosting("boosting"),

		Common("common"),

		CombinedFields("combined_fields"),

		ConstantScore("constant_score"),

		DisMax("dis_max"),

		DistanceFeature("distance_feature"),

		Exists("exists"),

		FunctionScore("function_score"),

		Fuzzy("fuzzy"),

		GeoBoundingBox("geo_bounding_box"),

		GeoDistance("geo_distance"),

		GeoPolygon("geo_polygon"),

		GeoShape("geo_shape"),

		HasChild("has_child"),

		HasParent("has_parent"),

		Ids("ids"),

		Intervals("intervals"),

		Match("match"),

		MatchAll("match_all"),

		MatchBoolPrefix("match_bool_prefix"),

		MatchNone("match_none"),

		MatchPhrase("match_phrase"),

		MatchPhrasePrefix("match_phrase_prefix"),

		MoreLikeThis("more_like_this"),

		MultiMatch("multi_match"),

		Nested("nested"),

		ParentId("parent_id"),

		Percolate("percolate"),

		Pinned("pinned"),

		Prefix("prefix"),

		QueryString("query_string"),

		Range("range"),

		RankFeature("rank_feature"),

		Regexp("regexp"),

		Script("script"),

		ScriptScore("script_score"),

		Shape("shape"),

		SimpleQueryString("simple_query_string"),

		SpanContaining("span_containing"),

		FieldMaskingSpan("field_masking_span"),

		SpanFirst("span_first"),

		SpanMulti("span_multi"),

		SpanNear("span_near"),

		SpanNot("span_not"),

		SpanOr("span_or"),

		SpanTerm("span_term"),

		SpanWithin("span_within"),

		Term("term"),

		Terms("terms"),

		TermsSet("terms_set"),

		Wildcard("wildcard"),

		Type("type"),

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.Filter;
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

	public Query(QueryVariant value) {

		this._kind = ModelTypeHelper.requireNonNull(value._queryKind(), this, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private Query(Builder builder) {

		this._kind = ModelTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Query of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Is this variant instance of kind {@code bool}?
	 */
	public boolean isBool() {
		return _kind == Kind.Bool;
	}

	/**
	 * Get the {@code bool} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code bool} kind.
	 */
	public BoolQuery bool() {
		return TaggedUnionUtils.get(this, Kind.Bool);
	}

	/**
	 * Is this variant instance of kind {@code boosting}?
	 */
	public boolean isBoosting() {
		return _kind == Kind.Boosting;
	}

	/**
	 * Get the {@code boosting} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code boosting} kind.
	 */
	public BoostingQuery boosting() {
		return TaggedUnionUtils.get(this, Kind.Boosting);
	}

	/**
	 * Is this variant instance of kind {@code common}?
	 */
	public boolean isCommon() {
		return _kind == Kind.Common;
	}

	/**
	 * Get the {@code common} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code common} kind.
	 */
	public CommonTermsQuery common() {
		return TaggedUnionUtils.get(this, Kind.Common);
	}

	/**
	 * Is this variant instance of kind {@code combined_fields}?
	 */
	public boolean isCombinedFields() {
		return _kind == Kind.CombinedFields;
	}

	/**
	 * Get the {@code combined_fields} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code combined_fields}
	 *             kind.
	 */
	public CombinedFieldsQuery combinedFields() {
		return TaggedUnionUtils.get(this, Kind.CombinedFields);
	}

	/**
	 * Is this variant instance of kind {@code constant_score}?
	 */
	public boolean isConstantScore() {
		return _kind == Kind.ConstantScore;
	}

	/**
	 * Get the {@code constant_score} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code constant_score} kind.
	 */
	public ConstantScoreQuery constantScore() {
		return TaggedUnionUtils.get(this, Kind.ConstantScore);
	}

	/**
	 * Is this variant instance of kind {@code dis_max}?
	 */
	public boolean isDisMax() {
		return _kind == Kind.DisMax;
	}

	/**
	 * Get the {@code dis_max} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code dis_max} kind.
	 */
	public DisMaxQuery disMax() {
		return TaggedUnionUtils.get(this, Kind.DisMax);
	}

	/**
	 * Is this variant instance of kind {@code distance_feature}?
	 */
	public boolean isDistanceFeature() {
		return _kind == Kind.DistanceFeature;
	}

	/**
	 * Get the {@code distance_feature} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code distance_feature}
	 *             kind.
	 */
	public DistanceFeatureQuery distanceFeature() {
		return TaggedUnionUtils.get(this, Kind.DistanceFeature);
	}

	/**
	 * Is this variant instance of kind {@code exists}?
	 */
	public boolean isExists() {
		return _kind == Kind.Exists;
	}

	/**
	 * Get the {@code exists} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code exists} kind.
	 */
	public ExistsQuery exists() {
		return TaggedUnionUtils.get(this, Kind.Exists);
	}

	/**
	 * Is this variant instance of kind {@code function_score}?
	 */
	public boolean isFunctionScore() {
		return _kind == Kind.FunctionScore;
	}

	/**
	 * Get the {@code function_score} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code function_score} kind.
	 */
	public FunctionScoreQuery functionScore() {
		return TaggedUnionUtils.get(this, Kind.FunctionScore);
	}

	/**
	 * Is this variant instance of kind {@code fuzzy}?
	 */
	public boolean isFuzzy() {
		return _kind == Kind.Fuzzy;
	}

	/**
	 * Get the {@code fuzzy} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code fuzzy} kind.
	 */
	public FuzzyQuery fuzzy() {
		return TaggedUnionUtils.get(this, Kind.Fuzzy);
	}

	/**
	 * Is this variant instance of kind {@code geo_bounding_box}?
	 */
	public boolean isGeoBoundingBox() {
		return _kind == Kind.GeoBoundingBox;
	}

	/**
	 * Get the {@code geo_bounding_box} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_bounding_box}
	 *             kind.
	 */
	public GeoBoundingBoxQuery geoBoundingBox() {
		return TaggedUnionUtils.get(this, Kind.GeoBoundingBox);
	}

	/**
	 * Is this variant instance of kind {@code geo_distance}?
	 */
	public boolean isGeoDistance() {
		return _kind == Kind.GeoDistance;
	}

	/**
	 * Get the {@code geo_distance} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_distance} kind.
	 */
	public GeoDistanceQuery geoDistance() {
		return TaggedUnionUtils.get(this, Kind.GeoDistance);
	}

	/**
	 * Is this variant instance of kind {@code geo_polygon}?
	 */
	public boolean isGeoPolygon() {
		return _kind == Kind.GeoPolygon;
	}

	/**
	 * Get the {@code geo_polygon} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_polygon} kind.
	 */
	public GeoPolygonQuery geoPolygon() {
		return TaggedUnionUtils.get(this, Kind.GeoPolygon);
	}

	/**
	 * Is this variant instance of kind {@code geo_shape}?
	 */
	public boolean isGeoShape() {
		return _kind == Kind.GeoShape;
	}

	/**
	 * Get the {@code geo_shape} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_shape} kind.
	 */
	public GeoShapeQuery geoShape() {
		return TaggedUnionUtils.get(this, Kind.GeoShape);
	}

	/**
	 * Is this variant instance of kind {@code has_child}?
	 */
	public boolean isHasChild() {
		return _kind == Kind.HasChild;
	}

	/**
	 * Get the {@code has_child} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code has_child} kind.
	 */
	public HasChildQuery hasChild() {
		return TaggedUnionUtils.get(this, Kind.HasChild);
	}

	/**
	 * Is this variant instance of kind {@code has_parent}?
	 */
	public boolean isHasParent() {
		return _kind == Kind.HasParent;
	}

	/**
	 * Get the {@code has_parent} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code has_parent} kind.
	 */
	public HasParentQuery hasParent() {
		return TaggedUnionUtils.get(this, Kind.HasParent);
	}

	/**
	 * Is this variant instance of kind {@code ids}?
	 */
	public boolean isIds() {
		return _kind == Kind.Ids;
	}

	/**
	 * Get the {@code ids} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code ids} kind.
	 */
	public IdsQuery ids() {
		return TaggedUnionUtils.get(this, Kind.Ids);
	}

	/**
	 * Is this variant instance of kind {@code intervals}?
	 */
	public boolean isIntervals() {
		return _kind == Kind.Intervals;
	}

	/**
	 * Get the {@code intervals} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code intervals} kind.
	 */
	public IntervalsQuery intervals() {
		return TaggedUnionUtils.get(this, Kind.Intervals);
	}

	/**
	 * Is this variant instance of kind {@code match}?
	 */
	public boolean isMatch() {
		return _kind == Kind.Match;
	}

	/**
	 * Get the {@code match} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code match} kind.
	 */
	public MatchQuery match() {
		return TaggedUnionUtils.get(this, Kind.Match);
	}

	/**
	 * Is this variant instance of kind {@code match_all}?
	 */
	public boolean isMatchAll() {
		return _kind == Kind.MatchAll;
	}

	/**
	 * Get the {@code match_all} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code match_all} kind.
	 */
	public MatchAllQuery matchAll() {
		return TaggedUnionUtils.get(this, Kind.MatchAll);
	}

	/**
	 * Is this variant instance of kind {@code match_bool_prefix}?
	 */
	public boolean isMatchBoolPrefix() {
		return _kind == Kind.MatchBoolPrefix;
	}

	/**
	 * Get the {@code match_bool_prefix} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code match_bool_prefix}
	 *             kind.
	 */
	public MatchBoolPrefixQuery matchBoolPrefix() {
		return TaggedUnionUtils.get(this, Kind.MatchBoolPrefix);
	}

	/**
	 * Is this variant instance of kind {@code match_none}?
	 */
	public boolean isMatchNone() {
		return _kind == Kind.MatchNone;
	}

	/**
	 * Get the {@code match_none} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code match_none} kind.
	 */
	public MatchNoneQuery matchNone() {
		return TaggedUnionUtils.get(this, Kind.MatchNone);
	}

	/**
	 * Is this variant instance of kind {@code match_phrase}?
	 */
	public boolean isMatchPhrase() {
		return _kind == Kind.MatchPhrase;
	}

	/**
	 * Get the {@code match_phrase} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code match_phrase} kind.
	 */
	public MatchPhraseQuery matchPhrase() {
		return TaggedUnionUtils.get(this, Kind.MatchPhrase);
	}

	/**
	 * Is this variant instance of kind {@code match_phrase_prefix}?
	 */
	public boolean isMatchPhrasePrefix() {
		return _kind == Kind.MatchPhrasePrefix;
	}

	/**
	 * Get the {@code match_phrase_prefix} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code match_phrase_prefix}
	 *             kind.
	 */
	public MatchPhrasePrefixQuery matchPhrasePrefix() {
		return TaggedUnionUtils.get(this, Kind.MatchPhrasePrefix);
	}

	/**
	 * Is this variant instance of kind {@code more_like_this}?
	 */
	public boolean isMoreLikeThis() {
		return _kind == Kind.MoreLikeThis;
	}

	/**
	 * Get the {@code more_like_this} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code more_like_this} kind.
	 */
	public MoreLikeThisQuery moreLikeThis() {
		return TaggedUnionUtils.get(this, Kind.MoreLikeThis);
	}

	/**
	 * Is this variant instance of kind {@code multi_match}?
	 */
	public boolean isMultiMatch() {
		return _kind == Kind.MultiMatch;
	}

	/**
	 * Get the {@code multi_match} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code multi_match} kind.
	 */
	public MultiMatchQuery multiMatch() {
		return TaggedUnionUtils.get(this, Kind.MultiMatch);
	}

	/**
	 * Is this variant instance of kind {@code nested}?
	 */
	public boolean isNested() {
		return _kind == Kind.Nested;
	}

	/**
	 * Get the {@code nested} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code nested} kind.
	 */
	public NestedQuery nested() {
		return TaggedUnionUtils.get(this, Kind.Nested);
	}

	/**
	 * Is this variant instance of kind {@code parent_id}?
	 */
	public boolean isParentId() {
		return _kind == Kind.ParentId;
	}

	/**
	 * Get the {@code parent_id} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code parent_id} kind.
	 */
	public ParentIdQuery parentId() {
		return TaggedUnionUtils.get(this, Kind.ParentId);
	}

	/**
	 * Is this variant instance of kind {@code percolate}?
	 */
	public boolean isPercolate() {
		return _kind == Kind.Percolate;
	}

	/**
	 * Get the {@code percolate} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code percolate} kind.
	 */
	public PercolateQuery percolate() {
		return TaggedUnionUtils.get(this, Kind.Percolate);
	}

	/**
	 * Is this variant instance of kind {@code pinned}?
	 */
	public boolean isPinned() {
		return _kind == Kind.Pinned;
	}

	/**
	 * Get the {@code pinned} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code pinned} kind.
	 */
	public PinnedQuery pinned() {
		return TaggedUnionUtils.get(this, Kind.Pinned);
	}

	/**
	 * Is this variant instance of kind {@code prefix}?
	 */
	public boolean isPrefix() {
		return _kind == Kind.Prefix;
	}

	/**
	 * Get the {@code prefix} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code prefix} kind.
	 */
	public PrefixQuery prefix() {
		return TaggedUnionUtils.get(this, Kind.Prefix);
	}

	/**
	 * Is this variant instance of kind {@code query_string}?
	 */
	public boolean isQueryString() {
		return _kind == Kind.QueryString;
	}

	/**
	 * Get the {@code query_string} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code query_string} kind.
	 */
	public QueryStringQuery queryString() {
		return TaggedUnionUtils.get(this, Kind.QueryString);
	}

	/**
	 * Is this variant instance of kind {@code range}?
	 */
	public boolean isRange() {
		return _kind == Kind.Range;
	}

	/**
	 * Get the {@code range} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code range} kind.
	 */
	public RangeQuery range() {
		return TaggedUnionUtils.get(this, Kind.Range);
	}

	/**
	 * Is this variant instance of kind {@code rank_feature}?
	 */
	public boolean isRankFeature() {
		return _kind == Kind.RankFeature;
	}

	/**
	 * Get the {@code rank_feature} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code rank_feature} kind.
	 */
	public RankFeatureQuery rankFeature() {
		return TaggedUnionUtils.get(this, Kind.RankFeature);
	}

	/**
	 * Is this variant instance of kind {@code regexp}?
	 */
	public boolean isRegexp() {
		return _kind == Kind.Regexp;
	}

	/**
	 * Get the {@code regexp} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code regexp} kind.
	 */
	public RegexpQuery regexp() {
		return TaggedUnionUtils.get(this, Kind.Regexp);
	}

	/**
	 * Is this variant instance of kind {@code script}?
	 */
	public boolean isScript() {
		return _kind == Kind.Script;
	}

	/**
	 * Get the {@code script} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code script} kind.
	 */
	public ScriptQuery script() {
		return TaggedUnionUtils.get(this, Kind.Script);
	}

	/**
	 * Is this variant instance of kind {@code script_score}?
	 */
	public boolean isScriptScore() {
		return _kind == Kind.ScriptScore;
	}

	/**
	 * Get the {@code script_score} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code script_score} kind.
	 */
	public ScriptScoreQuery scriptScore() {
		return TaggedUnionUtils.get(this, Kind.ScriptScore);
	}

	/**
	 * Is this variant instance of kind {@code shape}?
	 */
	public boolean isShape() {
		return _kind == Kind.Shape;
	}

	/**
	 * Get the {@code shape} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code shape} kind.
	 */
	public ShapeQuery shape() {
		return TaggedUnionUtils.get(this, Kind.Shape);
	}

	/**
	 * Is this variant instance of kind {@code simple_query_string}?
	 */
	public boolean isSimpleQueryString() {
		return _kind == Kind.SimpleQueryString;
	}

	/**
	 * Get the {@code simple_query_string} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code simple_query_string}
	 *             kind.
	 */
	public SimpleQueryStringQuery simpleQueryString() {
		return TaggedUnionUtils.get(this, Kind.SimpleQueryString);
	}

	/**
	 * Is this variant instance of kind {@code span_containing}?
	 */
	public boolean isSpanContaining() {
		return _kind == Kind.SpanContaining;
	}

	/**
	 * Get the {@code span_containing} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_containing}
	 *             kind.
	 */
	public SpanContainingQuery spanContaining() {
		return TaggedUnionUtils.get(this, Kind.SpanContaining);
	}

	/**
	 * Is this variant instance of kind {@code field_masking_span}?
	 */
	public boolean isFieldMaskingSpan() {
		return _kind == Kind.FieldMaskingSpan;
	}

	/**
	 * Get the {@code field_masking_span} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code field_masking_span}
	 *             kind.
	 */
	public SpanFieldMaskingQuery fieldMaskingSpan() {
		return TaggedUnionUtils.get(this, Kind.FieldMaskingSpan);
	}

	/**
	 * Is this variant instance of kind {@code span_first}?
	 */
	public boolean isSpanFirst() {
		return _kind == Kind.SpanFirst;
	}

	/**
	 * Get the {@code span_first} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_first} kind.
	 */
	public SpanFirstQuery spanFirst() {
		return TaggedUnionUtils.get(this, Kind.SpanFirst);
	}

	/**
	 * Is this variant instance of kind {@code span_multi}?
	 */
	public boolean isSpanMulti() {
		return _kind == Kind.SpanMulti;
	}

	/**
	 * Get the {@code span_multi} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_multi} kind.
	 */
	public SpanMultiTermQuery spanMulti() {
		return TaggedUnionUtils.get(this, Kind.SpanMulti);
	}

	/**
	 * Is this variant instance of kind {@code span_near}?
	 */
	public boolean isSpanNear() {
		return _kind == Kind.SpanNear;
	}

	/**
	 * Get the {@code span_near} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_near} kind.
	 */
	public SpanNearQuery spanNear() {
		return TaggedUnionUtils.get(this, Kind.SpanNear);
	}

	/**
	 * Is this variant instance of kind {@code span_not}?
	 */
	public boolean isSpanNot() {
		return _kind == Kind.SpanNot;
	}

	/**
	 * Get the {@code span_not} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_not} kind.
	 */
	public SpanNotQuery spanNot() {
		return TaggedUnionUtils.get(this, Kind.SpanNot);
	}

	/**
	 * Is this variant instance of kind {@code span_or}?
	 */
	public boolean isSpanOr() {
		return _kind == Kind.SpanOr;
	}

	/**
	 * Get the {@code span_or} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_or} kind.
	 */
	public SpanOrQuery spanOr() {
		return TaggedUnionUtils.get(this, Kind.SpanOr);
	}

	/**
	 * Is this variant instance of kind {@code span_term}?
	 */
	public boolean isSpanTerm() {
		return _kind == Kind.SpanTerm;
	}

	/**
	 * Get the {@code span_term} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_term} kind.
	 */
	public SpanTermQuery spanTerm() {
		return TaggedUnionUtils.get(this, Kind.SpanTerm);
	}

	/**
	 * Is this variant instance of kind {@code span_within}?
	 */
	public boolean isSpanWithin() {
		return _kind == Kind.SpanWithin;
	}

	/**
	 * Get the {@code span_within} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_within} kind.
	 */
	public SpanWithinQuery spanWithin() {
		return TaggedUnionUtils.get(this, Kind.SpanWithin);
	}

	/**
	 * Is this variant instance of kind {@code term}?
	 */
	public boolean isTerm() {
		return _kind == Kind.Term;
	}

	/**
	 * Get the {@code term} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code term} kind.
	 */
	public TermQuery term() {
		return TaggedUnionUtils.get(this, Kind.Term);
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
	public TermsQuery terms() {
		return TaggedUnionUtils.get(this, Kind.Terms);
	}

	/**
	 * Is this variant instance of kind {@code terms_set}?
	 */
	public boolean isTermsSet() {
		return _kind == Kind.TermsSet;
	}

	/**
	 * Get the {@code terms_set} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code terms_set} kind.
	 */
	public TermsSetQuery termsSet() {
		return TaggedUnionUtils.get(this, Kind.TermsSet);
	}

	/**
	 * Is this variant instance of kind {@code wildcard}?
	 */
	public boolean isWildcard() {
		return _kind == Kind.Wildcard;
	}

	/**
	 * Get the {@code wildcard} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code wildcard} kind.
	 */
	public WildcardQuery wildcard() {
		return TaggedUnionUtils.get(this, Kind.Wildcard);
	}

	/**
	 * Is this variant instance of kind {@code type}?
	 */
	public boolean isType() {
		return _kind == Kind.Type;
	}

	/**
	 * Get the {@code type} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code type} kind.
	 */
	public TypeQuery type() {
		return TaggedUnionUtils.get(this, Kind.Type);
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

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Query> {
		private Kind _kind;
		private Object _value;

		public Builder bool(BoolQuery v) {
			this._kind = Kind.Bool;
			this._value = v;
			return this;
		}

		public Builder bool(Consumer<BoolQuery.Builder> fn) {
			BoolQuery.Builder builder = new BoolQuery.Builder();
			fn.accept(builder);
			return this.bool(builder.build());
		}

		public Builder boosting(BoostingQuery v) {
			this._kind = Kind.Boosting;
			this._value = v;
			return this;
		}

		public Builder boosting(Consumer<BoostingQuery.Builder> fn) {
			BoostingQuery.Builder builder = new BoostingQuery.Builder();
			fn.accept(builder);
			return this.boosting(builder.build());
		}

		public Builder common(CommonTermsQuery v) {
			this._kind = Kind.Common;
			this._value = v;
			return this;
		}

		public Builder common(Consumer<CommonTermsQuery.Builder> fn) {
			CommonTermsQuery.Builder builder = new CommonTermsQuery.Builder();
			fn.accept(builder);
			return this.common(builder.build());
		}

		public Builder combinedFields(CombinedFieldsQuery v) {
			this._kind = Kind.CombinedFields;
			this._value = v;
			return this;
		}

		public Builder combinedFields(Consumer<CombinedFieldsQuery.Builder> fn) {
			CombinedFieldsQuery.Builder builder = new CombinedFieldsQuery.Builder();
			fn.accept(builder);
			return this.combinedFields(builder.build());
		}

		public Builder constantScore(ConstantScoreQuery v) {
			this._kind = Kind.ConstantScore;
			this._value = v;
			return this;
		}

		public Builder constantScore(Consumer<ConstantScoreQuery.Builder> fn) {
			ConstantScoreQuery.Builder builder = new ConstantScoreQuery.Builder();
			fn.accept(builder);
			return this.constantScore(builder.build());
		}

		public Builder disMax(DisMaxQuery v) {
			this._kind = Kind.DisMax;
			this._value = v;
			return this;
		}

		public Builder disMax(Consumer<DisMaxQuery.Builder> fn) {
			DisMaxQuery.Builder builder = new DisMaxQuery.Builder();
			fn.accept(builder);
			return this.disMax(builder.build());
		}

		public Builder distanceFeature(DistanceFeatureQuery v) {
			this._kind = Kind.DistanceFeature;
			this._value = v;
			return this;
		}

		public Builder distanceFeature(Consumer<DistanceFeatureQuery.Builder> fn) {
			DistanceFeatureQuery.Builder builder = new DistanceFeatureQuery.Builder();
			fn.accept(builder);
			return this.distanceFeature(builder.build());
		}

		public Builder exists(ExistsQuery v) {
			this._kind = Kind.Exists;
			this._value = v;
			return this;
		}

		public Builder exists(Consumer<ExistsQuery.Builder> fn) {
			ExistsQuery.Builder builder = new ExistsQuery.Builder();
			fn.accept(builder);
			return this.exists(builder.build());
		}

		public Builder functionScore(FunctionScoreQuery v) {
			this._kind = Kind.FunctionScore;
			this._value = v;
			return this;
		}

		public Builder functionScore(Consumer<FunctionScoreQuery.Builder> fn) {
			FunctionScoreQuery.Builder builder = new FunctionScoreQuery.Builder();
			fn.accept(builder);
			return this.functionScore(builder.build());
		}

		public Builder fuzzy(FuzzyQuery v) {
			this._kind = Kind.Fuzzy;
			this._value = v;
			return this;
		}

		public Builder fuzzy(Consumer<FuzzyQuery.Builder> fn) {
			FuzzyQuery.Builder builder = new FuzzyQuery.Builder();
			fn.accept(builder);
			return this.fuzzy(builder.build());
		}

		public Builder geoBoundingBox(GeoBoundingBoxQuery v) {
			this._kind = Kind.GeoBoundingBox;
			this._value = v;
			return this;
		}

		public Builder geoBoundingBox(Consumer<GeoBoundingBoxQuery.Builder> fn) {
			GeoBoundingBoxQuery.Builder builder = new GeoBoundingBoxQuery.Builder();
			fn.accept(builder);
			return this.geoBoundingBox(builder.build());
		}

		public Builder geoDistance(GeoDistanceQuery v) {
			this._kind = Kind.GeoDistance;
			this._value = v;
			return this;
		}

		public Builder geoDistance(Consumer<GeoDistanceQuery.Builder> fn) {
			GeoDistanceQuery.Builder builder = new GeoDistanceQuery.Builder();
			fn.accept(builder);
			return this.geoDistance(builder.build());
		}

		public Builder geoPolygon(GeoPolygonQuery v) {
			this._kind = Kind.GeoPolygon;
			this._value = v;
			return this;
		}

		public Builder geoPolygon(Consumer<GeoPolygonQuery.Builder> fn) {
			GeoPolygonQuery.Builder builder = new GeoPolygonQuery.Builder();
			fn.accept(builder);
			return this.geoPolygon(builder.build());
		}

		public Builder geoShape(GeoShapeQuery v) {
			this._kind = Kind.GeoShape;
			this._value = v;
			return this;
		}

		public Builder geoShape(Consumer<GeoShapeQuery.Builder> fn) {
			GeoShapeQuery.Builder builder = new GeoShapeQuery.Builder();
			fn.accept(builder);
			return this.geoShape(builder.build());
		}

		public Builder hasChild(HasChildQuery v) {
			this._kind = Kind.HasChild;
			this._value = v;
			return this;
		}

		public Builder hasChild(Consumer<HasChildQuery.Builder> fn) {
			HasChildQuery.Builder builder = new HasChildQuery.Builder();
			fn.accept(builder);
			return this.hasChild(builder.build());
		}

		public Builder hasParent(HasParentQuery v) {
			this._kind = Kind.HasParent;
			this._value = v;
			return this;
		}

		public Builder hasParent(Consumer<HasParentQuery.Builder> fn) {
			HasParentQuery.Builder builder = new HasParentQuery.Builder();
			fn.accept(builder);
			return this.hasParent(builder.build());
		}

		public Builder ids(IdsQuery v) {
			this._kind = Kind.Ids;
			this._value = v;
			return this;
		}

		public Builder ids(Consumer<IdsQuery.Builder> fn) {
			IdsQuery.Builder builder = new IdsQuery.Builder();
			fn.accept(builder);
			return this.ids(builder.build());
		}

		public Builder intervals(IntervalsQuery v) {
			this._kind = Kind.Intervals;
			this._value = v;
			return this;
		}

		public Builder intervals(Consumer<IntervalsQuery.Builder> fn) {
			IntervalsQuery.Builder builder = new IntervalsQuery.Builder();
			fn.accept(builder);
			return this.intervals(builder.build());
		}

		public Builder match(MatchQuery v) {
			this._kind = Kind.Match;
			this._value = v;
			return this;
		}

		public Builder match(Consumer<MatchQuery.Builder> fn) {
			MatchQuery.Builder builder = new MatchQuery.Builder();
			fn.accept(builder);
			return this.match(builder.build());
		}

		public Builder matchAll(MatchAllQuery v) {
			this._kind = Kind.MatchAll;
			this._value = v;
			return this;
		}

		public Builder matchAll(Consumer<MatchAllQuery.Builder> fn) {
			MatchAllQuery.Builder builder = new MatchAllQuery.Builder();
			fn.accept(builder);
			return this.matchAll(builder.build());
		}

		public Builder matchBoolPrefix(MatchBoolPrefixQuery v) {
			this._kind = Kind.MatchBoolPrefix;
			this._value = v;
			return this;
		}

		public Builder matchBoolPrefix(Consumer<MatchBoolPrefixQuery.Builder> fn) {
			MatchBoolPrefixQuery.Builder builder = new MatchBoolPrefixQuery.Builder();
			fn.accept(builder);
			return this.matchBoolPrefix(builder.build());
		}

		public Builder matchNone(MatchNoneQuery v) {
			this._kind = Kind.MatchNone;
			this._value = v;
			return this;
		}

		public Builder matchNone(Consumer<MatchNoneQuery.Builder> fn) {
			MatchNoneQuery.Builder builder = new MatchNoneQuery.Builder();
			fn.accept(builder);
			return this.matchNone(builder.build());
		}

		public Builder matchPhrase(MatchPhraseQuery v) {
			this._kind = Kind.MatchPhrase;
			this._value = v;
			return this;
		}

		public Builder matchPhrase(Consumer<MatchPhraseQuery.Builder> fn) {
			MatchPhraseQuery.Builder builder = new MatchPhraseQuery.Builder();
			fn.accept(builder);
			return this.matchPhrase(builder.build());
		}

		public Builder matchPhrasePrefix(MatchPhrasePrefixQuery v) {
			this._kind = Kind.MatchPhrasePrefix;
			this._value = v;
			return this;
		}

		public Builder matchPhrasePrefix(Consumer<MatchPhrasePrefixQuery.Builder> fn) {
			MatchPhrasePrefixQuery.Builder builder = new MatchPhrasePrefixQuery.Builder();
			fn.accept(builder);
			return this.matchPhrasePrefix(builder.build());
		}

		public Builder moreLikeThis(MoreLikeThisQuery v) {
			this._kind = Kind.MoreLikeThis;
			this._value = v;
			return this;
		}

		public Builder moreLikeThis(Consumer<MoreLikeThisQuery.Builder> fn) {
			MoreLikeThisQuery.Builder builder = new MoreLikeThisQuery.Builder();
			fn.accept(builder);
			return this.moreLikeThis(builder.build());
		}

		public Builder multiMatch(MultiMatchQuery v) {
			this._kind = Kind.MultiMatch;
			this._value = v;
			return this;
		}

		public Builder multiMatch(Consumer<MultiMatchQuery.Builder> fn) {
			MultiMatchQuery.Builder builder = new MultiMatchQuery.Builder();
			fn.accept(builder);
			return this.multiMatch(builder.build());
		}

		public Builder nested(NestedQuery v) {
			this._kind = Kind.Nested;
			this._value = v;
			return this;
		}

		public Builder nested(Consumer<NestedQuery.Builder> fn) {
			NestedQuery.Builder builder = new NestedQuery.Builder();
			fn.accept(builder);
			return this.nested(builder.build());
		}

		public Builder parentId(ParentIdQuery v) {
			this._kind = Kind.ParentId;
			this._value = v;
			return this;
		}

		public Builder parentId(Consumer<ParentIdQuery.Builder> fn) {
			ParentIdQuery.Builder builder = new ParentIdQuery.Builder();
			fn.accept(builder);
			return this.parentId(builder.build());
		}

		public Builder percolate(PercolateQuery v) {
			this._kind = Kind.Percolate;
			this._value = v;
			return this;
		}

		public Builder percolate(Consumer<PercolateQuery.Builder> fn) {
			PercolateQuery.Builder builder = new PercolateQuery.Builder();
			fn.accept(builder);
			return this.percolate(builder.build());
		}

		public Builder pinned(PinnedQuery v) {
			this._kind = Kind.Pinned;
			this._value = v;
			return this;
		}

		public Builder pinned(Consumer<PinnedQuery.Builder> fn) {
			PinnedQuery.Builder builder = new PinnedQuery.Builder();
			fn.accept(builder);
			return this.pinned(builder.build());
		}

		public Builder prefix(PrefixQuery v) {
			this._kind = Kind.Prefix;
			this._value = v;
			return this;
		}

		public Builder prefix(Consumer<PrefixQuery.Builder> fn) {
			PrefixQuery.Builder builder = new PrefixQuery.Builder();
			fn.accept(builder);
			return this.prefix(builder.build());
		}

		public Builder queryString(QueryStringQuery v) {
			this._kind = Kind.QueryString;
			this._value = v;
			return this;
		}

		public Builder queryString(Consumer<QueryStringQuery.Builder> fn) {
			QueryStringQuery.Builder builder = new QueryStringQuery.Builder();
			fn.accept(builder);
			return this.queryString(builder.build());
		}

		public Builder range(RangeQuery v) {
			this._kind = Kind.Range;
			this._value = v;
			return this;
		}

		public Builder range(Consumer<RangeQuery.Builder> fn) {
			RangeQuery.Builder builder = new RangeQuery.Builder();
			fn.accept(builder);
			return this.range(builder.build());
		}

		public Builder rankFeature(RankFeatureQuery v) {
			this._kind = Kind.RankFeature;
			this._value = v;
			return this;
		}

		public Builder rankFeature(Consumer<RankFeatureQuery.Builder> fn) {
			RankFeatureQuery.Builder builder = new RankFeatureQuery.Builder();
			fn.accept(builder);
			return this.rankFeature(builder.build());
		}

		public Builder regexp(RegexpQuery v) {
			this._kind = Kind.Regexp;
			this._value = v;
			return this;
		}

		public Builder regexp(Consumer<RegexpQuery.Builder> fn) {
			RegexpQuery.Builder builder = new RegexpQuery.Builder();
			fn.accept(builder);
			return this.regexp(builder.build());
		}

		public Builder script(ScriptQuery v) {
			this._kind = Kind.Script;
			this._value = v;
			return this;
		}

		public Builder script(Consumer<ScriptQuery.Builder> fn) {
			ScriptQuery.Builder builder = new ScriptQuery.Builder();
			fn.accept(builder);
			return this.script(builder.build());
		}

		public Builder scriptScore(ScriptScoreQuery v) {
			this._kind = Kind.ScriptScore;
			this._value = v;
			return this;
		}

		public Builder scriptScore(Consumer<ScriptScoreQuery.Builder> fn) {
			ScriptScoreQuery.Builder builder = new ScriptScoreQuery.Builder();
			fn.accept(builder);
			return this.scriptScore(builder.build());
		}

		public Builder shape(ShapeQuery v) {
			this._kind = Kind.Shape;
			this._value = v;
			return this;
		}

		public Builder shape(Consumer<ShapeQuery.Builder> fn) {
			ShapeQuery.Builder builder = new ShapeQuery.Builder();
			fn.accept(builder);
			return this.shape(builder.build());
		}

		public Builder simpleQueryString(SimpleQueryStringQuery v) {
			this._kind = Kind.SimpleQueryString;
			this._value = v;
			return this;
		}

		public Builder simpleQueryString(Consumer<SimpleQueryStringQuery.Builder> fn) {
			SimpleQueryStringQuery.Builder builder = new SimpleQueryStringQuery.Builder();
			fn.accept(builder);
			return this.simpleQueryString(builder.build());
		}

		public Builder spanContaining(SpanContainingQuery v) {
			this._kind = Kind.SpanContaining;
			this._value = v;
			return this;
		}

		public Builder spanContaining(Consumer<SpanContainingQuery.Builder> fn) {
			SpanContainingQuery.Builder builder = new SpanContainingQuery.Builder();
			fn.accept(builder);
			return this.spanContaining(builder.build());
		}

		public Builder fieldMaskingSpan(SpanFieldMaskingQuery v) {
			this._kind = Kind.FieldMaskingSpan;
			this._value = v;
			return this;
		}

		public Builder fieldMaskingSpan(Consumer<SpanFieldMaskingQuery.Builder> fn) {
			SpanFieldMaskingQuery.Builder builder = new SpanFieldMaskingQuery.Builder();
			fn.accept(builder);
			return this.fieldMaskingSpan(builder.build());
		}

		public Builder spanFirst(SpanFirstQuery v) {
			this._kind = Kind.SpanFirst;
			this._value = v;
			return this;
		}

		public Builder spanFirst(Consumer<SpanFirstQuery.Builder> fn) {
			SpanFirstQuery.Builder builder = new SpanFirstQuery.Builder();
			fn.accept(builder);
			return this.spanFirst(builder.build());
		}

		public Builder spanMulti(SpanMultiTermQuery v) {
			this._kind = Kind.SpanMulti;
			this._value = v;
			return this;
		}

		public Builder spanMulti(Consumer<SpanMultiTermQuery.Builder> fn) {
			SpanMultiTermQuery.Builder builder = new SpanMultiTermQuery.Builder();
			fn.accept(builder);
			return this.spanMulti(builder.build());
		}

		public Builder spanNear(SpanNearQuery v) {
			this._kind = Kind.SpanNear;
			this._value = v;
			return this;
		}

		public Builder spanNear(Consumer<SpanNearQuery.Builder> fn) {
			SpanNearQuery.Builder builder = new SpanNearQuery.Builder();
			fn.accept(builder);
			return this.spanNear(builder.build());
		}

		public Builder spanNot(SpanNotQuery v) {
			this._kind = Kind.SpanNot;
			this._value = v;
			return this;
		}

		public Builder spanNot(Consumer<SpanNotQuery.Builder> fn) {
			SpanNotQuery.Builder builder = new SpanNotQuery.Builder();
			fn.accept(builder);
			return this.spanNot(builder.build());
		}

		public Builder spanOr(SpanOrQuery v) {
			this._kind = Kind.SpanOr;
			this._value = v;
			return this;
		}

		public Builder spanOr(Consumer<SpanOrQuery.Builder> fn) {
			SpanOrQuery.Builder builder = new SpanOrQuery.Builder();
			fn.accept(builder);
			return this.spanOr(builder.build());
		}

		public Builder spanTerm(SpanTermQuery v) {
			this._kind = Kind.SpanTerm;
			this._value = v;
			return this;
		}

		public Builder spanTerm(Consumer<SpanTermQuery.Builder> fn) {
			SpanTermQuery.Builder builder = new SpanTermQuery.Builder();
			fn.accept(builder);
			return this.spanTerm(builder.build());
		}

		public Builder spanWithin(SpanWithinQuery v) {
			this._kind = Kind.SpanWithin;
			this._value = v;
			return this;
		}

		public Builder spanWithin(Consumer<SpanWithinQuery.Builder> fn) {
			SpanWithinQuery.Builder builder = new SpanWithinQuery.Builder();
			fn.accept(builder);
			return this.spanWithin(builder.build());
		}

		public Builder term(TermQuery v) {
			this._kind = Kind.Term;
			this._value = v;
			return this;
		}

		public Builder term(Consumer<TermQuery.Builder> fn) {
			TermQuery.Builder builder = new TermQuery.Builder();
			fn.accept(builder);
			return this.term(builder.build());
		}

		public Builder terms(TermsQuery v) {
			this._kind = Kind.Terms;
			this._value = v;
			return this;
		}

		public Builder terms(Consumer<TermsQuery.Builder> fn) {
			TermsQuery.Builder builder = new TermsQuery.Builder();
			fn.accept(builder);
			return this.terms(builder.build());
		}

		public Builder termsSet(TermsSetQuery v) {
			this._kind = Kind.TermsSet;
			this._value = v;
			return this;
		}

		public Builder termsSet(Consumer<TermsSetQuery.Builder> fn) {
			TermsSetQuery.Builder builder = new TermsSetQuery.Builder();
			fn.accept(builder);
			return this.termsSet(builder.build());
		}

		public Builder wildcard(WildcardQuery v) {
			this._kind = Kind.Wildcard;
			this._value = v;
			return this;
		}

		public Builder wildcard(Consumer<WildcardQuery.Builder> fn) {
			WildcardQuery.Builder builder = new WildcardQuery.Builder();
			fn.accept(builder);
			return this.wildcard(builder.build());
		}

		public Builder type(TypeQuery v) {
			this._kind = Kind.Type;
			this._value = v;
			return this;
		}

		public Builder type(Consumer<TypeQuery.Builder> fn) {
			TypeQuery.Builder builder = new TypeQuery.Builder();
			fn.accept(builder);
			return this.type(builder.build());
		}

		public Query build() {
			_checkSingleUse();
			return new Query(this);
		}

	}

	protected static void setupQueryDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::bool, BoolQuery._DESERIALIZER, "bool");
		op.add(Builder::boosting, BoostingQuery._DESERIALIZER, "boosting");
		op.add(Builder::common, CommonTermsQuery._DESERIALIZER, "common");
		op.add(Builder::combinedFields, CombinedFieldsQuery._DESERIALIZER, "combined_fields");
		op.add(Builder::constantScore, ConstantScoreQuery._DESERIALIZER, "constant_score");
		op.add(Builder::disMax, DisMaxQuery._DESERIALIZER, "dis_max");
		op.add(Builder::distanceFeature, DistanceFeatureQuery._DESERIALIZER, "distance_feature");
		op.add(Builder::exists, ExistsQuery._DESERIALIZER, "exists");
		op.add(Builder::functionScore, FunctionScoreQuery._DESERIALIZER, "function_score");
		op.add(Builder::fuzzy, FuzzyQuery._DESERIALIZER, "fuzzy");
		op.add(Builder::geoBoundingBox, GeoBoundingBoxQuery._DESERIALIZER, "geo_bounding_box");
		op.add(Builder::geoDistance, GeoDistanceQuery._DESERIALIZER, "geo_distance");
		op.add(Builder::geoPolygon, GeoPolygonQuery._DESERIALIZER, "geo_polygon");
		op.add(Builder::geoShape, GeoShapeQuery._DESERIALIZER, "geo_shape");
		op.add(Builder::hasChild, HasChildQuery._DESERIALIZER, "has_child");
		op.add(Builder::hasParent, HasParentQuery._DESERIALIZER, "has_parent");
		op.add(Builder::ids, IdsQuery._DESERIALIZER, "ids");
		op.add(Builder::intervals, IntervalsQuery._DESERIALIZER, "intervals");
		op.add(Builder::match, MatchQuery._DESERIALIZER, "match");
		op.add(Builder::matchAll, MatchAllQuery._DESERIALIZER, "match_all");
		op.add(Builder::matchBoolPrefix, MatchBoolPrefixQuery._DESERIALIZER, "match_bool_prefix");
		op.add(Builder::matchNone, MatchNoneQuery._DESERIALIZER, "match_none");
		op.add(Builder::matchPhrase, MatchPhraseQuery._DESERIALIZER, "match_phrase");
		op.add(Builder::matchPhrasePrefix, MatchPhrasePrefixQuery._DESERIALIZER, "match_phrase_prefix");
		op.add(Builder::moreLikeThis, MoreLikeThisQuery._DESERIALIZER, "more_like_this");
		op.add(Builder::multiMatch, MultiMatchQuery._DESERIALIZER, "multi_match");
		op.add(Builder::nested, NestedQuery._DESERIALIZER, "nested");
		op.add(Builder::parentId, ParentIdQuery._DESERIALIZER, "parent_id");
		op.add(Builder::percolate, PercolateQuery._DESERIALIZER, "percolate");
		op.add(Builder::pinned, PinnedQuery._DESERIALIZER, "pinned");
		op.add(Builder::prefix, PrefixQuery._DESERIALIZER, "prefix");
		op.add(Builder::queryString, QueryStringQuery._DESERIALIZER, "query_string");
		op.add(Builder::range, RangeQuery._DESERIALIZER, "range");
		op.add(Builder::rankFeature, RankFeatureQuery._DESERIALIZER, "rank_feature");
		op.add(Builder::regexp, RegexpQuery._DESERIALIZER, "regexp");
		op.add(Builder::script, ScriptQuery._DESERIALIZER, "script");
		op.add(Builder::scriptScore, ScriptScoreQuery._DESERIALIZER, "script_score");
		op.add(Builder::shape, ShapeQuery._DESERIALIZER, "shape");
		op.add(Builder::simpleQueryString, SimpleQueryStringQuery._DESERIALIZER, "simple_query_string");
		op.add(Builder::spanContaining, SpanContainingQuery._DESERIALIZER, "span_containing");
		op.add(Builder::fieldMaskingSpan, SpanFieldMaskingQuery._DESERIALIZER, "field_masking_span");
		op.add(Builder::spanFirst, SpanFirstQuery._DESERIALIZER, "span_first");
		op.add(Builder::spanMulti, SpanMultiTermQuery._DESERIALIZER, "span_multi");
		op.add(Builder::spanNear, SpanNearQuery._DESERIALIZER, "span_near");
		op.add(Builder::spanNot, SpanNotQuery._DESERIALIZER, "span_not");
		op.add(Builder::spanOr, SpanOrQuery._DESERIALIZER, "span_or");
		op.add(Builder::spanTerm, SpanTermQuery._DESERIALIZER, "span_term");
		op.add(Builder::spanWithin, SpanWithinQuery._DESERIALIZER, "span_within");
		op.add(Builder::term, TermQuery._DESERIALIZER, "term");
		op.add(Builder::terms, TermsQuery._DESERIALIZER, "terms");
		op.add(Builder::termsSet, TermsSetQuery._DESERIALIZER, "terms_set");
		op.add(Builder::wildcard, WildcardQuery._DESERIALIZER, "wildcard");
		op.add(Builder::type, TypeQuery._DESERIALIZER, "type");

	}

	public static final JsonpDeserializer<Query> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Query::setupQueryDeserializer, Builder::build);
}
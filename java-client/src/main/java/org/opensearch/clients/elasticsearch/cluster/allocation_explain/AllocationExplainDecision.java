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

package org.opensearch.clients.elasticsearch.cluster.allocation_explain;

import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.util.StringEnum;

@JsonpDeserializable
public enum AllocationExplainDecision implements StringEnum {
	No("NO"), Yes("YES"), Throttle("THROTTLE"), Always("ALWAYS");

	private final String jsonValue;

	AllocationExplainDecision(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final StringEnum.Deserializer<AllocationExplainDecision> _DESERIALIZER = new StringEnum.Deserializer<>(
			AllocationExplainDecision.values());
}
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dromara.soul.common.dto.convert;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.dromara.soul.common.constant.Constants;

/**
 * This is SentinelHandle.
 *
 * @author tydhot
 */
@Getter
@Setter
@EqualsAndHashCode
public class SentinelHandle {

    /**
     * Flow rule enable.
     */
    private Integer flowRuleEnable = Constants.SENTINEL_ENABLE_FLOW_RULE;

    /**
     * Flow rule grade.
     */
    private Integer flowRuleGrade = Constants.SENTINEL_QPS_FLOW_GRADE;

    /**
     * Flow rule count.
     */
    private Integer flowRuleCount;

    /**
     * Flow rule control behavior.
     */
    private Integer flowRuleControlBehavior = Constants.SENTINEL_FLOW_REJECT;

    /**
     * Degrade rule control behavior.
     */
    private Integer degradeRuleEnable = Constants.SENTINEL_ENABLE_DEGRADE_RULE;

    /**
     * Degrade rule grade.
     */
    private Integer degradeRuleGrade = Constants.SENTINEL_RESPONSE_RULE_GRADE;

    /**
     * Degrade rule count.
     */
    private Integer degradeRuleCount;

    /**
     * Degrade rule time window.
     */
    private Integer degradeRuleTimeWindow;
}

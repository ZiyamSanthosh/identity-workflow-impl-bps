/*
 * Copyright (c) 2015, WSO2 LLC. (https://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.workflow.mgt.workflow;

import org.wso2.carbon.identity.workflow.mgt.bean.Parameter;
import org.wso2.carbon.identity.workflow.mgt.exception.WorkflowException;

import java.util.List;

/**
 * This interface serves as the extension point for external workflow templates.
 */
public interface TemplateInitializer {

    /**
     * Initialize template at start up
     *
     * @return
     */
    boolean initNeededAtStartUp();

    /**
     * Initialize template
     *
     * @param parameterList parameters of template
     * @throws WorkflowException
     */
    void initialize(List<Parameter> parameterList) throws WorkflowException;
}

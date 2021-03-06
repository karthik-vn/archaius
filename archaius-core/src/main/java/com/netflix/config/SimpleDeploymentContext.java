/*
 *
 *  Copyright 2012 Netflix, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */
package com.netflix.config;

/**
 * An implemenatation of {@link DeploymentContext} with simple setters and getters.
 * 
 * @author awang
 *
 */
public class SimpleDeploymentContext implements DeploymentContext {
    private String environment;
    private String dataCenter;
    private String applicationId;
    private String serverId;
    private String stack;
    private String region;
    
    @Override
    public String getDeploymentEnvironment() {
        return environment;
    }

    @Override
    public void setDeploymentEnvironment(String env) {
        environment = env;        
    }

    @Override
    public String getDeploymentDatacenter() {
        return dataCenter;
    }

    @Override
    public void setDeploymentDatacenter(String deployedAt) {
        dataCenter = deployedAt;
    }

    @Override
    public String getApplicationId() {
        return applicationId;
    }

    @Override
    public void setApplicationId(String appId) {
        applicationId = appId;
    }

    @Override
    public void setDeploymentServerId(String serverId) {
        this.serverId = serverId;
    }

    @Override
    public String getDeploymentServerId() {
        return serverId;
    }

    @Override
    public String getDeploymentStack() {
        return stack;
    }

    @Override
    public void setDeploymentStack(String stack) {
        this.stack = stack;
    }

    @Override
    public String getDeploymentRegion() {
        return region;
    }

    @Override
    public void setDeploymentRegion(String region) {
        this.region = region;
    }    
}

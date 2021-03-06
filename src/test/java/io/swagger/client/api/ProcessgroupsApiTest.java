/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.FlowSnippetEntity;
import io.swagger.client.model.CopySnippetRequestEntity;
import io.swagger.client.model.ConnectionEntity;
import io.swagger.client.model.ControllerServiceEntity;
import io.swagger.client.model.FunnelEntity;
import io.swagger.client.model.PortEntity;
import io.swagger.client.model.LabelEntity;
import io.swagger.client.model.ProcessGroupEntity;
import io.swagger.client.model.ProcessorEntity;
import io.swagger.client.model.RemoteProcessGroupEntity;
import io.swagger.client.model.TemplateEntity;
import io.swagger.client.model.CreateTemplateRequestEntity;
import io.swagger.client.model.ConnectionsEntity;
import io.swagger.client.model.FunnelsEntity;
import io.swagger.client.model.InputPortsEntity;
import io.swagger.client.model.LabelsEntity;
import io.swagger.client.model.OutputPortsEntity;
import io.swagger.client.model.ProcessorsEntity;
import io.swagger.client.model.RemoteProcessGroupsEntity;
import io.swagger.client.model.InstantiateTemplateRequestEntity;
import io.swagger.client.model.FlowEntity;
import java.io.File;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProcessgroupsApi
 */
public class ProcessgroupsApiTest {

    private final ProcessgroupsApi api = new ProcessgroupsApi();

    
    /**
     * Copies a snippet
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void copySnippetTest() throws ApiException {
        String id = null;
        CopySnippetRequestEntity body = null;
        // FlowSnippetEntity response = api.copySnippet(id, body);

        // TODO: test validations
    }
    
    /**
     * Creates a connection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createConnectionTest() throws ApiException {
        String id = null;
        ConnectionEntity body = null;
        // ConnectionEntity response = api.createConnection(id, body);

        // TODO: test validations
    }
    
    /**
     * Creates a new controller service
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createControllerServiceTest() throws ApiException {
        String id = null;
        ControllerServiceEntity body = null;
        // ControllerServiceEntity response = api.createControllerService(id, body);

        // TODO: test validations
    }
    
    /**
     * Creates a funnel
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFunnelTest() throws ApiException {
        String id = null;
        FunnelEntity body = null;
        // FunnelEntity response = api.createFunnel(id, body);

        // TODO: test validations
    }
    
    /**
     * Creates an input port
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createInputPortTest() throws ApiException {
        String id = null;
        PortEntity body = null;
        // PortEntity response = api.createInputPort(id, body);

        // TODO: test validations
    }
    
    /**
     * Creates a label
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createLabelTest() throws ApiException {
        String id = null;
        LabelEntity body = null;
        // LabelEntity response = api.createLabel(id, body);

        // TODO: test validations
    }
    
    /**
     * Creates an output port
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOutputPortTest() throws ApiException {
        String id = null;
        PortEntity body = null;
        // PortEntity response = api.createOutputPort(id, body);

        // TODO: test validations
    }
    
    /**
     * Creates a process group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createProcessGroupTest() throws ApiException {
        String id = null;
        ProcessGroupEntity body = null;
        // ProcessGroupEntity response = api.createProcessGroup(id, body);

        // TODO: test validations
    }
    
    /**
     * Creates a new processor
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createProcessorTest() throws ApiException {
        String id = null;
        ProcessorEntity body = null;
        // ProcessorEntity response = api.createProcessor(id, body);

        // TODO: test validations
    }
    
    /**
     * Creates a new process group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRemoteProcessGroupTest() throws ApiException {
        String id = null;
        RemoteProcessGroupEntity body = null;
        // RemoteProcessGroupEntity response = api.createRemoteProcessGroup(id, body);

        // TODO: test validations
    }
    
    /**
     * Creates a template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTemplateTest() throws ApiException {
        String id = null;
        CreateTemplateRequestEntity body = null;
        // TemplateEntity response = api.createTemplate(id, body);

        // TODO: test validations
    }
    
    /**
     * Gets all connections
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConnectionsTest() throws ApiException {
        String id = null;
        // ConnectionsEntity response = api.getConnections(id);

        // TODO: test validations
    }
    
    /**
     * Gets all funnels
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFunnelsTest() throws ApiException {
        String id = null;
        // FunnelsEntity response = api.getFunnels(id);

        // TODO: test validations
    }
    
    /**
     * Gets all input ports
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInputPortsTest() throws ApiException {
        String id = null;
        // InputPortsEntity response = api.getInputPorts(id);

        // TODO: test validations
    }
    
    /**
     * Gets all labels
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLabelsTest() throws ApiException {
        String id = null;
        // LabelsEntity response = api.getLabels(id);

        // TODO: test validations
    }
    
    /**
     * Gets all output ports
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOutputPortsTest() throws ApiException {
        String id = null;
        // OutputPortsEntity response = api.getOutputPorts(id);

        // TODO: test validations
    }
    
    /**
     * Gets a process group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProcessGroupTest() throws ApiException {
        String id = null;
        // ProcessGroupEntity response = api.getProcessGroup(id);

        // TODO: test validations
    }
    
    /**
     * Gets all process groups
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProcessGroupsTest() throws ApiException {
        String id = null;
        // ProcessorsEntity response = api.getProcessGroups(id);

        // TODO: test validations
    }
    
    /**
     * Gets all processors
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProcessorsTest() throws ApiException {
        String id = null;
        // ProcessorsEntity response = api.getProcessors(id);

        // TODO: test validations
    }
    
    /**
     * Gets all remote process groups
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRemoteProcessGroupsTest() throws ApiException {
        String id = null;
        // RemoteProcessGroupsEntity response = api.getRemoteProcessGroups(id);

        // TODO: test validations
    }
    
    /**
     * Imports a template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void importTemplateTest() throws ApiException {
        String id = null;
        // TemplateEntity response = api.importTemplate(id);

        // TODO: test validations
    }
    
    /**
     * Instantiates a template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void instantiateTemplateTest() throws ApiException {
        String id = null;
        InstantiateTemplateRequestEntity body = null;
        // FlowEntity response = api.instantiateTemplate(id, body);

        // TODO: test validations
    }
    
    /**
     * Deletes a process group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeProcessGroupTest() throws ApiException {
        String id = null;
        String version = null;
        String clientId = null;
        // ProcessGroupEntity response = api.removeProcessGroup(id, version, clientId);

        // TODO: test validations
    }
    
    /**
     * Updates a process group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateProcessGroupTest() throws ApiException {
        String id = null;
        ProcessGroupEntity body = null;
        // ProcessGroupEntity response = api.updateProcessGroup(id, body);

        // TODO: test validations
    }
    
    /**
     * Uploads a template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadTemplateTest() throws ApiException {
        String id = null;
        File template = null;
        // TemplateEntity response = api.uploadTemplate(id, template);

        // TODO: test validations
    }
    
}

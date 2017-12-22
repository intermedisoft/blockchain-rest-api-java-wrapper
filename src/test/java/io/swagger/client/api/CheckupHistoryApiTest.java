/**
 * LoopBack Application
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
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
import io.swagger.client.model.CheckupHistory;
import io.swagger.client.model.InlineResponse200;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CheckupHistoryApi
 */
public class CheckupHistoryApiTest {

    private final CheckupHistoryApi api = new CheckupHistoryApi();

    
    /**
     * Create a new instance of the model and persist it into the data source.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkupHistoryCreateTest() throws ApiException {
        CheckupHistory data = null;
        // CheckupHistory response = api.checkupHistoryCreate(data);

        // TODO: test validations
    }
    
    /**
     * Delete a model instance by {{id}} from the data source.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkupHistoryDeleteByIdTest() throws ApiException {
        String id = null;
        // Object response = api.checkupHistoryDeleteById(id);

        // TODO: test validations
    }
    
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkupHistoryExistsTest() throws ApiException {
        String id = null;
        // InlineResponse200 response = api.checkupHistoryExists(id);

        // TODO: test validations
    }
    
    /**
     * Find all instances of the model matched by filter from the data source.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkupHistoryFindTest() throws ApiException {
        String filter = null;
        // List<CheckupHistory> response = api.checkupHistoryFind(filter);

        // TODO: test validations
    }
    
    /**
     * Find a model instance by {{id}} from the data source.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkupHistoryFindByIdTest() throws ApiException {
        String id = null;
        String filter = null;
        // CheckupHistory response = api.checkupHistoryFindById(id, filter);

        // TODO: test validations
    }
    
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkupHistoryReplaceByIdTest() throws ApiException {
        String id = null;
        CheckupHistory data = null;
        // CheckupHistory response = api.checkupHistoryReplaceById(id, data);

        // TODO: test validations
    }
    
}

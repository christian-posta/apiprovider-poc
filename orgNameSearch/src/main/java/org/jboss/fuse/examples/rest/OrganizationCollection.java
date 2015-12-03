/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.fuse.examples.rest;

import org.apache.camel.Header;
import org.apache.camel.language.Simple;
import org.jboss.fuse.examples.repositories.OrganizationRepository;
import org.springframework.data.domain.PageRequest;

/**
 * Created by ceposta 
 * <a href="http://christianposta.com/blog>http://christianposta.com/blog</a>.
 */
public class OrganizationCollection {

    private OrganizationRepository repository;


    public Organization insertNewOrganization(@Simple("body.org_id") Integer id, @Simple("body.org_name") String name) {
        Organization org = new Organization(id, name);
        return repository.save(org);
    }

    public Iterable<Organization> findAll(){
        return repository.findAll();
    }

    public Iterable<Organization> findOrganizationWithPagination(@Header("pageNumber")int pageNum, @Header("pageSize")int size){
        return repository.findAll(new PageRequest(pageNum, size));
    }

    public Organization findById(@Header("id")int id) {
        return repository.findOne(id);
    }

    public OrganizationRepository getRepository() {
        return repository;
    }


    public void setRepository(OrganizationRepository repository) {
        this.repository = repository;
    }
}

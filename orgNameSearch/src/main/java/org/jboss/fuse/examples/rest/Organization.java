/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.fuse.examples.rest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Organization {

    private int org_id;
    private String org_name;

    public Organization() {
    }

    public Organization(int id, String name) {
        this.org_id = id;
        this.org_name = name;
    }

    public void setOrg_id(int id) {
        this.org_id = id;
    }

    @Id
    @Column(name = "org_id", nullable = false)
    @GeneratedValue
    public int getOrg_id() {
		return org_id;
	}

    @Column(name = "org_name", nullable = false)
    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String name) {
        this.org_name = name;
    }
}

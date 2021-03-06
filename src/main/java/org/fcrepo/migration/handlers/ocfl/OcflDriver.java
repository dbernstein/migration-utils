/*
 * Copyright 2015 DuraSpace, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fcrepo.migration.handlers.ocfl;

/**
 * Simple driver for creating OCFL objects
 *
 * @author apb@jhu.edu
 **/
public interface OcflDriver {

    /**
     * Open a session for writing to an OCFL object with the given ID
     *
     * @param id
     *        OCFL object ID
     * @return A session for writing as many versions as desired to this object.
     */
    OcflSession open(String id);

    /**
     * Close the OCFL repository.
     */
    void close();

}

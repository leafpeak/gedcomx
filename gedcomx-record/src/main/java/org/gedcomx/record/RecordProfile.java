/**
 * Copyright 2011 Intellectual Reserve, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gedcomx.record;

import org.gedcomx.rt.Namespace;
import org.gedcomx.rt.Profile;

import javax.xml.bind.annotation.XmlTransient;

/**
 * @author Ryan Heaton
 */
@XmlTransient
@Profile (
  label = "Record Profile",
  description = "The record profile supports genealogical record data.",
  namespaces = {
    @Namespace (
      id = "gxr",
      uri = RecordProfile.GEDCOMX_RECORD_NAMESPACE,
      label = "Record Namespace",
      description = "The record namespace contains the objects necessary for modeling genealogical record data.",
      version = "v1",
      xmlMediaType = "application/gedcomx-record-v1+xml",
      jsonMediaType = "application/gedcomx-record-v1+json"
    )
  }
)
public class RecordProfile {

  private RecordProfile() {}

  public static final String GEDCOMX_RECORD_NAMESPACE = "http://gedcomx.org/record/v1";

}
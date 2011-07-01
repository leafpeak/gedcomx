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
package org.gedcomx.source.www;

import org.gedcomx.rt.Namespace;
import org.gedcomx.rt.Profile;

import javax.xml.bind.annotation.XmlTransient;

/**
 * @author Ryan Heaton
 */
@XmlTransient
@Profile (
  label = "Source WWW Profile",
  description = "The source www profile supports extensions to the source profile necessary to expose source data to the World Wide Web.",
  namespaces = {
    @Namespace (
      id = "gxsw",
      uri = SourceWWWProfile.GEDCOMX_SOURCE_WWW_NAMESPACE,
      label = "Source WWW Namespace",
      description = "The source www namespace contains the objects necessary for modeling source data exposed via the World Wide Web.",
      version = "v1",
      xmlMediaType = "application/gedcomx-source-www-v1+xml",
      jsonMediaType = "application/gedcomx-source-www-v1+json"
    )
  }
)
public class SourceWWWProfile {

  private SourceWWWProfile() {}

  public static final String GEDCOMX_SOURCE_WWW_NAMESPACE = "http://gedcomx.org/source/www/v1";
}
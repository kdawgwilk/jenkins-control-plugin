/*
 * Copyright (c) 2011 David Boissier
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

package org.codinjutsu.tools.jenkins.model;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;
import static org.apache.commons.lang.builder.ToStringBuilder.reflectionToString;
import static org.apache.commons.lang.builder.ToStringStyle.SHORT_PREFIX_STYLE;

public class View {

    private final String name;

    private final String url;


    private View(String name, String url) {
        this.name = name;
        this.url = url;
    }


    public String getName() {
        return name;
    }


    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(Object obj) {
        return reflectionEquals(this, obj);
    }


    @Override
    public int hashCode() {
        return reflectionHashCode(this);
    }


    @Override
    public String toString() {
        return reflectionToString(this, SHORT_PREFIX_STYLE);
    }


    public static View createView(String viewName, String viewUrl) {
        return new View(viewName, viewUrl);
    }
}
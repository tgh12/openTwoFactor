/*******************************************************************************
 * Copyright 2012 Internet2
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
 ******************************************************************************/
/*
 * Copyright (C) 2006, 2007 XStream Committers.
 * All rights reserved.
 *
 * The software in this package is published under the terms of the BSD
 * style license a copy of which has been included with this distribution in
 * the LICENSE.txt file.
 * 
 * Created on 18. October 2007 by Joerg Schaible
 */
package org.openTwoFactor.clientExt.com.thoughtworks.xstream.io.xml;

import org.openTwoFactor.clientExt.com.thoughtworks.xstream.io.HierarchicalStreamReader;


/**
 * A generic interface for all {@link HierarchicalStreamReader} implementations reading a DOM.
 * 
 * @author J&ouml;rg Schaible
 * @since 1.2.1
 */
public interface DocumentReader extends HierarchicalStreamReader {

    /**
     * Retrieve the current processed node of the DOM.
     * 
     * @return the current node
     * @since 1.2.1
     */
    public Object getCurrent();
}

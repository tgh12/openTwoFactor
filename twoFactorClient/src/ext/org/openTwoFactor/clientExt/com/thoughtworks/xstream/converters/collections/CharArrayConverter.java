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
 * Copyright (C) 2004 Joe Walnes.
 * Copyright (C) 2006, 2007 XStream Committers.
 * All rights reserved.
 *
 * The software in this package is published under the terms of the BSD
 * style license a copy of which has been included with this distribution in
 * the LICENSE.txt file.
 * 
 * Created on 06. March 2004 by Joe Walnes
 */
package org.openTwoFactor.clientExt.com.thoughtworks.xstream.converters.collections;

import org.openTwoFactor.clientExt.com.thoughtworks.xstream.converters.Converter;
import org.openTwoFactor.clientExt.com.thoughtworks.xstream.converters.MarshallingContext;
import org.openTwoFactor.clientExt.com.thoughtworks.xstream.converters.UnmarshallingContext;
import org.openTwoFactor.clientExt.com.thoughtworks.xstream.io.HierarchicalStreamReader;
import org.openTwoFactor.clientExt.com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * Converts a char[] to XML, storing the contents as a single
 * String.
 *
 * @author Joe Walnes
 */
public class CharArrayConverter implements Converter {

    public boolean canConvert(Class type) {
        return type.isArray() && type.getComponentType().equals(char.class);
    }

    public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
        char[] chars = (char[]) source;
        writer.setValue(new String(chars));
    }

    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
        return reader.getValue().toCharArray();
    }
}

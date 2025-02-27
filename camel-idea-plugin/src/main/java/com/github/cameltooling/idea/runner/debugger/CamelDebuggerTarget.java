/*
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
package com.github.cameltooling.idea.runner.debugger;

/**
 * The supported targets of a "Set Value..." action while debugging.
 */
public enum CamelDebuggerTarget {
    /**
     * The target used to modify one specific header.
     */
    MESSAGE_HEADER("Message Header"),
    /**
     * The target used to modify one specific exchange property.
     */
    EXCHANGE_PROPERTY("Exchange Property"),
    /**
     * The target used to modify the body.
     */
    BODY("Body");

    /**
     * The display name of the {@code CamelDebuggerTarget}.
     */
    private final String name;

    /**
     * Constructs a {@code CamelDebuggerTarget} with the given name.
     *
     * @param name the display name of the {@code CamelDebuggerTarget}.
     */
    CamelDebuggerTarget(String name) {
        this.name = name;
    }

    /**
     * @return the display name of the {@code CamelDebuggerTarget}.
     */
    public String getName() {
        return name;
    }
}

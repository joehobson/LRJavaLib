/**
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.navnorth.learningregistry;

import java.util.Map;

public class LRUtilities
{
    private static final String emptyRegex = "\\s*";

    public static String nullifyBadInput(String input)
    {
        if (input != null)
        {
            if (input.matches(emptyRegex))
            {
                return null;
            }
            return input.trim();
        }
        return null;
    }
    
    public static String[] nullifyBadInput(String[] input)
    {
        if (input != null)
        {
            if (input.length > 0)
            {
                return input;
            }
        }
        return null;
    }
    
    /**
     * Puts an object into a map
     *
     * @param structure Map to put the object into
     * @param name Name of the object to add
     * @param object Object to add
    */
    public static void put(Map<String,Object> structure, String name, Object object)
    {
        if (name != null && object != null)
        {
            structure.put(name, object);
        }
    }
    
    /**
     * Puts an object array into a map
     *
     * @param structure Map to put the object array into
     * @param name Name of the object array to add
     * @param object Object array to add
    */
    public static void put(Map<String, Object> structure, String name, Object[] object)
    {
        if (name != null && object != null && object.length > 0)
        {
            structure.put(name, object);
        }
    }
    
    /**
     * Puts a map into a map
     *
     * @param structure Map to put the map into
     * @param name Name of the map to add
     * @param object Map to add
    */
    public static void put(Map<String, Object> structure, String name, Map<String, Object> object)
    {
        if (name != null && object != null && object.size() > 0)
        {
            structure.put(name, object);
        }
    }
    
}
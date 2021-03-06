/*
 * Created on Sep 23, 2006
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * 
 * Copyright @2006-2011 the original author or authors.
 */
package org.fest.util;

import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;

/**
 * Tests for {@link StandardComparisonStrategy#collectionContains(java.util.Collection, Object)}.
 * 
 * @author Joel Costigliola
 */
public class StandardComparisonStrategy_collectionContains_Test extends AbstractTest_StandardComparisonStrategy {
  
  @Test
  public void verify_that_collectionContains_delegates_to_collection_parameter_contains_method() {
    List<?> list = mock(List.class);
    String value = "Frodo";
    standardComparisonStrategy.collectionContains(list, value);
    verify(list).contains(value);
  }
  
}

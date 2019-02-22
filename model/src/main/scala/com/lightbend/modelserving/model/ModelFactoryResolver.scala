/*
 * Copyright (C) 2019  Lightbend
 *
 * This file is part of ModelServing-tutorial
 *
 * ModelServing-tutorial is free software: you can redistribute it and/or modify
 * it under the terms of the Apache License Version 2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.lightbend.modelserving.model

/**
  * Base interface for ModelFactories resolver. The implementation of this trait should return the model factory
  * base on a model type. Currently the following types are defined:
  *        TENSORFLOW  = 0;
  *        TENSORFLOWSAVED  = 1;
  *        PMML = 2;
  * Additional types can be defined as required.
  */
trait ModelFactoryResolver[RECORD, RESULT] {
  def getFactory(`type` : Int) : Option[ModelFactory[RECORD, RESULT]]
}

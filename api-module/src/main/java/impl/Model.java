/*
 * Copyright (c) 2020 the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package impl;

import api.IFacePrediction;
import api.IModel;
import lombok.Builder;

@Builder
public class Model implements IModel {

    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public IFacePrediction predict(final byte[] image) {
        return new FacePrediction(null, null);
    }

    @Override
    public void addFace(final byte[] image) {
    }

    @Override
    public void train() {
    }
}
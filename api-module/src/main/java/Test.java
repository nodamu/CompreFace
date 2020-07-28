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

import api.IFRS;
import impl.FRS;
import impl.Model;
import java.util.List;

public class Test {

    void exampleFrs() {
        //        FRS frs1 = new FRSImpl("host", "port");

        // если у нас много параметров (в т.ч. необязательных)
        // если не указано - то дефолтное значение

        Model model1 = Model.builder()
                            .name("model1")
                            .build();
        Model model2 = Model.builder()
                            .name("model2")
                            .build();
        Model model3 = Model.builder()
                            .name("model3")
                            .build();

        IFRS frs = FRS.builder()
                      .host("host")
                      .port("port")
                      .models(List.of(
                                 model1,
                                 model2,
                                 model3
                         ))
                      .build();

        model1.addFace();
        model1.train();
        model1.predict();
    }
}

/*
 * Copyright 2015 Christian Basler
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

package ch.dissem.bitmessage.utils;

import ch.dissem.bitmessage.ports.Cryptography;

/**
 * @author Christian Basler
 */
public class Singleton {
    private static Cryptography cryptography;

    public static void initialize(Cryptography cryptography) {
        synchronized (Singleton.class) {
            Singleton.cryptography = cryptography;
        }
    }

    public static Cryptography cryptography() {
        return cryptography;
    }
}

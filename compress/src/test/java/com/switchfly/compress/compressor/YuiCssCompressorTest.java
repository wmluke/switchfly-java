/*
 * Copyright 2012 Switchfly
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

package com.switchfly.compress.compressor;

import com.switchfly.compress.TestingUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YuiCssCompressorTest {
    @Test
    public void testCompress() throws Exception {

        String uncompressed = TestingUtil.readFile(getClass(), "uncompressed.css.txt");
        String expected = TestingUtil.readFile(getClass(), "YuiCssCompressorTest_compressed.css.txt");

        YuiCssCompressor packager = new YuiCssCompressor();

        String compressed = packager.compress(uncompressed, "uncompressed.css.txt");
        assertEquals(expected, compressed);
    }
}

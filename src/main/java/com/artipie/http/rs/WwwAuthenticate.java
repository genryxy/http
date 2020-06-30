/*
 * MIT License
 *
 * Copyright (c) 2020 Artipie
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.artipie.http.rs;

import com.artipie.http.Headers;
import com.artipie.http.rq.RqHeaders;

/**
 * WWW-Authenticate header.
 *
 * @since 0.11
 */
public final class WwwAuthenticate extends Header.Wrap {

    /**
     * Header name.
     */
    public static final String NAME = "WWW-Authenticate";

    /**
     * Ctor.
     *
     * @param value Header value.
     */
    public WwwAuthenticate(final String value) {
        super(new Header(WwwAuthenticate.NAME, value));
    }

    /**
     * Ctor.
     *
     * @param headers Headers to extract header from.
     */
    public WwwAuthenticate(final Headers headers) {
        this(new RqHeaders.Single(headers, WwwAuthenticate.NAME).asString());
    }
}

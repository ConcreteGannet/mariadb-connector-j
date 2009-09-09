/*
 * Drizzle JDBC
 *
 * Copyright (C) 2009 Marcus Eriksson (krummas@gmail.com)
 * All rights reserved.
 *
 * Use and distribution licensed under the BSD license.
 */

package org.drizzle.jdbc.internal.common.query.parameters;

import java.io.IOException;
import java.io.OutputStream;

/**
 * . User: marcuse Date: Feb 19, 2009 Time: 8:50:52 PM
 */
public class LongParameter implements ParameterHolder {
    private final byte[] byteRepresentation;

    public LongParameter(final long theLong) {
        byteRepresentation = String.valueOf(theLong).getBytes();
    }

    public void writeTo(final OutputStream os) throws IOException {
        for (final byte b : byteRepresentation) {
            os.write(b);
        }
    }

    public long length() {
        return byteRepresentation.length;
    }
}

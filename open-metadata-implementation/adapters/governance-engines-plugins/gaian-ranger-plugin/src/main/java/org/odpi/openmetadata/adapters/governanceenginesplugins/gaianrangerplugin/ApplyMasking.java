/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.adapters.governanceenginesplugins.gaianrangerplugin;

import org.apache.derby.iapi.error.StandardException;
import org.apache.derby.iapi.types.DataValueDescriptor;
import org.apache.derby.iapi.types.TypeId;

import java.sql.Date;
import java.sql.Types;

public class ApplyMasking {

    public static void redact(DataValueDescriptor dataValueDescriptor) throws StandardException {


        if (dataValueDescriptor == null) return;
        int jdbcType = TypeId.getBuiltInTypeId(dataValueDescriptor.getTypeName()).getJDBCTypeId();
        switch (jdbcType) {
            case Types.CHAR:
            case Types.VARCHAR:
            case Types.LONGVARCHAR:
            case Types.CLOB:
                dataValueDescriptor.setValue("####");
                break;
            case Types.DATE:
            case Types.TIME:
            case Types.TIMESTAMP:
                dataValueDescriptor.setValue(new Date(0));
                break;
            case Types.INTEGER:
            case Types.DOUBLE:
            case Types.DECIMAL:
            case Types.FLOAT:
                dataValueDescriptor.setValue(1111);
                break;
            default:
                dataValueDescriptor.setValue("Masked");
        }
    }
}
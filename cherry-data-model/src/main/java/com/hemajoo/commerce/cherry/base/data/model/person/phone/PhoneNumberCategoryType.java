/*
 * (C) Copyright Hemajoo Systems Inc.  2022 - All Rights Reserved
 * -----------------------------------------------------------------------------------------------
 * All information contained herein is, and remains the property of
 * Hemajoo Inc. and its suppliers, if any. The intellectual and technical
 * concepts contained herein are proprietary to Hemajoo Inc. and its
 * suppliers and may be covered by U.S. and Foreign Patents, patents
 * in process, and are protected by trade secret or copyright law.
 *
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained from
 * Hemajoo Systems Inc.
 * -----------------------------------------------------------------------------------------------
 */
package com.hemajoo.commerce.cherry.base.data.model.person.phone;

import com.hemajoo.commerce.cherry.base.data.model.person.address.AddressType;

/**
 * Enumeration representing the several possible <b>phone number category</b> types.
 * @author <a href="mailto:christophe.resse@gmail.com">Christophe Resse</a>
 * @version 1.0.0
 */
public enum PhoneNumberCategoryType
{
    /**
     * <b>Fix</b> phone number.
     */
    FIX,

    /**
     * <b>Mobile</b> phone number.
     */
    MOBILE,

    /**
     * <b>Fax</b> phone number.
     */
    FAX;

    /**
     * Return if the given value is valid?
     * @param name Value.
     * @return <b>True</b> if the value is valid, <b>false</b> otherwise.
     */
    public static boolean isValid(String name)
    {
        for (AddressType value : AddressType.values())
        {
            if (value.name().equals(name))
            {
                return true;
            }
        }

        return false;
    }
}

package com.google.type;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import p324o0O0ooo.o00O0OOO;

/* JADX INFO: loaded from: classes2.dex */
public enum Month implements ProtocolMessageEnum {
    MONTH_UNSPECIFIED(0),
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12),
    UNRECOGNIZED(-1);

    public static final int APRIL_VALUE = 4;
    public static final int AUGUST_VALUE = 8;
    public static final int DECEMBER_VALUE = 12;
    public static final int FEBRUARY_VALUE = 2;
    public static final int JANUARY_VALUE = 1;
    public static final int JULY_VALUE = 7;
    public static final int JUNE_VALUE = 6;
    public static final int MARCH_VALUE = 3;
    public static final int MAY_VALUE = 5;
    public static final int MONTH_UNSPECIFIED_VALUE = 0;
    public static final int NOVEMBER_VALUE = 11;
    public static final int OCTOBER_VALUE = 10;
    public static final int SEPTEMBER_VALUE = 9;
    private final int value;
    private static final Internal.EnumLiteMap<Month> internalValueMap = new OooO00o();
    private static final Month[] VALUES = values();

    public static class OooO00o implements Internal.EnumLiteMap<Month> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            switch (i) {
                case 0:
                    return Month.MONTH_UNSPECIFIED;
                case 1:
                    return Month.JANUARY;
                case 2:
                    return Month.FEBRUARY;
                case 3:
                    return Month.MARCH;
                case 4:
                    return Month.APRIL;
                case 5:
                    return Month.MAY;
                case 6:
                    return Month.JUNE;
                case 7:
                    return Month.JULY;
                case 8:
                    return Month.AUGUST;
                case 9:
                    return Month.SEPTEMBER;
                case 10:
                    return Month.OCTOBER;
                case 11:
                    return Month.NOVEMBER;
                case 12:
                    return Month.DECEMBER;
                default:
                    Month month = Month.MONTH_UNSPECIFIED;
                    return null;
            }
        }
    }

    Month(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return o00O0OOO.f42942OooO00o.getEnumTypes().get(0);
    }

    @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // com.google.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        if (this != UNRECOGNIZED) {
            return o00O0OOO.f42942OooO00o.getEnumTypes().get(0).getValues().get(ordinal());
        }
        throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
    }
}

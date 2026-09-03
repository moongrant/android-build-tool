package com.google.type;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import p330o0O0oooo.o0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
public enum DayOfWeek implements ProtocolMessageEnum {
    DAY_OF_WEEK_UNSPECIFIED(0),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7),
    UNRECOGNIZED(-1);

    public static final int DAY_OF_WEEK_UNSPECIFIED_VALUE = 0;
    public static final int FRIDAY_VALUE = 5;
    public static final int MONDAY_VALUE = 1;
    public static final int SATURDAY_VALUE = 6;
    public static final int SUNDAY_VALUE = 7;
    public static final int THURSDAY_VALUE = 4;
    public static final int TUESDAY_VALUE = 2;
    public static final int WEDNESDAY_VALUE = 3;
    private final int value;
    private static final Internal.EnumLiteMap<DayOfWeek> internalValueMap = new OooO00o();
    private static final DayOfWeek[] VALUES = values();

    public static class OooO00o implements Internal.EnumLiteMap<DayOfWeek> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            switch (i) {
                case 0:
                    return DayOfWeek.DAY_OF_WEEK_UNSPECIFIED;
                case 1:
                    return DayOfWeek.MONDAY;
                case 2:
                    return DayOfWeek.TUESDAY;
                case 3:
                    return DayOfWeek.WEDNESDAY;
                case 4:
                    return DayOfWeek.THURSDAY;
                case 5:
                    return DayOfWeek.FRIDAY;
                case 6:
                    return DayOfWeek.SATURDAY;
                case 7:
                    return DayOfWeek.SUNDAY;
                default:
                    DayOfWeek dayOfWeek = DayOfWeek.DAY_OF_WEEK_UNSPECIFIED;
                    return null;
            }
        }
    }

    DayOfWeek(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return o0o0Oo.f42137OooO00o.getEnumTypes().get(0);
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
            return o0o0Oo.f42137OooO00o.getEnumTypes().get(0).getValues().get(ordinal());
        }
        throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
    }
}

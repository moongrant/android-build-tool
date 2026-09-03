package com.google.type;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import p324o0O0ooo.o00O00O;

/* JADX INFO: loaded from: classes2.dex */
public enum CalendarPeriod implements ProtocolMessageEnum {
    CALENDAR_PERIOD_UNSPECIFIED(0),
    DAY(1),
    WEEK(2),
    FORTNIGHT(3),
    MONTH(4),
    QUARTER(5),
    HALF(6),
    YEAR(7),
    UNRECOGNIZED(-1);

    public static final int CALENDAR_PERIOD_UNSPECIFIED_VALUE = 0;
    public static final int DAY_VALUE = 1;
    public static final int FORTNIGHT_VALUE = 3;
    public static final int HALF_VALUE = 6;
    public static final int MONTH_VALUE = 4;
    public static final int QUARTER_VALUE = 5;
    public static final int WEEK_VALUE = 2;
    public static final int YEAR_VALUE = 7;
    private final int value;
    private static final Internal.EnumLiteMap<CalendarPeriod> internalValueMap = new OooO00o();
    private static final CalendarPeriod[] VALUES = values();

    public static class OooO00o implements Internal.EnumLiteMap<CalendarPeriod> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            switch (i) {
                case 0:
                    return CalendarPeriod.CALENDAR_PERIOD_UNSPECIFIED;
                case 1:
                    return CalendarPeriod.DAY;
                case 2:
                    return CalendarPeriod.WEEK;
                case 3:
                    return CalendarPeriod.FORTNIGHT;
                case 4:
                    return CalendarPeriod.MONTH;
                case 5:
                    return CalendarPeriod.QUARTER;
                case 6:
                    return CalendarPeriod.HALF;
                case 7:
                    return CalendarPeriod.YEAR;
                default:
                    CalendarPeriod calendarPeriod = CalendarPeriod.CALENDAR_PERIOD_UNSPECIFIED;
                    return null;
            }
        }
    }

    CalendarPeriod(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return o00O00O.f42924OooO00o.getEnumTypes().get(0);
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
            return o00O00O.f42924OooO00o.getEnumTypes().get(0).getValues().get(ordinal());
        }
        throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
    }
}

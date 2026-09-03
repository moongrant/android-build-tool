package com.google.logging.type;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import p317o0O0oo.o0Oo0oo;

/* JADX INFO: loaded from: classes3.dex */
public enum LogSeverity implements ProtocolMessageEnum {
    DEFAULT(0),
    DEBUG(100),
    INFO(200),
    NOTICE(300),
    WARNING(400),
    ERROR(500),
    CRITICAL(600),
    ALERT(ALERT_VALUE),
    EMERGENCY(EMERGENCY_VALUE),
    UNRECOGNIZED(-1);

    public static final int ALERT_VALUE = 700;
    public static final int CRITICAL_VALUE = 600;
    public static final int DEBUG_VALUE = 100;
    public static final int DEFAULT_VALUE = 0;
    public static final int EMERGENCY_VALUE = 800;
    public static final int ERROR_VALUE = 500;
    public static final int INFO_VALUE = 200;
    public static final int NOTICE_VALUE = 300;
    public static final int WARNING_VALUE = 400;
    private final int value;
    private static final Internal.EnumLiteMap<LogSeverity> internalValueMap = new OooO00o();
    private static final LogSeverity[] VALUES = values();

    public static class OooO00o implements Internal.EnumLiteMap<LogSeverity> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            if (i == 0) {
                return LogSeverity.DEFAULT;
            }
            if (i == 100) {
                return LogSeverity.DEBUG;
            }
            if (i == 200) {
                return LogSeverity.INFO;
            }
            if (i == 300) {
                return LogSeverity.NOTICE;
            }
            if (i == 400) {
                return LogSeverity.WARNING;
            }
            if (i == 500) {
                return LogSeverity.ERROR;
            }
            if (i == 600) {
                return LogSeverity.CRITICAL;
            }
            if (i == 700) {
                return LogSeverity.ALERT;
            }
            if (i == 800) {
                return LogSeverity.EMERGENCY;
            }
            LogSeverity logSeverity = LogSeverity.DEFAULT;
            return null;
        }
    }

    LogSeverity(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return o0Oo0oo.f42601OooO00o.getEnumTypes().get(0);
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
            return o0Oo0oo.f42601OooO00o.getEnumTypes().get(0).getValues().get(ordinal());
        }
        throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
    }
}

package com.google.api;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import p320o0O0oo0o.o00oOoo;

/* JADX INFO: loaded from: classes3.dex */
public enum ErrorReason implements ProtocolMessageEnum {
    ERROR_REASON_UNSPECIFIED(0),
    SERVICE_DISABLED(1),
    BILLING_DISABLED(2),
    API_KEY_INVALID(3),
    API_KEY_SERVICE_BLOCKED(4),
    API_KEY_HTTP_REFERRER_BLOCKED(7),
    API_KEY_IP_ADDRESS_BLOCKED(8),
    API_KEY_ANDROID_APP_BLOCKED(9),
    API_KEY_IOS_APP_BLOCKED(13),
    RATE_LIMIT_EXCEEDED(5),
    RESOURCE_QUOTA_EXCEEDED(6),
    LOCATION_TAX_POLICY_VIOLATED(10),
    USER_PROJECT_DENIED(11),
    CONSUMER_SUSPENDED(12),
    CONSUMER_INVALID(14),
    SECURITY_POLICY_VIOLATED(15),
    ACCESS_TOKEN_EXPIRED(16),
    ACCESS_TOKEN_SCOPE_INSUFFICIENT(17),
    ACCOUNT_STATE_INVALID(18),
    ACCESS_TOKEN_TYPE_UNSUPPORTED(19),
    UNRECOGNIZED(-1);

    public static final int ACCESS_TOKEN_EXPIRED_VALUE = 16;
    public static final int ACCESS_TOKEN_SCOPE_INSUFFICIENT_VALUE = 17;
    public static final int ACCESS_TOKEN_TYPE_UNSUPPORTED_VALUE = 19;
    public static final int ACCOUNT_STATE_INVALID_VALUE = 18;
    public static final int API_KEY_ANDROID_APP_BLOCKED_VALUE = 9;
    public static final int API_KEY_HTTP_REFERRER_BLOCKED_VALUE = 7;
    public static final int API_KEY_INVALID_VALUE = 3;
    public static final int API_KEY_IOS_APP_BLOCKED_VALUE = 13;
    public static final int API_KEY_IP_ADDRESS_BLOCKED_VALUE = 8;
    public static final int API_KEY_SERVICE_BLOCKED_VALUE = 4;
    public static final int BILLING_DISABLED_VALUE = 2;
    public static final int CONSUMER_INVALID_VALUE = 14;
    public static final int CONSUMER_SUSPENDED_VALUE = 12;
    public static final int ERROR_REASON_UNSPECIFIED_VALUE = 0;
    public static final int LOCATION_TAX_POLICY_VIOLATED_VALUE = 10;
    public static final int RATE_LIMIT_EXCEEDED_VALUE = 5;
    public static final int RESOURCE_QUOTA_EXCEEDED_VALUE = 6;
    public static final int SECURITY_POLICY_VIOLATED_VALUE = 15;
    public static final int SERVICE_DISABLED_VALUE = 1;
    public static final int USER_PROJECT_DENIED_VALUE = 11;
    private final int value;
    private static final Internal.EnumLiteMap<ErrorReason> internalValueMap = new OooO00o();
    private static final ErrorReason[] VALUES = values();

    public static class OooO00o implements Internal.EnumLiteMap<ErrorReason> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            switch (i) {
                case 0:
                    return ErrorReason.ERROR_REASON_UNSPECIFIED;
                case 1:
                    return ErrorReason.SERVICE_DISABLED;
                case 2:
                    return ErrorReason.BILLING_DISABLED;
                case 3:
                    return ErrorReason.API_KEY_INVALID;
                case 4:
                    return ErrorReason.API_KEY_SERVICE_BLOCKED;
                case 5:
                    return ErrorReason.RATE_LIMIT_EXCEEDED;
                case 6:
                    return ErrorReason.RESOURCE_QUOTA_EXCEEDED;
                case 7:
                    return ErrorReason.API_KEY_HTTP_REFERRER_BLOCKED;
                case 8:
                    return ErrorReason.API_KEY_IP_ADDRESS_BLOCKED;
                case 9:
                    return ErrorReason.API_KEY_ANDROID_APP_BLOCKED;
                case 10:
                    return ErrorReason.LOCATION_TAX_POLICY_VIOLATED;
                case 11:
                    return ErrorReason.USER_PROJECT_DENIED;
                case 12:
                    return ErrorReason.CONSUMER_SUSPENDED;
                case 13:
                    return ErrorReason.API_KEY_IOS_APP_BLOCKED;
                case 14:
                    return ErrorReason.CONSUMER_INVALID;
                case 15:
                    return ErrorReason.SECURITY_POLICY_VIOLATED;
                case 16:
                    return ErrorReason.ACCESS_TOKEN_EXPIRED;
                case 17:
                    return ErrorReason.ACCESS_TOKEN_SCOPE_INSUFFICIENT;
                case 18:
                    return ErrorReason.ACCOUNT_STATE_INVALID;
                case 19:
                    return ErrorReason.ACCESS_TOKEN_TYPE_UNSUPPORTED;
                default:
                    ErrorReason errorReason = ErrorReason.ERROR_REASON_UNSPECIFIED;
                    return null;
            }
        }
    }

    ErrorReason(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return o00oOoo.f42819OooO00o.getEnumTypes().get(0);
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
            return o00oOoo.f42819OooO00o.getEnumTypes().get(0).getValues().get(ordinal());
        }
        throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
    }
}

package com.google.cloud;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* JADX INFO: loaded from: classes3.dex */
public enum OperationResponseMapping implements ProtocolMessageEnum {
    UNDEFINED(0),
    NAME(1),
    STATUS(2),
    ERROR_CODE(3),
    ERROR_MESSAGE(4),
    UNRECOGNIZED(-1);

    public static final int ERROR_CODE_VALUE = 3;
    public static final int ERROR_MESSAGE_VALUE = 4;
    public static final int NAME_VALUE = 1;
    public static final int STATUS_VALUE = 2;
    public static final int UNDEFINED_VALUE = 0;
    private final int value;
    private static final Internal.EnumLiteMap<OperationResponseMapping> internalValueMap = new OooO00o();
    private static final OperationResponseMapping[] VALUES = values();

    public static class OooO00o implements Internal.EnumLiteMap<OperationResponseMapping> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            if (i == 0) {
                return OperationResponseMapping.UNDEFINED;
            }
            if (i == 1) {
                return OperationResponseMapping.NAME;
            }
            if (i == 2) {
                return OperationResponseMapping.STATUS;
            }
            if (i == 3) {
                return OperationResponseMapping.ERROR_CODE;
            }
            if (i == 4) {
                return OperationResponseMapping.ERROR_MESSAGE;
            }
            OperationResponseMapping operationResponseMapping = OperationResponseMapping.UNDEFINED;
            return null;
        }
    }

    OperationResponseMapping(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return o0O0O0o0.OooO00o.f41322OooO00o.getEnumTypes().get(0);
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
            return o0O0O0o0.OooO00o.f41322OooO00o.getEnumTypes().get(0).getValues().get(ordinal());
        }
        throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
    }
}

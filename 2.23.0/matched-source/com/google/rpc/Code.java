package com.google.rpc;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import p323o0O0ooOO.o00OO0OO;

/* JADX INFO: loaded from: classes3.dex */
public enum Code implements ProtocolMessageEnum {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    UNAUTHENTICATED(16),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNRECOGNIZED(-1);

    public static final int ABORTED_VALUE = 10;
    public static final int ALREADY_EXISTS_VALUE = 6;
    public static final int CANCELLED_VALUE = 1;
    public static final int DATA_LOSS_VALUE = 15;
    public static final int DEADLINE_EXCEEDED_VALUE = 4;
    public static final int FAILED_PRECONDITION_VALUE = 9;
    public static final int INTERNAL_VALUE = 13;
    public static final int INVALID_ARGUMENT_VALUE = 3;
    public static final int NOT_FOUND_VALUE = 5;
    public static final int OK_VALUE = 0;
    public static final int OUT_OF_RANGE_VALUE = 11;
    public static final int PERMISSION_DENIED_VALUE = 7;
    public static final int RESOURCE_EXHAUSTED_VALUE = 8;
    public static final int UNAUTHENTICATED_VALUE = 16;
    public static final int UNAVAILABLE_VALUE = 14;
    public static final int UNIMPLEMENTED_VALUE = 12;
    public static final int UNKNOWN_VALUE = 2;
    private final int value;
    private static final Internal.EnumLiteMap<Code> internalValueMap = new OooO00o();
    private static final Code[] VALUES = values();

    public static class OooO00o implements Internal.EnumLiteMap<Code> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            switch (i) {
                case 0:
                    return Code.OK;
                case 1:
                    return Code.CANCELLED;
                case 2:
                    return Code.UNKNOWN;
                case 3:
                    return Code.INVALID_ARGUMENT;
                case 4:
                    return Code.DEADLINE_EXCEEDED;
                case 5:
                    return Code.NOT_FOUND;
                case 6:
                    return Code.ALREADY_EXISTS;
                case 7:
                    return Code.PERMISSION_DENIED;
                case 8:
                    return Code.RESOURCE_EXHAUSTED;
                case 9:
                    return Code.FAILED_PRECONDITION;
                case 10:
                    return Code.ABORTED;
                case 11:
                    return Code.OUT_OF_RANGE;
                case 12:
                    return Code.UNIMPLEMENTED;
                case 13:
                    return Code.INTERNAL;
                case 14:
                    return Code.UNAVAILABLE;
                case 15:
                    return Code.DATA_LOSS;
                case 16:
                    return Code.UNAUTHENTICATED;
                default:
                    Code code = Code.OK;
                    return null;
            }
        }
    }

    Code(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return o00OO0OO.f42890OooO00o.getEnumTypes().get(0);
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
            return o00OO0OO.f42890OooO00o.getEnumTypes().get(0).getValues().get(ordinal());
        }
        throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
    }
}

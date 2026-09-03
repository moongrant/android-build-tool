package com.google.api;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import o0O0O0Oo.OooOO0O;

/* JADX INFO: loaded from: classes3.dex */
public enum ChangeType implements ProtocolMessageEnum {
    CHANGE_TYPE_UNSPECIFIED(0),
    ADDED(1),
    REMOVED(2),
    MODIFIED(3),
    UNRECOGNIZED(-1);

    public static final int ADDED_VALUE = 1;
    public static final int CHANGE_TYPE_UNSPECIFIED_VALUE = 0;
    public static final int MODIFIED_VALUE = 3;
    public static final int REMOVED_VALUE = 2;
    private final int value;
    private static final Internal.EnumLiteMap<ChangeType> internalValueMap = new OooO00o();
    private static final ChangeType[] VALUES = values();

    public static class OooO00o implements Internal.EnumLiteMap<ChangeType> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            if (i == 0) {
                return ChangeType.CHANGE_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return ChangeType.ADDED;
            }
            if (i == 2) {
                return ChangeType.REMOVED;
            }
            if (i == 3) {
                return ChangeType.MODIFIED;
            }
            ChangeType changeType = ChangeType.CHANGE_TYPE_UNSPECIFIED;
            return null;
        }
    }

    ChangeType(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return OooOO0O.f41185OooO0o0.getEnumTypes().get(0);
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
            return OooOO0O.f41185OooO0o0.getEnumTypes().get(0).getValues().get(ordinal());
        }
        throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
    }
}

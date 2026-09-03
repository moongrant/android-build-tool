package com.google.api;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import o0O0O0Oo.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public enum FieldBehavior implements ProtocolMessageEnum {
    FIELD_BEHAVIOR_UNSPECIFIED(0),
    OPTIONAL(1),
    REQUIRED(2),
    OUTPUT_ONLY(3),
    INPUT_ONLY(4),
    IMMUTABLE(5),
    UNORDERED_LIST(6),
    NON_EMPTY_DEFAULT(7),
    UNRECOGNIZED(-1);

    public static final int FIELD_BEHAVIOR_UNSPECIFIED_VALUE = 0;
    public static final int IMMUTABLE_VALUE = 5;
    public static final int INPUT_ONLY_VALUE = 4;
    public static final int NON_EMPTY_DEFAULT_VALUE = 7;
    public static final int OPTIONAL_VALUE = 1;
    public static final int OUTPUT_ONLY_VALUE = 3;
    public static final int REQUIRED_VALUE = 2;
    public static final int UNORDERED_LIST_VALUE = 6;
    private final int value;
    private static final Internal.EnumLiteMap<FieldBehavior> internalValueMap = new OooO00o();
    private static final FieldBehavior[] VALUES = values();

    public static class OooO00o implements Internal.EnumLiteMap<FieldBehavior> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            switch (i) {
                case 0:
                    return FieldBehavior.FIELD_BEHAVIOR_UNSPECIFIED;
                case 1:
                    return FieldBehavior.OPTIONAL;
                case 2:
                    return FieldBehavior.REQUIRED;
                case 3:
                    return FieldBehavior.OUTPUT_ONLY;
                case 4:
                    return FieldBehavior.INPUT_ONLY;
                case 5:
                    return FieldBehavior.IMMUTABLE;
                case 6:
                    return FieldBehavior.UNORDERED_LIST;
                case 7:
                    return FieldBehavior.NON_EMPTY_DEFAULT;
                default:
                    FieldBehavior fieldBehavior = FieldBehavior.FIELD_BEHAVIOR_UNSPECIFIED;
                    return null;
            }
        }
    }

    FieldBehavior(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return o000oOoO.f41239OooO00o.getEnumTypes().get(0);
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
            return o000oOoO.f41239OooO00o.getEnumTypes().get(0).getValues().get(ordinal());
        }
        throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
    }
}

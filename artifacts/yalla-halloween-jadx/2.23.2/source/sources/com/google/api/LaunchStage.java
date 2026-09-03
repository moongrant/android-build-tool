package com.google.api;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import o0O0O0Oo.o00Ooo;

/* JADX INFO: loaded from: classes3.dex */
public enum LaunchStage implements ProtocolMessageEnum {
    LAUNCH_STAGE_UNSPECIFIED(0),
    UNIMPLEMENTED(6),
    PRELAUNCH(7),
    EARLY_ACCESS(1),
    ALPHA(2),
    BETA(3),
    GA(4),
    DEPRECATED(5),
    UNRECOGNIZED(-1);

    public static final int ALPHA_VALUE = 2;
    public static final int BETA_VALUE = 3;
    public static final int DEPRECATED_VALUE = 5;
    public static final int EARLY_ACCESS_VALUE = 1;
    public static final int GA_VALUE = 4;
    public static final int LAUNCH_STAGE_UNSPECIFIED_VALUE = 0;
    public static final int PRELAUNCH_VALUE = 7;
    public static final int UNIMPLEMENTED_VALUE = 6;
    private final int value;
    private static final Internal.EnumLiteMap<LaunchStage> internalValueMap = new OooO00o();
    private static final LaunchStage[] VALUES = values();

    public static class OooO00o implements Internal.EnumLiteMap<LaunchStage> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            switch (i) {
                case 0:
                    return LaunchStage.LAUNCH_STAGE_UNSPECIFIED;
                case 1:
                    return LaunchStage.EARLY_ACCESS;
                case 2:
                    return LaunchStage.ALPHA;
                case 3:
                    return LaunchStage.BETA;
                case 4:
                    return LaunchStage.GA;
                case 5:
                    return LaunchStage.DEPRECATED;
                case 6:
                    return LaunchStage.UNIMPLEMENTED;
                case 7:
                    return LaunchStage.PRELAUNCH;
                default:
                    LaunchStage launchStage = LaunchStage.LAUNCH_STAGE_UNSPECIFIED;
                    return null;
            }
        }
    }

    LaunchStage(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return o00Ooo.f41255OooO00o.getEnumTypes().get(0);
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
            return o00Ooo.f41255OooO00o.getEnumTypes().get(0).getValues().get(ordinal());
        }
        throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
    }
}

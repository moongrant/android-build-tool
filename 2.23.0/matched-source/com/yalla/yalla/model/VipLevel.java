package com.yalla.yalla.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/yalla/yalla/model/VipLevel;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "(Ljava/lang/String;II)V", "getValue", "()I", "level", "Vip0", "Vip1", "Vip2", "Vip3", "Vip4", "Vip5", "Vip6", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum VipLevel {
    Vip0(0),
    Vip1(100),
    Vip2(200),
    Vip3(300),
    Vip4(400),
    Vip5(500),
    Vip6(600);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/yalla/yalla/model/VipLevel$Companion;", "", "()V", "of", "Lcom/yalla/yalla/model/VipLevel;", "level", "", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final VipLevel of(int level) {
            if (level != 100) {
                if (level != 200) {
                    if (level != 300) {
                        if (level != 400) {
                            if (level != 500) {
                                if (level != 600) {
                                    switch (level) {
                                        case 0:
                                            return VipLevel.Vip0;
                                        case 1:
                                            break;
                                        case 2:
                                            break;
                                        case 3:
                                            break;
                                        case 4:
                                            break;
                                        case 5:
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            return VipLevel.Vip0;
                                    }
                                }
                                return VipLevel.Vip6;
                            }
                            return VipLevel.Vip5;
                        }
                        return VipLevel.Vip4;
                    }
                    return VipLevel.Vip3;
                }
                return VipLevel.Vip2;
            }
            return VipLevel.Vip1;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VipLevel.values().length];
            try {
                iArr[VipLevel.Vip0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VipLevel.Vip1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VipLevel.Vip2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VipLevel.Vip3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VipLevel.Vip4.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VipLevel.Vip5.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VipLevel.Vip6.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    VipLevel(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    public final int level() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}

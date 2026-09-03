package com.yalla.yalla.model;

import com.code.android.util.o0000;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.logging.type.LogSeverity;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p565o0oOo000.o000OOo;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0003J\u0006\u0010\b\u001a\u00020\u0003J\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, d2 = {"Lcom/yalla/yalla/model/PremiumLevel;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "(Ljava/lang/String;II)V", "getValue", "()I", "index", "level", "premiumName", "", "Premium0", "Premium1", "Premium2", "Premium3", "Premium4", "Premium5", "Premium6", "Premium7", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum PremiumLevel {
    Premium0(0),
    Premium1(100),
    Premium2(200),
    Premium3(300),
    Premium4(400),
    Premium5(500),
    Premium6(600),
    Premium7(LogSeverity.ALERT_VALUE);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/model/PremiumLevel$Companion;", "", "()V", "of", "Lcom/yalla/yalla/model/PremiumLevel;", "level", "", "(Ljava/lang/Integer;)Lcom/yalla/yalla/model/PremiumLevel;", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PremiumLevel of(@Nullable Integer level) {
            if (level != null && level.intValue() == 0) {
                return PremiumLevel.Premium0;
            }
            boolean z = false;
            if ((level != null && level.intValue() == 1) || (level != null && level.intValue() == 100)) {
                return PremiumLevel.Premium1;
            }
            if ((level != null && level.intValue() == 2) || (level != null && level.intValue() == 200)) {
                return PremiumLevel.Premium2;
            }
            if ((level != null && level.intValue() == 3) || (level != null && level.intValue() == 300)) {
                return PremiumLevel.Premium3;
            }
            if ((level != null && level.intValue() == 4) || (level != null && level.intValue() == 400)) {
                return PremiumLevel.Premium4;
            }
            if ((level != null && level.intValue() == 5) || (level != null && level.intValue() == 500)) {
                return PremiumLevel.Premium5;
            }
            if ((level != null && level.intValue() == 6) || (level != null && level.intValue() == 600)) {
                return PremiumLevel.Premium5;
            }
            if ((level != null && level.intValue() == 7) || (level != null && level.intValue() == 700)) {
                z = true;
            }
            return z ? PremiumLevel.Premium5 : PremiumLevel.Premium0;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PremiumLevel.values().length];
            try {
                iArr[PremiumLevel.Premium0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PremiumLevel.Premium1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PremiumLevel.Premium2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PremiumLevel.Premium3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PremiumLevel.Premium4.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PremiumLevel.Premium5.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PremiumLevel.Premium6.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PremiumLevel.Premium7.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    PremiumLevel(int i) {
        this.value = i;
    }

    @NotNull
    public static EnumEntries<PremiumLevel> getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }

    public final int index() {
        return Math.max(level() - 1, 0);
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
            case 8:
                return 7;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public final String premiumName() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 2) {
            return o0000.OooO0OO(o000OOo.Patrician);
        }
        if (i == 3) {
            return o0000.OooO0OO(o000OOo.Knight);
        }
        if (i == 4) {
            return o0000.OooO0OO(o000OOo.Baron);
        }
        if (i != 5) {
            return i != 6 ? "" : o0000.OooO0OO(o000OOo.Marquis);
        }
        return o0000.OooO0OO(o000OOo.Count);
    }
}

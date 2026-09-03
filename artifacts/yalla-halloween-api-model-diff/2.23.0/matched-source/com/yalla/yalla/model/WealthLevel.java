package com.yalla.yalla.model;

import com.code.android.util.o0OoOo0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/model/WealthLevel;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "(Ljava/lang/String;II)V", "getValue", "()I", "Wealth0", "Wealth1", "Wealth2", "Wealth3", "Wealth4", "Wealth5", "Wealth6", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum WealthLevel {
    Wealth0(0),
    Wealth1(1),
    Wealth2(2),
    Wealth3(3),
    Wealth4(4),
    Wealth5(5),
    Wealth6(6);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u0018\u0010\b\u001a\u00020\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/model/WealthLevel$Companion;", "", "()V", "isNormal", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function0;", "", "isUnlocked", "of", "Lcom/yalla/yalla/model/WealthLevel;", "level", "", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ boolean isNormal$default(Companion companion, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                function0 = null;
            }
            return companion.isNormal(function0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ boolean isUnlocked$default(Companion companion, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                function0 = null;
            }
            return companion.isUnlocked(function0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean isNormal(@Nullable Function0<Unit> listener) {
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (!o0OoOo0.OooO00o((Boolean) o000000O.OooOo().getValue())) {
                return false;
            }
            Integer num = (Integer) o000000O.OooO0oO().getValue();
            Integer numValueOf = num != null ? Integer.valueOf(o0OoOo0.OooO0o0(0, num)) : null;
            Intrinsics.checkNotNull(numValueOf);
            if (numValueOf.intValue() <= WealthLevel.Wealth0.getValue()) {
                return false;
            }
            if (listener != null) {
                listener.invoke();
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean isUnlocked(@Nullable Function0<Unit> listener) {
            o000000O o000000o2 = o000000O.f46674OooO00o;
            Integer num = (Integer) o000000O.OooO0oO().getValue();
            Integer numValueOf = num != null ? Integer.valueOf(o0OoOo0.OooO0o0(0, num)) : null;
            Intrinsics.checkNotNull(numValueOf);
            if (numValueOf.intValue() <= WealthLevel.Wealth0.getValue()) {
                return false;
            }
            if (listener != null) {
                listener.invoke();
            }
            return true;
        }

        @NotNull
        public final WealthLevel of(int level) {
            switch (level) {
                case 0:
                    return WealthLevel.Wealth0;
                case 1:
                    return WealthLevel.Wealth1;
                case 2:
                    return WealthLevel.Wealth2;
                case 3:
                    return WealthLevel.Wealth3;
                case 4:
                    return WealthLevel.Wealth4;
                case 5:
                    return WealthLevel.Wealth5;
                case 6:
                    return WealthLevel.Wealth6;
                default:
                    return WealthLevel.Wealth0;
            }
        }
    }

    WealthLevel(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}

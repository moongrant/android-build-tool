package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0OoOo0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u0018\u0010\b\u001a\u00020\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u0018\u0010\t\u001a\u00020\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¨\u0006\n"}, d2 = {"Lcom/yalla/yalla/model/Vip;", "", "()V", "isFrozen", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function0;", "", "isNormal", "isNotVip", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Vip {
    public static final int $stable = 0;

    @NotNull
    public static final Vip INSTANCE = new Vip();

    private Vip() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean isFrozen$default(Vip vip, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        return vip.isFrozen(function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean isNormal$default(Vip vip, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        return vip.isNormal(function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean isNotVip$default(Vip vip, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        return vip.isNotVip(function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isFrozen(@Nullable Function0<Unit> listener) {
        VipState.Companion companion = VipState.INSTANCE;
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Pair pair = (Pair) o000000O.OooOO0().getValue();
        if (!companion.of(pair != null ? (Integer) pair.getFirst() : null).isFrozen()) {
            return false;
        }
        if (listener != null) {
            listener.invoke();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isNormal(@Nullable Function0<Unit> listener) {
        VipState.Companion companion = VipState.INSTANCE;
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Pair pair = (Pair) o000000O.OooOO0().getValue();
        if (!companion.of(pair != null ? (Integer) pair.getFirst() : null).isNormal()) {
            Pair pair2 = (Pair) o000000O.OooOO0().getValue();
            if (o0OoOo0.OooO0o0(0, pair2 != null ? (Integer) pair2.getSecond() : null) <= VipLevel.Vip0.level()) {
                return false;
            }
        }
        if (listener != null) {
            listener.invoke();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isNotVip(@Nullable Function0<Unit> listener) {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Pair pair = (Pair) o000000O.OooOO0().getValue();
        if (o0OoOo0.OooO0o0(0, pair != null ? (Integer) pair.getSecond() : null) > VipLevel.Vip0.level()) {
            return false;
        }
        if (listener != null) {
            listener.invoke();
        }
        return true;
    }
}

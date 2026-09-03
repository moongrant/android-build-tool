package com.yalla.support.common.util;

import android.app.Activity;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p461o0Ooo0Oo.o0000Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends o0000Ooo {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity act, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(act, "act");
        Intrinsics.checkNotNullParameter(act, "act");
        if (OooO0O0.f20504OooO0OO.contains(act.getClass())) {
            return;
        }
        OooO0O0 oooO0O0 = OooO0O0.f20502OooO00o;
        OooO0O0.f20503OooO0O0 = new WeakReference<>(act);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity act) {
        Intrinsics.checkNotNullParameter(act, "act");
        Intrinsics.checkNotNullParameter(act, "act");
        if (OooO0O0.f20504OooO0OO.contains(act.getClass())) {
            return;
        }
        OooO0O0 oooO0O0 = OooO0O0.f20502OooO00o;
        OooO0O0.f20503OooO0O0 = new WeakReference<>(act);
    }
}

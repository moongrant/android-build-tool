package com.code.android.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@SuppressLint({"StaticFieldLeak"})
public final class o000O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static Context f13421OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Handler f13422OooO0O0 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final MutableStateFlow<Boolean> f13423OooO0OO = StateFlowKt.MutableStateFlow(Boolean.FALSE);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static o0ooOOo f13424OooO0Oo;

    @NotNull
    public static Context OooO00o() {
        Context context = f13421OooO00o;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("context");
        return null;
    }
}

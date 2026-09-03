package com.yalla.support.common.util;

import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooOOO0 implements View.OnClickListener {
    private long lastClickTime;

    @Nullable
    private View lastView;
    private final long minDelayTime;

    public OooOOO0() {
        this(0L, 1, null);
    }

    public OooOOO0(long j) {
        this.minDelayTime = j;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View currentView) {
        Intrinsics.checkNotNullParameter(currentView, "currentView");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!Intrinsics.areEqual(this.lastView, currentView) || Math.abs(jCurrentTimeMillis - this.lastClickTime) > this.minDelayTime) {
            this.lastView = currentView;
            this.lastClickTime = jCurrentTimeMillis;
            onNoDoubleClick(currentView);
        }
    }

    public abstract void onNoDoubleClick(@NotNull View view);

    public /* synthetic */ OooOOO0(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 500L : j);
    }
}

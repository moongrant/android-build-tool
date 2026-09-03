package com.code.android.util;

import android.app.Activity;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO {
    public static final boolean OooO00o(@Nullable Activity activity) {
        return (activity == null || activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }
}

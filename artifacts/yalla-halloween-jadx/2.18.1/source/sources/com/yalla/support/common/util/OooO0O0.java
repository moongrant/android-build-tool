package com.yalla.support.common.util;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static WeakReference<Activity> f20503OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO0O0 f20502OooO00o = new OooO0O0();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Set<Class<?>> f20504OooO0OO = new LinkedHashSet();

    public final void OooO00o(@NotNull Class<? extends Activity> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        f20504OooO0OO.add(clazz);
    }

    @Nullable
    public final Activity OooO0O0() {
        WeakReference<Activity> weakReference = f20503OooO0O0;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}

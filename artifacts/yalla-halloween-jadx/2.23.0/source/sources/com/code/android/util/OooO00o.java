package com.code.android.util;

import android.app.Activity;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.Stack;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends OooOOOO {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Stack<Activity> stack = OooO0O0.f10254OooO00o;
        String name = activity.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "activity.javaClass.name");
        if (!StringsKt.OooO0o(name, "com.yalla.yalla")) {
            String name2 = activity.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name2, "activity.javaClass.name");
            if (!StringsKt.OooO0o(name2, "MixedRoomActivity")) {
                String name3 = activity.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name3, "activity.javaClass.name");
                if (!StringsKt.OooO0o(name3, "AlbumActivity")) {
                    String name4 = activity.getClass().getName();
                    Intrinsics.checkNotNullExpressionValue(name4, "activity.javaClass.name");
                    if (!StringsKt.OooO0o(name4, "PreviewImageActivity")) {
                        String name5 = activity.getClass().getName();
                        Intrinsics.checkNotNullExpressionValue(name5, "activity.javaClass.name");
                        if (!StringsKt.OooO0o(name5, "BigImageSelectActivity")) {
                            return;
                        }
                    }
                }
            }
        }
        OooO0O0.f10254OooO00o.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Stack<Activity> stack = OooO0O0.f10254OooO00o;
        if (stack.contains(activity)) {
            stack.remove(activity);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0068  */
    /* JADX WARN: Code duplicated, block: B:14:0x006c  */
    /* JADX WARN: Code duplicated, block: B:15:0x0073  */
    /* JADX WARN: Code duplicated, block: B:18:0x007a  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        WeakReference<Activity> weakReference;
        Activity activity2;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Stack<Activity> stack = OooO0O0.f10254OooO00o;
        String name = activity.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "activity.javaClass.name");
        if (StringsKt.OooO0o(name, "com.yalla.yalla")) {
            weakReference = OooO0O0.f10255OooO0O0;
            if (weakReference != null) {
                activity2 = weakReference.get();
            } else {
                activity2 = null;
            }
            if (!Intrinsics.areEqual(activity2, activity)) {
                OooO0O0.f10255OooO0O0 = new WeakReference<>(activity);
            }
        } else {
            String name2 = activity.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name2, "activity.javaClass.name");
            if (StringsKt.OooO0o(name2, "MixedRoomActivity")) {
                weakReference = OooO0O0.f10255OooO0O0;
                if (weakReference != null) {
                    activity2 = weakReference.get();
                } else {
                    activity2 = null;
                }
                if (!Intrinsics.areEqual(activity2, activity)) {
                    OooO0O0.f10255OooO0O0 = new WeakReference<>(activity);
                }
            } else {
                String name3 = activity.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name3, "activity.javaClass.name");
                if (StringsKt.OooO0o(name3, "AlbumActivity")) {
                    weakReference = OooO0O0.f10255OooO0O0;
                    if (weakReference != null) {
                        activity2 = weakReference.get();
                    } else {
                        activity2 = null;
                    }
                    if (!Intrinsics.areEqual(activity2, activity)) {
                        OooO0O0.f10255OooO0O0 = new WeakReference<>(activity);
                    }
                } else {
                    String name4 = activity.getClass().getName();
                    Intrinsics.checkNotNullExpressionValue(name4, "activity.javaClass.name");
                    if (StringsKt.OooO0o(name4, "PreviewImageActivity")) {
                        weakReference = OooO0O0.f10255OooO0O0;
                        if (weakReference != null) {
                            activity2 = weakReference.get();
                        } else {
                            activity2 = null;
                        }
                        if (!Intrinsics.areEqual(activity2, activity)) {
                            OooO0O0.f10255OooO0O0 = new WeakReference<>(activity);
                        }
                    } else {
                        String name5 = activity.getClass().getName();
                        Intrinsics.checkNotNullExpressionValue(name5, "activity.javaClass.name");
                        if (StringsKt.OooO0o(name5, "BigImageSelectActivity")) {
                            weakReference = OooO0O0.f10255OooO0O0;
                            if (weakReference != null) {
                                activity2 = weakReference.get();
                            } else {
                                activity2 = null;
                            }
                            if (!Intrinsics.areEqual(activity2, activity)) {
                                OooO0O0.f10255OooO0O0 = new WeakReference<>(activity);
                            }
                        }
                    }
                }
            }
        }
        if (OooO0O0.f10256OooO0OO) {
            OooO0O0.f10256OooO0OO = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (OooO0O0.f10259OooO0o0 < 0) {
            OooO0O0.f10259OooO0o0++;
        } else {
            OooO0O0.f10257OooO0Oo++;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity.isChangingConfigurations()) {
            OooO0O0.f10259OooO0o0--;
            return;
        }
        OooO0O0.f10257OooO0Oo--;
        if (OooO0O0.f10257OooO0Oo <= 0) {
            OooO0O0.f10256OooO0OO = true;
        }
    }
}

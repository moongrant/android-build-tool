package com.code.android.util;

import android.app.Activity;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.Stack;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends OooOOOO {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Stack<Activity> stack = OooO0O0.f13314OooO00o;
        String name = activity.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (!StringsKt__StringsKt.contains$default(name, "com.yalla.yalla", false, 2, (Object) null)) {
            String name2 = activity.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
            if (!StringsKt__StringsKt.contains$default(name2, "MixedRoomActivity", false, 2, (Object) null)) {
                String name3 = activity.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
                if (!StringsKt__StringsKt.contains$default(name3, "AlbumActivity", false, 2, (Object) null)) {
                    String name4 = activity.getClass().getName();
                    Intrinsics.checkNotNullExpressionValue(name4, "getName(...)");
                    if (!StringsKt__StringsKt.contains$default(name4, "PreviewImageActivity", false, 2, (Object) null)) {
                        String name5 = activity.getClass().getName();
                        Intrinsics.checkNotNullExpressionValue(name5, "getName(...)");
                        if (!StringsKt__StringsKt.contains$default(name5, "BigImageSelectActivity", false, 2, (Object) null)) {
                            return;
                        }
                    }
                }
            }
        }
        OooO0O0.f13314OooO00o.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Stack<Activity> stack = OooO0O0.f13314OooO00o;
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
        Stack<Activity> stack = OooO0O0.f13314OooO00o;
        String name = activity.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (StringsKt__StringsKt.contains$default(name, "com.yalla.yalla", false, 2, (Object) null)) {
            weakReference = OooO0O0.f13315OooO0O0;
            if (weakReference != null) {
                activity2 = weakReference.get();
            } else {
                activity2 = null;
            }
            if (!Intrinsics.areEqual(activity2, activity)) {
                OooO0O0.f13315OooO0O0 = new WeakReference<>(activity);
            }
        } else {
            String name2 = activity.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
            if (StringsKt__StringsKt.contains$default(name2, "MixedRoomActivity", false, 2, (Object) null)) {
                weakReference = OooO0O0.f13315OooO0O0;
                if (weakReference != null) {
                    activity2 = weakReference.get();
                } else {
                    activity2 = null;
                }
                if (!Intrinsics.areEqual(activity2, activity)) {
                    OooO0O0.f13315OooO0O0 = new WeakReference<>(activity);
                }
            } else {
                String name3 = activity.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
                if (StringsKt__StringsKt.contains$default(name3, "AlbumActivity", false, 2, (Object) null)) {
                    weakReference = OooO0O0.f13315OooO0O0;
                    if (weakReference != null) {
                        activity2 = weakReference.get();
                    } else {
                        activity2 = null;
                    }
                    if (!Intrinsics.areEqual(activity2, activity)) {
                        OooO0O0.f13315OooO0O0 = new WeakReference<>(activity);
                    }
                } else {
                    String name4 = activity.getClass().getName();
                    Intrinsics.checkNotNullExpressionValue(name4, "getName(...)");
                    if (StringsKt__StringsKt.contains$default(name4, "PreviewImageActivity", false, 2, (Object) null)) {
                        weakReference = OooO0O0.f13315OooO0O0;
                        if (weakReference != null) {
                            activity2 = weakReference.get();
                        } else {
                            activity2 = null;
                        }
                        if (!Intrinsics.areEqual(activity2, activity)) {
                            OooO0O0.f13315OooO0O0 = new WeakReference<>(activity);
                        }
                    } else {
                        String name5 = activity.getClass().getName();
                        Intrinsics.checkNotNullExpressionValue(name5, "getName(...)");
                        if (StringsKt__StringsKt.contains$default(name5, "BigImageSelectActivity", false, 2, (Object) null)) {
                            weakReference = OooO0O0.f13315OooO0O0;
                            if (weakReference != null) {
                                activity2 = weakReference.get();
                            } else {
                                activity2 = null;
                            }
                            if (!Intrinsics.areEqual(activity2, activity)) {
                                OooO0O0.f13315OooO0O0 = new WeakReference<>(activity);
                            }
                        }
                    }
                }
            }
        }
        if (OooO0O0.f13316OooO0OO) {
            OooO0O0.f13316OooO0OO = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (OooO0O0.f13319OooO0o0 < 0) {
            OooO0O0.f13319OooO0o0++;
        } else {
            OooO0O0.f13317OooO0Oo++;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity.isChangingConfigurations()) {
            OooO0O0.f13319OooO0o0--;
            return;
        }
        OooO0O0.f13317OooO0Oo--;
        if (OooO0O0.f13317OooO0Oo <= 0) {
            OooO0O0.f13316OooO0OO = true;
        }
    }
}

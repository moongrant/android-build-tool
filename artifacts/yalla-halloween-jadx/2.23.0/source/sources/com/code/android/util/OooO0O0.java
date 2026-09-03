package com.code.android.util;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Stack;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nActivityStackManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityStackManager.kt\ncom/code/android/util/ActivityStackManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,146:1\n1855#2,2:147\n1855#2,2:149\n*S KotlinDebug\n*F\n+ 1 ActivityStackManager.kt\ncom/code/android/util/ActivityStackManager\n*L\n57#1:147,2\n68#1:149,2\n*E\n"})
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Stack<Activity> f10254OooO00o = new Stack<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static WeakReference<Activity> f10255OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static boolean f10256OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static int f10257OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public static Function1<? super Activity, String> f10258OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static int f10259OooO0o0;

    @Nullable
    public static Activity OooO00o(@NotNull Class cls) {
        Object next;
        Intrinsics.checkNotNullParameter(cls, "cls");
        Iterator<T> it = f10254OooO00o.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.areEqual(((Activity) next).getClass(), cls)) {
                return (Activity) next;
            }
        }
        next = null;
        return (Activity) next;
    }

    @Nullable
    public static Activity OooO0O0() {
        WeakReference<Activity> weakReference = f10255OooO0O0;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Nullable
    public static String OooO0OO() {
        WeakReference<Activity> weakReference = f10255OooO0O0;
        Activity activity = weakReference != null ? weakReference.get() : null;
        Function1<? super Activity, String> function1 = f10258OooO0o;
        if (function1 != null) {
            return function1.invoke(activity);
        }
        if (activity != null) {
            return activity.getClass().getSimpleName();
        }
        return null;
    }
}

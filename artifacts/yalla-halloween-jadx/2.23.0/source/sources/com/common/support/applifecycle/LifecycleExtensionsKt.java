package com.common.support.applifecycle;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0000¨\u0006\u0005"}, d2 = {"onDestroy", "", "Landroidx/lifecycle/LifecycleOwner;", "callback", "Lkotlin/Function0;", "lib_applifecycle_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class LifecycleExtensionsKt {
    public static final void onDestroy(@NotNull LifecycleOwner lifecycleOwner, @NotNull final Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        lifecycleOwner.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.common.support.applifecycle.LifecycleExtensionsKt.onDestroy.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner2) {
                androidx.lifecycle.OooO00o.OooO00o(this, lifecycleOwner2);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                androidx.lifecycle.OooO00o.OooO0O0(this, owner);
                callback.invoke();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner2) {
                androidx.lifecycle.OooO00o.OooO0OO(this, lifecycleOwner2);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner2) {
                androidx.lifecycle.OooO00o.OooO0Oo(this, lifecycleOwner2);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner2) {
                androidx.lifecycle.OooO00o.OooO0o0(this, lifecycleOwner2);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner2) {
                androidx.lifecycle.OooO00o.OooO0o(this, lifecycleOwner2);
            }
        });
    }
}

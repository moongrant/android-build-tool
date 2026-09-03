package p087o000Oooo;

import androidx.lifecycle.LifecycleEventObserver;
import androidx.navigation.NavBackStackEntry;
import p100o000oOoO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o000O00 implements o0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f28566OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ LifecycleEventObserver f28567OooO0O0;

    public o000O00(NavBackStackEntry navBackStackEntry, LifecycleEventObserver lifecycleEventObserver) {
        this.f28566OooO00o = navBackStackEntry;
        this.f28567OooO0O0 = lifecycleEventObserver;
    }

    @Override // p100o000oOoO.o0o0Oo
    public final void dispose() {
        this.f28566OooO00o.getLifecycle().removeObserver(this.f28567OooO0O0);
    }
}

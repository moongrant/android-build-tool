package p571o0oOo0o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import p100o000oOoO.o0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00OO implements o0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f45541OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ LifecycleEventObserver f45542OooO0O0;

    public o00O00OO(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
        this.f45541OooO00o = lifecycle;
        this.f45542OooO0O0 = lifecycleEventObserver;
    }

    @Override // p100o000oOoO.o0o0Oo
    public final void dispose() {
        this.f45541OooO00o.removeObserver(this.f45542OooO0O0);
    }
}

package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.HashSet;
import java.util.Iterator;
import p174o00OooOo.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
final class LifecycleLifecycle implements OooOOOO, LifecycleObserver {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final HashSet f13108OooO0Oo = new HashSet();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final Lifecycle f13109OooO0o0;

    public LifecycleLifecycle(Lifecycle lifecycle) {
        this.f13109OooO0o0 = lifecycle;
        lifecycle.addObserver(this);
    }

    @Override // com.bumptech.glide.manager.OooOOOO
    public final void OooO00o(@NonNull OooOo00 oooOo00) {
        this.f13108OooO0Oo.remove(oooOo00);
    }

    @Override // com.bumptech.glide.manager.OooOOOO
    public final void OooO0O0(@NonNull OooOo00 oooOo00) {
        this.f13108OooO0Oo.add(oooOo00);
        Lifecycle lifecycle = this.f13109OooO0o0;
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            oooOo00.onDestroy();
        } else if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            oooOo00.onStart();
        } else {
            oooOo00.onStop();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = o00OO0O0.OooO0Oo(this.f13108OooO0Oo).iterator();
        while (it.hasNext()) {
            ((OooOo00) it.next()).onDestroy();
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = o00OO0O0.OooO0Oo(this.f13108OooO0Oo).iterator();
        while (it.hasNext()) {
            ((OooOo00) it.next()).onStart();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = o00OO0O0.OooO0Oo(this.f13108OooO0Oo).iterator();
        while (it.hasNext()) {
            ((OooOo00) it.next()).onStop();
        }
    }
}

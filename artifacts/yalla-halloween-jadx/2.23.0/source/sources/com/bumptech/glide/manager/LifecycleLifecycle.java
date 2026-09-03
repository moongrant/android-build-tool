package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.HashSet;
import java.util.Iterator;
import p532o0o0Oo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
final class LifecycleLifecycle implements OooOo, LifecycleObserver {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final HashSet f10017OooO0Oo = new HashSet();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final Lifecycle f10018OooO0o0;

    public LifecycleLifecycle(Lifecycle lifecycle) {
        this.f10018OooO0o0 = lifecycle;
        lifecycle.addObserver(this);
    }

    @Override // com.bumptech.glide.manager.OooOo
    public final void OooO00o(@NonNull Oooo000 oooo000) {
        this.f10017OooO0Oo.remove(oooo000);
    }

    @Override // com.bumptech.glide.manager.OooOo
    public final void OooO0O0(@NonNull Oooo000 oooo000) {
        this.f10017OooO0Oo.add(oooo000);
        Lifecycle lifecycle = this.f10018OooO0o0;
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            oooo000.onDestroy();
        } else if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            oooo000.onStart();
        } else {
            oooo000.onStop();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = o0000oo.OooO0Oo(this.f10017OooO0Oo).iterator();
        while (it.hasNext()) {
            ((Oooo000) it.next()).onDestroy();
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = o0000oo.OooO0Oo(this.f10017OooO0Oo).iterator();
        while (it.hasNext()) {
            ((Oooo000) it.next()).onStart();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = o0000oo.OooO0Oo(this.f10017OooO0Oo).iterator();
        while (it.hasNext()) {
            ((Oooo000) it.next()).onStop();
        }
    }
}

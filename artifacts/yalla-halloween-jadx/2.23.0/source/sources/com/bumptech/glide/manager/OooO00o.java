package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p532o0o0Oo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements OooOo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Set<Oooo000> f10021OooO0Oo = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f10022OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f10023OooO0o0;

    @Override // com.bumptech.glide.manager.OooOo
    public final void OooO00o(@NonNull Oooo000 oooo000) {
        this.f10021OooO0Oo.remove(oooo000);
    }

    @Override // com.bumptech.glide.manager.OooOo
    public final void OooO0O0(@NonNull Oooo000 oooo000) {
        this.f10021OooO0Oo.add(oooo000);
        if (this.f10022OooO0o) {
            oooo000.onDestroy();
        } else if (this.f10023OooO0o0) {
            oooo000.onStart();
        } else {
            oooo000.onStop();
        }
    }

    public final void OooO0OO() {
        this.f10022OooO0o = true;
        Iterator it = o0000oo.OooO0Oo(this.f10021OooO0Oo).iterator();
        while (it.hasNext()) {
            ((Oooo000) it.next()).onDestroy();
        }
    }

    public final void OooO0Oo() {
        this.f10023OooO0o0 = true;
        Iterator it = o0000oo.OooO0Oo(this.f10021OooO0Oo).iterator();
        while (it.hasNext()) {
            ((Oooo000) it.next()).onStart();
        }
    }

    public final void OooO0o0() {
        this.f10023OooO0o0 = false;
        Iterator it = o0000oo.OooO0Oo(this.f10021OooO0Oo).iterator();
        while (it.hasNext()) {
            ((Oooo000) it.next()).onStop();
        }
    }
}

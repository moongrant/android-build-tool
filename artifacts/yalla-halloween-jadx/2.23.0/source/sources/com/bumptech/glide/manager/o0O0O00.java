package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p532o0o0Oo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00 implements Oooo000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Set<o00OOO00.OooOOO0<?>> f10060OooO0Oo = Collections.newSetFromMap(new WeakHashMap());

    @Override // com.bumptech.glide.manager.Oooo000
    public final void onDestroy() {
        Iterator it = o0000oo.OooO0Oo(this.f10060OooO0Oo).iterator();
        while (it.hasNext()) {
            ((o00OOO00.OooOOO0) it.next()).onDestroy();
        }
    }

    @Override // com.bumptech.glide.manager.Oooo000
    public final void onStart() {
        Iterator it = o0000oo.OooO0Oo(this.f10060OooO0Oo).iterator();
        while (it.hasNext()) {
            ((o00OOO00.OooOOO0) it.next()).onStart();
        }
    }

    @Override // com.bumptech.glide.manager.Oooo000
    public final void onStop() {
        Iterator it = o0000oo.OooO0Oo(this.f10060OooO0Oo).iterator();
        while (it.hasNext()) {
            ((o00OOO00.OooOOO0) it.next()).onStop();
        }
    }
}

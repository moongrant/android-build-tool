package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p172o00OooO0.o00000OO;
import p174o00OooOo.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0ooOOo implements OooOo00 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Set<o00000OO<?>> f13156OooO0Oo = Collections.newSetFromMap(new WeakHashMap());

    @Override // com.bumptech.glide.manager.OooOo00
    public final void onDestroy() {
        Iterator it = o00OO0O0.OooO0Oo(this.f13156OooO0Oo).iterator();
        while (it.hasNext()) {
            ((o00000OO) it.next()).onDestroy();
        }
    }

    @Override // com.bumptech.glide.manager.OooOo00
    public final void onStart() {
        Iterator it = o00OO0O0.OooO0Oo(this.f13156OooO0Oo).iterator();
        while (it.hasNext()) {
            ((o00000OO) it.next()).onStart();
        }
    }

    @Override // com.bumptech.glide.manager.OooOo00
    public final void onStop() {
        Iterator it = o00OO0O0.OooO0Oo(this.f13156OooO0Oo).iterator();
        while (it.hasNext()) {
            ((o00000OO) it.next()).onStop();
        }
    }
}

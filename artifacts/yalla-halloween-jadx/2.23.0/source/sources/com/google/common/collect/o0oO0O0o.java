package com.google.common.collect;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o0oO0O0o extends OooO0o<Object> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Iterator<Object> f19645OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o0O0oo0o f19646OooO0oO;

    public o0oO0O0o(o0O0oo0o o0o0oo0o) {
        this.f19646OooO0oO = o0o0oo0o;
        this.f19645OooO0o = o0o0oo0o.f19594OooO0Oo.iterator();
    }

    @Override // com.google.common.collect.OooO0o
    @CheckForNull
    public final Object OooO00o() {
        Object next;
        do {
            Iterator<Object> it = this.f19645OooO0o;
            if (!it.hasNext()) {
                this.f19303OooO0Oo = OooO0o.OooO0O0.DONE;
                return null;
            }
            next = it.next();
        } while (!this.f19646OooO0oO.f19595OooO0o0.contains(next));
        return next;
    }
}

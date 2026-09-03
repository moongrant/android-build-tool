package com.google.common.collect;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0 extends OooO0o<Object> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Iterator f19506OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ com.google.common.base.o0OoOo0 f19507OooO0oO;

    public o00O0(Iterator it, com.google.common.base.o0OoOo0 o0oooo0) {
        this.f19506OooO0o = it;
        this.f19507OooO0oO = o0oooo0;
    }

    @Override // com.google.common.collect.OooO0o
    @CheckForNull
    public final Object OooO00o() {
        Object next;
        do {
            Iterator it = this.f19506OooO0o;
            if (!it.hasNext()) {
                this.f19303OooO0Oo = OooO0o.OooO0O0.DONE;
                return null;
            }
            next = it.next();
        } while (!this.f19507OooO0oO.apply(next));
        return next;
    }
}

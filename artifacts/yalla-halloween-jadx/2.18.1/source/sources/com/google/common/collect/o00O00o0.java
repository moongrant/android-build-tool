package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00o0 extends OooO0o<Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0OOOO0o.OooOo00 f18476Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Iterator f18477Oooo0oo;

    public o00O00o0(Iterator it, o0OOOO0o.OooOo00 oooOo00) {
        this.f18477Oooo0oo = it;
        this.f18476Oooo = oooOo00;
    }

    @Override // com.google.common.collect.OooO0o
    public final Object OooO00o() {
        while (this.f18477Oooo0oo.hasNext()) {
            Object next = this.f18477Oooo0oo.next();
            if (this.f18476Oooo.apply(next)) {
                return next;
            }
        }
        this.f18311Oooo0o = 3;
        return null;
    }
}

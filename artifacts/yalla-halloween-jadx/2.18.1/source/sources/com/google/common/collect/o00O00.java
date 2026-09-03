package com.google.common.collect;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00 extends o0000O0O<Object> {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Iterable f18468Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0OOOO0o.OooOo00 f18469Oooo0oo;

    public o00O00(Iterable iterable, o0OOOO0o.OooOo00 oooOo00) {
        this.f18468Oooo0oO = iterable;
        this.f18469Oooo0oo = oooOo00;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        Iterator it = this.f18468Oooo0oO.iterator();
        o0OOOO0o.OooOo00 oooOo00 = this.f18469Oooo0oo;
        Objects.requireNonNull(it);
        Objects.requireNonNull(oooOo00);
        return new o00O00o0(it, oooOo00);
    }
}

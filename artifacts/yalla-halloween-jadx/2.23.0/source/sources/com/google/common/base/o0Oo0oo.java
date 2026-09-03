package com.google.common.base;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class o0Oo0oo implements o0OO00O.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f19098OooO00o;

    public o0Oo0oo(OooOOO oooOOO) {
        this.f19098OooO00o = oooOOO;
    }

    @Override // com.google.common.base.o0OO00O.OooO0O0
    public final Iterator OooO00o(o0OO00O o0oo00o2, CharSequence charSequence) {
        return new o0OOO0o(o0oo00o2, charSequence, new OooOOO.OooO00o(((OooOOO) this.f19098OooO00o).f19072OooO0Oo.matcher(charSequence)));
    }
}

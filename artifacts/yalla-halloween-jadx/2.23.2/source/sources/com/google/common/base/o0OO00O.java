package com.google.common.base;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO00O implements oo0o0Oo.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f18612OooO00o;

    public o0OO00O(OooOOOO oooOOOO) {
        this.f18612OooO00o = oooOOOO;
    }

    @Override // com.google.common.base.oo0o0Oo.OooO0O0
    public final Iterator OooO00o(oo0o0Oo oo0o0oo, CharSequence charSequence) {
        return new o0Oo0oo(oo0o0oo, charSequence, new OooOOOO.OooO00o(((OooOOOO) this.f18612OooO00o).f18596OooO0Oo.matcher(charSequence)));
    }
}

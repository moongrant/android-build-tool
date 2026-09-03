package com.google.common.base;

/* JADX INFO: loaded from: classes3.dex */
public final class o0Oo0oo extends oo0o0Oo.OooO00o {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f18614OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0Oo0oo(oo0o0Oo oo0o0oo, CharSequence charSequence, OooOOOO.OooO00o oooO00o) {
        super(oo0o0oo, charSequence);
        this.f18614OooOO0O = oooO00o;
    }

    @Override // com.google.common.base.oo0o0Oo.OooO00o
    public final int OooO00o(int i) {
        return ((OooOOOO.OooO00o) this.f18614OooOO0O).f18597OooO00o.end();
    }

    @Override // com.google.common.base.oo0o0Oo.OooO00o
    public final int OooO0O0(int i) {
        OooOO0O oooOO0O = this.f18614OooOO0O;
        if (((OooOOOO.OooO00o) oooOO0O).f18597OooO00o.find(i)) {
            return ((OooOOOO.OooO00o) oooOO0O).f18597OooO00o.start();
        }
        return -1;
    }
}

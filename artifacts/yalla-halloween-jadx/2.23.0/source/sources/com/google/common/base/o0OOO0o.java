package com.google.common.base;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOO0o extends o0OO00O.OooO00o {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f19097OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(o0OO00O o0oo00o2, CharSequence charSequence, OooOOO.OooO00o oooO00o) {
        super(o0oo00o2, charSequence);
        this.f19097OooOO0O = oooO00o;
    }

    @Override // com.google.common.base.o0OO00O.OooO00o
    public final int OooO00o(int i) {
        return ((OooOOO.OooO00o) this.f19097OooOO0O).f19073OooO00o.end();
    }

    @Override // com.google.common.base.o0OO00O.OooO00o
    public final int OooO0O0(int i) {
        OooOO0 oooOO1 = this.f19097OooOO0O;
        if (((OooOOO.OooO00o) oooOO1).f19073OooO00o.find(i)) {
            return ((OooOOO.OooO00o) oooOO1).f19073OooO00o.start();
        }
        return -1;
    }
}

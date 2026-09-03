package com.google.common.collect;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O0 extends oo00oO.OooO00o<Enum<Object>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f19426OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ EnumMultiset.OooO0O0 f19427OooO0o0;

    public o0000O0(EnumMultiset.OooO0O0 oooO0O0, int i) {
        this.f19427OooO0o0 = oooO0O0;
        this.f19426OooO0Oo = i;
    }

    @Override // com.google.common.collect.o0oOO.OooO00o
    public final int getCount() {
        return EnumMultiset.this.f19116OooO0oo[this.f19426OooO0Oo];
    }

    @Override // com.google.common.collect.o0oOO.OooO00o
    public final Object getElement() {
        return EnumMultiset.this.f19115OooO0oO[this.f19426OooO0Oo];
    }
}

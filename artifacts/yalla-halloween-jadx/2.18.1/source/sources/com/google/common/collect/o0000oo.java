package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000oo extends o00OOO0.OooO00o<Enum<Object>> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f18441Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ EnumMultiset.OooO0O0 f18442Oooo0oO;

    public o0000oo(EnumMultiset.OooO0O0 oooO0O0, int i) {
        this.f18442Oooo0oO = oooO0O0;
        this.f18441Oooo0o = i;
    }

    @Override // com.google.common.collect.o00OO.OooO00o
    public final int getCount() {
        return EnumMultiset.this.f18128OoooO00[this.f18441Oooo0o];
    }

    @Override // com.google.common.collect.o00OO.OooO00o
    public final Object getElement() {
        return EnumMultiset.this.f18125Oooo[this.f18441Oooo0o];
    }
}

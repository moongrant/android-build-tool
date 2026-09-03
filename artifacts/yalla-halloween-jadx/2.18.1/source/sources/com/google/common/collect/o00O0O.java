package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O extends OooOOO0<Object, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f18478Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ArrayTable.OooO00o f18479Oooo0oO;

    public o00O0O(ArrayTable.OooO00o oooO00o, int i) {
        this.f18479Oooo0oO = oooO00o;
        this.f18478Oooo0o = i;
    }

    @Override // com.google.common.collect.OooOOO0, java.util.Map.Entry
    public final Object getKey() {
        ArrayTable.OooO00o oooO00o = this.f18479Oooo0oO;
        return oooO00o.f18116Oooo0o.keySet().OooO00o().get(this.f18478Oooo0o);
    }

    @Override // com.google.common.collect.OooOOO0, java.util.Map.Entry
    public final Object getValue() {
        return this.f18479Oooo0oO.OooO0OO(this.f18478Oooo0o);
    }

    @Override // com.google.common.collect.OooOOO0, java.util.Map.Entry
    public final Object setValue(Object obj) {
        return this.f18479Oooo0oO.OooO0Oo(obj);
    }
}

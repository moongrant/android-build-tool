package com.google.common.collect;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O extends OooOOO0<Object, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f19039OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ArrayTable.OooO00o f19040OooO0o0;

    public o00O0O(ArrayTable.OooO00o oooO00o, int i) {
        this.f19040OooO0o0 = oooO00o;
        this.f19039OooO0Oo = i;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f19040OooO0o0.OooO0O0(this.f19039OooO0Oo);
    }

    @Override // java.util.Map.Entry
    @ParametricNullness
    public final Object getValue() {
        return this.f19040OooO0o0.OooO0Oo(this.f19039OooO0Oo);
    }

    @Override // com.google.common.collect.OooOOO0, java.util.Map.Entry
    @ParametricNullness
    public final Object setValue(@ParametricNullness Object obj) {
        return this.f19040OooO0o0.OooO0o0(obj);
    }
}

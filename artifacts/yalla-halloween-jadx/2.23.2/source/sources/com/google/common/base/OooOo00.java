package com.google.common.base;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo00 extends OooOo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f18599OooO0O0 = "null";

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ OooOo f18600OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(OooOo oooOo, OooOo oooOo2) {
        super(oooOo2);
        this.f18600OooO0OO = oooOo;
    }

    @Override // com.google.common.base.OooOo
    public final CharSequence OooO0O0(@CheckForNull Object obj) {
        return obj == null ? this.f18599OooO0O0 : this.f18600OooO0OO.OooO0O0(obj);
    }
}

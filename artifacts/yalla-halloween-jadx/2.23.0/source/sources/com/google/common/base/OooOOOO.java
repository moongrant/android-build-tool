package com.google.common.base;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOOO extends OooOo00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f19074OooO0O0 = "null";

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ OooOo00 f19075OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(OooOo00 oooOo00, OooOo00 oooOo01) {
        super(oooOo01);
        this.f19075OooO0OO = oooOo00;
    }

    @Override // com.google.common.base.OooOo00
    public final CharSequence OooO0O0(@CheckForNull Object obj) {
        return obj == null ? this.f19074OooO0O0 : this.f19075OooO0OO.OooO0O0(obj);
    }
}

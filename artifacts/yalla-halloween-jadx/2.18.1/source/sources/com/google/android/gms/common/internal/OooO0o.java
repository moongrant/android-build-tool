package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements PendingResultUtil.ResultConverter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Response f15608OooO00o;

    public OooO0o(Response response) {
        this.f15608OooO00o = response;
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* bridge */ /* synthetic */ Object convert(Result result) {
        this.f15608OooO00o.setResult(result);
        return this.f15608OooO00o;
    }
}

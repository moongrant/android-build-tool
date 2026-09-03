package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Result;

/* JADX INFO: loaded from: classes3.dex */
public class Response<T extends Result> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Result f14217OooO0Oo;

    public Response() {
    }

    public void setResult(@NonNull T t) {
        this.f14217OooO0Oo = t;
    }

    public Response(@NonNull T t) {
        this.f14217OooO0Oo = t;
    }
}

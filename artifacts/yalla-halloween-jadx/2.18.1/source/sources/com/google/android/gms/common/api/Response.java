package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Result;

/* JADX INFO: loaded from: classes2.dex */
public class Response<T extends Result> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Result f15194Oooo0o;

    public Response() {
    }

    public Response(@NonNull T t) {
        this.f15194Oooo0o = t;
    }

    public void setResult(@NonNull T t) {
        this.f15194Oooo0o = t;
    }
}

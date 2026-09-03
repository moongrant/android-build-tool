package com.efs.sdk.base.core.util.b;

import androidx.annotation.NonNull;
import com.efs.sdk.base.core.util.a.e;
import com.efs.sdk.base.http.HttpResponse;

/* JADX INFO: loaded from: classes.dex */
public final class c extends e<HttpResponse> {
    public b a;

    public c(@NonNull b bVar) {
        super(bVar);
        this.a = bVar;
    }

    @NonNull
    public final HttpResponse b() {
        this.a.e = "post";
        return a();
    }
}

package com.google.gson.internal;

import com.google.gson.JsonIOException;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo implements oo000o<Object> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f20637OooO0O0;

    public OooOo(String str) {
        this.f20637OooO0O0 = str;
    }

    @Override // com.google.gson.internal.oo000o
    public final Object OooO00o() {
        throw new JsonIOException(this.f20637OooO0O0);
    }
}

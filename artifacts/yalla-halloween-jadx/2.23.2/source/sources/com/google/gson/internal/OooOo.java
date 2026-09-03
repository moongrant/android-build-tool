package com.google.gson.internal;

import com.google.gson.JsonIOException;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo implements o00oO0o<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f20164OooO00o;

    public OooOo(String str) {
        this.f20164OooO00o = str;
    }

    @Override // com.google.gson.internal.o00oO0o
    public final Object OooO00o() {
        throw new JsonIOException(this.f20164OooO00o);
    }
}

package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class ASN1Exception extends IOException {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Throwable f53611Oooo0o;

    public ASN1Exception(String str) {
        super(str);
    }

    public ASN1Exception(String str, Throwable th) {
        super(str);
        this.f53611Oooo0o = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f53611Oooo0o;
    }
}

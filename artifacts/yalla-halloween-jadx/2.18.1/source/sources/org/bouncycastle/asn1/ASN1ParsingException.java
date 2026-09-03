package org.bouncycastle.asn1;

/* JADX INFO: loaded from: classes3.dex */
public class ASN1ParsingException extends IllegalStateException {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Throwable f53612Oooo0o;

    public ASN1ParsingException(String str) {
        super(str);
    }

    public ASN1ParsingException(String str, Throwable th) {
        super(str);
        this.f53612Oooo0o = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f53612Oooo0o;
    }
}

package org.bouncycastle.util.encoders;

/* JADX INFO: loaded from: classes3.dex */
public class EncoderException extends IllegalStateException {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Throwable f53720Oooo0o;

    public EncoderException(String str, Throwable th) {
        super(str);
        this.f53720Oooo0o = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f53720Oooo0o;
    }
}

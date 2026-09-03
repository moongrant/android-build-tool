package org.bouncycastle.util.encoders;

/* JADX INFO: loaded from: classes3.dex */
public class DecoderException extends IllegalStateException {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Throwable f53719Oooo0o;

    public DecoderException(String str, Throwable th) {
        super(str);
        this.f53719Oooo0o = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f53719Oooo0o;
    }
}

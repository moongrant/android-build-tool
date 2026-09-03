package p677o0oooo0o;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO0O0O implements oO0O00o0, h {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f52170Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f52171Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public oO f52172Oooo0oo;

    public oOO0O0O(boolean z, int i, oO oOVar) {
        this.f52170Oooo0o = z;
        this.f52171Oooo0oO = i;
        this.f52172Oooo0oo = oOVar;
    }

    @Override // p677o0oooo0o.oO0O00o0
    public final oO0OO0O OooO0O0() {
        try {
            return OooO0o0();
        } catch (IOException e) {
            throw new ASN1ParsingException(e.getMessage());
        }
    }

    @Override // p677o0oooo0o.h
    public final oO0OO0O OooO0o0() throws IOException {
        return this.f52172Oooo0oo.OooO0O0(this.f52170Oooo0o, this.f52171Oooo0oO);
    }
}

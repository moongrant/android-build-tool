package p398o0Oo00oO;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.nio.charset.StandardCharsets;
import kotlin.UByte;
import p390o0OOooOO.oo00oO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f38961OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f38962OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public SymbolShapeHint f38963OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public oo00oO f38964OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public oo00oO f38965OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f38966OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final StringBuilder f38967OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f38968OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o00Ooo f38969OooO0oo;

    public o00O0O(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & UByte.MAX_VALUE);
            if (c == '?' && str.charAt(i) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb.append(c);
        }
        this.f38962OooO00o = sb.toString();
        this.f38963OooO0O0 = SymbolShapeHint.FORCE_NONE;
        this.f38967OooO0o0 = new StringBuilder(str.length());
        this.f38968OooO0oO = -1;
    }

    public final int OooO00o() {
        return this.f38967OooO0o0.length();
    }

    public final char OooO0O0() {
        return this.f38962OooO00o.charAt(this.f38966OooO0o);
    }

    public final int OooO0OO() {
        return (this.f38962OooO00o.length() - this.f38961OooO) - this.f38966OooO0o;
    }

    public final boolean OooO0Oo() {
        return this.f38966OooO0o < this.f38962OooO00o.length() - this.f38961OooO;
    }

    public final void OooO0o(int i) {
        o00Ooo o00ooo2 = this.f38969OooO0oo;
        if (o00ooo2 == null || i > o00ooo2.f38976OooO0O0) {
            this.f38969OooO0oo = o00Ooo.OooO(i, this.f38963OooO0O0, this.f38964OooO0OO, this.f38965OooO0Oo);
        }
    }

    public final void OooO0o0() {
        OooO0o(OooO00o());
    }

    public final void OooO0oO(char c) {
        this.f38967OooO0o0.append(c);
    }

    public final void OooO0oo(String str) {
        this.f38967OooO0o0.append(str);
    }
}

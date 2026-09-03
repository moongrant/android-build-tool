package oo0ooO;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.nio.charset.StandardCharsets;
import kotlin.UByte;
import p326o0O0oooO.o00OOO00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f60943OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f60944OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public SymbolShapeHint f60945OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o00OOO00 f60946OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o00OOO00 f60947OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f60948OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final StringBuilder f60949OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f60950OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooOOO f60951OooO0oo;

    public OooOO0O(String str) {
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
        this.f60944OooO00o = sb.toString();
        this.f60945OooO0O0 = SymbolShapeHint.FORCE_NONE;
        this.f60949OooO0o0 = new StringBuilder(str.length());
        this.f60950OooO0oO = -1;
    }

    public final int OooO00o() {
        return this.f60949OooO0o0.length();
    }

    public final char OooO0O0() {
        return this.f60944OooO00o.charAt(this.f60948OooO0o);
    }

    public final boolean OooO0OO() {
        return this.f60948OooO0o < this.f60944OooO00o.length() - this.f60943OooO;
    }

    public final void OooO0Oo(int i) {
        OooOOO oooOOO = this.f60951OooO0oo;
        if (oooOOO == null || i > oooOOO.f60954OooO0O0) {
            this.f60951OooO0oo = OooOOO.OooO0o(i, this.f60945OooO0O0, this.f60946OooO0OO, this.f60947OooO0Oo);
        }
    }

    public final void OooO0o0(char c) {
        this.f60949OooO0o0.append(c);
    }
}

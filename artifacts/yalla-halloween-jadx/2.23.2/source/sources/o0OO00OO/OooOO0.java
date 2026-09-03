package o0OO00OO;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.nio.charset.StandardCharsets;
import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f42290OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f42291OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public SymbolShapeHint f42292OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o0O.OooO00o f42293OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o0O.OooO00o f42294OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f42295OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final StringBuilder f42296OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f42297OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooOOO f42298OooO0oo;

    public OooOO0(String str) {
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
        this.f42291OooO00o = sb.toString();
        this.f42292OooO0O0 = SymbolShapeHint.FORCE_NONE;
        this.f42296OooO0o0 = new StringBuilder(str.length());
        this.f42297OooO0oO = -1;
    }

    public final int OooO00o() {
        return this.f42296OooO0o0.length();
    }

    public final char OooO0O0() {
        return this.f42291OooO00o.charAt(this.f42295OooO0o);
    }

    public final boolean OooO0OO() {
        return this.f42295OooO0o < this.f42291OooO00o.length() - this.f42290OooO;
    }

    public final void OooO0Oo(int i) {
        OooOOO oooOOO = this.f42298OooO0oo;
        if (oooOOO == null || i > oooOOO.f42305OooO0O0) {
            this.f42298OooO0oo = OooOOO.OooO0o(i, this.f42292OooO0O0, this.f42293OooO0OO, this.f42294OooO0Oo);
        }
    }

    public final void OooO0o0(char c) {
        this.f42296OooO0o0.append(c);
    }
}

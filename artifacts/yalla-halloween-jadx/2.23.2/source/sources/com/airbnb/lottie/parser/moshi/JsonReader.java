package com.airbnb.lottie.parser.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import o00OOO00.OooO0O0;
import okio.ByteString;
import p037OoooOo0.o000O0o;
import p662o0oooO0O.o0OOO0;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JsonReader implements Closeable {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String[] f12022OooO0oo = new String[128];

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f12023OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int[] f12025OooO0o0 = new int[32];

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String[] f12024OooO0o = new String[32];

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int[] f12026OooO0oO = new int[32];

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String[] f12027OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0OOO0 f12028OooO0O0;

        public OooO00o(String[] strArr, o0OOO0 o0ooo1) {
            this.f12027OooO00o = strArr;
            this.f12028OooO0O0 = o0ooo1;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003a A[Catch: IOException -> 0x006b, TryCatch #0 {IOException -> 0x006b, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x0059), top: B:30:0x0000 }] */
        public static OooO00o OooO00o(String... strArr) {
            String str;
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                oo0OOoo oo0oooo = new oo0OOoo();
                for (int i = 0; i < strArr.length; i++) {
                    String str2 = strArr[i];
                    String[] strArr2 = JsonReader.f12022OooO0oo;
                    oo0oooo.o00o0O(34);
                    int length = str2.length();
                    int i2 = 0;
                    for (int i3 = 0; i3 < length; i3++) {
                        char cCharAt = str2.charAt(i3);
                        if (cCharAt < 128) {
                            str = strArr2[cCharAt];
                            if (str != null) {
                                if (i2 < i3) {
                                    oo0oooo.o000000O(i2, i3, str2);
                                }
                                oo0oooo.o00000OO(str);
                                i2 = i3 + 1;
                            }
                        } else {
                            if (cCharAt == 8232) {
                                str = "\\u2028";
                            } else if (cCharAt == 8233) {
                                str = "\\u2029";
                            }
                            if (i2 < i3) {
                                oo0oooo.o000000O(i2, i3, str2);
                            }
                            oo0oooo.o00000OO(str);
                            i2 = i3 + 1;
                        }
                    }
                    if (i2 < length) {
                        oo0oooo.o000000O(i2, length, str2);
                    }
                    oo0oooo.o00o0O(34);
                    oo0oooo.readByte();
                    byteStringArr[i] = oo0oooo.Oooo0o0();
                }
                String[] strArr3 = (String[]) strArr.clone();
                int i4 = o0OOO0.f59781OooO0o;
                return new OooO00o(strArr3, o0OOO0.OooO00o.OooO0O0(byteStringArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f12022OooO0oo[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f12022OooO0oo;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract void OooO00o() throws IOException;

    public abstract void OooO0OO() throws IOException;

    public abstract void OooO0oO() throws IOException;

    public abstract void OooOOo() throws IOException;

    public abstract boolean OooOo() throws IOException;

    public abstract boolean OooOo0() throws IOException;

    public final String OooOo00() {
        int i = this.f12023OooO0Oo;
        int[] iArr = this.f12025OooO0o0;
        String[] strArr = this.f12024OooO0o;
        int[] iArr2 = this.f12026OooO0oO;
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public abstract double OooOooo() throws IOException;

    public abstract String Oooo0() throws IOException;

    public abstract int Oooo00o() throws IOException;

    public abstract Token Oooo0O0() throws IOException;

    public final void Oooo0OO(int i) {
        int i2 = this.f12023OooO0Oo;
        int[] iArr = this.f12025OooO0o0;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new o00OOO00.OooO00o("Nesting too deep at " + OooOo00());
            }
            this.f12025OooO0o0 = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f12024OooO0o;
            this.f12024OooO0o = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f12026OooO0oO;
            this.f12026OooO0oO = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f12025OooO0o0;
        int i3 = this.f12023OooO0Oo;
        this.f12023OooO0Oo = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract int Oooo0o0(OooO00o oooO00o) throws IOException;

    public abstract void Oooo0oO() throws IOException;

    public final void OoooO0(String str) throws OooO0O0 {
        StringBuilder sbOooO0O0 = o000O0o.OooO0O0(str, " at path ");
        sbOooO0O0.append(OooOo00());
        throw new OooO0O0(sbOooO0O0.toString());
    }

    public abstract void OoooO00() throws IOException;
}

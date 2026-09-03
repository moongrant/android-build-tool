package com.airbnb.lottie.parser.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.ByteString;
import oo00o.OooO0O0;
import p037OoooOo0.o000Oo0;
import p659o0oooO00.o00000O;
import p659o0oooO00.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JsonReader implements Closeable {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String[] f8932OooO0oo = new String[128];

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f8933OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int[] f8935OooO0o0 = new int[32];

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String[] f8934OooO0o = new String[32];

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int[] f8936OooO0oO = new int[32];

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String[] f8937OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000O0O0 f8938OooO0O0;

        public OooO00o(String[] strArr, o000O0O0 o000o0o1) {
            this.f8937OooO00o = strArr;
            this.f8938OooO0O0 = o000o0o1;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003a A[Catch: IOException -> 0x006b, TryCatch #0 {IOException -> 0x006b, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x0059), top: B:30:0x0000 }] */
        public static OooO00o OooO00o(String... strArr) {
            String str;
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                o00000O o00000o = new o00000O();
                for (int i = 0; i < strArr.length; i++) {
                    String str2 = strArr[i];
                    String[] strArr2 = JsonReader.f8932OooO0oo;
                    o00000o.o00O0O(34);
                    int length = str2.length();
                    int i2 = 0;
                    for (int i3 = 0; i3 < length; i3++) {
                        char cCharAt = str2.charAt(i3);
                        if (cCharAt < 128) {
                            str = strArr2[cCharAt];
                            if (str != null) {
                                if (i2 < i3) {
                                    o00000o.o000OOo(i2, i3, str2);
                                }
                                o00000o.o00000O(str);
                                i2 = i3 + 1;
                            }
                        } else {
                            if (cCharAt == 8232) {
                                str = "\\u2028";
                            } else if (cCharAt == 8233) {
                                str = "\\u2029";
                            }
                            if (i2 < i3) {
                                o00000o.o000OOo(i2, i3, str2);
                            }
                            o00000o.o00000O(str);
                            i2 = i3 + 1;
                        }
                    }
                    if (i2 < length) {
                        o00000o.o000OOo(i2, length, str2);
                    }
                    o00000o.o00O0O(34);
                    o00000o.readByte();
                    byteStringArr[i] = o00000o.Oooo0o0();
                }
                String[] strArr3 = (String[]) strArr.clone();
                int i4 = o000O0O0.f60213OooO0o;
                return new OooO00o(strArr3, o000O0O0.OooO00o.OooO0O0(byteStringArr));
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
            f8932OooO0oo[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f8932OooO0oo;
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

    public final String OooOOo() {
        int i = this.f8933OooO0Oo;
        int[] iArr = this.f8935OooO0o0;
        String[] strArr = this.f8934OooO0o;
        int[] iArr2 = this.f8936OooO0oO;
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

    public abstract void OooOOo0() throws IOException;

    public abstract double OooOo() throws IOException;

    public abstract boolean OooOo0() throws IOException;

    public abstract boolean OooOo00() throws IOException;

    public abstract int OooOooO() throws IOException;

    public final void Oooo(String str) throws OooO0O0 {
        StringBuilder sbOooO0O0 = o000Oo0.OooO0O0(str, " at path ");
        sbOooO0O0.append(OooOOo());
        throw new OooO0O0(sbOooO0O0.toString());
    }

    public abstract Token Oooo0() throws IOException;

    public abstract String Oooo00o() throws IOException;

    public final void Oooo0O0(int i) {
        int i2 = this.f8933OooO0Oo;
        int[] iArr = this.f8935OooO0o0;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new oo00o.OooO00o("Nesting too deep at " + OooOOo());
            }
            this.f8935OooO0o0 = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f8934OooO0o;
            this.f8934OooO0o = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f8936OooO0oO;
            this.f8936OooO0oO = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f8935OooO0o0;
        int i3 = this.f8933OooO0Oo;
        this.f8933OooO0Oo = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract int Oooo0OO(OooO00o oooO00o) throws IOException;

    public abstract void Oooo0o() throws IOException;

    public abstract void Oooo0o0() throws IOException;
}

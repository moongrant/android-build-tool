package com.airbnb.lottie.parser.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import kotlin.text.Typography;
import okio.ByteString;
import p028Oooo0o0.o00O0O0O;
import p128o00O0oOO.o000;
import p128o00O0oOO.o0000OO0;
import p674o0oooo0.o0O00;
import p674o0oooo0.o0oOO;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public abstract class JsonReader implements Closeable {

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final String[] f10250OoooO00 = new String[128];

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f10252Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int[] f10253Oooo0oO = new int[32];

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public String[] f10254Oooo0oo = new String[32];

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int[] f10251Oooo = new int[32];

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String[] f10255OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0O00 f10256OooO0O0;

        public OooO00o(String[] strArr, o0O00 o0o01) {
            this.f10255OooO00o = strArr;
            this.f10256OooO0O0 = o0o01;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003a A[Catch: IOException -> 0x006b, TryCatch #0 {IOException -> 0x006b, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x0059), top: B:30:0x0000 }] */
        public static OooO00o OooO00o(String... strArr) {
            String str;
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                o0oOO o0ooo2 = new o0oOO();
                for (int i = 0; i < strArr.length; i++) {
                    String str2 = strArr[i];
                    String[] strArr2 = JsonReader.f10250OoooO00;
                    o0ooo2.Ooooo0o(34);
                    int length = str2.length();
                    int i2 = 0;
                    for (int i3 = 0; i3 < length; i3++) {
                        char cCharAt = str2.charAt(i3);
                        if (cCharAt < 128) {
                            str = strArr2[cCharAt];
                            if (str != null) {
                                if (i2 < i3) {
                                    o0ooo2.o00oO0O(str2, i2, i3);
                                }
                                o0ooo2.o00oO0o(str);
                                i2 = i3 + 1;
                            }
                        } else {
                            if (cCharAt == 8232) {
                                str = "\\u2028";
                            } else if (cCharAt == 8233) {
                                str = "\\u2029";
                            }
                            if (i2 < i3) {
                                o0ooo2.o00oO0O(str2, i2, i3);
                            }
                            o0ooo2.o00oO0o(str);
                            i2 = i3 + 1;
                        }
                    }
                    if (i2 < length) {
                        o0ooo2.o00oO0O(str2, i2, length);
                    }
                    o0ooo2.Ooooo0o(34);
                    o0ooo2.readByte();
                    byteStringArr[i] = o0ooo2.OooOoo();
                }
                return new OooO00o((String[]) strArr.clone(), o0O00.f52039Oooo0oo.OooO0O0(byteStringArr));
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
            f10250OoooO00[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f10250OoooO00;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract void OooO00o() throws IOException;

    public abstract void OooO0O0() throws IOException;

    public abstract void OooO0Oo() throws IOException;

    public abstract void OooO0o() throws IOException;

    public final String OooO0oo() {
        int i = this.f10252Oooo0o;
        int[] iArr = this.f10253Oooo0oO;
        String[] strArr = this.f10254Oooo0oo;
        int[] iArr2 = this.f10251Oooo;
        StringBuilder sbOooO00o = o00O0O0O.OooO00o(Typography.dollar);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sbOooO00o.append('[');
                sbOooO00o.append(iArr2[i2]);
                sbOooO00o.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sbOooO00o.append('.');
                if (strArr[i2] != null) {
                    sbOooO00o.append(strArr[i2]);
                }
            }
        }
        return sbOooO00o.toString();
    }

    public abstract boolean OooOOO() throws IOException;

    public abstract boolean OooOOo() throws IOException;

    public abstract double OooOOoo() throws IOException;

    public abstract int OooOo0O() throws IOException;

    public abstract String OooOoO() throws IOException;

    public abstract String OooOoOO() throws IOException;

    public abstract Token OooOoo() throws IOException;

    public abstract int Oooo0(OooO00o oooO00o) throws IOException;

    public final void Oooo00o(int i) {
        int i2 = this.f10252Oooo0o;
        int[] iArr = this.f10253Oooo0oO;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Nesting too deep at ");
                sbOooO0o0.append(OooO0oo());
                throw new o0000OO0(sbOooO0o0.toString());
            }
            this.f10253Oooo0oO = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f10254Oooo0oo;
            this.f10254Oooo0oo = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f10251Oooo;
            this.f10251Oooo = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f10253Oooo0oO;
        int i3 = this.f10252Oooo0o;
        this.f10252Oooo0o = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract void Oooo0OO() throws IOException;

    public abstract void Oooo0o() throws IOException;

    public final o000 OoooO0(String str) throws o000 {
        StringBuilder sbOooO00o = Oooo0.OooO00o(str, " at path ");
        sbOooO00o.append(OooO0oo());
        throw new o000(sbOooO00o.toString());
    }
}

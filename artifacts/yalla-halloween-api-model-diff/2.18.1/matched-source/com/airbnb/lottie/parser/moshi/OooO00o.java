package com.airbnb.lottie.parser.moshi;

import androidx.annotation.Nullable;
import com.facebook.internal.ServerProtocol;
import java.io.EOFException;
import java.io.IOException;
import okio.ByteString;
import p128o00O0oOO.o000;
import p128o00O0oOO.o0000OO0;
import p674o0oooo0.o0O00OO;
import p674o0oooo0.o0oOO;
import p674o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends JsonReader {

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public static final ByteString f10257OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public static final ByteString f10258OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public static final ByteString f10259OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public static final ByteString f10260OoooOoo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f10261OoooO = 0;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final o0oOOo f10262OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final o0oOO f10263OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public long f10264OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @Nullable
    public String f10265OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public int f10266o000oOoO;

    static {
        ByteString.OooO00o oooO00o = ByteString.f53047OoooO00;
        f10257OoooOOo = oooO00o.OooO0OO("'\\");
        f10258OoooOo0 = oooO00o.OooO0OO("\"\\");
        f10259OoooOoO = oooO00o.OooO0OO("{}[]:, \n\t\r\f/\\;#=");
        f10260OoooOoo = oooO00o.OooO0OO("\n\r");
        oooO00o.OooO0OO("*/");
    }

    public OooO00o(o0oOOo o0oooo2) {
        this.f10262OoooO0 = o0oooo2;
        this.f10263OoooO0O = ((o0O00OO) o0oooo2).f52063Oooo0o;
        Oooo00o(6);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void OooO00o() throws IOException {
        int iOoooOO0 = this.f10261OoooO;
        if (iOoooOO0 == 0) {
            iOoooOO0 = OoooOO0();
        }
        if (iOoooOO0 == 3) {
            Oooo00o(1);
            this.f10251Oooo[this.f10252Oooo0o - 1] = 0;
            this.f10261OoooO = 0;
        } else {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Expected BEGIN_ARRAY but was ");
            sbOooO0o0.append(OooOoo());
            sbOooO0o0.append(" at path ");
            sbOooO0o0.append(OooO0oo());
            throw new o0000OO0(sbOooO0o0.toString());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void OooO0O0() throws IOException {
        int iOoooOO0 = this.f10261OoooO;
        if (iOoooOO0 == 0) {
            iOoooOO0 = OoooOO0();
        }
        if (iOoooOO0 == 1) {
            Oooo00o(3);
            this.f10261OoooO = 0;
        } else {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Expected BEGIN_OBJECT but was ");
            sbOooO0o0.append(OooOoo());
            sbOooO0o0.append(" at path ");
            sbOooO0o0.append(OooO0oo());
            throw new o0000OO0(sbOooO0o0.toString());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void OooO0Oo() throws IOException {
        int iOoooOO0 = this.f10261OoooO;
        if (iOoooOO0 == 0) {
            iOoooOO0 = OoooOO0();
        }
        if (iOoooOO0 != 4) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Expected END_ARRAY but was ");
            sbOooO0o0.append(OooOoo());
            sbOooO0o0.append(" at path ");
            sbOooO0o0.append(OooO0oo());
            throw new o0000OO0(sbOooO0o0.toString());
        }
        int i = this.f10252Oooo0o - 1;
        this.f10252Oooo0o = i;
        int[] iArr = this.f10251Oooo;
        int i2 = i - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f10261OoooO = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void OooO0o() throws IOException {
        int iOoooOO0 = this.f10261OoooO;
        if (iOoooOO0 == 0) {
            iOoooOO0 = OoooOO0();
        }
        if (iOoooOO0 != 2) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Expected END_OBJECT but was ");
            sbOooO0o0.append(OooOoo());
            sbOooO0o0.append(" at path ");
            sbOooO0o0.append(OooO0oo());
            throw new o0000OO0(sbOooO0o0.toString());
        }
        int i = this.f10252Oooo0o - 1;
        this.f10252Oooo0o = i;
        this.f10254Oooo0oo[i] = null;
        int[] iArr = this.f10251Oooo;
        int i2 = i - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f10261OoooO = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final boolean OooOOO() throws IOException {
        int iOoooOO0 = this.f10261OoooO;
        if (iOoooOO0 == 0) {
            iOoooOO0 = OoooOO0();
        }
        return (iOoooOO0 == 2 || iOoooOO0 == 4 || iOoooOO0 == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final boolean OooOOo() throws IOException {
        int iOoooOO0 = this.f10261OoooO;
        if (iOoooOO0 == 0) {
            iOoooOO0 = OoooOO0();
        }
        if (iOoooOO0 == 5) {
            this.f10261OoooO = 0;
            int[] iArr = this.f10251Oooo;
            int i = this.f10252Oooo0o - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iOoooOO0 == 6) {
            this.f10261OoooO = 0;
            int[] iArr2 = this.f10251Oooo;
            int i2 = this.f10252Oooo0o - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Expected a boolean but was ");
        sbOooO0o0.append(OooOoo());
        sbOooO0o0.append(" at path ");
        sbOooO0o0.append(OooO0oo());
        throw new o0000OO0(sbOooO0o0.toString());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final double OooOOoo() throws IOException {
        int iOoooOO0 = this.f10261OoooO;
        if (iOoooOO0 == 0) {
            iOoooOO0 = OoooOO0();
        }
        if (iOoooOO0 == 16) {
            this.f10261OoooO = 0;
            int[] iArr = this.f10251Oooo;
            int i = this.f10252Oooo0o - 1;
            iArr[i] = iArr[i] + 1;
            return this.f10264OoooOO0;
        }
        if (iOoooOO0 == 17) {
            this.f10265OoooOOO = this.f10263OoooO0O.OooOOO0(this.f10266o000oOoO);
        } else if (iOoooOO0 == 9) {
            this.f10265OoooOOO = OoooOo0(f10258OoooOo0);
        } else if (iOoooOO0 == 8) {
            this.f10265OoooOOO = OoooOo0(f10257OoooOOo);
        } else if (iOoooOO0 == 10) {
            this.f10265OoooOOO = OoooOoO();
        } else if (iOoooOO0 != 11) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Expected a double but was ");
            sbOooO0o0.append(OooOoo());
            sbOooO0o0.append(" at path ");
            sbOooO0o0.append(OooO0oo());
            throw new o0000OO0(sbOooO0o0.toString());
        }
        this.f10261OoooO = 11;
        try {
            double d = Double.parseDouble(this.f10265OoooOOO);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new o000("JSON forbids NaN and infinities: " + d + " at path " + OooO0oo());
            }
            this.f10265OoooOOO = null;
            this.f10261OoooO = 0;
            int[] iArr2 = this.f10251Oooo;
            int i2 = this.f10252Oooo0o - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("Expected a double but was ");
            sbOooO0o1.append(this.f10265OoooOOO);
            sbOooO0o1.append(" at path ");
            sbOooO0o1.append(OooO0oo());
            throw new o0000OO0(sbOooO0o1.toString());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final int OooOo0O() throws IOException {
        int iOoooOO0 = this.f10261OoooO;
        if (iOoooOO0 == 0) {
            iOoooOO0 = OoooOO0();
        }
        if (iOoooOO0 == 16) {
            long j = this.f10264OoooOO0;
            int i = (int) j;
            if (j == i) {
                this.f10261OoooO = 0;
                int[] iArr = this.f10251Oooo;
                int i2 = this.f10252Oooo0o - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Expected an int but was ");
            sbOooO0o0.append(this.f10264OoooOO0);
            sbOooO0o0.append(" at path ");
            sbOooO0o0.append(OooO0oo());
            throw new o0000OO0(sbOooO0o0.toString());
        }
        if (iOoooOO0 == 17) {
            this.f10265OoooOOO = this.f10263OoooO0O.OooOOO0(this.f10266o000oOoO);
        } else if (iOoooOO0 == 9 || iOoooOO0 == 8) {
            String strOoooOo0 = iOoooOO0 == 9 ? OoooOo0(f10258OoooOo0) : OoooOo0(f10257OoooOOo);
            this.f10265OoooOOO = strOoooOo0;
            try {
                int i3 = Integer.parseInt(strOoooOo0);
                this.f10261OoooO = 0;
                int[] iArr2 = this.f10251Oooo;
                int i4 = this.f10252Oooo0o - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iOoooOO0 != 11) {
            StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("Expected an int but was ");
            sbOooO0o1.append(OooOoo());
            sbOooO0o1.append(" at path ");
            sbOooO0o1.append(OooO0oo());
            throw new o0000OO0(sbOooO0o1.toString());
        }
        this.f10261OoooO = 11;
        try {
            double d = Double.parseDouble(this.f10265OoooOOO);
            int i5 = (int) d;
            if (i5 != d) {
                StringBuilder sbOooO0o2 = OooO00o.OooO00o.OooO0o0("Expected an int but was ");
                sbOooO0o2.append(this.f10265OoooOOO);
                sbOooO0o2.append(" at path ");
                sbOooO0o2.append(OooO0oo());
                throw new o0000OO0(sbOooO0o2.toString());
            }
            this.f10265OoooOOO = null;
            this.f10261OoooO = 0;
            int[] iArr3 = this.f10251Oooo;
            int i6 = this.f10252Oooo0o - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            StringBuilder sbOooO0o3 = OooO00o.OooO00o.OooO0o0("Expected an int but was ");
            sbOooO0o3.append(this.f10265OoooOOO);
            sbOooO0o3.append(" at path ");
            sbOooO0o3.append(OooO0oo());
            throw new o0000OO0(sbOooO0o3.toString());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final String OooOoO() throws IOException {
        String strOoooOo0;
        int iOoooOO0 = this.f10261OoooO;
        if (iOoooOO0 == 0) {
            iOoooOO0 = OoooOO0();
        }
        if (iOoooOO0 == 14) {
            strOoooOo0 = OoooOoO();
        } else if (iOoooOO0 == 13) {
            strOoooOo0 = OoooOo0(f10258OoooOo0);
        } else if (iOoooOO0 == 12) {
            strOoooOo0 = OoooOo0(f10257OoooOOo);
        } else {
            if (iOoooOO0 != 15) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Expected a name but was ");
                sbOooO0o0.append(OooOoo());
                sbOooO0o0.append(" at path ");
                sbOooO0o0.append(OooO0oo());
                throw new o0000OO0(sbOooO0o0.toString());
            }
            strOoooOo0 = this.f10265OoooOOO;
        }
        this.f10261OoooO = 0;
        this.f10254Oooo0oo[this.f10252Oooo0o - 1] = strOoooOo0;
        return strOoooOo0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final String OooOoOO() throws IOException {
        String strOooOOO0;
        int iOoooOO0 = this.f10261OoooO;
        if (iOoooOO0 == 0) {
            iOoooOO0 = OoooOO0();
        }
        if (iOoooOO0 == 10) {
            strOooOOO0 = OoooOoO();
        } else if (iOoooOO0 == 9) {
            strOooOOO0 = OoooOo0(f10258OoooOo0);
        } else if (iOoooOO0 == 8) {
            strOooOOO0 = OoooOo0(f10257OoooOOo);
        } else if (iOoooOO0 == 11) {
            strOooOOO0 = this.f10265OoooOOO;
            this.f10265OoooOOO = null;
        } else if (iOoooOO0 == 16) {
            strOooOOO0 = Long.toString(this.f10264OoooOO0);
        } else {
            if (iOoooOO0 != 17) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Expected a string but was ");
                sbOooO0o0.append(OooOoo());
                sbOooO0o0.append(" at path ");
                sbOooO0o0.append(OooO0oo());
                throw new o0000OO0(sbOooO0o0.toString());
            }
            strOooOOO0 = this.f10263OoooO0O.OooOOO0(this.f10266o000oOoO);
        }
        this.f10261OoooO = 0;
        int[] iArr = this.f10251Oooo;
        int i = this.f10252Oooo0o - 1;
        iArr[i] = iArr[i] + 1;
        return strOooOOO0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final JsonReader.Token OooOoo() throws IOException {
        int iOoooOO0 = this.f10261OoooO;
        if (iOoooOO0 == 0) {
            iOoooOO0 = OoooOO0();
        }
        switch (iOoooOO0) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final int Oooo0(JsonReader.OooO00o oooO00o) throws IOException {
        int iOoooOO0 = this.f10261OoooO;
        if (iOoooOO0 == 0) {
            iOoooOO0 = OoooOO0();
        }
        if (iOoooOO0 < 12 || iOoooOO0 > 15) {
            return -1;
        }
        if (iOoooOO0 == 15) {
            return o000oOoO(this.f10265OoooOOO, oooO00o);
        }
        int iO00000OO = this.f10262OoooO0.o00000OO(oooO00o.f10256OooO0O0);
        if (iO00000OO != -1) {
            this.f10261OoooO = 0;
            this.f10254Oooo0oo[this.f10252Oooo0o - 1] = oooO00o.f10255OooO00o[iO00000OO];
            return iO00000OO;
        }
        String str = this.f10254Oooo0oo[this.f10252Oooo0o - 1];
        String strOooOoO = OooOoO();
        int iO000oOoO = o000oOoO(strOooOoO, oooO00o);
        if (iO000oOoO == -1) {
            this.f10261OoooO = 15;
            this.f10265OoooOOO = strOooOoO;
            this.f10254Oooo0oo[this.f10252Oooo0o - 1] = str;
        }
        return iO000oOoO;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void Oooo0OO() throws IOException {
        int iOoooOO0 = this.f10261OoooO;
        if (iOoooOO0 == 0) {
            iOoooOO0 = OoooOO0();
        }
        if (iOoooOO0 == 14) {
            OoooooO();
        } else if (iOoooOO0 == 13) {
            OooooOO(f10258OoooOo0);
        } else if (iOoooOO0 == 12) {
            OooooOO(f10257OoooOOo);
        } else if (iOoooOO0 != 15) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Expected a name but was ");
            sbOooO0o0.append(OooOoo());
            sbOooO0o0.append(" at path ");
            sbOooO0o0.append(OooO0oo());
            throw new o0000OO0(sbOooO0o0.toString());
        }
        this.f10261OoooO = 0;
        this.f10254Oooo0oo[this.f10252Oooo0o - 1] = "null";
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void Oooo0o() throws IOException {
        int i = 0;
        do {
            int iOoooOO0 = this.f10261OoooO;
            if (iOoooOO0 == 0) {
                iOoooOO0 = OoooOO0();
            }
            if (iOoooOO0 == 3) {
                Oooo00o(1);
            } else {
                if (iOoooOO0 == 1) {
                    Oooo00o(3);
                } else if (iOoooOO0 == 4) {
                    i--;
                    if (i < 0) {
                        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Expected a value but was ");
                        sbOooO0o0.append(OooOoo());
                        sbOooO0o0.append(" at path ");
                        sbOooO0o0.append(OooO0oo());
                        throw new o0000OO0(sbOooO0o0.toString());
                    }
                    this.f10252Oooo0o--;
                } else if (iOoooOO0 == 2) {
                    i--;
                    if (i < 0) {
                        StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("Expected a value but was ");
                        sbOooO0o1.append(OooOoo());
                        sbOooO0o1.append(" at path ");
                        sbOooO0o1.append(OooO0oo());
                        throw new o0000OO0(sbOooO0o1.toString());
                    }
                    this.f10252Oooo0o--;
                } else if (iOoooOO0 == 14 || iOoooOO0 == 10) {
                    OoooooO();
                } else if (iOoooOO0 == 9 || iOoooOO0 == 13) {
                    OooooOO(f10258OoooOo0);
                } else if (iOoooOO0 == 8 || iOoooOO0 == 12) {
                    OooooOO(f10257OoooOOo);
                } else if (iOoooOO0 == 17) {
                    this.f10263OoooO0O.skip(this.f10266o000oOoO);
                } else if (iOoooOO0 == 18) {
                    StringBuilder sbOooO0o2 = OooO00o.OooO00o.OooO0o0("Expected a value but was ");
                    sbOooO0o2.append(OooOoo());
                    sbOooO0o2.append(" at path ");
                    sbOooO0o2.append(OooO0oo());
                    throw new o0000OO0(sbOooO0o2.toString());
                }
                this.f10261OoooO = 0;
            }
            i++;
            this.f10261OoooO = 0;
        } while (i != 0);
        int[] iArr = this.f10251Oooo;
        int i2 = this.f10252Oooo0o;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f10254Oooo0oo[i2 - 1] = "null";
    }

    public final void OoooO0O() throws IOException {
        OoooO0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d1 A[DONT_INVERT, PHI: r2
      0x01d1: PHI (r2v20 char) = (r2v19 char), (r2v23 char) binds: [B:134:0x01ab, B:146:0x01d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:148:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:164:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:167:0x0201  */
    /* JADX WARN: Code duplicated, block: B:173:0x0211 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:174:0x0212  */
    /* JADX WARN: Code duplicated, block: B:176:0x0220  */
    /* JADX WARN: Code duplicated, block: B:178:0x0226  */
    /* JADX WARN: Code duplicated, block: B:233:0x020e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0120 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:86:0x0121  */
    /* JADX WARN: Code duplicated, block: B:90:0x0134  */
    /* JADX WARN: Code duplicated, block: B:92:0x013f  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final int OoooOO0() throws IOException {
        String str;
        String str2;
        int i;
        byte bOooOOoo;
        char c;
        int i2;
        boolean z;
        int i3;
        char c2;
        int i4;
        byte bOooOOoo2;
        int i5;
        int[] iArr = this.f10253Oooo0oO;
        int i6 = this.f10252Oooo0o;
        int i7 = iArr[i6 - 1];
        if (i7 == 1) {
            iArr[i6 - 1] = 2;
        } else if (i7 == 2) {
            int iOoooOOo = OoooOOo(true);
            this.f10263OoooO0O.readByte();
            if (iOoooOOo != 44) {
                if (iOoooOOo == 59) {
                    OoooO0O();
                    throw null;
                }
                if (iOoooOOo == 93) {
                    this.f10261OoooO = 4;
                    return 4;
                }
                OoooO0("Unterminated array");
                throw null;
            }
        } else {
            if (i7 == 3 || i7 == 5) {
                iArr[i6 - 1] = 4;
                if (i7 == 5) {
                    int iOoooOOo2 = OoooOOo(true);
                    this.f10263OoooO0O.readByte();
                    if (iOoooOOo2 != 44) {
                        if (iOoooOOo2 == 59) {
                            OoooO0O();
                            throw null;
                        }
                        if (iOoooOOo2 == 125) {
                            this.f10261OoooO = 2;
                            return 2;
                        }
                        OoooO0("Unterminated object");
                        throw null;
                    }
                }
                int iOoooOOo3 = OoooOOo(true);
                if (iOoooOOo3 == 34) {
                    this.f10263OoooO0O.readByte();
                    this.f10261OoooO = 13;
                    return 13;
                }
                if (iOoooOOo3 == 39) {
                    this.f10263OoooO0O.readByte();
                    OoooO0O();
                    throw null;
                }
                if (iOoooOOo3 != 125) {
                    OoooO0O();
                    throw null;
                }
                if (i7 == 5) {
                    OoooO0("Expected name");
                    throw null;
                }
                this.f10263OoooO0O.readByte();
                this.f10261OoooO = 2;
                return 2;
            }
            if (i7 == 4) {
                iArr[i6 - 1] = 5;
                int iOoooOOo4 = OoooOOo(true);
                this.f10263OoooO0O.readByte();
                if (iOoooOOo4 != 58) {
                    if (iOoooOOo4 != 61) {
                        OoooO0("Expected ':'");
                        throw null;
                    }
                    OoooO0O();
                    throw null;
                }
            } else if (i7 == 6) {
                iArr[i6 - 1] = 7;
            } else {
                if (i7 == 7) {
                    if (OoooOOo(false) == -1) {
                        this.f10261OoooO = 18;
                        return 18;
                    }
                    OoooO0O();
                    throw null;
                }
                if (i7 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int iOoooOOo5 = OoooOOo(true);
        if (iOoooOOo5 == 34) {
            this.f10263OoooO0O.readByte();
            this.f10261OoooO = 9;
            return 9;
        }
        if (iOoooOOo5 == 39) {
            OoooO0O();
            throw null;
        }
        if (iOoooOOo5 != 44 && iOoooOOo5 != 59) {
            if (iOoooOOo5 == 91) {
                this.f10263OoooO0O.readByte();
                this.f10261OoooO = 3;
                return 3;
            }
            if (iOoooOOo5 != 93) {
                if (iOoooOOo5 == 123) {
                    this.f10263OoooO0O.readByte();
                    this.f10261OoooO = 1;
                    return 1;
                }
                byte bOooOOoo3 = this.f10263OoooO0O.OooOOoo(0L);
                if (bOooOOoo3 == 116 || bOooOOoo3 == 84) {
                    str = ServerProtocol.DIALOG_RETURN_SCOPES_TRUE;
                    str2 = "TRUE";
                    i = 5;
                } else {
                    if (bOooOOoo3 != 102 && bOooOOoo3 != 70) {
                        if (bOooOOoo3 != 110 && bOooOOoo3 != 78) {
                            i = 0;
                            break;
                        }
                        str = "null";
                        str2 = "NULL";
                        i = 7;
                        if (i != 0) {
                            return i;
                        }
                        long j = 0;
                        c = 0;
                        i2 = 0;
                        z = true;
                        boolean z2 = false;
                        while (true) {
                            i3 = i2 + 1;
                            if (this.f10262OoooO0.request(i3)) {
                                bOooOOoo2 = this.f10263OoooO0O.OooOOoo(i2);
                                if (bOooOOoo2 != 43) {
                                    if (bOooOOoo2 != 69 || bOooOOoo2 == 101) {
                                        i5 = i3;
                                        if (c != 2 || c == 4) {
                                            c = 5;
                                            i2 = i5;
                                        } else {
                                            i4 = 0;
                                        }
                                    } else if (bOooOOoo2 == 45) {
                                        i5 = i3;
                                        if (c == 0) {
                                            c = 1;
                                            z2 = true;
                                        } else {
                                            if (c != 5) {
                                                i4 = 0;
                                            }
                                            c = 6;
                                        }
                                        i2 = i5;
                                    } else if (bOooOOoo2 != 46) {
                                        if (bOooOOoo2 >= 48 && bOooOOoo2 <= 57) {
                                            if (c == 1 || c == 0) {
                                                i5 = i3;
                                                j = -(bOooOOoo2 - 48);
                                                c = 2;
                                            } else if (c != 2) {
                                                i5 = i3;
                                                if (c == 3) {
                                                    c = 4;
                                                } else if (c == 5 || c == 6) {
                                                    c = 7;
                                                }
                                                i2 = i5;
                                            } else if (j != 0) {
                                                i5 = i3;
                                                long j2 = (10 * j) - ((long) (bOooOOoo2 - 48));
                                                z = (j > -922337203685477580L || (j == -922337203685477580L && j2 < j)) & z;
                                                j = j2;
                                            }
                                            i2 = i5;
                                        } else if (!OoooOOO(bOooOOoo2)) {
                                        }
                                        i4 = 0;
                                    } else {
                                        i5 = i3;
                                        if (c == 2) {
                                            c = 3;
                                            i2 = i5;
                                        } else {
                                            i4 = 0;
                                        }
                                    }
                                    if (i4 != 0) {
                                        return i4;
                                    }
                                    if (OoooOOO(this.f10263OoooO0O.OooOOoo(0L))) {
                                        OoooO0O();
                                        throw null;
                                    }
                                    OoooO0("Expected value");
                                    throw null;
                                }
                                i5 = i3;
                                if (c != 5) {
                                    i4 = 0;
                                    if (i4 != 0) {
                                        return i4;
                                    }
                                    if (OoooOOO(this.f10263OoooO0O.OooOOoo(0L))) {
                                        OoooO0("Expected value");
                                        throw null;
                                    }
                                    OoooO0O();
                                    throw null;
                                }
                                c = 6;
                                i2 = i5;
                            }
                            c2 = 2;
                            if (c != 2) {
                                if (c != c2 || c == 4 || c == 7) {
                                    this.f10266o000oOoO = i2;
                                    i4 = 17;
                                    this.f10261OoooO = 17;
                                } else {
                                    i4 = 0;
                                }
                            } else if (z || ((j == Long.MIN_VALUE && !z2) || (j == 0 && z2))) {
                                c2 = 2;
                                if (c != c2) {
                                }
                                this.f10266o000oOoO = i2;
                                i4 = 17;
                                this.f10261OoooO = 17;
                            } else {
                                if (!z2) {
                                    j = -j;
                                }
                                this.f10264OoooOO0 = j;
                                this.f10263OoooO0O.skip(i2);
                                i4 = 16;
                                this.f10261OoooO = 16;
                            }
                            if (i4 != 0) {
                                return i4;
                            }
                            if (OoooOOO(this.f10263OoooO0O.OooOOoo(0L))) {
                                OoooO0("Expected value");
                                throw null;
                            }
                            OoooO0O();
                            throw null;
                        }
                    }
                    str = "false";
                    str2 = "FALSE";
                    i = 6;
                }
                int length = str.length();
                int i8 = 1;
                while (true) {
                    if (i8 >= length) {
                        if (!this.f10262OoooO0.request(length + 1) || !OoooOOO(this.f10263OoooO0O.OooOOoo(length))) {
                            this.f10263OoooO0O.skip(length);
                            this.f10261OoooO = i;
                            break;
                        }
                    } else {
                        int i9 = i8 + 1;
                        if (this.f10262OoooO0.request(i9) && ((bOooOOoo = this.f10263OoooO0O.OooOOoo(i8)) == str.charAt(i8) || bOooOOoo == str2.charAt(i8))) {
                            i8 = i9;
                        }
                    }
                    i = 0;
                    break;
                }
                if (i != 0) {
                    return i;
                }
                long j3 = 0;
                c = 0;
                i2 = 0;
                z = true;
                boolean z3 = false;
                while (true) {
                    i3 = i2 + 1;
                    if (this.f10262OoooO0.request(i3)) {
                        bOooOOoo2 = this.f10263OoooO0O.OooOOoo(i2);
                        if (bOooOOoo2 != 43) {
                            if (bOooOOoo2 != 69) {
                                i5 = i3;
                                if (c != 2) {
                                }
                                c = 5;
                                i2 = i5;
                            } else {
                                i5 = i3;
                                if (c != 2) {
                                }
                                c = 5;
                                i2 = i5;
                            }
                            if (i4 != 0) {
                                return i4;
                            }
                            if (OoooOOO(this.f10263OoooO0O.OooOOoo(0L))) {
                                OoooO0("Expected value");
                                throw null;
                            }
                            OoooO0O();
                            throw null;
                        }
                        i5 = i3;
                        if (c != 5) {
                            i4 = 0;
                            if (i4 != 0) {
                                return i4;
                            }
                            if (OoooOOO(this.f10263OoooO0O.OooOOoo(0L))) {
                                OoooO0("Expected value");
                                throw null;
                            }
                            OoooO0O();
                            throw null;
                        }
                        c = 6;
                        i2 = i5;
                    }
                    c2 = 2;
                    if (c != 2) {
                        if (c != c2) {
                        }
                        this.f10266o000oOoO = i2;
                        i4 = 17;
                        this.f10261OoooO = 17;
                    } else {
                        if (z) {
                        }
                        c2 = 2;
                        if (c != c2) {
                        }
                        this.f10266o000oOoO = i2;
                        i4 = 17;
                        this.f10261OoooO = 17;
                    }
                    if (i4 != 0) {
                        return i4;
                    }
                    if (OoooOOO(this.f10263OoooO0O.OooOOoo(0L))) {
                        OoooO0("Expected value");
                        throw null;
                    }
                    OoooO0O();
                    throw null;
                }
            }
            if (i7 == 1) {
                this.f10263OoooO0O.readByte();
                this.f10261OoooO = 4;
                return 4;
            }
        }
        if (i7 == 1 || i7 == 2) {
            OoooO0O();
            throw null;
        }
        OoooO0("Unexpected value");
        throw null;
    }

    public final boolean OoooOOO(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        OoooO0O();
        throw null;
    }

    public final int OoooOOo(boolean z) throws IOException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!this.f10262OoooO0.request(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            byte bOooOOoo = this.f10263OoooO0O.OooOOoo(i);
            if (bOooOOoo != 10 && bOooOOoo != 32 && bOooOOoo != 13 && bOooOOoo != 9) {
                this.f10263OoooO0O.skip(i2 - 1);
                if (bOooOOoo == 47) {
                    if (!this.f10262OoooO0.request(2L)) {
                        return bOooOOoo;
                    }
                    OoooO0O();
                    throw null;
                }
                if (bOooOOoo != 35) {
                    return bOooOOoo;
                }
                OoooO0O();
                throw null;
            }
            i = i2;
        }
    }

    public final String OoooOo0(ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long jOooo0oO = this.f10262OoooO0.Oooo0oO(byteString);
            if (jOooo0oO == -1) {
                OoooO0("Unterminated string");
                throw null;
            }
            if (this.f10263OoooO0O.OooOOoo(jOooo0oO) != 92) {
                if (sb == null) {
                    String strOooOOO0 = this.f10263OoooO0O.OooOOO0(jOooo0oO);
                    this.f10263OoooO0O.readByte();
                    return strOooOOO0;
                }
                sb.append(this.f10263OoooO0O.OooOOO0(jOooo0oO));
                this.f10263OoooO0O.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.f10263OoooO0O.OooOOO0(jOooo0oO));
            this.f10263OoooO0O.readByte();
            sb.append(Ooooo0o());
        }
    }

    public final String OoooOoO() throws IOException {
        long jOooo0oO = this.f10262OoooO0.Oooo0oO(f10259OoooOoO);
        return jOooo0oO != -1 ? this.f10263OoooO0O.OooOOO0(jOooo0oO) : this.f10263OoooO0O.Oooo0o();
    }

    public final char Ooooo0o() throws IOException {
        int i;
        int i2;
        if (!this.f10262OoooO0.request(1L)) {
            OoooO0("Unterminated escape sequence");
            throw null;
        }
        byte b = this.f10263OoooO0O.readByte();
        if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Invalid escape sequence: \\");
            sbOooO0o0.append((char) b);
            OoooO0(sbOooO0o0.toString());
            throw null;
        }
        if (!this.f10262OoooO0.request(4L)) {
            StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("Unterminated escape sequence at path ");
            sbOooO0o1.append(OooO0oo());
            throw new EOFException(sbOooO0o1.toString());
        }
        char c = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            byte bOooOOoo = this.f10263OoooO0O.OooOOoo(i3);
            char c2 = (char) (c << 4);
            if (bOooOOoo < 48 || bOooOOoo > 57) {
                if (bOooOOoo >= 97 && bOooOOoo <= 102) {
                    i = bOooOOoo - 97;
                } else {
                    if (bOooOOoo < 65 || bOooOOoo > 70) {
                        StringBuilder sbOooO0o2 = OooO00o.OooO00o.OooO0o0("\\u");
                        sbOooO0o2.append(this.f10263OoooO0O.OooOOO0(4L));
                        OoooO0(sbOooO0o2.toString());
                        throw null;
                    }
                    i = bOooOOoo - 65;
                }
                i2 = i + 10;
            } else {
                i2 = bOooOOoo - 48;
            }
            c = (char) (i2 + c2);
        }
        this.f10263OoooO0O.skip(4L);
        return c;
    }

    public final void OooooOO(ByteString byteString) throws IOException {
        while (true) {
            long jOooo0oO = this.f10262OoooO0.Oooo0oO(byteString);
            if (jOooo0oO == -1) {
                OoooO0("Unterminated string");
                throw null;
            }
            if (this.f10263OoooO0O.OooOOoo(jOooo0oO) != 92) {
                this.f10263OoooO0O.skip(jOooo0oO + 1);
                return;
            } else {
                this.f10263OoooO0O.skip(jOooo0oO + 1);
                Ooooo0o();
            }
        }
    }

    public final void OoooooO() throws IOException {
        long jOooo0oO = this.f10262OoooO0.Oooo0oO(f10259OoooOoO);
        o0oOO o0ooo2 = this.f10263OoooO0O;
        if (jOooo0oO == -1) {
            jOooo0oO = o0ooo2.f52099Oooo0oO;
        }
        o0ooo2.skip(jOooo0oO);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f10261OoooO = 0;
        this.f10253Oooo0oO[0] = 8;
        this.f10252Oooo0o = 1;
        this.f10263OoooO0O.OooO0Oo();
        this.f10262OoooO0.close();
    }

    public final int o000oOoO(String str, JsonReader.OooO00o oooO00o) {
        int length = oooO00o.f10255OooO00o.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(oooO00o.f10255OooO00o[i])) {
                this.f10261OoooO = 0;
                this.f10254Oooo0oo[this.f10252Oooo0o - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("JsonReader(");
        sbOooO0o0.append(this.f10262OoooO0);
        sbOooO0o0.append(")");
        return sbOooO0o0.toString();
    }
}

package com.airbnb.lottie.parser.moshi;

import androidx.annotation.Nullable;
import com.facebook.internal.ServerProtocol;
import java.io.EOFException;
import java.io.IOException;
import o00OOO00.OooO0O0;
import okio.ByteString;
import p663o0oooO0.o00O000o;
import p663o0oooO0.o00OO;
import p663o0oooO0.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends JsonReader {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final ByteString f12040OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final ByteString f12041OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final ByteString f12042OooOOo0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o00O000o f12043OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o0O0ooO f12044OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f12045OooOO0O = 0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f12046OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public String f12047OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f12048OooOOO0;

    static {
        ByteString byteString = ByteString.f60159OooO0oO;
        f12040OooOOOO = ByteString.OooO00o.OooO0OO("'\\");
        f12041OooOOOo = ByteString.OooO00o.OooO0OO("\"\\");
        f12042OooOOo0 = ByteString.OooO00o.OooO0OO("{}[]:, \n\t\r\f/\\;#=");
        ByteString.OooO00o.OooO0OO("\n\r");
        ByteString.OooO00o.OooO0OO("*/");
    }

    public OooO00o(o00OO o00oo2) {
        this.f12043OooO = o00oo2;
        this.f12044OooOO0 = o00oo2.f58688OooO0o0;
        Oooo0o(6);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void OooO00o() throws IOException {
        int iOoooOOO = this.f12045OooOO0O;
        if (iOoooOOO == 0) {
            iOoooOOO = OoooOOO();
        }
        if (iOoooOOO == 3) {
            Oooo0o(1);
            this.f12037OooO0oO[this.f12034OooO0Oo - 1] = 0;
            this.f12045OooOO0O = 0;
        } else {
            throw new o00OOO00.OooO00o("Expected BEGIN_ARRAY but was " + Oooo0OO() + " at path " + OooOo00());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void OooO0OO() throws IOException {
        int iOoooOOO = this.f12045OooOO0O;
        if (iOoooOOO == 0) {
            iOoooOOO = OoooOOO();
        }
        if (iOoooOOO == 1) {
            Oooo0o(3);
            this.f12045OooOO0O = 0;
        } else {
            throw new o00OOO00.OooO00o("Expected BEGIN_OBJECT but was " + Oooo0OO() + " at path " + OooOo00());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void OooO0oO() throws IOException {
        int iOoooOOO = this.f12045OooOO0O;
        if (iOoooOOO == 0) {
            iOoooOOO = OoooOOO();
        }
        if (iOoooOOO != 4) {
            throw new o00OOO00.OooO00o("Expected END_ARRAY but was " + Oooo0OO() + " at path " + OooOo00());
        }
        int i = this.f12034OooO0Oo - 1;
        this.f12034OooO0Oo = i;
        int[] iArr = this.f12037OooO0oO;
        int i2 = i - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f12045OooOO0O = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void OooOOoo() throws IOException {
        int iOoooOOO = this.f12045OooOO0O;
        if (iOoooOOO == 0) {
            iOoooOOO = OoooOOO();
        }
        if (iOoooOOO != 2) {
            throw new o00OOO00.OooO00o("Expected END_OBJECT but was " + Oooo0OO() + " at path " + OooOo00());
        }
        int i = this.f12034OooO0Oo - 1;
        this.f12034OooO0Oo = i;
        this.f12035OooO0o[i] = null;
        int[] iArr = this.f12037OooO0oO;
        int i2 = i - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f12045OooOO0O = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final boolean OooOo0O() throws IOException {
        int iOoooOOO = this.f12045OooOO0O;
        if (iOoooOOO == 0) {
            iOoooOOO = OoooOOO();
        }
        return (iOoooOOO == 2 || iOoooOOO == 4 || iOoooOOO == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final boolean OooOo0o() throws IOException {
        int iOoooOOO = this.f12045OooOO0O;
        if (iOoooOOO == 0) {
            iOoooOOO = OoooOOO();
        }
        if (iOoooOOO == 5) {
            this.f12045OooOO0O = 0;
            int[] iArr = this.f12037OooO0oO;
            int i = this.f12034OooO0Oo - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iOoooOOO == 6) {
            this.f12045OooOO0O = 0;
            int[] iArr2 = this.f12037OooO0oO;
            int i2 = this.f12034OooO0Oo - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new o00OOO00.OooO00o("Expected a boolean but was " + Oooo0OO() + " at path " + OooOo00());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final double OooOoO() throws IOException {
        int iOoooOOO = this.f12045OooOO0O;
        if (iOoooOOO == 0) {
            iOoooOOO = OoooOOO();
        }
        if (iOoooOOO == 16) {
            this.f12045OooOO0O = 0;
            int[] iArr = this.f12037OooO0oO;
            int i = this.f12034OooO0Oo - 1;
            iArr[i] = iArr[i] + 1;
            return this.f12046OooOO0o;
        }
        if (iOoooOOO == 17) {
            this.f12047OooOOO = this.f12044OooOO0.OooooOO(this.f12048OooOOO0);
        } else if (iOoooOOO == 9) {
            this.f12047OooOOO = o00O0O(f12041OooOOOo);
        } else if (iOoooOOO == 8) {
            this.f12047OooOOO = o00O0O(f12040OooOOOO);
        } else if (iOoooOOO == 10) {
            this.f12047OooOOO = o00Oo0();
        } else if (iOoooOOO != 11) {
            throw new o00OOO00.OooO00o("Expected a double but was " + Oooo0OO() + " at path " + OooOo00());
        }
        this.f12045OooOO0O = 11;
        try {
            double d = Double.parseDouble(this.f12047OooOOO);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new OooO0O0("JSON forbids NaN and infinities: " + d + " at path " + OooOo00());
            }
            this.f12047OooOOO = null;
            this.f12045OooOO0O = 0;
            int[] iArr2 = this.f12037OooO0oO;
            int i2 = this.f12034OooO0Oo - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            throw new o00OOO00.OooO00o("Expected a double but was " + this.f12047OooOOO + " at path " + OooOo00());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void Oooo() throws IOException {
        int i = 0;
        do {
            int iOoooOOO = this.f12045OooOO0O;
            if (iOoooOOO == 0) {
                iOoooOOO = OoooOOO();
            }
            if (iOoooOOO == 3) {
                Oooo0o(1);
            } else {
                if (iOoooOOO == 1) {
                    Oooo0o(3);
                } else if (iOoooOOO == 4) {
                    i--;
                    if (i < 0) {
                        throw new o00OOO00.OooO00o("Expected a value but was " + Oooo0OO() + " at path " + OooOo00());
                    }
                    this.f12034OooO0Oo--;
                } else if (iOoooOOO == 2) {
                    i--;
                    if (i < 0) {
                        throw new o00OOO00.OooO00o("Expected a value but was " + Oooo0OO() + " at path " + OooOo00());
                    }
                    this.f12034OooO0Oo--;
                } else {
                    o0O0ooO o0o0ooo = this.f12044OooOO0;
                    if (iOoooOOO == 14 || iOoooOOO == 10) {
                        long jOooOoOO = this.f12043OooO.OooOoOO(f12042OooOOo0);
                        if (jOooOoOO == -1) {
                            jOooOoOO = o0o0ooo.f58720OooO0o0;
                        }
                        o0o0ooo.skip(jOooOoOO);
                    } else if (iOoooOOO == 9 || iOoooOOO == 13) {
                        oo000o(f12041OooOOOo);
                    } else if (iOoooOOO == 8 || iOoooOOO == 12) {
                        oo000o(f12040OooOOOO);
                    } else if (iOoooOOO == 17) {
                        o0o0ooo.skip(this.f12048OooOOO0);
                    } else if (iOoooOOO == 18) {
                        throw new o00OOO00.OooO00o("Expected a value but was " + Oooo0OO() + " at path " + OooOo00());
                    }
                }
                this.f12045OooOO0O = 0;
            }
            i++;
            this.f12045OooOO0O = 0;
        } while (i != 0);
        int[] iArr = this.f12037OooO0oO;
        int i2 = this.f12034OooO0Oo;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f12035OooO0o[i2 - 1] = "null";
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final int Oooo00O() throws IOException {
        int iOoooOOO = this.f12045OooOO0O;
        if (iOoooOOO == 0) {
            iOoooOOO = OoooOOO();
        }
        if (iOoooOOO == 16) {
            long j = this.f12046OooOO0o;
            int i = (int) j;
            if (j == i) {
                this.f12045OooOO0O = 0;
                int[] iArr = this.f12037OooO0oO;
                int i2 = this.f12034OooO0Oo - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new o00OOO00.OooO00o("Expected an int but was " + this.f12046OooOO0o + " at path " + OooOo00());
        }
        if (iOoooOOO == 17) {
            this.f12047OooOOO = this.f12044OooOO0.OooooOO(this.f12048OooOOO0);
        } else if (iOoooOOO == 9 || iOoooOOO == 8) {
            String strO00O0O = iOoooOOO == 9 ? o00O0O(f12041OooOOOo) : o00O0O(f12040OooOOOO);
            this.f12047OooOOO = strO00O0O;
            try {
                int i3 = Integer.parseInt(strO00O0O);
                this.f12045OooOO0O = 0;
                int[] iArr2 = this.f12037OooO0oO;
                int i4 = this.f12034OooO0Oo - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iOoooOOO != 11) {
            throw new o00OOO00.OooO00o("Expected an int but was " + Oooo0OO() + " at path " + OooOo00());
        }
        this.f12045OooOO0O = 11;
        try {
            double d = Double.parseDouble(this.f12047OooOOO);
            int i5 = (int) d;
            if (i5 != d) {
                throw new o00OOO00.OooO00o("Expected an int but was " + this.f12047OooOOO + " at path " + OooOo00());
            }
            this.f12047OooOOO = null;
            this.f12045OooOO0O = 0;
            int[] iArr3 = this.f12037OooO0oO;
            int i6 = this.f12034OooO0Oo - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            throw new o00OOO00.OooO00o("Expected an int but was " + this.f12047OooOOO + " at path " + OooOo00());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final String Oooo0O0() throws IOException {
        String strOooooOO;
        int iOoooOOO = this.f12045OooOO0O;
        if (iOoooOOO == 0) {
            iOoooOOO = OoooOOO();
        }
        if (iOoooOOO == 10) {
            strOooooOO = o00Oo0();
        } else if (iOoooOOO == 9) {
            strOooooOO = o00O0O(f12041OooOOOo);
        } else if (iOoooOOO == 8) {
            strOooooOO = o00O0O(f12040OooOOOO);
        } else if (iOoooOOO == 11) {
            strOooooOO = this.f12047OooOOO;
            this.f12047OooOOO = null;
        } else if (iOoooOOO == 16) {
            strOooooOO = Long.toString(this.f12046OooOO0o);
        } else {
            if (iOoooOOO != 17) {
                throw new o00OOO00.OooO00o("Expected a string but was " + Oooo0OO() + " at path " + OooOo00());
            }
            strOooooOO = this.f12044OooOO0.OooooOO(this.f12048OooOOO0);
        }
        this.f12045OooOO0O = 0;
        int[] iArr = this.f12037OooO0oO;
        int i = this.f12034OooO0Oo - 1;
        iArr[i] = iArr[i] + 1;
        return strOooooOO;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final JsonReader.Token Oooo0OO() throws IOException {
        int iOoooOOO = this.f12045OooOO0O;
        if (iOoooOOO == 0) {
            iOoooOOO = OoooOOO();
        }
        switch (iOoooOOO) {
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
    public final int Oooo0oO(JsonReader.OooO00o oooO00o) throws IOException {
        int iOoooOOO = this.f12045OooOO0O;
        if (iOoooOOO == 0) {
            iOoooOOO = OoooOOO();
        }
        if (iOoooOOO < 12 || iOoooOOO > 15) {
            return -1;
        }
        if (iOoooOOO == 15) {
            return Ooooo00(this.f12047OooOOO, oooO00o);
        }
        int iO0000O0 = this.f12043OooO.o0000O0(oooO00o.f12039OooO0O0);
        if (iO0000O0 != -1) {
            this.f12045OooOO0O = 0;
            this.f12035OooO0o[this.f12034OooO0Oo - 1] = oooO00o.f12038OooO00o[iO0000O0];
            return iO0000O0;
        }
        String str = this.f12035OooO0o[this.f12034OooO0Oo - 1];
        String strOooooo = Oooooo();
        int iOoooo00 = Ooooo00(strOooooo, oooO00o);
        if (iOoooo00 == -1) {
            this.f12045OooOO0O = 15;
            this.f12047OooOOO = strOooooo;
            this.f12035OooO0o[this.f12034OooO0Oo - 1] = str;
        }
        return iOoooo00;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void Oooo0oo() throws IOException {
        int iOoooOOO = this.f12045OooOO0O;
        if (iOoooOOO == 0) {
            iOoooOOO = OoooOOO();
        }
        if (iOoooOOO == 14) {
            long jOooOoOO = this.f12043OooO.OooOoOO(f12042OooOOo0);
            o0O0ooO o0o0ooo = this.f12044OooOO0;
            if (jOooOoOO == -1) {
                jOooOoOO = o0o0ooo.f58720OooO0o0;
            }
            o0o0ooo.skip(jOooOoOO);
        } else if (iOoooOOO == 13) {
            oo000o(f12041OooOOOo);
        } else if (iOoooOOO == 12) {
            oo000o(f12040OooOOOO);
        } else if (iOoooOOO != 15) {
            throw new o00OOO00.OooO00o("Expected a name but was " + Oooo0OO() + " at path " + OooOo00());
        }
        this.f12045OooOO0O = 0;
        this.f12035OooO0o[this.f12034OooO0Oo - 1] = "null";
    }

    public final void OoooO() throws IOException {
        OoooO0O("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x01b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:158:0x01db  */
    /* JADX WARN: Code duplicated, block: B:160:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:163:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:169:0x01f8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:170:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:172:0x0205  */
    /* JADX WARN: Code duplicated, block: B:174:0x020c  */
    /* JADX WARN: Code duplicated, block: B:184:0x0229  */
    /* JADX WARN: Code duplicated, block: B:192:0x023b  */
    /* JADX WARN: Code duplicated, block: B:194:0x0240  */
    /* JADX WARN: Code duplicated, block: B:231:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0112 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:87:0x0113  */
    /* JADX WARN: Code duplicated, block: B:91:0x0123  */
    /* JADX WARN: Code duplicated, block: B:93:0x012c  */
    public final int OoooOOO() throws IOException {
        boolean z;
        int iOoooooO;
        int i;
        int i2;
        String str;
        String str2;
        char cOooOoO;
        int i3;
        char c;
        int i4;
        int i5;
        byte bOooOoO;
        o00O000o o00o000o2;
        char c2;
        int[] iArr = this.f12036OooO0o0;
        int i6 = this.f12034OooO0Oo;
        int i7 = iArr[i6 - 1];
        o0O0ooO o0o0ooo = this.f12044OooOO0;
        boolean z2 = true;
        if (i7 == 1) {
            iArr[i6 - 1] = 2;
        } else if (i7 == 2) {
            int iOoooooO2 = OoooooO(true);
            o0o0ooo.readByte();
            if (iOoooooO2 != 44) {
                if (iOoooooO2 == 59) {
                    OoooO();
                    throw null;
                }
                if (iOoooooO2 == 93) {
                    this.f12045OooOO0O = 4;
                    return 4;
                }
                OoooO0O("Unterminated array");
                throw null;
            }
        } else {
            if (i7 == 3 || i7 == 5) {
                iArr[i6 - 1] = 4;
                if (i7 == 5) {
                    int iOoooooO3 = OoooooO(true);
                    o0o0ooo.readByte();
                    if (iOoooooO3 != 44) {
                        if (iOoooooO3 == 59) {
                            OoooO();
                            throw null;
                        }
                        if (iOoooooO3 == 125) {
                            this.f12045OooOO0O = 2;
                            return 2;
                        }
                        OoooO0O("Unterminated object");
                        throw null;
                    }
                    z = true;
                } else {
                    z = true;
                }
                int iOoooooO4 = OoooooO(z);
                if (iOoooooO4 == 34) {
                    o0o0ooo.readByte();
                    this.f12045OooOO0O = 13;
                    return 13;
                }
                if (iOoooooO4 == 39) {
                    o0o0ooo.readByte();
                    OoooO();
                    throw null;
                }
                if (iOoooooO4 != 125) {
                    OoooO();
                    throw null;
                }
                if (i7 == 5) {
                    OoooO0O("Expected name");
                    throw null;
                }
                o0o0ooo.readByte();
                this.f12045OooOO0O = 2;
                return 2;
            }
            if (i7 != 4) {
                if (i7 == 6) {
                    iArr[i6 - 1] = 7;
                } else {
                    if (i7 == 7) {
                        if (OoooooO(false) == -1) {
                            this.f12045OooOO0O = 18;
                            return 18;
                        }
                        OoooO();
                        throw null;
                    }
                    if (i7 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                iOoooooO = OoooooO(true);
                if (iOoooooO != 34) {
                    o0o0ooo.readByte();
                    this.f12045OooOO0O = 9;
                    return 9;
                }
                if (iOoooooO != 39) {
                    OoooO();
                    throw null;
                }
                if (iOoooooO != 44 || iOoooooO == 59) {
                    i = 1;
                } else {
                    if (iOoooooO == 91) {
                        o0o0ooo.readByte();
                        this.f12045OooOO0O = 3;
                        return 3;
                    }
                    if (iOoooooO != 93) {
                        if (iOoooooO == 123) {
                            o0o0ooo.readByte();
                            this.f12045OooOO0O = 1;
                            return 1;
                        }
                        byte bOooOoO2 = o0o0ooo.OooOoO(0L);
                        o00O000o o00o000o3 = this.f12043OooO;
                        if (bOooOoO2 == 116 || bOooOoO2 == 84) {
                            i2 = 5;
                            str2 = ServerProtocol.DIALOG_RETURN_SCOPES_TRUE;
                            str = "TRUE";
                        } else {
                            if (bOooOoO2 != 102 && bOooOoO2 != 70) {
                                if (bOooOoO2 != 110 && bOooOoO2 != 78) {
                                    i2 = 0;
                                    break;
                                }
                                i2 = 7;
                                str2 = "null";
                                str = "NULL";
                                if (i2 != 0) {
                                    return i2;
                                }
                                long j = 0;
                                boolean z3 = true;
                                i3 = 0;
                                c = 0;
                                boolean z4 = false;
                                while (true) {
                                    i4 = i3 + 1;
                                    if (o00o000o3.request(i4)) {
                                        bOooOoO = o0o0ooo.OooOoO(i3);
                                        if (bOooOoO != 43) {
                                            if (bOooOoO != 69 || bOooOoO == 101) {
                                                o00o000o2 = o00o000o3;
                                                if (c != 2 || c == 4) {
                                                    c = 5;
                                                    i3 = i4;
                                                    o00o000o3 = o00o000o2;
                                                    z2 = true;
                                                } else {
                                                    i5 = 0;
                                                }
                                            } else if (bOooOoO == 45) {
                                                o00o000o2 = o00o000o3;
                                                c2 = 6;
                                                if (c == 0) {
                                                    c = 1;
                                                    z4 = true;
                                                } else {
                                                    if (c != 5) {
                                                        i5 = 0;
                                                    }
                                                    c = c2;
                                                }
                                                i3 = i4;
                                                o00o000o3 = o00o000o2;
                                                z2 = true;
                                            } else if (bOooOoO != 46) {
                                                if (bOooOoO >= 48 && bOooOoO <= 57) {
                                                    if (c == z2 || c == 0) {
                                                        o00o000o2 = o00o000o3;
                                                        j = -(bOooOoO - 48);
                                                        c = 2;
                                                    } else if (c != 2) {
                                                        o00o000o2 = o00o000o3;
                                                        if (c == 3) {
                                                            c = 4;
                                                        } else if (c == 5 || c == 6) {
                                                            c = 7;
                                                        }
                                                    } else if (j != 0) {
                                                        o00o000o2 = o00o000o3;
                                                        long j2 = (10 * j) - ((long) (bOooOoO - 48));
                                                        z3 = (j > -922337203685477580L || (j == -922337203685477580L && j2 < j)) & z3;
                                                        j = j2;
                                                    }
                                                    i3 = i4;
                                                    o00o000o3 = o00o000o2;
                                                    z2 = true;
                                                } else if (!OooooO0(bOooOoO)) {
                                                }
                                                i5 = 0;
                                            } else {
                                                o00o000o2 = o00o000o3;
                                                if (c == 2) {
                                                    c = 3;
                                                    i3 = i4;
                                                    o00o000o3 = o00o000o2;
                                                    z2 = true;
                                                } else {
                                                    i5 = 0;
                                                }
                                            }
                                            if (i5 != 0) {
                                                return i5;
                                            }
                                            if (OooooO0(o0o0ooo.OooOoO(0L))) {
                                                OoooO();
                                                throw null;
                                            }
                                            OoooO0O("Expected value");
                                            throw null;
                                        }
                                        o00o000o2 = o00o000o3;
                                        c2 = 6;
                                        if (c != 5) {
                                            i5 = 0;
                                            if (i5 != 0) {
                                                return i5;
                                            }
                                            if (OooooO0(o0o0ooo.OooOoO(0L))) {
                                                OoooO0O("Expected value");
                                                throw null;
                                            }
                                            OoooO();
                                            throw null;
                                        }
                                        c = c2;
                                        i3 = i4;
                                        o00o000o3 = o00o000o2;
                                        z2 = true;
                                    }
                                    if (c != 2 && z3 && ((j != Long.MIN_VALUE || z4) && (j != 0 || !z4))) {
                                        if (!z4) {
                                            j = -j;
                                        }
                                        this.f12046OooOO0o = j;
                                        o0o0ooo.skip(i3);
                                        i5 = 16;
                                        this.f12045OooOO0O = 16;
                                    } else if (c != 2 || c == 4 || c == 7) {
                                        this.f12048OooOOO0 = i3;
                                        i5 = 17;
                                        this.f12045OooOO0O = 17;
                                    } else {
                                        i5 = 0;
                                    }
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (OooooO0(o0o0ooo.OooOoO(0L))) {
                                        OoooO0O("Expected value");
                                        throw null;
                                    }
                                    OoooO();
                                    throw null;
                                }
                            }
                            i2 = 6;
                            str2 = "false";
                            str = "FALSE";
                        }
                        int length = str2.length();
                        int i8 = 1;
                        while (true) {
                            if (i8 >= length) {
                                if (!o00o000o3.request(length + 1) || !OooooO0(o0o0ooo.OooOoO(length))) {
                                    o0o0ooo.skip(length);
                                    this.f12045OooOO0O = i2;
                                    break;
                                }
                            } else {
                                int i9 = i8 + 1;
                                if (o00o000o3.request(i9) && ((cOooOoO = o0o0ooo.OooOoO(i8)) == str2.charAt(i8) || cOooOoO == str.charAt(i8))) {
                                    i8 = i9;
                                }
                            }
                            i2 = 0;
                            break;
                        }
                        if (i2 != 0) {
                            return i2;
                        }
                        long j3 = 0;
                        boolean z5 = true;
                        i3 = 0;
                        c = 0;
                        boolean z6 = false;
                        while (true) {
                            i4 = i3 + 1;
                            if (o00o000o3.request(i4)) {
                                bOooOoO = o0o0ooo.OooOoO(i3);
                                if (bOooOoO != 43) {
                                    if (bOooOoO != 69) {
                                        o00o000o2 = o00o000o3;
                                        if (c != 2) {
                                        }
                                        c = 5;
                                        i3 = i4;
                                        o00o000o3 = o00o000o2;
                                        z2 = true;
                                    } else {
                                        o00o000o2 = o00o000o3;
                                        if (c != 2) {
                                        }
                                        c = 5;
                                        i3 = i4;
                                        o00o000o3 = o00o000o2;
                                        z2 = true;
                                    }
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (OooooO0(o0o0ooo.OooOoO(0L))) {
                                        OoooO0O("Expected value");
                                        throw null;
                                    }
                                    OoooO();
                                    throw null;
                                }
                                o00o000o2 = o00o000o3;
                                c2 = 6;
                                if (c != 5) {
                                    i5 = 0;
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (OooooO0(o0o0ooo.OooOoO(0L))) {
                                        OoooO0O("Expected value");
                                        throw null;
                                    }
                                    OoooO();
                                    throw null;
                                }
                                c = c2;
                                i3 = i4;
                                o00o000o3 = o00o000o2;
                                z2 = true;
                            }
                            if (c != 2) {
                                if (c != 2) {
                                }
                                this.f12048OooOOO0 = i3;
                                i5 = 17;
                                this.f12045OooOO0O = 17;
                            } else {
                                if (c != 2) {
                                }
                                this.f12048OooOOO0 = i3;
                                i5 = 17;
                                this.f12045OooOO0O = 17;
                            }
                            if (i5 != 0) {
                                return i5;
                            }
                            if (OooooO0(o0o0ooo.OooOoO(0L))) {
                                OoooO0O("Expected value");
                                throw null;
                            }
                            OoooO();
                            throw null;
                        }
                    }
                    i = 1;
                    if (i7 == 1) {
                        o0o0ooo.readByte();
                        this.f12045OooOO0O = 4;
                        return 4;
                    }
                }
                if (i7 != i || i7 == 2) {
                    OoooO();
                    throw null;
                }
                OoooO0O("Unexpected value");
                throw null;
            }
            iArr[i6 - 1] = 5;
            int iOoooooO5 = OoooooO(true);
            o0o0ooo.readByte();
            if (iOoooooO5 != 58) {
                if (iOoooooO5 != 61) {
                    OoooO0O("Expected ':'");
                    throw null;
                }
                OoooO();
                throw null;
            }
        }
        iOoooooO = OoooooO(true);
        if (iOoooooO != 34) {
            o0o0ooo.readByte();
            this.f12045OooOO0O = 9;
            return 9;
        }
        if (iOoooooO != 39) {
            OoooO();
            throw null;
        }
        if (iOoooooO != 44) {
            i = 1;
        } else {
            i = 1;
        }
        if (i7 != i) {
        }
        OoooO();
        throw null;
    }

    public final int Ooooo00(String str, JsonReader.OooO00o oooO00o) {
        int length = oooO00o.f12038OooO00o.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(oooO00o.f12038OooO00o[i])) {
                this.f12045OooOO0O = 0;
                this.f12035OooO0o[this.f12034OooO0Oo - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final boolean OooooO0(int i) throws IOException {
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
        OoooO();
        throw null;
    }

    public final String Oooooo() throws IOException {
        String strO00O0O;
        int iOoooOOO = this.f12045OooOO0O;
        if (iOoooOOO == 0) {
            iOoooOOO = OoooOOO();
        }
        if (iOoooOOO == 14) {
            strO00O0O = o00Oo0();
        } else if (iOoooOOO == 13) {
            strO00O0O = o00O0O(f12041OooOOOo);
        } else if (iOoooOOO == 12) {
            strO00O0O = o00O0O(f12040OooOOOO);
        } else {
            if (iOoooOOO != 15) {
                throw new o00OOO00.OooO00o("Expected a name but was " + Oooo0OO() + " at path " + OooOo00());
            }
            strO00O0O = this.f12047OooOOO;
        }
        this.f12045OooOO0O = 0;
        this.f12035OooO0o[this.f12034OooO0Oo - 1] = strO00O0O;
        return strO00O0O;
    }

    public final int OoooooO(boolean z) throws IOException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            o00O000o o00o000o2 = this.f12043OooO;
            if (!o00o000o2.request(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            o0O0ooO o0o0ooo = this.f12044OooOO0;
            byte bOooOoO = o0o0ooo.OooOoO(j);
            if (bOooOoO != 10 && bOooOoO != 32 && bOooOoO != 13 && bOooOoO != 9) {
                o0o0ooo.skip(i2 - 1);
                if (bOooOoO == 47) {
                    if (!o00o000o2.request(2L)) {
                        return bOooOoO;
                    }
                    OoooO();
                    throw null;
                }
                if (bOooOoO != 35) {
                    return bOooOoO;
                }
                OoooO();
                throw null;
            }
            i = i2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f12045OooOO0O = 0;
        this.f12036OooO0o0[0] = 8;
        this.f12034OooO0Oo = 1;
        this.f12044OooOO0.OooO0oO();
        this.f12043OooO.close();
    }

    public final String o00O0O(ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long jOooOoOO = this.f12043OooO.OooOoOO(byteString);
            if (jOooOoOO == -1) {
                OoooO0O("Unterminated string");
                throw null;
            }
            o0O0ooO o0o0ooo = this.f12044OooOO0;
            if (o0o0ooo.OooOoO(jOooOoOO) != 92) {
                if (sb == null) {
                    String strOooooOO = o0o0ooo.OooooOO(jOooOoOO);
                    o0o0ooo.readByte();
                    return strOooooOO;
                }
                sb.append(o0o0ooo.OooooOO(jOooOoOO));
                o0o0ooo.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(o0o0ooo.OooooOO(jOooOoOO));
            o0o0ooo.readByte();
            sb.append(o00Ooo());
        }
    }

    public final String o00Oo0() throws IOException {
        long jOooOoOO = this.f12043OooO.OooOoOO(f12042OooOOo0);
        o0O0ooO o0o0ooo = this.f12044OooOO0;
        return jOooOoOO != -1 ? o0o0ooo.OooooOO(jOooOoOO) : o0o0ooo.OoooOOO();
    }

    public final char o00Ooo() throws IOException {
        int i;
        int i2;
        o00O000o o00o000o2 = this.f12043OooO;
        if (!o00o000o2.request(1L)) {
            OoooO0O("Unterminated escape sequence");
            throw null;
        }
        o0O0ooO o0o0ooo = this.f12044OooOO0;
        byte b = o0o0ooo.readByte();
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
            OoooO0O("Invalid escape sequence: \\" + ((char) b));
            throw null;
        }
        if (!o00o000o2.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + OooOo00());
        }
        char c = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            byte bOooOoO = o0o0ooo.OooOoO(i3);
            char c2 = (char) (c << 4);
            if (bOooOoO < 48 || bOooOoO > 57) {
                if (bOooOoO >= 97 && bOooOoO <= 102) {
                    i = bOooOoO - 97;
                } else {
                    if (bOooOoO < 65 || bOooOoO > 70) {
                        OoooO0O("\\u".concat(o0o0ooo.OooooOO(4L)));
                        throw null;
                    }
                    i = bOooOoO - 65;
                }
                i2 = i + 10;
            } else {
                i2 = bOooOoO - 48;
            }
            c = (char) (i2 + c2);
        }
        o0o0ooo.skip(4L);
        return c;
    }

    public final void oo000o(ByteString byteString) throws IOException {
        while (true) {
            long jOooOoOO = this.f12043OooO.OooOoOO(byteString);
            if (jOooOoOO == -1) {
                OoooO0O("Unterminated string");
                throw null;
            }
            o0O0ooO o0o0ooo = this.f12044OooOO0;
            if (o0o0ooo.OooOoO(jOooOoOO) != 92) {
                o0o0ooo.skip(jOooOoOO + 1);
                return;
            } else {
                o0o0ooo.skip(jOooOoOO + 1);
                o00Ooo();
            }
        }
    }

    public final String toString() {
        return "JsonReader(" + this.f12043OooO + ")";
    }
}

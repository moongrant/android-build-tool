package com.airbnb.lottie.parser.moshi;

import androidx.annotation.Nullable;
import com.facebook.internal.ServerProtocol;
import java.io.EOFException;
import java.io.IOException;
import o00OOO00.OooO0O0;
import okio.ByteString;
import p662o0oooO0O.o0O0o0;
import p662o0oooO0O.o0o0000;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends JsonReader {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final ByteString f12029OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final ByteString f12030OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final ByteString f12031OooOOo0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o0O0o0 f12032OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final oo0OOoo f12033OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f12034OooOO0O = 0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f12035OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public String f12036OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f12037OooOOO0;

    static {
        ByteString byteString = ByteString.f60193OooO0oO;
        f12029OooOOOO = ByteString.OooO00o.OooO0OO("'\\");
        f12030OooOOOo = ByteString.OooO00o.OooO0OO("\"\\");
        f12031OooOOo0 = ByteString.OooO00o.OooO0OO("{}[]:, \n\t\r\f/\\;#=");
        ByteString.OooO00o.OooO0OO("\n\r");
        ByteString.OooO00o.OooO0OO("*/");
    }

    public OooO00o(o0o0000 o0o0000Var) {
        this.f12032OooO = o0o0000Var;
        this.f12033OooOO0 = o0o0000Var.f59801OooO0o0;
        Oooo0OO(6);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void OooO00o() throws IOException {
        int iOoooOOO = this.f12034OooOO0O;
        if (iOoooOOO == 0) {
            iOoooOOO = OoooOOO();
        }
        if (iOoooOOO == 3) {
            Oooo0OO(1);
            this.f12026OooO0oO[this.f12023OooO0Oo - 1] = 0;
            this.f12034OooOO0O = 0;
        } else {
            throw new o00OOO00.OooO00o("Expected BEGIN_ARRAY but was " + Oooo0O0() + " at path " + OooOo00());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void OooO0OO() throws IOException {
        int iOoooOOO = this.f12034OooOO0O;
        if (iOoooOOO == 0) {
            iOoooOOO = OoooOOO();
        }
        if (iOoooOOO == 1) {
            Oooo0OO(3);
            this.f12034OooOO0O = 0;
        } else {
            throw new o00OOO00.OooO00o("Expected BEGIN_OBJECT but was " + Oooo0O0() + " at path " + OooOo00());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void OooO0oO() throws IOException {
        int iOoooOOO = this.f12034OooOO0O;
        if (iOoooOOO == 0) {
            iOoooOOO = OoooOOO();
        }
        if (iOoooOOO != 4) {
            throw new o00OOO00.OooO00o("Expected END_ARRAY but was " + Oooo0O0() + " at path " + OooOo00());
        }
        int i = this.f12023OooO0Oo - 1;
        this.f12023OooO0Oo = i;
        int[] iArr = this.f12026OooO0oO;
        int i2 = i - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f12034OooOO0O = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void OooOOo() throws IOException {
        int iOoooOOO = this.f12034OooOO0O;
        if (iOoooOOO == 0) {
            iOoooOOO = OoooOOO();
        }
        if (iOoooOOO != 2) {
            throw new o00OOO00.OooO00o("Expected END_OBJECT but was " + Oooo0O0() + " at path " + OooOo00());
        }
        int i = this.f12023OooO0Oo - 1;
        this.f12023OooO0Oo = i;
        this.f12024OooO0o[i] = null;
        int[] iArr = this.f12026OooO0oO;
        int i2 = i - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f12034OooOO0O = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final boolean OooOo() throws IOException {
        int iOoooOOO = this.f12034OooOO0O;
        if (iOoooOOO == 0) {
            iOoooOOO = OoooOOO();
        }
        if (iOoooOOO == 5) {
            this.f12034OooOO0O = 0;
            int[] iArr = this.f12026OooO0oO;
            int i = this.f12023OooO0Oo - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iOoooOOO == 6) {
            this.f12034OooOO0O = 0;
            int[] iArr2 = this.f12026OooO0oO;
            int i2 = this.f12023OooO0Oo - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new o00OOO00.OooO00o("Expected a boolean but was " + Oooo0O0() + " at path " + OooOo00());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final boolean OooOo0() throws IOException {
        int iOoooOOO = this.f12034OooOO0O;
        if (iOoooOOO == 0) {
            iOoooOOO = OoooOOO();
        }
        return (iOoooOOO == 2 || iOoooOOO == 4 || iOoooOOO == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final double OooOooo() throws IOException {
        int iOoooOOO = this.f12034OooOO0O;
        if (iOoooOOO == 0) {
            iOoooOOO = OoooOOO();
        }
        if (iOoooOOO == 16) {
            this.f12034OooOO0O = 0;
            int[] iArr = this.f12026OooO0oO;
            int i = this.f12023OooO0Oo - 1;
            iArr[i] = iArr[i] + 1;
            return this.f12035OooOO0o;
        }
        if (iOoooOOO == 17) {
            this.f12036OooOOO = this.f12033OooOO0.OooooOO(this.f12037OooOOO0);
        } else if (iOoooOOO == 9) {
            this.f12036OooOOO = o00O0O(f12030OooOOOo);
        } else if (iOoooOOO == 8) {
            this.f12036OooOOO = o00O0O(f12029OooOOOO);
        } else if (iOoooOOO == 10) {
            this.f12036OooOOO = o00Ooo();
        } else if (iOoooOOO != 11) {
            throw new o00OOO00.OooO00o("Expected a double but was " + Oooo0O0() + " at path " + OooOo00());
        }
        this.f12034OooOO0O = 11;
        try {
            double d = Double.parseDouble(this.f12036OooOOO);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new OooO0O0("JSON forbids NaN and infinities: " + d + " at path " + OooOo00());
            }
            this.f12036OooOOO = null;
            this.f12034OooOO0O = 0;
            int[] iArr2 = this.f12026OooO0oO;
            int i2 = this.f12023OooO0Oo - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            throw new o00OOO00.OooO00o("Expected a double but was " + this.f12036OooOOO + " at path " + OooOo00());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final String Oooo0() throws IOException {
        String strOooooOO;
        int iOoooOOO = this.f12034OooOO0O;
        if (iOoooOOO == 0) {
            iOoooOOO = OoooOOO();
        }
        if (iOoooOOO == 10) {
            strOooooOO = o00Ooo();
        } else if (iOoooOOO == 9) {
            strOooooOO = o00O0O(f12030OooOOOo);
        } else if (iOoooOOO == 8) {
            strOooooOO = o00O0O(f12029OooOOOO);
        } else if (iOoooOOO == 11) {
            strOooooOO = this.f12036OooOOO;
            this.f12036OooOOO = null;
        } else if (iOoooOOO == 16) {
            strOooooOO = Long.toString(this.f12035OooOO0o);
        } else {
            if (iOoooOOO != 17) {
                throw new o00OOO00.OooO00o("Expected a string but was " + Oooo0O0() + " at path " + OooOo00());
            }
            strOooooOO = this.f12033OooOO0.OooooOO(this.f12037OooOOO0);
        }
        this.f12034OooOO0O = 0;
        int[] iArr = this.f12026OooO0oO;
        int i = this.f12023OooO0Oo - 1;
        iArr[i] = iArr[i] + 1;
        return strOooooOO;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final int Oooo00o() throws IOException {
        int iOoooOOO = this.f12034OooOO0O;
        if (iOoooOOO == 0) {
            iOoooOOO = OoooOOO();
        }
        if (iOoooOOO == 16) {
            long j = this.f12035OooOO0o;
            int i = (int) j;
            if (j == i) {
                this.f12034OooOO0O = 0;
                int[] iArr = this.f12026OooO0oO;
                int i2 = this.f12023OooO0Oo - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new o00OOO00.OooO00o("Expected an int but was " + this.f12035OooOO0o + " at path " + OooOo00());
        }
        if (iOoooOOO == 17) {
            this.f12036OooOOO = this.f12033OooOO0.OooooOO(this.f12037OooOOO0);
        } else if (iOoooOOO == 9 || iOoooOOO == 8) {
            String strO00O0O = iOoooOOO == 9 ? o00O0O(f12030OooOOOo) : o00O0O(f12029OooOOOO);
            this.f12036OooOOO = strO00O0O;
            try {
                int i3 = Integer.parseInt(strO00O0O);
                this.f12034OooOO0O = 0;
                int[] iArr2 = this.f12026OooO0oO;
                int i4 = this.f12023OooO0Oo - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iOoooOOO != 11) {
            throw new o00OOO00.OooO00o("Expected an int but was " + Oooo0O0() + " at path " + OooOo00());
        }
        this.f12034OooOO0O = 11;
        try {
            double d = Double.parseDouble(this.f12036OooOOO);
            int i5 = (int) d;
            if (i5 != d) {
                throw new o00OOO00.OooO00o("Expected an int but was " + this.f12036OooOOO + " at path " + OooOo00());
            }
            this.f12036OooOOO = null;
            this.f12034OooOO0O = 0;
            int[] iArr3 = this.f12026OooO0oO;
            int i6 = this.f12023OooO0Oo - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            throw new o00OOO00.OooO00o("Expected an int but was " + this.f12036OooOOO + " at path " + OooOo00());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final JsonReader.Token Oooo0O0() throws IOException {
        int iOoooOOO = this.f12034OooOO0O;
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
    public final int Oooo0o0(JsonReader.OooO00o oooO00o) throws IOException {
        int iOoooOOO = this.f12034OooOO0O;
        if (iOoooOOO == 0) {
            iOoooOOO = OoooOOO();
        }
        if (iOoooOOO < 12 || iOoooOOO > 15) {
            return -1;
        }
        if (iOoooOOO == 15) {
            return OoooOoo(this.f12036OooOOO, oooO00o);
        }
        int iOoooo0o = this.f12032OooO.Ooooo0o(oooO00o.f12028OooO0O0);
        if (iOoooo0o != -1) {
            this.f12034OooOO0O = 0;
            this.f12024OooO0o[this.f12023OooO0Oo - 1] = oooO00o.f12027OooO00o[iOoooo0o];
            return iOoooo0o;
        }
        String str = this.f12024OooO0o[this.f12023OooO0Oo - 1];
        String strOooooo = Oooooo();
        int iOoooOoo = OoooOoo(strOooooo, oooO00o);
        if (iOoooOoo == -1) {
            this.f12034OooOO0O = 15;
            this.f12036OooOOO = strOooooo;
            this.f12024OooO0o[this.f12023OooO0Oo - 1] = str;
        }
        return iOoooOoo;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void Oooo0oO() throws IOException {
        int iOoooOOO = this.f12034OooOO0O;
        if (iOoooOOO == 0) {
            iOoooOOO = OoooOOO();
        }
        if (iOoooOOO == 14) {
            long jOooOoO0 = this.f12032OooO.OooOoO0(f12031OooOOo0);
            oo0OOoo oo0oooo = this.f12033OooOO0;
            if (jOooOoO0 == -1) {
                jOooOoO0 = oo0oooo.f59828OooO0o0;
            }
            oo0oooo.skip(jOooOoO0);
        } else if (iOoooOOO == 13) {
            o00oO0o(f12030OooOOOo);
        } else if (iOoooOOO == 12) {
            o00oO0o(f12029OooOOOO);
        } else if (iOoooOOO != 15) {
            throw new o00OOO00.OooO00o("Expected a name but was " + Oooo0O0() + " at path " + OooOo00());
        }
        this.f12034OooOO0O = 0;
        this.f12024OooO0o[this.f12023OooO0Oo - 1] = "null";
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void OoooO00() throws IOException {
        int i = 0;
        do {
            int iOoooOOO = this.f12034OooOO0O;
            if (iOoooOOO == 0) {
                iOoooOOO = OoooOOO();
            }
            if (iOoooOOO == 3) {
                Oooo0OO(1);
            } else {
                if (iOoooOOO == 1) {
                    Oooo0OO(3);
                } else if (iOoooOOO == 4) {
                    i--;
                    if (i < 0) {
                        throw new o00OOO00.OooO00o("Expected a value but was " + Oooo0O0() + " at path " + OooOo00());
                    }
                    this.f12023OooO0Oo--;
                } else if (iOoooOOO == 2) {
                    i--;
                    if (i < 0) {
                        throw new o00OOO00.OooO00o("Expected a value but was " + Oooo0O0() + " at path " + OooOo00());
                    }
                    this.f12023OooO0Oo--;
                } else {
                    oo0OOoo oo0oooo = this.f12033OooOO0;
                    if (iOoooOOO == 14 || iOoooOOO == 10) {
                        long jOooOoO0 = this.f12032OooO.OooOoO0(f12031OooOOo0);
                        if (jOooOoO0 == -1) {
                            jOooOoO0 = oo0oooo.f59828OooO0o0;
                        }
                        oo0oooo.skip(jOooOoO0);
                    } else if (iOoooOOO == 9 || iOoooOOO == 13) {
                        o00oO0o(f12030OooOOOo);
                    } else if (iOoooOOO == 8 || iOoooOOO == 12) {
                        o00oO0o(f12029OooOOOO);
                    } else if (iOoooOOO == 17) {
                        oo0oooo.skip(this.f12037OooOOO0);
                    } else if (iOoooOOO == 18) {
                        throw new o00OOO00.OooO00o("Expected a value but was " + Oooo0O0() + " at path " + OooOo00());
                    }
                }
                this.f12034OooOO0O = 0;
            }
            i++;
            this.f12034OooOO0O = 0;
        } while (i != 0);
        int[] iArr = this.f12026OooO0oO;
        int i2 = this.f12023OooO0Oo;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f12024OooO0o[i2 - 1] = "null";
    }

    public final void OoooOO0() throws IOException {
        OoooO0("Use JsonReader.setLenient(true) to accept malformed JSON");
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
        char cOooOo;
        int i3;
        char c;
        int i4;
        int i5;
        byte bOooOo;
        o0O0o0 o0o0o0;
        char c2;
        int[] iArr = this.f12025OooO0o0;
        int i6 = this.f12023OooO0Oo;
        int i7 = iArr[i6 - 1];
        oo0OOoo oo0oooo = this.f12033OooOO0;
        boolean z2 = true;
        if (i7 == 1) {
            iArr[i6 - 1] = 2;
        } else if (i7 == 2) {
            int iOoooooO2 = OoooooO(true);
            oo0oooo.readByte();
            if (iOoooooO2 != 44) {
                if (iOoooooO2 == 59) {
                    OoooOO0();
                    throw null;
                }
                if (iOoooooO2 == 93) {
                    this.f12034OooOO0O = 4;
                    return 4;
                }
                OoooO0("Unterminated array");
                throw null;
            }
        } else {
            if (i7 == 3 || i7 == 5) {
                iArr[i6 - 1] = 4;
                if (i7 == 5) {
                    int iOoooooO3 = OoooooO(true);
                    oo0oooo.readByte();
                    if (iOoooooO3 != 44) {
                        if (iOoooooO3 == 59) {
                            OoooOO0();
                            throw null;
                        }
                        if (iOoooooO3 == 125) {
                            this.f12034OooOO0O = 2;
                            return 2;
                        }
                        OoooO0("Unterminated object");
                        throw null;
                    }
                    z = true;
                } else {
                    z = true;
                }
                int iOoooooO4 = OoooooO(z);
                if (iOoooooO4 == 34) {
                    oo0oooo.readByte();
                    this.f12034OooOO0O = 13;
                    return 13;
                }
                if (iOoooooO4 == 39) {
                    oo0oooo.readByte();
                    OoooOO0();
                    throw null;
                }
                if (iOoooooO4 != 125) {
                    OoooOO0();
                    throw null;
                }
                if (i7 == 5) {
                    OoooO0("Expected name");
                    throw null;
                }
                oo0oooo.readByte();
                this.f12034OooOO0O = 2;
                return 2;
            }
            if (i7 != 4) {
                if (i7 == 6) {
                    iArr[i6 - 1] = 7;
                } else {
                    if (i7 == 7) {
                        if (OoooooO(false) == -1) {
                            this.f12034OooOO0O = 18;
                            return 18;
                        }
                        OoooOO0();
                        throw null;
                    }
                    if (i7 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                iOoooooO = OoooooO(true);
                if (iOoooooO != 34) {
                    oo0oooo.readByte();
                    this.f12034OooOO0O = 9;
                    return 9;
                }
                if (iOoooooO != 39) {
                    OoooOO0();
                    throw null;
                }
                if (iOoooooO != 44 || iOoooooO == 59) {
                    i = 1;
                } else {
                    if (iOoooooO == 91) {
                        oo0oooo.readByte();
                        this.f12034OooOO0O = 3;
                        return 3;
                    }
                    if (iOoooooO != 93) {
                        if (iOoooooO == 123) {
                            oo0oooo.readByte();
                            this.f12034OooOO0O = 1;
                            return 1;
                        }
                        byte bOooOo2 = oo0oooo.OooOo(0L);
                        o0O0o0 o0o0o1 = this.f12032OooO;
                        if (bOooOo2 == 116 || bOooOo2 == 84) {
                            i2 = 5;
                            str2 = ServerProtocol.DIALOG_RETURN_SCOPES_TRUE;
                            str = "TRUE";
                        } else {
                            if (bOooOo2 != 102 && bOooOo2 != 70) {
                                if (bOooOo2 != 110 && bOooOo2 != 78) {
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
                                    if (o0o0o1.request(i4)) {
                                        bOooOo = oo0oooo.OooOo(i3);
                                        if (bOooOo != 43) {
                                            if (bOooOo != 69 || bOooOo == 101) {
                                                o0o0o0 = o0o0o1;
                                                if (c != 2 || c == 4) {
                                                    c = 5;
                                                    i3 = i4;
                                                    o0o0o1 = o0o0o0;
                                                    z2 = true;
                                                } else {
                                                    i5 = 0;
                                                }
                                            } else if (bOooOo == 45) {
                                                o0o0o0 = o0o0o1;
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
                                                o0o0o1 = o0o0o0;
                                                z2 = true;
                                            } else if (bOooOo != 46) {
                                                if (bOooOo >= 48 && bOooOo <= 57) {
                                                    if (c == z2 || c == 0) {
                                                        o0o0o0 = o0o0o1;
                                                        j = -(bOooOo - 48);
                                                        c = 2;
                                                    } else if (c != 2) {
                                                        o0o0o0 = o0o0o1;
                                                        if (c == 3) {
                                                            c = 4;
                                                        } else if (c == 5 || c == 6) {
                                                            c = 7;
                                                        }
                                                    } else if (j != 0) {
                                                        o0o0o0 = o0o0o1;
                                                        long j2 = (10 * j) - ((long) (bOooOo - 48));
                                                        z3 = (j > -922337203685477580L || (j == -922337203685477580L && j2 < j)) & z3;
                                                        j = j2;
                                                    }
                                                    i3 = i4;
                                                    o0o0o1 = o0o0o0;
                                                    z2 = true;
                                                } else if (!OooooO0(bOooOo)) {
                                                }
                                                i5 = 0;
                                            } else {
                                                o0o0o0 = o0o0o1;
                                                if (c == 2) {
                                                    c = 3;
                                                    i3 = i4;
                                                    o0o0o1 = o0o0o0;
                                                    z2 = true;
                                                } else {
                                                    i5 = 0;
                                                }
                                            }
                                            if (i5 != 0) {
                                                return i5;
                                            }
                                            if (OooooO0(oo0oooo.OooOo(0L))) {
                                                OoooOO0();
                                                throw null;
                                            }
                                            OoooO0("Expected value");
                                            throw null;
                                        }
                                        o0o0o0 = o0o0o1;
                                        c2 = 6;
                                        if (c != 5) {
                                            i5 = 0;
                                            if (i5 != 0) {
                                                return i5;
                                            }
                                            if (OooooO0(oo0oooo.OooOo(0L))) {
                                                OoooO0("Expected value");
                                                throw null;
                                            }
                                            OoooOO0();
                                            throw null;
                                        }
                                        c = c2;
                                        i3 = i4;
                                        o0o0o1 = o0o0o0;
                                        z2 = true;
                                    }
                                    if (c != 2 && z3 && ((j != Long.MIN_VALUE || z4) && (j != 0 || !z4))) {
                                        if (!z4) {
                                            j = -j;
                                        }
                                        this.f12035OooOO0o = j;
                                        oo0oooo.skip(i3);
                                        i5 = 16;
                                        this.f12034OooOO0O = 16;
                                    } else if (c != 2 || c == 4 || c == 7) {
                                        this.f12037OooOOO0 = i3;
                                        i5 = 17;
                                        this.f12034OooOO0O = 17;
                                    } else {
                                        i5 = 0;
                                    }
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (OooooO0(oo0oooo.OooOo(0L))) {
                                        OoooO0("Expected value");
                                        throw null;
                                    }
                                    OoooOO0();
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
                                if (!o0o0o1.request(length + 1) || !OooooO0(oo0oooo.OooOo(length))) {
                                    oo0oooo.skip(length);
                                    this.f12034OooOO0O = i2;
                                    break;
                                }
                            } else {
                                int i9 = i8 + 1;
                                if (o0o0o1.request(i9) && ((cOooOo = oo0oooo.OooOo(i8)) == str2.charAt(i8) || cOooOo == str.charAt(i8))) {
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
                            if (o0o0o1.request(i4)) {
                                bOooOo = oo0oooo.OooOo(i3);
                                if (bOooOo != 43) {
                                    if (bOooOo != 69) {
                                        o0o0o0 = o0o0o1;
                                        if (c != 2) {
                                        }
                                        c = 5;
                                        i3 = i4;
                                        o0o0o1 = o0o0o0;
                                        z2 = true;
                                    } else {
                                        o0o0o0 = o0o0o1;
                                        if (c != 2) {
                                        }
                                        c = 5;
                                        i3 = i4;
                                        o0o0o1 = o0o0o0;
                                        z2 = true;
                                    }
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (OooooO0(oo0oooo.OooOo(0L))) {
                                        OoooO0("Expected value");
                                        throw null;
                                    }
                                    OoooOO0();
                                    throw null;
                                }
                                o0o0o0 = o0o0o1;
                                c2 = 6;
                                if (c != 5) {
                                    i5 = 0;
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (OooooO0(oo0oooo.OooOo(0L))) {
                                        OoooO0("Expected value");
                                        throw null;
                                    }
                                    OoooOO0();
                                    throw null;
                                }
                                c = c2;
                                i3 = i4;
                                o0o0o1 = o0o0o0;
                                z2 = true;
                            }
                            if (c != 2) {
                                if (c != 2) {
                                }
                                this.f12037OooOOO0 = i3;
                                i5 = 17;
                                this.f12034OooOO0O = 17;
                            } else {
                                if (c != 2) {
                                }
                                this.f12037OooOOO0 = i3;
                                i5 = 17;
                                this.f12034OooOO0O = 17;
                            }
                            if (i5 != 0) {
                                return i5;
                            }
                            if (OooooO0(oo0oooo.OooOo(0L))) {
                                OoooO0("Expected value");
                                throw null;
                            }
                            OoooOO0();
                            throw null;
                        }
                    }
                    i = 1;
                    if (i7 == 1) {
                        oo0oooo.readByte();
                        this.f12034OooOO0O = 4;
                        return 4;
                    }
                }
                if (i7 != i || i7 == 2) {
                    OoooOO0();
                    throw null;
                }
                OoooO0("Unexpected value");
                throw null;
            }
            iArr[i6 - 1] = 5;
            int iOoooooO5 = OoooooO(true);
            oo0oooo.readByte();
            if (iOoooooO5 != 58) {
                if (iOoooooO5 != 61) {
                    OoooO0("Expected ':'");
                    throw null;
                }
                OoooOO0();
                throw null;
            }
        }
        iOoooooO = OoooooO(true);
        if (iOoooooO != 34) {
            oo0oooo.readByte();
            this.f12034OooOO0O = 9;
            return 9;
        }
        if (iOoooooO != 39) {
            OoooOO0();
            throw null;
        }
        if (iOoooooO != 44) {
            i = 1;
        } else {
            i = 1;
        }
        if (i7 != i) {
        }
        OoooOO0();
        throw null;
    }

    public final int OoooOoo(String str, JsonReader.OooO00o oooO00o) {
        int length = oooO00o.f12027OooO00o.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(oooO00o.f12027OooO00o[i])) {
                this.f12034OooOO0O = 0;
                this.f12024OooO0o[this.f12023OooO0Oo - 1] = str;
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
        OoooOO0();
        throw null;
    }

    public final String Oooooo() throws IOException {
        String strO00O0O;
        int iOoooOOO = this.f12034OooOO0O;
        if (iOoooOOO == 0) {
            iOoooOOO = OoooOOO();
        }
        if (iOoooOOO == 14) {
            strO00O0O = o00Ooo();
        } else if (iOoooOOO == 13) {
            strO00O0O = o00O0O(f12030OooOOOo);
        } else if (iOoooOOO == 12) {
            strO00O0O = o00O0O(f12029OooOOOO);
        } else {
            if (iOoooOOO != 15) {
                throw new o00OOO00.OooO00o("Expected a name but was " + Oooo0O0() + " at path " + OooOo00());
            }
            strO00O0O = this.f12036OooOOO;
        }
        this.f12034OooOO0O = 0;
        this.f12024OooO0o[this.f12023OooO0Oo - 1] = strO00O0O;
        return strO00O0O;
    }

    public final int OoooooO(boolean z) throws IOException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            o0O0o0 o0o0o0 = this.f12032OooO;
            if (!o0o0o0.request(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            oo0OOoo oo0oooo = this.f12033OooOO0;
            byte bOooOo = oo0oooo.OooOo(j);
            if (bOooOo != 10 && bOooOo != 32 && bOooOo != 13 && bOooOo != 9) {
                oo0oooo.skip(i2 - 1);
                if (bOooOo == 47) {
                    if (!o0o0o0.request(2L)) {
                        return bOooOo;
                    }
                    OoooOO0();
                    throw null;
                }
                if (bOooOo != 35) {
                    return bOooOo;
                }
                OoooOO0();
                throw null;
            }
            i = i2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f12034OooOO0O = 0;
        this.f12025OooO0o0[0] = 8;
        this.f12023OooO0Oo = 1;
        this.f12033OooOO0.OooO0oO();
        this.f12032OooO.close();
    }

    public final String o00O0O(ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long jOooOoO0 = this.f12032OooO.OooOoO0(byteString);
            if (jOooOoO0 == -1) {
                OoooO0("Unterminated string");
                throw null;
            }
            oo0OOoo oo0oooo = this.f12033OooOO0;
            if (oo0oooo.OooOo(jOooOoO0) != 92) {
                if (sb == null) {
                    String strOooooOO = oo0oooo.OooooOO(jOooOoO0);
                    oo0oooo.readByte();
                    return strOooooOO;
                }
                sb.append(oo0oooo.OooooOO(jOooOoO0));
                oo0oooo.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(oo0oooo.OooooOO(jOooOoO0));
            oo0oooo.readByte();
            sb.append(o00o0O());
        }
    }

    public final String o00Ooo() throws IOException {
        long jOooOoO0 = this.f12032OooO.OooOoO0(f12031OooOOo0);
        oo0OOoo oo0oooo = this.f12033OooOO0;
        return jOooOoO0 != -1 ? oo0oooo.OooooOO(jOooOoO0) : oo0oooo.OoooOO0();
    }

    public final char o00o0O() throws IOException {
        int i;
        int i2;
        o0O0o0 o0o0o0 = this.f12032OooO;
        if (!o0o0o0.request(1L)) {
            OoooO0("Unterminated escape sequence");
            throw null;
        }
        oo0OOoo oo0oooo = this.f12033OooOO0;
        byte b = oo0oooo.readByte();
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
            OoooO0("Invalid escape sequence: \\" + ((char) b));
            throw null;
        }
        if (!o0o0o0.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + OooOo00());
        }
        char c = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            byte bOooOo = oo0oooo.OooOo(i3);
            char c2 = (char) (c << 4);
            if (bOooOo < 48 || bOooOo > 57) {
                if (bOooOo >= 97 && bOooOo <= 102) {
                    i = bOooOo - 97;
                } else {
                    if (bOooOo < 65 || bOooOo > 70) {
                        OoooO0("\\u".concat(oo0oooo.OooooOO(4L)));
                        throw null;
                    }
                    i = bOooOo - 65;
                }
                i2 = i + 10;
            } else {
                i2 = bOooOo - 48;
            }
            c = (char) (i2 + c2);
        }
        oo0oooo.skip(4L);
        return c;
    }

    public final void o00oO0o(ByteString byteString) throws IOException {
        while (true) {
            long jOooOoO0 = this.f12032OooO.OooOoO0(byteString);
            if (jOooOoO0 == -1) {
                OoooO0("Unterminated string");
                throw null;
            }
            oo0OOoo oo0oooo = this.f12033OooOO0;
            if (oo0oooo.OooOo(jOooOoO0) != 92) {
                oo0oooo.skip(jOooOoO0 + 1);
                return;
            } else {
                oo0oooo.skip(jOooOoO0 + 1);
                o00o0O();
            }
        }
    }

    public final String toString() {
        return "JsonReader(" + this.f12032OooO + ")";
    }
}

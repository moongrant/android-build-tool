package com.airbnb.lottie.parser.moshi;

import androidx.annotation.Nullable;
import com.facebook.internal.ServerProtocol;
import java.io.EOFException;
import java.io.IOException;
import okio.ByteString;
import oo00o.OooO0O0;
import p659o0oooO00.o0000;
import p659o0oooO00.o00000O;
import p659o0oooO00.o00O0000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends JsonReader {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final ByteString f8939OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final ByteString f8940OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final ByteString f8941OooOOo0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o0000 f8942OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o00000O f8943OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f8944OooOO0O = 0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f8945OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public String f8946OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f8947OooOOO0;

    static {
        ByteString byteString = ByteString.f60866OooO0oO;
        f8939OooOOOO = ByteString.OooO00o.OooO0OO("'\\");
        f8940OooOOOo = ByteString.OooO00o.OooO0OO("\"\\");
        f8941OooOOo0 = ByteString.OooO00o.OooO0OO("{}[]:, \n\t\r\f/\\;#=");
        ByteString.OooO00o.OooO0OO("\n\r");
        ByteString.OooO00o.OooO0OO("*/");
    }

    public OooO00o(o00O0000 o00o0001) {
        this.f8942OooO = o00o0001;
        this.f8943OooOO0 = o00o0001.f60234OooO0o0;
        Oooo0O0(6);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void OooO00o() throws IOException {
        int iOoooOO0 = this.f8944OooOO0O;
        if (iOoooOO0 == 0) {
            iOoooOO0 = OoooOO0();
        }
        if (iOoooOO0 == 3) {
            Oooo0O0(1);
            this.f8936OooO0oO[this.f8933OooO0Oo - 1] = 0;
            this.f8944OooOO0O = 0;
        } else {
            throw new oo00o.OooO00o("Expected BEGIN_ARRAY but was " + Oooo0() + " at path " + OooOOo());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void OooO0OO() throws IOException {
        int iOoooOO0 = this.f8944OooOO0O;
        if (iOoooOO0 == 0) {
            iOoooOO0 = OoooOO0();
        }
        if (iOoooOO0 == 1) {
            Oooo0O0(3);
            this.f8944OooOO0O = 0;
        } else {
            throw new oo00o.OooO00o("Expected BEGIN_OBJECT but was " + Oooo0() + " at path " + OooOOo());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void OooO0oO() throws IOException {
        int iOoooOO0 = this.f8944OooOO0O;
        if (iOoooOO0 == 0) {
            iOoooOO0 = OoooOO0();
        }
        if (iOoooOO0 != 4) {
            throw new oo00o.OooO00o("Expected END_ARRAY but was " + Oooo0() + " at path " + OooOOo());
        }
        int i = this.f8933OooO0Oo - 1;
        this.f8933OooO0Oo = i;
        int[] iArr = this.f8936OooO0oO;
        int i2 = i - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f8944OooOO0O = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void OooOOo0() throws IOException {
        int iOoooOO0 = this.f8944OooOO0O;
        if (iOoooOO0 == 0) {
            iOoooOO0 = OoooOO0();
        }
        if (iOoooOO0 != 2) {
            throw new oo00o.OooO00o("Expected END_OBJECT but was " + Oooo0() + " at path " + OooOOo());
        }
        int i = this.f8933OooO0Oo - 1;
        this.f8933OooO0Oo = i;
        this.f8934OooO0o[i] = null;
        int[] iArr = this.f8936OooO0oO;
        int i2 = i - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f8944OooOO0O = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final double OooOo() throws IOException {
        int iOoooOO0 = this.f8944OooOO0O;
        if (iOoooOO0 == 0) {
            iOoooOO0 = OoooOO0();
        }
        if (iOoooOO0 == 16) {
            this.f8944OooOO0O = 0;
            int[] iArr = this.f8936OooO0oO;
            int i = this.f8933OooO0Oo - 1;
            iArr[i] = iArr[i] + 1;
            return this.f8945OooOO0o;
        }
        if (iOoooOO0 == 17) {
            this.f8946OooOOO = this.f8943OooOO0.OooooO0(this.f8947OooOOO0);
        } else if (iOoooOO0 == 9) {
            this.f8946OooOOO = OoooooO(f8940OooOOOo);
        } else if (iOoooOO0 == 8) {
            this.f8946OooOOO = OoooooO(f8939OooOOOO);
        } else if (iOoooOO0 == 10) {
            this.f8946OooOOO = ooOO();
        } else if (iOoooOO0 != 11) {
            throw new oo00o.OooO00o("Expected a double but was " + Oooo0() + " at path " + OooOOo());
        }
        this.f8944OooOO0O = 11;
        try {
            double d = Double.parseDouble(this.f8946OooOOO);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new OooO0O0("JSON forbids NaN and infinities: " + d + " at path " + OooOOo());
            }
            this.f8946OooOOO = null;
            this.f8944OooOO0O = 0;
            int[] iArr2 = this.f8936OooO0oO;
            int i2 = this.f8933OooO0Oo - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            throw new oo00o.OooO00o("Expected a double but was " + this.f8946OooOOO + " at path " + OooOOo());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final boolean OooOo0() throws IOException {
        int iOoooOO0 = this.f8944OooOO0O;
        if (iOoooOO0 == 0) {
            iOoooOO0 = OoooOO0();
        }
        if (iOoooOO0 == 5) {
            this.f8944OooOO0O = 0;
            int[] iArr = this.f8936OooO0oO;
            int i = this.f8933OooO0Oo - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iOoooOO0 == 6) {
            this.f8944OooOO0O = 0;
            int[] iArr2 = this.f8936OooO0oO;
            int i2 = this.f8933OooO0Oo - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new oo00o.OooO00o("Expected a boolean but was " + Oooo0() + " at path " + OooOOo());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final boolean OooOo00() throws IOException {
        int iOoooOO0 = this.f8944OooOO0O;
        if (iOoooOO0 == 0) {
            iOoooOO0 = OoooOO0();
        }
        return (iOoooOO0 == 2 || iOoooOO0 == 4 || iOoooOO0 == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final int OooOooO() throws IOException {
        int iOoooOO0 = this.f8944OooOO0O;
        if (iOoooOO0 == 0) {
            iOoooOO0 = OoooOO0();
        }
        if (iOoooOO0 == 16) {
            long j = this.f8945OooOO0o;
            int i = (int) j;
            if (j == i) {
                this.f8944OooOO0O = 0;
                int[] iArr = this.f8936OooO0oO;
                int i2 = this.f8933OooO0Oo - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new oo00o.OooO00o("Expected an int but was " + this.f8945OooOO0o + " at path " + OooOOo());
        }
        if (iOoooOO0 == 17) {
            this.f8946OooOOO = this.f8943OooOO0.OooooO0(this.f8947OooOOO0);
        } else if (iOoooOO0 == 9 || iOoooOO0 == 8) {
            String strOoooooO = iOoooOO0 == 9 ? OoooooO(f8940OooOOOo) : OoooooO(f8939OooOOOO);
            this.f8946OooOOO = strOoooooO;
            try {
                int i3 = Integer.parseInt(strOoooooO);
                this.f8944OooOO0O = 0;
                int[] iArr2 = this.f8936OooO0oO;
                int i4 = this.f8933OooO0Oo - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iOoooOO0 != 11) {
            throw new oo00o.OooO00o("Expected an int but was " + Oooo0() + " at path " + OooOOo());
        }
        this.f8944OooOO0O = 11;
        try {
            double d = Double.parseDouble(this.f8946OooOOO);
            int i5 = (int) d;
            if (i5 != d) {
                throw new oo00o.OooO00o("Expected an int but was " + this.f8946OooOOO + " at path " + OooOOo());
            }
            this.f8946OooOOO = null;
            this.f8944OooOO0O = 0;
            int[] iArr3 = this.f8936OooO0oO;
            int i6 = this.f8933OooO0Oo - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            throw new oo00o.OooO00o("Expected an int but was " + this.f8946OooOOO + " at path " + OooOOo());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final JsonReader.Token Oooo0() throws IOException {
        int iOoooOO0 = this.f8944OooOO0O;
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
    public final String Oooo00o() throws IOException {
        String strOooooO0;
        int iOoooOO0 = this.f8944OooOO0O;
        if (iOoooOO0 == 0) {
            iOoooOO0 = OoooOO0();
        }
        if (iOoooOO0 == 10) {
            strOooooO0 = ooOO();
        } else if (iOoooOO0 == 9) {
            strOooooO0 = OoooooO(f8940OooOOOo);
        } else if (iOoooOO0 == 8) {
            strOooooO0 = OoooooO(f8939OooOOOO);
        } else if (iOoooOO0 == 11) {
            strOooooO0 = this.f8946OooOOO;
            this.f8946OooOOO = null;
        } else if (iOoooOO0 == 16) {
            strOooooO0 = Long.toString(this.f8945OooOO0o);
        } else {
            if (iOoooOO0 != 17) {
                throw new oo00o.OooO00o("Expected a string but was " + Oooo0() + " at path " + OooOOo());
            }
            strOooooO0 = this.f8943OooOO0.OooooO0(this.f8947OooOOO0);
        }
        this.f8944OooOO0O = 0;
        int[] iArr = this.f8936OooO0oO;
        int i = this.f8933OooO0Oo - 1;
        iArr[i] = iArr[i] + 1;
        return strOooooO0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final int Oooo0OO(JsonReader.OooO00o oooO00o) throws IOException {
        int iOoooOO0 = this.f8944OooOO0O;
        if (iOoooOO0 == 0) {
            iOoooOO0 = OoooOO0();
        }
        if (iOoooOO0 < 12 || iOoooOO0 > 15) {
            return -1;
        }
        if (iOoooOO0 == 15) {
            return OoooOoo(this.f8946OooOOO, oooO00o);
        }
        int iOooOoo = this.f8942OooO.OooOoo(oooO00o.f8938OooO0O0);
        if (iOooOoo != -1) {
            this.f8944OooOO0O = 0;
            this.f8934OooO0o[this.f8933OooO0Oo - 1] = oooO00o.f8937OooO00o[iOooOoo];
            return iOooOoo;
        }
        String str = this.f8934OooO0o[this.f8933OooO0Oo - 1];
        String strOooooOo = OooooOo();
        int iOoooOoo = OoooOoo(strOooooOo, oooO00o);
        if (iOoooOoo == -1) {
            this.f8944OooOO0O = 15;
            this.f8946OooOOO = strOooooOo;
            this.f8934OooO0o[this.f8933OooO0Oo - 1] = str;
        }
        return iOoooOoo;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void Oooo0o() throws IOException {
        int i = 0;
        do {
            int iOoooOO0 = this.f8944OooOO0O;
            if (iOoooOO0 == 0) {
                iOoooOO0 = OoooOO0();
            }
            if (iOoooOO0 == 3) {
                Oooo0O0(1);
            } else {
                if (iOoooOO0 == 1) {
                    Oooo0O0(3);
                } else if (iOoooOO0 == 4) {
                    i--;
                    if (i < 0) {
                        throw new oo00o.OooO00o("Expected a value but was " + Oooo0() + " at path " + OooOOo());
                    }
                    this.f8933OooO0Oo--;
                } else if (iOoooOO0 == 2) {
                    i--;
                    if (i < 0) {
                        throw new oo00o.OooO00o("Expected a value but was " + Oooo0() + " at path " + OooOOo());
                    }
                    this.f8933OooO0Oo--;
                } else {
                    o00000O o00000o = this.f8943OooOO0;
                    if (iOoooOO0 == 14 || iOoooOO0 == 10) {
                        long jOooOoO0 = this.f8942OooO.OooOoO0(f8941OooOOo0);
                        if (jOooOoO0 == -1) {
                            jOooOoO0 = o00000o.f60177OooO0o0;
                        }
                        o00000o.skip(jOooOoO0);
                    } else if (iOoooOO0 == 9 || iOoooOO0 == 13) {
                        o00Oo0(f8940OooOOOo);
                    } else if (iOoooOO0 == 8 || iOoooOO0 == 12) {
                        o00Oo0(f8939OooOOOO);
                    } else if (iOoooOO0 == 17) {
                        o00000o.skip(this.f8947OooOOO0);
                    } else if (iOoooOO0 == 18) {
                        throw new oo00o.OooO00o("Expected a value but was " + Oooo0() + " at path " + OooOOo());
                    }
                }
                this.f8944OooOO0O = 0;
            }
            i++;
            this.f8944OooOO0O = 0;
        } while (i != 0);
        int[] iArr = this.f8936OooO0oO;
        int i2 = this.f8933OooO0Oo;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f8934OooO0o[i2 - 1] = "null";
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void Oooo0o0() throws IOException {
        int iOoooOO0 = this.f8944OooOO0O;
        if (iOoooOO0 == 0) {
            iOoooOO0 = OoooOO0();
        }
        if (iOoooOO0 == 14) {
            long jOooOoO0 = this.f8942OooO.OooOoO0(f8941OooOOo0);
            o00000O o00000o = this.f8943OooOO0;
            if (jOooOoO0 == -1) {
                jOooOoO0 = o00000o.f60177OooO0o0;
            }
            o00000o.skip(jOooOoO0);
        } else if (iOoooOO0 == 13) {
            o00Oo0(f8940OooOOOo);
        } else if (iOoooOO0 == 12) {
            o00Oo0(f8939OooOOOO);
        } else if (iOoooOO0 != 15) {
            throw new oo00o.OooO00o("Expected a name but was " + Oooo0() + " at path " + OooOOo());
        }
        this.f8944OooOO0O = 0;
        this.f8934OooO0o[this.f8933OooO0Oo - 1] = "null";
    }

    public final void OoooO00() throws IOException {
        Oooo("Use JsonReader.setLenient(true) to accept malformed JSON");
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
    public final int OoooOO0() throws IOException {
        boolean z;
        int iOooooo;
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
        o0000 o0000Var;
        char c2;
        int[] iArr = this.f8935OooO0o0;
        int i6 = this.f8933OooO0Oo;
        int i7 = iArr[i6 - 1];
        o00000O o00000o = this.f8943OooOO0;
        boolean z2 = true;
        if (i7 == 1) {
            iArr[i6 - 1] = 2;
        } else if (i7 == 2) {
            int iOooooo2 = Oooooo(true);
            o00000o.readByte();
            if (iOooooo2 != 44) {
                if (iOooooo2 == 59) {
                    OoooO00();
                    throw null;
                }
                if (iOooooo2 == 93) {
                    this.f8944OooOO0O = 4;
                    return 4;
                }
                Oooo("Unterminated array");
                throw null;
            }
        } else {
            if (i7 == 3 || i7 == 5) {
                iArr[i6 - 1] = 4;
                if (i7 == 5) {
                    int iOooooo3 = Oooooo(true);
                    o00000o.readByte();
                    if (iOooooo3 != 44) {
                        if (iOooooo3 == 59) {
                            OoooO00();
                            throw null;
                        }
                        if (iOooooo3 == 125) {
                            this.f8944OooOO0O = 2;
                            return 2;
                        }
                        Oooo("Unterminated object");
                        throw null;
                    }
                    z = true;
                } else {
                    z = true;
                }
                int iOooooo4 = Oooooo(z);
                if (iOooooo4 == 34) {
                    o00000o.readByte();
                    this.f8944OooOO0O = 13;
                    return 13;
                }
                if (iOooooo4 == 39) {
                    o00000o.readByte();
                    OoooO00();
                    throw null;
                }
                if (iOooooo4 != 125) {
                    OoooO00();
                    throw null;
                }
                if (i7 == 5) {
                    Oooo("Expected name");
                    throw null;
                }
                o00000o.readByte();
                this.f8944OooOO0O = 2;
                return 2;
            }
            if (i7 != 4) {
                if (i7 == 6) {
                    iArr[i6 - 1] = 7;
                } else {
                    if (i7 == 7) {
                        if (Oooooo(false) == -1) {
                            this.f8944OooOO0O = 18;
                            return 18;
                        }
                        OoooO00();
                        throw null;
                    }
                    if (i7 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                iOooooo = Oooooo(true);
                if (iOooooo != 34) {
                    o00000o.readByte();
                    this.f8944OooOO0O = 9;
                    return 9;
                }
                if (iOooooo != 39) {
                    OoooO00();
                    throw null;
                }
                if (iOooooo != 44 || iOooooo == 59) {
                    i = 1;
                } else {
                    if (iOooooo == 91) {
                        o00000o.readByte();
                        this.f8944OooOO0O = 3;
                        return 3;
                    }
                    if (iOooooo != 93) {
                        if (iOooooo == 123) {
                            o00000o.readByte();
                            this.f8944OooOO0O = 1;
                            return 1;
                        }
                        byte bOooOo2 = o00000o.OooOo(0L);
                        o0000 o0000Var2 = this.f8942OooO;
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
                                    if (o0000Var2.request(i4)) {
                                        bOooOo = o00000o.OooOo(i3);
                                        if (bOooOo != 43) {
                                            if (bOooOo != 69 || bOooOo == 101) {
                                                o0000Var = o0000Var2;
                                                if (c != 2 || c == 4) {
                                                    c = 5;
                                                    i3 = i4;
                                                    o0000Var2 = o0000Var;
                                                    z2 = true;
                                                } else {
                                                    i5 = 0;
                                                }
                                            } else if (bOooOo == 45) {
                                                o0000Var = o0000Var2;
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
                                                o0000Var2 = o0000Var;
                                                z2 = true;
                                            } else if (bOooOo != 46) {
                                                if (bOooOo >= 48 && bOooOo <= 57) {
                                                    if (c == z2 || c == 0) {
                                                        o0000Var = o0000Var2;
                                                        j = -(bOooOo - 48);
                                                        c = 2;
                                                    } else if (c != 2) {
                                                        o0000Var = o0000Var2;
                                                        if (c == 3) {
                                                            c = 4;
                                                        } else if (c == 5 || c == 6) {
                                                            c = 7;
                                                        }
                                                    } else if (j != 0) {
                                                        o0000Var = o0000Var2;
                                                        long j2 = (10 * j) - ((long) (bOooOo - 48));
                                                        z3 = (j > -922337203685477580L || (j == -922337203685477580L && j2 < j)) & z3;
                                                        j = j2;
                                                    }
                                                    i3 = i4;
                                                    o0000Var2 = o0000Var;
                                                    z2 = true;
                                                } else if (!Ooooo0o(bOooOo)) {
                                                }
                                                i5 = 0;
                                            } else {
                                                o0000Var = o0000Var2;
                                                if (c == 2) {
                                                    c = 3;
                                                    i3 = i4;
                                                    o0000Var2 = o0000Var;
                                                    z2 = true;
                                                } else {
                                                    i5 = 0;
                                                }
                                            }
                                            if (i5 != 0) {
                                                return i5;
                                            }
                                            if (Ooooo0o(o00000o.OooOo(0L))) {
                                                OoooO00();
                                                throw null;
                                            }
                                            Oooo("Expected value");
                                            throw null;
                                        }
                                        o0000Var = o0000Var2;
                                        c2 = 6;
                                        if (c != 5) {
                                            i5 = 0;
                                            if (i5 != 0) {
                                                return i5;
                                            }
                                            if (Ooooo0o(o00000o.OooOo(0L))) {
                                                Oooo("Expected value");
                                                throw null;
                                            }
                                            OoooO00();
                                            throw null;
                                        }
                                        c = c2;
                                        i3 = i4;
                                        o0000Var2 = o0000Var;
                                        z2 = true;
                                    }
                                    if (c != 2 && z3 && ((j != Long.MIN_VALUE || z4) && (j != 0 || !z4))) {
                                        if (!z4) {
                                            j = -j;
                                        }
                                        this.f8945OooOO0o = j;
                                        o00000o.skip(i3);
                                        i5 = 16;
                                        this.f8944OooOO0O = 16;
                                    } else if (c != 2 || c == 4 || c == 7) {
                                        this.f8947OooOOO0 = i3;
                                        i5 = 17;
                                        this.f8944OooOO0O = 17;
                                    } else {
                                        i5 = 0;
                                    }
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (Ooooo0o(o00000o.OooOo(0L))) {
                                        Oooo("Expected value");
                                        throw null;
                                    }
                                    OoooO00();
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
                                if (!o0000Var2.request(length + 1) || !Ooooo0o(o00000o.OooOo(length))) {
                                    o00000o.skip(length);
                                    this.f8944OooOO0O = i2;
                                    break;
                                }
                            } else {
                                int i9 = i8 + 1;
                                if (o0000Var2.request(i9) && ((cOooOo = o00000o.OooOo(i8)) == str2.charAt(i8) || cOooOo == str.charAt(i8))) {
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
                            if (o0000Var2.request(i4)) {
                                bOooOo = o00000o.OooOo(i3);
                                if (bOooOo != 43) {
                                    if (bOooOo != 69) {
                                        o0000Var = o0000Var2;
                                        if (c != 2) {
                                        }
                                        c = 5;
                                        i3 = i4;
                                        o0000Var2 = o0000Var;
                                        z2 = true;
                                    } else {
                                        o0000Var = o0000Var2;
                                        if (c != 2) {
                                        }
                                        c = 5;
                                        i3 = i4;
                                        o0000Var2 = o0000Var;
                                        z2 = true;
                                    }
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (Ooooo0o(o00000o.OooOo(0L))) {
                                        Oooo("Expected value");
                                        throw null;
                                    }
                                    OoooO00();
                                    throw null;
                                }
                                o0000Var = o0000Var2;
                                c2 = 6;
                                if (c != 5) {
                                    i5 = 0;
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (Ooooo0o(o00000o.OooOo(0L))) {
                                        Oooo("Expected value");
                                        throw null;
                                    }
                                    OoooO00();
                                    throw null;
                                }
                                c = c2;
                                i3 = i4;
                                o0000Var2 = o0000Var;
                                z2 = true;
                            }
                            if (c != 2) {
                                if (c != 2) {
                                }
                                this.f8947OooOOO0 = i3;
                                i5 = 17;
                                this.f8944OooOO0O = 17;
                            } else {
                                if (c != 2) {
                                }
                                this.f8947OooOOO0 = i3;
                                i5 = 17;
                                this.f8944OooOO0O = 17;
                            }
                            if (i5 != 0) {
                                return i5;
                            }
                            if (Ooooo0o(o00000o.OooOo(0L))) {
                                Oooo("Expected value");
                                throw null;
                            }
                            OoooO00();
                            throw null;
                        }
                    }
                    i = 1;
                    if (i7 == 1) {
                        o00000o.readByte();
                        this.f8944OooOO0O = 4;
                        return 4;
                    }
                }
                if (i7 != i || i7 == 2) {
                    OoooO00();
                    throw null;
                }
                Oooo("Unexpected value");
                throw null;
            }
            iArr[i6 - 1] = 5;
            int iOooooo5 = Oooooo(true);
            o00000o.readByte();
            if (iOooooo5 != 58) {
                if (iOooooo5 != 61) {
                    Oooo("Expected ':'");
                    throw null;
                }
                OoooO00();
                throw null;
            }
        }
        iOooooo = Oooooo(true);
        if (iOooooo != 34) {
            o00000o.readByte();
            this.f8944OooOO0O = 9;
            return 9;
        }
        if (iOooooo != 39) {
            OoooO00();
            throw null;
        }
        if (iOooooo != 44) {
            i = 1;
        } else {
            i = 1;
        }
        if (i7 != i) {
        }
        OoooO00();
        throw null;
    }

    public final int OoooOoo(String str, JsonReader.OooO00o oooO00o) {
        int length = oooO00o.f8937OooO00o.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(oooO00o.f8937OooO00o[i])) {
                this.f8944OooOO0O = 0;
                this.f8934OooO0o[this.f8933OooO0Oo - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final boolean Ooooo0o(int i) throws IOException {
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
        OoooO00();
        throw null;
    }

    public final String OooooOo() throws IOException {
        String strOoooooO;
        int iOoooOO0 = this.f8944OooOO0O;
        if (iOoooOO0 == 0) {
            iOoooOO0 = OoooOO0();
        }
        if (iOoooOO0 == 14) {
            strOoooooO = ooOO();
        } else if (iOoooOO0 == 13) {
            strOoooooO = OoooooO(f8940OooOOOo);
        } else if (iOoooOO0 == 12) {
            strOoooooO = OoooooO(f8939OooOOOO);
        } else {
            if (iOoooOO0 != 15) {
                throw new oo00o.OooO00o("Expected a name but was " + Oooo0() + " at path " + OooOOo());
            }
            strOoooooO = this.f8946OooOOO;
        }
        this.f8944OooOO0O = 0;
        this.f8934OooO0o[this.f8933OooO0Oo - 1] = strOoooooO;
        return strOoooooO;
    }

    public final int Oooooo(boolean z) throws IOException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            o0000 o0000Var = this.f8942OooO;
            if (!o0000Var.request(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            o00000O o00000o = this.f8943OooOO0;
            byte bOooOo = o00000o.OooOo(j);
            if (bOooOo != 10 && bOooOo != 32 && bOooOo != 13 && bOooOo != 9) {
                o00000o.skip(i2 - 1);
                if (bOooOo == 47) {
                    if (!o0000Var.request(2L)) {
                        return bOooOo;
                    }
                    OoooO00();
                    throw null;
                }
                if (bOooOo != 35) {
                    return bOooOo;
                }
                OoooO00();
                throw null;
            }
            i = i2;
        }
    }

    public final String OoooooO(ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long jOooOoO0 = this.f8942OooO.OooOoO0(byteString);
            if (jOooOoO0 == -1) {
                Oooo("Unterminated string");
                throw null;
            }
            o00000O o00000o = this.f8943OooOO0;
            if (o00000o.OooOo(jOooOoO0) != 92) {
                if (sb == null) {
                    String strOooooO0 = o00000o.OooooO0(jOooOoO0);
                    o00000o.readByte();
                    return strOooooO0;
                }
                sb.append(o00000o.OooooO0(jOooOoO0));
                o00000o.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(o00000o.OooooO0(jOooOoO0));
            o00000o.readByte();
            sb.append(o00O0O());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f8944OooOO0O = 0;
        this.f8935OooO0o0[0] = 8;
        this.f8933OooO0Oo = 1;
        this.f8943OooOO0.OooO0oO();
        this.f8942OooO.close();
    }

    public final char o00O0O() throws IOException {
        int i;
        int i2;
        o0000 o0000Var = this.f8942OooO;
        if (!o0000Var.request(1L)) {
            Oooo("Unterminated escape sequence");
            throw null;
        }
        o00000O o00000o = this.f8943OooOO0;
        byte b = o00000o.readByte();
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
            Oooo("Invalid escape sequence: \\" + ((char) b));
            throw null;
        }
        if (!o0000Var.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + OooOOo());
        }
        char c = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            byte bOooOo = o00000o.OooOo(i3);
            char c2 = (char) (c << 4);
            if (bOooOo < 48 || bOooOo > 57) {
                if (bOooOo >= 97 && bOooOo <= 102) {
                    i = bOooOo - 97;
                } else {
                    if (bOooOo < 65 || bOooOo > 70) {
                        Oooo("\\u".concat(o00000o.OooooO0(4L)));
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
        o00000o.skip(4L);
        return c;
    }

    public final void o00Oo0(ByteString byteString) throws IOException {
        while (true) {
            long jOooOoO0 = this.f8942OooO.OooOoO0(byteString);
            if (jOooOoO0 == -1) {
                Oooo("Unterminated string");
                throw null;
            }
            o00000O o00000o = this.f8943OooOO0;
            if (o00000o.OooOo(jOooOoO0) != 92) {
                o00000o.skip(jOooOoO0 + 1);
                return;
            } else {
                o00000o.skip(jOooOoO0 + 1);
                o00O0O();
            }
        }
    }

    public final String ooOO() throws IOException {
        long jOooOoO0 = this.f8942OooO.OooOoO0(f8941OooOOo0);
        o00000O o00000o = this.f8943OooOO0;
        return jOooOoO0 != -1 ? o00000o.OooooO0(jOooOoO0) : o00000o.OoooOO0();
    }

    public final String toString() {
        return "JsonReader(" + this.f8942OooO + ")";
    }
}

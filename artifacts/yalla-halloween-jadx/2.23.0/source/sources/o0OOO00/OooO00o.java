package o0OOO00;

import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f43561OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f43562OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f43563OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f43564OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f43565OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f43566OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public char[] f43567OooO0oO;

    public OooO00o(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f43561OooO00o = name;
        this.f43562OooO0O0 = name.length();
    }

    public final int OooO00o(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        int i5 = this.f43562OooO0O0;
        String str = this.f43561OooO00o;
        if (i4 >= i5) {
            throw new IllegalStateException("Malformed DN: " + str);
        }
        char[] cArr = this.f43567OooO0oO;
        char c = cArr[i];
        if (c >= '0' && c <= '9') {
            i2 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 'W';
        } else {
            if (c < 'A' || c > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i2 = c - '7';
        }
        char c2 = cArr[i4];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i3 = c2 - '7';
        }
        return (i2 << 4) + i3;
    }

    public final char OooO0O0() {
        int i;
        int i2 = this.f43563OooO0OO + 1;
        this.f43563OooO0OO = i2;
        int i3 = this.f43562OooO0O0;
        if (i2 == i3) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f43561OooO00o);
        }
        char c = this.f43567OooO0oO[i2];
        if (c != ' ' && c != '%' && c != '\\' && c != '_' && c != '\"' && c != '#') {
            switch (c) {
                default:
                    switch (c) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            int iOooO00o = OooO00o(i2);
                            this.f43563OooO0OO++;
                            if (iOooO00o >= 128) {
                                if (iOooO00o >= 192 && iOooO00o <= 247) {
                                    if (iOooO00o <= 223) {
                                        iOooO00o &= 31;
                                        i = 1;
                                    } else if (iOooO00o <= 239) {
                                        iOooO00o &= 15;
                                        i = 2;
                                    } else {
                                        iOooO00o &= 7;
                                        i = 3;
                                    }
                                    for (int i4 = 0; i4 < i; i4++) {
                                        int i5 = this.f43563OooO0OO + 1;
                                        this.f43563OooO0OO = i5;
                                        if (i5 != i3 && this.f43567OooO0oO[i5] == '\\') {
                                            int i6 = i5 + 1;
                                            this.f43563OooO0OO = i6;
                                            int iOooO00o2 = OooO00o(i6);
                                            this.f43563OooO0OO++;
                                            if ((iOooO00o2 & 192) == 128) {
                                                iOooO00o = (iOooO00o << 6) + (iOooO00o2 & 63);
                                            }
                                        }
                                    }
                                }
                                return '?';
                            }
                            return (char) iOooO00o;
                    }
                case '*':
                case '+':
                case ',':
                    return c;
            }
        }
        return c;
    }

    public final String OooO0OO() {
        int i;
        int i2;
        int i3;
        char c;
        int i4;
        char c2;
        char c3;
        while (true) {
            i = this.f43563OooO0OO;
            i2 = this.f43562OooO0O0;
            if (i >= i2 || this.f43567OooO0oO[i] != ' ') {
                break;
            }
            this.f43563OooO0OO = i + 1;
        }
        if (i == i2) {
            return null;
        }
        this.f43564OooO0Oo = i;
        this.f43563OooO0OO = i + 1;
        while (true) {
            i3 = this.f43563OooO0OO;
            if (i3 >= i2 || (c3 = this.f43567OooO0oO[i3]) == '=' || c3 == ' ') {
                break;
            }
            this.f43563OooO0OO = i3 + 1;
        }
        String str = this.f43561OooO00o;
        if (i3 >= i2) {
            throw new IllegalStateException("Unexpected end of DN: " + str);
        }
        this.f43566OooO0o0 = i3;
        if (this.f43567OooO0oO[i3] == ' ') {
            while (true) {
                i4 = this.f43563OooO0OO;
                if (i4 >= i2 || (c2 = this.f43567OooO0oO[i4]) == '=' || c2 != ' ') {
                    break;
                }
                this.f43563OooO0OO = i4 + 1;
            }
            if (this.f43567OooO0oO[i4] != '=' || i4 == i2) {
                throw new IllegalStateException("Unexpected end of DN: " + str);
            }
        }
        this.f43563OooO0OO++;
        while (true) {
            int i5 = this.f43563OooO0OO;
            if (i5 >= i2 || this.f43567OooO0oO[i5] != ' ') {
                break;
            }
            this.f43563OooO0OO = i5 + 1;
        }
        int i6 = this.f43566OooO0o0;
        int i7 = this.f43564OooO0Oo;
        if (i6 - i7 > 4) {
            char[] cArr = this.f43567OooO0oO;
            if (cArr[i7 + 3] == '.' && (((c = cArr[i7]) == 'O' || c == 'o') && ((cArr[i7 + 1] == 'I' || cArr[i7 + 1] == 'i') && (cArr[i7 + 2] == 'D' || cArr[i7 + 2] == 'd')))) {
                this.f43564OooO0Oo = i7 + 4;
            }
        }
        char[] cArr2 = this.f43567OooO0oO;
        int i8 = this.f43564OooO0Oo;
        return new String(cArr2, i8, i6 - i8);
    }
}

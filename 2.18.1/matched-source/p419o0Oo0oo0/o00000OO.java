package p419o0Oo0oo0;

import OooO00o.OooO00o;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f39762OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f39763OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f39764OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f39765OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f39766OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f39767OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public char[] f39768OooO0oO;

    public o00000OO(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f39762OooO00o = name;
        this.f39763OooO0O0 = name.length();
    }

    public final int OooO00o(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 >= this.f39763OooO0O0) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Malformed DN: ");
            sbOooO0o0.append(this.f39762OooO00o);
            throw new IllegalStateException(sbOooO0o0.toString());
        }
        char[] cArr = this.f39768OooO0oO;
        char c = cArr[i];
        if (c >= '0' && c <= '9') {
            i2 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 'W';
        } else {
            if (c < 'A' || c > 'F') {
                StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Malformed DN: ");
                sbOooO0o1.append(this.f39762OooO00o);
                throw new IllegalStateException(sbOooO0o1.toString());
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
                StringBuilder sbOooO0o2 = OooO00o.OooO0o0("Malformed DN: ");
                sbOooO0o2.append(this.f39762OooO00o);
                throw new IllegalStateException(sbOooO0o2.toString());
            }
            i3 = c2 - '7';
        }
        return (i2 << 4) + i3;
    }

    public final char OooO0O0() {
        int i;
        int i2 = this.f39764OooO0OO + 1;
        this.f39764OooO0OO = i2;
        if (i2 == this.f39763OooO0O0) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Unexpected end of DN: ");
            sbOooO0o0.append(this.f39762OooO00o);
            throw new IllegalStateException(sbOooO0o0.toString());
        }
        char[] cArr = this.f39768OooO0oO;
        char c = cArr[i2];
        if (c != ' ' && c != '%' && c != '\\' && c != '_' && c != '\"' && c != '#') {
            switch (c) {
                case '*':
                case '+':
                case ',':
                    break;
                default:
                    switch (c) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            int iOooO00o = OooO00o(i2);
                            this.f39764OooO0OO++;
                            if (iOooO00o >= 128) {
                                if (iOooO00o < 192 || iOooO00o > 247) {
                                    return '?';
                                }
                                if (iOooO00o <= 223) {
                                    iOooO00o &= 31;
                                    i = 1;
                                } else if (iOooO00o <= 239) {
                                    i = 2;
                                    iOooO00o &= 15;
                                } else {
                                    i = 3;
                                    iOooO00o &= 7;
                                }
                                for (int i3 = 0; i3 < i; i3++) {
                                    int i4 = this.f39764OooO0OO + 1;
                                    this.f39764OooO0OO = i4;
                                    if (i4 == this.f39763OooO0O0 || this.f39768OooO0oO[i4] != '\\') {
                                        return '?';
                                    }
                                    int i5 = i4 + 1;
                                    this.f39764OooO0OO = i5;
                                    int iOooO00o2 = OooO00o(i5);
                                    this.f39764OooO0OO++;
                                    if ((iOooO00o2 & 192) != 128) {
                                        return '?';
                                    }
                                    iOooO00o = (iOooO00o << 6) + (iOooO00o2 & 63);
                                }
                            }
                            return (char) iOooO00o;
                    }
                    break;
            }
        }
        return cArr[i2];
    }

    public final String OooO0OO() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        while (true) {
            i = this.f39764OooO0OO;
            i2 = this.f39763OooO0O0;
            if (i >= i2 || this.f39768OooO0oO[i] != ' ') {
                break;
            }
            this.f39764OooO0OO = i + 1;
        }
        if (i == i2) {
            return null;
        }
        this.f39765OooO0Oo = i;
        this.f39764OooO0OO = i + 1;
        while (true) {
            i3 = this.f39764OooO0OO;
            i4 = this.f39763OooO0O0;
            if (i3 >= i4) {
                break;
            }
            char[] cArr = this.f39768OooO0oO;
            if (cArr[i3] == '=' || cArr[i3] == ' ') {
                break;
            }
            this.f39764OooO0OO = i3 + 1;
        }
        if (i3 >= i4) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Unexpected end of DN: ");
            sbOooO0o0.append(this.f39762OooO00o);
            throw new IllegalStateException(sbOooO0o0.toString());
        }
        this.f39767OooO0o0 = i3;
        if (this.f39768OooO0oO[i3] == ' ') {
            while (true) {
                i5 = this.f39764OooO0OO;
                i6 = this.f39763OooO0O0;
                if (i5 >= i6) {
                    break;
                }
                char[] cArr2 = this.f39768OooO0oO;
                if (cArr2[i5] == '=' || cArr2[i5] != ' ') {
                    break;
                }
                this.f39764OooO0OO = i5 + 1;
            }
            if (this.f39768OooO0oO[i5] != '=' || i5 == i6) {
                StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Unexpected end of DN: ");
                sbOooO0o1.append(this.f39762OooO00o);
                throw new IllegalStateException(sbOooO0o1.toString());
            }
        }
        this.f39764OooO0OO++;
        while (true) {
            int i7 = this.f39764OooO0OO;
            if (i7 >= this.f39763OooO0O0 || this.f39768OooO0oO[i7] != ' ') {
                break;
            }
            this.f39764OooO0OO = i7 + 1;
        }
        int i8 = this.f39767OooO0o0;
        int i9 = this.f39765OooO0Oo;
        if (i8 - i9 > 4) {
            char[] cArr3 = this.f39768OooO0oO;
            if (cArr3[i9 + 3] == '.' && ((cArr3[i9] == 'O' || cArr3[i9] == 'o') && ((cArr3[i9 + 1] == 'I' || cArr3[i9 + 1] == 'i') && (cArr3[i9 + 2] == 'D' || cArr3[i9 + 2] == 'd')))) {
                this.f39765OooO0Oo = i9 + 4;
            }
        }
        char[] cArr4 = this.f39768OooO0oO;
        int i10 = this.f39765OooO0Oo;
        return new String(cArr4, i10, i8 - i10);
    }
}

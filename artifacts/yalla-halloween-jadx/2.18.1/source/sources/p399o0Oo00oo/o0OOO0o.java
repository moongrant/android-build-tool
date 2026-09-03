package p399o0Oo00oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o extends o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final char[] f38995OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final char[] f38996OooO0O0 = {'T', 'N', '*', 'E'};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final char[] f38997OooO0OO = {'/', ':', '+', '.'};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final char f38998OooO0Oo;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f38995OooO00o = cArr;
        f38998OooO0Oo = cArr[0];
    }

    @Override // p399o0Oo00oo.o0000Ooo
    public final boolean[] OooO0OO(String str) {
        int i;
        if (str.length() < 2) {
            StringBuilder sb = new StringBuilder();
            char c = f38998OooO0Oo;
            sb.append(c);
            sb.append(str);
            sb.append(c);
            str = sb.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f38995OooO00o;
            boolean zOooOoo0 = o0ooOOo.OooOoo0(cArr, upperCase);
            boolean zOooOoo1 = o0ooOOo.OooOoo0(cArr, upperCase2);
            char[] cArr2 = f38996OooO0O0;
            boolean zOooOoo2 = o0ooOOo.OooOoo0(cArr2, upperCase);
            boolean zOooOoo3 = o0ooOOo.OooOoo0(cArr2, upperCase2);
            if (zOooOoo0) {
                if (!zOooOoo1) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (!zOooOoo2) {
                if (zOooOoo1 || zOooOoo3) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
                StringBuilder sb2 = new StringBuilder();
                char c2 = f38998OooO0Oo;
                sb2.append(c2);
                sb2.append(str);
                sb2.append(c2);
                str = sb2.toString();
            } else if (!zOooOoo3) {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                i2 += 9;
            } else {
                if (!o0ooOOo.OooOoo0(f38997OooO0OO, str.charAt(i3))) {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i3) + '\'');
                }
                i2 += 10;
            }
        }
        boolean[] zArr = new boolean[(str.length() - 1) + i2];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i6 = 0;
            while (true) {
                char[] cArr3 = o0ooOOo.f39000OooO00o;
                if (i6 >= cArr3.length) {
                    i = 0;
                    break;
                }
                if (upperCase3 == cArr3[i6]) {
                    i = o0ooOOo.f39001OooO0O0[i6];
                    break;
                }
                i6++;
            }
            int i7 = 0;
            boolean z = true;
            while (true) {
                int i8 = 0;
                while (i7 < 7) {
                    zArr[i4] = z;
                    i4++;
                    if (((i >> (6 - i7)) & 1) == 0 || i8 == 1) {
                        z = !z;
                        i7++;
                    } else {
                        i8++;
                    }
                }
                break;
            }
            if (i5 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
        }
        return zArr;
    }
}

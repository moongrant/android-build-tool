package o0000O0O;

import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final String f34090OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooO00o f34091OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final String f34092OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO00o f34093OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f34094OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f34095OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00Oo0 f34096OooO0OO;

    /* JADX INFO: renamed from: o0000O0O.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C0393OooO00o {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final byte[] f34097OooO0o0 = new byte[1792];

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final CharSequence f34098OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f34099OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f34100OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public char f34101OooO0Oo;

        static {
            for (int i = 0; i < 1792; i++) {
                f34097OooO0o0[i] = Character.getDirectionality(i);
            }
        }

        public C0393OooO00o(CharSequence charSequence) {
            this.f34098OooO00o = charSequence;
            this.f34099OooO0O0 = charSequence.length();
        }

        public final byte OooO00o() {
            int i = this.f34100OooO0OO - 1;
            CharSequence charSequence = this.f34098OooO00o;
            char cCharAt = charSequence.charAt(i);
            this.f34101OooO0Oo = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(charSequence, this.f34100OooO0OO);
                this.f34100OooO0OO -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f34100OooO0OO--;
            char c = this.f34101OooO0Oo;
            return c < 1792 ? f34097OooO0o0[c] : Character.getDirectionality(c);
        }
    }

    static {
        o00Ooo.OooO0o oooO0o = o00Ooo.f34109OooO0OO;
        f34090OooO0Oo = Character.toString((char) 8206);
        f34092OooO0o0 = Character.toString((char) 8207);
        f34091OooO0o = new OooO00o(false, 2, oooO0o);
        f34093OooO0oO = new OooO00o(true, 2, oooO0o);
    }

    public OooO00o(boolean z, int i, o00Ooo.OooO0o oooO0o) {
        this.f34094OooO00o = z;
        this.f34095OooO0O0 = i;
        this.f34096OooO0OO = oooO0o;
    }

    public static int OooO00o(CharSequence charSequence) {
        byte directionality;
        C0393OooO00o c0393OooO00o = new C0393OooO00o(charSequence);
        c0393OooO00o.f34100OooO0OO = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = c0393OooO00o.f34100OooO0OO;
            if (i4 < c0393OooO00o.f34099OooO0O0 && i == 0) {
                CharSequence charSequence2 = c0393OooO00o.f34098OooO00o;
                char cCharAt = charSequence2.charAt(i4);
                c0393OooO00o.f34101OooO0Oo = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, c0393OooO00o.f34100OooO0OO);
                    c0393OooO00o.f34100OooO0OO = Character.charCount(iCodePointAt) + c0393OooO00o.f34100OooO0OO;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    c0393OooO00o.f34100OooO0OO++;
                    char c = c0393OooO00o.f34101OooO0Oo;
                    directionality = c < 1792 ? C0393OooO00o.f34097OooO0o0[c] : Character.getDirectionality(c);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
        }
        if (i == 0) {
            return 0;
        }
        if (i2 != 0) {
            return i2;
        }
        while (c0393OooO00o.f34100OooO0OO > 0) {
            switch (c0393OooO00o.OooO00o()) {
                case 14:
                case 15:
                    if (i == i3) {
                        return -1;
                    }
                    i3--;
                    break;
                case 16:
                case 17:
                    if (i == i3) {
                        return 1;
                    }
                    i3--;
                    break;
                case 18:
                    i3++;
                    break;
                default:
                    break;
            }
        }
        return 0;
    }

    public static int OooO0O0(CharSequence charSequence) {
        C0393OooO00o c0393OooO00o = new C0393OooO00o(charSequence);
        c0393OooO00o.f34100OooO0OO = c0393OooO00o.f34099OooO0O0;
        int i = 0;
        while (true) {
            int i2 = i;
            while (c0393OooO00o.f34100OooO0OO > 0) {
                byte bOooO00o = c0393OooO00o.OooO00o();
                if (bOooO00o == 0) {
                    if (i2 == 0) {
                        return -1;
                    }
                    if (i == 0) {
                        i = i2;
                    }
                } else if (bOooO00o == 1 || bOooO00o == 2) {
                    if (i2 == 0) {
                        return 1;
                    }
                    if (i == 0) {
                        i = i2;
                    }
                } else if (bOooO00o != 9) {
                    switch (bOooO00o) {
                        case 14:
                        case 15:
                            if (i == i2) {
                                return -1;
                            }
                            i2--;
                            break;
                        case 16:
                        case 17:
                            if (i == i2) {
                                return 1;
                            }
                            i2--;
                            break;
                        case 18:
                            i2++;
                            break;
                        default:
                            if (i == 0) {
                                i = i2;
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder OooO0OO(CharSequence charSequence, o00Oo0 o00oo1) {
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean zOooO0O0 = ((o00Ooo.OooO0OO) o00oo1).OooO0O0(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z = (this.f34095OooO0O0 & 2) != 0;
        String str2 = f34092OooO0o0;
        String str3 = f34090OooO0Oo;
        boolean z2 = this.f34094OooO00o;
        if (z) {
            boolean zOooO0O1 = (zOooO0O0 ? o00Ooo.f34108OooO0O0 : o00Ooo.f34107OooO00o).OooO0O0(charSequence, charSequence.length());
            if (z2 || !(zOooO0O1 || OooO00o(charSequence) == 1)) {
                str = (!z2 || (zOooO0O1 && OooO00o(charSequence) != -1)) ? "" : str2;
            } else {
                str = str3;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (zOooO0O0 != z2) {
            spannableStringBuilder.append(zOooO0O0 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zOooO0O2 = (zOooO0O0 ? o00Ooo.f34108OooO0O0 : o00Ooo.f34107OooO00o).OooO0O0(charSequence, charSequence.length());
        if (!z2 && (zOooO0O2 || OooO0O0(charSequence) == 1)) {
            str2 = str3;
        } else if (!z2 || (zOooO0O2 && OooO0O0(charSequence) != -1)) {
            str2 = "";
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}

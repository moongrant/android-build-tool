package o000O0Oo;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO0o.C0297OooO0o f28137OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final String f28138OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final String f28139OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO00o f28140OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final OooO00o f28141OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f28142OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f28143OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0OO f28144OooO0OO;

    /* JADX INFO: renamed from: o000O0Oo.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C0296OooO00o {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final byte[] f28145OooO0o0 = new byte[1792];

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final CharSequence f28146OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f28147OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f28148OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public char f28149OooO0Oo;

        static {
            for (int i = 0; i < 1792; i++) {
                f28145OooO0o0[i] = Character.getDirectionality(i);
            }
        }

        public C0296OooO00o(CharSequence charSequence) {
            this.f28146OooO00o = charSequence;
            this.f28147OooO0O0 = charSequence.length();
        }

        public final byte OooO00o() {
            char cCharAt = this.f28146OooO00o.charAt(this.f28148OooO0OO - 1);
            this.f28149OooO0Oo = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f28146OooO00o, this.f28148OooO0OO);
                this.f28148OooO0OO -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f28148OooO0OO--;
            char c = this.f28149OooO0Oo;
            return c < 1792 ? f28145OooO0o0[c] : Character.getDirectionality(c);
        }
    }

    static {
        OooO0o.C0297OooO0o c0297OooO0o = OooO0o.f28156OooO0OO;
        f28137OooO0Oo = c0297OooO0o;
        f28139OooO0o0 = Character.toString((char) 8206);
        f28138OooO0o = Character.toString((char) 8207);
        f28140OooO0oO = new OooO00o(false, 2, c0297OooO0o);
        f28141OooO0oo = new OooO00o(true, 2, c0297OooO0o);
    }

    public OooO00o(boolean z, int i, OooO0OO oooO0OO) {
        this.f28142OooO00o = z;
        this.f28143OooO0O0 = i;
        this.f28144OooO0OO = oooO0OO;
    }

    public static int OooO00o(CharSequence charSequence) {
        byte directionality;
        C0296OooO00o c0296OooO00o = new C0296OooO00o(charSequence);
        c0296OooO00o.f28148OooO0OO = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = c0296OooO00o.f28148OooO0OO;
            if (i4 < c0296OooO00o.f28147OooO0O0 && i == 0) {
                char cCharAt = c0296OooO00o.f28146OooO00o.charAt(i4);
                c0296OooO00o.f28149OooO0Oo = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(c0296OooO00o.f28146OooO00o, c0296OooO00o.f28148OooO0OO);
                    c0296OooO00o.f28148OooO0OO = Character.charCount(iCodePointAt) + c0296OooO00o.f28148OooO0OO;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    c0296OooO00o.f28148OooO0OO++;
                    char c = c0296OooO00o.f28149OooO0Oo;
                    directionality = c < 1792 ? C0296OooO00o.f28145OooO0o0[c] : Character.getDirectionality(c);
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
        while (c0296OooO00o.f28148OooO0OO > 0) {
            switch (c0296OooO00o.OooO00o()) {
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
        C0296OooO00o c0296OooO00o = new C0296OooO00o(charSequence);
        c0296OooO00o.f28148OooO0OO = c0296OooO00o.f28147OooO0O0;
        int i = 0;
        int i2 = 0;
        while (c0296OooO00o.f28148OooO0OO > 0) {
            byte bOooO00o = c0296OooO00o.OooO00o();
            if (bOooO00o == 0) {
                if (i == 0) {
                    return -1;
                }
                if (i2 == 0) {
                    i2 = i;
                }
            } else if (bOooO00o == 1 || bOooO00o == 2) {
                if (i == 0) {
                    return 1;
                }
                if (i2 == 0) {
                    i2 = i;
                }
            } else if (bOooO00o != 9) {
                switch (bOooO00o) {
                    case 14:
                    case 15:
                        if (i2 == i) {
                            return -1;
                        }
                        i--;
                        break;
                    case 16:
                    case 17:
                        if (i2 == i) {
                            return 1;
                        }
                        i--;
                        break;
                    case 18:
                        i++;
                        break;
                    default:
                        if (i2 == 0) {
                            i2 = i;
                        }
                        break;
                }
            } else {
                continue;
            }
        }
        return 0;
    }

    public static OooO00o OooO0OO() {
        Locale locale = Locale.getDefault();
        int i = OooO.f28136OooO00o;
        return OooO.OooO00o.OooO00o(locale) == 1 ? f28141OooO0oo : f28140OooO0oO;
    }

    public final CharSequence OooO0Oo(CharSequence charSequence, OooO0OO oooO0OO) {
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean zOooO0O0 = ((OooO0o.OooO0OO) oooO0OO).OooO0O0(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str2 = "";
        if ((this.f28143OooO0O0 & 2) != 0) {
            boolean zOooO0O1 = (zOooO0O0 ? OooO0o.f28155OooO0O0 : OooO0o.f28154OooO00o).OooO0O0(charSequence, charSequence.length());
            if (this.f28142OooO00o || !(zOooO0O1 || OooO00o(charSequence) == 1)) {
                str = (!this.f28142OooO00o || (zOooO0O1 && OooO00o(charSequence) != -1)) ? "" : f28138OooO0o;
            } else {
                str = f28139OooO0o0;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (zOooO0O0 != this.f28142OooO00o) {
            spannableStringBuilder.append(zOooO0O0 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zOooO0O2 = (zOooO0O0 ? OooO0o.f28155OooO0O0 : OooO0o.f28154OooO00o).OooO0O0(charSequence, charSequence.length());
        if (!this.f28142OooO00o && (zOooO0O2 || OooO0O0(charSequence) == 1)) {
            str2 = f28139OooO0o0;
        } else if (this.f28142OooO00o && (!zOooO0O2 || OooO0O0(charSequence) == -1)) {
            str2 = f28138OooO0o;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}

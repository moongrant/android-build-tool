package androidx.media3.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import androidx.media3.common.util.UnstableApi;
import java.util.Locale;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO0o implements o000O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Resources f9631OooO00o;

    public OooO0o(Resources resources) {
        resources.getClass();
        this.f9631OooO00o = resources;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    @Override // androidx.media3.ui.o000O0o
    public final String OooO00o(androidx.media3.common.OooOO0 oooOO1) {
        String strOooO0OO;
        String strOooO0OO2;
        int iOooO0oO = p069o0000ooO.o0000oo.OooO0oO(oooOO1.f6412OooOOOO);
        int i = oooOO1.f6418OooOo0;
        int i2 = oooOO1.f6426OooOoo0;
        int i3 = oooOO1.f6419OooOo00;
        if (iOooO0oO == -1) {
            String str = null;
            String str2 = oooOO1.f6409OooOO0o;
            if (str2 == null) {
                strOooO0OO2 = null;
                break;
            }
            String[] strArrSplit = TextUtils.isEmpty(str2) ? new String[0] : str2.trim().split("(\\s*,\\s*)", -1);
            int length = strArrSplit.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    strOooO0OO2 = null;
                    break;
                }
                strOooO0OO2 = p069o0000ooO.o0000oo.OooO0OO(strArrSplit[i4]);
                if (strOooO0OO2 != null && p069o0000ooO.o0000oo.OooOO0(strOooO0OO2)) {
                    break;
                }
                i4++;
            }
            if (strOooO0OO2 == null) {
                if (str2 != null) {
                    for (String str3 : TextUtils.isEmpty(str2) ? new String[0] : str2.trim().split("(\\s*,\\s*)", -1)) {
                        String strOooO0OO3 = p069o0000ooO.o0000oo.OooO0OO(str3);
                        if (strOooO0OO3 != null && p069o0000ooO.o0000oo.OooO0oo(strOooO0OO3)) {
                            str = strOooO0OO3;
                            break;
                        }
                    }
                }
                if (str != null) {
                    iOooO0oO = 1;
                } else if (i3 != -1 || i != -1) {
                    iOooO0oO = 2;
                } else if (i2 == -1 && oooOO1.f6425OooOoo == -1) {
                    iOooO0oO = -1;
                } else {
                    iOooO0oO = 1;
                }
            } else {
                iOooO0oO = 2;
            }
        }
        String string = "";
        Resources resources = this.f9631OooO00o;
        if (iOooO0oO == 2) {
            String[] strArr = new String[3];
            strArr[0] = OooO0Oo(oooOO1);
            if (i3 != -1 && i != -1) {
                string = resources.getString(o0000O00.exo_track_resolution, Integer.valueOf(i3), Integer.valueOf(i));
            }
            strArr[1] = string;
            strArr[2] = OooO0O0(oooOO1);
            strOooO0OO = OooO0o0(strArr);
        } else if (iOooO0oO == 1) {
            String[] strArr2 = new String[3];
            strArr2[0] = OooO0OO(oooOO1);
            if (i2 != -1 && i2 >= 1) {
                if (i2 == 1) {
                    string = resources.getString(o0000O00.exo_track_mono);
                } else if (i2 == 2) {
                    string = resources.getString(o0000O00.exo_track_stereo);
                } else if (i2 == 6 || i2 == 7) {
                    string = resources.getString(o0000O00.exo_track_surround_5_point_1);
                } else {
                    string = i2 != 8 ? resources.getString(o0000O00.exo_track_surround) : resources.getString(o0000O00.exo_track_surround_7_point_1);
                }
            }
            strArr2[1] = string;
            strArr2[2] = OooO0O0(oooOO1);
            strOooO0OO = OooO0o0(strArr2);
        } else {
            strOooO0OO = OooO0OO(oooOO1);
        }
        return strOooO0OO.length() == 0 ? resources.getString(o0000O00.exo_track_unknown) : strOooO0OO;
    }

    public final String OooO0O0(androidx.media3.common.OooOO0 oooOO1) {
        int i = oooOO1.f6408OooOO0O;
        return i == -1 ? "" : this.f9631OooO00o.getString(o0000O00.exo_track_bitrate, Float.valueOf(i / 1000000.0f));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    public final String OooO0OO(androidx.media3.common.OooOO0 oooOO1) {
        String displayName;
        String[] strArr = new String[2];
        String str = oooOO1.f6403OooO0o;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            displayName = "";
        } else {
            int i = o00.f34910OooO00o;
            Locale localeForLanguageTag = i >= 21 ? Locale.forLanguageTag(str) : new Locale(str);
            Locale locale = i >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
            displayName = localeForLanguageTag.getDisplayName(locale);
            if (TextUtils.isEmpty(displayName)) {
                displayName = "";
            } else {
                try {
                    int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
                    displayName = displayName.substring(0, iOffsetByCodePoints).toUpperCase(locale) + displayName.substring(iOffsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        strArr[0] = displayName;
        strArr[1] = OooO0Oo(oooOO1);
        String strOooO0o0 = OooO0o0(strArr);
        if (!TextUtils.isEmpty(strOooO0o0)) {
            return strOooO0o0;
        }
        String str2 = oooOO1.f6404OooO0o0;
        return TextUtils.isEmpty(str2) ? "" : str2;
    }

    public final String OooO0Oo(androidx.media3.common.OooOO0 oooOO1) {
        int i = oooOO1.f6406OooO0oo & 2;
        Resources resources = this.f9631OooO00o;
        String string = i != 0 ? resources.getString(o0000O00.exo_track_role_alternate) : "";
        int i2 = oooOO1.f6406OooO0oo;
        if ((i2 & 4) != 0) {
            string = OooO0o0(string, resources.getString(o0000O00.exo_track_role_supplementary));
        }
        if ((i2 & 8) != 0) {
            string = OooO0o0(string, resources.getString(o0000O00.exo_track_role_commentary));
        }
        return (i2 & 1088) != 0 ? OooO0o0(string, resources.getString(o0000O00.exo_track_role_closed_captions)) : string;
    }

    public final String OooO0o0(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.f9631OooO00o.getString(o0000O00.exo_item_list, string, str);
            }
        }
        return string;
    }
}

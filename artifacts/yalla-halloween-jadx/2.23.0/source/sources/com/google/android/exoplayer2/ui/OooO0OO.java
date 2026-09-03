package com.google.android.exoplayer2.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;
import p245o00oo0o.o00OO0OO;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO0OO implements o0000O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Resources f13798OooO00o;

    public OooO0OO(Resources resources) {
        resources.getClass();
        this.f13798OooO00o = resources;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    @Override // com.google.android.exoplayer2.ui.o0000O0O
    public final String OooO00o(com.google.android.exoplayer2.OooOo oooOo) {
        String strOooO0OO;
        int iOooO0oo = o00OO0OO.OooO0oo(oooOo.f11211OooOOOO);
        int i = oooOo.f11225OooOoo0;
        int i2 = oooOo.f11217OooOo0;
        int i3 = oooOo.f11218OooOo00;
        if (iOooO0oo == -1) {
            String str = oooOo.f11208OooOO0o;
            if (o00OO0OO.OooO(str) != null) {
                iOooO0oo = 2;
            } else if (o00OO0OO.OooO0O0(str) != null) {
                iOooO0oo = 1;
            } else if (i3 != -1 || i2 != -1) {
                iOooO0oo = 2;
            } else if (i == -1 && oooOo.f11224OooOoo == -1) {
                iOooO0oo = -1;
            } else {
                iOooO0oo = 1;
            }
        }
        String string = "";
        Resources resources = this.f13798OooO00o;
        if (iOooO0oo == 2) {
            String[] strArr = new String[3];
            strArr[0] = OooO0Oo(oooOo);
            if (i3 != -1 && i2 != -1) {
                string = resources.getString(Oooo0.exo_track_resolution, Integer.valueOf(i3), Integer.valueOf(i2));
            }
            strArr[1] = string;
            strArr[2] = OooO0O0(oooOo);
            strOooO0OO = OooO0o0(strArr);
        } else if (iOooO0oo == 1) {
            String[] strArr2 = new String[3];
            strArr2[0] = OooO0OO(oooOo);
            if (i != -1 && i >= 1) {
                if (i == 1) {
                    string = resources.getString(Oooo0.exo_track_mono);
                } else if (i == 2) {
                    string = resources.getString(Oooo0.exo_track_stereo);
                } else if (i == 6 || i == 7) {
                    string = resources.getString(Oooo0.exo_track_surround_5_point_1);
                } else {
                    string = i != 8 ? resources.getString(Oooo0.exo_track_surround) : resources.getString(Oooo0.exo_track_surround_7_point_1);
                }
            }
            strArr2[1] = string;
            strArr2[2] = OooO0O0(oooOo);
            strOooO0OO = OooO0o0(strArr2);
        } else {
            strOooO0OO = OooO0OO(oooOo);
        }
        return strOooO0OO.length() == 0 ? resources.getString(Oooo0.exo_track_unknown) : strOooO0OO;
    }

    public final String OooO0O0(com.google.android.exoplayer2.OooOo oooOo) {
        int i = oooOo.f11207OooOO0O;
        return i == -1 ? "" : this.f13798OooO00o.getString(Oooo0.exo_track_bitrate, Float.valueOf(i / 1000000.0f));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    public final String OooO0OO(com.google.android.exoplayer2.OooOo oooOo) {
        String displayName;
        String[] strArr = new String[2];
        String str = oooOo.f11202OooO0o;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            displayName = "";
        } else {
            int i = o0O00.f40595OooO00o;
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
        strArr[1] = OooO0Oo(oooOo);
        String strOooO0o0 = OooO0o0(strArr);
        if (!TextUtils.isEmpty(strOooO0o0)) {
            return strOooO0o0;
        }
        String str2 = oooOo.f11203OooO0o0;
        return TextUtils.isEmpty(str2) ? "" : str2;
    }

    public final String OooO0Oo(com.google.android.exoplayer2.OooOo oooOo) {
        int i = oooOo.f11205OooO0oo & 2;
        Resources resources = this.f13798OooO00o;
        String string = i != 0 ? resources.getString(Oooo0.exo_track_role_alternate) : "";
        int i2 = oooOo.f11205OooO0oo;
        if ((i2 & 4) != 0) {
            string = OooO0o0(string, resources.getString(Oooo0.exo_track_role_supplementary));
        }
        if ((i2 & 8) != 0) {
            string = OooO0o0(string, resources.getString(Oooo0.exo_track_role_commentary));
        }
        return (i2 & 1088) != 0 ? OooO0o0(string, resources.getString(Oooo0.exo_track_role_closed_captions)) : string;
    }

    public final String OooO0o0(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.f13798OooO00o.getString(Oooo0.exo_item_list, string, str);
            }
        }
        return string;
    }
}

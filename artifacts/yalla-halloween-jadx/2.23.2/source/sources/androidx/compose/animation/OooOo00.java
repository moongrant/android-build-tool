package androidx.compose.animation;

import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.media3.common.MediaMetadata;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOo00 implements androidx.media3.common.OooO0OO.OooO00o {
    public static Object OooO00o(Composer composer, int i, int i2) {
        composer.startReplaceableGroup(i);
        composer.startReplaceableGroup(i2);
        return composer.rememberedValue();
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        MediaMetadata.OooO00o oooO00o = new MediaMetadata.OooO00o();
        oooO00o.f6304OooO00o = bundle.getCharSequence(MediaMetadata.f6235Oooo0o);
        oooO00o.f6305OooO0O0 = bundle.getCharSequence(MediaMetadata.f6237Oooo0oO);
        oooO00o.f6306OooO0OO = bundle.getCharSequence(MediaMetadata.f6238Oooo0oo);
        oooO00o.f6307OooO0Oo = bundle.getCharSequence(MediaMetadata.f6234Oooo);
        oooO00o.f6309OooO0o0 = bundle.getCharSequence(MediaMetadata.f6241OoooO00);
        oooO00o.f6308OooO0o = bundle.getCharSequence(MediaMetadata.f6240OoooO0);
        oooO00o.f6310OooO0oO = bundle.getCharSequence(MediaMetadata.f6242OoooO0O);
        byte[] byteArray = bundle.getByteArray(MediaMetadata.f6258o000oOoO);
        String str = MediaMetadata.f6261o00Ooo;
        oooO00o.OooO0o0(byteArray, bundle.containsKey(str) ? Integer.valueOf(bundle.getInt(str)) : null);
        oooO00o.f6314OooOO0o = (Uri) bundle.getParcelable(MediaMetadata.f6244OoooOOO);
        oooO00o.f6322OooOo = bundle.getCharSequence(MediaMetadata.f6254Oooooo);
        oooO00o.f6328OooOoO0 = bundle.getCharSequence(MediaMetadata.f6256OoooooO);
        oooO00o.f6327OooOoO = bundle.getCharSequence(MediaMetadata.f6257Ooooooo);
        oooO00o.f6330OooOoo = bundle.getCharSequence(MediaMetadata.f6259o00O0O);
        oooO00o.f6332OooOooO = bundle.getCharSequence(MediaMetadata.f6260o00Oo0);
        oooO00o.f6333OooOooo = bundle.getCharSequence(MediaMetadata.f6262o00o0O);
        oooO00o.f6335Oooo00O = bundle.getBundle(MediaMetadata.f6264o00oO0o);
        String str2 = MediaMetadata.f6239OoooO;
        if (bundle.containsKey(str2) && (bundle3 = bundle.getBundle(str2)) != null) {
            oooO00o.f6311OooO0oo = (androidx.media3.common.OooOo00) androidx.media3.common.OooOo00.f6628OooO0o0.OooO0OO(bundle3);
        }
        String str3 = MediaMetadata.f6243OoooOO0;
        if (bundle.containsKey(str3) && (bundle2 = bundle.getBundle(str3)) != null) {
            oooO00o.f6303OooO = (androidx.media3.common.OooOo00) androidx.media3.common.OooOo00.f6628OooO0o0.OooO0OO(bundle2);
        }
        String str4 = MediaMetadata.f6245OoooOOo;
        if (bundle.containsKey(str4)) {
            oooO00o.f6316OooOOO0 = Integer.valueOf(bundle.getInt(str4));
        }
        String str5 = MediaMetadata.f6246OoooOo0;
        if (bundle.containsKey(str5)) {
            oooO00o.f6315OooOOO = Integer.valueOf(bundle.getInt(str5));
        }
        String str6 = MediaMetadata.f6247OoooOoO;
        if (bundle.containsKey(str6)) {
            oooO00o.f6317OooOOOO = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = MediaMetadata.f6267oo000o;
        if (bundle.containsKey(str7)) {
            oooO00o.f6318OooOOOo = Boolean.valueOf(bundle.getBoolean(str7));
        }
        String str8 = MediaMetadata.f6248OoooOoo;
        if (bundle.containsKey(str8)) {
            oooO00o.f6320OooOOo0 = Boolean.valueOf(bundle.getBoolean(str8));
        }
        String str9 = MediaMetadata.f6249Ooooo00;
        if (bundle.containsKey(str9)) {
            oooO00o.f6319OooOOo = Integer.valueOf(bundle.getInt(str9));
        }
        String str10 = MediaMetadata.f6250Ooooo0o;
        if (bundle.containsKey(str10)) {
            oooO00o.f6321OooOOoo = Integer.valueOf(bundle.getInt(str10));
        }
        String str11 = MediaMetadata.f6251OooooO0;
        if (bundle.containsKey(str11)) {
            oooO00o.f6324OooOo00 = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = MediaMetadata.f6252OooooOO;
        if (bundle.containsKey(str12)) {
            oooO00o.f6323OooOo0 = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = MediaMetadata.f6253OooooOo;
        if (bundle.containsKey(str13)) {
            oooO00o.f6325OooOo0O = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = MediaMetadata.f6255Oooooo0;
        if (bundle.containsKey(str14)) {
            oooO00o.f6326OooOo0o = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = MediaMetadata.f6266o0OoOo0;
        if (bundle.containsKey(str15)) {
            oooO00o.f6329OooOoOO = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = MediaMetadata.f6268ooOO;
        if (bundle.containsKey(str16)) {
            oooO00o.f6331OooOoo0 = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = MediaMetadata.f6265o00ooo;
        if (bundle.containsKey(str17)) {
            oooO00o.f6334Oooo000 = Integer.valueOf(bundle.getInt(str17));
        }
        return new MediaMetadata(oooO00o);
    }
}

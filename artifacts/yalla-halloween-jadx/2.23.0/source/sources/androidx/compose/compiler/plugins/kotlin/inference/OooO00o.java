package androidx.compose.compiler.plugins.kotlin.inference;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.OooO;
import com.google.android.exoplayer2.o0ooOOo;
import p004OooO0oO.o000oOoO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements OooO.OooO00o {
    public static /* synthetic */ int OooO00o(int i, int i2, String str) {
        String string = str.subSequence(i, i2).toString();
        if (string.length() > 1 && string.charAt(0) == '+') {
            string = string.substring(1);
        }
        long j = Long.parseLong(string, 10);
        if ((4294967295L & j) == j) {
            return (int) j;
        }
        throw new NumberFormatException(o000oOoO.OooO00o("Input ", string, " in base 10 is not in the range of an unsigned integer"));
    }

    @Override // com.google.android.exoplayer2.OooO.OooO00o
    public OooO OooO0O0(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        MediaMetadata.OooO00o oooO00o = new MediaMetadata.OooO00o();
        oooO00o.f10998OooO00o = bundle.getCharSequence(MediaMetadata.f10929Oooo0o);
        oooO00o.f10999OooO0O0 = bundle.getCharSequence(MediaMetadata.f10931Oooo0oO);
        oooO00o.f11000OooO0OO = bundle.getCharSequence(MediaMetadata.f10932Oooo0oo);
        oooO00o.f11001OooO0Oo = bundle.getCharSequence(MediaMetadata.f10928Oooo);
        oooO00o.f11003OooO0o0 = bundle.getCharSequence(MediaMetadata.f10935OoooO00);
        oooO00o.f11002OooO0o = bundle.getCharSequence(MediaMetadata.f10934OoooO0);
        oooO00o.f11004OooO0oO = bundle.getCharSequence(MediaMetadata.f10936OoooO0O);
        byte[] byteArray = bundle.getByteArray(MediaMetadata.f10952o000oOoO);
        String str = MediaMetadata.f10955o00Ooo;
        Integer numValueOf = bundle.containsKey(str) ? Integer.valueOf(bundle.getInt(str)) : null;
        oooO00o.f11006OooOO0 = byteArray != null ? (byte[]) byteArray.clone() : null;
        oooO00o.f11007OooOO0O = numValueOf;
        oooO00o.f11008OooOO0o = (Uri) bundle.getParcelable(MediaMetadata.f10938OoooOOO);
        oooO00o.f11016OooOo = bundle.getCharSequence(MediaMetadata.f10948Oooooo);
        oooO00o.f11022OooOoO0 = bundle.getCharSequence(MediaMetadata.f10950OoooooO);
        oooO00o.f11021OooOoO = bundle.getCharSequence(MediaMetadata.f10951Ooooooo);
        oooO00o.f11024OooOoo = bundle.getCharSequence(MediaMetadata.f10953o00O0O);
        oooO00o.f11026OooOooO = bundle.getCharSequence(MediaMetadata.f10954o00Oo0);
        oooO00o.f11027OooOooo = bundle.getCharSequence(MediaMetadata.f10956o00o0O);
        oooO00o.f11029Oooo00O = bundle.getBundle(MediaMetadata.f10958o00oO0o);
        String str2 = MediaMetadata.f10933OoooO;
        if (bundle.containsKey(str2) && (bundle3 = bundle.getBundle(str2)) != null) {
            oooO00o.f11005OooO0oo = (o0ooOOo) o0ooOOo.f12868OooO0o0.OooO0O0(bundle3);
        }
        String str3 = MediaMetadata.f10937OoooOO0;
        if (bundle.containsKey(str3) && (bundle2 = bundle.getBundle(str3)) != null) {
            oooO00o.f10997OooO = (o0ooOOo) o0ooOOo.f12868OooO0o0.OooO0O0(bundle2);
        }
        String str4 = MediaMetadata.f10939OoooOOo;
        if (bundle.containsKey(str4)) {
            oooO00o.f11010OooOOO0 = Integer.valueOf(bundle.getInt(str4));
        }
        String str5 = MediaMetadata.f10940OoooOo0;
        if (bundle.containsKey(str5)) {
            oooO00o.f11009OooOOO = Integer.valueOf(bundle.getInt(str5));
        }
        String str6 = MediaMetadata.f10941OoooOoO;
        if (bundle.containsKey(str6)) {
            oooO00o.f11011OooOOOO = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = MediaMetadata.f10961oo000o;
        if (bundle.containsKey(str7)) {
            oooO00o.f11012OooOOOo = Boolean.valueOf(bundle.getBoolean(str7));
        }
        String str8 = MediaMetadata.f10942OoooOoo;
        if (bundle.containsKey(str8)) {
            oooO00o.f11014OooOOo0 = Boolean.valueOf(bundle.getBoolean(str8));
        }
        String str9 = MediaMetadata.f10943Ooooo00;
        if (bundle.containsKey(str9)) {
            oooO00o.f11013OooOOo = Integer.valueOf(bundle.getInt(str9));
        }
        String str10 = MediaMetadata.f10944Ooooo0o;
        if (bundle.containsKey(str10)) {
            oooO00o.f11015OooOOoo = Integer.valueOf(bundle.getInt(str10));
        }
        String str11 = MediaMetadata.f10945OooooO0;
        if (bundle.containsKey(str11)) {
            oooO00o.f11018OooOo00 = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = MediaMetadata.f10946OooooOO;
        if (bundle.containsKey(str12)) {
            oooO00o.f11017OooOo0 = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = MediaMetadata.f10947OooooOo;
        if (bundle.containsKey(str13)) {
            oooO00o.f11019OooOo0O = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = MediaMetadata.f10949Oooooo0;
        if (bundle.containsKey(str14)) {
            oooO00o.f11020OooOo0o = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = MediaMetadata.f10960o0OoOo0;
        if (bundle.containsKey(str15)) {
            oooO00o.f11023OooOoOO = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = MediaMetadata.f10962ooOO;
        if (bundle.containsKey(str16)) {
            oooO00o.f11025OooOoo0 = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = MediaMetadata.f10959o00ooo;
        if (bundle.containsKey(str17)) {
            oooO00o.f11028Oooo000 = Integer.valueOf(bundle.getInt(str17));
        }
        return new MediaMetadata(oooO00o);
    }
}

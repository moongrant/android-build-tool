package o000O000;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import androidx.media3.common.text.Cue;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements androidx.media3.common.OooO0OO.OooO00o {
    @Override // androidx.media3.common.OooO0OO.OooO00o
    public final androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        Cue.OooO00o oooO00o = new Cue.OooO00o();
        CharSequence charSequence = bundle.getCharSequence(Cue.f6880OooOo0O);
        if (charSequence != null) {
            oooO00o.f6915OooO00o = charSequence;
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(Cue.f6881OooOo0o);
        if (alignment != null) {
            oooO00o.f6917OooO0OO = alignment;
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(Cue.f6878OooOo);
        if (alignment2 != null) {
            oooO00o.f6918OooO0Oo = alignment2;
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(Cue.f6883OooOoO0);
        if (bitmap != null) {
            oooO00o.f6916OooO0O0 = bitmap;
        }
        String str = Cue.f6882OooOoO;
        if (bundle.containsKey(str)) {
            String str2 = Cue.f6884OooOoOO;
            if (bundle.containsKey(str2)) {
                float f = bundle.getFloat(str);
                int i = bundle.getInt(str2);
                oooO00o.f6920OooO0o0 = f;
                oooO00o.f6919OooO0o = i;
            }
        }
        String str3 = Cue.f6886OooOoo0;
        if (bundle.containsKey(str3)) {
            oooO00o.f6921OooO0oO = bundle.getInt(str3);
        }
        String str4 = Cue.f6885OooOoo;
        if (bundle.containsKey(str4)) {
            oooO00o.f6922OooO0oo = bundle.getFloat(str4);
        }
        String str5 = Cue.f6887OooOooO;
        if (bundle.containsKey(str5)) {
            oooO00o.f6914OooO = bundle.getInt(str5);
        }
        String str6 = Cue.f6890Oooo000;
        if (bundle.containsKey(str6)) {
            String str7 = Cue.f6888OooOooo;
            if (bundle.containsKey(str7)) {
                float f2 = bundle.getFloat(str6);
                int i2 = bundle.getInt(str7);
                oooO00o.f6924OooOO0O = f2;
                oooO00o.f6923OooOO0 = i2;
            }
        }
        String str8 = Cue.f6891Oooo00O;
        if (bundle.containsKey(str8)) {
            oooO00o.f6925OooOO0o = bundle.getFloat(str8);
        }
        String str9 = Cue.f6892Oooo00o;
        if (bundle.containsKey(str9)) {
            oooO00o.f6927OooOOO0 = bundle.getFloat(str9);
        }
        String str10 = Cue.f6889Oooo0;
        if (bundle.containsKey(str10)) {
            oooO00o.f6928OooOOOO = bundle.getInt(str10);
            oooO00o.f6926OooOOO = true;
        }
        if (!bundle.getBoolean(Cue.f6893Oooo0O0, false)) {
            oooO00o.f6926OooOOO = false;
        }
        String str11 = Cue.f6894Oooo0OO;
        if (bundle.containsKey(str11)) {
            oooO00o.f6929OooOOOo = bundle.getInt(str11);
        }
        String str12 = Cue.f6896Oooo0o0;
        if (bundle.containsKey(str12)) {
            oooO00o.f6930OooOOo0 = bundle.getFloat(str12);
        }
        return oooO00o.OooO00o();
    }
}

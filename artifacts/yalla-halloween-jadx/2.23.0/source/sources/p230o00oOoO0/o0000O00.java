package p230o00oOoO0;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.text.Layout;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.google.android.exoplayer2.OooO;
import com.google.android.exoplayer2.text.Cue;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import oo0o0O0.OooO0OO;
import p416o0Oo0ooo.y0;
import p417o0OoO0.o0000O0O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000O00 implements OooO.OooO00o, OooO0OO {
    @Override // com.google.android.exoplayer2.OooO.OooO00o
    public OooO OooO0O0(Bundle bundle) {
        Cue.OooO00o oooO00o = new Cue.OooO00o();
        CharSequence charSequence = bundle.getCharSequence(Cue.f13384OooOo0O);
        if (charSequence != null) {
            oooO00o.f13419OooO00o = charSequence;
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(Cue.f13385OooOo0o);
        if (alignment != null) {
            oooO00o.f13421OooO0OO = alignment;
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(Cue.f13382OooOo);
        if (alignment2 != null) {
            oooO00o.f13422OooO0Oo = alignment2;
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(Cue.f13387OooOoO0);
        if (bitmap != null) {
            oooO00o.f13420OooO0O0 = bitmap;
        }
        String str = Cue.f13386OooOoO;
        if (bundle.containsKey(str)) {
            String str2 = Cue.f13388OooOoOO;
            if (bundle.containsKey(str2)) {
                float f = bundle.getFloat(str);
                int i = bundle.getInt(str2);
                oooO00o.f13424OooO0o0 = f;
                oooO00o.f13423OooO0o = i;
            }
        }
        String str3 = Cue.f13390OooOoo0;
        if (bundle.containsKey(str3)) {
            oooO00o.f13425OooO0oO = bundle.getInt(str3);
        }
        String str4 = Cue.f13389OooOoo;
        if (bundle.containsKey(str4)) {
            oooO00o.f13426OooO0oo = bundle.getFloat(str4);
        }
        String str5 = Cue.f13391OooOooO;
        if (bundle.containsKey(str5)) {
            oooO00o.f13418OooO = bundle.getInt(str5);
        }
        String str6 = Cue.f13394Oooo000;
        if (bundle.containsKey(str6)) {
            String str7 = Cue.f13392OooOooo;
            if (bundle.containsKey(str7)) {
                float f2 = bundle.getFloat(str6);
                int i2 = bundle.getInt(str7);
                oooO00o.f13428OooOO0O = f2;
                oooO00o.f13427OooOO0 = i2;
            }
        }
        String str8 = Cue.f13395Oooo00O;
        if (bundle.containsKey(str8)) {
            oooO00o.f13429OooOO0o = bundle.getFloat(str8);
        }
        String str9 = Cue.f13396Oooo00o;
        if (bundle.containsKey(str9)) {
            oooO00o.f13431OooOOO0 = bundle.getFloat(str9);
        }
        String str10 = Cue.f13393Oooo0;
        if (bundle.containsKey(str10)) {
            oooO00o.f13432OooOOOO = bundle.getInt(str10);
            oooO00o.f13430OooOOO = true;
        }
        if (!bundle.getBoolean(Cue.f13397Oooo0O0, false)) {
            oooO00o.f13430OooOOO = false;
        }
        String str11 = Cue.f13398Oooo0OO;
        if (bundle.containsKey(str11)) {
            oooO00o.f13433OooOOOo = bundle.getInt(str11);
        }
        String str12 = Cue.f13400Oooo0o0;
        if (bundle.containsKey(str12)) {
            oooO00o.f13434OooOOo0 = bundle.getFloat(str12);
        }
        return oooO00o.OooO00o();
    }

    @Override // oo0o0O0.OooO0OO
    public void result(boolean z, Object obj) {
        String str = (String) obj;
        int i = ShowImageActivity.f26251Oooo00o;
        if (!z || str == null) {
            return;
        }
        File file = y0.f45407OooO00o;
        String strValueOf = String.valueOf(y0.OooO0Oo(new File(str)));
        if ((strValueOf.length() == 0) || Intrinsics.areEqual("null", o0000O0O.OooO0oo(strValueOf)) || StringsKt.isBlank(strValueOf)) {
            return;
        }
        o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strValueOf, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o000oo0OooO00o.run();
        } else {
            o000O0.f10355OooO0O0.post(o000oo0OooO00o);
        }
    }
}

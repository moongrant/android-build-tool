package androidx.compose.animation;

import android.os.Bundle;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import p245o00oo0o.o0O00;
import p245o00oo0o.oOO00O;
import p247o00oo0oO.o00O0OO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Oooo0 implements com.google.android.exoplayer2.OooO.OooO00o {
    public static int OooO00o(float f, int i, int i2) {
        return (Float.floatToIntBits(f) + i) * i2;
    }

    @Override // com.google.android.exoplayer2.OooO.OooO00o
    public com.google.android.exoplayer2.OooO OooO0O0(Bundle bundle) {
        com.google.android.exoplayer2.OooOo.OooO00o oooO00o = new com.google.android.exoplayer2.OooOo.OooO00o();
        if (bundle != null) {
            ClassLoader classLoader = oOO00O.class.getClassLoader();
            int i = o0O00.f40595OooO00o;
            bundle.setClassLoader(classLoader);
        }
        String string = bundle.getString(com.google.android.exoplayer2.OooOo.f11167Oooo0o);
        com.google.android.exoplayer2.OooOo oooOo = com.google.android.exoplayer2.OooOo.f11168Oooo0o0;
        String str = oooOo.f11201OooO0Oo;
        if (string == null) {
            string = str;
        }
        oooO00o.f11235OooO00o = string;
        String string2 = bundle.getString(com.google.android.exoplayer2.OooOo.f11169Oooo0oO);
        if (string2 == null) {
            string2 = oooOo.f11203OooO0o0;
        }
        oooO00o.f11236OooO0O0 = string2;
        String string3 = bundle.getString(com.google.android.exoplayer2.OooOo.f11170Oooo0oo);
        if (string3 == null) {
            string3 = oooOo.f11202OooO0o;
        }
        oooO00o.f11237OooO0OO = string3;
        oooO00o.f11238OooO0Oo = bundle.getInt(com.google.android.exoplayer2.OooOo.f11166Oooo, oooOo.f11204OooO0oO);
        oooO00o.f11240OooO0o0 = bundle.getInt(com.google.android.exoplayer2.OooOo.f11173OoooO00, oooOo.f11205OooO0oo);
        oooO00o.f11239OooO0o = bundle.getInt(com.google.android.exoplayer2.OooOo.f11172OoooO0, oooOo.f11200OooO);
        oooO00o.f11241OooO0oO = bundle.getInt(com.google.android.exoplayer2.OooOo.f11174OoooO0O, oooOo.f11206OooOO0);
        String string4 = bundle.getString(com.google.android.exoplayer2.OooOo.f11171OoooO);
        if (string4 == null) {
            string4 = oooOo.f11208OooOO0o;
        }
        oooO00o.f11242OooO0oo = string4;
        Metadata metadata = (Metadata) bundle.getParcelable(com.google.android.exoplayer2.OooOo.f11175OoooOO0);
        if (metadata == null) {
            metadata = oooOo.f11210OooOOO0;
        }
        oooO00o.f11234OooO = metadata;
        String string5 = bundle.getString(com.google.android.exoplayer2.OooOo.f11190o000oOoO);
        if (string5 == null) {
            string5 = oooOo.f11209OooOOO;
        }
        oooO00o.f11243OooOO0 = string5;
        String string6 = bundle.getString(com.google.android.exoplayer2.OooOo.f11176OoooOOO);
        if (string6 == null) {
            string6 = oooOo.f11211OooOOOO;
        }
        oooO00o.f11244OooOO0O = string6;
        oooO00o.f11245OooOO0o = bundle.getInt(com.google.android.exoplayer2.OooOo.f11177OoooOOo, oooOo.f11212OooOOOo);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            byte[] byteArray = bundle.getByteArray(com.google.android.exoplayer2.OooOo.OooO0Oo(i2));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i2++;
        }
        oooO00o.f11247OooOOO0 = arrayList;
        oooO00o.f11246OooOOO = (DrmInitData) bundle.getParcelable(com.google.android.exoplayer2.OooOo.f11179OoooOoO);
        oooO00o.f11248OooOOOO = bundle.getLong(com.google.android.exoplayer2.OooOo.f11180OoooOoo, oooOo.f11215OooOOoo);
        oooO00o.f11249OooOOOo = bundle.getInt(com.google.android.exoplayer2.OooOo.f11181Ooooo00, oooOo.f11218OooOo00);
        oooO00o.f11251OooOOo0 = bundle.getInt(com.google.android.exoplayer2.OooOo.f11182Ooooo0o, oooOo.f11217OooOo0);
        oooO00o.f11250OooOOo = bundle.getFloat(com.google.android.exoplayer2.OooOo.f11183OooooO0, oooOo.f11219OooOo0O);
        oooO00o.f11252OooOOoo = bundle.getInt(com.google.android.exoplayer2.OooOo.f11184OooooOO, oooOo.f11220OooOo0o);
        oooO00o.f11255OooOo00 = bundle.getFloat(com.google.android.exoplayer2.OooOo.f11185OooooOo, oooOo.f11216OooOo);
        oooO00o.f11254OooOo0 = bundle.getByteArray(com.google.android.exoplayer2.OooOo.f11187Oooooo0);
        oooO00o.f11256OooOo0O = bundle.getInt(com.google.android.exoplayer2.OooOo.f11186Oooooo, oooOo.f11221OooOoO);
        Bundle bundle2 = bundle.getBundle(com.google.android.exoplayer2.OooOo.f11188OoooooO);
        if (bundle2 != null) {
            oooO00o.f11257OooOo0o = (o00O0OO) o00O0OO.f40744OooOOO.OooO0O0(bundle2);
        }
        oooO00o.f11253OooOo = bundle.getInt(com.google.android.exoplayer2.OooOo.f11189Ooooooo, oooOo.f11225OooOoo0);
        oooO00o.f11259OooOoO0 = bundle.getInt(com.google.android.exoplayer2.OooOo.f11197o0OoOo0, oooOo.f11224OooOoo);
        oooO00o.f11258OooOoO = bundle.getInt(com.google.android.exoplayer2.OooOo.f11199ooOO, oooOo.f11226OooOooO);
        oooO00o.f11260OooOoOO = bundle.getInt(com.google.android.exoplayer2.OooOo.f11191o00O0O, oooOo.f11227OooOooo);
        oooO00o.f11262OooOoo0 = bundle.getInt(com.google.android.exoplayer2.OooOo.f11192o00Oo0, oooOo.f11229Oooo000);
        oooO00o.f11261OooOoo = bundle.getInt(com.google.android.exoplayer2.OooOo.f11193o00Ooo, oooOo.f11230Oooo00O);
        oooO00o.f11263OooOooO = bundle.getInt(com.google.android.exoplayer2.OooOo.f11196o00ooo, oooOo.f11231Oooo00o);
        oooO00o.f11264OooOooo = bundle.getInt(com.google.android.exoplayer2.OooOo.f11198oo000o, oooOo.f11228Oooo0);
        oooO00o.f11265Oooo000 = bundle.getInt(com.google.android.exoplayer2.OooOo.f11194o00o0O, oooOo.f11232Oooo0O0);
        return new com.google.android.exoplayer2.OooOo(oooO00o);
    }
}

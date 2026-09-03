package androidx.compose.animation;

import android.os.Bundle;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Metadata;
import java.util.ArrayList;
import kotlin.collections.IntIterator;
import kotlin.ranges.IntRange;
import p080o000OoO.o00;
import p080o000OoO.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements androidx.media3.common.OooO0OO.OooO00o {
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator] */
    public static IntIterator OooO00o(int i, int i2) {
        return new IntRange(i, i2).iterator();
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        androidx.media3.common.OooOO0.OooO00o oooO00o = new androidx.media3.common.OooOO0.OooO00o();
        if (bundle != null) {
            ClassLoader classLoader = o00oO0o.class.getClassLoader();
            int i = o00.f34910OooO00o;
            bundle.setClassLoader(classLoader);
        }
        String string = bundle.getString(androidx.media3.common.OooOO0.f6368Oooo0o);
        androidx.media3.common.OooOO0 oooOO1 = androidx.media3.common.OooOO0.f6369Oooo0o0;
        String str = oooOO1.f6402OooO0Oo;
        if (string == null) {
            string = str;
        }
        oooO00o.f6436OooO00o = string;
        String string2 = bundle.getString(androidx.media3.common.OooOO0.f6370Oooo0oO);
        if (string2 == null) {
            string2 = oooOO1.f6404OooO0o0;
        }
        oooO00o.f6437OooO0O0 = string2;
        String string3 = bundle.getString(androidx.media3.common.OooOO0.f6371Oooo0oo);
        if (string3 == null) {
            string3 = oooOO1.f6403OooO0o;
        }
        oooO00o.f6438OooO0OO = string3;
        oooO00o.f6439OooO0Oo = bundle.getInt(androidx.media3.common.OooOO0.f6367Oooo, oooOO1.f6405OooO0oO);
        oooO00o.f6441OooO0o0 = bundle.getInt(androidx.media3.common.OooOO0.f6374OoooO00, oooOO1.f6406OooO0oo);
        oooO00o.f6440OooO0o = bundle.getInt(androidx.media3.common.OooOO0.f6373OoooO0, oooOO1.f6401OooO);
        oooO00o.f6442OooO0oO = bundle.getInt(androidx.media3.common.OooOO0.f6375OoooO0O, oooOO1.f6407OooOO0);
        String string4 = bundle.getString(androidx.media3.common.OooOO0.f6372OoooO);
        if (string4 == null) {
            string4 = oooOO1.f6409OooOO0o;
        }
        oooO00o.f6443OooO0oo = string4;
        Metadata metadata = (Metadata) bundle.getParcelable(androidx.media3.common.OooOO0.f6376OoooOO0);
        if (metadata == null) {
            metadata = oooOO1.f6411OooOOO0;
        }
        oooO00o.f6435OooO = metadata;
        String string5 = bundle.getString(androidx.media3.common.OooOO0.f6391o000oOoO);
        if (string5 == null) {
            string5 = oooOO1.f6410OooOOO;
        }
        oooO00o.f6444OooOO0 = string5;
        String string6 = bundle.getString(androidx.media3.common.OooOO0.f6377OoooOOO);
        if (string6 == null) {
            string6 = oooOO1.f6412OooOOOO;
        }
        oooO00o.f6445OooOO0O = string6;
        oooO00o.f6446OooOO0o = bundle.getInt(androidx.media3.common.OooOO0.f6378OoooOOo, oooOO1.f6413OooOOOo);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            byte[] byteArray = bundle.getByteArray(androidx.media3.common.OooOO0.OooO0o(i2));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i2++;
        }
        oooO00o.f6448OooOOO0 = arrayList;
        oooO00o.f6447OooOOO = (DrmInitData) bundle.getParcelable(androidx.media3.common.OooOO0.f6380OoooOoO);
        oooO00o.f6449OooOOOO = bundle.getLong(androidx.media3.common.OooOO0.f6381OoooOoo, oooOO1.f6416OooOOoo);
        oooO00o.f6450OooOOOo = bundle.getInt(androidx.media3.common.OooOO0.f6382Ooooo00, oooOO1.f6419OooOo00);
        oooO00o.f6452OooOOo0 = bundle.getInt(androidx.media3.common.OooOO0.f6383Ooooo0o, oooOO1.f6418OooOo0);
        oooO00o.f6451OooOOo = bundle.getFloat(androidx.media3.common.OooOO0.f6384OooooO0, oooOO1.f6420OooOo0O);
        oooO00o.f6453OooOOoo = bundle.getInt(androidx.media3.common.OooOO0.f6385OooooOO, oooOO1.f6421OooOo0o);
        oooO00o.f6456OooOo00 = bundle.getFloat(androidx.media3.common.OooOO0.f6386OooooOo, oooOO1.f6417OooOo);
        oooO00o.f6455OooOo0 = bundle.getByteArray(androidx.media3.common.OooOO0.f6388Oooooo0);
        oooO00o.f6457OooOo0O = bundle.getInt(androidx.media3.common.OooOO0.f6387Oooooo, oooOO1.f6422OooOoO);
        Bundle bundle2 = bundle.getBundle(androidx.media3.common.OooOO0.f6389OoooooO);
        if (bundle2 != null) {
            oooO00o.f6458OooOo0o = (androidx.media3.common.OooO0o) androidx.media3.common.OooO0o.f6360OooOOO.OooO0OO(bundle2);
        }
        oooO00o.f6454OooOo = bundle.getInt(androidx.media3.common.OooOO0.f6390Ooooooo, oooOO1.f6426OooOoo0);
        oooO00o.f6460OooOoO0 = bundle.getInt(androidx.media3.common.OooOO0.f6398o0OoOo0, oooOO1.f6425OooOoo);
        oooO00o.f6459OooOoO = bundle.getInt(androidx.media3.common.OooOO0.f6400ooOO, oooOO1.f6427OooOooO);
        oooO00o.f6461OooOoOO = bundle.getInt(androidx.media3.common.OooOO0.f6392o00O0O, oooOO1.f6428OooOooo);
        oooO00o.f6463OooOoo0 = bundle.getInt(androidx.media3.common.OooOO0.f6393o00Oo0, oooOO1.f6430Oooo000);
        oooO00o.f6462OooOoo = bundle.getInt(androidx.media3.common.OooOO0.f6394o00Ooo, oooOO1.f6431Oooo00O);
        oooO00o.f6464OooOooO = bundle.getInt(androidx.media3.common.OooOO0.f6397o00ooo, oooOO1.f6432Oooo00o);
        oooO00o.f6465OooOooo = bundle.getInt(androidx.media3.common.OooOO0.f6399oo000o, oooOO1.f6429Oooo0);
        oooO00o.f6466Oooo000 = bundle.getInt(androidx.media3.common.OooOO0.f6395o00o0O, oooOO1.f6433Oooo0O0);
        return new androidx.media3.common.OooOO0(oooO00o);
    }
}

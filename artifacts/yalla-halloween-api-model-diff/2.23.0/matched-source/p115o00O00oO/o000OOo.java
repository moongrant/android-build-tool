package p115o00O00oO;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.OooOO0;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.parser.moshi.OooO00o;
import java.io.IOException;
import java.util.List;
import o00O00OO.OooO;
import o00O00OO.OooO0O0;
import o00O00OO.OooO0o;
import o00O00OO.OooOO0O;
import o00O00OO.OooOOO;
import o00O00OO.OooOo;
import o00O00OO.Oooo000;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final JsonReader.OooO00o f36485OooO00o = JsonReader.OooO00o.OooO00o("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final JsonReader.OooO00o f36486OooO0O0 = JsonReader.OooO00o.OooO00o("k");

    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:23:0x0096  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b0  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static OooOo OooO00o(OooO00o oooO00o, OooOO0 oooOO1) throws IOException {
        boolean z;
        OooOO0O oooOO0O;
        Oooo000 oooo000;
        OooO0O0 OooO0O1;
        List<o00O0O00.OooO00o<V>> list;
        OooO0O0 oooO0O0;
        boolean z2 = oooO00o.Oooo0() == JsonReader.Token.BEGIN_OBJECT;
        if (z2) {
            oooO00o.OooO0OO();
        }
        OooO0O0 oooO0O1 = null;
        OooOO0O oooOO0O2 = null;
        Oooo000 oooo000OooO0O0 = null;
        OooO0O0 OooO0O2 = null;
        OooO0O0 OooO0O3 = null;
        OooO oooOOooO00o = null;
        OooO0o oooO0oOooO0OO = null;
        OooO0O0 OooO0O4 = null;
        OooO0O0 OooO0O5 = null;
        while (oooO00o.OooOo00()) {
            switch (oooO00o.Oooo0OO(f36485OooO00o)) {
                case 0:
                    oooOO0O = oooOO0O2;
                    oooo000 = oooo000OooO0O0;
                    oooO00o.OooO0OO();
                    while (oooO00o.OooOo00()) {
                        if (oooO00o.Oooo0OO(f36486OooO0O0) != 0) {
                            oooO00o.Oooo0o0();
                            oooO00o.Oooo0o();
                        } else {
                            oooOOooO00o = oo0o0Oo.OooO00o(oooO00o, oooOO1);
                        }
                    }
                    oooO00o.OooOOo0();
                    oooOO0O2 = oooOO0O;
                    oooo000OooO0O0 = oooo000;
                    break;
                case 1:
                    oooo000OooO0O0 = oo0o0Oo.OooO0O0(oooO00o, oooOO1);
                    break;
                case 2:
                    oooo000 = oooo000OooO0O0;
                    oooOO0O2 = new OooOO0O(o000O0o.OooO00o(oooO00o, oooOO1, 1.0f, o000OO00.f36483OooO00o, false));
                    oooo000OooO0O0 = oooo000;
                    break;
                case 3:
                    oooOO1.OooO00o("Lottie doesn't support 3D layers.");
                    OooO0O1 = o000000.OooO0O0(oooO00o, oooOO1, false);
                    list = OooO0O1.f36354OooO00o;
                    if (list.isEmpty()) {
                        oooO0O0 = OooO0O1;
                        oooOO0O = oooOO0O2;
                        oooo000 = oooo000OooO0O0;
                        list.add((o00O0O00.OooO00o<V>) new o00O0O00.OooO00o(oooOO1, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(oooOO1.f8733OooOO0o)));
                    } else {
                        oooO0O0 = OooO0O1;
                        oooOO0O = oooOO0O2;
                        oooo000 = oooo000OooO0O0;
                        if (((o00O0O00.OooO00o) list.get(0)).f36503OooO0O0 == 0) {
                            list.set(0, (o00O0O00.OooO00o<V>) new o00O0O00.OooO00o(oooOO1, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(oooOO1.f8733OooOO0o)));
                        }
                    }
                    oooO0O1 = oooO0O0;
                    oooOO0O2 = oooOO0O;
                    oooo000OooO0O0 = oooo000;
                    break;
                case 4:
                    OooO0O1 = o000000.OooO0O0(oooO00o, oooOO1, false);
                    list = OooO0O1.f36354OooO00o;
                    if (list.isEmpty()) {
                        oooO0O0 = OooO0O1;
                        oooOO0O = oooOO0O2;
                        oooo000 = oooo000OooO0O0;
                        list.add((o00O0O00.OooO00o<V>) new o00O0O00.OooO00o(oooOO1, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(oooOO1.f8733OooOO0o)));
                    } else {
                        oooO0O0 = OooO0O1;
                        oooOO0O = oooOO0O2;
                        oooo000 = oooo000OooO0O0;
                        if (((o00O0O00.OooO00o) list.get(0)).f36503OooO0O0 == 0) {
                            list.set(0, (o00O0O00.OooO00o<V>) new o00O0O00.OooO00o(oooOO1, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(oooOO1.f8733OooOO0o)));
                        }
                    }
                    oooO0O1 = oooO0O0;
                    oooOO0O2 = oooOO0O;
                    oooo000OooO0O0 = oooo000;
                    break;
                case 5:
                    oooO0oOooO0OO = o000000.OooO0OO(oooO00o, oooOO1);
                    break;
                case 6:
                    OooO0O4 = o000000.OooO0O0(oooO00o, oooOO1, false);
                    break;
                case 7:
                    OooO0O5 = o000000.OooO0O0(oooO00o, oooOO1, false);
                    break;
                case 8:
                    OooO0O3 = o000000.OooO0O0(oooO00o, oooOO1, false);
                    break;
                case 9:
                    OooO0O2 = o000000.OooO0O0(oooO00o, oooOO1, false);
                    break;
                default:
                    oooO00o.Oooo0o0();
                    oooO00o.Oooo0o();
                    break;
            }
        }
        OooOO0O oooOO0O3 = oooOO0O2;
        Oooo000 oooo001 = oooo000OooO0O0;
        if (z2) {
            oooO00o.OooOOo0();
        }
        OooO oooO = oooOOooO00o == null || (oooOOooO00o.isStatic() && oooOOooO00o.f36338OooO00o.get(0).f36503OooO0O0.equals(0.0f, 0.0f)) ? null : oooOOooO00o;
        Oooo000 oooo002 = oooo001 == 0 || (!(oooo001 instanceof OooOOO) && oooo001.isStatic() && ((PointF) ((o00O0O00.OooO00o) oooo001.OooO0O0().get(0)).f36503OooO0O0).equals(0.0f, 0.0f)) ? null : oooo001;
        if (oooO0O1 == null || (oooO0O1.isStatic() && ((Float) ((o00O0O00.OooO00o) oooO0O1.f36354OooO00o.get(0)).f36503OooO0O0).floatValue() == 0.0f)) {
            oooO0O1 = null;
        }
        if (oooOO0O3 == null) {
            z = true;
        } else {
            if (oooOO0O3.isStatic()) {
                o00O0O00.OooO0o oooO0o = (o00O0O00.OooO0o) ((o00O0O00.OooO00o) oooOO0O3.f36354OooO00o.get(0)).f36503OooO0O0;
                if (oooO0o.f36521OooO00o == 1.0f && oooO0o.f36522OooO0O0 == 1.0f) {
                    z = true;
                }
            }
            z = false;
        }
        OooOO0O oooOO0O4 = z ? null : oooOO0O3;
        if (OooO0O3 == null || (OooO0O3.isStatic() && ((Float) ((o00O0O00.OooO00o) OooO0O3.f36354OooO00o.get(0)).f36503OooO0O0).floatValue() == 0.0f)) {
            OooO0O3 = null;
        }
        return new OooOo(oooO, oooo002, oooOO0O4, oooO0O1, oooO0oOooO0OO, OooO0O4, OooO0O5, OooO0O3, OooO0O2 == null || (OooO0O2.isStatic() && (((Float) ((o00O0O00.OooO00o) OooO0O2.f36354OooO00o.get(0)).f36503OooO0O0).floatValue() > 0.0f ? 1 : (((Float) ((o00O0O00.OooO00o) OooO0O2.f36354OooO00o.get(0)).f36503OooO0O0).floatValue() == 0.0f ? 0 : -1)) == 0) ? null : OooO0O2);
    }
}

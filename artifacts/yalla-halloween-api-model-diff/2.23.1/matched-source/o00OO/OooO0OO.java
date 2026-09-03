package o00OO;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final JsonReader.OooO00o f36857OooO00o = JsonReader.OooO00o.OooO00o("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final JsonReader.OooO00o f36858OooO0O0 = JsonReader.OooO00o.OooO00o("k");

    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:23:0x0096  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b0  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static p134o00OO0o.o000000O OooO00o(com.airbnb.lottie.parser.moshi.OooO00o oooO00o, com.airbnb.lottie.OooOO0 oooOO1) throws IOException {
        boolean z;
        p134o00OO0o.o0OO00O o0oo00o2;
        p134o00OO0o.o00000 o00000Var;
        p134o00OO0o.oo000o oo000oVarOooO0O0;
        List<o00OOO0O.OooO00o<V>> list;
        p134o00OO0o.oo000o oo000oVar;
        boolean z2 = oooO00o.Oooo0OO() == JsonReader.Token.BEGIN_OBJECT;
        if (z2) {
            oooO00o.OooO0OO();
        }
        p134o00OO0o.oo000o oo000oVar2 = null;
        p134o00OO0o.o0OO00O o0oo00o3 = null;
        p134o00OO0o.o00000 o00000VarOooO0O0 = null;
        p134o00OO0o.oo000o oo000oVarOooO0O1 = null;
        p134o00OO0o.oo000o oo000oVarOooO0O2 = null;
        p134o00OO0o.o0OOO0o o0ooo0oOooO00o = null;
        p134o00OO0o.o0ooOOo o0oooooOooO0OO = null;
        p134o00OO0o.oo000o oo000oVarOooO0O3 = null;
        p134o00OO0o.oo000o oo000oVarOooO0O4 = null;
        while (oooO00o.OooOo0O()) {
            switch (oooO00o.Oooo0oO(f36857OooO00o)) {
                case 0:
                    o0oo00o2 = o0oo00o3;
                    o00000Var = o00000VarOooO0O0;
                    oooO00o.OooO0OO();
                    while (oooO00o.OooOo0O()) {
                        if (oooO00o.Oooo0oO(f36858OooO0O0) != 0) {
                            oooO00o.Oooo0oo();
                            oooO00o.Oooo();
                        } else {
                            o0ooo0oOooO00o = OooO00o.OooO00o(oooO00o, oooOO1);
                        }
                    }
                    oooO00o.OooOOoo();
                    o0oo00o3 = o0oo00o2;
                    o00000VarOooO0O0 = o00000Var;
                    break;
                case 1:
                    o00000VarOooO0O0 = OooO00o.OooO0O0(oooO00o, oooOO1);
                    break;
                case 2:
                    o00000Var = o00000VarOooO0O0;
                    o0oo00o3 = new p134o00OO0o.o0OO00O(o00oO0o.OooO00o(oooO00o, oooOO1, 1.0f, o000000O.f36884OooO00o, false));
                    o00000VarOooO0O0 = o00000Var;
                    break;
                case 3:
                    oooOO1.OooO00o("Lottie doesn't support 3D layers.");
                    oo000oVarOooO0O0 = OooO0o.OooO0O0(oooO00o, oooOO1, false);
                    list = oo000oVarOooO0O0.f37312OooO00o;
                    if (list.isEmpty()) {
                        oo000oVar = oo000oVarOooO0O0;
                        o0oo00o2 = o0oo00o3;
                        o00000Var = o00000VarOooO0O0;
                        list.add((o00OOO0O.OooO00o<V>) new o00OOO0O.OooO00o(oooOO1, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(oooOO1.f11834OooOO0o)));
                    } else {
                        oo000oVar = oo000oVarOooO0O0;
                        o0oo00o2 = o0oo00o3;
                        o00000Var = o00000VarOooO0O0;
                        if (((o00OOO0O.OooO00o) list.get(0)).f37437OooO0O0 == 0) {
                            list.set(0, (o00OOO0O.OooO00o<V>) new o00OOO0O.OooO00o(oooOO1, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(oooOO1.f11834OooOO0o)));
                        }
                    }
                    oo000oVar2 = oo000oVar;
                    o0oo00o3 = o0oo00o2;
                    o00000VarOooO0O0 = o00000Var;
                    break;
                case 4:
                    oo000oVarOooO0O0 = OooO0o.OooO0O0(oooO00o, oooOO1, false);
                    list = oo000oVarOooO0O0.f37312OooO00o;
                    if (list.isEmpty()) {
                        oo000oVar = oo000oVarOooO0O0;
                        o0oo00o2 = o0oo00o3;
                        o00000Var = o00000VarOooO0O0;
                        list.add((o00OOO0O.OooO00o<V>) new o00OOO0O.OooO00o(oooOO1, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(oooOO1.f11834OooOO0o)));
                    } else {
                        oo000oVar = oo000oVarOooO0O0;
                        o0oo00o2 = o0oo00o3;
                        o00000Var = o00000VarOooO0O0;
                        if (((o00OOO0O.OooO00o) list.get(0)).f37437OooO0O0 == 0) {
                            list.set(0, (o00OOO0O.OooO00o<V>) new o00OOO0O.OooO00o(oooOO1, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(oooOO1.f11834OooOO0o)));
                        }
                    }
                    oo000oVar2 = oo000oVar;
                    o0oo00o3 = o0oo00o2;
                    o00000VarOooO0O0 = o00000Var;
                    break;
                case 5:
                    o0oooooOooO0OO = OooO0o.OooO0OO(oooO00o, oooOO1);
                    break;
                case 6:
                    oo000oVarOooO0O3 = OooO0o.OooO0O0(oooO00o, oooOO1, false);
                    break;
                case 7:
                    oo000oVarOooO0O4 = OooO0o.OooO0O0(oooO00o, oooOO1, false);
                    break;
                case 8:
                    oo000oVarOooO0O2 = OooO0o.OooO0O0(oooO00o, oooOO1, false);
                    break;
                case 9:
                    oo000oVarOooO0O1 = OooO0o.OooO0O0(oooO00o, oooOO1, false);
                    break;
                default:
                    oooO00o.Oooo0oo();
                    oooO00o.Oooo();
                    break;
            }
        }
        p134o00OO0o.o0OO00O o0oo00o4 = o0oo00o3;
        p134o00OO0o.o00000 o00000Var2 = o00000VarOooO0O0;
        if (z2) {
            oooO00o.OooOOoo();
        }
        p134o00OO0o.o0OOO0o o0ooo0o2 = o0ooo0oOooO00o == null || (o0ooo0oOooO00o.isStatic() && o0ooo0oOooO00o.f37315OooO00o.get(0).f37437OooO0O0.equals(0.0f, 0.0f)) ? null : o0ooo0oOooO00o;
        p134o00OO0o.o00000 o00000Var3 = o00000Var2 == 0 || (!(o00000Var2 instanceof p134o00OO0o.o0O0O00) && o00000Var2.isStatic() && ((PointF) ((o00OOO0O.OooO00o) o00000Var2.OooO0O0().get(0)).f37437OooO0O0).equals(0.0f, 0.0f)) ? null : o00000Var2;
        if (oo000oVar2 == null || (oo000oVar2.isStatic() && ((Float) ((o00OOO0O.OooO00o) oo000oVar2.f37312OooO00o.get(0)).f37437OooO0O0).floatValue() == 0.0f)) {
            oo000oVar2 = null;
        }
        if (o0oo00o4 == null) {
            z = true;
        } else {
            if (o0oo00o4.isStatic()) {
                o00OOO0O.OooO0o oooO0o = (o00OOO0O.OooO0o) ((o00OOO0O.OooO00o) o0oo00o4.f37312OooO00o.get(0)).f37437OooO0O0;
                if (oooO0o.f37455OooO00o == 1.0f && oooO0o.f37456OooO0O0 == 1.0f) {
                    z = true;
                }
            }
            z = false;
        }
        p134o00OO0o.o0OO00O o0oo00o5 = z ? null : o0oo00o4;
        if (oo000oVarOooO0O2 == null || (oo000oVarOooO0O2.isStatic() && ((Float) ((o00OOO0O.OooO00o) oo000oVarOooO0O2.f37312OooO00o.get(0)).f37437OooO0O0).floatValue() == 0.0f)) {
            oo000oVarOooO0O2 = null;
        }
        return new p134o00OO0o.o000000O(o0ooo0o2, o00000Var3, o0oo00o5, oo000oVar2, o0oooooOooO0OO, oo000oVarOooO0O3, oo000oVarOooO0O4, oo000oVarOooO0O2, oo000oVarOooO0O1 == null || (oo000oVarOooO0O1.isStatic() && (((Float) ((o00OOO0O.OooO00o) oo000oVarOooO0O1.f37312OooO00o.get(0)).f37437OooO0O0).floatValue() > 0.0f ? 1 : (((Float) ((o00OOO0O.OooO00o) oo000oVarOooO0O1.f37312OooO00o.get(0)).f37437OooO0O0).floatValue() == 0.0f ? 0 : -1)) == 0) ? null : oo000oVarOooO0O1);
    }
}

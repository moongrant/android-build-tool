package p127o00O0oO;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.OooOO0O;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.umeng.analytics.pro.ak;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.IOException;
import p123o00O0o0.OooOOO;
import p123o00O0o0.OooOOOO;
import p123o00O0o0.OooOo;
import p123o00O0o0.Oooo0;
import p123o00O0o0.o00O0O;
import p123o00O0o0.o00Oo0;
import p131o00O0oo0.o00000;
import p131o00O0oo0.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final JsonReader.OooO00o f31123OooO00o = JsonReader.OooO00o.OooO00o(ak.av, ak.ax, ak.aB, "rz", "r", "o", "so", "eo", "sk", "sa");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final JsonReader.OooO00o f31124OooO0O0 = JsonReader.OooO00o.OooO00o("k");

    /* JADX WARN: Code duplicated, block: B:113:0x0219  */
    /* JADX WARN: Code duplicated, block: B:114:0x021c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:23:0x009b  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c5  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static o00O0O OooO00o(JsonReader jsonReader, OooOO0O oooOO0O) throws IOException {
        boolean z;
        p123o00O0o0.OooOO0O oooOO0O2;
        boolean z2;
        p123o00O0o0.OooOO0O oooOO0O3;
        OooOo oooOo;
        p123o00O0o0.OooOO0O oooOO0O4;
        o00Oo0<PointF, PointF> o00oo1;
        p123o00O0o0.OooOO0O oooOO0OOooO0OO;
        p123o00O0o0.OooOO0O oooOO0O5;
        boolean z3 = false;
        boolean z4 = jsonReader.OooOoo() == JsonReader.Token.BEGIN_OBJECT;
        if (z4) {
            jsonReader.OooO0O0();
        }
        p123o00O0o0.OooOO0O oooOO0O6 = null;
        OooOo oooOo2 = null;
        o00Oo0<PointF, PointF> o00oo0OooO0O0 = null;
        p123o00O0o0.OooOO0O oooOO0OOooO0OO2 = null;
        p123o00O0o0.OooOO0O oooOO0OOooO0OO3 = null;
        OooOOOO oooOOOOOooO00o = null;
        OooOOO oooOOOOooO0Oo = null;
        p123o00O0o0.OooOO0O oooOO0OOooO0OO4 = null;
        p123o00O0o0.OooOO0O oooOO0OOooO0OO5 = null;
        while (jsonReader.OooOOO()) {
            switch (jsonReader.Oooo0(f31123OooO00o)) {
                case 0:
                    oooOo = oooOo2;
                    oooOO0O4 = oooOO0OOooO0OO2;
                    o00oo1 = o00oo0OooO0O0;
                    jsonReader.OooO0O0();
                    while (jsonReader.OooOOO()) {
                        if (jsonReader.Oooo0(f31124OooO0O0) != 0) {
                            jsonReader.Oooo0OO();
                            jsonReader.Oooo0o();
                        } else {
                            oooOOOOOooO00o = o0OOO0o.OooO00o(jsonReader, oooOO0O);
                        }
                    }
                    jsonReader.OooO0o();
                    oooOo2 = oooOo;
                    o00oo0OooO0O0 = o00oo1;
                    oooOO0OOooO0OO2 = oooOO0O4;
                    z3 = false;
                    break;
                case 1:
                    oooOO0O4 = oooOO0OOooO0OO2;
                    o00oo0OooO0O0 = o0OOO0o.OooO0O0(jsonReader, oooOO0O);
                    oooOO0OOooO0OO2 = oooOO0O4;
                    z3 = false;
                    break;
                case 2:
                    oooOO0O4 = oooOO0OOooO0OO2;
                    o00oo1 = o00oo0OooO0O0;
                    oooOo2 = new OooOo(oo0o0Oo.OooO00o(jsonReader, oooOO0O, o000OO0O.f31116OooO00o));
                    o00oo0OooO0O0 = o00oo1;
                    oooOO0OOooO0OO2 = oooOO0O4;
                    z3 = false;
                    break;
                case 3:
                    oooOO0O.OooO00o("Lottie doesn't support 3D layers.");
                    oooOO0OOooO0OO = oo0o0Oo.OooO0OO(jsonReader, oooOO0O, z3);
                    if (oooOO0OOooO0OO.f30971OooO00o.isEmpty()) {
                        oooOO0O5 = oooOO0OOooO0OO;
                        oooOo = oooOo2;
                        oooOO0O4 = oooOO0OOooO0OO2;
                        o00oo1 = o00oo0OooO0O0;
                        oooOO0OOooO0OO.f30971OooO00o.add((o000OOo<V>) new o000OOo(oooOO0O, Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), (Interpolator) null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, Float.valueOf(oooOO0O.f10051OooOO0o)));
                    } else {
                        oooOO0O5 = oooOO0OOooO0OO;
                        oooOo = oooOo2;
                        oooOO0O4 = oooOO0OOooO0OO2;
                        o00oo1 = o00oo0OooO0O0;
                        if (((o000OOo) oooOO0O5.f30971OooO00o.get(0)).f31157OooO0O0 == 0) {
                            oooOO0O5.f30971OooO00o.set(0, (o000OOo<V>) new o000OOo(oooOO0O, Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), (Interpolator) null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, Float.valueOf(oooOO0O.f10051OooOO0o)));
                        }
                    }
                    oooOO0O6 = oooOO0O5;
                    oooOo2 = oooOo;
                    o00oo0OooO0O0 = o00oo1;
                    oooOO0OOooO0OO2 = oooOO0O4;
                    z3 = false;
                    break;
                case 4:
                    oooOO0OOooO0OO = oo0o0Oo.OooO0OO(jsonReader, oooOO0O, z3);
                    if (oooOO0OOooO0OO.f30971OooO00o.isEmpty()) {
                        oooOO0O5 = oooOO0OOooO0OO;
                        oooOo = oooOo2;
                        oooOO0O4 = oooOO0OOooO0OO2;
                        o00oo1 = o00oo0OooO0O0;
                        oooOO0OOooO0OO.f30971OooO00o.add((o000OOo<V>) new o000OOo(oooOO0O, Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), (Interpolator) null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, Float.valueOf(oooOO0O.f10051OooOO0o)));
                    } else {
                        oooOO0O5 = oooOO0OOooO0OO;
                        oooOo = oooOo2;
                        oooOO0O4 = oooOO0OOooO0OO2;
                        o00oo1 = o00oo0OooO0O0;
                        if (((o000OOo) oooOO0O5.f30971OooO00o.get(0)).f31157OooO0O0 == 0) {
                            oooOO0O5.f30971OooO00o.set(0, (o000OOo<V>) new o000OOo(oooOO0O, Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), (Interpolator) null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, Float.valueOf(oooOO0O.f10051OooOO0o)));
                        }
                    }
                    oooOO0O6 = oooOO0O5;
                    oooOo2 = oooOo;
                    o00oo0OooO0O0 = o00oo1;
                    oooOO0OOooO0OO2 = oooOO0O4;
                    z3 = false;
                    break;
                case 5:
                    oooOOOOooO0Oo = oo0o0Oo.OooO0Oo(jsonReader, oooOO0O);
                    break;
                case 6:
                    oooOO0OOooO0OO4 = oo0o0Oo.OooO0OO(jsonReader, oooOO0O, z3);
                    break;
                case 7:
                    oooOO0OOooO0OO5 = oo0o0Oo.OooO0OO(jsonReader, oooOO0O, z3);
                    break;
                case 8:
                    oooOO0OOooO0OO3 = oo0o0Oo.OooO0OO(jsonReader, oooOO0O, z3);
                    break;
                case 9:
                    oooOO0OOooO0OO2 = oo0o0Oo.OooO0OO(jsonReader, oooOO0O, z3);
                    break;
                default:
                    oooOO0O4 = oooOO0OOooO0OO2;
                    jsonReader.Oooo0OO();
                    jsonReader.Oooo0o();
                    oooOO0OOooO0OO2 = oooOO0O4;
                    z3 = false;
                    break;
            }
        }
        OooOo oooOo3 = oooOo2;
        p123o00O0o0.OooOO0O oooOO0O7 = oooOO0OOooO0OO2;
        o00Oo0<PointF, PointF> o00oo2 = o00oo0OooO0O0;
        if (z4) {
            jsonReader.OooO0o();
        }
        if (oooOOOOOooO00o == null || (oooOOOOOooO00o.isStatic() && oooOOOOOooO00o.f30959OooO00o.get(0).f31157OooO0O0.equals(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE))) {
            oooOOOOOooO00o = null;
        }
        if (o00oo2 == null || (!(o00oo2 instanceof Oooo0) && o00oo2.isStatic() && o00oo2.OooO0O0().get(0).f31157OooO0O0.equals(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE))) {
            o00oo2 = null;
        }
        p123o00O0o0.OooOO0O oooOO0O8 = oooOO0O6 == null || (oooOO0O6.isStatic() && (((Float) ((o000OOo) oooOO0O6.f30971OooO00o.get(0)).f31157OooO0O0).floatValue() > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 1 : (((Float) ((o000OOo) oooOO0O6.f30971OooO00o.get(0)).f31157OooO0O0).floatValue() == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 0 : -1)) == 0) ? null : oooOO0O6;
        if (oooOo3 != 0) {
            if (oooOo3.isStatic()) {
                o00000 o00000Var = (o00000) ((o000OOo) oooOo3.f30971OooO00o.get(0)).f31157OooO0O0;
                z = (o00000Var.f31149OooO00o > 1.0f ? 1 : (o00000Var.f31149OooO00o == 1.0f ? 0 : -1)) == 0 && (o00000Var.f31150OooO0O0 > 1.0f ? 1 : (o00000Var.f31150OooO0O0 == 1.0f ? 0 : -1)) == 0;
            }
        }
        OooOo oooOo4 = z ? null : oooOo3;
        if (oooOO0OOooO0OO3 == null || (oooOO0OOooO0OO3.isStatic() && ((Float) ((o000OOo) oooOO0OOooO0OO3.f30971OooO00o.get(0)).f31157OooO0O0).floatValue() == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
            oooOO0OOooO0OO3 = null;
        }
        if (oooOO0O7 != null) {
            oooOO0O2 = oooOO0O7;
            z2 = oooOO0O7.isStatic() && ((Float) ((o000OOo) oooOO0O2.f30971OooO00o.get(0)).f31157OooO0O0).floatValue() == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            if (z2) {
                oooOO0O3 = null;
            } else {
                oooOO0O3 = oooOO0O2;
            }
            return new o00O0O(oooOOOOOooO00o, o00oo2, oooOo4, oooOO0O8, oooOOOOooO0Oo, oooOO0OOooO0OO4, oooOO0OOooO0OO5, oooOO0OOooO0OO3, oooOO0O3);
        }
        oooOO0O2 = oooOO0O7;
        if (z2) {
            oooOO0O3 = null;
        } else {
            oooOO0O3 = oooOO0O2;
        }
        return new o00O0O(oooOOOOOooO00o, o00oo2, oooOo4, oooOO0O8, oooOOOOooO0Oo, oooOO0OOooO0OO4, oooOO0OOooO0OO5, oooOO0OOooO0OO3, oooOO0O3);
    }
}

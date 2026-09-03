package o0OO00O;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;
import p340o0OOO0o.OooO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f43000OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ConstraintWidget f43001OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f43002OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f43003OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f43004OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f43005OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f43006OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f43007OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f43008OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f43009OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f43010OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f43011OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f43012OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f43013OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f43014OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f43015OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f43016OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final float f43017OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final HashMap<String, OooO0o> f43018OooOOoo;

    public OooO0O0() {
        this.f43001OooO00o = null;
        this.f43002OooO0O0 = 0;
        this.f43003OooO0OO = 0;
        this.f43004OooO0Oo = 0;
        this.f43006OooO0o0 = 0;
        this.f43005OooO0o = Float.NaN;
        this.f43007OooO0oO = Float.NaN;
        this.f43008OooO0oo = Float.NaN;
        this.f43000OooO = Float.NaN;
        this.f43009OooOO0 = Float.NaN;
        this.f43010OooOO0O = Float.NaN;
        this.f43011OooOO0o = Float.NaN;
        this.f43013OooOOO0 = Float.NaN;
        this.f43012OooOOO = Float.NaN;
        this.f43014OooOOOO = Float.NaN;
        this.f43015OooOOOo = Float.NaN;
        this.f43017OooOOo0 = Float.NaN;
        this.f43016OooOOo = 0;
        this.f43018OooOOoo = new HashMap<>();
    }

    public static void OooO00o(StringBuilder sb, String str, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        sb.append(str);
        sb.append(": ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void OooO0O0(StringBuilder sb, String str, int i) {
        sb.append(str);
        sb.append(": ");
        sb.append(i);
        sb.append(",\n");
    }

    public final void OooO0OO(OooO0O0 oooO0O0) {
        this.f43005OooO0o = oooO0O0.f43005OooO0o;
        this.f43007OooO0oO = oooO0O0.f43007OooO0oO;
        this.f43008OooO0oo = oooO0O0.f43008OooO0oo;
        this.f43000OooO = oooO0O0.f43000OooO;
        this.f43009OooOO0 = oooO0O0.f43009OooOO0;
        this.f43010OooOO0O = oooO0O0.f43010OooOO0O;
        this.f43011OooOO0o = oooO0O0.f43011OooOO0o;
        this.f43013OooOOO0 = oooO0O0.f43013OooOOO0;
        this.f43012OooOOO = oooO0O0.f43012OooOOO;
        this.f43014OooOOOO = oooO0O0.f43014OooOOOO;
        this.f43015OooOOOo = oooO0O0.f43015OooOOOo;
        this.f43016OooOOo = oooO0O0.f43016OooOOo;
        HashMap<String, OooO0o> map = this.f43018OooOOoo;
        map.clear();
        for (OooO0o oooO0o : oooO0O0.f43018OooOOoo.values()) {
            map.put(oooO0o.f43602OooO00o, new OooO0o(oooO0o));
        }
    }

    public OooO0O0(ConstraintWidget constraintWidget) {
        this.f43001OooO00o = null;
        this.f43002OooO0O0 = 0;
        this.f43003OooO0OO = 0;
        this.f43004OooO0Oo = 0;
        this.f43006OooO0o0 = 0;
        this.f43005OooO0o = Float.NaN;
        this.f43007OooO0oO = Float.NaN;
        this.f43008OooO0oo = Float.NaN;
        this.f43000OooO = Float.NaN;
        this.f43009OooOO0 = Float.NaN;
        this.f43010OooOO0O = Float.NaN;
        this.f43011OooOO0o = Float.NaN;
        this.f43013OooOOO0 = Float.NaN;
        this.f43012OooOOO = Float.NaN;
        this.f43014OooOOOO = Float.NaN;
        this.f43015OooOOOo = Float.NaN;
        this.f43017OooOOo0 = Float.NaN;
        this.f43016OooOOo = 0;
        this.f43018OooOOoo = new HashMap<>();
        this.f43001OooO00o = constraintWidget;
    }

    public OooO0O0(OooO0O0 oooO0O0) {
        this.f43001OooO00o = null;
        this.f43002OooO0O0 = 0;
        this.f43003OooO0OO = 0;
        this.f43004OooO0Oo = 0;
        this.f43006OooO0o0 = 0;
        this.f43005OooO0o = Float.NaN;
        this.f43007OooO0oO = Float.NaN;
        this.f43008OooO0oo = Float.NaN;
        this.f43000OooO = Float.NaN;
        this.f43009OooOO0 = Float.NaN;
        this.f43010OooOO0O = Float.NaN;
        this.f43011OooOO0o = Float.NaN;
        this.f43013OooOOO0 = Float.NaN;
        this.f43012OooOOO = Float.NaN;
        this.f43014OooOOOO = Float.NaN;
        this.f43015OooOOOo = Float.NaN;
        this.f43017OooOOo0 = Float.NaN;
        this.f43016OooOOo = 0;
        this.f43018OooOOoo = new HashMap<>();
        this.f43001OooO00o = oooO0O0.f43001OooO00o;
        this.f43002OooO0O0 = oooO0O0.f43002OooO0O0;
        this.f43003OooO0OO = oooO0O0.f43003OooO0OO;
        this.f43004OooO0Oo = oooO0O0.f43004OooO0Oo;
        this.f43006OooO0o0 = oooO0O0.f43006OooO0o0;
        OooO0OO(oooO0O0);
    }
}

package o0OO00O;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;
import p343o0OOO0o.OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f42267OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ConstraintWidget f42268OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f42269OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f42270OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f42271OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f42272OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f42273OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f42274OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f42275OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f42276OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f42277OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f42278OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f42279OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f42280OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f42281OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f42282OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f42283OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final float f42284OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final HashMap<String, OooO0OO> f42285OooOOoo;

    public OooO0O0() {
        this.f42268OooO00o = null;
        this.f42269OooO0O0 = 0;
        this.f42270OooO0OO = 0;
        this.f42271OooO0Oo = 0;
        this.f42273OooO0o0 = 0;
        this.f42272OooO0o = Float.NaN;
        this.f42274OooO0oO = Float.NaN;
        this.f42275OooO0oo = Float.NaN;
        this.f42267OooO = Float.NaN;
        this.f42276OooOO0 = Float.NaN;
        this.f42277OooOO0O = Float.NaN;
        this.f42278OooOO0o = Float.NaN;
        this.f42280OooOOO0 = Float.NaN;
        this.f42279OooOOO = Float.NaN;
        this.f42281OooOOOO = Float.NaN;
        this.f42282OooOOOo = Float.NaN;
        this.f42284OooOOo0 = Float.NaN;
        this.f42283OooOOo = 0;
        this.f42285OooOOoo = new HashMap<>();
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
        this.f42272OooO0o = oooO0O0.f42272OooO0o;
        this.f42274OooO0oO = oooO0O0.f42274OooO0oO;
        this.f42275OooO0oo = oooO0O0.f42275OooO0oo;
        this.f42267OooO = oooO0O0.f42267OooO;
        this.f42276OooOO0 = oooO0O0.f42276OooOO0;
        this.f42277OooOO0O = oooO0O0.f42277OooOO0O;
        this.f42278OooOO0o = oooO0O0.f42278OooOO0o;
        this.f42280OooOOO0 = oooO0O0.f42280OooOOO0;
        this.f42279OooOOO = oooO0O0.f42279OooOOO;
        this.f42281OooOOOO = oooO0O0.f42281OooOOOO;
        this.f42282OooOOOo = oooO0O0.f42282OooOOOo;
        this.f42283OooOOo = oooO0O0.f42283OooOOo;
        HashMap<String, OooO0OO> map = this.f42285OooOOoo;
        map.clear();
        for (OooO0OO oooO0OO : oooO0O0.f42285OooOOoo.values()) {
            map.put(oooO0OO.f42787OooO00o, new OooO0OO(oooO0OO));
        }
    }

    public OooO0O0(ConstraintWidget constraintWidget) {
        this.f42268OooO00o = null;
        this.f42269OooO0O0 = 0;
        this.f42270OooO0OO = 0;
        this.f42271OooO0Oo = 0;
        this.f42273OooO0o0 = 0;
        this.f42272OooO0o = Float.NaN;
        this.f42274OooO0oO = Float.NaN;
        this.f42275OooO0oo = Float.NaN;
        this.f42267OooO = Float.NaN;
        this.f42276OooOO0 = Float.NaN;
        this.f42277OooOO0O = Float.NaN;
        this.f42278OooOO0o = Float.NaN;
        this.f42280OooOOO0 = Float.NaN;
        this.f42279OooOOO = Float.NaN;
        this.f42281OooOOOO = Float.NaN;
        this.f42282OooOOOo = Float.NaN;
        this.f42284OooOOo0 = Float.NaN;
        this.f42283OooOOo = 0;
        this.f42285OooOOoo = new HashMap<>();
        this.f42268OooO00o = constraintWidget;
    }

    public OooO0O0(OooO0O0 oooO0O0) {
        this.f42268OooO00o = null;
        this.f42269OooO0O0 = 0;
        this.f42270OooO0OO = 0;
        this.f42271OooO0Oo = 0;
        this.f42273OooO0o0 = 0;
        this.f42272OooO0o = Float.NaN;
        this.f42274OooO0oO = Float.NaN;
        this.f42275OooO0oo = Float.NaN;
        this.f42267OooO = Float.NaN;
        this.f42276OooOO0 = Float.NaN;
        this.f42277OooOO0O = Float.NaN;
        this.f42278OooOO0o = Float.NaN;
        this.f42280OooOOO0 = Float.NaN;
        this.f42279OooOOO = Float.NaN;
        this.f42281OooOOOO = Float.NaN;
        this.f42282OooOOOo = Float.NaN;
        this.f42284OooOOo0 = Float.NaN;
        this.f42283OooOOo = 0;
        this.f42285OooOOoo = new HashMap<>();
        this.f42268OooO00o = oooO0O0.f42268OooO00o;
        this.f42269OooO0O0 = oooO0O0.f42269OooO0O0;
        this.f42270OooO0OO = oooO0O0.f42270OooO0OO;
        this.f42271OooO0Oo = oooO0O0.f42271OooO0Oo;
        this.f42273OooO0o0 = oooO0O0.f42273OooO0o0;
        OooO0OO(oooO0O0);
    }
}

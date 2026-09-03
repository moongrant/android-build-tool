package p056o0000Oo;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;
import p055o0000OOo.OooO0o;

/* JADX INFO: loaded from: classes.dex */
public final class o0000Ooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f27527OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public ConstraintWidget f27528OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f27529OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f27530OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f27531OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f27532OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f27533OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f27534OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f27535OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f27536OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f27537OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f27538OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f27539OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f27540OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f27541OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f27542OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final HashMap<String, OooO0o> f27543OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f27544OooOOo0;

    public o0000Ooo() {
        this.f27528OooO00o = null;
        this.f27529OooO0O0 = 0;
        this.f27530OooO0OO = 0;
        this.f27531OooO0Oo = 0;
        this.f27533OooO0o0 = 0;
        this.f27532OooO0o = Float.NaN;
        this.f27534OooO0oO = Float.NaN;
        this.f27535OooO0oo = Float.NaN;
        this.f27527OooO = Float.NaN;
        this.f27536OooOO0 = Float.NaN;
        this.f27537OooOO0O = Float.NaN;
        this.f27538OooOO0o = Float.NaN;
        this.f27540OooOOO0 = Float.NaN;
        this.f27539OooOOO = Float.NaN;
        this.f27541OooOOOO = Float.NaN;
        this.f27542OooOOOo = Float.NaN;
        this.f27544OooOOo0 = 0;
        this.f27543OooOOo = new HashMap<>();
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

    public final void OooO0OO(o0000Ooo o0000ooo) {
        this.f27532OooO0o = o0000ooo.f27532OooO0o;
        this.f27534OooO0oO = o0000ooo.f27534OooO0oO;
        this.f27535OooO0oo = o0000ooo.f27535OooO0oo;
        this.f27527OooO = o0000ooo.f27527OooO;
        this.f27536OooOO0 = o0000ooo.f27536OooOO0;
        this.f27537OooOO0O = o0000ooo.f27537OooOO0O;
        this.f27538OooOO0o = o0000ooo.f27538OooOO0o;
        this.f27540OooOOO0 = o0000ooo.f27540OooOOO0;
        this.f27539OooOOO = o0000ooo.f27539OooOOO;
        this.f27541OooOOOO = o0000ooo.f27541OooOOOO;
        this.f27542OooOOOo = o0000ooo.f27542OooOOOo;
        this.f27544OooOOo0 = o0000ooo.f27544OooOOo0;
        this.f27543OooOOo.clear();
        for (OooO0o oooO0o : o0000ooo.f27543OooOOo.values()) {
            this.f27543OooOOo.put(oooO0o.f27521OooO00o, new OooO0o(oooO0o));
        }
    }

    public o0000Ooo(ConstraintWidget constraintWidget) {
        this.f27528OooO00o = null;
        this.f27529OooO0O0 = 0;
        this.f27530OooO0OO = 0;
        this.f27531OooO0Oo = 0;
        this.f27533OooO0o0 = 0;
        this.f27532OooO0o = Float.NaN;
        this.f27534OooO0oO = Float.NaN;
        this.f27535OooO0oo = Float.NaN;
        this.f27527OooO = Float.NaN;
        this.f27536OooOO0 = Float.NaN;
        this.f27537OooOO0O = Float.NaN;
        this.f27538OooOO0o = Float.NaN;
        this.f27540OooOOO0 = Float.NaN;
        this.f27539OooOOO = Float.NaN;
        this.f27541OooOOOO = Float.NaN;
        this.f27542OooOOOo = Float.NaN;
        this.f27544OooOOo0 = 0;
        this.f27543OooOOo = new HashMap<>();
        this.f27528OooO00o = constraintWidget;
    }

    public o0000Ooo(o0000Ooo o0000ooo) {
        this.f27528OooO00o = null;
        this.f27529OooO0O0 = 0;
        this.f27530OooO0OO = 0;
        this.f27531OooO0Oo = 0;
        this.f27533OooO0o0 = 0;
        this.f27532OooO0o = Float.NaN;
        this.f27534OooO0oO = Float.NaN;
        this.f27535OooO0oo = Float.NaN;
        this.f27527OooO = Float.NaN;
        this.f27536OooOO0 = Float.NaN;
        this.f27537OooOO0O = Float.NaN;
        this.f27538OooOO0o = Float.NaN;
        this.f27540OooOOO0 = Float.NaN;
        this.f27539OooOOO = Float.NaN;
        this.f27541OooOOOO = Float.NaN;
        this.f27542OooOOOo = Float.NaN;
        this.f27544OooOOo0 = 0;
        this.f27543OooOOo = new HashMap<>();
        this.f27528OooO00o = o0000ooo.f27528OooO00o;
        this.f27529OooO0O0 = o0000ooo.f27529OooO0O0;
        this.f27530OooO0OO = o0000ooo.f27530OooO0OO;
        this.f27531OooO0Oo = o0000ooo.f27531OooO0Oo;
        this.f27533OooO0o0 = o0000ooo.f27533OooO0o0;
        OooO0OO(o0000ooo);
    }
}

package o000000O;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p418o0Oo0oo.oO00Oo00;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo implements Comparable<OooOo> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f33306OooO0o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f33305OooO0Oo = 1.0f;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f33307OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f33308OooO0oO = 0.0f;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f33309OooO0oo = 0.0f;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f33304OooO = 0.0f;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f33310OooOO0 = 0.0f;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f33311OooOO0O = 1.0f;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f33312OooOO0o = 1.0f;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f33314OooOOO0 = Float.NaN;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f33313OooOOO = Float.NaN;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f33315OooOOOO = 0.0f;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f33316OooOOOo = 0.0f;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f33318OooOOo0 = 0.0f;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f33317OooOOo = Float.NaN;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f33319OooOOoo = Float.NaN;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final LinkedHashMap<String, ConstraintAttribute> f33320OooOo00 = new LinkedHashMap<>();

    public static boolean OooO0OO(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:64:0x00d3  */
    public final void OooO00o(int i, HashMap map) {
        byte b;
        for (String str : map.keySet()) {
            o000000.OooO0o oooO0o = (o000000.OooO0o) map.get(str);
            str.getClass();
            switch (str) {
                case "rotationX":
                    b = 0;
                    break;
                case "rotationY":
                    b = 1;
                    break;
                case "translationX":
                    b = 2;
                    break;
                case "translationY":
                    b = 3;
                    break;
                case "translationZ":
                    b = 4;
                    break;
                case "progress":
                    b = 5;
                    break;
                case "scaleX":
                    b = 6;
                    break;
                case "scaleY":
                    b = 7;
                    break;
                case "transformPivotX":
                    b = 8;
                    break;
                case "transformPivotY":
                    b = 9;
                    break;
                case "rotation":
                    b = 10;
                    break;
                case "elevation":
                    b = 11;
                    break;
                case "transitionPathRotate":
                    b = 12;
                    break;
                case "alpha":
                    b = 13;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    oooO0o.OooO0O0(Float.isNaN(this.f33304OooO) ? 0.0f : this.f33304OooO, i);
                    break;
                case 1:
                    oooO0o.OooO0O0(Float.isNaN(this.f33310OooOO0) ? 0.0f : this.f33310OooOO0, i);
                    break;
                case 2:
                    oooO0o.OooO0O0(Float.isNaN(this.f33315OooOOOO) ? 0.0f : this.f33315OooOOOO, i);
                    break;
                case 3:
                    oooO0o.OooO0O0(Float.isNaN(this.f33316OooOOOo) ? 0.0f : this.f33316OooOOOo, i);
                    break;
                case 4:
                    oooO0o.OooO0O0(Float.isNaN(this.f33318OooOOo0) ? 0.0f : this.f33318OooOOo0, i);
                    break;
                case 5:
                    oooO0o.OooO0O0(Float.isNaN(this.f33319OooOOoo) ? 0.0f : this.f33319OooOOoo, i);
                    break;
                case 6:
                    oooO0o.OooO0O0(Float.isNaN(this.f33311OooOO0O) ? 1.0f : this.f33311OooOO0O, i);
                    break;
                case 7:
                    oooO0o.OooO0O0(Float.isNaN(this.f33312OooOO0o) ? 1.0f : this.f33312OooOO0o, i);
                    break;
                case 8:
                    oooO0o.OooO0O0(Float.isNaN(this.f33314OooOOO0) ? 0.0f : this.f33314OooOOO0, i);
                    break;
                case 9:
                    oooO0o.OooO0O0(Float.isNaN(this.f33313OooOOO) ? 0.0f : this.f33313OooOOO, i);
                    break;
                case 10:
                    oooO0o.OooO0O0(Float.isNaN(this.f33309OooO0oo) ? 0.0f : this.f33309OooO0oo, i);
                    break;
                case 11:
                    oooO0o.OooO0O0(Float.isNaN(this.f33308OooO0oO) ? 0.0f : this.f33308OooO0oO, i);
                    break;
                case 12:
                    oooO0o.OooO0O0(Float.isNaN(this.f33317OooOOo) ? 0.0f : this.f33317OooOOo, i);
                    break;
                case 13:
                    oooO0o.OooO0O0(Float.isNaN(this.f33305OooO0Oo) ? 1.0f : this.f33305OooO0Oo, i);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        LinkedHashMap<String, ConstraintAttribute> linkedHashMap = this.f33320OooOo00;
                        if (linkedHashMap.containsKey(str2)) {
                            ConstraintAttribute constraintAttribute = linkedHashMap.get(str2);
                            if (oooO0o instanceof o000000.OooO0o.OooO0O0) {
                                ((o000000.OooO0o.OooO0O0) oooO0o).f33230OooO0o.append(i, constraintAttribute);
                            } else {
                                Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i + ", value" + constraintAttribute.OooO00o() + oooO0o);
                            }
                        }
                    } else {
                        Log.e("MotionPaths", "UNKNOWN spline ".concat(str));
                    }
                    break;
            }
        }
    }

    public final void OooO0O0(View view) {
        this.f33306OooO0o = view.getVisibility();
        this.f33305OooO0Oo = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f33308OooO0oO = view.getElevation();
        this.f33309OooO0oo = view.getRotation();
        this.f33304OooO = view.getRotationX();
        this.f33310OooOO0 = view.getRotationY();
        this.f33311OooOO0O = view.getScaleX();
        this.f33312OooOO0o = view.getScaleY();
        this.f33314OooOOO0 = view.getPivotX();
        this.f33313OooOOO = view.getPivotY();
        this.f33315OooOOOO = view.getTranslationX();
        this.f33316OooOOOo = view.getTranslationY();
        this.f33318OooOOo0 = view.getTranslationZ();
    }

    public final void OooO0Oo(Rect rect, androidx.constraintlayout.widget.OooO0O0 oooO0O0, int i, int i2) {
        rect.width();
        rect.height();
        androidx.constraintlayout.widget.OooO0O0.OooO00o oooO00oOooO0oo = oooO0O0.OooO0oo(i2);
        androidx.constraintlayout.widget.OooO0O0.OooO0o oooO0o = oooO00oOooO0oo.f5066OooO0OO;
        int i3 = oooO0o.f5169OooO0OO;
        this.f33307OooO0o0 = i3;
        int i4 = oooO0o.f5168OooO0O0;
        this.f33306OooO0o = i4;
        this.f33305OooO0Oo = (i4 == 0 || i3 != 0) ? oooO0o.f5170OooO0Oo : 0.0f;
        androidx.constraintlayout.widget.OooO0O0.OooO oooO = oooO00oOooO0oo.f5068OooO0o;
        boolean z = oooO.f5063OooOOO0;
        this.f33308OooO0oO = oooO.f5062OooOOO;
        this.f33309OooO0oo = oooO.f5052OooO0O0;
        this.f33304OooO = oooO.f5053OooO0OO;
        this.f33310OooOO0 = oooO.f5054OooO0Oo;
        this.f33311OooOO0O = oooO.f5056OooO0o0;
        this.f33312OooOO0o = oooO.f5055OooO0o;
        this.f33314OooOOO0 = oooO.f5057OooO0oO;
        this.f33313OooOOO = oooO.f5058OooO0oo;
        this.f33315OooOOOO = oooO.f5059OooOO0;
        this.f33316OooOOOo = oooO.f5060OooOO0O;
        this.f33318OooOOo0 = oooO.f5061OooOO0o;
        androidx.constraintlayout.widget.OooO0O0.OooO0OO oooO0OO = oooO00oOooO0oo.f5067OooO0Oo;
        oO00Oo00.OooO0OO(oooO0OO.f5158OooO0Oo);
        this.f33317OooOOo = oooO0OO.f5162OooO0oo;
        this.f33319OooOOoo = oooO00oOooO0oo.f5066OooO0OO.f5171OooO0o0;
        Iterator<String> it = oooO00oOooO0oo.f5070OooO0oO.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            ConstraintAttribute constraintAttribute = oooO00oOooO0oo.f5070OooO0oO.get(next);
            constraintAttribute.getClass();
            int i5 = ConstraintAttribute.OooO00o.f4922OooO00o[constraintAttribute.f4916OooO0OO.ordinal()];
            if ((i5 == 1 || i5 == 2 || i5 == 3) ? false : true) {
                this.f33320OooOo00.put(next, constraintAttribute);
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f = this.f33309OooO0oo + 90.0f;
            this.f33309OooO0oo = f;
            if (f > 180.0f) {
                this.f33309OooO0oo = f - 360.0f;
                return;
            }
            return;
        }
        this.f33309OooO0oo -= 90.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(OooOo oooOo) {
        oooOo.getClass();
        return Float.compare(0.0f, 0.0f);
    }
}

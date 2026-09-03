package o000000O;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p416o0Oo0oo.oO00Oo00;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo implements Comparable<OooOo> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f33309OooO0o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f33308OooO0Oo = 1.0f;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f33310OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f33311OooO0oO = 0.0f;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f33312OooO0oo = 0.0f;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f33307OooO = 0.0f;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f33313OooOO0 = 0.0f;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f33314OooOO0O = 1.0f;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f33315OooOO0o = 1.0f;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f33317OooOOO0 = Float.NaN;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f33316OooOOO = Float.NaN;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f33318OooOOOO = 0.0f;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f33319OooOOOo = 0.0f;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f33321OooOOo0 = 0.0f;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f33320OooOOo = Float.NaN;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f33322OooOOoo = Float.NaN;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final LinkedHashMap<String, ConstraintAttribute> f33323OooOo00 = new LinkedHashMap<>();

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
                    oooO0o.OooO0O0(Float.isNaN(this.f33307OooO) ? 0.0f : this.f33307OooO, i);
                    break;
                case 1:
                    oooO0o.OooO0O0(Float.isNaN(this.f33313OooOO0) ? 0.0f : this.f33313OooOO0, i);
                    break;
                case 2:
                    oooO0o.OooO0O0(Float.isNaN(this.f33318OooOOOO) ? 0.0f : this.f33318OooOOOO, i);
                    break;
                case 3:
                    oooO0o.OooO0O0(Float.isNaN(this.f33319OooOOOo) ? 0.0f : this.f33319OooOOOo, i);
                    break;
                case 4:
                    oooO0o.OooO0O0(Float.isNaN(this.f33321OooOOo0) ? 0.0f : this.f33321OooOOo0, i);
                    break;
                case 5:
                    oooO0o.OooO0O0(Float.isNaN(this.f33322OooOOoo) ? 0.0f : this.f33322OooOOoo, i);
                    break;
                case 6:
                    oooO0o.OooO0O0(Float.isNaN(this.f33314OooOO0O) ? 1.0f : this.f33314OooOO0O, i);
                    break;
                case 7:
                    oooO0o.OooO0O0(Float.isNaN(this.f33315OooOO0o) ? 1.0f : this.f33315OooOO0o, i);
                    break;
                case 8:
                    oooO0o.OooO0O0(Float.isNaN(this.f33317OooOOO0) ? 0.0f : this.f33317OooOOO0, i);
                    break;
                case 9:
                    oooO0o.OooO0O0(Float.isNaN(this.f33316OooOOO) ? 0.0f : this.f33316OooOOO, i);
                    break;
                case 10:
                    oooO0o.OooO0O0(Float.isNaN(this.f33312OooO0oo) ? 0.0f : this.f33312OooO0oo, i);
                    break;
                case 11:
                    oooO0o.OooO0O0(Float.isNaN(this.f33311OooO0oO) ? 0.0f : this.f33311OooO0oO, i);
                    break;
                case 12:
                    oooO0o.OooO0O0(Float.isNaN(this.f33320OooOOo) ? 0.0f : this.f33320OooOOo, i);
                    break;
                case 13:
                    oooO0o.OooO0O0(Float.isNaN(this.f33308OooO0Oo) ? 1.0f : this.f33308OooO0Oo, i);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        LinkedHashMap<String, ConstraintAttribute> linkedHashMap = this.f33323OooOo00;
                        if (linkedHashMap.containsKey(str2)) {
                            ConstraintAttribute constraintAttribute = linkedHashMap.get(str2);
                            if (oooO0o instanceof o000000.OooO0o.OooO0O0) {
                                ((o000000.OooO0o.OooO0O0) oooO0o).f33233OooO0o.append(i, constraintAttribute);
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
        this.f33309OooO0o = view.getVisibility();
        this.f33308OooO0Oo = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f33311OooO0oO = view.getElevation();
        this.f33312OooO0oo = view.getRotation();
        this.f33307OooO = view.getRotationX();
        this.f33313OooOO0 = view.getRotationY();
        this.f33314OooOO0O = view.getScaleX();
        this.f33315OooOO0o = view.getScaleY();
        this.f33317OooOOO0 = view.getPivotX();
        this.f33316OooOOO = view.getPivotY();
        this.f33318OooOOOO = view.getTranslationX();
        this.f33319OooOOOo = view.getTranslationY();
        this.f33321OooOOo0 = view.getTranslationZ();
    }

    public final void OooO0Oo(Rect rect, androidx.constraintlayout.widget.OooO0O0 oooO0O0, int i, int i2) {
        rect.width();
        rect.height();
        androidx.constraintlayout.widget.OooO0O0.OooO00o oooO00oOooO0oo = oooO0O0.OooO0oo(i2);
        androidx.constraintlayout.widget.OooO0O0.OooO0o oooO0o = oooO00oOooO0oo.f5063OooO0OO;
        int i3 = oooO0o.f5166OooO0OO;
        this.f33310OooO0o0 = i3;
        int i4 = oooO0o.f5165OooO0O0;
        this.f33309OooO0o = i4;
        this.f33308OooO0Oo = (i4 == 0 || i3 != 0) ? oooO0o.f5167OooO0Oo : 0.0f;
        androidx.constraintlayout.widget.OooO0O0.OooO oooO = oooO00oOooO0oo.f5065OooO0o;
        boolean z = oooO.f5060OooOOO0;
        this.f33311OooO0oO = oooO.f5059OooOOO;
        this.f33312OooO0oo = oooO.f5049OooO0O0;
        this.f33307OooO = oooO.f5050OooO0OO;
        this.f33313OooOO0 = oooO.f5051OooO0Oo;
        this.f33314OooOO0O = oooO.f5053OooO0o0;
        this.f33315OooOO0o = oooO.f5052OooO0o;
        this.f33317OooOOO0 = oooO.f5054OooO0oO;
        this.f33316OooOOO = oooO.f5055OooO0oo;
        this.f33318OooOOOO = oooO.f5056OooOO0;
        this.f33319OooOOOo = oooO.f5057OooOO0O;
        this.f33321OooOOo0 = oooO.f5058OooOO0o;
        androidx.constraintlayout.widget.OooO0O0.OooO0OO oooO0OO = oooO00oOooO0oo.f5064OooO0Oo;
        oO00Oo00.OooO0OO(oooO0OO.f5155OooO0Oo);
        this.f33320OooOOo = oooO0OO.f5159OooO0oo;
        this.f33322OooOOoo = oooO00oOooO0oo.f5063OooO0OO.f5168OooO0o0;
        Iterator<String> it = oooO00oOooO0oo.f5067OooO0oO.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            ConstraintAttribute constraintAttribute = oooO00oOooO0oo.f5067OooO0oO.get(next);
            constraintAttribute.getClass();
            int i5 = ConstraintAttribute.OooO00o.f4919OooO00o[constraintAttribute.f4913OooO0OO.ordinal()];
            if ((i5 == 1 || i5 == 2 || i5 == 3) ? false : true) {
                this.f33323OooOo00.put(next, constraintAttribute);
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
            float f = this.f33312OooO0oo + 90.0f;
            this.f33312OooO0oo = f;
            if (f > 180.0f) {
                this.f33312OooO0oo = f - 360.0f;
                return;
            }
            return;
        }
        this.f33312OooO0oo -= 90.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(OooOo oooOo) {
        oooOo.getClass();
        return Float.compare(0.0f, 0.0f);
    }
}

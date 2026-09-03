package p101o000oOoo;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class oO00o000 extends oO00O0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String[] f29758OooO00o = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p101o000oOoo.oO00O0o0
    public final void OooO0o(oO00O0o oo00o0o) {
        View view = oo00o0o.f29743OooO0O0;
        Integer numValueOf = (Integer) oo00o0o.f29742OooO00o.get("android:visibility:visibility");
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(view.getVisibility());
        }
        oo00o0o.f29742OooO00o.put("android:visibilityPropagation:visibility", numValueOf);
        int[] iArr = {Math.round(view.getTranslationX()) + i, 0};
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        iArr[0] = (view.getWidth() / 2) + iArr[0];
        iArr[1] = Math.round(view.getTranslationY()) + iArr[1];
        iArr[1] = (view.getHeight() / 2) + iArr[1];
        oo00o0o.f29742OooO00o.put("android:visibilityPropagation:center", iArr);
    }

    @Override // p101o000oOoo.oO00O0o0
    public final void OooOO0o() {
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    public final int OooOoo(oO00O0o oo00o0o) {
        Integer num;
        if (oo00o0o == null || (num = (Integer) oo00o0o.f29742OooO00o.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    public final int OooOooO(oO00O0o oo00o0o) {
        int[] iArr;
        if (oo00o0o == null || (iArr = (int[]) oo00o0o.f29742OooO00o.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[0];
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    public final int OooOooo(oO00O0o oo00o0o) {
        int[] iArr;
        if (oo00o0o == null || (iArr = (int[]) oo00o0o.f29742OooO00o.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[1];
    }
}

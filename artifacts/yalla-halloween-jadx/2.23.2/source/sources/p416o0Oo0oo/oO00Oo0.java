package p416o0Oo0oo;

import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class oO00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Serializable f46471OooO00o;

    public oO00Oo0(int i) {
        if (i != 1) {
            this.f46471OooO00o = new HashMap();
        }
    }

    public final float OooO00o(String str, Object obj) {
        HashMap map;
        float[] fArr;
        if (((HashMap) this.f46471OooO00o).containsKey(obj) && (map = (HashMap) ((HashMap) this.f46471OooO00o).get(obj)) != null && map.containsKey(str) && (fArr = (float[]) map.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }
}

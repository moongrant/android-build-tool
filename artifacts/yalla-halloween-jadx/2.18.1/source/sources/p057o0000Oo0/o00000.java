package p057o0000Oo0;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o00000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public HashMap<Object, HashMap<String, float[]>> f27556OooO00o = new HashMap<>();

    public final float OooO00o(Object obj, String str) {
        HashMap<String, float[]> map;
        float[] fArr;
        if (this.f27556OooO00o.containsKey(obj) && (map = this.f27556OooO00o.get(obj)) != null && map.containsKey(str) && (fArr = map.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }
}

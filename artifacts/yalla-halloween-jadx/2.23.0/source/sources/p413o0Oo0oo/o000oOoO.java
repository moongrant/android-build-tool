package p413o0Oo0oo;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap<Object, HashMap<String, float[]>> f45294OooO00o = new HashMap<>();

    public final float OooO00o(String str, Object obj) {
        HashMap<String, float[]> map;
        float[] fArr;
        HashMap<Object, HashMap<String, float[]>> map2 = this.f45294OooO00o;
        if (map2.containsKey(obj) && (map = map2.get(obj)) != null && map.containsKey(str) && (fArr = map.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }
}

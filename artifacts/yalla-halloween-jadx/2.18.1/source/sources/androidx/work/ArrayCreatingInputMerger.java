package androidx.work;

import androidx.annotation.NonNull;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p102o000oo.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends OooOo00 {
    @Override // p102o000oo.OooOo00
    @NonNull
    public final OooO0O0 OooO00o(@NonNull List<OooO0O0> list) {
        Object objNewInstance;
        OooO0O0.OooO00o oooO00o = new OooO0O0.OooO00o();
        HashMap map = new HashMap();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : Collections.unmodifiableMap(((OooO0O0) it.next()).f9743OooO00o).entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Class<?> cls = value.getClass();
                Object obj = map.get(str);
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        if (cls2.isArray()) {
                            int length = Array.getLength(obj);
                            int length2 = Array.getLength(value);
                            Object objNewInstance2 = Array.newInstance(obj.getClass().getComponentType(), length + length2);
                            System.arraycopy(obj, 0, objNewInstance2, 0, length);
                            System.arraycopy(value, 0, objNewInstance2, length, length2);
                            value = objNewInstance2;
                        } else {
                            objNewInstance = Array.newInstance(obj.getClass(), 2);
                            Array.set(objNewInstance, 0, obj);
                            Array.set(objNewInstance, 1, value);
                            value = objNewInstance;
                        }
                    } else if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                        value = OooO0O0(obj, value);
                    } else {
                        if (!cls.isArray() || !cls.getComponentType().equals(cls2)) {
                            throw new IllegalArgumentException();
                        }
                        value = OooO0O0(value, obj);
                    }
                } else if (!cls.isArray()) {
                    objNewInstance = Array.newInstance(value.getClass(), 1);
                    Array.set(objNewInstance, 0, value);
                    value = objNewInstance;
                }
                map.put(str, value);
            }
        }
        oooO00o.OooO0O0(map);
        return oooO00o.OooO00o();
    }

    public final Object OooO0O0(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        Object objNewInstance = Array.newInstance(obj2.getClass(), length + 1);
        System.arraycopy(obj, 0, objNewInstance, 0, length);
        Array.set(objNewInstance, length, obj2);
        return objNewInstance;
    }
}

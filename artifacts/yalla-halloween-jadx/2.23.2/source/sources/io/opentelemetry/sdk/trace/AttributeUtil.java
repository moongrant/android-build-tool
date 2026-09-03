package io.opentelemetry.sdk.trace;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class AttributeUtil {
    private AttributeUtil() {
    }

    public static Object OooO00o(int i, Object obj) {
        if (i == Integer.MAX_VALUE) {
            return obj;
        }
        if (!(obj instanceof List)) {
            if (!(obj instanceof String)) {
                return obj;
            }
            String str = (String) obj;
            return str.length() < i ? obj : str.substring(0, i);
        }
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(OooO00o(i, it.next()));
        }
        return arrayList;
    }

    public static boolean OooO0O0(int i, Object obj) {
        if (!(obj instanceof List)) {
            return !(obj instanceof String) || ((String) obj).length() < i;
        }
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            if (!OooO0O0(i, it.next())) {
                return false;
            }
        }
        return true;
    }
}

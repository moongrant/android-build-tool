package p206o00o0o0o;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o000O00O {
    public static ArrayList<Uri> OooO00o(ArrayList<Uri> arrayList) {
        ArrayList<Uri> arrayList2 = new ArrayList<>();
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        HashMap map = new HashMap(arrayList.size());
        for (Uri uri : arrayList) {
            map.put(uri, uri);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            Uri uri2 = arrayList.get(i);
            if (map.containsKey(uri2)) {
                arrayList2.add(uri2);
                if (arrayList2.size() == map.size()) {
                    break;
                }
            }
        }
        return arrayList2;
    }

    public static ArrayList OooO0O0(Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(((Map.Entry) it.next()).getValue());
        }
        return arrayList;
    }
}

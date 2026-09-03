package androidx.work;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import p084o000Ooo0.OooOOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class OverwritingInputMerger extends OooOOOO {
    @Override // p084o000Ooo0.OooOOOO
    @NonNull
    public final OooO0O0 OooO00o(@NonNull ArrayList arrayList) throws Throwable {
        OooO0O0.OooO00o oooO00o = new OooO0O0.OooO00o();
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.putAll(Collections.unmodifiableMap(((OooO0O0) it.next()).f8388OooO00o));
        }
        oooO00o.OooO00o(map);
        OooO0O0 oooO0O0 = new OooO0O0(oooO00o.f8389OooO00o);
        OooO0O0.OooO0O0(oooO0O0);
        return oooO0O0;
    }
}

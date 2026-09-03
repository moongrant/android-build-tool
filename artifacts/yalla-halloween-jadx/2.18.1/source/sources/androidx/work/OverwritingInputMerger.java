package androidx.work;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p102o000oo.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public final class OverwritingInputMerger extends OooOo00 {
    @Override // p102o000oo.OooOo00
    @NonNull
    public final OooO0O0 OooO00o(@NonNull List<OooO0O0> list) {
        OooO0O0.OooO00o oooO00o = new OooO0O0.OooO00o();
        HashMap map = new HashMap();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            map.putAll(Collections.unmodifiableMap(((OooO0O0) it.next()).f9743OooO00o));
        }
        oooO00o.OooO0O0(map);
        return oooO00o.OooO00o();
    }
}

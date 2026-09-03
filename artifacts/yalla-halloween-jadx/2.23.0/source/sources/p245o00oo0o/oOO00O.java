package p245o00oo0o;

import android.os.Bundle;
import com.google.android.exoplayer2.OooO;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class oOO00O {
    public static o0O00 OooO00o(OooO.OooO00o oooO00o, ArrayList arrayList) {
        ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f19157OooO0o0;
        ImmutableList.OooO00o oooO00o2 = new ImmutableList.OooO00o();
        for (int i = 0; i < arrayList.size(); i++) {
            Bundle bundle = (Bundle) arrayList.get(i);
            bundle.getClass();
            oooO00o2.OooO0OO(oooO00o.OooO0O0(bundle));
        }
        return oooO00o2.OooO0oo();
    }

    public static <T extends OooO> ArrayList<Bundle> OooO0O0(Collection<T> collection) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toBundle());
        }
        return arrayList;
    }
}

package p080o000OoO;

import android.os.Bundle;
import androidx.media3.common.OooO0OO;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class o00oO0o {
    public static o0O00 OooO00o(OooO0OO.OooO00o oooO00o, List list) {
        ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f18681OooO0o0;
        ImmutableList.OooO00o oooO00o2 = new ImmutableList.OooO00o();
        for (int i = 0; i < list.size(); i++) {
            Bundle bundle = (Bundle) list.get(i);
            bundle.getClass();
            oooO00o2.OooO0OO(oooO00o.OooO0OO(bundle));
        }
        return oooO00o2.OooO0oo();
    }

    public static <T extends OooO0OO> ArrayList<Bundle> OooO0O0(Collection<T> collection) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toBundle());
        }
        return arrayList;
    }
}

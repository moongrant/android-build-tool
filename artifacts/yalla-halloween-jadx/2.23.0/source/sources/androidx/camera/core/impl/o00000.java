package androidx.camera.core.impl;

import android.util.ArrayMap;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface o00000 {

    public static final class OooO00o implements o00000 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000000O f3644OooO00o;

        public OooO00o() {
            HashSet hashSet = new HashSet();
            o00O00O o00o00oOooo0OO = o00O00O.Oooo0OO();
            Range<Integer> range = o00OO0O0.f3743OooO00o;
            ArrayList arrayList = new ArrayList();
            o00O00OO o00o00ooOooO0OO = o00O00OO.OooO0OO();
            ArrayList arrayList2 = new ArrayList(hashSet);
            o00O0 o00o0Oooo0O0 = o00O0.Oooo0O0(o00o00oOooo0OO);
            ArrayList arrayList3 = new ArrayList(arrayList);
            o00OO o00oo2 = o00OO.f3727OooO0O0;
            ArrayMap arrayMap = new ArrayMap();
            for (String str : o00o00ooOooO0OO.OooO0O0()) {
                arrayMap.put(str, o00o00ooOooO0OO.OooO00o(str));
            }
            this.f3644OooO00o = new o000000O(arrayList2, o00o0Oooo0O0, -1, range, arrayList3, false, new o00OO(arrayMap), null);
        }

        @Override // androidx.camera.core.impl.o00000
        @NonNull
        public final o000000O OooO00o() {
            return this.f3644OooO00o;
        }

        @Override // androidx.camera.core.impl.o00000
        public final void getId() {
        }
    }

    @NonNull
    o000000O OooO00o();

    void getId();
}

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
        public final o000000O f3643OooO00o;

        public OooO00o() {
            HashSet hashSet = new HashSet();
            oOO00O ooo00oOooo0OO = oOO00O.Oooo0OO();
            Range<Integer> range = oo0O.f3780OooO00o;
            ArrayList arrayList = new ArrayList();
            o00O00o0 o00o00o0OooO0OO = o00O00o0.OooO0OO();
            ArrayList arrayList2 = new ArrayList(hashSet);
            o00O0O00 o00o0o00Oooo0O0 = o00O0O00.Oooo0O0(ooo00oOooo0OO);
            ArrayList arrayList3 = new ArrayList(arrayList);
            o00OOO0 o00ooo1 = o00OOO0.f3743OooO0O0;
            ArrayMap arrayMap = new ArrayMap();
            for (String str : o00o00o0OooO0OO.OooO0O0()) {
                arrayMap.put(str, o00o00o0OooO0OO.OooO00o(str));
            }
            this.f3643OooO00o = new o000000O(arrayList2, o00o0o00Oooo0O0, -1, range, arrayList3, false, new o00OOO0(arrayMap), null);
        }

        @Override // androidx.camera.core.impl.o00000
        @NonNull
        public final o000000O OooO00o() {
            return this.f3643OooO00o;
        }

        @Override // androidx.camera.core.impl.o00000
        public final void getId() {
        }
    }

    @NonNull
    o000000O OooO00o();

    void getId();
}

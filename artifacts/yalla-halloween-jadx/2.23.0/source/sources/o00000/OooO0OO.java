package o00000;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.HashSet;
import o000OO.OooOO0;
import p188o00o0O.Oooo000;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class OooO0OO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0 f33729OooO00o = new OooOO0(10);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Oooo000<T, ArrayList<T>> f33730OooO0O0 = new Oooo000<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList<T> f33731OooO0OO = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashSet<T> f33732OooO0Oo = new HashSet<>();

    public final void OooO00o(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> orDefault = this.f33730OooO0O0.getOrDefault(t, null);
        if (orDefault != null) {
            int size = orDefault.size();
            for (int i = 0; i < size; i++) {
                OooO00o(orDefault.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }
}

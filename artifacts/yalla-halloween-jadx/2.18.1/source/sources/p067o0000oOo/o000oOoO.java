package p067o0000oOo;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.HashSet;
import o000OO0O.OooO;
import o000OO0O.OooOO0;
import p021OooOooo.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class o000oOoO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO<ArrayList<T>> f27940OooO00o = new OooOO0(10);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00oO0o<T, ArrayList<T>> f27941OooO0O0 = new o00oO0o<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList<T> f27942OooO0OO = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashSet<T> f27943OooO0Oo = new HashSet<>();

    public final void OooO00o(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> orDefault = this.f27941OooO0O0.getOrDefault(t, null);
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

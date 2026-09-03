package p085o000OooO;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.ExistingWorkPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p084o000Ooo0.o0ooOOo;
import p084o000Ooo0.oo000o;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o000oOoO extends oo000o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f35140OooO = p084o000Ooo0.o000oOoO.OooO0o0("WorkContinuationImpl");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OOO0o f35141OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f35142OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ExistingWorkPolicy f35143OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<? extends o0ooOOo> f35144OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayList f35145OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f35146OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final List<o000oOoO> f35147OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f35148OooO0oo;

    public o000oOoO() {
        throw null;
    }

    public o000oOoO(@NonNull o0OOO0o o0ooo0o2, @NonNull List<? extends o0ooOOo> list) {
        ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.KEEP;
        this.f35141OooO00o = o0ooo0o2;
        this.f35142OooO0O0 = null;
        this.f35143OooO0OO = existingWorkPolicy;
        this.f35144OooO0Oo = list;
        this.f35147OooO0oO = null;
        this.f35146OooO0o0 = new ArrayList(list.size());
        this.f35145OooO0o = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String string = list.get(i).f35115OooO00o.toString();
            this.f35146OooO0o0.add(string);
            this.f35145OooO0o.add(string);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static boolean OooO00o(@NonNull o000oOoO o000oooo2, @NonNull HashSet hashSet) {
        hashSet.addAll(o000oooo2.f35146OooO0o0);
        HashSet hashSetOooO0O0 = OooO0O0(o000oooo2);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (hashSetOooO0O0.contains((String) it.next())) {
                return true;
            }
        }
        List<o000oOoO> list = o000oooo2.f35147OooO0oO;
        if (list != null && !list.isEmpty()) {
            Iterator<o000oOoO> it2 = list.iterator();
            while (it2.hasNext()) {
                if (OooO00o(it2.next(), hashSet)) {
                    return true;
                }
            }
        }
        hashSet.removeAll(o000oooo2.f35146OooO0o0);
        return false;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static HashSet OooO0O0(o000oOoO o000oooo2) {
        HashSet hashSet = new HashSet();
        List<o000oOoO> list = o000oooo2.f35147OooO0oO;
        if (list != null && !list.isEmpty()) {
            Iterator<o000oOoO> it = list.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().f35146OooO0o0);
            }
        }
        return hashSet;
    }
}

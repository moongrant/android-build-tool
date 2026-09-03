package p107o000ooO0;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.ExistingWorkPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p102o000oo.o00oO0o;
import p102o000oo.o0OOO0o;
import p102o000oo.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o000oOoO extends o00oO0o {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final String f29958OooOO0 = o0OoOo0.OooO0o0("WorkContinuationImpl");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooOo00 f29959OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00oO0o f29960OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f29961OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ExistingWorkPolicy f29962OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<? extends o0OOO0o> f29963OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final List<String> f29964OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<String> f29965OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final List<o000oOoO> f29966OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f29967OooO0oo;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public o000oOoO(@NonNull o00oO0o o00oo0o2, @NonNull List<? extends o0OOO0o> list) {
        ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.KEEP;
        this.f29960OooO00o = o00oo0o2;
        this.f29961OooO0O0 = null;
        this.f29962OooO0OO = existingWorkPolicy;
        this.f29963OooO0Oo = list;
        this.f29966OooO0oO = null;
        this.f29965OooO0o0 = new ArrayList(list.size());
        this.f29964OooO0o = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String strOooO00o = list.get(i).OooO00o();
            this.f29965OooO0o0.add(strOooO00o);
            this.f29964OooO0o.add(strOooO00o);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static boolean OooO00o(@NonNull o000oOoO o000oooo2, @NonNull Set<String> set) {
        set.addAll(o000oooo2.f29965OooO0o0);
        Set<String> setOooO0O0 = OooO0O0(o000oooo2);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (((HashSet) setOooO0O0).contains(it.next())) {
                return true;
            }
        }
        List<o000oOoO> list = o000oooo2.f29966OooO0oO;
        if (list != null && !list.isEmpty()) {
            Iterator<o000oOoO> it2 = list.iterator();
            while (it2.hasNext()) {
                if (OooO00o(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(o000oooo2.f29965OooO0o0);
        return false;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Set<String> OooO0O0(o000oOoO o000oooo2) {
        HashSet hashSet = new HashSet();
        List<o000oOoO> list = o000oooo2.f29966OooO0oO;
        if (list != null && !list.isEmpty()) {
            Iterator<o000oOoO> it = list.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().f29965OooO0o0);
            }
        }
        return hashSet;
    }
}

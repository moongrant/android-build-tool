package oo00o;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.ExistingWorkPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o0Oo0oo extends p115o00O00oO.o000000 {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final String f60287OooOO0 = p115o00O00oO.o0Oo0oo.OooO0o("WorkContinuationImpl");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o000oOoO f60288OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00000O0 f60289OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f60290OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ExistingWorkPolicy f60291OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<? extends p115o00O00oO.o000000O> f60292OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayList f60293OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f60294OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final List<o0Oo0oo> f60295OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f60296OooO0oo;

    public o0Oo0oo() {
        throw null;
    }

    public o0Oo0oo(@NonNull o00000O0 o00000o1, @Nullable String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List list) {
        this.f60289OooO00o = o00000o1;
        this.f60290OooO0O0 = str;
        this.f60291OooO0OO = existingWorkPolicy;
        this.f60292OooO0Oo = list;
        this.f60295OooO0oO = null;
        this.f60294OooO0o0 = new ArrayList(list.size());
        this.f60293OooO0o = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String string = ((p115o00O00oO.o000000O) list.get(i)).f36143OooO00o.toString();
            Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
            this.f60294OooO0o0.add(string);
            this.f60293OooO0o.add(string);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static boolean OooO0O0(@NonNull o0Oo0oo o0oo0oo2, @NonNull HashSet hashSet) {
        hashSet.addAll(o0oo0oo2.f60294OooO0o0);
        HashSet hashSetOooO0OO = OooO0OO(o0oo0oo2);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (hashSetOooO0OO.contains((String) it.next())) {
                return true;
            }
        }
        List<o0Oo0oo> list = o0oo0oo2.f60295OooO0oO;
        if (list != null && !list.isEmpty()) {
            Iterator<o0Oo0oo> it2 = list.iterator();
            while (it2.hasNext()) {
                if (OooO0O0(it2.next(), hashSet)) {
                    return true;
                }
            }
        }
        hashSet.removeAll(o0oo0oo2.f60294OooO0o0);
        return false;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static HashSet OooO0OO(@NonNull o0Oo0oo o0oo0oo2) {
        HashSet hashSet = new HashSet();
        List<o0Oo0oo> list = o0oo0oo2.f60295OooO0oO;
        if (list != null && !list.isEmpty()) {
            Iterator<o0Oo0oo> it = list.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().f60294OooO0o0);
            }
        }
        return hashSet;
    }

    @NonNull
    public final p115o00O00oO.oo0o0Oo OooO00o() {
        if (this.f60296OooO0oo) {
            p115o00O00oO.o0Oo0oo.OooO0Oo().OooO0oO(f60287OooOO0, "Already enqueued work ids (" + TextUtils.join(", ", this.f60294OooO0o0) + ")");
        } else {
            o00O0OOO.OooO oooO = new o00O0OOO.OooO(this);
            ((p119o00O0Oo0.o00O0O) this.f60289OooO00o.f60222OooO0Oo).OooO00o(oooO);
            this.f60288OooO = oooO.f36274OooO0o0;
        }
        return this.f60288OooO;
    }
}

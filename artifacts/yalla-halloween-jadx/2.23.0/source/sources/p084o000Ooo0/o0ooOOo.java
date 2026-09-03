package p084o000Ooo0;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import p091o000o0O.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final UUID f35115OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final o0Oo0oo f35116OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final Set<String> f35117OooO0OO;

    public static abstract class OooO00o<B extends OooO00o<?, ?>, W extends o0ooOOo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public UUID f35118OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public o0Oo0oo f35119OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final HashSet f35120OooO0OO;

        public OooO00o() {
            HashSet hashSet = new HashSet();
            this.f35120OooO0OO = hashSet;
            this.f35118OooO00o = UUID.randomUUID();
            this.f35119OooO0O0 = new o0Oo0oo(this.f35118OooO00o.toString(), DiagnosticsWorker.class.getName());
            hashSet.add(DiagnosticsWorker.class.getName());
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public o0ooOOo(@NonNull UUID uuid, @NonNull o0Oo0oo o0oo0oo2, @NonNull HashSet hashSet) {
        this.f35115OooO00o = uuid;
        this.f35116OooO0O0 = o0oo0oo2;
        this.f35117OooO0OO = hashSet;
    }
}

package p102o000oo;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import o00O0000.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public UUID f29815OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public o0OoOo0 f29816OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public Set<String> f29817OooO0OO;

    public static abstract class OooO00o<B extends OooO00o<?, ?>, W extends o0OOO0o> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Set<String> f29820OooO0OO = new HashSet();

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public UUID f29818OooO00o = UUID.randomUUID();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public o0OoOo0 f29819OooO0O0 = new o0OoOo0(this.f29818OooO00o.toString(), DiagnosticsWorker.class.getName());

        /* JADX WARN: Type inference failed for: r1v3, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
        public OooO00o() {
            this.f29820OooO0OO.add(DiagnosticsWorker.class.getName());
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public o0OOO0o(@NonNull UUID uuid, @NonNull o0OoOo0 o0oooo1, @NonNull Set<String> set) {
        this.f29815OooO00o = uuid;
        this.f29816OooO0O0 = o0oooo1;
        this.f29817OooO0OO = set;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final String OooO00o() {
        return this.f29815OooO00o.toString();
    }
}

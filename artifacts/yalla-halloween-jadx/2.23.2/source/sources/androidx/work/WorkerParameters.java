package androidx.work;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o00O0OOO.o000OOo;
import p115o00O00oO.o00000;
import p115o00O00oO.o00000O0;
import p115o00O00oO.o00Oo0;
import p119o00O0Oo0.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final UUID f11487OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final OooO0O0 f11488OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final Executor f11489OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final o0OoOo0 f11490OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final o00Oo0 f11491OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final o00000O0 f11492OooO0o0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public List<String> f11493OooO00o = Collections.emptyList();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NonNull
        public List<Uri> f11494OooO0O0 = Collections.emptyList();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkerParameters(@NonNull UUID uuid, @NonNull OooO0O0 oooO0O0, @NonNull List list, @NonNull ExecutorService executorService, @NonNull o0OoOo0 o0oooo1, @NonNull o00000 o00000Var, @NonNull o000OOo o000ooo2) {
        this.f11487OooO00o = uuid;
        this.f11488OooO0O0 = oooO0O0;
        new HashSet(list);
        this.f11489OooO0OO = executorService;
        this.f11490OooO0Oo = o0oooo1;
        this.f11492OooO0o0 = o00000Var;
        this.f11491OooO0o = o000ooo2;
    }
}

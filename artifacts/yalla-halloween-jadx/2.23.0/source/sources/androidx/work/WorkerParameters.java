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
import p084o000Ooo0.OooOOO;
import p084o000Ooo0.o0OOO0o;
import p084o000Ooo0.o0Oo0oo;
import p093o000o0OO.o00000O0;
import p096o000o0o0.o0000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final UUID f8393OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final OooO0O0 f8394OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final Executor f8395OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final o0000O0 f8396OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final OooOOO f8397OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final o0Oo0oo f8398OooO0o0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public List<String> f8399OooO00o = Collections.emptyList();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NonNull
        public List<Uri> f8400OooO0O0 = Collections.emptyList();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkerParameters(@NonNull UUID uuid, @NonNull OooO0O0 oooO0O0, @NonNull List list, @NonNull ExecutorService executorService, @NonNull o0000O0 o0000o1, @NonNull o0OOO0o o0ooo0o2, @NonNull o00000O0 o00000o1) {
        this.f8393OooO00o = uuid;
        this.f8394OooO0O0 = oooO0O0;
        new HashSet(list);
        this.f8395OooO0OO = executorService;
        this.f8396OooO0Oo = o0000o1;
        this.f8398OooO0o0 = o0ooo0o2;
        this.f8397OooO0o = o00000o1;
    }
}

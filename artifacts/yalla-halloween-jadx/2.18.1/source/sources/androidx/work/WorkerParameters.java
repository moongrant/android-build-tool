package androidx.work;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import p102o000oo.OooOOOO;
import p102o000oo.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public UUID f9748OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public OooO0O0 f9749OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public Executor f9750OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public o00O000.OooO00o f9751OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public OooOOOO f9752OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public o0OO00O f9753OooO0o0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public List<String> f9754OooO00o = Collections.emptyList();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NonNull
        public List<Uri> f9755OooO0O0 = Collections.emptyList();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkerParameters(@NonNull UUID uuid, @NonNull OooO0O0 oooO0O0, @NonNull Collection collection, @NonNull Executor executor, @NonNull o00O000.OooO00o oooO00o, @NonNull o0OO00O o0oo00o2, @NonNull OooOOOO oooOOOO) {
        this.f9748OooO00o = uuid;
        this.f9749OooO0O0 = oooO0O0;
        new HashSet(collection);
        this.f9750OooO0OO = executor;
        this.f9751OooO0Oo = oooO00o;
        this.f9753OooO0o0 = o0oo00o2;
        this.f9752OooO0o = oooOOOO;
    }
}

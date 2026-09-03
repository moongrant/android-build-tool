package androidx.work;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p102o000oo.OooOO0;
import p102o000oo.OooOo;
import p102o000oo.o0OO00O;
import p102o000oo.o0Oo0oo;
import p107o000ooO0.OooOOO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ExecutorService f9733OooO00o = (ExecutorService) OooO00o(false);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ExecutorService f9734OooO0O0 = (ExecutorService) OooO00o(true);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final o0Oo0oo f9735OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final OooOo f9736OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f9737OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final OooOOO f9738OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f9739OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f9740OooO0oo;

    /* JADX INFO: renamed from: androidx.work.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0068OooO00o {
    }

    public interface OooO0O0 {
        @NonNull
        OooO00o OooO00o();
    }

    public OooO00o(@NonNull C0068OooO00o c0068OooO00o) {
        String str = o0OO00O.f29814OooO00o;
        this.f9735OooO0OO = new o0Oo0oo();
        this.f9736OooO0Oo = new OooOo();
        this.f9738OooO0o0 = new OooOOO();
        this.f9737OooO0o = 4;
        this.f9739OooO0oO = Integer.MAX_VALUE;
        this.f9740OooO0oo = 20;
    }

    @NonNull
    public final Executor OooO00o(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new OooOO0(z));
    }
}

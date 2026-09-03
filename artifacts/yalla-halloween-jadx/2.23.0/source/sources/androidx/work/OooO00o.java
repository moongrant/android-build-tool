package androidx.work;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p084o000Ooo0.OooO0o;
import p084o000Ooo0.OooOo00;
import p084o000Ooo0.o0OOO0o;
import p084o000Ooo0.o0Oo0oo;
import p085o000OooO.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ExecutorService f8378OooO00o = OooO00o(false);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ExecutorService f8379OooO0O0 = OooO00o(true);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final o0OOO0o f8380OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final OooOo00 f8381OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f8382OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final OooOOO f8383OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f8384OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f8385OooO0oo;

    /* JADX INFO: renamed from: androidx.work.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0166OooO00o {
    }

    public interface OooO0O0 {
        @NonNull
        OooO00o OooO00o();
    }

    public OooO00o(@NonNull C0166OooO00o c0166OooO00o) {
        String str = o0Oo0oo.f35114OooO00o;
        this.f8380OooO0OO = new o0OOO0o();
        this.f8381OooO0Oo = new OooOo00();
        this.f8383OooO0o0 = new OooOOO();
        this.f8382OooO0o = 4;
        this.f8384OooO0oO = Integer.MAX_VALUE;
        this.f8385OooO0oo = 20;
    }

    @NonNull
    public static ExecutorService OooO00o(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new OooO0o(z));
    }
}

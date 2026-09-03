package androidx.work;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p115o00O00oO.Oooo000;
import p115o00O00oO.o00000;
import p115o00O00oO.o00000O0;
import p115o00O00oO.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ExecutorService f11464OooO00o = OooO00o(false);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ExecutorService f11465OooO0O0 = OooO00o(true);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final o00000 f11466OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final oo000o f11467OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f11468OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final oo00o.OooO0o f11469OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f11470OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f11471OooO0oo;

    /* JADX INFO: renamed from: androidx.work.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0184OooO00o {
    }

    public interface OooO0O0 {
        @NonNull
        OooO00o OooO00o();
    }

    public OooO00o(@NonNull C0184OooO00o c0184OooO00o) {
        String str = o00000O0.f36149OooO00o;
        this.f11466OooO0OO = new o00000();
        this.f11467OooO0Oo = new oo000o();
        this.f11469OooO0o0 = new oo00o.OooO0o();
        this.f11468OooO0o = 4;
        this.f11470OooO0oO = Integer.MAX_VALUE;
        this.f11471OooO0oo = 20;
    }

    @NonNull
    public static ExecutorService OooO00o(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new Oooo000(z));
    }
}

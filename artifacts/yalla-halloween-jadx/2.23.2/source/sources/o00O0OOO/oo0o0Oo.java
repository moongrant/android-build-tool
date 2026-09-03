package o00O0OOO;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.UUID;
import p039OoooOoo.o0O00O;
import p117o00O0OOo.o00000;
import p117o00O0OOo.o00000O;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class oo0o0Oo implements Runnable {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final String f36321OooOO0 = p115o00O00oO.o0Oo0oo.OooO0o("WorkForegroundRunnable");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final p119o00O0Oo0.o0OoOo0 f36322OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00000O<Void> f36323OooO0Oo = new o00000O<>();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00O0OO.o00Ooo f36324OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Context f36325OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final androidx.work.OooO0OO f36326OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final p115o00O00oO.o00Oo0 f36327OooO0oo;

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00000O f36328OooO0Oo;

        public OooO00o(o00000O o00000o) {
            this.f36328OooO0Oo = o00000o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            if (oo0o0Oo.this.f36323OooO0Oo.f36334OooO0Oo instanceof o00000.OooO0O0) {
                return;
            }
            try {
                p115o00O00oO.o00O0O o00o0o2 = (p115o00O00oO.o00O0O) this.f36328OooO0Oo.get();
                if (o00o0o2 == null) {
                    throw new IllegalStateException("Worker was marked important (" + oo0o0Oo.this.f36324OooO0o.f36218OooO0OO + ") but did not provide ForegroundInfo");
                }
                p115o00O00oO.o0Oo0oo.OooO0Oo().OooO00o(oo0o0Oo.f36321OooOO0, "Updating notification for " + oo0o0Oo.this.f36324OooO0o.f36218OooO0OO);
                oo0o0Oo oo0o0oo = oo0o0Oo.this;
                o00000O<Void> o00000o = oo0o0oo.f36323OooO0Oo;
                p115o00O00oO.o00Oo0 o00oo1 = oo0o0oo.f36327OooO0oo;
                Context context = oo0o0oo.f36325OooO0o0;
                UUID uuid = oo0o0oo.f36326OooO0oO.f11478OooO0o0.f11487OooO00o;
                o000OOo o000ooo2 = (o000OOo) o00oo1;
                o000ooo2.getClass();
                o00000O o00000o2 = new o00000O();
                ((p119o00O0Oo0.o00O0O) o000ooo2.f36294OooO00o).OooO00o(new o0O0O00(o000ooo2, o00000o2, uuid, o00o0o2, context));
                o00000o.OooOO0O(o00000o2);
            } catch (Throwable th) {
                oo0o0Oo.this.f36323OooO0Oo.OooOO0(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public oo0o0Oo(@NonNull Context context, @NonNull o00O0OO.o00Ooo o00ooo2, @NonNull androidx.work.OooO0OO oooO0OO, @NonNull p115o00O00oO.o00Oo0 o00oo1, @NonNull p119o00O0Oo0.o0OoOo0 o0oooo1) {
        this.f36325OooO0o0 = context;
        this.f36324OooO0o = o00ooo2;
        this.f36326OooO0oO = oooO0OO;
        this.f36327OooO0oo = o00oo1;
        this.f36322OooO = o0oooo1;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public final void run() {
        if (!this.f36324OooO0o.f36232OooOOo0 || Build.VERSION.SDK_INT >= 31) {
            this.f36323OooO0Oo.OooO(null);
            return;
        }
        o00000O o00000o = new o00000O();
        p119o00O0Oo0.o00O0O o00o0o2 = (p119o00O0Oo0.o00O0O) this.f36322OooO;
        o00o0o2.f36416OooO0OO.execute(new o0O00O(1, this, o00000o));
        o00000o.OooO0oo(new OooO00o(o00000o), o00o0o2.f36416OooO0OO);
    }
}

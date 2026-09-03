package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 extends EmojiCompat.OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO00o f5652OooO0Oo = new OooO00o();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class OooO00o {
    }

    public static class OooO0O0 implements EmojiCompat.OooOOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final Context f5653OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NonNull
        public final o0000O0.OooOO0 f5654OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NonNull
        public final OooO00o f5655OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NonNull
        public final Object f5656OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        @GuardedBy("mLock")
        public Executor f5657OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        @GuardedBy("mLock")
        public Handler f5658OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        @GuardedBy("mLock")
        public ThreadPoolExecutor f5659OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        @GuardedBy("mLock")
        public EmojiCompat.OooOOO f5660OooO0oo;

        public OooO0O0(@NonNull Context context, @NonNull o0000O0.OooOO0 oooOO1) {
            OooO00o oooO00o = Oooo000.f5652OooO0Oo;
            this.f5656OooO0Oo = new Object();
            o000OO.OooOOO0.OooO0o0(context, "Context cannot be null");
            this.f5653OooO00o = context.getApplicationContext();
            this.f5654OooO0O0 = oooOO1;
            this.f5655OooO0OO = oooO00o;
        }

        @Override // androidx.emoji2.text.EmojiCompat.OooOOO0
        @RequiresApi(19)
        public final void OooO00o(@NonNull EmojiCompat.OooOOO oooOOO) {
            synchronized (this.f5656OooO0Oo) {
                this.f5660OooO0oo = oooOOO;
            }
            OooO0OO();
        }

        public final void OooO0O0() {
            synchronized (this.f5656OooO0Oo) {
                this.f5660OooO0oo = null;
                Handler handler = this.f5658OooO0o0;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f5658OooO0o0 = null;
                ThreadPoolExecutor threadPoolExecutor = this.f5659OooO0oO;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f5657OooO0o = null;
                this.f5659OooO0oO = null;
            }
        }

        @RequiresApi(19)
        public final void OooO0OO() {
            synchronized (this.f5656OooO0Oo) {
                if (this.f5660OooO0oo == null) {
                    return;
                }
                if (this.f5657OooO0o == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.OooO00o("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f5659OooO0oO = threadPoolExecutor;
                    this.f5657OooO0o = threadPoolExecutor;
                }
                this.f5657OooO0o.execute(new Oooo0(this, 0));
            }
        }

        @WorkerThread
        public final o0000O0.Oooo000 OooO0Oo() {
            try {
                OooO00o oooO00o = this.f5655OooO0OO;
                Context context = this.f5653OooO00o;
                o0000O0.OooOO0 oooOO1 = this.f5654OooO0O0;
                oooO00o.getClass();
                o0000O0.OooOo oooOoOooO00o = o0000O0.OooO.OooO00o(context, oooOO1);
                int i = oooOoOooO00o.f33556OooO00o;
                if (i != 0) {
                    throw new RuntimeException(OooO0OO.OooO00o.OooO00o("fetchFonts failed (", i, ")"));
                }
                o0000O0.Oooo000[] oooo000Arr = oooOoOooO00o.f33557OooO0O0;
                if (oooo000Arr == null || oooo000Arr.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return oooo000Arr[0];
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }
    }

    public Oooo000(@NonNull Context context, @NonNull o0000O0.OooOO0 oooOO1) {
        super(new OooO0O0(context, oooOO1));
    }
}

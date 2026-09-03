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
import androidx.appcompat.widget.o000O000;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import o0O0O00.o0ooOOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO extends EmojiCompat.OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO00o f8124OooO0Oo = new OooO00o();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class OooO00o {
    }

    public static class OooO0O0 implements EmojiCompat.OooOO0O {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @Nullable
        @GuardedBy("mLock")
        public OooOOOO f8125OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final Context f8126OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NonNull
        public final o000O0.OooOO0 f8127OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NonNull
        public final OooO00o f8128OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NonNull
        public final Object f8129OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        @GuardedBy("mLock")
        public Executor f8130OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        @GuardedBy("mLock")
        public Handler f8131OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        @GuardedBy("mLock")
        public ThreadPoolExecutor f8132OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        @GuardedBy("mLock")
        public EmojiCompat.OooOOO0 f8133OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @Nullable
        @GuardedBy("mLock")
        public androidx.compose.ui.platform.o000oOoO f8134OooOO0;

        public OooO0O0(@NonNull Context context, @NonNull o000O0.OooOO0 oooOO1) {
            OooO00o oooO00o = OooOOO.f8124OooO0Oo;
            this.f8129OooO0Oo = new Object();
            o000OO0O.OooOOO0.OooO0Oo(context, "Context cannot be null");
            this.f8126OooO00o = context.getApplicationContext();
            this.f8127OooO0O0 = oooOO1;
            this.f8128OooO0OO = oooO00o;
        }

        @Override // androidx.emoji2.text.EmojiCompat.OooOO0O
        @RequiresApi(19)
        public final void OooO00o(@NonNull EmojiCompat.OooOOO0 oooOOO0) {
            synchronized (this.f8129OooO0Oo) {
                this.f8133OooO0oo = oooOOO0;
            }
            OooO0OO();
        }

        public final void OooO0O0() {
            synchronized (this.f8129OooO0Oo) {
                this.f8133OooO0oo = null;
                OooOOOO oooOOOO = this.f8125OooO;
                if (oooOOOO != null) {
                    OooO00o oooO00o = this.f8128OooO0OO;
                    Context context = this.f8126OooO00o;
                    Objects.requireNonNull(oooO00o);
                    context.getContentResolver().unregisterContentObserver(oooOOOO);
                    this.f8125OooO = null;
                }
                Handler handler = this.f8131OooO0o0;
                if (handler != null) {
                    handler.removeCallbacks(this.f8134OooOO0);
                }
                this.f8131OooO0o0 = null;
                ThreadPoolExecutor threadPoolExecutor = this.f8132OooO0oO;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f8130OooO0o = null;
                this.f8132OooO0oO = null;
            }
        }

        @RequiresApi(19)
        public final void OooO0OO() {
            synchronized (this.f8129OooO0Oo) {
                if (this.f8133OooO0oo == null) {
                    return;
                }
                if (this.f8130OooO0o == null) {
                    ThreadPoolExecutor threadPoolExecutorOooO00o = androidx.emoji2.text.OooO0O0.OooO00o("emojiCompat");
                    this.f8132OooO0oO = threadPoolExecutorOooO00o;
                    this.f8130OooO0o = threadPoolExecutorOooO00o;
                }
                this.f8130OooO0o.execute(new o000O000(this, 1));
            }
        }

        @WorkerThread
        public final o000O0.Oooo000 OooO0Oo() {
            try {
                OooO00o oooO00o = this.f8128OooO0OO;
                Context context = this.f8126OooO00o;
                o000O0.OooOO0 oooOO1 = this.f8127OooO0O0;
                Objects.requireNonNull(oooO00o);
                o000O0.OooOo oooOoOooO00o = o000O0.OooO.OooO00o(context, oooOO1);
                if (oooOoOooO00o.f28064OooO00o != 0) {
                    throw new RuntimeException(o0ooOOo.OooO00o(OooO00o.OooO00o.OooO0o0("fetchFonts failed ("), oooOoOooO00o.f28064OooO00o, ")"));
                }
                o000O0.Oooo000[] oooo000Arr = oooOoOooO00o.f28065OooO0O0;
                if (oooo000Arr == null || oooo000Arr.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return oooo000Arr[0];
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }
    }

    public OooOOO(@NonNull Context context, @NonNull o000O0.OooOO0 oooOO1) {
        super(new OooO0O0(context, oooOO1));
    }
}

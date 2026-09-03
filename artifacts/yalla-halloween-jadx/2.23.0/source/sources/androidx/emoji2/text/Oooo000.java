package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import java.nio.MappedByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p063o0000oO.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 extends EmojiCompat.OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO00o f5638OooO0Oo = new OooO00o();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class OooO00o {
    }

    public static class OooO0O0 implements EmojiCompat.OooOOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final Context f5639OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NonNull
        public final o0000O0.OooOO0 f5640OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NonNull
        public final OooO00o f5641OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NonNull
        public final Object f5642OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        @GuardedBy("mLock")
        public Executor f5643OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        @GuardedBy("mLock")
        public Handler f5644OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        @GuardedBy("mLock")
        public ThreadPoolExecutor f5645OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        @GuardedBy("mLock")
        public EmojiCompat.OooOOO f5646OooO0oo;

        public OooO0O0(@NonNull Context context, @NonNull o0000O0.OooOO0 oooOO1) {
            OooO00o oooO00o = Oooo000.f5638OooO0Oo;
            this.f5642OooO0Oo = new Object();
            o000OO.OooOOO0.OooO0o0(context, "Context cannot be null");
            this.f5639OooO00o = context.getApplicationContext();
            this.f5640OooO0O0 = oooOO1;
            this.f5641OooO0OO = oooO00o;
        }

        @Override // androidx.emoji2.text.EmojiCompat.OooOOO0
        @RequiresApi(19)
        public final void OooO00o(@NonNull EmojiCompat.OooOOO oooOOO) {
            synchronized (this.f5642OooO0Oo) {
                this.f5646OooO0oo = oooOOO;
            }
            OooO0OO();
        }

        public final void OooO0O0() {
            synchronized (this.f5642OooO0Oo) {
                this.f5646OooO0oo = null;
                Handler handler = this.f5644OooO0o0;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f5644OooO0o0 = null;
                ThreadPoolExecutor threadPoolExecutor = this.f5645OooO0oO;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f5643OooO0o = null;
                this.f5645OooO0oO = null;
            }
        }

        @RequiresApi(19)
        public final void OooO0OO() {
            synchronized (this.f5642OooO0Oo) {
                if (this.f5646OooO0oo == null) {
                    return;
                }
                if (this.f5643OooO0o == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.OooO00o("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f5645OooO0oO = threadPoolExecutor;
                    this.f5643OooO0o = threadPoolExecutor;
                }
                this.f5643OooO0o.execute(new Runnable() { // from class: androidx.emoji2.text.Oooo0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Oooo000.OooO0O0 oooO0O0 = this.f5637OooO0Oo;
                        synchronized (oooO0O0.f5642OooO0Oo) {
                            if (oooO0O0.f5646OooO0oo == null) {
                                return;
                            }
                            try {
                                o0000O0.Oooo000 oooo000OooO0Oo = oooO0O0.OooO0Oo();
                                int i = oooo000OooO0Oo.f34084OooO0o0;
                                if (i == 2) {
                                    synchronized (oooO0O0.f5642OooO0Oo) {
                                    }
                                }
                                if (i != 0) {
                                    throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                                }
                                try {
                                    int i2 = o00000O0.f34291OooO00o;
                                    o00000O0.OooO00o.OooO00o("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                    Oooo000.OooO00o oooO00o = oooO0O0.f5641OooO0OO;
                                    Context context = oooO0O0.f5639OooO00o;
                                    oooO00o.getClass();
                                    Typeface typefaceOooO0O0 = p052o00000oO.OooOOOO.f33996OooO00o.OooO0O0(context, new o0000O0.Oooo000[]{oooo000OooO0Oo}, 0);
                                    MappedByteBuffer mappedByteBufferOooO0o0 = p052o00000oO.o00Oo0.OooO0o0(oooO0O0.f5639OooO00o, oooo000OooO0Oo.f34080OooO00o);
                                    if (mappedByteBufferOooO0o0 == null || typefaceOooO0O0 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        o00000O0.OooO00o.OooO00o("EmojiCompat.MetadataRepo.create");
                                        o0OoOo0 o0oooo0 = new o0OoOo0(typefaceOooO0O0, o000oOoO.OooO00o(mappedByteBufferOooO0o0));
                                        o00000O0.OooO00o.OooO0O0();
                                        o00000O0.OooO00o.OooO0O0();
                                        synchronized (oooO0O0.f5642OooO0Oo) {
                                            EmojiCompat.OooOOO oooOOO = oooO0O0.f5646OooO0oo;
                                            if (oooOOO != null) {
                                                oooOOO.OooO0O0(o0oooo0);
                                            }
                                        }
                                        oooO0O0.OooO0O0();
                                    } catch (Throwable th) {
                                        int i3 = o00000O0.f34291OooO00o;
                                        o00000O0.OooO00o.OooO0O0();
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    int i4 = o00000O0.f34291OooO00o;
                                    o00000O0.OooO00o.OooO0O0();
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                synchronized (oooO0O0.f5642OooO0Oo) {
                                    EmojiCompat.OooOOO oooOOO2 = oooO0O0.f5646OooO0oo;
                                    if (oooOOO2 != null) {
                                        oooOOO2.OooO00o(th3);
                                    }
                                    oooO0O0.OooO0O0();
                                }
                            }
                        }
                    }
                });
            }
        }

        @WorkerThread
        public final o0000O0.Oooo000 OooO0Oo() {
            try {
                OooO00o oooO00o = this.f5641OooO0OO;
                Context context = this.f5639OooO00o;
                o0000O0.OooOO0 oooOO1 = this.f5640OooO0O0;
                oooO00o.getClass();
                o0000O0.OooOo oooOoOooO00o = o0000O0.OooO.OooO00o(context, oooOO1);
                int i = oooOoOooO00o.f34069OooO00o;
                if (i != 0) {
                    throw new RuntimeException(OooO0OO.OooO00o.OooO00o("fetchFonts failed (", i, ")"));
                }
                o0000O0.Oooo000[] oooo000Arr = oooOoOooO00o.f34070OooO0O0;
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

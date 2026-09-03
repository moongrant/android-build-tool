package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p063o0000oO.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements o00O000o.OooO0O0<Boolean> {

    @RequiresApi(19)
    public static class OooO00o extends EmojiCompat.OooO0OO {
        public OooO00o(Context context) {
            super(new OooO0O0(context));
            this.f5612OooO0O0 = 1;
        }
    }

    @RequiresApi(19)
    public static class OooO0O0 implements EmojiCompat.OooOOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f5619OooO00o;

        public OooO0O0(Context context) {
            this.f5619OooO00o = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.EmojiCompat.OooOOO0
        public final void OooO00o(@NonNull final EmojiCompat.OooOOO oooOOO) {
            final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.OooO00o("EmojiCompatInitializer"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new Runnable() { // from class: androidx.emoji2.text.OooOO0O
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.OooO0O0 oooO0O0 = this.f5624OooO0Oo;
                    EmojiCompat.OooOOO oooOOO2 = oooOOO;
                    ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                    oooO0O0.getClass();
                    try {
                        Oooo000 oooo000OooO00o = OooO0o.OooO00o(oooO0O0.f5619OooO00o);
                        if (oooo000OooO00o == null) {
                            throw new RuntimeException("EmojiCompat font provider not available on this device.");
                        }
                        Oooo000.OooO0O0 oooO0O1 = (Oooo000.OooO0O0) oooo000OooO00o.f5611OooO00o;
                        synchronized (oooO0O1.f5656OooO0Oo) {
                            oooO0O1.f5657OooO0o = threadPoolExecutor2;
                        }
                        oooo000OooO00o.f5611OooO00o.OooO00o(new OooOOO0(oooOOO2, threadPoolExecutor2));
                    } catch (Throwable th) {
                        oooOOO2.OooO00o(th);
                        threadPoolExecutor2.shutdown();
                    }
                }
            });
        }
    }

    public static class OooO0OO implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                int i = o000OOo.f33777OooO00o;
                o000OOo.OooO00o.OooO00o("EmojiCompat.EmojiCompatInitializer.run");
                if (EmojiCompat.OooO0OO()) {
                    EmojiCompat.OooO00o().OooO0Oo();
                }
            } finally {
                int i2 = o000OOo.f33777OooO00o;
                o000OOo.OooO00o.OooO0O0();
            }
        }
    }

    @Override // o00O000o.OooO0O0
    @NonNull
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final Boolean create(@NonNull Context context) {
        OooO00o oooO00o = new OooO00o(context);
        if (EmojiCompat.f5598OooOO0O == null) {
            synchronized (EmojiCompat.f5597OooOO0) {
                if (EmojiCompat.f5598OooOO0O == null) {
                    EmojiCompat.f5598OooOO0O = new EmojiCompat(oooO00o);
                }
            }
        }
        OooO0O0(context);
        return Boolean.TRUE;
    }

    @RequiresApi(19)
    public final void OooO0O0(@NonNull Context context) {
        Object objOooO0O0;
        o00O000o.OooO00o oooO00oOooO0OO = o00O000o.OooO00o.OooO0OO(context);
        oooO00oOooO0OO.getClass();
        synchronized (o00O000o.OooO00o.f36020OooO0o0) {
            try {
                objOooO0O0 = oooO00oOooO0OO.f36021OooO00o.get(ProcessLifecycleInitializer.class);
                if (objOooO0O0 == null) {
                    objOooO0O0 = oooO00oOooO0OO.OooO0O0(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        final Lifecycle lifecycle = ((LifecycleOwner) objOooO0O0).getLifecycle();
        lifecycle.addObserver(new DefaultLifecycleObserver() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0OO.OooO00o(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0OO.OooO0O0(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0OO.OooO0OO(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onResume(@NonNull LifecycleOwner lifecycleOwner) {
                EmojiCompatInitializer.this.getClass();
                (Build.VERSION.SDK_INT >= 28 ? androidx.emoji2.text.OooO0OO.OooO00o(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new OooO0OO(), 500L);
                lifecycle.removeObserver(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0OO.OooO0o0(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0OO.OooO0o(this, lifecycleOwner);
            }
        });
    }

    @Override // o00O000o.OooO0O0
    @NonNull
    public final List<Class<? extends o00O000o.OooO0O0<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}

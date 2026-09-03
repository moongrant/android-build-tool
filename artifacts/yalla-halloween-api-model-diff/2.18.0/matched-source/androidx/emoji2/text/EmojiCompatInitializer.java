package androidx.emoji2.text;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadPoolExecutor;
import p096o000o0o.o00oO0o;
import p096o000o0o.oo000o;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements o00oO0o<Boolean> {

    @RequiresApi(19)
    public static class OooO00o extends EmojiCompat.OooO0OO {
        public OooO00o(Context context) {
            super(new OooO0O0(context));
            this.f8109OooO0O0 = 1;
        }
    }

    @RequiresApi(19)
    public static class OooO0O0 implements EmojiCompat.OooOO0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f8116OooO00o;

        public OooO0O0(Context context) {
            this.f8116OooO00o = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.EmojiCompat.OooOO0O
        public final void OooO00o(@NonNull final EmojiCompat.OooOOO0 oooOOO0) {
            final ThreadPoolExecutor threadPoolExecutorOooO00o = androidx.emoji2.text.OooO0O0.OooO00o("EmojiCompatInitializer");
            final int i = 0;
            threadPoolExecutorOooO00o.execute(new Runnable() { // from class: androidx.emoji2.text.OooO
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            EmojiCompatInitializer.OooO0O0 oooO0O0 = (EmojiCompatInitializer.OooO0O0) this;
                            EmojiCompat.OooOOO0 oooOOO1 = (EmojiCompat.OooOOO0) oooOOO0;
                            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) threadPoolExecutorOooO00o;
                            Objects.requireNonNull(oooO0O0);
                            try {
                                OooOOO oooOOOOooO00o = OooO0OO.OooO00o(oooO0O0.f8116OooO00o);
                                if (oooOOOOooO00o == null) {
                                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                                }
                                OooOOO.OooO0O0 oooO0O1 = (OooOOO.OooO0O0) oooOOOOooO00o.f8108OooO00o;
                                synchronized (oooO0O1.f8144OooO0Oo) {
                                    oooO0O1.f8145OooO0o = threadPoolExecutor;
                                    break;
                                }
                                oooOOOOooO00o.f8108OooO00o.OooO00o(new OooOO0(oooOOO1, threadPoolExecutor));
                                return;
                            } catch (Throwable th) {
                                oooOOO1.OooO00o(th);
                                threadPoolExecutor.shutdown();
                                return;
                            }
                        default:
                            ((androidx.room.OooO0O0) this).f9303Oooo.OooO00o();
                            return;
                    }
                }
            });
        }
    }

    public static class OooO0OO implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                int i = o000O00O.OooOo.f28115OooO00o;
                o000O00O.OooOo.OooO00o.OooO00o("EmojiCompat.EmojiCompatInitializer.run");
                if (EmojiCompat.OooO0OO()) {
                    EmojiCompat.OooO00o().OooO0o0();
                }
            } finally {
                int i2 = o000O00O.OooOo.f28115OooO00o;
                o000O00O.OooOo.OooO00o.OooO0O0();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, java.lang.Object>] */
    @NonNull
    public final void OooO00o(@NonNull Context context) {
        Object objOooO0O0;
        OooO00o oooO00o = new OooO00o(context);
        if (EmojiCompat.f8095OooOO0 == null) {
            synchronized (EmojiCompat.f8094OooO) {
                if (EmojiCompat.f8095OooOO0 == null) {
                    EmojiCompat.f8095OooOO0 = new EmojiCompat(oooO00o);
                }
            }
        }
        oo000o oo000oVarOooO0OO = oo000o.OooO0OO(context);
        Objects.requireNonNull(oo000oVarOooO0OO);
        synchronized (oo000o.f29316OooO0o0) {
            objOooO0O0 = oo000oVarOooO0OO.f29317OooO00o.get(ProcessLifecycleInitializer.class);
            if (objOooO0O0 == null) {
                objOooO0O0 = oo000oVarOooO0OO.OooO0O0(ProcessLifecycleInitializer.class, new HashSet());
            }
        }
        final Lifecycle lifecycle = ((LifecycleOwner) objOooO0O0).getLifecycle();
        lifecycle.addObserver(new DefaultLifecycleObserver() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0O0.OooO00o(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0O0.OooO0O0(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0O0.OooO0OO(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final void onResume(@NonNull LifecycleOwner lifecycleOwner) {
                Objects.requireNonNull(EmojiCompatInitializer.this);
                androidx.emoji2.text.OooO0O0.OooO0O0().postDelayed(new OooO0OO(), 500L);
                lifecycle.removeObserver(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0O0.OooO0o0(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0O0.OooO0o(this, lifecycleOwner);
            }
        });
    }

    @Override // p096o000o0o.o00oO0o
    @NonNull
    public final /* bridge */ /* synthetic */ Boolean create(@NonNull Context context) {
        OooO00o(context);
        return Boolean.TRUE;
    }

    @Override // p096o000o0o.o00oO0o
    @NonNull
    public final List<Class<? extends o00oO0o<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}

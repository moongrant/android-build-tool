package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import androidx.compose.foundation.ExperimentalFoundationApi;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o0O0O00.o000O0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p036OoooOOO.o000OOo;
import p100o000oOoO.oo0oO0;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
public final class o000oOoO implements oo0oO0, Oooo0.OooO0O0, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public static long f5826OoooOOO;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final View f5827Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final Oooo0 f5828Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final o000O0O0 f5829Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final OooOOO0 f5830Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f5831OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public long f5832OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final o000OOo<OooO00o> f5833OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public long f5834OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final Choreographer f5835OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f5836o000oOoO;

    public static final class OooO00o implements Oooo0.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f5837OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f5838OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public o000O0O0.OooO00o f5839OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f5840OooO0Oo;

        public OooO00o(int i, long j) {
            this.f5837OooO00o = i;
            this.f5838OooO0O0 = j;
        }

        @Override // androidx.compose.foundation.lazy.layout.Oooo0.OooO00o
        public final void cancel() {
            if (this.f5840OooO0Oo) {
                return;
            }
            this.f5840OooO0Oo = true;
            o000O0O0.OooO00o oooO00o = this.f5839OooO0OO;
            if (oooO00o != null) {
                oooO00o.dispose();
            }
            this.f5839OooO0OO = null;
        }
    }

    public o000oOoO(@NotNull Oooo0 prefetchState, @NotNull o000O0O0 subcomposeLayoutState, @NotNull OooOOO0 itemContentFactory, @NotNull View view) {
        Intrinsics.checkNotNullParameter(prefetchState, "prefetchState");
        Intrinsics.checkNotNullParameter(subcomposeLayoutState, "subcomposeLayoutState");
        Intrinsics.checkNotNullParameter(itemContentFactory, "itemContentFactory");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f5828Oooo0o = prefetchState;
        this.f5829Oooo0oO = subcomposeLayoutState;
        this.f5830Oooo0oo = itemContentFactory;
        this.f5827Oooo = view;
        this.f5833OoooO00 = new o000OOo<>(new OooO00o[16]);
        this.f5835OoooOO0 = Choreographer.getInstance();
        if (f5826OoooOOO == 0) {
            Display display = view.getDisplay();
            float f = 60.0f;
            if (!view.isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            f5826OoooOOO = (long) (1000000000 / f);
        }
    }

    @Override // p100o000oOoO.oo0oO0
    public final void OooO00o() {
    }

    @Override // p100o000oOoO.oo0oO0
    public final void OooO0O0() {
        this.f5836o000oOoO = false;
        this.f5828Oooo0o.f5822OooO00o.setValue(null);
        this.f5827Oooo.removeCallbacks(this);
        this.f5835OoooOO0.removeFrameCallback(this);
    }

    @Override // androidx.compose.foundation.lazy.layout.Oooo0.OooO0O0
    @NotNull
    public final Oooo0.OooO00o OooO0OO(int i, long j) {
        OooO00o oooO00o = new OooO00o(i, j);
        this.f5833OoooO00.OooO0O0(oooO00o);
        if (!this.f5831OoooO) {
            this.f5831OoooO = true;
            this.f5827Oooo.post(this);
        }
        return oooO00o;
    }

    @Override // p100o000oOoO.oo0oO0
    public final void OooO0Oo() {
        this.f5828Oooo0o.f5822OooO00o.setValue(this);
        this.f5836o000oOoO = true;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f5836o000oOoO) {
            this.f5827Oooo.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        char c = 0;
        if (this.f5833OoooO00.OooO() || !this.f5831OoooO || !this.f5836o000oOoO || this.f5827Oooo.getWindowVisibility() != 0) {
            this.f5831OoooO = false;
            return;
        }
        long nanos = TimeUnit.MILLISECONDS.toNanos(this.f5827Oooo.getDrawingTime()) + f5826OoooOOO;
        boolean z = false;
        while (this.f5833OoooO00.OooOO0() && !z) {
            OooO00o oooO00o = this.f5833OoooO00.f3662Oooo0o[c];
            OooOOO oooOOOInvoke = this.f5830Oooo0oo.f5802OooO0O0.invoke();
            if (!oooO00o.f5840OooO0Oo) {
                int iOooO0oo = oooOOOInvoke.OooO0oo();
                int i = oooO00o.f5837OooO00o;
                if (i >= 0 && i < iOooO0oo) {
                    if (oooO00o.f5839OooO0OO == null) {
                        Trace.beginSection("compose:lazylist:prefetch:compose");
                        try {
                            long jNanoTime = System.nanoTime();
                            if (jNanoTime > nanos || this.f5832OoooO0 + jNanoTime < nanos) {
                                Object objOooO00o = oooOOOInvoke.OooO00o(oooO00o.f5837OooO00o);
                                oooO00o.f5839OooO0OO = this.f5829Oooo0oO.OooO0O0(objOooO00o, this.f5830Oooo0oo.OooO00o(oooO00o.f5837OooO00o, objOooO00o));
                                long jNanoTime2 = System.nanoTime() - jNanoTime;
                                long j2 = this.f5832OoooO0;
                                if (j2 != 0) {
                                    long j3 = 4;
                                    jNanoTime2 = (jNanoTime2 / j3) + ((j2 / j3) * ((long) 3));
                                }
                                this.f5832OoooO0 = jNanoTime2;
                            } else {
                                z = true;
                            }
                            Unit unit = Unit.INSTANCE;
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } else {
                        Trace.beginSection("compose:lazylist:prefetch:measure");
                        try {
                            long jNanoTime3 = System.nanoTime();
                            if (jNanoTime3 > nanos || this.f5834OoooO0O + jNanoTime3 < nanos) {
                                o000O0O0.OooO00o oooO00o2 = oooO00o.f5839OooO0OO;
                                Intrinsics.checkNotNull(oooO00o2);
                                int iOooO00o = oooO00o2.OooO00o();
                                int i2 = 0;
                                while (i2 < iOooO00o) {
                                    oooO00o2.OooO0O0(i2, oooO00o.f5838OooO0O0);
                                    i2++;
                                    nanos = nanos;
                                }
                                j = nanos;
                                long jNanoTime4 = System.nanoTime() - jNanoTime3;
                                long j4 = this.f5834OoooO0O;
                                if (j4 != 0) {
                                    long j5 = 4;
                                    jNanoTime4 = (jNanoTime4 / j5) + ((j4 / j5) * ((long) 3));
                                }
                                this.f5834OoooO0O = jNanoTime4;
                                this.f5833OoooO00.OooOOO0(0);
                            } else {
                                j = nanos;
                                Unit unit2 = Unit.INSTANCE;
                                z = true;
                            }
                            Trace.endSection();
                            nanos = j;
                            c = 0;
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                }
            }
            j = nanos;
            this.f5833OoooO00.OooOOO0(0);
            nanos = j;
            c = 0;
        }
        if (z) {
            this.f5835OoooOO0.postFrameCallback(this);
        } else {
            this.f5831OoooO = false;
        }
    }
}

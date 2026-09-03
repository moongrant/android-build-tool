package oOO00O;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o00O0O0O.Oooo0;
import o00O0O0O.o000oOoO;
import o00O0O0O.o00O0O;
import o00O0O0O.o00Ooo;
import o00O0O0O.o0ooOOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p119o00O0Oo0.o0Oo0oo;
import p660o0ooo0o0.o00O;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public interface OooOO0 {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Context f52980OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public o00O0OO0.OooO0O0 f52981OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public OooO0O0 f52982OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public o0Oo0oo f52983OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public double f52984OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public double f52985OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f52986OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f52987OooO0oo;

        public OooO00o(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Context context2 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context.applicationContext");
            this.f52980OooO00o = context2;
            this.f52981OooO0O0 = o00O0OO0.OooO0O0.f30555OooOOO0;
            this.f52982OooO0OO = null;
            this.f52983OooO0Oo = new o0Oo0oo(false, false, false, 7, null);
            Intrinsics.checkNotNullParameter(context2, "context");
            try {
                Object objOooO0OO = o000O000.OooO00o.OooO0OO(context2, ActivityManager.class);
                if (objOooO0OO == null) {
                    throw new IllegalStateException(("System service of type " + ActivityManager.class + " was not found.").toString());
                }
                double d = ((ActivityManager) objOooO0OO).isLowRamDevice() ? 0.15d : 0.2d;
                this.f52985OooO0o0 = d;
                this.f52984OooO0o = Build.VERSION.SDK_INT >= 24 ? 0.0d : 0.5d;
                this.f52986OooO0oO = true;
                this.f52987OooO0oo = true;
            } catch (Exception unused) {
            }
        }

        @NotNull
        public final OooOO0 OooO00o() {
            int largeMemoryClass;
            o00Ooo oooO;
            Context context = this.f52980OooO00o;
            double d = this.f52985OooO0o0;
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                Object objOooO0OO = o000O000.OooO00o.OooO0OO(context, ActivityManager.class);
                if (objOooO0OO == null) {
                    throw new IllegalStateException(("System service of type " + ActivityManager.class + " was not found.").toString());
                }
                ActivityManager activityManager = (ActivityManager) objOooO0OO;
                largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                double d2 = 1024;
                long j = (long) (d * ((double) largeMemoryClass) * d2 * d2);
                int i = (int) ((this.f52986OooO0oO ? this.f52984OooO0o : 0.0d) * j);
                int i2 = (int) (j - ((long) i));
                p113o00O00Oo.OooO0O0 oooO2 = i == 0 ? new p113o00O00Oo.OooO() : new p113o00O00Oo.OooOO0O(i);
                o0ooOOo weakMemoryCache = this.f52987OooO0oo ? new o00O0O() : o00O0O0O.OooO0o.f30474OooO00o;
                p113o00O00Oo.OooO0o referenceCounter = this.f52986OooO0oO ? new p113o00O00Oo.OooOOO(weakMemoryCache, oooO2) : p113o00O00Oo.OooOO0.f30232OooO00o;
                Intrinsics.checkNotNullParameter(weakMemoryCache, "weakMemoryCache");
                Intrinsics.checkNotNullParameter(referenceCounter, "referenceCounter");
                if (i2 > 0) {
                    oooO = new o000oOoO(weakMemoryCache, referenceCounter, i2);
                } else {
                    oooO = weakMemoryCache instanceof o00O0O ? new o00O0O0O.OooO(weakMemoryCache) : o00O0O0O.OooO0O0.f30472OooO00o;
                }
                Oooo0 oooo0 = new Oooo0(oooO, weakMemoryCache, referenceCounter, oooO2);
                Context context2 = this.f52980OooO00o;
                o00O0OO0.OooO0O0 oooO0O0 = this.f52981OooO0O0;
                p113o00O00Oo.OooO0O0 oooO0O1 = oooo0.f30502OooO0Oo;
                OooO initializer = new OooO(this);
                o00O o00o2 = p119o00O0Oo0.o00O0O.f30749OooO00o;
                Intrinsics.checkNotNullParameter(initializer, "initializer");
                final Lazy lazy = LazyKt.lazy(initializer);
                o0O0ooO.OooO00o oooO00o = new o0O0ooO.OooO00o() { // from class: o00O0Oo0.o0OoOo0
                    @Override // o0ooo0o0.o0O0ooO.OooO00o
                    public final o0O0ooO OooO0OO(o00OOO00 o00ooo01) {
                        Lazy lazy2 = lazy;
                        Intrinsics.checkNotNullParameter(lazy2, "$lazy");
                        return ((o0O0ooO.OooO00o) lazy2.getValue()).OooO0OO(o00ooo01);
                    }
                };
                OooO0o oooO0o = OooO0OO.OooO0O0.f52978OooO0OO;
                OooO0O0 oooO0O2 = this.f52982OooO0OO;
                if (oooO0O2 == null) {
                    oooO0O2 = new OooO0O0();
                }
                return new OooOOO0(context2, oooO0O0, oooO0O1, oooo0, oooO00o, oooO0o, oooO0O2, this.f52983OooO0Oo);
            } catch (Exception unused) {
                largeMemoryClass = 256;
            }
        }
    }

    @NotNull
    o00O0OO0.OooO0O0 OooO00o();

    @NotNull
    o00O0OO0.OooO0o OooO0O0(@NotNull coil.request.OooO00o oooO00o);

    @Nullable
    Object OooO0OO(@NotNull coil.request.OooO00o oooO00o, @NotNull Continuation<? super o00O0OO0.OooOOO0> continuation);
}

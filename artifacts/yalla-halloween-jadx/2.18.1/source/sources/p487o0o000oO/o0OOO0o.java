package p487o0o000oO;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.d;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p031OoooO.o0000O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0OOO0o f40936OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f40937OooO0O0 = LazyKt.lazy(OooO0o.f40946Oooo0o);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Lazy f40938OooO0OO = LazyKt.lazy(OooO.f40942Oooo0o);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final Lazy f40939OooO0Oo = LazyKt.lazy(OooO0OO.f40945Oooo0o);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final Lazy f40941OooO0o0 = LazyKt.lazy(OooO0O0.f40944Oooo0o);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final Lazy f40940OooO0o = LazyKt.lazy(OooO00o.f40943Oooo0o);

    public static final class OooO extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO f40942Oooo0o = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            Context context = o0000O.f2657OooO00o;
            Context context2 = null;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                context = null;
            }
            PackageManager packageManager = context.getPackageManager();
            Context context3 = o0000O.f2657OooO00o;
            if (context3 != null) {
                context2 = context3;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(d.R);
            }
            return packageManager.getPackageInfo(context2.getPackageName(), 16384).versionName;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f40943Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f40944Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f40945Oooo0o = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            Context context = o0000O.f2657OooO00o;
            Context context2 = null;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                context = null;
            }
            PackageManager packageManager = context.getPackageManager();
            Context context3 = o0000O.f2657OooO00o;
            if (context3 != null) {
                context2 = context3;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(d.R);
            }
            return packageManager.getPackageInfo(context2.getPackageName(), 16384).packageName;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0o f40946Oooo0o = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            Context context = o0000O.f2657OooO00o;
            Context context2 = null;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                context = null;
            }
            PackageManager packageManager = context.getPackageManager();
            Context context3 = o0000O.f2657OooO00o;
            if (context3 != null) {
                context2 = context3;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(d.R);
            }
            return Integer.valueOf(packageManager.getPackageInfo(context2.getPackageName(), 16384).versionCode);
        }
    }

    public static final int OooO00o() {
        return ((Number) f40937OooO0O0.getValue()).intValue();
    }

    @NotNull
    public static final String OooO0O0() {
        Object value = f40938OooO0OO.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-versionName>(...)");
        return (String) value;
    }

    public static final boolean OooO0OO() {
        return ((Boolean) f40940OooO0o.getValue()).booleanValue();
    }

    public static final boolean OooO0Oo() {
        return ((Boolean) f40941OooO0o0.getValue()).booleanValue();
    }
}

package p386o0OOooO;

import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O00O;
import com.common.support.sailfish_commons.logmodels.SecModel;
import com.common.support.zeus.Zeus;
import com.common.support.zeus.ZeusEntity;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nAppInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppInfo.kt\ncom/yalla/yalla/app/appConfig/AppInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
public final class oo0o0Oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public static String f43506OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static boolean f43510OooO0Oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public static SecModel f43515OooOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Lazy f43507OooO00o = LazyKt.lazy(OooOO0.f43521OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f43508OooO0O0 = LazyKt.lazy(OooOO0O.f43522OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Lazy f43509OooO0OO = LazyKt.lazy(OooO.f43516OooO0Oo);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final Lazy f43512OooO0o0 = LazyKt.lazy(OooO0o.f43520OooO0Oo);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final Lazy f43511OooO0o = LazyKt.lazy(OooO0OO.f43519OooO0Oo);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final Lazy f43513OooO0oO = LazyKt.lazy(OooO00o.f43517OooO0Oo);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final Lazy f43514OooO0oo = LazyKt.lazy(OooO0O0.f43518OooO0Oo);

    public static final class OooO extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f43516OooO0Oo = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return o000O00O.OooO00o().getPackageManager().getPackageInfo(o000O00O.OooO00o().getPackageName(), 16384).packageName;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f43517OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ String invoke() {
            return "release";
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f43518OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String packageName = o000O00O.OooO00o().getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            String installingPackageName = Build.VERSION.SDK_INT >= 30 ? o000O00O.OooO00o().getPackageManager().getInstallSourceInfo(packageName).getInstallingPackageName() : o000O00O.OooO00o().getPackageManager().getInstallerPackageName(packageName);
            return installingPackageName == null ? "null" : installingPackageName;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f43519OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f43520OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f43521OooO0Oo = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(o000O00O.OooO00o().getPackageManager().getPackageInfo(o000O00O.OooO00o().getPackageName(), 16384).versionCode);
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0O f43522OooO0Oo = new OooOO0O();

        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return o000O00O.OooO00o().getPackageManager().getPackageInfo(o000O00O.OooO00o().getPackageName(), 16384).versionName;
        }
    }

    @NotNull
    public static ZeusEntity OooO00o(@NotNull String string) {
        ZeusEntity zeusEntitySignWithHmacAndEnableShield$default;
        Intrinsics.checkNotNullParameter(string, "string");
        String str = f43506OooO;
        return (str == null || (zeusEntitySignWithHmacAndEnableShield$default = Zeus.signWithHmacAndEnableShield$default(Zeus.INSTANCE, string, str, (String) null, (Long) null, 12, (Object) null)) == null) ? Zeus.signWithHmac$default(Zeus.INSTANCE, string, (String) null, (Long) null, 6, (Object) null) : zeusEntitySignWithHmacAndEnableShield$default;
    }

    @NotNull
    public static String OooO0O0() {
        Object value = f43509OooO0OO.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (String) value;
    }

    public static int OooO0OO() {
        return ((Number) f43507OooO00o.getValue()).intValue();
    }

    @NotNull
    public static String OooO0Oo() {
        Object value = f43508OooO0O0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (String) value;
    }

    public static final boolean OooO0o() {
        return ((Boolean) f43512OooO0o0.getValue()).booleanValue();
    }

    public static final boolean OooO0o0() {
        return ((Boolean) f43511OooO0o.getValue()).booleanValue();
    }
}

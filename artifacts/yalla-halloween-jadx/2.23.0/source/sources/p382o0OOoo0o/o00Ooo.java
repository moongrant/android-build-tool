package p382o0OOoo0o;

import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O0;
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
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public static String f44283OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static boolean f44287OooO0Oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public static SecModel f44292OooOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Lazy f44284OooO00o = LazyKt.lazy(OooOO0.f44298OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f44285OooO0O0 = LazyKt.lazy(OooOO0O.f44299OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Lazy f44286OooO0OO = LazyKt.lazy(OooO.f44293OooO0Oo);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final Lazy f44289OooO0o0 = LazyKt.lazy(OooO0o.f44297OooO0Oo);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final Lazy f44288OooO0o = LazyKt.lazy(OooO0OO.f44296OooO0Oo);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final Lazy f44290OooO0oO = LazyKt.lazy(OooO00o.f44294OooO0Oo);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final Lazy f44291OooO0oo = LazyKt.lazy(OooO0O0.f44295OooO0Oo);

    public static final class OooO extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f44293OooO0Oo = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return o000O0.OooO00o().getPackageManager().getPackageInfo(o000O0.OooO00o().getPackageName(), 16384).packageName;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f44294OooO0Oo = new OooO00o();

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
        public static final OooO0O0 f44295OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String packageName = o000O0.OooO00o().getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "Utils.context.packageName");
            String installingPackageName = Build.VERSION.SDK_INT >= 30 ? o000O0.OooO00o().getPackageManager().getInstallSourceInfo(packageName).getInstallingPackageName() : o000O0.OooO00o().getPackageManager().getInstallerPackageName(packageName);
            return installingPackageName == null ? "null" : installingPackageName;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f44296OooO0Oo = new OooO0OO();

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
        public static final OooO0o f44297OooO0Oo = new OooO0o();

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
        public static final OooOO0 f44298OooO0Oo = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(o000O0.OooO00o().getPackageManager().getPackageInfo(o000O0.OooO00o().getPackageName(), 16384).versionCode);
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0O f44299OooO0Oo = new OooOO0O();

        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return o000O0.OooO00o().getPackageManager().getPackageInfo(o000O0.OooO00o().getPackageName(), 16384).versionName;
        }
    }

    @NotNull
    public static ZeusEntity OooO00o(@NotNull String string) {
        ZeusEntity zeusEntitySignWithHmacAndEnableShield$default;
        Intrinsics.checkNotNullParameter(string, "string");
        String str = f44283OooO;
        return (str == null || (zeusEntitySignWithHmacAndEnableShield$default = Zeus.signWithHmacAndEnableShield$default(Zeus.INSTANCE, string, str, (String) null, (Long) null, 12, (Object) null)) == null) ? Zeus.signWithHmac$default(Zeus.INSTANCE, string, (String) null, (Long) null, 6, (Object) null) : zeusEntitySignWithHmacAndEnableShield$default;
    }

    @NotNull
    public static String OooO0O0() {
        Object value = f44286OooO0OO.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-packageName>(...)");
        return (String) value;
    }

    public static int OooO0OO() {
        return ((Number) f44284OooO00o.getValue()).intValue();
    }

    @NotNull
    public static String OooO0Oo() {
        Object value = f44285OooO0O0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-versionName>(...)");
        return (String) value;
    }

    public static final boolean OooO0o() {
        return ((Boolean) f44289OooO0o0.getValue()).booleanValue();
    }

    public static final boolean OooO0o0() {
        return ((Boolean) f44288OooO0o.getValue()).booleanValue();
    }
}

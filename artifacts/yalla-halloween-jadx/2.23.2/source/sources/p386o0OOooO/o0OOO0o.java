package p386o0OOooO;

import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.lifecycle.MutableLiveData;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p414o0Oo0oO.oO0Ooooo;
import p415o0Oo0oO0.o00Ooo;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nAppConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppConfig.kt\ncom/yalla/yalla/app/appConfig/AppConfig\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,55:1\n81#2:56\n*S KotlinDebug\n*F\n+ 1 AppConfig.kt\ncom/yalla/yalla/app/appConfig/AppConfig\n*L\n47#1:56\n*E\n"})
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static long f43499OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f43500OooO0O0 = LazyKt.lazy(OooO00o.f43504OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final String f43501OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<Integer> f43502OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int f43503OooO0o0;

    public static final class OooO00o extends Lambda implements Function0<MutableLiveData<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f43504OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Boolean> invoke() {
            return new MutableLiveData<>(Boolean.FALSE);
        }
    }

    static {
        f43501OooO0OO = !oo0o0Oo.OooO0o() ? "https://yallatestfile.yalla.live" : "https://file.yalla.live";
        oO0Ooooo oo0oooooOooO0O0 = o00Ooo.OooO0O0();
        oo0oooooOooO0O0.getClass();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        f43502OooO0Oo = new MutableLiveData<>(Integer.valueOf(oo0oooooOooO0O0.OooO0OO(o0O00oO0.OooOOo0().getValue() + "theme", 1)));
        f43503OooO0o0 = 8;
    }

    @Composable
    public static boolean OooO00o(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-112418976);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-112418976, i, -1, "com.yalla.yalla.app.appConfig.AppConfig.isLightTheme (AppConfig.kt:45)");
        }
        Integer num = (Integer) LiveDataAdapterKt.observeAsState(f43502OooO0Oo, composer, 8).getValue();
        boolean z = false;
        if (num != null && num.intValue() == 0 ? !DarkThemeKt.isSystemInDarkTheme(composer, 0) : !((num == null || num.intValue() != 1) && num != null && num.intValue() == 2)) {
            z = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return z;
    }
}

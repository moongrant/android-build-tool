package p363o0OOo00O;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.OooO;
import androidx.media3.datasource.OooO0o;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.datasource.cache.OooO0O0;
import androidx.media3.exoplayer.offline.OooO00o;
import com.code.android.util.o000O00O;
import com.yalla.yalla.util.cache.VideoPreloadWorker;
import java.io.File;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.Collections;
import java.util.concurrent.Executors;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o000Oo0.OooOO0;
import o000Oo0.Oooo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p072o000O0oO.o0O0O00;
import p083o000Ooo.o00oOoo;
import p362o0OOo00.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static OooO0O0 f43062OooO0O0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public static OooO0o.OooO00o f43064OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public static o00oOoo f43065OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public static CacheDataSource.OooO00o f43066OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public static OooO00o f43067OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooOo00 f43061OooO00o = new OooOo00();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Oooo0 f43063OooO0OO = new Oooo0();

    public final synchronized void OooO00o(Context context) {
        if (f43067OooO0oO == null) {
            f43067OooO0oO = new OooO00o(context, new o0O0O00(OooO0OO()), new OooO0OO((CacheDataSource.OooO00o) OooO0O0(context), Executors.newFixedThreadPool(6)));
        }
    }

    @NotNull
    public final synchronized androidx.media3.datasource.OooO00o.InterfaceC0142OooO00o OooO0O0(@NotNull Context context) {
        CacheDataSource.OooO00o oooO00o;
        Intrinsics.checkNotNullParameter(context, "context");
        if (f43066OooO0o0 == null) {
            OooO oooOOooO0o0 = OooO0o0();
            Intrinsics.checkNotNull(oooOOooO0o0);
            androidx.media3.datasource.OooO0O0.OooO00o oooO00o2 = new androidx.media3.datasource.OooO0O0.OooO00o(context, oooOOooO0o0);
            OooO0O0 oooO0O0OooO0Oo = OooO0Oo(context);
            CacheDataSource.OooO00o oooO00o3 = new CacheDataSource.OooO00o();
            oooO00o3.f7067OooO00o = oooO0O0OooO0Oo;
            oooO00o3.f7070OooO0Oo = oooO00o2;
            oooO00o3.f7071OooO0o0 = 2;
            Intrinsics.checkNotNullExpressionValue(oooO00o3, "setFlags(...)");
            f43066OooO0o0 = oooO00o3;
        }
        oooO00o = f43066OooO0o0;
        Intrinsics.checkNotNull(oooO00o);
        return oooO00o;
    }

    @NotNull
    public final synchronized o00oOoo OooO0OO() {
        o00oOoo o00oooo2;
        if (f43065OooO0o == null) {
            f43065OooO0o = new o00oOoo(o000O00O.OooO00o());
        }
        o00oooo2 = f43065OooO0o;
        Intrinsics.checkNotNull(o00oooo2);
        return o00oooo2;
    }

    @NotNull
    public final synchronized OooO0O0 OooO0Oo(@NotNull Context context) {
        OooO0O0 oooO0O0;
        Intrinsics.checkNotNullParameter(context, "context");
        if (f43062OooO0O0 == null) {
            f43062OooO0O0 = new OooO0O0(new File(context.getCacheDir(), "video_cache"), f43063OooO0OO, OooO0OO());
        }
        oooO0O0 = f43062OooO0O0;
        Intrinsics.checkNotNull(oooO0O0);
        return oooO0O0;
    }

    public final void OooO0o(@Nullable final String str, @NotNull final VideoPreloadWorker.OooO00o onProgress) {
        Object objM4215constructorimpl;
        Intrinsics.checkNotNullParameter(onProgress, "onProgress");
        try {
            Result.Companion companion = Result.INSTANCE;
            DataSpec dataSpec = new DataSpec(Uri.parse(str), 0L, 1, null, Collections.emptyMap(), 0L, 1048576L, str, 0, null);
            try {
                androidx.media3.datasource.OooO00o OooO00o2 = ((CacheDataSource.OooO00o) OooO0O0(o000O00O.OooO00o())).OooO00o();
                Intrinsics.checkNotNull(OooO00o2, "null cannot be cast to non-null type androidx.media3.datasource.cache.CacheDataSource");
                new OooOO0((CacheDataSource) OooO00o2, dataSpec, new OooOO0.OooO00o() { // from class: o0OOo00O.OooOOOO
                    @Override // o000Oo0.OooOO0.OooO00o
                    public final void onProgress(long j, long j2) {
                        Function1 onProgress2 = onProgress;
                        Intrinsics.checkNotNullParameter(onProgress2, "$onProgress");
                        float f = (j2 * 100.0f) / j;
                        if (Float.isNaN(f) || f <= 0.0f || f > 100.0f) {
                            return;
                        }
                        onProgress2.invoke(Float.valueOf(f));
                        Log.e("VideoCache", "preCacheVideo videoUrl " + str + ",downloadPercentage is :" + f);
                    }
                }).OooO00o();
                objM4215constructorimpl = Result.m4215constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                th = th;
                Result.Companion companion2 = Result.INSTANCE;
                objM4215constructorimpl = Result.m4215constructorimpl(ResultKt.createFailure(th));
            }
        } catch (Throwable th2) {
            th = th2;
        }
        Throwable thM4218exceptionOrNullimpl = Result.m4218exceptionOrNullimpl(objM4215constructorimpl);
        if (thM4218exceptionOrNullimpl != null) {
            thM4218exceptionOrNullimpl.printStackTrace();
        }
    }

    @Nullable
    public final synchronized OooO OooO0o0() {
        OooO0o.OooO00o oooO00o = f43064OooO0Oo;
        if (oooO00o == null && oooO00o == null) {
            CookieManager cookieManager = new CookieManager();
            cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
            CookieHandler.setDefault(cookieManager);
            OooO0o.OooO00o oooO00o2 = new OooO0o.OooO00o();
            oooO00o2.f7019OooO0o0 = true;
            f43064OooO0Oo = oooO00o2;
        }
        return f43064OooO0Oo;
    }
}

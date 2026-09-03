package com.yalla.yalla.util.cache;

import android.content.Context;
import android.net.Uri;
import androidx.compose.animation.OooO;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.OooO0o;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.OooO0O0;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import o0OOo000.OooOOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140o00OOooo.OooOO0;
import p246o00oo0o0.o000O0O0;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o00Ooo;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/util/cache/VideoPreloadWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class VideoPreloadWorker extends Worker {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public static final Map<Long, Float> f32839OooOOOO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final Context f32840OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public Job f32841OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public OooO0o.OooO00o f32842OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f32843OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public CacheDataSource f32844OooOOO0;

    @DebugMetadata(c = "com.yalla.yalla.util.cache.VideoPreloadWorker$preCacheVideo$1", f = "VideoPreloadWorker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o000O0O0.OooO00o f32846OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ DataSpec f32847OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f32848OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(DataSpec dataSpec, o000O0O0.OooO00o oooO00o, String str, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f32847OooO0o0 = dataSpec;
            this.f32846OooO0o = oooO00o;
            this.f32848OooO0oO = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return VideoPreloadWorker.this.new OooO00o(this.f32847OooO0o0, this.f32846OooO0o, this.f32848OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM4213constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            DataSpec dataSpec = this.f32847OooO0o0;
            o000O0O0.OooO00o oooO00o = this.f32846OooO0o;
            Map<Long, Float> map = VideoPreloadWorker.f32839OooOOOO;
            VideoPreloadWorker videoPreloadWorker = VideoPreloadWorker.this;
            videoPreloadWorker.getClass();
            try {
                Result.Companion companion = Result.INSTANCE;
                CacheDataSource cacheDataSource = videoPreloadWorker.f32844OooOOO0;
                if (cacheDataSource == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCacheDataSource");
                    cacheDataSource = null;
                }
                new o000O0O0(cacheDataSource, dataSpec, oooO00o).OooO00o();
                objM4213constructorimpl = Result.m4213constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM4213constructorimpl = Result.m4213constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM4216exceptionOrNullimpl = Result.m4216exceptionOrNullimpl(objM4213constructorimpl);
            if (thM4216exceptionOrNullimpl != null) {
                thM4216exceptionOrNullimpl.printStackTrace();
            }
            videoPreloadWorker.OooO(this.f32848OooO0oO);
            return Unit.INSTANCE;
        }
    }

    static {
        Map<Long, Float> linkedHashMap;
        o00Ooo o00oooOooO00o = o00Oo0.OooO00o();
        o00oooOooO00o.getClass();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        String strOooO0o0 = o00oooOooO00o.OooO0o0("momentVideoCache" + o000000O.OooOOo0().getValue(), "");
        Type type = new TypeToken<Map<Long, ? extends Float>>() { // from class: com.yalla.yalla.data.sp.table.AccountSpTable$momentVideoCacheMap$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<Map<Long, Float>>() {}.type");
        Map map = (Map) OooOO0.OooO0OO(strOooO0o0, type);
        if (map == null || (linkedHashMap = MapsKt.toMutableMap(map)) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        f32839OooOOOO = linkedHashMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPreloadWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.f32840OooOO0 = context;
        this.f32843OooOOO = OooOOO0.OooO00o(context);
    }

    public final void OooO(String str) {
        this.f32841OooOO0O = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new OooO00o(new DataSpec(Uri.parse(str)), new OooO(), str, null), 2, null);
    }

    @Override // androidx.work.Worker
    @NotNull
    public final ListenableWorker.OooO00o OooO0oo() {
        try {
            Object obj = this.f8373OooO0o0.f8394OooO0O0.f8388OooO00o.get("video_url");
            String str = obj instanceof String ? (String) obj : null;
            Map<Long, Float> map = f32839OooOOOO;
            if (!Intrinsics.areEqual(map.get(Long.valueOf(Math.abs(str != null ? str.hashCode() : 0))), 0.0f)) {
                ListenableWorker.OooO00o.OooO0OO oooO0OO = new ListenableWorker.OooO00o.OooO0OO();
                Intrinsics.checkNotNullExpressionValue(oooO0OO, "success()");
                return oooO0OO;
            }
            OooO0o.OooO00o oooO00o = new OooO0o.OooO00o();
            oooO00o.f14244OooO0o0 = true;
            Intrinsics.checkNotNullExpressionValue(oooO00o, "Factory()\n              …ssProtocolRedirects(true)");
            this.f32842OooOO0o = oooO00o;
            this.f32840OooOO0.getApplicationContext();
            OooO0O0 oooO0O0 = this.f32843OooOOO;
            OooO0o.OooO00o oooO00o2 = this.f32842OooOO0o;
            if (oooO00o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHttpDataSourceFactory");
                oooO00o2 = null;
            }
            com.google.android.exoplayer2.upstream.OooO00o OooO00o2 = oooO00o2 != null ? oooO00o2.OooO00o() : null;
            oooO0O0.getClass();
            CacheDataSource cacheDataSource = new CacheDataSource(oooO0O0, OooO00o2, new FileDataSource(), OooO00o2 != null ? new CacheDataSink(oooO0O0) : null, 0);
            Intrinsics.checkNotNullExpressionValue(cacheDataSource, "Factory()\n              …      .createDataSource()");
            this.f32844OooOOO0 = cacheDataSource;
            OooO(str);
            map.put(Long.valueOf(Math.abs(str != null ? str.hashCode() : 0)), Float.valueOf(1.0f));
            ListenableWorker.OooO00o.OooO0OO oooO0OO2 = new ListenableWorker.OooO00o.OooO0OO();
            Intrinsics.checkNotNullExpressionValue(oooO0OO2, "success()");
            return oooO0OO2;
        } catch (Exception unused) {
            ListenableWorker.OooO00o.C0165OooO00o c0165OooO00o = new ListenableWorker.OooO00o.C0165OooO00o();
            Intrinsics.checkNotNullExpressionValue(c0165OooO00o, "failure()");
            return c0165OooO00o;
        }
    }
}

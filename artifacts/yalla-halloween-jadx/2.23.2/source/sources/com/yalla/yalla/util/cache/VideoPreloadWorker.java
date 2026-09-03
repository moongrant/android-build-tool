package com.yalla.yalla.util.cache;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.work.OooO0OO;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p187o00o00o0.OooO;
import p363o0OOo00O.OooOo00;
import p414o0Oo0oO.oO000O0;
import p415o0Oo0oO0.o00Ooo;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/util/cache/VideoPreloadWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class VideoPreloadWorker extends Worker {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public static final Map<Long, Float> f32303OooO;

    public static final class OooO00o extends Lambda implements Function1<Float, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f32304OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str) {
            super(1);
            this.f32304OooO0Oo = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Float f) {
            Float fValueOf = Float.valueOf(f.floatValue());
            Map<Long, Float> map = VideoPreloadWorker.f32303OooO;
            String str = this.f32304OooO0Oo;
            map.put(Long.valueOf(Math.abs(str != null ? str.hashCode() : 0)), fValueOf);
            return Unit.INSTANCE;
        }
    }

    static {
        Map<Long, Float> linkedHashMap;
        oO000O0 oo000o0OooO00o = o00Ooo.OooO00o();
        oo000o0OooO00o.getClass();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        String strOooO0o0 = oo000o0OooO00o.OooO0o0("momentVideoCache" + o0O00oO0.OooOOo0().getValue(), "");
        Type type = new TypeToken<Map<Long, ? extends Float>>() { // from class: com.yalla.yalla.data.sp.table.AccountSpTable$momentVideoCacheMap$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Map map = (Map) OooO.OooO0OO(strOooO0o0, type);
        if (map == null || (linkedHashMap = MapsKt.toMutableMap(map)) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        f32303OooO = linkedHashMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPreloadWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        OooOo00.f43061OooO00o.OooO0Oo(context);
    }

    @Override // androidx.work.Worker
    @NotNull
    public final OooO0OO.OooO00o OooO0oO() {
        try {
            String strOooO0O0 = this.f11478OooO0o0.f11488OooO0O0.OooO0O0("video_url");
            OooOo00.f43061OooO00o.OooO0o(strOooO0O0, new OooO00o(strOooO0O0));
            OooO0OO.OooO00o.C0186OooO0OO c0186OooO0OO = new OooO0OO.OooO00o.C0186OooO0OO();
            Intrinsics.checkNotNullExpressionValue(c0186OooO0OO, "success(...)");
            return c0186OooO0OO;
        } catch (Exception unused) {
            OooO0OO.OooO00o.C0185OooO00o c0185OooO00o = new OooO0OO.OooO00o.C0185OooO00o();
            Intrinsics.checkNotNullExpressionValue(c0185OooO00o, "failure(...)");
            return c0185OooO00o;
        }
    }
}

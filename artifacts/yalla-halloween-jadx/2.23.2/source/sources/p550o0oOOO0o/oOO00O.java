package p550o0oOOO0o;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.model.media.MediaVideoInfo;
import com.yalla.yalla.module.media.utils.FFmpegCmdResult;
import java.io.IOException;
import java.text.SimpleDateFormat;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p460o0Ooo0o.o00O;
import p460o0Ooo0o.o00O0OO0;
import p460o0Ooo0o.oo0O;
import p551o0oOOOoo.o0oo0000;
import p551o0oOOOoo.oO0Oo;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.module.media.preview.MediaPreviewScreenKt$realCutVideo$1", f = "MediaPreviewScreen.kt", i = {0, 1}, l = {523, 531}, m = "invokeSuspend", n = {"$this$async", "$this$async"}, s = {"L$0", "L$0"})
public final class oOO00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f56004OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o00O00OO f56005OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f56006OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ oO0Oo f56007OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f56008OooO0oo;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f56009OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MutableState<Boolean> mutableState) {
            super(0);
            this.f56009OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f56009OooO0Oo.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00O(o00O00OO o00o00oo2, oO0Oo oo0oo, MutableState<Boolean> mutableState, Continuation<? super oOO00O> continuation) {
        super(2, continuation);
        this.f56005OooO0o = o00o00oo2;
        this.f56007OooO0oO = oo0oo;
        this.f56008OooO0oo = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        oOO00O ooo00o = new oOO00O(this.f56005OooO0o, this.f56007OooO0oO, this.f56008OooO0oo, continuation);
        ooo00o.f56006OooO0o0 = obj;
        return ooo00o;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
        return ((oOO00O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws IOException {
        CoroutineScope coroutineScope;
        CoroutineScope coroutineScope2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f56004OooO0Oo;
        MutableState<Boolean> mutableState = this.f56008OooO0oo;
        o00O00OO o00o00oo2 = this.f56005OooO0o;
        if (i != 0) {
            if (i == 1) {
                coroutineScope = (CoroutineScope) this.f56006OooO0o0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope2 = (CoroutineScope) this.f56006OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            CoroutineScopeKt.cancel$default(coroutineScope2, null, 1, null);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope3 = (CoroutineScope) this.f56006OooO0o0;
        MediaVideoInfo videoInfo = o00o00oo2.OooO0Oo().getVideoInfo();
        Intrinsics.checkNotNull(videoInfo);
        if (videoInfo.getVideoPlayRangeStart() == 0) {
            MediaVideoInfo videoInfo2 = o00o00oo2.OooO0Oo().getVideoInfo();
            Intrinsics.checkNotNull(videoInfo2);
            if (videoInfo2.getVideoPlayRangeEnd() == o00o00oo2.OooO0Oo().getVideoDuration()) {
                return new o00O(FFmpegCmdResult.Success, o00o00oo2.OooO0Oo().getRealFilePath());
            }
        }
        String realFilePath = o00o00oo2.OooO0Oo().getRealFilePath();
        MediaVideoInfo videoInfo3 = o00o00oo2.OooO0Oo().getVideoInfo();
        Intrinsics.checkNotNull(videoInfo3);
        float videoPlayRangeStart = videoInfo3.getVideoPlayRangeStart() / 1000.0f;
        MediaVideoInfo videoInfo4 = o00o00oo2.OooO0Oo().getVideoInfo();
        Intrinsics.checkNotNull(videoInfo4);
        o0oo0000 o0oo0000Var = new o0oo0000(realFilePath, videoPlayRangeStart, videoInfo4.getVideoPlayRangeEnd() / 1000.0f, o00o00oo2.OooO0oO() / 100);
        oo0O oo0o = oo0O.f47807OooO00o;
        Lazy lazy = o00O0OO0.f47783OooO00o;
        String str = o00O0OO0.OooO0OO().getAbsolutePath() + "/" + ((SimpleDateFormat) o00O0OO0.f47783OooO00o.getValue()).format(Long.valueOf(System.currentTimeMillis())) + ".mp4";
        OooO00o oooO00o = new OooO00o(mutableState);
        this.f56006OooO0o0 = coroutineScope3;
        this.f56004OooO0Oo = 1;
        Object objOooO0OO = oo0o.OooO0OO(o0oo0000Var, str, oooO00o, this);
        if (objOooO0OO == coroutine_suspended) {
            return coroutine_suspended;
        }
        coroutineScope = coroutineScope3;
        obj = objOooO0OO;
        o00O o00o2 = (o00O) obj;
        FFmpegCmdResult fFmpegCmdResult = o00o2.f47776OooO00o;
        if (fFmpegCmdResult == FFmpegCmdResult.Success) {
            this.f56007OooO0oO.f56016OooO00o = true;
            return o00o2;
        }
        this.f56006OooO0o0 = coroutineScope;
        this.f56004OooO0Oo = 2;
        if (o00O0000.OooO0o(mutableState, fFmpegCmdResult, o00o00oo2, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        coroutineScope2 = coroutineScope;
        CoroutineScopeKt.cancel$default(coroutineScope2, null, 1, null);
        return Unit.INSTANCE;
    }
}

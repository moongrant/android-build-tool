package p550o0oOOO0o;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.model.media.SelectMusicModel;
import com.yalla.yalla.module.media.utils.FFmpegCmdResult;
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
@DebugMetadata(c = "com.yalla.yalla.module.media.preview.MediaPreviewScreenKt$realCutAudio$1", f = "MediaPreviewScreen.kt", i = {0, 1}, l = {495, 505}, m = "invokeSuspend", n = {"$this$async", "$this$async"}, s = {"L$0", "L$0"})
public final class o00O00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f55963OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o00O00OO f55964OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f55965OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ oO0Oo f55966OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f55967OooO0oo;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f55968OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MutableState<Boolean> mutableState) {
            super(0);
            this.f55968OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f55968OooO0Oo.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00O(o00O00OO o00o00oo2, oO0Oo oo0oo, MutableState<Boolean> mutableState, Continuation<? super o00O00O> continuation) {
        super(2, continuation);
        this.f55964OooO0o = o00o00oo2;
        this.f55966OooO0oO = oo0oo;
        this.f55967OooO0oo = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o00O00O o00o00o2 = new o00O00O(this.f55964OooO0o, this.f55966OooO0oO, this.f55967OooO0oo, continuation);
        o00o00o2.f55965OooO0o0 = obj;
        return o00o00o2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
        return ((o00O00O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CoroutineScope coroutineScope;
        CoroutineScope coroutineScope2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f55963OooO0Oo;
        MutableState<Boolean> mutableState = this.f55967OooO0oo;
        o00O00OO o00o00oo2 = this.f55964OooO0o;
        if (i != 0) {
            if (i == 1) {
                coroutineScope = (CoroutineScope) this.f55965OooO0o0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope2 = (CoroutineScope) this.f55965OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            CoroutineScopeKt.cancel$default(coroutineScope2, null, 1, null);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope3 = (CoroutineScope) this.f55965OooO0o0;
        SelectMusicModel value = o00o00oo2.f55974OooO0o.getValue();
        if (value == null) {
            return null;
        }
        o0oo0000 o0oo0000Var = new o0oo0000(value.getFilePath(), value.getStartPosition() / 1000.0f, o00o00oo2.f55977OooO0oo / 1000.0f, o00o00oo2.OooO0O0() / 100);
        oo0O oo0o = oo0O.f47807OooO00o;
        Lazy lazy = o00O0OO0.f47783OooO00o;
        String str = o00O0OO0.OooO0OO().getAbsolutePath() + "/" + ((SimpleDateFormat) o00O0OO0.f47783OooO00o.getValue()).format(Long.valueOf(System.currentTimeMillis())) + ".aac";
        OooO00o oooO00o = new OooO00o(mutableState);
        this.f55965OooO0o0 = coroutineScope3;
        this.f55963OooO0Oo = 1;
        Object objOooO0O0 = oo0o.OooO0O0(o0oo0000Var, str, oooO00o, this);
        if (objOooO0O0 == coroutine_suspended) {
            return coroutine_suspended;
        }
        coroutineScope = coroutineScope3;
        obj = objOooO0O0;
        o00O o00o2 = (o00O) obj;
        FFmpegCmdResult fFmpegCmdResult = o00o2.f47776OooO00o;
        if (fFmpegCmdResult == FFmpegCmdResult.Success) {
            this.f55966OooO0oO.f56017OooO0O0 = true;
            return o00o2;
        }
        this.f55965OooO0o0 = coroutineScope;
        this.f55963OooO0Oo = 2;
        if (o00O0000.OooO0o(mutableState, fFmpegCmdResult, o00o00oo2, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        coroutineScope2 = coroutineScope;
        CoroutineScopeKt.cancel$default(coroutineScope2, null, 1, null);
        return Unit.INSTANCE;
    }
}

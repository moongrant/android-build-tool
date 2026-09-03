package p455o0Ooo0O0;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
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
import p453o0Ooo00o.o00Oo0;
import p453o0Ooo00o.o00Ooo;
import p468o0OoooO0.o0OO0;
import p468o0OoooO0.o0OO0oO0;
import p468o0OoooO0.o0OOOO00;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.module.media.preview.MediaPreviewScreenKt$realCutAudio$1", f = "MediaPreviewScreen.kt", i = {0, 1}, l = {492, YallaTeamMessage.JumpId.RoomList_Recommended}, m = "invokeSuspend", n = {"$this$async", "$this$async"}, s = {"L$0", "L$0"})
public final class o0Oo0oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f46583OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ oo0o0Oo f46584OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f46585OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f46586OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f46587OooO0oo;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f46588OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MutableState<Boolean> mutableState) {
            super(0);
            this.f46588OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f46588OooO0Oo.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0Oo0oo(oo0o0Oo oo0o0oo, o00Oo0 o00oo1, MutableState<Boolean> mutableState, Continuation<? super o0Oo0oo> continuation) {
        super(2, continuation);
        this.f46584OooO0o = oo0o0oo;
        this.f46586OooO0oO = o00oo1;
        this.f46587OooO0oo = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o0Oo0oo o0oo0oo2 = new o0Oo0oo(this.f46584OooO0o, this.f46586OooO0oO, this.f46587OooO0oo, continuation);
        o0oo0oo2.f46585OooO0o0 = obj;
        return o0oo0oo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
        return ((o0Oo0oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CoroutineScope coroutineScope;
        CoroutineScope coroutineScope2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f46583OooO0Oo;
        MutableState<Boolean> mutableState = this.f46587OooO0oo;
        oo0o0Oo oo0o0oo = this.f46584OooO0o;
        if (i != 0) {
            if (i == 1) {
                coroutineScope = (CoroutineScope) this.f46585OooO0o0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope2 = (CoroutineScope) this.f46585OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            CoroutineScopeKt.cancel$default(coroutineScope2, null, 1, null);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope3 = (CoroutineScope) this.f46585OooO0o0;
        SelectMusicModel value = oo0o0oo.f46603OooO0o.getValue();
        if (value == null) {
            return null;
        }
        o00Ooo o00ooo2 = new o00Ooo(value.getFilePath(), value.getStartPosition() / 1000.0f, oo0o0oo.f46606OooO0oo / 1000.0f, oo0o0oo.OooO0O0() / 100);
        o0OOOO00 o0oooo01 = o0OOOO00.f46930OooO00o;
        Lazy lazy = o0OO0.f46906OooO00o;
        String str = o0OO0.OooO0OO().getAbsolutePath() + "/" + ((SimpleDateFormat) o0OO0.f46906OooO00o.getValue()).format(Long.valueOf(System.currentTimeMillis())) + ".aac";
        OooO00o oooO00o = new OooO00o(mutableState);
        this.f46585OooO0o0 = coroutineScope3;
        this.f46583OooO0Oo = 1;
        Object objOooO0O0 = o0oooo01.OooO0O0(o00ooo2, str, oooO00o, this);
        if (objOooO0O0 == coroutine_suspended) {
            return coroutine_suspended;
        }
        coroutineScope = coroutineScope3;
        obj = objOooO0O0;
        o0OO0oO0 o0oo0oo1 = (o0OO0oO0) obj;
        FFmpegCmdResult fFmpegCmdResult = o0oo0oo1.f46917OooO00o;
        if (fFmpegCmdResult == FFmpegCmdResult.Success) {
            this.f46586OooO0oO.f46490OooO0O0 = true;
            return o0oo0oo1;
        }
        this.f46585OooO0o0 = coroutineScope;
        this.f46583OooO0Oo = 2;
        if (o00Oo0.OooO0o(mutableState, fFmpegCmdResult, oo0o0oo, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        coroutineScope2 = coroutineScope;
        CoroutineScopeKt.cancel$default(coroutineScope2, null, 1, null);
        return Unit.INSTANCE;
    }
}

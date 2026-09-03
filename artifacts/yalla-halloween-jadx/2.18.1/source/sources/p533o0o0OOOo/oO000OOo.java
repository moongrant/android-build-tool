package p533o0o0OOOo;

import com.app.base.model.SilenceModel;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.model.RoomUserInfoModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p498o0o00Oo0.OooOOO;
import p530o0o0OOO.o00O;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMicMsgProcessor$parseBeBarredSpeakingMessage$1", f = "RoomMicMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class oO000OOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ SilenceModel f43478Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000OOo(SilenceModel silenceModel, Continuation<? super oO000OOo> continuation) {
        super(2, continuation);
        this.f43478Oooo0o = silenceModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oO000OOo(this.f43478Oooo0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oO000OOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        RoomUserInfoModel roomUserInfoModelOooOO0 = o00O.f43140OooO00o.OooOO0(this.f43478Oooo0o.to.uid);
        if (roomUserInfoModelOooOO0 != null) {
            roomUserInfoModelOooOO0.setSilenced(this.f43478Oooo0o.silence);
        }
        Long value = OooOOO.f41216OooO00o.OooOo().getValue();
        long j = this.f43478Oooo0o.to.uid;
        if (value != null && value.longValue() == j) {
            if (this.f43478Oooo0o.silence) {
                ToastUtil.f12567OooO00o.OooO0O0(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.dailog_isSilence_1), this.f43478Oooo0o.from.name));
            } else {
                ToastUtil.f12567OooO00o.OooO0O0(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.dailog_isSilence_0), this.f43478Oooo0o.from.name));
            }
        }
        return Unit.INSTANCE;
    }
}

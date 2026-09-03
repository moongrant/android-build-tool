package p477o0o000O;

import com.app.base.protobuf.room.Room;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO00o;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p464o0Oooo.o000000O;
import p475o0o000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMicMsgProcessor$parseMagicVoiceExpireMsg$1", f = "RoomMicMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o00Ooo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Room.MagicVoiceExpireNotify f47619OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(Room.MagicVoiceExpireNotify magicVoiceExpireNotify, Continuation<? super o00Ooo> continuation) {
        super(2, continuation);
        this.f47619OooO0Oo = magicVoiceExpireNotify;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00Ooo(this.f47619OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00Ooo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ArrayList arrayList = OooO00o.f24973OooO00o;
        Room.MagicVoiceExpireNotify magicVoiceExpireNotify = this.f47619OooO0Oo;
        RoomUserInfoModel roomUserInfoModelOooO0o0 = OooO00o.OooO0o0(Boxing.boxLong(magicVoiceExpireNotify.getUserId()));
        MutableStateFlow<Integer> voiceChangerId = roomUserInfoModelOooO0o0 != null ? roomUserInfoModelOooO0o0.getVoiceChangerId() : null;
        if (voiceChangerId != null) {
            voiceChangerId.setValue(Boxing.boxInt(0));
        }
        long userId = magicVoiceExpireNotify.getUserId();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l = (Long) o000000O.OooOOo0().getValue();
        if (l != null && userId == l.longValue()) {
            o000000 o000000Var = OooO00o.f24979OooO0oO;
            if (o000000Var.f47371OooO00o.getValue().booleanValue()) {
                o000000Var.f47370OooO.setValue(Boxing.boxInt(0));
            }
        }
        return Unit.INSTANCE;
    }
}

package p485o0o000oO;

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
import p475o0Ooooo0.o0O00oO0;
import p483o0o000Oo.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMicMsgProcessor$parseMagicVoiceExpireMsg$1", f = "RoomMicMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o00O0000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Room.MagicVoiceExpireNotify f48685OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0000(Room.MagicVoiceExpireNotify magicVoiceExpireNotify, Continuation<? super o00O0000> continuation) {
        super(2, continuation);
        this.f48685OooO0Oo = magicVoiceExpireNotify;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O0000(this.f48685OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00O0000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ArrayList arrayList = OooO00o.f24511OooO00o;
        Room.MagicVoiceExpireNotify magicVoiceExpireNotify = this.f48685OooO0Oo;
        RoomUserInfoModel roomUserInfoModelOooO0o0 = OooO00o.OooO0o0(Boxing.boxLong(magicVoiceExpireNotify.getUserId()));
        MutableStateFlow<Integer> voiceChangerId = roomUserInfoModelOooO0o0 != null ? roomUserInfoModelOooO0o0.getVoiceChangerId() : null;
        if (voiceChangerId != null) {
            voiceChangerId.setValue(Boxing.boxInt(0));
        }
        long userId = magicVoiceExpireNotify.getUserId();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Long l = (Long) o0O00oO0.OooOOo0().getValue();
        if (l != null && userId == l.longValue()) {
            o0000oo o0000ooVar = OooO00o.f24517OooO0oO;
            if (o0000ooVar.f48576OooO00o.getValue().booleanValue()) {
                o0000ooVar.f48575OooO.setValue(Boxing.boxInt(0));
            }
        }
        return Unit.INSTANCE;
    }
}

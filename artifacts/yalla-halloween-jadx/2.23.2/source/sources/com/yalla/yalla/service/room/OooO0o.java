package com.yalla.yalla.service.room;

import com.yalla.yalla.model.room.RoomVoiceModule;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p356o0OOOoO.Oooo000;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.RoomLiveService$audioChatCallback$1$onAudioVolumeIndication$1$1", f = "RoomLiveService.kt", i = {}, l = {571}, m = "invokeSuspend", n = {}, s = {})
public final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f24594OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f24595OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(Oooo000 oooo000, Continuation<? super OooO0o> continuation) {
        super(2, continuation);
        this.f24595OooO0o0 = oooo000;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooO0o(this.f24595OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0055 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        long j;
        Long lBoxLong;
        MutableSharedFlow<Pair<Long, Integer>> mutableSharedFlow;
        Pair<Long, Integer> pair;
        List<RoomVoiceModule.TimeVoice> timeVoice;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f24594OooO0Oo;
        Oooo000 oooo000 = this.f24595OooO0o0;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int i2 = oooo000.f42913OooO00o;
            if (i2 == 0) {
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                lBoxLong = (Long) o0O00oO0.OooOOo0().getValue();
                if (lBoxLong == null) {
                    j = 0;
                }
                long jLongValue = lBoxLong.longValue();
                mutableSharedFlow = OooO00o.f24517OooO0oO.f48582OooO0oO;
                pair = new Pair<>(Boxing.boxLong(jLongValue), Boxing.boxInt(oooo000.f42914OooO0O0));
                this.f24594OooO0Oo = 1;
                if (mutableSharedFlow.emit(pair, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                j = i2;
            }
            lBoxLong = Boxing.boxLong(j);
            long jLongValue2 = lBoxLong.longValue();
            mutableSharedFlow = OooO00o.f24517OooO0oO.f48582OooO0oO;
            pair = new Pair<>(Boxing.boxLong(jLongValue2), Boxing.boxInt(oooo000.f42914OooO0O0));
            this.f24594OooO0Oo = 1;
            if (mutableSharedFlow.emit(pair, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        long jOooO0o0 = OooO00o.f24516OooO0o0.OooO0o0();
        int i3 = oooo000.f42914OooO0O0;
        if (i3 > 0) {
            if (p489o0o00O00.OooO0OO.f48920OooO0OO == null) {
                RoomVoiceModule roomVoiceModule = new RoomVoiceModule();
                p489o0o00O00.OooO0OO.f48920OooO0OO = roomVoiceModule;
                roomVoiceModule.setRoomId(jOooO0o0);
            }
            RoomVoiceModule roomVoiceModule2 = p489o0o00O00.OooO0OO.f48920OooO0OO;
            if (roomVoiceModule2 != null && (timeVoice = roomVoiceModule2.getTimeVoice()) != null) {
                timeVoice.add(new RoomVoiceModule.TimeVoice(System.currentTimeMillis(), i3));
            }
            if (p489o0o00O00.OooO0OO.f48919OooO0O0 == null) {
                p489o0o00O00.OooO0OO.f48919OooO0O0 = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new p489o0o00O00.OooO0o(null), 3, null);
            }
        }
        return Unit.INSTANCE;
    }
}

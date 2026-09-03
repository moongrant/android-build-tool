package p533o0o0OOOo;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomCommonMsgProcessor$parseRoomInfoChangedMessage$1", f = "RoomCommonMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class oO0000Oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ JSONObject f43454Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000Oo(JSONObject jSONObject, Continuation<? super oO0000Oo> continuation) {
        super(2, continuation);
        this.f43454Oooo0o = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oO0000Oo(this.f43454Oooo0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oO0000Oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.f43454Oooo0o.has("dues")) {
            o00OO00O.f43313OooooOo.OooO00o().f43338OooOo0o.setValue(Boxing.boxInt(this.f43454Oooo0o.getInt("dues")));
        }
        if (this.f43454Oooo0o.has("sumamount")) {
            o00O.OooO00o.f43196OooO00o.OooO00o(this.f43454Oooo0o.getLong("sumamount"));
        }
        if (this.f43454Oooo0o.has("background")) {
            o00OO00O.f43313OooooOo.OooO00o().f43330OooOOOo.setValue(this.f43454Oooo0o.getString("background"));
        }
        if (this.f43454Oooo0o.has("backgroundvideo")) {
            o00OO00O.f43313OooooOo.OooO00o().f43332OooOOo0.setValue(this.f43454Oooo0o.getString("backgroundvideo"));
        }
        return Unit.INSTANCE;
    }
}

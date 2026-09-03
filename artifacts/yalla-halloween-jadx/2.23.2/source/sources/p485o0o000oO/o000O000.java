package p485o0o000oO;

import com.code.android.util.OooOOO;
import com.yalla.yalla.data.db.model.RoomTheme;
import com.yalla.yalla.service.room.OooO0O0;
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
import org.json.JSONException;
import org.json.JSONObject;
import p408o0Oo0Oo0.o00Oo0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomCommonMsgProcessor$parseRoomInfoChangedMessage$1", f = "RoomCommonMsgProcessor.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
public final class o000O000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f48669OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ JSONObject f48670OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomCommonMsgProcessor$parseRoomInfoChangedMessage$1$1", f = "RoomCommonMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomTheme f48671OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(RoomTheme roomTheme, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f48671OooO0Oo = roomTheme;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f48671OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00Oo0.OooO00o().OooOooO().OooO00o(this.f48671OooO0Oo);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(JSONObject jSONObject, Continuation<? super o000O000> continuation) {
        super(2, continuation);
        this.f48670OooO0o0 = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000O000(this.f48670OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000O000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws JSONException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f48669OooO0Oo;
        OooO0O0.OooO00o oooO00o = OooO0O0.f24533OoooOOO;
        JSONObject jSONObject = this.f48670OooO0o0;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (jSONObject.has("dues")) {
                oooO00o.OooO00o().f24552OooOOo0.setValue(Boxing.boxInt(jSONObject.getInt("dues")));
            }
            if (jSONObject.has("sumamount")) {
                com.yalla.yalla.service.room.OooO00o.f24510OooO.f48637OooO00o.setValue(Long.valueOf(jSONObject.getLong("sumamount")));
            }
            if (jSONObject.has("background")) {
                String string = jSONObject.getString("background");
                oooO00o.OooO00o().f24548OooOOO0.setValue(string);
                RoomTheme roomTheme = new RoomTheme();
                roomTheme.roomId = com.yalla.yalla.service.room.OooO00o.f24516OooO0o0.OooO0o0();
                roomTheme.roomTheme = string;
                OooO00o oooO00o2 = new OooO00o(roomTheme, null);
                this.f48669OooO0Oo = 1;
                if (OooOOO.OooO0Oo(oooO00o2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (jSONObject.has("backgroundvideo")) {
            oooO00o.OooO00o().f24547OooOOO.setValue(jSONObject.getString("backgroundvideo"));
        }
        if (jSONObject.has("image")) {
            oooO00o.OooO00o().f24536OooO00o.setValue(jSONObject.getString("image"));
        }
        return Unit.INSTANCE;
    }
}

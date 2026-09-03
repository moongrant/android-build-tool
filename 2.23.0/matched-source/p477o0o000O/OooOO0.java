package p477o0o000O;

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
import p581o0oOoo00.o000OOo;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomCommonMsgProcessor$parseRoomInfoChangedMessage$1", f = "RoomCommonMsgProcessor.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
public final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f47603OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ JSONObject f47604OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomCommonMsgProcessor$parseRoomInfoChangedMessage$1$1", f = "RoomCommonMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomTheme f47605OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(RoomTheme roomTheme, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f47605OooO0Oo = roomTheme;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f47605OooO0Oo, continuation);
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
            o000OOo.OooO00o().OooOoo().OooO00o(this.f47605OooO0Oo);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(JSONObject jSONObject, Continuation<? super OooOO0> continuation) {
        super(2, continuation);
        this.f47604OooO0o0 = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOO0(this.f47604OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws JSONException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f47603OooO0Oo;
        OooO0O0.OooO00o oooO00o = OooO0O0.f24995OoooOOO;
        JSONObject jSONObject = this.f47604OooO0o0;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (jSONObject.has("dues")) {
                oooO00o.OooO00o().f25014OooOOo0.setValue(Boxing.boxInt(jSONObject.getInt("dues")));
            }
            if (jSONObject.has("sumamount")) {
                com.yalla.yalla.service.room.OooO00o.f24972OooO.f47478OooO00o.setValue(Long.valueOf(jSONObject.getLong("sumamount")));
            }
            if (jSONObject.has("background")) {
                String string = jSONObject.getString("background");
                oooO00o.OooO00o().f25010OooOOO0.setValue(string);
                RoomTheme roomTheme = new RoomTheme();
                roomTheme.roomId = com.yalla.yalla.service.room.OooO00o.f24978OooO0o0.OooO0o0();
                roomTheme.roomTheme = string;
                OooO00o oooO00o2 = new OooO00o(roomTheme, null);
                this.f47603OooO0Oo = 1;
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
            oooO00o.OooO00o().f25009OooOOO.setValue(jSONObject.getString("backgroundvideo"));
        }
        if (jSONObject.has("image")) {
            oooO00o.OooO00o().f24998OooO00o.setValue(jSONObject.getString("image"));
        }
        return Unit.INSTANCE;
    }
}

package p580o0oOoOo;

import com.yalla.yalla.data.db.model.RoomJoinHistory;
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
import p254o00ooO0O.o0000O0;
import p491o0o00O00.OooO0OO;
import p498o0o00Oo0.OooOOO;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.room.ComposableSingletons$LiveRoomJoinMemberDialogKt$lambda-1$1$1", f = "LiveRoomJoinMemberDialog.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
public final class o0OOO00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f46413Oooo0o;

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.room.ComposableSingletons$LiveRoomJoinMemberDialogKt$lambda-1$1$1$1", f = "LiveRoomJoinMemberDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00O.f43140OooO00o.OooOoO(false);
            RoomJoinHistory roomJoinHistory = new RoomJoinHistory();
            Long value = o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue();
            if (value == null) {
                return Unit.INSTANCE;
            }
            roomJoinHistory.barid = String.valueOf(value);
            OooOOO oooOOO = OooOOO.f41216OooO00o;
            roomJoinHistory.uid = kotlin.collections.unsigned.OooO00o.OooO0O0(oooOOO);
            roomJoinHistory.repeat = roomJoinHistory.barid + oooOOO.OooOo().getValue();
            OooO0OO.OooO00o().OooOooO().OooO00o(roomJoinHistory);
            return Unit.INSTANCE;
        }
    }

    public o0OOO00(Continuation<? super o0OOO00> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0OOO00(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new o0OOO00(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f46413Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OooOo.OooO0O0("202001");
            OooO00o oooO00o = new OooO00o(null);
            this.f46413Oooo0o = 1;
            if (o0000O0.OooO0OO(oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}

package p579o0oOoOOo;

import android.os.CountDownTimer;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.VoteModel;
import com.yalla.yalla.ui.dialog.RoomVoteDialog;
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
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159o00OoOO.o000O00O;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends CountDownTimer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ long f45978OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ RoomVoteDialog f45979OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ VoteModel f45980OooO0OO;

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.RoomVoteDialog$updateVoteDetailModel$1$1$onFinish$1", f = "RoomVoteDialog.kt", i = {}, l = {245}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f45981Oooo0o;

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
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f45981Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f45981Oooo0o = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            LiveEventBus.get("UPDATE_VOTE_GAME").post(Boxing.boxLong(o000O00O.OooO().f32429Oooo0oO.getId()));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.RoomVoteDialog$updateVoteDetailModel$1$1$onTick$1", f = "RoomVoteDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ long f45982Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ VoteModel f45983Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomVoteDialog f45984Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f45985Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(VoteModel voteModel, RoomVoteDialog roomVoteDialog, long j, long j2, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f45983Oooo0o = voteModel;
            this.f45984Oooo0oO = roomVoteDialog;
            this.f45985Oooo0oo = j;
            this.f45982Oooo = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f45983Oooo0o, this.f45984Oooo0oO, this.f45985Oooo0oo, this.f45982Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            if (this.f45983Oooo0o.getIsUnLimit()) {
                this.f45984Oooo0oO.f23776OoooOO0.f50617OooOO0o.setText(o000O0O0.OooO0OO(R.string.room_vote_game_end_ongoing) + ' ' + this.f45984Oooo0oO.OooOOO0(((this.f45983Oooo0o.getCurrentTime() - this.f45983Oooo0o.getStartTime()) * ((long) 1000)) + (this.f45985Oooo0oo - this.f45982Oooo), true));
            } else {
                this.f45984Oooo0oO.f23776OoooOO0.f50617OooOO0o.setText(o000O0O0.OooO0OO(R.string.room_vote_game_end_in) + ' ' + this.f45984Oooo0oO.OooOOO0(this.f45982Oooo, false));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(long j, RoomVoteDialog roomVoteDialog, VoteModel voteModel) {
        super(j, 1000L);
        this.f45978OooO00o = j;
        this.f45979OooO0O0 = roomVoteDialog;
        this.f45980OooO0OO = voteModel;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        if (this.f45979OooO0O0.OooO0OO()) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new OooO00o(null), 2, null);
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new OooO0O0(this.f45980OooO0OO, this.f45979OooO0O0, this.f45978OooO00o, j, null), 2, null);
    }
}

package p650o0ooo;

import android.os.CountDownTimer;
import android.widget.TextView;
import com.code.android.util.o0000;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.VoteModel;
import com.yalla.yalla.ui.dialog.RoomVoteDialog;
import com.zego.zegoavkit2.ZegoConstants;
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
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class p2 extends CountDownTimer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ long f59086OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ RoomVoteDialog f59087OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ VoteModel f59088OooO0OO;

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.RoomVoteDialog$updateVoteDetailModel$1$2$onFinish$1", f = "RoomVoteDialog.kt", i = {}, l = {251}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f59089OooO0Oo;

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
            int i = this.f59089OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f59089OooO0Oo = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            LiveEventBus.get("UPDATE_VOTE_GAME").post(Boxing.boxLong(com.yalla.yalla.service.room.OooO00o.f24516OooO0o0.OooO0o0()));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.RoomVoteDialog$updateVoteDetailModel$1$2$onTick$1", f = "RoomVoteDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VoteModel f59090OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f59091OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomVoteDialog f59092OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f59093OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(VoteModel voteModel, RoomVoteDialog roomVoteDialog, long j, long j2, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f59090OooO0Oo = voteModel;
            this.f59092OooO0o0 = roomVoteDialog;
            this.f59091OooO0o = j;
            this.f59093OooO0oO = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f59090OooO0Oo, this.f59092OooO0o0, this.f59091OooO0o, this.f59093OooO0oO, continuation);
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
            VoteModel voteModel = this.f59090OooO0Oo;
            boolean isUnLimit = voteModel.getIsUnLimit();
            long j = this.f59093OooO0oO;
            RoomVoteDialog roomVoteDialog = this.f59092OooO0o0;
            if (isUnLimit) {
                roomVoteDialog.f27494OooOO0o.f45652OooOO0o.setText(o0000.OooO0OO(o000000.room_vote_game_end_ongoing) + ZegoConstants.ZegoVideoDataAuxPublishingStream + RoomVoteDialog.OooOO0o(((voteModel.getCurrentTime() - voteModel.getStartTime()) * ((long) 1000)) + (this.f59091OooO0o - j), true));
            } else {
                TextView textView = roomVoteDialog.f27494OooOO0o.f45652OooOO0o;
                String strOooO0OO = o0000.OooO0OO(o000000.room_vote_game_end_in);
                roomVoteDialog.getClass();
                textView.setText(strOooO0OO + ZegoConstants.ZegoVideoDataAuxPublishingStream + RoomVoteDialog.OooOO0o(j, false));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(long j, RoomVoteDialog roomVoteDialog, VoteModel voteModel) {
        super(j, 1000L);
        this.f59086OooO00o = j;
        this.f59087OooO0O0 = roomVoteDialog;
        this.f59088OooO0OO = voteModel;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        if (this.f59087OooO0O0.OooO0OO()) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new OooO00o(null), 2, null);
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new OooO0O0(this.f59088OooO0OO, this.f59087OooO0O0, this.f59086OooO00o, j, null), 2, null);
    }
}

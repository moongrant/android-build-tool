package p617o0oo0o;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.MomentEditState;
import com.yalla.yalla.model.MomentSendModel;
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

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.util.MomentSendEditUtil$putEdit$1", f = "MomentSendEditUtil.kt", i = {1, 2}, l = {33, 36, 38}, m = "invokeSuspend", n = {"uploadImageResult", "uploadImageResult"}, s = {"L$0", "L$0"})
public final class o000O0Oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ MomentSendModel f48514Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public MomentSendModel f48515Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f48516Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o000O00 f48517Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0Oo(o000O00 o000o01, MomentSendModel momentSendModel, Continuation<? super o000O0Oo> continuation) {
        super(2, continuation);
        this.f48517Oooo0oo = o000o01;
        this.f48514Oooo = momentSendModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000O0Oo(this.f48517Oooo0oo, this.f48514Oooo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000O0Oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MomentSendModel momentSendModel;
        MomentSendModel momentSendModel2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f48516Oooo0oO;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i == 2) {
                    momentSendModel = this.f48515Oooo0o;
                    ResultKt.throwOnFailure(obj);
                    if (((MomentSendModel) obj).getEditState() == MomentEditState.ContentEditSuccess) {
                        o000O00 o000o01 = this.f48517Oooo0oo;
                        MomentSendModel momentSendModel3 = this.f48514Oooo;
                        this.f48515Oooo0o = momentSendModel;
                        this.f48516Oooo0oO = 3;
                        obj = o000O00.OooO00o(o000o01, momentSendModel3, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        momentSendModel2 = momentSendModel;
                    } else {
                        LiveEventBus.get("MOMENT_EDIT_SEND_FILED_CONTENT").post(Boxing.boxLong(this.f48514Oooo.getPostId()));
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                momentSendModel2 = this.f48515Oooo0o;
                ResultKt.throwOnFailure(obj);
            }
            MomentSendModel momentSendModel4 = (MomentSendModel) obj;
            if (momentSendModel2.getEditState() != MomentEditState.ImageIsNull || momentSendModel4.getEditState() == MomentEditState.ImageChangeSuccess) {
                LiveEventBus.get("MOMENT_EDIT_SEND_SUCCESS").post(Boxing.boxLong(this.f48514Oooo.getPostId()));
            } else {
                LiveEventBus.get("MOMENT_EDIT_SEND_FILED_IMAGE").post(Boxing.boxLong(this.f48514Oooo.getPostId()));
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        o000O00 o000o02 = this.f48517Oooo0oo;
        MomentSendModel momentSendModel5 = this.f48514Oooo;
        this.f48516Oooo0oO = 1;
        obj = o000O00.OooO0OO(o000o02, momentSendModel5, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        MomentSendModel momentSendModel6 = (MomentSendModel) obj;
        if (momentSendModel6.getEditState() == MomentEditState.ImageIsNull || momentSendModel6.getEditState() == MomentEditState.ImageUploadSuccess) {
            o000O00 o000o03 = this.f48517Oooo0oo;
            this.f48515Oooo0o = momentSendModel6;
            this.f48516Oooo0oO = 2;
            Object objOooO0O0 = o000O00.OooO0O0(o000o03, momentSendModel6, this);
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
            momentSendModel = momentSendModel6;
            obj = objOooO0O0;
            if (((MomentSendModel) obj).getEditState() == MomentEditState.ContentEditSuccess) {
                o000O00 o000o04 = this.f48517Oooo0oo;
                MomentSendModel momentSendModel7 = this.f48514Oooo;
                this.f48515Oooo0o = momentSendModel;
                this.f48516Oooo0oO = 3;
                obj = o000O00.OooO00o(o000o04, momentSendModel7, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                momentSendModel2 = momentSendModel;
                MomentSendModel momentSendModel8 = (MomentSendModel) obj;
                if (momentSendModel2.getEditState() != MomentEditState.ImageIsNull) {
                    LiveEventBus.get("MOMENT_EDIT_SEND_SUCCESS").post(Boxing.boxLong(this.f48514Oooo.getPostId()));
                } else {
                    LiveEventBus.get("MOMENT_EDIT_SEND_SUCCESS").post(Boxing.boxLong(this.f48514Oooo.getPostId()));
                }
            } else {
                LiveEventBus.get("MOMENT_EDIT_SEND_FILED_CONTENT").post(Boxing.boxLong(this.f48514Oooo.getPostId()));
            }
        } else {
            LiveEventBus.get("MOMENT_EDIT_SEND_FILED_IMAGE").post(Boxing.boxLong(this.f48514Oooo.getPostId()));
        }
        return Unit.INSTANCE;
    }
}

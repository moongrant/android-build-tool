package p579o0oOoo;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.moment.MomentEditState;
import com.yalla.yalla.model.moment.MomentSendModel;
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

/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.yalla.yalla.util.MomentSendEditUtil$putEdit$1", f = "MomentSendEditUtil.kt", i = {}, l = {37, 41, 44}, m = "invokeSuspend", n = {}, s = {})
public final class ooOOO00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f56720OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentSendModel f56721OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oO0O0Oo0 f56722OooO0o0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MomentEditState.values().length];
            try {
                iArr[MomentEditState.ImageIsNull.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MomentEditState.ImageChangeSuccess.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MomentEditState.ContentEditSuccess.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MomentEditState.ImageUploadSuccess.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooOOO00O(oO0O0Oo0 oo0o0oo0, MomentSendModel momentSendModel, Continuation<? super ooOOO00O> continuation) {
        super(2, continuation);
        this.f56722OooO0o0 = oo0o0oo0;
        this.f56721OooO0o = momentSendModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ooOOO00O(this.f56722OooO0o0, this.f56721OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ooOOO00O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    /* JADX WARN: Code duplicated, block: B:41:0x008a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        MomentEditState editState;
        int i;
        int i2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f56720OooO0Oo;
        MomentSendModel momentSendModel = this.f56721OooO0o;
        oO0O0Oo0 oo0o0oo0 = this.f56722OooO0o0;
        if (i3 != 0) {
            if (i3 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i3 == 2) {
                    ResultKt.throwOnFailure(obj);
                    editState = ((MomentSendModel) obj).getEditState();
                    if (editState == null) {
                        i = -1;
                    } else {
                        i = OooO00o.$EnumSwitchMapping$0[editState.ordinal()];
                    }
                    if (i == 3) {
                        this.f56720OooO0Oo = 3;
                        obj = oO0O0Oo0.OooO00o(oo0o0oo0, momentSendModel, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            MomentEditState editState2 = ((MomentSendModel) obj).getEditState();
            i2 = editState2 != null ? OooO00o.$EnumSwitchMapping$0[editState2.ordinal()] : -1;
            if (i2 != 1 || i2 == 2) {
                oo0o0oo0.f56590OooO00o.OooOo0();
                LiveEventBus.get("MOMENT_EDIT_SEND_SUCCESS").post(Boxing.boxLong(momentSendModel.getPostId()));
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        this.f56720OooO0Oo = 1;
        obj = oO0O0Oo0.OooO0OO(oo0o0oo0, momentSendModel, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        MomentSendModel momentSendModel2 = (MomentSendModel) obj;
        MomentEditState editState3 = momentSendModel2.getEditState();
        int i4 = editState3 == null ? -1 : OooO00o.$EnumSwitchMapping$0[editState3.ordinal()];
        if (i4 == 1 || i4 == 4) {
            this.f56720OooO0Oo = 2;
            obj = oO0O0Oo0.OooO0O0(oo0o0oo0, momentSendModel2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            editState = ((MomentSendModel) obj).getEditState();
            if (editState == null) {
                i = -1;
            } else {
                i = OooO00o.$EnumSwitchMapping$0[editState.ordinal()];
            }
            if (i == 3) {
                this.f56720OooO0Oo = 3;
                obj = oO0O0Oo0.OooO00o(oo0o0oo0, momentSendModel, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                MomentEditState editState4 = ((MomentSendModel) obj).getEditState();
                if (editState4 != null) {
                }
                if (i2 != 1) {
                    oo0o0oo0.f56590OooO00o.OooOo0();
                    LiveEventBus.get("MOMENT_EDIT_SEND_SUCCESS").post(Boxing.boxLong(momentSendModel.getPostId()));
                } else {
                    oo0o0oo0.f56590OooO00o.OooOo0();
                    LiveEventBus.get("MOMENT_EDIT_SEND_SUCCESS").post(Boxing.boxLong(momentSendModel.getPostId()));
                }
            }
        }
        return Unit.INSTANCE;
    }
}

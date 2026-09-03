package com.yalla.yalla.ui.vm.moment;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.data.repository.MomentRepository;
import com.yalla.yalla.model.PostUserModel;
import com.yalla.yalla.model.http.ApiResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p188o00o00oO.o000;
import p188o00o00oO.o000Oo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0017\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R/\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0007R;\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/MomentPraiseVM;", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "", "getPraises", "", "id", "initMomentId", "(Ljava/lang/Long;)V", "<set-?>", "momentId$delegate", "Landroidx/compose/runtime/MutableState;", "getMomentId", "()Ljava/lang/Long;", "setMomentId", "momentId", "Lo00o00oO/o000;", "Lcom/yalla/yalla/model/PostUserModel;", "praisesPagerState$delegate", "getPraisesPagerState", "()Lo00o00oO/o000;", "setPraisesPagerState", "(Lo00o00oO/o000;)V", "praisesPagerState", "giftsDataSort", "J", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMomentPraiseVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentPraiseVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentPraiseVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,55:1\n81#2:56\n107#2,2:57\n81#2:59\n107#2,2:60\n*S KotlinDebug\n*F\n+ 1 MomentPraiseVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentPraiseVM\n*L\n23#1:56\n23#1:57,2\n24#1:59\n24#1:60,2\n*E\n"})
public final class MomentPraiseVM extends BaseMomentDetailVM {
    public static final int $stable = 8;
    private long giftsDataSort;

    /* JADX INFO: renamed from: momentId$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState momentId = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: praisesPagerState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState praisesPagerState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentPraiseVM$getPraises$1", f = "MomentPraiseVM.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<Integer, Continuation<? super o000Oo0<PostUserModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31706OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ int f31708OooO0o0;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = MomentPraiseVM.this.new OooO00o(continuation);
            oooO00o.f31708OooO0o0 = ((Number) obj).intValue();
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super o000Oo0<PostUserModel>> continuation) {
            return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Long dateSort;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31706OooO0Oo;
            MomentPraiseVM momentPraiseVM = MomentPraiseVM.this;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = this.f31708OooO0o0;
                if (i2 == 1) {
                    momentPraiseVM.giftsDataSort = 0L;
                }
                long jOooOO0 = o0OoOo0.OooOO0(momentPraiseVM.getMomentId());
                long j = momentPraiseVM.giftsDataSort;
                this.f31706OooO0Oo = 1;
                obj = MomentRepository.OooO0Oo(jOooOO0, j, i2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess() && (dateSort = apiResult.getPage().getDateSort()) != null) {
                momentPraiseVM.giftsDataSort = dateSort.longValue();
            }
            return ApiResult.toPagingLoadResource$default(apiResult, (List) apiResult.getData(), false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Long getMomentId() {
        return (Long) this.momentId.getValue();
    }

    private final void getPraises() {
        setPraisesPagerState(new o000<>(ViewModelKt.getViewModelScope(this), new OooO00o(null)));
    }

    private final void setMomentId(Long l) {
        this.momentId.setValue(l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final o000<PostUserModel> getPraisesPagerState() {
        return (o000) this.praisesPagerState.getValue();
    }

    public final void initMomentId(@Nullable Long id) {
        setMomentId(id);
        getPraises();
    }

    public final void setPraisesPagerState(@Nullable o000<PostUserModel> o000Var) {
        this.praisesPagerState.setValue(o000Var);
    }
}

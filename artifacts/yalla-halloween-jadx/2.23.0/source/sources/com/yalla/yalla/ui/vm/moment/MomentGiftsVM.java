package com.yalla.yalla.ui.vm.moment;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.OooOOO;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.data.repository.MomentRepository$momentGiftList$$inlined$call$1;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentGift;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p385o0OOooOO.o00oOoo;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0017\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bR/\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0007R;\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\u001f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/MomentGiftsVM;", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "", "getGifts", "", "id", "initMomentId", "(Ljava/lang/Long;)V", "", "type", "switchSortType", "<set-?>", "momentId$delegate", "Landroidx/compose/runtime/MutableState;", "getMomentId", "()Ljava/lang/Long;", "setMomentId", "momentId", "Lo00Oo000/OooO0O0;", "Lcom/yalla/yalla/model/moment/MomentGift;", "giftsPagerState$delegate", "getGiftsPagerState", "()Lo00Oo000/OooO0O0;", "setGiftsPagerState", "(Lo00Oo000/OooO0O0;)V", "giftsPagerState", "giftsSortType$delegate", "getGiftsSortType", "()I", "setGiftsSortType", "(I)V", "giftsSortType", "giftsDataSort", "J", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMomentGiftsVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentGiftsVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentGiftsVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,70:1\n81#2:71\n107#2,2:72\n81#2:74\n107#2,2:75\n81#2:77\n107#2,2:78\n*S KotlinDebug\n*F\n+ 1 MomentGiftsVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentGiftsVM\n*L\n24#1:71\n24#1:72,2\n26#1:74\n26#1:75,2\n31#1:77\n31#1:78,2\n*E\n"})
public final class MomentGiftsVM extends BaseMomentDetailVM {
    public static final int $stable = 8;
    private long giftsDataSort;

    /* JADX INFO: renamed from: momentId$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState momentId = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: giftsPagerState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState giftsPagerState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: giftsSortType$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState giftsSortType = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(1, null, 2, null);

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentGiftsVM$getGifts$1", f = "MomentGiftsVM.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<Integer, Continuation<? super p143o00Oo000.OooO<MomentGift>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32238OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ int f32240OooO0o0;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = MomentGiftsVM.this.new OooO00o(continuation);
            oooO00o.f32240OooO0o0 = ((Number) obj).intValue();
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super p143o00Oo000.OooO<MomentGift>> continuation) {
            return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Long dateSort;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32238OooO0Oo;
            MomentGiftsVM momentGiftsVM = MomentGiftsVM.this;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = this.f32240OooO0o0;
                if (i2 == 1) {
                    momentGiftsVM.giftsDataSort = 0L;
                }
                long jOooOO0 = o0OoOo0.OooOO0(momentGiftsVM.getMomentId());
                int giftsSortType = momentGiftsVM.getGiftsSortType() == -1 ? 1 : momentGiftsVM.getGiftsSortType();
                long j = momentGiftsVM.giftsDataSort;
                this.f32238OooO0Oo = 1;
                String strOooO0Oo = o000OOo0.OooO0Oo("/Webservers/Moment/DySendPropDetail");
                o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
                o0o0oooOooO00o.OooO0O0(Boxing.boxInt(giftsSortType), "type");
                o0o0oooOooO00o.OooO0O0(Boxing.boxLong(jOooOO0), "dyid");
                o0o0oooOooO00o.OooO0O0(Boxing.boxLong(j), "datesort");
                o0o0oooOooO00o.OooO0O0(Boxing.boxInt(i2), "pageindex");
                obj = OooOOO.OooO0Oo(new MomentRepository$momentGiftList$$inlined$call$1(o0o0oooOooO00o, null), this);
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
                momentGiftsVM.giftsDataSort = dateSort.longValue();
            }
            return ApiResult.toPagingLoadResource$default(apiResult, (List) apiResult.getData(), false, 2, null);
        }
    }

    private final void getGifts() {
        setGiftsPagerState(new p143o00Oo000.OooO0O0<>(ViewModelKt.getViewModelScope(this), new OooO00o(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Long getMomentId() {
        return (Long) this.momentId.getValue();
    }

    private final void setGiftsSortType(int i) {
        this.giftsSortType.setValue(Integer.valueOf(i));
    }

    private final void setMomentId(Long l) {
        this.momentId.setValue(l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final p143o00Oo000.OooO0O0<MomentGift> getGiftsPagerState() {
        return (p143o00Oo000.OooO0O0) this.giftsPagerState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getGiftsSortType() {
        return ((Number) this.giftsSortType.getValue()).intValue();
    }

    public final void initMomentId(@Nullable Long id) {
        setMomentId(id);
        setGiftsSortType(1);
        getGifts();
    }

    public final void setGiftsPagerState(@Nullable p143o00Oo000.OooO0O0<MomentGift> oooO0O0) {
        this.giftsPagerState.setValue(oooO0O0);
    }

    public final void switchSortType(int type) {
        setGiftsSortType(type);
        getGifts();
    }
}

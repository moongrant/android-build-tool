package p558o0oOOooo;

import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.material.TextFieldImplKt;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.util.OooOOO;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.data.repository.GiftRepo$giftBlindUserTask$$inlined$call$1;
import com.yalla.yalla.model.gift.GiftBlindDetail;
import com.yalla.yalla.model.gift.GiftBlindTask;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropSubDetailsModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.view.gift.GiftBlindTipsView;
import io.agora.rtc.Constants;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p184o00o00O0.OooO0OO;
import p368o0OOo0Oo.Oooo000;
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;
import p405o0Oo0OOO.y2;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.view.gift.GiftBlindTipsView$getGiftBlindDetail$1$1", f = "GiftBlindTipsView.kt", i = {}, l = {TextFieldImplKt.AnimationDuration}, m = "invokeSuspend", n = {}, s = {})
public final class oO0O00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f56199OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ GiftBlindTipsView f56200OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ GiftPropModel f56201OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.ui.view.gift.GiftBlindTipsView$getGiftBlindDetail$1$1$1", f = "GiftBlindTipsView.kt", i = {}, l = {Constants.ERR_PUBLISH_STREAM_NOT_FOUND, 161}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f56202OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ GiftBlindTipsView f56203OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ GiftPropModel f56204OooO0o0;

        /* JADX INFO: renamed from: o0oOOooo.oO0O00$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.ui.view.gift.GiftBlindTipsView$getGiftBlindDetail$1$1$1$2", f = "GiftBlindTipsView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0486OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ GiftPropModel f56205OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ GiftBlindTipsView f56206OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0486OooO00o(GiftPropModel giftPropModel, GiftBlindTipsView giftBlindTipsView, Continuation<? super C0486OooO00o> continuation) {
                super(2, continuation);
                this.f56205OooO0Oo = giftPropModel;
                this.f56206OooO0o0 = giftBlindTipsView;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0486OooO00o(this.f56205OooO0Oo, this.f56206OooO0o0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0486OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                GiftBlindDetail giftBlindDetail;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                GiftBlindDetail giftBlindDetail2 = this.f56205OooO0Oo.getGiftBlindDetail();
                boolean z = giftBlindDetail2 != null && giftBlindDetail2.isNewType();
                GiftBlindTipsView giftBlindTipsView = this.f56206OooO0o0;
                if (z) {
                    y2 y2Var = giftBlindTipsView.f30442OooO0Oo;
                    RecyclerView rvBlindGiftTipsList = y2Var.f45715OooO0oO;
                    Intrinsics.checkNotNullExpressionValue(rvBlindGiftTipsList, "rvBlindGiftTipsList");
                    o000O.OooO0O0(rvBlindGiftTipsList);
                    HorizontalScrollView llNew = y2Var.f45713OooO0o;
                    Intrinsics.checkNotNullExpressionValue(llNew, "llNew");
                    o000O.OooOOOO(llNew);
                    ImageView ivBlindView = y2Var.f45711OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(ivBlindView, "ivBlindView");
                    o000O.OooO0O0(ivBlindView);
                    GiftPropModel giftPropModel = giftBlindTipsView.f30444OooO0o0;
                    if (giftPropModel != null && (giftBlindDetail = giftPropModel.getGiftBlindDetail()) != null) {
                        GiftBlindTask task = giftBlindDetail.getTask();
                        boolean z2 = task != null && task.isTaskEveryday();
                        TextView textView = y2Var.f45716OooO0oo;
                        if (z2) {
                            textView.setText(o0000.OooO0OO(o000000.Daily_Tasks));
                        } else {
                            textView.setText(o0000.OooO0OO(o000000.Advanced_Tasks));
                        }
                        if (giftBlindDetail.getBlindBoxUrl().length() > 0) {
                            Intrinsics.checkNotNullExpressionValue(ivBlindView, "ivBlindView");
                            o000O.OooOOOO(ivBlindView);
                        }
                        GiftBlindTask task2 = giftBlindDetail.getTask();
                        if (task2 != null) {
                            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(giftBlindTipsView.getContext());
                            int i = o0Oo0oo.icon_gift_default_gray;
                            oooO00o.f43138OooOOOo = i;
                            oooO00o.f43126OooO0OO = OooO0OO.OooO0Oo(task2.getSendPropImage());
                            oooO00o.f43124OooO00o = 0;
                            oooO00o.OooO0Oo(y2Var.f45714OooO0o0);
                            Oooo000.OooO00o oooO00o2 = new Oooo000.OooO00o(giftBlindTipsView.getContext());
                            oooO00o2.f43138OooOOOo = i;
                            oooO00o2.f43126OooO0OO = OooO0OO.OooO0Oo(task2.getRewardImage());
                            oooO00o2.f43124OooO00o = 0;
                            oooO00o2.OooO0Oo(y2Var.f45712OooO0Oo);
                            String strOooO0OO = o0000.OooO0OO(o000000.Send);
                            TextView textView2 = y2Var.f45717OooOO0;
                            textView2.setText(strOooO0OO);
                            if (task2.getOptionType() == GiftBlindTask.INSTANCE.getOptionType_Get()) {
                                textView2.setText(o0000.OooO0OO(o000000.Gift_Receive));
                            }
                            int targetCount = task2.getTargetCount();
                            TextView tvGetGiftCount = y2Var.f45708OooO;
                            TextView tvSendGiftCount = y2Var.f45718OooOO0O;
                            if (targetCount > 0) {
                                Intrinsics.checkNotNullExpressionValue(tvSendGiftCount, "tvSendGiftCount");
                                o000O.OooOOOO(tvSendGiftCount);
                                Intrinsics.checkNotNullExpressionValue(tvGetGiftCount, "tvGetGiftCount");
                                o000O.OooOOOO(tvGetGiftCount);
                                int i2 = o000000.x_XXX;
                                tvSendGiftCount.setText(o0000O.OooO00o(o0000.OooO0OO(i2), String.valueOf(task2.getTargetCount())));
                                tvGetGiftCount.setText(o0000O.OooO00o(o0000.OooO0OO(i2), String.valueOf(task2.getTargetCount())));
                            } else {
                                Intrinsics.checkNotNullExpressionValue(tvSendGiftCount, "tvSendGiftCount");
                                o000O.OooO0O0(tvSendGiftCount);
                                Intrinsics.checkNotNullExpressionValue(tvGetGiftCount, "tvGetGiftCount");
                                o000O.OooO0O0(tvGetGiftCount);
                            }
                        }
                    }
                } else {
                    GiftBlindTipsView.OooO0O0(giftBlindTipsView);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(GiftPropModel giftPropModel, GiftBlindTipsView giftBlindTipsView, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f56204OooO0o0 = giftPropModel;
            this.f56203OooO0o = giftBlindTipsView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f56204OooO0o0, this.f56203OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f56202OooO0Oo;
            GiftPropModel giftPropModel = this.f56204OooO0o0;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            GiftPropSubDetailsModel subPropDetails = giftPropModel.getSubPropDetails();
            if (o0OoOo0.OooOO0(subPropDetails != null ? Boxing.boxLong(subPropDetails.getBlindBoxId()) : null) <= 0) {
                return Unit.INSTANCE;
            }
            GiftPropSubDetailsModel subPropDetails2 = giftPropModel.getSubPropDetails();
            long jOooOO0 = o0OoOo0.OooOO0(subPropDetails2 != null ? Boxing.boxLong(subPropDetails2.getBlindBoxId()) : null);
            this.f56202OooO0Oo = 1;
            String strOooO0OO = oo000o.OooO0OO("/Webservers/bar/GetUserTask");
            o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0OO, "url", strOooO0OO, 0);
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(jOooOO0), "blindBoxId");
            obj = OooOOO.OooO0Oo(new GiftRepo$giftBlindUserTask$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                giftPropModel.setGiftBlindDetail((GiftBlindDetail) apiResult.getData());
                GiftBlindDetail giftBlindDetail = giftPropModel.getGiftBlindDetail();
                if (giftBlindDetail != null) {
                    GiftPropSubDetailsModel subPropDetails3 = giftPropModel.getSubPropDetails();
                    giftBlindDetail.setLocalGiftBlindId(o0OoOo0.OooOO0(subPropDetails3 != null ? Boxing.boxLong(subPropDetails3.getBlindBoxId()) : null));
                }
            }
            C0486OooO00o c0486OooO00o = new C0486OooO00o(giftPropModel, this.f56203OooO0o, null);
            this.f56202OooO0Oo = 2;
            if (OooOOO.OooO0o0(c0486OooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00(GiftPropModel giftPropModel, GiftBlindTipsView giftBlindTipsView, Continuation<? super oO0O00> continuation) {
        super(2, continuation);
        this.f56201OooO0o0 = giftPropModel;
        this.f56200OooO0o = giftBlindTipsView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oO0O00(this.f56201OooO0o0, this.f56200OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oO0O00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f56199OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OooO00o oooO00o = new OooO00o(this.f56201OooO0o0, this.f56200OooO0o, null);
            this.f56199OooO0Oo = 1;
            if (OooOOO.OooO0Oo(oooO00o, this) == coroutine_suspended) {
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

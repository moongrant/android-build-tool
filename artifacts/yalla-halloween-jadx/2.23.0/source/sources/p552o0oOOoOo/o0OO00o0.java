package p552o0oOOoOo;

import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.material.TextFieldImplKt;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.util.OooOOO;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000OO00;
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
import p139o00OOooO.OooO0o;
import p362o0OOo0O.OooOO0;
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p385o0OOooOO.o00oOoo;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.jb;

/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.view.gift.GiftBlindTipsView$getGiftBlindDetail$1$1", f = "GiftBlindTipsView.kt", i = {}, l = {TextFieldImplKt.AnimationDuration}, m = "invokeSuspend", n = {}, s = {})
public final class o0OO00o0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f55956OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ GiftBlindTipsView f55957OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ GiftPropModel f55958OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.ui.view.gift.GiftBlindTipsView$getGiftBlindDetail$1$1$1", f = "GiftBlindTipsView.kt", i = {}, l = {Constants.ERR_PUBLISH_STREAM_NOT_FOUND, 161}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f55959OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ GiftBlindTipsView f55960OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ GiftPropModel f55961OooO0o0;

        /* JADX INFO: renamed from: o0oOOoOo.o0OO00o0$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.ui.view.gift.GiftBlindTipsView$getGiftBlindDetail$1$1$1$2", f = "GiftBlindTipsView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0509OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ GiftPropModel f55962OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ GiftBlindTipsView f55963OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0509OooO00o(GiftPropModel giftPropModel, GiftBlindTipsView giftBlindTipsView, Continuation<? super C0509OooO00o> continuation) {
                super(2, continuation);
                this.f55962OooO0Oo = giftPropModel;
                this.f55963OooO0o0 = giftBlindTipsView;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0509OooO00o(this.f55962OooO0Oo, this.f55963OooO0o0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0509OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                GiftBlindDetail giftBlindDetail;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                GiftBlindDetail giftBlindDetail2 = this.f55962OooO0Oo.getGiftBlindDetail();
                boolean z = giftBlindDetail2 != null && giftBlindDetail2.isNewType();
                GiftBlindTipsView giftBlindTipsView = this.f55963OooO0o0;
                if (z) {
                    jb jbVar = giftBlindTipsView.f30987OooO0Oo;
                    RecyclerView recyclerView = jbVar.f58209OooO0oO;
                    Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.rvBlindGiftTipsList");
                    o000OO00.OooO0O0(recyclerView);
                    HorizontalScrollView horizontalScrollView = jbVar.f58207OooO0o;
                    Intrinsics.checkNotNullExpressionValue(horizontalScrollView, "binding.llNew");
                    o000OO00.OooOOOO(horizontalScrollView);
                    ImageView imageView = jbVar.f58205OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivBlindView");
                    o000OO00.OooO0O0(imageView);
                    GiftPropModel giftPropModel = giftBlindTipsView.f30989OooO0o0;
                    if (giftPropModel != null && (giftBlindDetail = giftPropModel.getGiftBlindDetail()) != null) {
                        GiftBlindTask task = giftBlindDetail.getTask();
                        boolean z2 = task != null && task.isTaskEveryday();
                        TextView textView = jbVar.f58210OooO0oo;
                        if (z2) {
                            textView.setText(o0000.OooO0OO(oO00OOo0.Daily_Tasks));
                        } else {
                            textView.setText(o0000.OooO0OO(oO00OOo0.Advanced_Tasks));
                        }
                        if (giftBlindDetail.getBlindBoxUrl().length() > 0) {
                            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivBlindView");
                            o000OO00.OooOOOO(imageView);
                        }
                        GiftBlindTask task2 = giftBlindDetail.getTask();
                        if (task2 != null) {
                            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(giftBlindTipsView.getContext());
                            int i = oOo00OO0.icon_gift_default_gray;
                            oooO00o.f43923OooOOOo = i;
                            oooO00o.f43911OooO0OO = OooO0o.OooO0Oo(task2.getSendPropImage());
                            oooO00o.f43909OooO00o = 0;
                            oooO00o.OooO0Oo(jbVar.f58208OooO0o0);
                            OooOO0.OooO00o oooO00o2 = new OooOO0.OooO00o(giftBlindTipsView.getContext());
                            oooO00o2.f43923OooOOOo = i;
                            oooO00o2.f43911OooO0OO = OooO0o.OooO0Oo(task2.getRewardImage());
                            oooO00o2.f43909OooO00o = 0;
                            oooO00o2.OooO0Oo(jbVar.f58206OooO0Oo);
                            String strOooO0OO = o0000.OooO0OO(oO00OOo0.Send);
                            TextView textView2 = jbVar.f58211OooOO0;
                            textView2.setText(strOooO0OO);
                            if (task2.getOptionType() == GiftBlindTask.INSTANCE.getOptionType_Get()) {
                                textView2.setText(o0000.OooO0OO(oO00OOo0.Gift_Receive));
                            }
                            int targetCount = task2.getTargetCount();
                            TextView textView3 = jbVar.f58202OooO;
                            TextView textView4 = jbVar.f58212OooOO0O;
                            if (targetCount > 0) {
                                Intrinsics.checkNotNullExpressionValue(textView4, "binding.tvSendGiftCount");
                                o000OO00.OooOOOO(textView4);
                                Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvGetGiftCount");
                                o000OO00.OooOOOO(textView3);
                                int i2 = oO00OOo0.x_XXX;
                                textView4.setText(o0000O.OooO00o(o0000.OooO0OO(i2), String.valueOf(task2.getTargetCount())));
                                textView3.setText(o0000O.OooO00o(o0000.OooO0OO(i2), String.valueOf(task2.getTargetCount())));
                            } else {
                                Intrinsics.checkNotNullExpressionValue(textView4, "binding.tvSendGiftCount");
                                o000OO00.OooO0O0(textView4);
                                Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvGetGiftCount");
                                o000OO00.OooO0O0(textView3);
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
            this.f55961OooO0o0 = giftPropModel;
            this.f55960OooO0o = giftBlindTipsView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f55961OooO0o0, this.f55960OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f55959OooO0Oo;
            GiftPropModel giftPropModel = this.f55961OooO0o0;
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
            this.f55959OooO0Oo = 1;
            String strOooO0OO = o000OOo0.OooO0OO("/Webservers/bar/GetUserTask");
            o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0OO, "url", strOooO0OO, 0);
            o0o0oooOooO00o.OooO0O0(Boxing.boxLong(jOooOO0), "blindBoxId");
            obj = OooOOO.OooO0Oo(new GiftRepo$giftBlindUserTask$$inlined$call$1(o0o0oooOooO00o, null), this);
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
            C0509OooO00o c0509OooO00o = new C0509OooO00o(giftPropModel, this.f55960OooO0o, null);
            this.f55959OooO0Oo = 2;
            if (OooOOO.OooO0o0(c0509OooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00o0(GiftPropModel giftPropModel, GiftBlindTipsView giftBlindTipsView, Continuation<? super o0OO00o0> continuation) {
        super(2, continuation);
        this.f55958OooO0o0 = giftPropModel;
        this.f55957OooO0o = giftBlindTipsView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0OO00o0(this.f55958OooO0o0, this.f55957OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0OO00o0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f55956OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OooO00o oooO00o = new OooO00o(this.f55958OooO0o0, this.f55957OooO0o, null);
            this.f55956OooO0Oo = 1;
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

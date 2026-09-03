package com.yalla.yalla.ui.dialog.room;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.model.GiftBlindBoxRecordModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p520o0o0O0O0.o00Ooo;
import p630o0ooO00.o000O0;
import p630o0ooO00.o000OO0O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R+\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/ui/dialog/room/LiveComposeVM;", "Lo00OO/OooO00o;", "Lo000oOoO/o0O00OO;", "", "showGiftBlindBoxDetailDialog", "Lo000oOoO/o0O00OO;", "getShowGiftBlindBoxDetailDialog", "()Lo000oOoO/o0O00OO;", "Lcom/yalla/yalla/common/util/WebPageInfo;", "<set-?>", "testWebPageInfo$delegate", "getTestWebPageInfo", "()Lcom/yalla/yalla/common/util/WebPageInfo;", "setTestWebPageInfo", "(Lcom/yalla/yalla/common/util/WebPageInfo;)V", "testWebPageInfo", "Lo0ooO00/o000O0;", "Lcom/yalla/yalla/model/GiftBlindBoxRecordModel;", "giftBlindBoxRecordFlow", "Lo0ooO00/o000O0;", "getGiftBlindBoxRecordFlow", "()Lo0ooO00/o000O0;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class LiveComposeVM extends o00OO.OooO00o {
    public static final int $stable = 8;

    @NotNull
    private final o000O0<GiftBlindBoxRecordModel> giftBlindBoxRecordFlow;

    @NotNull
    private final o0O00OO<Boolean> showGiftBlindBoxDetailDialog = o0OOO00.OooO0Oo(Boolean.FALSE);

    /* JADX INFO: renamed from: testWebPageInfo$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO testWebPageInfo;

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.room.LiveComposeVM$giftBlindBoxRecordFlow$1", f = "LiveComposeDialog.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<Integer, Continuation<? super o000OO0O<GiftBlindBoxRecordModel>>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f23805Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ int f23806Oooo0oO;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(continuation);
            oooO00o.f23806Oooo0oO = ((Number) obj).intValue();
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super o000OO0O<GiftBlindBoxRecordModel>> continuation) {
            return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23805Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = this.f23806Oooo0oO;
                o00Ooo o00ooo2 = o00Ooo.f42751OooO00o;
                this.f23805Oooo0o = 1;
                obj = o00ooo2.OooO00o(i2, this);
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
            return ApiResult.toPagingLoadResource$default(apiResult, (List) apiResult.getData(), false, 2, null);
        }
    }

    public LiveComposeVM() {
        WebPageInfo.OooO00o oooO00o = WebPageInfo.f21213OoooOoo;
        this.testWebPageInfo = o0OOO00.OooO0Oo(WebPageInfo.f21214Ooooo00);
        this.giftBlindBoxRecordFlow = new o000O0<>(ViewModelKt.getViewModelScope(this), new OooO00o(null));
    }

    @NotNull
    public final o000O0<GiftBlindBoxRecordModel> getGiftBlindBoxRecordFlow() {
        return this.giftBlindBoxRecordFlow;
    }

    @NotNull
    public final o0O00OO<Boolean> getShowGiftBlindBoxDetailDialog() {
        return this.showGiftBlindBoxDetailDialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final WebPageInfo getTestWebPageInfo() {
        return (WebPageInfo) this.testWebPageInfo.getValue();
    }

    public final void setTestWebPageInfo(@NotNull WebPageInfo webPageInfo) {
        Intrinsics.checkNotNullParameter(webPageInfo, "<set-?>");
        this.testWebPageInfo.setValue(webPageInfo);
    }
}

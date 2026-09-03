package com.yalla.yalla.ui.vm.main;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.OooOOO;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o0OoOo0;
import com.geetest.captcha.GTCaptcha4Client;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yalla.yalla.data.repository.RedemptionCodeRepo$cdKeyExchange$$inlined$call$1;
import com.yalla.yalla.data.repository.RedemptionCodeRepo$cdkeyList$$inlined$call$1;
import com.yalla.yalla.data.repository.RedemptionCodeRepo$getCdkInfo$$inlined$call$1;
import com.yalla.yalla.model.RedemptionCdkInfoModel;
import com.yalla.yalla.model.RedemptionCodeAwards;
import com.yalla.yalla.model.RedemptionCodeModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiError3014;
import com.yalla.yalla.model.http.ApiError3015;
import com.yalla.yalla.model.http.ApiError3016;
import com.yalla.yalla.model.http.ApiError3017;
import com.yalla.yalla.model.http.ApiError3018;
import com.yalla.yalla.model.http.ApiError3019;
import com.yalla.yalla.model.http.ApiError3020;
import com.yalla.yalla.model.http.ApiResult;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p375o0OOoOO.o00000O0;
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p377o0OOoOo.o000O000;
import p385o0OOooOO.o00oOoo;
import p394o0Oo00oO.o0O0O00;
import p427o0OoOO00.o00Ooo;
import p507o0o00ooo.x0;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001gB\u0007¢\u0006\u0004\be\u0010fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u001e\u0010\f\u001a\u00020\u000b2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bJ\b\u0010\r\u001a\u00020\u0004H\u0002J0\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bH\u0002R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R;\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR+\u0010%\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R+\u0010)\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u001a\u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R+\u0010/\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u001a\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R+\u00103\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010\u001a\u001a\u0004\b1\u0010\"\"\u0004\b2\u0010$R+\u0010:\u001a\u0002042\u0006\u0010\u0018\u001a\u0002048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010\u001a\u001a\u0004\b6\u00107\"\u0004\b8\u00109R(\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010\u001a\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR*\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010B8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR0\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u001d\u0010R\u001a\b\u0012\u0004\u0012\u00020<0;8\u0006¢\u0006\f\n\u0004\bR\u0010\u001a\u001a\u0004\bS\u0010?R+\u0010W\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bT\u0010\u001a\u001a\u0004\bU\u0010\"\"\u0004\bV\u0010$R+\u0010[\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bX\u0010\u001a\u001a\u0004\bY\u0010,\"\u0004\bZ\u0010.R\u0016\u0010\\\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u001d\u0010`\u001a\b\u0012\u0004\u0012\u00020_0^8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u0014\u0010d\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\bd\u0010]¨\u0006h"}, d2 = {"Lcom/yalla/yalla/ui/vm/main/RedemptionCodeVm;", "Lo0Oo00oO/o0O0O00;", "Landroid/content/Context;", "context", "", "toRedemptionCode", "destroy", "toLocalCodeRedemptionFailed", "Lkotlin/Function1;", "", "isOtherCodeListener", "", "getErrorMessage", "toCdKeyExchange", "redemptionCodeCaptchaId", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "checkGeetinfo", "Lo0o00ooo/x0;", "loadingDialogState", "Lo0o00ooo/x0;", "getLoadingDialogState", "()Lo0o00ooo/x0;", "", "Lcom/yalla/yalla/model/RedemptionCodeAwards;", "<set-?>", "redemptionCodeResult$delegate", "Landroidx/compose/runtime/MutableState;", "getRedemptionCodeResult", "()Ljava/util/List;", "setRedemptionCodeResult", "(Ljava/util/List;)V", "redemptionCodeResult", "searchText$delegate", "getSearchText", "()Ljava/lang/String;", "setSearchText", "(Ljava/lang/String;)V", "searchText", "geetinfoCodeText$delegate", "getGeetinfoCodeText", "setGeetinfoCodeText", "geetinfoCodeText", "geetinfoCodeErrorCode$delegate", "getGeetinfoCodeErrorCode", "()I", "setGeetinfoCodeErrorCode", "(I)V", "geetinfoCodeErrorCode", "geetinfoCodeErrorMessage$delegate", "getGeetinfoCodeErrorMessage", "setGeetinfoCodeErrorMessage", "geetinfoCodeErrorMessage", "Lcom/yalla/yalla/ui/vm/main/RedemptionCodeVm$RedemptionCodeState;", "redemptionCodeState$delegate", "getRedemptionCodeState", "()Lcom/yalla/yalla/ui/vm/main/RedemptionCodeVm$RedemptionCodeState;", "setRedemptionCodeState", "(Lcom/yalla/yalla/ui/vm/main/RedemptionCodeVm$RedemptionCodeState;)V", "redemptionCodeState", "Landroidx/compose/runtime/MutableState;", "", "redemptionCodeDialogShow", "getRedemptionCodeDialogShow", "()Landroidx/compose/runtime/MutableState;", "setRedemptionCodeDialogShow", "(Landroidx/compose/runtime/MutableState;)V", "Lkotlin/Function0;", "redemptionCodeDialogDismissListener", "Lkotlin/jvm/functions/Function0;", "getRedemptionCodeDialogDismissListener", "()Lkotlin/jvm/functions/Function0;", "setRedemptionCodeDialogDismissListener", "(Lkotlin/jvm/functions/Function0;)V", "searchTextSetter", "Lkotlin/jvm/functions/Function1;", "getSearchTextSetter", "()Lkotlin/jvm/functions/Function1;", "setSearchTextSetter", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/geetest/captcha/GTCaptcha4Client;", "mGTCaptcha4Client", "Lcom/geetest/captcha/GTCaptcha4Client;", "geetCodeErrorDialogShow", "getGeetCodeErrorDialogShow", "geetCodeErrorDialogContent$delegate", "getGeetCodeErrorDialogContent", "setGeetCodeErrorDialogContent", "geetCodeErrorDialogContent", "checkGeetErrorCount$delegate", "getCheckGeetErrorCount", "setCheckGeetErrorCount", "checkGeetErrorCount", "checkGeetErrorCountMax", "I", "Lo00Oo000/OooO0O0;", "Lcom/yalla/yalla/model/RedemptionCodeModel;", "cdkeyListPager", "Lo00Oo000/OooO0O0;", "getCdkeyListPager", "()Lo00Oo000/OooO0O0;", "LocalCodeRedemptionFailed", "<init>", "()V", "RedemptionCodeState", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRedemptionCodeVm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedemptionCodeVm.kt\ncom/yalla/yalla/ui/vm/main/RedemptionCodeVm\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,218:1\n81#2:219\n107#2,2:220\n81#2:222\n107#2,2:223\n81#2:225\n107#2,2:226\n81#2:228\n107#2,2:229\n81#2:231\n107#2,2:232\n81#2:234\n107#2,2:235\n81#2:237\n107#2,2:238\n81#2:240\n107#2,2:241\n*S KotlinDebug\n*F\n+ 1 RedemptionCodeVm.kt\ncom/yalla/yalla/ui/vm/main/RedemptionCodeVm\n*L\n38#1:219\n38#1:220,2\n39#1:222\n39#1:223,2\n40#1:225\n40#1:226,2\n41#1:228\n41#1:229,2\n42#1:231\n42#1:232,2\n43#1:234\n43#1:235,2\n52#1:237\n52#1:238,2\n134#1:240\n134#1:241,2\n*E\n"})
public final class RedemptionCodeVm extends o0O0O00 {
    public static final int $stable = 8;
    private final int LocalCodeRedemptionFailed;

    @NotNull
    private final p143o00Oo000.OooO0O0<RedemptionCodeModel> cdkeyListPager;

    /* JADX INFO: renamed from: checkGeetErrorCount$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState checkGeetErrorCount;
    private int checkGeetErrorCountMax;

    /* JADX INFO: renamed from: geetCodeErrorDialogContent$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState geetCodeErrorDialogContent;

    @NotNull
    private final MutableState<Boolean> geetCodeErrorDialogShow;

    @Nullable
    private GTCaptcha4Client mGTCaptcha4Client;

    @Nullable
    private Function0<Unit> redemptionCodeDialogDismissListener;

    @NotNull
    private MutableState<Boolean> redemptionCodeDialogShow;

    @Nullable
    private Function1<? super String, Unit> searchTextSetter;

    @NotNull
    private final x0 loadingDialogState = new x0(false);

    /* JADX INFO: renamed from: redemptionCodeResult$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState redemptionCodeResult = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: searchText$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState searchText = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* JADX INFO: renamed from: geetinfoCodeText$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState geetinfoCodeText = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* JADX INFO: renamed from: geetinfoCodeErrorCode$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState geetinfoCodeErrorCode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);

    /* JADX INFO: renamed from: geetinfoCodeErrorMessage$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState geetinfoCodeErrorMessage = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* JADX INFO: renamed from: redemptionCodeState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState redemptionCodeState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(RedemptionCodeState.Default, null, 2, null);

    public static final class OooO extends Lambda implements Function0<Unit> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            RedemptionCodeVm.this.getLoadingDialogState().f50363OooO00o.setValue(Boolean.FALSE);
            p592o0oo00O.OooOOO0.OooO0o("wrm geetinfoCode webViewShow");
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function1<String, Unit> searchTextSetter = RedemptionCodeVm.this.getSearchTextSetter();
            if (searchTextSetter != null) {
                searchTextSetter.invoke("");
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.RedemptionCodeVm$cdkeyListPager$1", f = "RedemptionCodeVm.kt", i = {}, l = {176}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<Integer, Continuation<? super p143o00Oo000.OooO<RedemptionCodeModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31824OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ int f31825OooO0o0;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(continuation);
            oooO0O0.f31825OooO0o0 = ((Number) obj).intValue();
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super p143o00Oo000.OooO<RedemptionCodeModel>> continuation) {
            return ((OooO0O0) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31824OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = this.f31825OooO0o0;
                this.f31824OooO0Oo = 1;
                String strOooO0OO = o000OOo0.OooO0OO("/Webservers/cdkey/List");
                o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0OO, "url", strOooO0OO, 0);
                o0o0oooOooO00o.OooO0O0(Boxing.boxInt(i2), "pageIndex");
                obj = OooOOO.OooO0Oo(new RedemptionCodeRepo$cdkeyList$$inlined$call$1(o0o0oooOooO00o, null), this);
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
            List list = (List) apiResult.getData();
            Collection collection = (Collection) apiResult.getData();
            return apiResult.toPagingLoadResource(list, !(collection == null || collection.isEmpty()));
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            RedemptionCodeVm.this.getLoadingDialogState().f50363OooO00o.setValue(Boolean.FALSE);
            p592o0oo00O.OooOOO0.OooO0Oo("wrm geetinfoCode callNetFailure");
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            RedemptionCodeVm redemptionCodeVm = RedemptionCodeVm.this;
            redemptionCodeVm.getLoadingDialogState().f50363OooO00o.setValue(Boolean.FALSE);
            redemptionCodeVm.setCheckGeetErrorCount(redemptionCodeVm.getCheckGeetErrorCount() + 1);
            if (redemptionCodeVm.getCheckGeetErrorCount() >= redemptionCodeVm.checkGeetErrorCountMax) {
                o000O00O.OooO00o(oO00OOo0.redemption_error_3014);
            }
            p592o0oo00O.OooOOO0.OooO("wrm geetinfoCode checkError");
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f31829OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0(Function1<? super String, Unit> function1) {
            super(1);
            this.f31829OooO0o0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            RedemptionCodeVm redemptionCodeVm = RedemptionCodeVm.this;
            redemptionCodeVm.getLoadingDialogState().f50363OooO00o.setValue(Boolean.FALSE);
            redemptionCodeVm.setGeetinfoCodeText(it);
            Function1<String, Unit> function1 = this.f31829OooO0o0;
            if (function1 != null) {
                function1.invoke(it);
            }
            p592o0oo00O.OooOOO0.OooO0O0("wrm geetinfoCode checkSuccess it = " + it);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.RedemptionCodeVm$toCdKeyExchange$1", f = "RedemptionCodeVm.kt", i = {}, l = {90, 94}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31830OooO0Oo;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.RedemptionCodeVm$toCdKeyExchange$1$1", f = "RedemptionCodeVm.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<ApiError, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f31832OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ RedemptionCodeVm f31833OooO0o0;

            /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.main.RedemptionCodeVm$OooOO0O$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C0354OooO00o extends Lambda implements Function1<Integer, Unit> {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public final /* synthetic */ ApiError f31834OooO0Oo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0354OooO00o(ApiError apiError) {
                    super(1);
                    this.f31834OooO0Oo = apiError;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Integer num) {
                    num.intValue();
                    ApiError error = this.f31834OooO0Oo;
                    Intrinsics.checkNotNullParameter(error, "error");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(RedemptionCodeVm redemptionCodeVm, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f31833OooO0o0 = redemptionCodeVm;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f31833OooO0o0, continuation);
                oooO00o.f31832OooO0Oo = obj;
                return oooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiError apiError, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(apiError, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                ApiError apiError = (ApiError) this.f31832OooO0Oo;
                RedemptionCodeVm redemptionCodeVm = this.f31833OooO0o0;
                redemptionCodeVm.getLoadingDialogState().f50363OooO00o.setValue(Boxing.boxBoolean(false));
                redemptionCodeVm.setRedemptionCodeState(RedemptionCodeState.Error);
                redemptionCodeVm.setGeetinfoCodeErrorCode(apiError.getCode());
                redemptionCodeVm.setGeetinfoCodeErrorMessage(apiError.getMessage());
                redemptionCodeVm.setGeetCodeErrorDialogContent(redemptionCodeVm.getErrorMessage(new C0354OooO00o(apiError)));
                int code = apiError.getCode();
                if (code == 3014) {
                    ApiError3014 apiError3014 = (ApiError3014) p140o00OOooo.OooOO0.OooO0O0(ApiError3014.class, redemptionCodeVm.getGeetinfoCodeErrorMessage());
                    redemptionCodeVm.setGeetCodeErrorDialogContent(o0OoOo0.OooOOO(apiError3014 != null ? apiError3014.getMessage() : null, o0000.OooO0OO(oO00OOo0.redemption_error_3014)));
                    redemptionCodeVm.getGeetCodeErrorDialogShow().setValue(Boxing.boxBoolean(true));
                } else if (code == 3016) {
                    ApiError3016 apiError3016 = (ApiError3016) p140o00OOooo.OooOO0.OooO0O0(ApiError3016.class, redemptionCodeVm.getGeetinfoCodeErrorMessage());
                    redemptionCodeVm.setGeetCodeErrorDialogContent(o0OoOo0.OooOOO(apiError3016 != null ? apiError3016.getMessage() : null, o0000.OooO0OO(oO00OOo0.redemption_error_3016)));
                    redemptionCodeVm.getGeetCodeErrorDialogShow().setValue(Boxing.boxBoolean(true));
                }
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.RedemptionCodeVm$toCdKeyExchange$1$2", f = "RedemptionCodeVm.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<List<RedemptionCodeAwards>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f31835OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ RedemptionCodeVm f31836OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(RedemptionCodeVm redemptionCodeVm, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f31836OooO0o0 = redemptionCodeVm;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0O0 oooO0O0 = new OooO0O0(this.f31836OooO0o0, continuation);
                oooO0O0.f31835OooO0Oo = obj;
                return oooO0O0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(List<RedemptionCodeAwards> list, Continuation<? super Unit> continuation) {
                return ((OooO0O0) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                List<RedemptionCodeAwards> list = (List) this.f31835OooO0Oo;
                RedemptionCodeVm redemptionCodeVm = this.f31836OooO0o0;
                redemptionCodeVm.getLoadingDialogState().f50363OooO00o.setValue(Boxing.boxBoolean(false));
                redemptionCodeVm.setGeetinfoCodeErrorCode(0);
                redemptionCodeVm.setGeetinfoCodeErrorMessage("");
                redemptionCodeVm.setGeetCodeErrorDialogContent("");
                if (list != null) {
                    redemptionCodeVm.setCheckGeetErrorCount(0);
                    redemptionCodeVm.setRedemptionCodeResult(list);
                    redemptionCodeVm.setRedemptionCodeState(RedemptionCodeState.Success);
                    redemptionCodeVm.getRedemptionCodeDialogShow().setValue(Boxing.boxBoolean(true));
                }
                return Unit.INSTANCE;
            }
        }

        public OooOO0O(Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RedemptionCodeVm.this.new OooOO0O(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31830OooO0Oo;
            RedemptionCodeVm redemptionCodeVm = RedemptionCodeVm.this;
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
            p592o0oo00O.OooOOO0.OooO0O0("wrm toCdKeyExchange\n searchText = " + redemptionCodeVm.getSearchText() + "\n geetinfoCodeText = " + redemptionCodeVm.getGeetinfoCodeText());
            redemptionCodeVm.getLoadingDialogState().f50363OooO00o.setValue(Boxing.boxBoolean(true));
            String searchText = redemptionCodeVm.getSearchText();
            String geetinfoCodeText = redemptionCodeVm.getGeetinfoCodeText();
            this.f31830OooO0Oo = 1;
            String url = o000OOo0.OooO0OO("/Webservers/cdkey/Exchange");
            Intrinsics.checkNotNullParameter(url, "url");
            o0O0ooO o0o0ooo = new o0O0ooO(url, 1);
            o0o0ooo.OooO0O0(searchText, "cdk");
            o0o0ooo.OooO0O0(geetinfoCodeText, "geetinfo");
            obj = OooOOO.OooO0Oo(new RedemptionCodeRepo$cdKeyExchange$$inlined$call$1(o0o0ooo, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            OooO00o oooO00o = new OooO00o(redemptionCodeVm, null);
            OooO0O0 oooO0O0 = new OooO0O0(redemptionCodeVm, null);
            this.f31830OooO0Oo = 2;
            if (o000O000.OooO0OO((ApiResult) obj, true, null, oooO00o, oooO0O0, this, 2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.RedemptionCodeVm$toRedemptionCode$1", f = "RedemptionCodeVm.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31837OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Context f31838OooO0o;

        public static final class OooO00o extends Lambda implements Function1<String, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ RedemptionCodeVm f31840OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(RedemptionCodeVm redemptionCodeVm) {
                super(1);
                this.f31840OooO0Oo = redemptionCodeVm;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(String str) {
                String it = str;
                Intrinsics.checkNotNullParameter(it, "it");
                this.f31840OooO0Oo.toCdKeyExchange();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(Context context, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f31838OooO0o = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RedemptionCodeVm.this.new OooOOO0(this.f31838OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31837OooO0Oo;
            boolean z = false;
            RedemptionCodeVm redemptionCodeVm = RedemptionCodeVm.this;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                redemptionCodeVm.getLoadingDialogState().f50363OooO00o.setValue(Boxing.boxBoolean(true));
                this.f31837OooO0Oo = 1;
                String strOooO0OO = o000OOo0.OooO0OO("/Webservers/geet/getCdkInfo");
                obj = OooOOO.OooO0Oo(new RedemptionCodeRepo$getCdkInfo$$inlined$call$1(o00oOoo.OooO00o(strOooO0OO, "url", strOooO0OO, 0), null), this);
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
            if (apiResult.isSuccess()) {
                RedemptionCdkInfoModel redemptionCdkInfoModel = (RedemptionCdkInfoModel) apiResult.getData();
                if (redemptionCdkInfoModel != null && !redemptionCdkInfoModel.getRedemptionCodeIsOpenGeen()) {
                    z = true;
                }
                if (z) {
                    redemptionCodeVm.toCdKeyExchange();
                    return Unit.INSTANCE;
                }
            }
            RedemptionCdkInfoModel redemptionCdkInfoModel2 = (RedemptionCdkInfoModel) apiResult.getData();
            redemptionCodeVm.checkGeetinfo(this.f31838OooO0o, o0OoOo0.OooOOO(redemptionCdkInfoModel2 != null ? redemptionCdkInfoModel2.getRedemptionCodeCaptchaId() : null, ""), new OooO00o(redemptionCodeVm));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/vm/main/RedemptionCodeVm$RedemptionCodeState;", "", "Default", "Success", "Error", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
    public enum RedemptionCodeState {
        Default,
        Success,
        Error
    }

    public RedemptionCodeVm() {
        Boolean bool = Boolean.FALSE;
        this.redemptionCodeDialogShow = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.geetCodeErrorDialogShow = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.geetCodeErrorDialogContent = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.redemptionCodeDialogDismissListener = new OooO00o();
        this.checkGeetErrorCount = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.checkGeetErrorCountMax = 5;
        this.cdkeyListPager = new p143o00Oo000.OooO0O0<>(ViewModelKt.getViewModelScope(this), new OooO0O0(null));
        this.LocalCodeRedemptionFailed = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkGeetinfo(Context context, String redemptionCodeCaptchaId, Function1<? super String, Unit> listener) {
        this.loadingDialogState.f50363OooO00o.setValue(Boolean.TRUE);
        setCheckGeetErrorCount(0);
        Intrinsics.checkNotNullParameter(redemptionCodeCaptchaId, "captchaId");
        if (redemptionCodeCaptchaId.length() == 0) {
            redemptionCodeCaptchaId = "af8e1655cb046a9b3b9bb9121ad4890f";
        }
        this.mGTCaptcha4Client = o00Ooo.OooO00o(context, redemptionCodeCaptchaId, new OooO0OO(), new OooO0o(), new OooO(), new OooOO0(listener));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void checkGeetinfo$default(RedemptionCodeVm redemptionCodeVm, Context context, String str, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        redemptionCodeVm.checkGeetinfo(context, str, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int getCheckGeetErrorCount() {
        return ((Number) this.checkGeetErrorCount.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String getErrorMessage$default(RedemptionCodeVm redemptionCodeVm, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return redemptionCodeVm.getErrorMessage(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final String getGeetinfoCodeText() {
        return (String) this.geetinfoCodeText.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCheckGeetErrorCount(int i) {
        this.checkGeetErrorCount.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setGeetinfoCodeText(String str) {
        this.geetinfoCodeText.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toCdKeyExchange() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooOO0O(null), 3, null);
    }

    public final void destroy() {
        GTCaptcha4Client gTCaptcha4Client = this.mGTCaptcha4Client;
        if (gTCaptcha4Client != null) {
            gTCaptcha4Client.destroy();
        }
        this.mGTCaptcha4Client = null;
    }

    @NotNull
    public final p143o00Oo000.OooO0O0<RedemptionCodeModel> getCdkeyListPager() {
        return this.cdkeyListPager;
    }

    @NotNull
    public final String getErrorMessage(@Nullable Function1<? super Integer, Unit> isOtherCodeListener) {
        int geetinfoCodeErrorCode = getGeetinfoCodeErrorCode();
        if (geetinfoCodeErrorCode == 3014) {
            return "";
        }
        if (geetinfoCodeErrorCode == 3015) {
            ApiError3015 apiError3015 = (ApiError3015) p140o00OOooo.OooOO0.OooO0O0(ApiError3015.class, getGeetinfoCodeErrorMessage());
            return o0OoOo0.OooOOO(apiError3015 != null ? apiError3015.getMessage() : null, o0000.OooO0OO(oO00OOo0.redemption_error_3015));
        }
        if (geetinfoCodeErrorCode == 3016) {
            return "";
        }
        if (geetinfoCodeErrorCode == 3017) {
            ApiError3017 apiError3017 = (ApiError3017) p140o00OOooo.OooOO0.OooO0O0(ApiError3017.class, getGeetinfoCodeErrorMessage());
            return o0OoOo0.OooOOO(apiError3017 != null ? apiError3017.getMessage() : null, o0000.OooO0OO(oO00OOo0.redemption_error_3017));
        }
        if (geetinfoCodeErrorCode == 3018) {
            ApiError3018 apiError3018 = (ApiError3018) p140o00OOooo.OooOO0.OooO0O0(ApiError3018.class, getGeetinfoCodeErrorMessage());
            return o0OoOo0.OooOOO(apiError3018 != null ? apiError3018.getMessage() : null, o0000.OooO0OO(oO00OOo0.redemption_error_3018));
        }
        if (geetinfoCodeErrorCode == 3019) {
            ApiError3019 apiError3019 = (ApiError3019) p140o00OOooo.OooOO0.OooO0O0(ApiError3019.class, getGeetinfoCodeErrorMessage());
            return o0OoOo0.OooOOO(apiError3019 != null ? apiError3019.getMessage() : null, o0000.OooO0OO(oO00OOo0.redemption_error_3019));
        }
        if (geetinfoCodeErrorCode == 3020) {
            ApiError3020 apiError3020 = (ApiError3020) p140o00OOooo.OooOO0.OooO0O0(ApiError3020.class, getGeetinfoCodeErrorMessage());
            return o0OoOo0.OooOOO(apiError3020 != null ? apiError3020.getMessage() : null, o0000.OooO0OO(oO00OOo0.redemption_error_3020));
        }
        if (geetinfoCodeErrorCode == this.LocalCodeRedemptionFailed) {
            return o0000.OooO0OO(oO00OOo0.redemption_failed);
        }
        if (isOtherCodeListener == null) {
            return "";
        }
        isOtherCodeListener.invoke(Integer.valueOf(getGeetinfoCodeErrorCode()));
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String getGeetCodeErrorDialogContent() {
        return (String) this.geetCodeErrorDialogContent.getValue();
    }

    @NotNull
    public final MutableState<Boolean> getGeetCodeErrorDialogShow() {
        return this.geetCodeErrorDialogShow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getGeetinfoCodeErrorCode() {
        return ((Number) this.geetinfoCodeErrorCode.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String getGeetinfoCodeErrorMessage() {
        return (String) this.geetinfoCodeErrorMessage.getValue();
    }

    @NotNull
    public final x0 getLoadingDialogState() {
        return this.loadingDialogState;
    }

    @Nullable
    public final Function0<Unit> getRedemptionCodeDialogDismissListener() {
        return this.redemptionCodeDialogDismissListener;
    }

    @NotNull
    public final MutableState<Boolean> getRedemptionCodeDialogShow() {
        return this.redemptionCodeDialogShow;
    }

    @Nullable
    public final List<RedemptionCodeAwards> getRedemptionCodeResult() {
        return (List) this.redemptionCodeResult.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final RedemptionCodeState getRedemptionCodeState() {
        return (RedemptionCodeState) this.redemptionCodeState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String getSearchText() {
        return (String) this.searchText.getValue();
    }

    @Nullable
    public final Function1<String, Unit> getSearchTextSetter() {
        return this.searchTextSetter;
    }

    public final void setGeetCodeErrorDialogContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.geetCodeErrorDialogContent.setValue(str);
    }

    public final void setGeetinfoCodeErrorCode(int i) {
        this.geetinfoCodeErrorCode.setValue(Integer.valueOf(i));
    }

    public final void setGeetinfoCodeErrorMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.geetinfoCodeErrorMessage.setValue(str);
    }

    public final void setRedemptionCodeDialogDismissListener(@Nullable Function0<Unit> function0) {
        this.redemptionCodeDialogDismissListener = function0;
    }

    public final void setRedemptionCodeDialogShow(@NotNull MutableState<Boolean> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.redemptionCodeDialogShow = mutableState;
    }

    public final void setRedemptionCodeResult(@Nullable List<RedemptionCodeAwards> list) {
        this.redemptionCodeResult.setValue(list);
    }

    public final void setRedemptionCodeState(@NotNull RedemptionCodeState redemptionCodeState) {
        Intrinsics.checkNotNullParameter(redemptionCodeState, "<set-?>");
        this.redemptionCodeState.setValue(redemptionCodeState);
    }

    public final void setSearchText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.searchText.setValue(str);
    }

    public final void setSearchTextSetter(@Nullable Function1<? super String, Unit> function1) {
        this.searchTextSetter = function1;
    }

    public final void toLocalCodeRedemptionFailed() {
        setGeetinfoCodeErrorCode(this.LocalCodeRedemptionFailed);
    }

    public final void toRedemptionCode(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (getSearchText().length() == 0) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooOOO0(context, null), 3, null);
    }
}

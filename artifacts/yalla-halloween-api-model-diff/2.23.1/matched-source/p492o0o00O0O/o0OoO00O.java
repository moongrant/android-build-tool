package p492o0o00O0O;

import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.vm.main.WebVM;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.main.WebActivity$WebContent$2", f = "WebActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o0OoO00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ WebActivity f49032OooO0Oo;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WebFrom.values().length];
            try {
                iArr[WebFrom.Ad.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WebFrom.FAQ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WebFrom.RoomBonus.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WebFrom.TermsOfService.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoO00O(WebActivity webActivity, Continuation<? super o0OoO00O> continuation) {
        super(2, continuation);
        this.f49032OooO0Oo = webActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0OoO00O(this.f49032OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0OoO00O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int i = WebActivity.f25131OooOoO0;
        WebActivity webActivity = this.f49032OooO0Oo;
        WebVM webVMOooOoO0 = webActivity.OooOoO0();
        WebPageInfo webPageInfo = webActivity.f25138OooOo0O;
        WebPageInfo webPageInfo2 = null;
        if (webPageInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            webPageInfo = null;
        }
        webVMOooOoO0.setToolbarTitle(webPageInfo.f32290OooO0oO);
        WebVM webVMOooOoO1 = webActivity.OooOoO0();
        WebPageInfo webPageInfo3 = webActivity.f25138OooOo0O;
        if (webPageInfo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            webPageInfo3 = null;
        }
        webVMOooOoO1.setBackIconIsClose(webPageInfo3.f32286OooO);
        WebVM webVMOooOoO2 = webActivity.OooOoO0();
        WebPageInfo webPageInfo4 = webActivity.f25138OooOo0O;
        if (webPageInfo4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            webPageInfo4 = null;
        }
        webVMOooOoO2.setShowMenuShare(webPageInfo4.f32293OooOO0O != WebPageInfo.ShareType.NoShare);
        WebVM webVMOooOoO3 = webActivity.OooOoO0();
        WebPageInfo webPageInfo5 = webActivity.f25138OooOo0O;
        if (webPageInfo5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            webPageInfo5 = null;
        }
        webVMOooOoO3.setShowMenuOpenInBrowser(webPageInfo5.f32295OooOOO);
        WebPageInfo webPageInfo6 = webActivity.f25138OooOo0O;
        if (webPageInfo6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            webPageInfo6 = null;
        }
        int i2 = OooO00o.$EnumSwitchMapping$0[webPageInfo6.f32287OooO0Oo.ordinal()];
        if (i2 == 1) {
            webActivity.OooOoO0().setShowToolbar(false);
            webActivity.OooOoO0().setStatusBarBlackIcon(false);
            webActivity.OooOoO0().setShowCloseAdIcon(true);
        } else if (i2 == 2 || i2 == 3 || i2 == 4) {
            webActivity.OooOoO0().setShowToolbar(true);
            webActivity.OooOoO0().setStatusBarBlackIcon(true);
            webActivity.OooOoO0().setShowMenuRefresh(true);
            webActivity.OooOoO0().setShowCloseAdIcon(false);
            webActivity.OooOoO0().setToolbarGreenStyle(false);
        } else {
            WebVM webVMOooOoO4 = webActivity.OooOoO0();
            WebPageInfo webPageInfo7 = webActivity.f25138OooOo0O;
            if (webPageInfo7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo7 = null;
            }
            webVMOooOoO4.setShowToolbar(!webPageInfo7.f32288OooO0o);
            webActivity.OooOoO0().setStatusBarBlackIcon(false);
            WebVM webVMOooOoO5 = webActivity.OooOoO0();
            WebPageInfo webPageInfo8 = webActivity.f25138OooOo0O;
            if (webPageInfo8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo8 = null;
            }
            webVMOooOoO5.setShowMenuRefresh(!webPageInfo8.f32288OooO0o);
            webActivity.OooOoO0().setShowCloseAdIcon(false);
            WebVM webVMOooOoO6 = webActivity.OooOoO0();
            WebPageInfo webPageInfo9 = webActivity.f25138OooOo0O;
            if (webPageInfo9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            } else {
                webPageInfo2 = webPageInfo9;
            }
            webVMOooOoO6.setToolbarGreenStyle(!webPageInfo2.f32288OooO0o);
        }
        return Unit.INSTANCE;
    }
}

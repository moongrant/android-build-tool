package p429o0OoOO;

import androidx.lifecycle.MutableLiveData;
import com.code.android.util.OooOOO;
import com.yalla.yalla.data.repository.UIThemeRepo$getUIThemeConfig$$inlined$call$1;
import com.yalla.yalla.model.UIThemeConfigModel;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p380o0OOoOo.oo000o;
import p414o0Oo0oO.oO000O0O;
import p415o0Oo0oO0.o00Ooo;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.manager.AppUIThemeManager$init$1", f = "AppUIThemeManager.kt", i = {}, l = {17, 20}, m = "invokeSuspend", n = {}, s = {})
public final class OooOOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f46769OooO0Oo;

    @DebugMetadata(c = "com.yalla.yalla.manager.AppUIThemeManager$init$1$1$1", f = "AppUIThemeManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ UIThemeConfigModel f46770OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(UIThemeConfigModel uIThemeConfigModel, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f46770OooO0Oo = uIThemeConfigModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f46770OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            MutableLiveData<Integer> mutableLiveData = OooOo00.f46776OooO00o;
            int config = this.f46770OooO0Oo.getConfig();
            MutableLiveData<Integer> mutableLiveData2 = OooOo00.f46776OooO00o;
            Integer value = mutableLiveData2.getValue();
            if (value == null || value.intValue() != config) {
                mutableLiveData2.setValue(Integer.valueOf(config));
                ((oO000O0O) o00Ooo.f46419OooOOO0.getValue()).OooO0oO(config, "config");
            }
            return Unit.INSTANCE;
        }
    }

    public OooOOOO(Continuation<? super OooOOOO> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOOOO(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new OooOOOO(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        UIThemeConfigModel uIThemeConfigModel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f46769OooO0Oo;
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
        this.f46769OooO0Oo = 1;
        String strOooO0OO = oo000o.OooO0OO("/Webservers/AppUI/GetConfig");
        obj = OooOOO.OooO0Oo(new UIThemeRepo$getUIThemeConfig$$inlined$call$1(p391o0OOooo0.oo000o.OooO00o(strOooO0OO, "url", strOooO0OO, 0), null), this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        ApiResult apiResult = (ApiResult) obj;
        if (apiResult.isSuccess() && (uIThemeConfigModel = (UIThemeConfigModel) apiResult.getData()) != null) {
            OooO00o oooO00o = new OooO00o(uIThemeConfigModel, null);
            this.f46769OooO0Oo = 2;
            if (OooOOO.OooO0o0(oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}

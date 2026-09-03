package p427o0OoOO00;

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
import p376o0OOoOOO.o000OOo0;
import p385o0OOooOO.o00oOoo;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.oo000o;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.manager.AppUIThemeManager$init$1", f = "AppUIThemeManager.kt", i = {}, l = {17, 20}, m = "invokeSuspend", n = {}, s = {})
public final class OooOo00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f45670OooO0Oo;

    @DebugMetadata(c = "com.yalla.yalla.manager.AppUIThemeManager$init$1$1$1", f = "AppUIThemeManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ UIThemeConfigModel f45671OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(UIThemeConfigModel uIThemeConfigModel, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f45671OooO0Oo = uIThemeConfigModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f45671OooO0Oo, continuation);
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
            MutableLiveData<Integer> mutableLiveData = OooOo.f45669OooO00o;
            int config = this.f45671OooO0Oo.getConfig();
            MutableLiveData<Integer> mutableLiveData2 = OooOo.f45669OooO00o;
            Integer value = mutableLiveData2.getValue();
            if (value == null || value.intValue() != config) {
                mutableLiveData2.setValue(Integer.valueOf(config));
                ((oo000o) o00Oo0.f45188OooOOO0.getValue()).OooO0oO(config, "config");
            }
            return Unit.INSTANCE;
        }
    }

    public OooOo00(Continuation<? super OooOo00> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOo00(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new OooOo00(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        UIThemeConfigModel uIThemeConfigModel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f45670OooO0Oo;
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
        this.f45670OooO0Oo = 1;
        String strOooO0OO = o000OOo0.OooO0OO("/Webservers/AppUI/GetConfig");
        obj = OooOOO.OooO0Oo(new UIThemeRepo$getUIThemeConfig$$inlined$call$1(o00oOoo.OooO00o(strOooO0OO, "url", strOooO0OO, 0), null), this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        ApiResult apiResult = (ApiResult) obj;
        if (apiResult.isSuccess() && (uIThemeConfigModel = (UIThemeConfigModel) apiResult.getData()) != null) {
            OooO00o oooO00o = new OooO00o(uIThemeConfigModel, null);
            this.f45670OooO0Oo = 2;
            if (OooOOO.OooO0o0(oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}

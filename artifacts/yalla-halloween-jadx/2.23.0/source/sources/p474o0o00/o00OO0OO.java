package p474o0o00;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p367o0OOo0o0.OooOO0O;
import p367o0OOo0o0.Oooo000;
import p382o0OOoo0o.o0OoOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO0OO extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PhoneNumberActivity f47277OooO0Oo;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.account.PhoneNumberActivity$checkPhoneRegister$2$1$1", f = "PhoneNumberActivity.kt", i = {}, l = {299}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f47278OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PhoneNumberActivity f47279OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(PhoneNumberActivity phoneNumberActivity, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f47279OooO0o0 = phoneNumberActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f47279OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f47278OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f47278OooO0Oo = 1;
                if (DelayKt.delay(100L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            int i2 = PhoneNumberActivity.f25262OooOoO;
            PhoneNumberActivity phoneNumberActivity = this.f47279OooO0o0;
            phoneNumberActivity.getClass();
            ((MutableLiveData) o0OoOo0.f44301OooO0O0.getValue()).observe(phoneNumberActivity, new PhoneNumberActivity.OooO0o(new o0O00o0(phoneNumberActivity)));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0OO(PhoneNumberActivity phoneNumberActivity) {
        super(0);
        this.f47277OooO0Oo = phoneNumberActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        int i = PhoneNumberActivity.f25262OooOoO;
        PhoneNumberActivity phoneNumberActivity = this.f47277OooO0Oo;
        phoneNumberActivity.OooOoO().f59422OooO0OO.clearFocus();
        EditText view = phoneNumberActivity.OooOoO().f59422OooO0OO;
        Intrinsics.checkNotNullExpressionValue(view, "binding.etPhoneNumber");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        InputMethodManager inputMethodManagerOooO00o = Oooo000.OooO00o(context);
        OooOO0O.OooO00o(view.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view.getWindowToken(), 0);
        return BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(phoneNumberActivity), null, null, new OooO00o(phoneNumberActivity, null), 3, null);
    }
}

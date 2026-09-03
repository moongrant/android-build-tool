package p519o0o0O0oO;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000OO00;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p641o0ooOOOO.n1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO00O0oO extends o00O0O00 {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f52814OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public n1 f52815OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f52816OooOOOO;

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.LoadingDialog$dismiss$1", f = "LoadingDialog.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f52817OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f52818OooO0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f52818OooO0o = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return oO00O0oO.this.new OooO00o(this.f52818OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f52817OooO0Oo;
            oO00O0oO oo00o0oo = oO00O0oO.this;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = oo00o0oo.f52814OooOOO - this.f52818OooO0o;
                this.f52817OooO0Oo = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            oo00o0oo.dismiss();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00O0oO(@NotNull Context context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setDimAmount(0.4f);
        }
        setCanceledOnTouchOutside(false);
        this.f52543OooO.setGravity(17);
        Window window3 = getWindow();
        Intrinsics.checkNotNull(window3);
        window3.setGravity(17);
    }

    public static Activity OooO0Oo(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "baseContext");
        return OooO0Oo(baseContext);
    }

    @Override // p519o0o0O0oO.o00O0O00
    public final void OooO0O0(@NotNull LinearLayout rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        n1 n1VarInflate = n1.inflate(getLayoutInflater(), rootView, true);
        Intrinsics.checkNotNullExpressionValue(n1VarInflate, "inflate(layoutInflater, rootView, true)");
        Intrinsics.checkNotNullParameter(n1VarInflate, "<set-?>");
        this.f52815OooOOO0 = n1VarInflate;
    }

    public final void OooO0o0(long j, @Nullable String str) {
        n1 n1Var = this.f52815OooOOO0;
        n1 n1Var2 = null;
        if (n1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            n1Var = null;
        }
        n1Var.f58438OooO0OO.setText(str);
        if (str == null || str.length() == 0) {
            n1 n1Var3 = this.f52815OooOOO0;
            if (n1Var3 != null) {
                n1Var2 = n1Var3;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            TextView textView = n1Var2.f58438OooO0OO;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvLoading");
            o000OO00.OooO0O0(textView);
        } else {
            n1 n1Var4 = this.f52815OooOOO0;
            if (n1Var4 != null) {
                n1Var2 = n1Var4;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            TextView textView2 = n1Var2.f58438OooO0OO;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvLoading");
            o000OO00.OooOOOO(textView2);
        }
        this.f52814OooOOO = j;
        show();
    }

    @Override // com.yalla.yalla.ui.dialog.LifeCycleDialog, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        try {
            if (this.f52814OooOOO > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f52816OooOOOO;
                if (jCurrentTimeMillis < this.f52814OooOOO) {
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO00o(jCurrentTimeMillis, null), 3, null);
                    return;
                }
            }
            this.f52814OooOOO = 0L;
            this.f52816OooOOOO = 0L;
            super.dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    @Override // p519o0o0O0oO.o00O0O00, com.yalla.yalla.ui.dialog.LifeCycleDialog, android.app.Dialog
    public final void show() {
        boolean z;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Activity activityOooO0Oo = OooO0Oo(context);
        if (getContext() != null) {
            Intrinsics.checkNotNull(activityOooO0Oo);
            z = (activityOooO0Oo.isDestroyed() || activityOooO0Oo.isFinishing()) ? false : true;
        }
        if (z) {
            if (!isShowing()) {
                super.show();
                n1 n1Var = this.f52815OooOOO0;
                if (n1Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    n1Var = null;
                }
                n1Var.f58437OooO0O0.OooO0Oo();
            }
            this.f52816OooOOOO = System.currentTimeMillis();
        }
    }
}

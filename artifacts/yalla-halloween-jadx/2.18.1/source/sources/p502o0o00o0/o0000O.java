package p502o0o00o0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
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
import p254o00ooO0O.oOO00O;
import p649o0ooOOoo.z7;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public class o0000O extends o0000oo {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public long f41556OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public long f41557OoooOOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public z7 f41558o000oOoO;

    @DebugMetadata(c = "com.yalla.yalla.common.ui.dialog.LoadingDialog$dismiss$1", f = "LoadingDialog.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f41559Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f41561Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f41561Oooo0oo = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return o0000O.this.new OooO00o(this.f41561Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f41559Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = o0000O.this.f41556OoooOOO - this.f41561Oooo0oo;
                this.f41559Oooo0o = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            o0000O.this.dismiss();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O(@NotNull Context context) {
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
        this.f41580OoooO0.setGravity(17);
        Window window3 = getWindow();
        Intrinsics.checkNotNull(window3);
        window3.setGravity(17);
    }

    @Override // p502o0o00o0.o0000oo
    public final void OooO0O0(@NotNull ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        z7 z7VarInflate = z7.inflate(getLayoutInflater(), rootView, true);
        Intrinsics.checkNotNullExpressionValue(z7VarInflate, "inflate(layoutInflater, rootView, true)");
        Intrinsics.checkNotNullParameter(z7VarInflate, "<set-?>");
        this.f41558o000oOoO = z7VarInflate;
    }

    @NotNull
    public final z7 OooO0Oo() {
        z7 z7Var = this.f41558o000oOoO;
        if (z7Var != null) {
            return z7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void OooO0o(@Nullable String str, long j) {
        OooO0Oo().f51057OooO0OO.setText(str);
        if (str == null || str.length() == 0) {
            TextView textView = OooO0Oo().f51057OooO0OO;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvLoading");
            oOO00O.OooO00o(textView);
        } else {
            TextView textView2 = OooO0Oo().f51057OooO0OO;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvLoading");
            oOO00O.OooO(textView2);
        }
        this.f41556OoooOOO = j;
        show();
    }

    public final Activity OooO0o0(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "baseContext");
        return OooO0o0(baseContext);
    }

    @Override // com.yalla.yalla.common.ui.dialog.LifeCycleDialog, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        try {
            if (this.f41556OoooOOO > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f41557OoooOOo;
                if (jCurrentTimeMillis < this.f41556OoooOOO) {
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO00o(jCurrentTimeMillis, null), 3, null);
                    return;
                }
            }
            this.f41556OoooOOO = 0L;
            this.f41557OoooOOo = 0L;
            super.dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // p502o0o00o0.o0000oo, com.yalla.yalla.common.ui.dialog.LifeCycleDialog, android.app.Dialog
    public void show() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Activity activityOooO0o0 = OooO0o0(context);
        boolean z = false;
        if (getContext() != null) {
            Intrinsics.checkNotNull(activityOooO0o0);
            if (!activityOooO0o0.isDestroyed() && !activityOooO0o0.isFinishing()) {
                z = true;
            }
        }
        if (z) {
            if (!isShowing()) {
                super.show();
                OooO0Oo().f51056OooO0O0.OooO0OO();
            }
            this.f41557OoooOOo = System.currentTimeMillis();
        }
    }
}

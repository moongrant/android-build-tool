package p650o0ooo;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O;
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
import p405o0Oo0OOO.o0O0000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0OOO00 extends o0O0ooO {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f58696OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public o0O0000O f58697OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f58698OooOOOO;

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.LoadingDialog$dismiss$1", f = "LoadingDialog.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f58699OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f58700OooO0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f58700OooO0o = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return o0OOO00.this.new OooO00o(this.f58700OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f58699OooO0Oo;
            o0OOO00 o0ooo00 = o0OOO00.this;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = o0ooo00.f58696OooOOO - this.f58700OooO0o;
                this.f58699OooO0Oo = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            o0ooo00.dismiss();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO00(@NotNull Context context) {
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
        this.f58669OooO.setGravity(17);
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
        Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
        return OooO0Oo(baseContext);
    }

    @Override // p650o0ooo.o0O0ooO
    public final void OooO0O0(@NotNull LinearLayout rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        o0O0000O o0o0000oInflate = o0O0000O.inflate(getLayoutInflater(), rootView, true);
        Intrinsics.checkNotNullExpressionValue(o0o0000oInflate, "inflate(...)");
        Intrinsics.checkNotNullParameter(o0o0000oInflate, "<set-?>");
        this.f58697OooOOO0 = o0o0000oInflate;
    }

    public final void OooO0o0(long j, @Nullable String str) {
        o0O0000O o0o0000o2 = this.f58697OooOOO0;
        o0O0000O o0o0000o3 = null;
        if (o0o0000o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o0o0000o2 = null;
        }
        o0o0000o2.f44405OooO0OO.setText(str);
        if (str == null || str.length() == 0) {
            o0O0000O o0o0000o4 = this.f58697OooOOO0;
            if (o0o0000o4 != null) {
                o0o0000o3 = o0o0000o4;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            TextView tvLoading = o0o0000o3.f44405OooO0OO;
            Intrinsics.checkNotNullExpressionValue(tvLoading, "tvLoading");
            o000O.OooO0O0(tvLoading);
        } else {
            o0O0000O o0o0000o5 = this.f58697OooOOO0;
            if (o0o0000o5 != null) {
                o0o0000o3 = o0o0000o5;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            TextView tvLoading2 = o0o0000o3.f44405OooO0OO;
            Intrinsics.checkNotNullExpressionValue(tvLoading2, "tvLoading");
            o000O.OooOOOO(tvLoading2);
        }
        this.f58696OooOOO = j;
        show();
    }

    @Override // com.yalla.yalla.ui.dialog.LifeCycleDialog, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        try {
            if (this.f58696OooOOO > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f58698OooOOOO;
                if (jCurrentTimeMillis < this.f58696OooOOO) {
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO00o(jCurrentTimeMillis, null), 3, null);
                    return;
                }
            }
            this.f58696OooOOO = 0L;
            this.f58698OooOOOO = 0L;
            super.dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    @Override // p650o0ooo.o0O0ooO, com.yalla.yalla.ui.dialog.LifeCycleDialog, android.app.Dialog
    public final void show() {
        boolean z;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Activity activityOooO0Oo = OooO0Oo(context);
        if (getContext() != null) {
            Intrinsics.checkNotNull(activityOooO0Oo);
            z = (activityOooO0Oo.isDestroyed() || activityOooO0Oo.isFinishing()) ? false : true;
        }
        if (z) {
            if (!isShowing()) {
                super.show();
                o0O0000O o0o0000o2 = this.f58697OooOOO0;
                if (o0o0000o2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    o0o0000o2 = null;
                }
                o0o0000o2.f44404OooO0O0.OooO0Oo();
            }
            this.f58698OooOOOO = System.currentTimeMillis();
        }
    }
}

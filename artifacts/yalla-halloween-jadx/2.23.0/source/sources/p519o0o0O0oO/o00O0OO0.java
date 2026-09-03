package p519o0o0O0oO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o000OO00;
import com.yalla.support.statebutton.StateButton;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p641o0ooOOOO.x1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00O0OO0 extends o00O00OO {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f52561OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f52562OooOO0o;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            o00O0OO0.this.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<View, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            o00O0OO0 o00o0oo1 = o00O0OO0.this;
            o00o0oo1.OooO0O0();
            int i = TaskActivity.f25537OooOooO;
            TaskActivity.OooO00o.OooO00o(o00o0oo1.f52561OooOO0O, false);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<x1> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final x1 invoke() {
            o00O0OO0 o00o0oo1 = o00O0OO0.this;
            x1 x1VarInflate = x1.inflate(LayoutInflater.from(o00o0oo1.f52532OooO0Oo), o00o0oo1.f52533OooO0o, false);
            Intrinsics.checkNotNullExpressionValue(x1VarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
            return x1VarInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO0(@NotNull FragmentActivity activity) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f52561OooOO0O = activity;
        Lazy lazy = LazyKt.lazy(new OooO0OO());
        this.f52562OooOO0o = lazy;
        ConstraintLayout constraintLayout = ((x1) lazy.getValue()).f59232OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        OooO0oO(constraintLayout);
        Window window = this.f52535OooO0oO;
        if (window != null) {
            window.setGravity(17);
        }
        OooO0o(false);
        ImageView imageView = ((x1) lazy.getValue()).f59234OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivClose");
        o000OO00.OooO(imageView, new OooO00o());
        StateButton stateButton = ((x1) lazy.getValue()).f59233OooO0O0;
        Intrinsics.checkNotNullExpressionValue(stateButton, "binding.btConfirm");
        o000OO00.OooO(stateButton, new OooO0O0());
    }
}

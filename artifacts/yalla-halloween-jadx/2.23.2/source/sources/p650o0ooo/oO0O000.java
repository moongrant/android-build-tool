package p650o0ooo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o000O;
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
import p405o0Oo0OOO.o0O000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO0O000 extends o000OO00 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f58849OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f58850OooOO0o;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            oO0O000.this.OooO0O0();
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
            oO0O000 oo0o000 = oO0O000.this;
            oo0o000.OooO0O0();
            int i = TaskActivity.f25083OooOooO;
            TaskActivity.OooO00o.OooO00o(oo0o000.f58849OooOO0O, false);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<o0O000> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O000 invoke() {
            oO0O000 oo0o000 = oO0O000.this;
            o0O000 o0o000Inflate = o0O000.inflate(LayoutInflater.from(oo0o000.f58507OooO0Oo), oo0o000.f58508OooO0o, false);
            Intrinsics.checkNotNullExpressionValue(o0o000Inflate, "inflate(...)");
            return o0o000Inflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O000(@NotNull FragmentActivity activity) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f58849OooOO0O = activity;
        Lazy lazy = LazyKt.lazy(new OooO0OO());
        this.f58850OooOO0o = lazy;
        ConstraintLayout constraintLayout = ((o0O000) lazy.getValue()).f44398OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        OooO0oO(constraintLayout);
        Window window = this.f58510OooO0oO;
        if (window != null) {
            window.setGravity(17);
        }
        OooO0o(false);
        ImageView ivClose = ((o0O000) lazy.getValue()).f44400OooO0OO;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        o000O.OooO(ivClose, new OooO00o());
        StateButton btConfirm = ((o0O000) lazy.getValue()).f44399OooO0O0;
        Intrinsics.checkNotNullExpressionValue(btConfirm, "btConfirm");
        o000O.OooO(btConfirm, new OooO0O0());
    }
}

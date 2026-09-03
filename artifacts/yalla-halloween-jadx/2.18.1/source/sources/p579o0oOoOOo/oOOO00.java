package p579o0oOoOOo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.o00O0O;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p502o0o00o0.o00000O;
import p649o0ooOOoo.gf;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class oOOO00 extends o00000O {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final Lazy f46100OoooO;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oOOO00.this.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<gf> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f46102Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ oOOO00 f46103Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(FragmentActivity fragmentActivity, oOOO00 oooo00) {
            super(0);
            this.f46102Oooo0o = fragmentActivity;
            this.f46103Oooo0oO = oooo00;
        }

        @Override // kotlin.jvm.functions.Function0
        public final gf invoke() {
            gf gfVarInflate = gf.inflate(LayoutInflater.from(this.f46102Oooo0o), this.f46103Oooo0oO.f41545Oooo0oo, false);
            Intrinsics.checkNotNullExpressionValue(gfVarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
            return gfVarInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO00(@NotNull FragmentActivity context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Lazy lazy = LazyKt.lazy(new OooO0O0(context, this));
        this.f46100OoooO = lazy;
        ConstraintLayout constraintLayout = ((gf) lazy.getValue()).f49465OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        OooO0oO(constraintLayout);
        Window window = this.f41542Oooo;
        if (window != null) {
            window.setWindowAnimations(R.style.animation_bottom_in_bottom_out);
        }
        Window window2 = this.f41542Oooo;
        if (window2 != null) {
            window2.setGravity(80);
        }
        ImageView imageView = ((gf) lazy.getValue()).f49466OooO0O0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.close");
        o00O0O.OooO0Oo(imageView, new OooO00o());
    }
}

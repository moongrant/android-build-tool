package p579o0oOoOOo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.yalla.support.common.util.o00O0O;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p502o0o00o0.o00000O;
import p606o0oo0O.OooOo;
import p649o0ooOOoo.d8;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class t extends o00000O {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f46302OoooO;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f46303OoooOO0;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            Objects.requireNonNull(t.this);
            t.this.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<d8> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final d8 invoke() {
            d8 d8VarInflate = d8.inflate(LayoutInflater.from(t.this.f41543Oooo0o), t.this.f41545Oooo0oo, false);
            Intrinsics.checkNotNullExpressionValue(d8VarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
            return d8VarInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(@NotNull FragmentActivity activity) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f46302OoooO = activity;
        this.f46303OoooOO0 = LazyKt.lazy(new OooO0O0());
        ConstraintLayout constraintLayout = OooOO0O().f49148OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        OooO0oO(constraintLayout);
        Window window = this.f41542Oooo;
        if (window != null) {
            window.setGravity(17);
        }
        AppCompatTextView appCompatTextView = OooOO0O().f49154OooO0oO;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.ok");
        o00O0O.OooO0Oo(appCompatTextView, new OooO00o());
    }

    @Override // p502o0o00o0.o00000O
    public final void OooOO0() {
        OooOo.OooO0O0("302012");
        super.OooOO0();
    }

    public final d8 OooOO0O() {
        return (d8) this.f46303OoooOO0.getValue();
    }
}

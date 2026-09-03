package p519o0o0O0oO;

import android.view.Window;
import android.widget.ScrollView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.code.android.util.o000OO00;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402o0Oo0OOO.o00O000o;
import p584o0oOooO0.oO00Oo00;
import p641o0ooOOOO.t7;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o extends o00O00OO {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Lazy f52444OooOO0O;

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f52445OooO0Oo;

        public OooO00o(o0oo0000 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f52445OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f52445OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f52445OooO0Oo;
        }

        public final int hashCode() {
            return this.f52445OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f52445OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@NotNull MixedRoomActivity context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52444OooOO0O = LazyKt.lazy(new ooo0Oo0(context, this));
        ConstraintLayout constraintLayout = OooOO0().f58870OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        OooO0oO(constraintLayout);
        OooO0oo(80);
        Window window = this.f52535OooO0oO;
        if (window != null) {
            window.setWindowAnimations(oO00Oo00.animation_bottom_in_bottom_out);
        }
        ScrollView scrollView = OooOO0().f58872OooO0OO.f57486OooO00o;
        Intrinsics.checkNotNullExpressionValue(scrollView, "binding.vError.root");
        o000OO00.OooO0O0(scrollView);
        OooOO0().f58872OooO0OO.f57487OooO0O0.setOnClickListener(new o0OOo000(this));
        OooOO0().f58873OooO0Oo.setBackgroundColor(0);
        OooOO0().f58873OooO0Oo.getSettings().setCacheMode(2);
        OooOO0().f58873OooO0Oo.setLoadStateListener(new o0o0000(this));
        OooOO0().f58873OooO0Oo.addJavascriptInterface(new oO0Oo(this), "Yalla");
        o00O000o.f44501OooOOO.observe(this.f52534OooO0o0, new OooO00o(new o0oo0000(this)));
    }

    public final t7 OooOO0() {
        return (t7) this.f52444OooOO0O.getValue();
    }
}

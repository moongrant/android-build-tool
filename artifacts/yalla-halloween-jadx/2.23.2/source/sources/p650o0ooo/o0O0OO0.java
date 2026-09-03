package p650o0ooo;

import android.view.Window;
import android.widget.ScrollView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.code.android.util.o000O;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.g;
import p562o0oOo000.o000000O;
import p583o0oOoo00.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0O0OO0 extends o000OO00 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Lazy f58648OooOO0O;

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f58649OooO0Oo;

        public OooO00o(o0O0O0Oo function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f58649OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f58649OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f58649OooO0Oo;
        }

        public final int hashCode() {
            return this.f58649OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f58649OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OO0(@NotNull MixedRoomActivity context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58648OooOO0O = LazyKt.lazy(new o0O0O0o0(context, this));
        ConstraintLayout constraintLayout = OooOO0().f43866OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        OooO0oO(constraintLayout);
        OooO0oo(80);
        Window window = this.f58510OooO0oO;
        if (window != null) {
            window.setWindowAnimations(o000000O.animation_bottom_in_bottom_out);
        }
        ScrollView scrollView = OooOO0().f43868OooO0OO.f45166OooO00o;
        Intrinsics.checkNotNullExpressionValue(scrollView, "getRoot(...)");
        o000O.OooO0O0(scrollView);
        OooOO0().f43868OooO0OO.f45167OooO0O0.setOnClickListener(new o0O0O0O(this));
        OooOO0().f43869OooO0Oo.setBackgroundColor(0);
        OooOO0().f43869OooO0Oo.getSettings().setCacheMode(2);
        OooOO0().f43869OooO0Oo.setLoadStateListener(new o0oO0O0o(this));
        OooOO0().f43869OooO0Oo.addJavascriptInterface(new o0O0oo0o(this), "Yalla");
        o00000OO.f56670OooOOO.observe(this.f58509OooO0o0, new OooO00o(new o0O0O0Oo(this)));
    }

    public final g OooOO0() {
        return (g) this.f58648OooOO0O.getValue();
    }
}

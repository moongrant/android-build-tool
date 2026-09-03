package p650o0ooo;

import android.view.Window;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o000O;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import o0oo0000.OooO00o;
import org.jetbrains.annotations.NotNull;
import p405o0Oo0OOO.o0O00O0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class k1 extends o000OO00 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f58359OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f58360OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(@NotNull MixedRoomActivity activity) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f58359OooOO0O = activity;
        this.f58360OooOO0o = LazyKt.lazy(new j1(this));
        ConstraintLayout constraintLayout = OooOO0().f44446OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        OooO0oO(constraintLayout);
        Window window = this.f58510OooO0oO;
        if (window != null) {
            window.setGravity(17);
        }
        AppCompatTextView ok = OooOO0().f44452OooO0oO;
        Intrinsics.checkNotNullExpressionValue(ok, "ok");
        o000O.OooO0oo(ok, new i1(this));
    }

    @Override // p650o0ooo.o000OO00
    public final void OooO() {
        OooO00o.OooO0O0("302012");
        super.OooO();
    }

    public final o0O00O0o OooOO0() {
        return (o0O00O0o) this.f58360OooOO0o.getValue();
    }
}

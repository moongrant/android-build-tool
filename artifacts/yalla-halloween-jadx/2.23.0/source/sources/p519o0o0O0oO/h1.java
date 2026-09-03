package p519o0o0O0oO;

import android.view.Window;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o000OO00;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.s1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class h1 extends o00O00OO {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f52335OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f52336OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(@NotNull MixedRoomActivity activity) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f52335OooOO0O = activity;
        this.f52336OooOO0o = LazyKt.lazy(new g1(this));
        ConstraintLayout constraintLayout = OooOO0().f58774OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        OooO0oO(constraintLayout);
        Window window = this.f52535OooO0oO;
        if (window != null) {
            window.setGravity(17);
        }
        AppCompatTextView appCompatTextView = OooOO0().f58780OooO0oO;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.ok");
        o000OO00.OooO0oo(appCompatTextView, new f1(this));
    }

    @Override // p519o0o0O0oO.o00O00OO
    public final void OooO() {
        o0OO000.OooO00o("302012");
        super.OooO();
    }

    public final s1 OooOO0() {
        return (s1) this.f52336OooOO0o.getValue();
    }
}

package p579o0oOoOOo;

import android.view.LayoutInflater;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p143o00OOooo.o00O0O00;
import p498o0o00Oo0.OooOOO;
import p502o0o00o0.o00000O;
import p506o0o00oO0.o0oOO;
import p566o0oOo00O.oO0000O;
import p649o0ooOOoo.lf;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class m extends o00000O {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f46013OoooO;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f46014OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public final Lazy f46015o000oOoO;

    public static final class OooO00o extends Lambda implements Function0<lf> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final lf invoke() {
            return lf.inflate(LayoutInflater.from(m.this.f41543Oooo0o), m.this.f41545Oooo0oo, false);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<GooglePayQuickUI> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final GooglePayQuickUI invoke() {
            return new GooglePayQuickUI(m.this.f46013OoooO);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@NotNull FragmentActivity activity) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f46013OoooO = activity;
        this.f46014OoooOO0 = LazyKt.lazy(new OooO00o());
        this.f46015o000oOoO = LazyKt.lazy(new OooO0O0());
        ConstraintLayout constraintLayout = OooOO0O().f49970OooO00o;
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
        MutableLiveData<Long> mutableLiveDataOooO0OO = OooOOO.f41216OooO00o.OooO0OO();
        Object obj = this.f41543Oooo0o;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        mutableLiveDataOooO0OO.observe((LifecycleOwner) obj, new o00O0O00(this, 4));
        OooOO0o().setView(OooOO0O().f49974OooO0o, OooOO0O().f49975OooO0o0, OooOO0O().f49976OooO0oO);
        OooOO0o().setListener(new n(this));
        int i = 1;
        OooOO0O().f49977OooO0oo.setOnClickListener(new o0oOO(this, i));
        OooOO0O().f49971OooO0O0.setOnClickListener(new oO0000O(this, i));
    }

    public final lf OooOO0O() {
        return (lf) this.f46014OoooOO0.getValue();
    }

    public final GooglePayQuickUI OooOO0o() {
        return (GooglePayQuickUI) this.f46015o000oOoO.getValue();
    }
}

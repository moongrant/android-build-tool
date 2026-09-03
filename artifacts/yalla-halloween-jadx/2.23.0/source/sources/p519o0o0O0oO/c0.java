package p519o0o0O0oO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.common.manager.PayManager;
import com.yalla.yalla.ui.view.StateLayout;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.util.PaySupportChannels;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402o0Oo0OOO.o00O000o;
import p427o0OoOO00.Oooo0;
import p432o0OoOOOo.o00OOOOo;
import p432o0OoOOOo.o00Oo00;
import p432o0OoOOOo.o0O000;
import p432o0OoOOOo.o0O0000O;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00Oo00;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.b8;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class c0 extends o00O00OO {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f52181OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f52182OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f52183OooOOO0;

    public static final class OooO00o extends Lambda implements Function0<b8> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final b8 invoke() {
            c0 c0Var = c0.this;
            return b8.inflate(LayoutInflater.from(c0Var.f52532OooO0Oo), c0Var.f52533OooO0o, false);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<o00OOOOo> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00OOOOo invoke() {
            return new o00OOOOo(c0.this.f52181OooOO0O);
        }
    }

    public static final class OooO0OO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f52186OooO0Oo;

        public OooO0OO(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f52186OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f52186OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f52186OooO0Oo;
        }

        public final int hashCode() {
            return this.f52186OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f52186OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(@NotNull FragmentActivity activity) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f52181OooOO0O = activity;
        this.f52182OooOO0o = LazyKt.lazy(new OooO00o());
        Lazy lazy = LazyKt.lazy(new OooO0O0());
        this.f52183OooOOO0 = lazy;
        ConstraintLayout constraintLayout = OooOO0().f57593OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        OooO0oO(constraintLayout);
        Window window = this.f52535OooO0oO;
        if (window != null) {
            window.setWindowAnimations(oO00Oo00.animation_bottom_in_bottom_out);
        }
        if (window != null) {
            window.setGravity(80);
        }
        o000000O o000000o2 = o000000O.f46674OooO00o;
        MutableLiveData mutableLiveDataOooO0O0 = o000000O.OooO0O0();
        Object obj = this.f52532OooO0Oo;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        mutableLiveDataOooO0O0.observe((LifecycleOwner) obj, new OooO0OO(new d0(this)));
        o00OOOOo o00ooooo2 = (o00OOOOo) lazy.getValue();
        StateLayout stateLayout = OooOO0().f57597OooO0o;
        RecyclerView recyclerView = OooOO0().f57598OooO0o0;
        TextView textView = OooOO0().f57599OooO0oO;
        o00ooooo2.f45925OooO0o0 = stateLayout;
        o00ooooo2.f45923OooO0Oo = recyclerView;
        o00ooooo2.f45922OooO0OO = textView;
        o00ooooo2.OooO0Oo().f45917OooOoo = new o0O0000O(o00ooooo2);
        RecyclerView recyclerView2 = o00ooooo2.f45923OooO0Oo;
        FragmentActivity fragmentActivity = o00ooooo2.f45920OooO00o;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new FixLinearLayoutManager(fragmentActivity));
        }
        StateLayout stateLayout2 = o00ooooo2.f45925OooO0o0;
        if (stateLayout2 != null) {
            StateLayout.OooOO0(stateLayout2, 0, new o0O000(o00ooooo2), 3);
        }
        RecyclerView recyclerView3 = o00ooooo2.f45923OooO0Oo;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(o00ooooo2.OooO0Oo());
        }
        StateLayout stateLayout3 = o00ooooo2.f45925OooO0o0;
        if (stateLayout3 != null) {
            stateLayout3.OooO0oo();
        }
        o00ooooo2.OooO0o();
        o00ooooo2.f45928OooOO0 = new Oooo0(fragmentActivity, (PayManager) o00ooooo2.f45919OooO.getValue());
        o00OOOOo.OooO0oO(o00ooooo2, null, 3);
        Oooo0 oooo0 = o00ooooo2.f45928OooOO0;
        if (oooo0 != null) {
            oooo0.f45674OooO0OO = new o00Oo00(o00ooooo2);
        }
        Oooo0 oooo1 = o00ooooo2.f45928OooOO0;
        if (oooo1 != null) {
            oooo1.OooO0OO(PaySupportChannels.pay_type_googlePay.getNum(), false);
        }
        ((o00OOOOo) lazy.getValue()).f45924OooO0o = new e0(this);
        OooOO0().f57600OooO0oo.setOnClickListener(new View.OnClickListener() { // from class: o0o0O0oO.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c0 this$0 = this.f52164OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0OO000.OooO00o("105009");
                this$0.getClass();
                o00O000o.OooOO0 oooOO1 = o00O000o.f44495OooO0o0;
                FragmentActivity fragmentActivity2 = this$0.f52181OooOO0O;
                oooOO1.observe(fragmentActivity2, new c0.OooO0OO(new f0(fragmentActivity2)));
            }
        });
        OooOO0().f57594OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: o0o0O0oO.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c0 this$0 = this.f52173OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0O0();
            }
        });
    }

    public final b8 OooOO0() {
        return (b8) this.f52182OooOO0o.getValue();
    }
}

package p650o0ooo;

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
import o0oo0000.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.p;
import p429o0OoOO.Oooo000;
import p436o0OoOOo.o0000;
import p436o0OoOOo.o0000O00;
import p436o0OoOOo.o000O000;
import p436o0OoOOo.o000O0o;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000O;
import p583o0oOoo00.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class f0 extends o000OO00 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f58205OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f58206OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f58207OooOOO0;

    public static final class OooO00o extends Lambda implements Function0<p> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p invoke() {
            f0 f0Var = f0.this;
            return p.inflate(LayoutInflater.from(f0Var.f58507OooO0Oo), f0Var.f58508OooO0o, false);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<o0000> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0000 invoke() {
            return new o0000(f0.this.f58205OooOO0O);
        }
    }

    public static final class OooO0OO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f58210OooO0Oo;

        public OooO0OO(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f58210OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f58210OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f58210OooO0Oo;
        }

        public final int hashCode() {
            return this.f58210OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f58210OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(@NotNull FragmentActivity activity) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f58205OooOO0O = activity;
        this.f58206OooOO0o = LazyKt.lazy(new OooO00o());
        Lazy lazy = LazyKt.lazy(new OooO0O0());
        this.f58207OooOOO0 = lazy;
        ConstraintLayout constraintLayout = OooOO0().f45350OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        OooO0oO(constraintLayout);
        Window window = this.f58510OooO0oO;
        if (window != null) {
            window.setWindowAnimations(o000000O.animation_bottom_in_bottom_out);
        }
        if (window != null) {
            window.setGravity(80);
        }
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        MutableLiveData mutableLiveDataOooO0O0 = o0O00oO0.OooO0O0();
        Object obj = this.f58507OooO0Oo;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        mutableLiveDataOooO0O0.observe((LifecycleOwner) obj, new OooO0OO(new g0(this)));
        o0000 o0000Var = (o0000) lazy.getValue();
        StateLayout stateLayout = OooOO0().f45354OooO0o;
        RecyclerView recyclerView = OooOO0().f45355OooO0o0;
        TextView textView = OooOO0().f45356OooO0oO;
        o0000Var.f47028OooO0o0 = stateLayout;
        o0000Var.f47026OooO0Oo = recyclerView;
        o0000Var.f47025OooO0OO = textView;
        o0000Var.OooO0Oo().f47052OooOoo = new o000O000(o0000Var);
        RecyclerView recyclerView2 = o0000Var.f47026OooO0Oo;
        FragmentActivity fragmentActivity = o0000Var.f47023OooO00o;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new FixLinearLayoutManager(fragmentActivity));
        }
        StateLayout stateLayout2 = o0000Var.f47028OooO0o0;
        if (stateLayout2 != null) {
            StateLayout.OooOO0(stateLayout2, 0, new o000O0o(o0000Var), 3);
        }
        RecyclerView recyclerView3 = o0000Var.f47026OooO0Oo;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(o0000Var.OooO0Oo());
        }
        StateLayout stateLayout3 = o0000Var.f47028OooO0o0;
        if (stateLayout3 != null) {
            stateLayout3.OooO0oo();
        }
        o0000Var.OooO0o();
        o0000Var.f47031OooOO0 = new Oooo000(fragmentActivity, (PayManager) o0000Var.f47022OooO.getValue());
        o0000.OooO0oO(o0000Var, null, 3);
        Oooo000 oooo000 = o0000Var.f47031OooOO0;
        if (oooo000 != null) {
            oooo000.f46783OooO0OO = new o0000O00(o0000Var);
        }
        Oooo000 oooo001 = o0000Var.f47031OooOO0;
        if (oooo001 != null) {
            oooo001.OooO0OO(PaySupportChannels.pay_type_googlePay.getNum(), false);
        }
        ((o0000) lazy.getValue()).f47027OooO0o = new h0(this);
        OooOO0().f45357OooO0oo.setOnClickListener(new View.OnClickListener() { // from class: o0ooo.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f0 this$0 = this.f58182OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooO00o.OooO0O0("105009");
                this$0.getClass();
                o00000OO.OooOO0 oooOO1 = o00000OO.f56664OooO0o0;
                FragmentActivity fragmentActivity2 = this$0.f58205OooOO0O;
                oooOO1.observe(fragmentActivity2, new f0.OooO0OO(new i0(fragmentActivity2)));
            }
        });
        OooOO0().f45351OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: o0ooo.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f0 this$0 = this.f58195OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0O0();
            }
        });
    }

    public final p OooOO0() {
        return (p) this.f58206OooOO0o.getValue();
    }
}

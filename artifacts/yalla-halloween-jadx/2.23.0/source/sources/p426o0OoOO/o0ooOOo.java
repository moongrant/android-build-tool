package p426o0OoOO;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.vm.main.MainVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p435o0OoOOoO.o0O00O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.q3;
import p641o0ooOOOO.t3;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0ooOOo extends o0O00O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MainActivity f45664OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MainVM f45665OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final q3 f45666OooO0o0;

    public o0ooOOo(@NotNull MainActivity activity, @NotNull q3 binding, @NotNull MainVM vm) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(vm, "vm");
        this.f45664OooO0Oo = activity;
        this.f45666OooO0o0 = binding;
        this.f45665OooO0o = vm;
    }

    @Override // p435o0OoOOoO.o0O00O
    public final void OooO0O0() {
        final t3 t3VarOooO00o = t3.OooO00o(this.f45666OooO0o0.f58661OooO0oo.inflate());
        Intrinsics.checkNotNullExpressionValue(t3VarOooO00o, "bind(binding.termsServiceStub.inflate())");
        o0OO000.OooO00o("301002");
        TextView textView = t3VarOooO00o.f58858OooO0OO;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvTermsServiceTip");
        int i = oO00OOo0.terms_service;
        o000.OooO00o(textView, o0000.OooO0OO(i), new o00Ooo(this));
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvTermsServiceTip");
        int i2 = oO00OOo0.privacy_policy;
        o000.OooO00o(textView, o0000.OooO0OO(i2), new oo000o(this));
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvTermsServiceTip");
        o000.OooO0O0(textView, o0000.OooO00o(oO00O0o.color_e9a711), o0000.OooO0OO(i), o0000.OooO0OO(i2));
        t3VarOooO00o.f58857OooO0O0.setOnClickListener(new o00oO0o(t3VarOooO00o, this));
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: o0OoOO.o00Oo0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                t3 binding = t3VarOooO00o;
                Intrinsics.checkNotNullParameter(binding, "$binding");
                o0ooOOo this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                FrameLayout frameLayout = binding.f58859OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.vTermsService");
                o000OO00.OooO0O0(frameLayout);
                this$0.f45665OooO0o.signTermsService();
                return false;
            }
        };
        FrameLayout frameLayout = t3VarOooO00o.f58859OooO0Oo;
        frameLayout.setOnTouchListener(onTouchListener);
        frameLayout.setVisibility(0);
    }
}

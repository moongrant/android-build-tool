package p524o0o0O0oO;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.Oooo0;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.vm.main.MainVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;
import p391o0OOooOo.o0O00000;
import p525o0o0O0oo.o0OO000o;
import p649o0ooOOoo.ha;
import p649o0ooOOoo.ka;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0O0o0 extends o0OO000o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MainActivity f43081OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MainVM f43082OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ha f43083OooO0o0;

    public o0O0o0(@NotNull MainActivity activity, @NotNull ha binding, @NotNull MainVM vm) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(vm, "vm");
        this.f43081OooO0Oo = activity;
        this.f43083OooO0o0 = binding;
        this.f43082OooO0o = vm;
    }

    @Override // p525o0o0O0oo.o0OO000o
    public final void OooO0O0() {
        final ka kaVarOooO00o = ka.OooO00o(this.f43083OooO0o0.f49540OooO0oo.inflate());
        Intrinsics.checkNotNullExpressionValue(kaVarOooO00o, "bind(binding.termsServiceStub.inflate())");
        o0O00000.OooO0OO("Room_update_policy");
        TextView textView = kaVarOooO00o.f49851OooO0OO;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvTermsServiceTip");
        Oooo0.OooO00o(textView, o000O0O0.OooO0OO(R.string.terms_service), new oo0OOoo(this));
        TextView textView2 = kaVarOooO00o.f49851OooO0OO;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvTermsServiceTip");
        Oooo0.OooO00o(textView2, o000O0O0.OooO0OO(R.string.privacy_policy), new o0O0o000(this));
        TextView textView3 = kaVarOooO00o.f49851OooO0OO;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvTermsServiceTip");
        Oooo0.OooO0O0(textView3, o000O0O0.OooO00o(R.color.color_e9a711), o000O0O0.OooO0OO(R.string.terms_service), o000O0O0.OooO0OO(R.string.privacy_policy));
        kaVarOooO00o.f49850OooO0O0.setOnClickListener(new o0O0o00O(kaVarOooO00o, this));
        kaVarOooO00o.f49852OooO0Oo.setOnTouchListener(new View.OnTouchListener() { // from class: o0o0O0oO.o0O0OOOo
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ka binding = kaVarOooO00o;
                o0O0o0 this$0 = this;
                Intrinsics.checkNotNullParameter(binding, "$binding");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                FrameLayout frameLayout = binding.f49852OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.vTermsService");
                oOO00O.OooO00o(frameLayout);
                this$0.f43082OooO0o.signTermsService();
                return false;
            }
        });
        kaVarOooO00o.f49852OooO0Oo.setVisibility(0);
    }
}

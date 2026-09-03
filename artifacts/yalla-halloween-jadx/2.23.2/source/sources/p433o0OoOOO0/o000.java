package p433o0OoOOO0;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.vm.main.MainVM;
import kotlin.jvm.internal.Intrinsics;
import o0oo0000.OooO00o;
import org.jetbrains.annotations.NotNull;
import p405o0Oo0OOO.oO0000Oo;
import p405o0Oo0OOO.oO000O0;
import p432o0OoOOO.o00000O;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000 extends o00000O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MainActivity f46847OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MainVM f46848OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final oO0000Oo f46849OooO0o0;

    public o000(@NotNull MainActivity activity, @NotNull oO0000Oo binding, @NotNull MainVM vm) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(vm, "vm");
        this.f46847OooO0Oo = activity;
        this.f46849OooO0o0 = binding;
        this.f46848OooO0o = vm;
    }

    @Override // p432o0OoOOO.o00000O
    public final void OooO0O0() {
        final oO000O0 oo000o0OooO00o = oO000O0.OooO00o(this.f46849OooO0o0.f44753OooO0oo.inflate());
        Intrinsics.checkNotNullExpressionValue(oo000o0OooO00o, "bind(...)");
        OooO00o.OooO0O0("301002");
        TextView tvTermsServiceTip = oo000o0OooO00o.f44759OooO0OO;
        Intrinsics.checkNotNullExpressionValue(tvTermsServiceTip, "tvTermsServiceTip");
        int i = o000000.terms_service;
        com.code.android.util.o000.OooO00o(tvTermsServiceTip, o0000.OooO0OO(i), new o000OO(this));
        Intrinsics.checkNotNullExpressionValue(tvTermsServiceTip, "tvTermsServiceTip");
        int i2 = o000000.privacy_policy;
        com.code.android.util.o000.OooO00o(tvTermsServiceTip, o0000.OooO0OO(i2), new o0000O(this));
        Intrinsics.checkNotNullExpressionValue(tvTermsServiceTip, "tvTermsServiceTip");
        com.code.android.util.o000.OooO0O0(tvTermsServiceTip, o0000.OooO00o(o0OOO0o.color_e9a711), o0000.OooO0OO(i), o0000.OooO0OO(i2));
        oo000o0OooO00o.f44758OooO0O0.setOnClickListener(new o0000OO0(oo000o0OooO00o, this));
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: o0OoOOO0.o0000O0O
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                oO000O0 binding = oo000o0OooO00o;
                Intrinsics.checkNotNullParameter(binding, "$binding");
                o000 this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                FrameLayout vTermsService = binding.f44760OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(vTermsService, "vTermsService");
                o000O.OooO0O0(vTermsService);
                this$0.f46848OooO0o.signTermsService();
                return false;
            }
        };
        FrameLayout frameLayout = oo000o0OooO00o.f44760OooO0Oo;
        frameLayout.setOnTouchListener(onTouchListener);
        frameLayout.setVisibility(0);
    }
}

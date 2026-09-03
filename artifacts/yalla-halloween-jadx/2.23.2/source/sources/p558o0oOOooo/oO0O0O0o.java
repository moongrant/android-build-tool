package p558o0oOOooo;

import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000O;
import com.yalla.yalla.model.RoomRunWayModel;
import com.yalla.yalla.ui.view.gift.RoomRunWayItemView;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p405o0Oo0OOO.m3;
import p545o0oO0O00.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O0O0o implements Animation.AnimationListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ oO0O0 f56221OooO00o;

    public oO0O0O0o(oO0O0 oo0o0) {
        this.f56221OooO00o = oo0o0;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        oO0O0 oo0o0 = this.f56221OooO00o;
        RoomRunWayItemView roomRunWayItemView = oo0o0.f56187OooO0O0;
        roomRunWayItemView.f30520OooOO0o = -1L;
        roomRunWayItemView.f30519OooOO0O = 0;
        roomRunWayItemView.f30521OooOOO = false;
        m3 m3Var = roomRunWayItemView.f30513OooO0Oo;
        ImageView xTv = m3Var.f44177OooOOO0;
        Intrinsics.checkNotNullExpressionValue(xTv, "xTv");
        o000O.OooO0O0(xTv);
        LinearLayout linearLayout = m3Var.f44173OooO0oo;
        linearLayout.removeAllViews();
        linearLayout.clearAnimation();
        OooOo00.OooO0O0(567, roomRunWayItemView.f30516OooO0oO);
        SVGAView sVGAView = m3Var.f44165OooO;
        sVGAView.f13231OooOoo0 = null;
        sVGAView.OooO0oO(true);
        Function1<? super Boolean, Unit> function1 = oo0o0.f56188OooO0OO;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        ArrayList<RoomRunWayModel> arrayList = oo0o0.f56190OooO0o;
        try {
            if (arrayList.size() > 0) {
                arrayList.remove(0);
            }
            if (arrayList.size() > 0) {
                RoomRunWayModel roomRunWayModel = arrayList.get(0);
                try {
                    oo0o0.f56191OooO0o0 = true;
                    if (function1 != null) {
                        function1.invoke(Boolean.TRUE);
                    }
                    oo0o0.f56187OooO0O0.setData(roomRunWayModel);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }
}

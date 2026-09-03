package p552o0oOOoOo;

import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000OO00;
import com.squareup.okhttp.OooOo;
import com.yalla.yalla.model.RoomRunWayModel;
import com.yalla.yalla.ui.view.gift.RoomRunWayItemView;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p641o0ooOOOO.xb;

/* JADX INFO: loaded from: classes5.dex */
public final class o0OO0oO0 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0OO0o00 f55983OooO00o;

    public o0OO0oO0(o0OO0o00 o0oo0o01) {
        this.f55983OooO00o = o0oo0o01;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        o0OO0o00 o0oo0o01 = this.f55983OooO00o;
        RoomRunWayItemView roomRunWayItemView = o0oo0o01.f55971OooO0O0;
        roomRunWayItemView.f31065OooOO0o = -1L;
        roomRunWayItemView.f31064OooOO0O = 0;
        roomRunWayItemView.f31066OooOOO = false;
        xb xbVar = roomRunWayItemView.f31058OooO0Oo;
        ImageView imageView = xbVar.f59359OooOOO0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.xTv");
        o000OO00.OooO0O0(imageView);
        LinearLayout linearLayout = xbVar.f59355OooO0oo;
        linearLayout.removeAllViews();
        linearLayout.clearAnimation();
        OooOo.OooO0OO(567, roomRunWayItemView.f31061OooO0oO);
        SVGAView sVGAView = xbVar.f59347OooO;
        sVGAView.f10171OooOoo0 = null;
        sVGAView.OooO0oO(true);
        Function1<? super Boolean, Unit> function1 = o0oo0o01.f55972OooO0OO;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        ArrayList<RoomRunWayModel> arrayList = o0oo0o01.f55974OooO0o;
        try {
            if (arrayList.size() > 0) {
                arrayList.remove(0);
            }
            if (arrayList.size() > 0) {
                RoomRunWayModel roomRunWayModel = arrayList.get(0);
                try {
                    o0oo0o01.f55975OooO0o0 = true;
                    if (function1 != null) {
                        function1.invoke(Boolean.TRUE);
                    }
                    o0oo0o01.f55971OooO0O0.setData(roomRunWayModel);
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

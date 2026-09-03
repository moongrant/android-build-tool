package p524o0o0O0oO;

import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.umeng.analytics.pro.ak;
import com.yalla.support.common.util.OooOo00;
import com.yalla.support.common.util.o00O0O;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p142o00OOooO.o000OO00;
import p176o00OoooO.oO00Oo0;
import p254o00ooO0O.oOO00O;
import p497o0o00Oo.OooOOO0;
import p498o0o00Oo0.OooOOO;
import p499o0o00OoO.o0OO00O;
import p649o0ooOOoo.wa;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00o00 implements DrawerLayout.OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0O0000O f43036OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ wa f43037OooO0O0;

    public o0O00o00(o0O0000O o0o0000o2, wa waVar) {
        this.f43036OooO00o = o0o0000o2;
        this.f43037OooO0O0 = waVar;
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.OooO
    public final void OooO00o() {
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.OooO
    public final void OooO0O0(@NotNull View drawerView) {
        Intrinsics.checkNotNullParameter(drawerView, "drawerView");
        this.f43036OooO00o.f43021OooO0Oo.Oooo0();
        this.f43036OooO00o.f43021OooO0Oo.Oooo00o().loadUserFirstRechargeModel();
        o0O0000O o0o0000o2 = this.f43036OooO00o;
        wa waVar = this.f43037OooO0O0;
        Objects.requireNonNull(o0o0000o2);
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        if (Intrinsics.areEqual(oooOOO.OooOooo().getValue(), Boolean.TRUE)) {
            OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
            o0OO00O o0oo00oOooO0o0 = OooOOO0.OooO0o0();
            StringBuilder sbOooO00o = o000OO00.OooO00o(o0oo00oOooO0o0, ak.N);
            sbOooO00o.append(oooOOO.OooOo().getValue());
            if (o0oo00oOooO0o0.OooO00o(sbOooO00o.toString(), false)) {
                if (o0o0000o2.f43020OooO == null) {
                    o0o0000o2.f43020OooO = new oO00Oo0(o0o0000o2.f43021OooO0Oo);
                }
                final oO00Oo0 oo00oo0 = o0o0000o2.f43020OooO;
                if (oo00oo0 != null) {
                    LinearLayout targetView = waVar.f50875OooO0o.f50944OooOO0O;
                    Intrinsics.checkNotNullExpressionValue(targetView, "bindingDrawer.list.navLanguage");
                    Intrinsics.checkNotNullParameter(targetView, "targetView");
                    int[] iArr = {0, 0};
                    targetView.getLocationOnScreen(iArr);
                    int i = iArr[0];
                    final int i2 = iArr[1];
                    RectF rectF = new RectF(i + OooOo00.OooO00o(10.0f), i2, (targetView.getWidth() + i) - OooOo00.OooO00o(10.0f), targetView.getHeight() + i2);
                    if (oo00oo0.f32851OooO00o.f49726OooO00o.getParent() == null) {
                        oo00oo0.f32852OooO0O0.addView(oo00oo0.f32851OooO00o.f49726OooO00o, -1, -1);
                        FrameLayout frameLayout = oo00oo0.f32851OooO00o.f49726OooO00o;
                        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.root");
                        oOO00O.OooO(frameLayout);
                    }
                    if (oo00oo0.f32853OooO0OO == 0) {
                        oo00oo0.f32851OooO00o.f49729OooO0Oo.post(new Runnable() { // from class: o00OoooO.oO00Oo00
                            @Override // java.lang.Runnable
                            public final void run() {
                                oO00Oo0 this$0 = oo00oo0;
                                int i3 = i2;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.f32853OooO0OO = (i3 - this$0.f32851OooO00o.f49729OooO0Oo.getHeight()) - OooOo00.OooO00o(4);
                                LinearLayout linearLayout = this$0.f32851OooO00o.f49729OooO0Oo;
                                Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llContent");
                                o00O0O.OooO0o(linearLayout, this$0.f32853OooO0OO);
                                LinearLayout linearLayout2 = this$0.f32851OooO00o.f49729OooO0Oo;
                                Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.llContent");
                                oOO00O.OooO(linearLayout2);
                            }
                        });
                    }
                    oo00oo0.f32851OooO00o.f49727OooO0O0.setLocation(rectF);
                }
            }
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.OooO
    public final void OooO0OO(@NotNull View drawerView) {
        Intrinsics.checkNotNullParameter(drawerView, "drawerView");
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.OooO
    public final void OooO0Oo(@NotNull View drawerView) {
        Intrinsics.checkNotNullParameter(drawerView, "drawerView");
    }
}

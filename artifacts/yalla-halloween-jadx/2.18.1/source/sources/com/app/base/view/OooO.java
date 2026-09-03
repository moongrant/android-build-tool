package com.app.base.view;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.weieyu.yalla.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends Lambda implements Function4<o0O0O0O.OooO0o, Integer, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ FacePanelView f12062Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Context f12063Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(FacePanelView facePanelView, Context context) {
        super(4);
        this.f12062Oooo0o = facePanelView;
        this.f12063Oooo0oO = context;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(o0O0O0O.OooO0o oooO0o, Integer num, oOO00O ooo00o, Integer num2) {
        Object objInflate;
        o0O0O0O.OooO0o HorizontalPager = oooO0o;
        int iIntValue = num.intValue();
        oOO00O ooo00o2 = ooo00o;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        if ((iIntValue2 & 112) == 0) {
            iIntValue2 |= ooo00o2.OooO(iIntValue) ? 32 : 16;
        }
        if ((iIntValue2 & 721) == 144 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            if (iIntValue < this.f12062Oooo0o.f11966o000oOoO.size()) {
                FacePanelView facePanelView = this.f12062Oooo0o;
                Context context = this.f12063Oooo0oO;
                ooo00o2.OooO0o0(-492369756);
                Object objOooO0o = ooo00o2.OooO0o();
                if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                    int i = facePanelView.f11966o000oOoO.get(iIntValue).f11972OooO00o;
                    if (i != 1) {
                        objInflate = i != 2 ? new GifFaceTopBuyContainer(context, null, 0, 6, null) : View.inflate(context, R.layout.layout_face_panel_sticker, null);
                    } else {
                        objInflate = View.inflate(context, R.layout.layout_face_panel_emoji, null);
                    }
                    objOooO0o = objInflate;
                    ooo00o2.Oooo00o(objOooO0o);
                }
                ooo00o2.Oooo0o0();
                AndroidView_androidKt.OooO00o(new OooO0O0((View) objOooO0o), SizeKt.OooO0o0(o00OOOO0.OooO00o.f4198Oooo0o), new OooO0o(iIntValue, this.f12062Oooo0o), ooo00o2, 48, 0);
            }
        }
        return Unit.INSTANCE;
    }
}

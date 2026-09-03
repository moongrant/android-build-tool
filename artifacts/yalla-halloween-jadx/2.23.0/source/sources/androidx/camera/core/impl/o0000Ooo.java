package androidx.camera.core.impl;

import android.view.View;
import androidx.fragment.app.SpecialEffectsController;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.gift.GiftPropModel;
import kotlin.jvm.internal.Intrinsics;
import p519o0o0O0oO.oO0o0000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000Ooo implements o0ooOO0.o00O000.OooO0OO, o0000oO.oo000o.OooO00o, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f3678OooO0Oo;

    public /* synthetic */ o0000Ooo(Object obj) {
        this.f3678OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        oO0o0000 this$0 = (oO0o0000) this.f3678OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        GiftPropModel giftPropModelOooOOO = this$0.f52885OooOO0o.OooOOO(i);
        if (giftPropModelOooOOO == null || giftPropModelOooOOO.getGiftId() == p408o0Oo0o0O.o00Oo0.OooO0oo().OooOOO()) {
            return;
        }
        p409o0Oo0o0o.o000000O o000000oOooO0oo = p408o0Oo0o0O.o00Oo0.OooO0oo();
        int giftId = giftPropModelOooOOO.getGiftId();
        o000000oOooO0oo.getClass();
        o000000oOooO0oo.OooO0oO(giftId, "giftId" + p464o0Oooo.o000000O.OooOOo0().getValue());
        p409o0Oo0o0o.o000000O o000000oOooO0oo2 = p408o0Oo0o0O.o00Oo0.OooO0oo();
        long price = (long) giftPropModelOooOOO.getPrice();
        o000000oOooO0oo2.getClass();
        o000000oOooO0oo2.OooO0oo(price, "giftCoin" + p464o0Oooo.o000000O.OooOOo0().getValue());
        this$0.f52885OooOO0o.notifyDataSetChanged();
        this$0.OooOO0().f59292OooO0O0.setText(String.valueOf(p408o0Oo0o0O.o00Oo0.OooO0oo().OooOO0o() * ((long) p408o0Oo0o0O.o00Oo0.OooO0oo().OooOOO0())));
    }

    @Override // o0ooOO0.o00O000.OooO0OO
    public final Object OooO0o0(o0ooOO0.o00O000.OooO00o oooO00o) {
        DeferrableSurface deferrableSurface = (DeferrableSurface) this.f3678OooO0Oo;
        synchronized (deferrableSurface.f3532OooO00o) {
            deferrableSurface.f3535OooO0Oo = oooO00o;
        }
        return "DeferrableSurface-termination(" + deferrableSurface + ")";
    }

    @Override // o0000oO.oo000o.OooO00o
    public final void onCancel() {
        SpecialEffectsController.Operation this$0 = (SpecialEffectsController.Operation) this.f3678OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooO00o();
    }
}

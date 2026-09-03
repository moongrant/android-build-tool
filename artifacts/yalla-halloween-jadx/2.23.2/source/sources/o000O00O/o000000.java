package o000O00O;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.ThemeModel;
import kotlin.jvm.internal.Intrinsics;
import p435o0OoOOOo.o0O000;
import p435o0OoOOOo.o0O0o;
import p475o0Ooooo0.o0O00oO0;
import p650o0ooo.v3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000000 implements androidx.media3.exoplayer.OooOO0O.OooO, BaseQuickAdapter.OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f34006OooO0Oo;

    public /* synthetic */ o000000(Object obj) {
        this.f34006OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0O0
    public final void OooO0O0(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        v3 this$0 = (v3) this.f34006OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int id = view.getId();
        if (id == p562o0oOo000.o0OO00O.llBuyTheme) {
            if (o0O00oO0.f47987Ooooo00.getValue() != null) {
                Object objOooOOO = baseQuickAdapter.OooOOO(i);
                Intrinsics.checkNotNull(objOooOOO, "null cannot be cast to non-null type com.yalla.yalla.model.ThemeModel");
                this$0.f59183OooOO0o.invoke((ThemeModel) objOooOOO);
            } else {
                kotlin.collections.unsigned.OooO0OO.OooO0O0(o0O0o.Create_Room_Tips, null, 2, null, o0O000.f47005OooO00o);
            }
            this$0.OooO0O0();
            return;
        }
        if (id != p562o0oOo000.o0OO00O.flSendTheme) {
            if (id == p562o0oOo000.o0OO00O.clRootView || id == p562o0oOo000.o0OO00O.ivClose) {
                this$0.OooO0O0();
            }
        } else {
            Object objOooOOO2 = baseQuickAdapter.OooOOO(i);
            Intrinsics.checkNotNull(objOooOOO2, "null cannot be cast to non-null type com.yalla.yalla.model.ThemeModel");
            this$0.f59182OooOO0O.invoke((ThemeModel) objOooOOO2);
            this$0.OooO0O0();
        }
    }
}

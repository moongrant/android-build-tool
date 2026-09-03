package o0O0OOOo;

import android.database.Cursor;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.yalla.yalla.ui.activity.store.VehicleMineActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p564o0oOo00.o0000O00;
import p579o0oOoOOo.s1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Oooo000 implements oo0o0Oo.OooO00o, BaseQuickAdapter.OooOOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f35648OooO0Oo;

    public /* synthetic */ Oooo000(Object obj) {
        this.f35648OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        VehicleMineActivity this$0 = (VehicleMineActivity) this.f35648OooO0Oo;
        VehicleMineActivity.OooO00o oooO00o = VehicleMineActivity.f23249OooooOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p188o00o00o0.OooO0OO<ShopVehicleListModel> oooO0OO = this$0.f23252Ooooo0o;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            oooO0OO = null;
        }
        ShopVehicleListModel item = oooO0OO.getItem(i);
        if (item == null || this$0.f23254OooooOO) {
            return;
        }
        this$0.f23254OooooOO = true;
        s1 s1Var = new s1(this$0);
        s1Var.OooO00o(new o0000O00(this$0));
        s1Var.OooOO0O(item.getPicDynamic());
        s1Var.OooOO0();
    }

    @Override // o0O0OOOo.oo0o0Oo.OooO00o
    public final Object apply(Object obj) {
        oo0o0Oo oo0o0oo = (oo0o0Oo) this.f35648OooO0Oo;
        Cursor cursor = (Cursor) obj;
        Objects.requireNonNull(oo0o0oo);
        while (cursor.moveToNext()) {
            oo0o0oo.OooO0o(cursor.getInt(0), LogEventDropped.Reason.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }
}

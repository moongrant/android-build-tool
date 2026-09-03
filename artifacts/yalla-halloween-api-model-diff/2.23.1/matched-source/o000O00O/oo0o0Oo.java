package o000O00O;

import android.database.Cursor;
import android.view.View;
import androidx.media3.common.Player;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.yalla.yalla.model.ShopVehicleListModel;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import kotlin.jvm.internal.Intrinsics;
import p233o00oOoOO.o0O000Oo;
import p506o0o00oO0.o0OO000;
import p506o0o00oO0.oo0oO0;
import p675oO0Oo.d7;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oo0o0Oo implements o000OoO.o00000.OooO00o, o00oo0o0.o000O.OooO00o, OnSuccessListener, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f34158OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f34159OooO0o0;

    public /* synthetic */ oo0o0Oo(Object obj, int i) {
        this.f34158OooO0Oo = i;
        this.f34159OooO0o0 = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        VehicleStoreActivity this$0 = (VehicleStoreActivity) this.f34159OooO0o0;
        int i2 = VehicleStoreActivity.f26579OooOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o0OO000 o0oo000 = this$0.f26581OooOo0;
        if (o0oo000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            o0oo000 = null;
        }
        ShopVehicleListModel shopVehicleListModelOooOOO = o0oo000.OooOOO(i);
        if (shopVehicleListModelOooOOO == null || this$0.f26584OooOo0o) {
            return;
        }
        this$0.f26584OooOo0o = true;
        d7 d7Var = new d7(this$0);
        d7Var.OooO00o(new oo0oO0(this$0));
        d7Var.OooOO0(shopVehicleListModelOooOOO.getPicDynamic());
        d7Var.OooO();
    }

    @Override // o00oo0o0.o000O.OooO00o
    public final Object apply(Object obj) {
        p248o00oo0o0.o000O o000o = (p248o00oo0o0.o000O) this.f34159OooO0o0;
        Cursor cursor = (Cursor) obj;
        o0O000Oo o0o000oo2 = p248o00oo0o0.o000O.f40174OooO;
        o000o.getClass();
        while (cursor.moveToNext()) {
            o000o.OooOOoo(cursor.getInt(0), LogEventDropped.Reason.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    @Override // o000OoO.o00000.OooO00o
    public final void invoke(Object obj) {
        int i = this.f34158OooO0Oo;
        Object obj2 = this.f34159OooO0o0;
        switch (i) {
            case 0:
                o00O0OOO o00o0ooo2 = (o00O0OOO) obj2;
                Player.OooO0OO oooO0OO = (Player.OooO0OO) obj;
                oooO0OO.onLoadingChanged(o00o0ooo2.f34103OooO0oO);
                oooO0OO.onIsLoadingChanged(o00o0ooo2.f34103OooO0oO);
                break;
            default:
                ((androidx.media3.session.o000O0Oo.OooO0OO) obj2).getClass();
                ((Player.OooO0OO) obj).onAvailableCommandsChanged(null);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        ((RemoteConfigManager) this.f34159OooO0o0).lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0((Boolean) obj);
    }
}

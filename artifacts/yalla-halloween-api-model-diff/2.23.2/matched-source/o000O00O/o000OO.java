package o000O00O;

import android.view.View;
import androidx.media3.common.Player;
import com.app.base.protobuf.room.Room;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.ShopVehicleListModel;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.ui.activity.store.VehicleMineActivity;
import com.yalla.yalla.ui.dialog.RoomMoraGameListDialog;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomRecommendFragment;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.compat.BiConsumer;
import io.opentelemetry.exporter.otlp.internal.CommonAdapter;
import io.opentelemetry.proto.trace.v1.Span;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p473o0OoooOo.o0OOO0OO;
import p505o0o00oOO.o0OO;
import p505o0o00oOO.o0OO0oO0;
import p650o0ooo.h5;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000OO implements o000OoO.o00000O0.OooO00o, BaseQuickAdapter.OooO0o, p559o0oOo.o00O0O, o0OOO0OO, BiConsumer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f34034OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f34035OooO0o0;

    public /* synthetic */ o000OO(Object obj, int i) {
        this.f34034OooO0Oo = i;
        this.f34035OooO0o0 = obj;
    }

    @Override // p473o0OoooOo.o0OOO0OO
    public final void OooO00o(Object obj) {
        MainRoomRecommendFragment.initView$lambda$4((MainRoomRecommendFragment) this.f34035OooO0o0, (RoomIndexModel) obj);
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        RoomMoraGameListDialog this$0 = (RoomMoraGameListDialog) this.f34035OooO0o0;
        int i = RoomMoraGameListDialog.f27488OooOOO0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List<T> list = this$0.f27492OooOO0o.f13189OooOOoo;
        RoomMoraGameListDialog.OooOO0o(((Room.RoshamboModel) list.get(list.size() - 1)).getMorauuid(), false);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        VehicleMineActivity this$0 = (VehicleMineActivity) this.f34035OooO0o0;
        int i2 = VehicleMineActivity.f26568OooOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o0OO0oO0 o0oo0oo1 = this$0.f26570OooOo0;
        if (o0oo0oo1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            o0oo0oo1 = null;
        }
        ShopVehicleListModel shopVehicleListModelOooOOO = o0oo0oo1.OooOOO(i);
        if (shopVehicleListModelOooOOO == null || this$0.f26573OooOo0o) {
            return;
        }
        this$0.f26573OooOo0o = true;
        h5 h5Var = new h5(this$0);
        h5Var.OooO00o(new o0OO(this$0));
        h5Var.OooOO0(shopVehicleListModelOooOOO.getPicDynamic());
        h5Var.OooO();
    }

    @Override // io.opentelemetry.compat.BiConsumer
    public final void accept(Object obj, Object obj2) {
        ((Span.Builder) this.f34035OooO0o0).OooO0O0(CommonAdapter.OooO00o((AttributeKey) obj, obj2));
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        int i = this.f34034OooO0Oo;
        Object obj2 = this.f34035OooO0o0;
        switch (i) {
            case 0:
                ((Player.OooO0OO) obj).onPlaybackParametersChanged(((o00O0OO) obj2).f34116OooOOO);
                return;
            default:
                ((androidx.media3.session.o000OO0O.OooO0OO) obj2).getClass();
                throw null;
        }
    }
}

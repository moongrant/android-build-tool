package o000O00O;

import androidx.media3.common.Player;
import com.app.base.protobuf.room.Room;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.store.VehicleMineActivity;
import com.yalla.yalla.ui.dialog.RoomMoraGameListDialog;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomRecommendFragment;
import com.yalla.yalla.ui.vm.store.VehicleStoreVM;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.compat.BiConsumer;
import io.opentelemetry.exporter.otlp.internal.CommonAdapter;
import io.opentelemetry.proto.trace.v1.Span;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p450o0OoOoo.o0O000o0;
import p472o0OoooO.o0O0OOO0;
import p569o0oOo0Oo.o0O0OO0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000O implements o000OoO.o00000.OooO00o, o0O0OO0, o0O0OOO0, BiConsumer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f34008OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f34009OooO0o0;

    public /* synthetic */ o0000O(Object obj, int i) {
        this.f34008OooO0Oo = i;
        this.f34009OooO0o0 = obj;
    }

    @Override // p472o0OoooO.o0O0OOO0
    public final void OooO00o(Object obj) {
        MainRoomRecommendFragment.initView$lambda$4((MainRoomRecommendFragment) this.f34009OooO0o0, (RoomIndexModel) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p569o0oOo0Oo.o0O0OO0
    public final void OooO0Oo() {
        int i = this.f34008OooO0Oo;
        Object obj = this.f34009OooO0o0;
        switch (i) {
            case 2:
                VehicleMineActivity this$0 = (VehicleMineActivity) obj;
                int i2 = VehicleMineActivity.f26569OooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
                BaseActivityK.OooOo0o(this$0, null, 0L, 3);
                ((VehicleStoreVM) this$0.f26572OooOo00.getValue()).shopVehicleListMine().observe(this$0, new o0O000o0(this$0, 1));
                break;
            default:
                RoomMoraGameListDialog this$1 = (RoomMoraGameListDialog) obj;
                int i3 = RoomMoraGameListDialog.f27497OooOOO0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                List<T> list = this$1.f27501OooOO0o.f13200OooOOoo;
                RoomMoraGameListDialog.OooOO0o(((Room.RoshamboModel) list.get(list.size() - 1)).getMorauuid(), false);
                break;
        }
    }

    @Override // io.opentelemetry.compat.BiConsumer
    public final void accept(Object obj, Object obj2) {
        ((Span.Builder) this.f34009OooO0o0).OooO0O0(CommonAdapter.OooO00o((AttributeKey) obj, obj2));
    }

    @Override // o000OoO.o00000.OooO00o
    public final void invoke(Object obj) {
        int i = this.f34008OooO0Oo;
        Object obj2 = this.f34009OooO0o0;
        switch (i) {
            case 0:
                ((Player.OooO0OO) obj).onPlaybackParametersChanged(((o00O0OOO) obj2).f34108OooOOO);
                return;
            default:
                ((androidx.media3.session.o000O0Oo.OooO0OO) obj2).getClass();
                throw null;
        }
    }
}

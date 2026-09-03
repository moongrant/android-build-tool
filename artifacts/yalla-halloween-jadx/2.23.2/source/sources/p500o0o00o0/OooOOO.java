package p500o0o00o0;

import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import com.code.android.util.o000O;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.RoomGiftModel;
import com.yalla.yalla.model.RoomRunWayModel;
import com.yalla.yalla.ui.view.gift.RoomRunWayItemView;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p187o00o00o0.OooO;
import p388o0OOooOO.o00O00o0;
import p495o0o00Oo.OooOO0O;
import p558o0oOOooo.oO0O0;
import p562o0oOo000.o0OO00O;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOOO extends OooOO0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f50147OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LinearLayout f50148OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final RoomRunWayItemView f50149OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f50150OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final RoomRunWayItemView f50151OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Lazy f50152OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f50153OooO0oo;

    public static final class OooO00o extends Lambda implements Function0<oO0O0> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oO0O0 invoke() {
            OooOOO oooOOO = OooOOO.this;
            MixedRoomActivity mixedRoomActivity = oooOOO.f50147OooO0O0;
            RoomRunWayItemView roomRunWayItemView = oooOOO.f50151OooO0o0;
            Intrinsics.checkNotNullExpressionValue(roomRunWayItemView, "access$getGiftRunWayBottom$p(...)");
            return new oO0O0(mixedRoomActivity, roomRunWayItemView, new OooOOO0(oooOOO));
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<oO0O0> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oO0O0 invoke() {
            OooOOO oooOOO = OooOOO.this;
            MixedRoomActivity mixedRoomActivity = oooOOO.f50147OooO0O0;
            RoomRunWayItemView roomRunWayItemView = oooOOO.f50149OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(roomRunWayItemView, "access$getRoomRunWayTop$p(...)");
            return new oO0O0(mixedRoomActivity, roomRunWayItemView, new OooOOOO(oooOOO));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(@NotNull MixedRoomActivity roomActivity) {
        super(roomActivity);
        Intrinsics.checkNotNullParameter(roomActivity, "roomActivity");
        this.f50147OooO0O0 = roomActivity;
        LinearLayout linearLayout = (LinearLayout) roomActivity.findViewById(o0OO00O.giftRunWayLayout);
        this.f50148OooO0OO = linearLayout;
        RoomRunWayItemView roomRunWayItemView = (RoomRunWayItemView) roomActivity.findViewById(o0OO00O.giftRunWayTop);
        roomRunWayItemView.setActivity(roomActivity);
        roomRunWayItemView.OooO0OO();
        this.f50149OooO0Oo = roomRunWayItemView;
        RoomRunWayItemView roomRunWayItemView2 = (RoomRunWayItemView) roomActivity.findViewById(o0OO00O.giftRunWayBottom);
        roomRunWayItemView2.setActivity(roomActivity);
        roomRunWayItemView2.OooO0OO();
        this.f50151OooO0o0 = roomRunWayItemView2;
        LiveEventBus.get("NormalGiftRunWay").observe(roomActivity, new Observer() { // from class: o0o00o0.OooOO0O
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                OooOOO this$0 = this.f50146OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (obj instanceof RoomGiftModel) {
                    o0000O00.OooO0O0("RoomRunWayManager giftModel = ".concat(OooO.OooO00o(obj)));
                    RoomGiftModel roomGiftModel = (RoomGiftModel) obj;
                    this$0.getClass();
                    if (roomGiftModel.isAddGiftRunway()) {
                        RoomRunWayModel roomRunWayModel = new RoomRunWayModel();
                        roomRunWayModel.setDataFromGiftRoomModel(roomGiftModel);
                        if (this$0.f50153OooO0oo) {
                            ((oO0O0) this$0.f50152OooO0oO.getValue()).OooO0O0(roomRunWayModel);
                        } else {
                            ((oO0O0) this$0.f50150OooO0o.getValue()).OooO0O0(roomRunWayModel);
                        }
                        this$0.f50153OooO0oo = !this$0.f50153OooO0oo;
                    }
                }
            }
        });
        Lazy lazy = LazyKt.lazy(new OooO0O0());
        this.f50150OooO0o = lazy;
        Lazy lazy2 = LazyKt.lazy(new OooO00o());
        this.f50152OooO0oO = lazy2;
        oO0O0 oo0o0 = (oO0O0) lazy.getValue();
        if (o00O00o0.f43548OooO0OO == null) {
            o00O00o0.f43548OooO0OO = Executors.newSingleThreadExecutor();
        }
        oo0o0.f56192OooO0oO = o00O00o0.f43548OooO0OO;
        oO0O0 oo0o1 = (oO0O0) lazy2.getValue();
        if (o00O00o0.f43549OooO0Oo == null) {
            o00O00o0.f43549OooO0Oo = Executors.newSingleThreadExecutor();
        }
        oo0o1.f56192OooO0oO = o00O00o0.f43549OooO0Oo;
        View rootView = linearLayout.getRootView();
        if (rootView != null) {
            rootView.setFocusable(false);
            rootView.setClickable(false);
        }
        roomRunWayItemView.OooO0OO();
        roomRunWayItemView2.OooO0OO();
    }

    @Override // p495o0o00Oo.OooOO0O
    public final void OooO00o() {
    }

    @Override // p495o0o00Oo.OooOO0O
    public final void OooO0O0() {
    }

    public final void OooO0OO() {
        if (((oO0O0) this.f50150OooO0o.getValue()).f56191OooO0o0 || ((oO0O0) this.f50152OooO0oO.getValue()).f56191OooO0o0) {
            return;
        }
        LinearLayout roomRunWayLayout = this.f50148OooO0OO;
        Intrinsics.checkNotNullExpressionValue(roomRunWayLayout, "roomRunWayLayout");
        o000O.OooO0O0(roomRunWayLayout);
        this.f50153OooO0oo = false;
    }
}

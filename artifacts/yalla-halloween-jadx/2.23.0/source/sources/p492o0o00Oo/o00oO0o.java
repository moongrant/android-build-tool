package p492o0o00Oo;

import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import com.code.android.util.o000OO00;
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
import org.jetbrains.annotations.Nullable;
import p140o00OOooo.OooOO0;
import p379o0OOoo.OooOOOO;
import p489o0o00OO0.OooO;
import p552o0oOOoOo.o0OO0o00;
import p584o0oOooO0.oO00O0oO;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00oO0o extends OooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f48728OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LinearLayout f48729OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final RoomRunWayItemView f48730OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f48731OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final RoomRunWayItemView f48732OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Lazy f48733OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f48734OooO0oo;

    public static final class OooO00o implements Observer<Object> {
        public OooO00o() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(@Nullable Object obj) {
            if (obj instanceof RoomGiftModel) {
                OooOOO0.OooO0O0("RoomRunWayManager giftModel = ".concat(OooOO0.OooO00o(obj)));
                RoomGiftModel roomGiftModel = (RoomGiftModel) obj;
                o00oO0o o00oo0o2 = o00oO0o.this;
                o00oo0o2.getClass();
                if (roomGiftModel.isAddGiftRunway()) {
                    RoomRunWayModel roomRunWayModel = new RoomRunWayModel();
                    roomRunWayModel.setDataFromGiftRoomModel(roomGiftModel);
                    if (o00oo0o2.f48734OooO0oo) {
                        ((o0OO0o00) o00oo0o2.f48733OooO0oO.getValue()).OooO0O0(roomRunWayModel);
                    } else {
                        ((o0OO0o00) o00oo0o2.f48731OooO0o.getValue()).OooO0O0(roomRunWayModel);
                    }
                    o00oo0o2.f48734OooO0oo = !o00oo0o2.f48734OooO0oo;
                }
            }
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<o0OO0o00> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0OO0o00 invoke() {
            o00oO0o o00oo0o2 = o00oO0o.this;
            MixedRoomActivity mixedRoomActivity = o00oo0o2.f48728OooO0O0;
            RoomRunWayItemView giftRunWayBottom = o00oo0o2.f48732OooO0o0;
            Intrinsics.checkNotNullExpressionValue(giftRunWayBottom, "giftRunWayBottom");
            return new o0OO0o00(mixedRoomActivity, giftRunWayBottom, new o0ooOOo(o00oo0o2));
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<o0OO0o00> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0OO0o00 invoke() {
            o00oO0o o00oo0o2 = o00oO0o.this;
            MixedRoomActivity mixedRoomActivity = o00oo0o2.f48728OooO0O0;
            RoomRunWayItemView roomRunWayTop = o00oo0o2.f48730OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(roomRunWayTop, "roomRunWayTop");
            return new o0OO0o00(mixedRoomActivity, roomRunWayTop, new o0OOO0o(o00oo0o2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oO0o(@NotNull MixedRoomActivity roomActivity) {
        super(roomActivity);
        Intrinsics.checkNotNullParameter(roomActivity, "roomActivity");
        this.f48728OooO0O0 = roomActivity;
        LinearLayout linearLayout = (LinearLayout) roomActivity.findViewById(oO00O0oO.giftRunWayLayout);
        this.f48729OooO0OO = linearLayout;
        RoomRunWayItemView roomRunWayItemView = (RoomRunWayItemView) roomActivity.findViewById(oO00O0oO.giftRunWayTop);
        roomRunWayItemView.setActivity(roomActivity);
        roomRunWayItemView.OooO0OO();
        this.f48730OooO0Oo = roomRunWayItemView;
        RoomRunWayItemView roomRunWayItemView2 = (RoomRunWayItemView) roomActivity.findViewById(oO00O0oO.giftRunWayBottom);
        roomRunWayItemView2.setActivity(roomActivity);
        roomRunWayItemView2.OooO0OO();
        this.f48732OooO0o0 = roomRunWayItemView2;
        LiveEventBus.get("NormalGiftRunWay").observe(roomActivity, new OooO00o());
        Lazy lazy = LazyKt.lazy(new OooO0OO());
        this.f48731OooO0o = lazy;
        Lazy lazy2 = LazyKt.lazy(new OooO0O0());
        this.f48733OooO0oO = lazy2;
        o0OO0o00 o0oo0o01 = (o0OO0o00) lazy.getValue();
        if (OooOOOO.f44242OooO0OO == null) {
            OooOOOO.f44242OooO0OO = Executors.newSingleThreadExecutor();
        }
        o0oo0o01.f55976OooO0oO = OooOOOO.f44242OooO0OO;
        o0OO0o00 o0oo0o02 = (o0OO0o00) lazy2.getValue();
        if (OooOOOO.f44243OooO0Oo == null) {
            OooOOOO.f44243OooO0Oo = Executors.newSingleThreadExecutor();
        }
        o0oo0o02.f55976OooO0oO = OooOOOO.f44243OooO0Oo;
        View rootView = linearLayout.getRootView();
        if (rootView != null) {
            rootView.setFocusable(false);
            rootView.setClickable(false);
        }
        roomRunWayItemView.OooO0OO();
        roomRunWayItemView2.OooO0OO();
    }

    @Override // p489o0o00OO0.OooO
    public final void OooO00o() {
    }

    @Override // p489o0o00OO0.OooO
    public final void OooO0O0() {
    }

    public final void OooO0OO() {
        if (((o0OO0o00) this.f48731OooO0o.getValue()).f55975OooO0o0 || ((o0OO0o00) this.f48733OooO0oO.getValue()).f55975OooO0o0) {
            return;
        }
        LinearLayout roomRunWayLayout = this.f48729OooO0OO;
        Intrinsics.checkNotNullExpressionValue(roomRunWayLayout, "roomRunWayLayout");
        o000OO00.OooO0O0(roomRunWayLayout);
        this.f48734OooO0oo = false;
    }
}

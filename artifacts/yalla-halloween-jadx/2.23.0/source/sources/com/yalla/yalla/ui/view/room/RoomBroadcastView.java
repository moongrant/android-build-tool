package com.yalla.yalla.ui.view.room;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.model.BarInfoModel;
import com.yalla.yalla.model.RoomBroadcastModel;
import com.yalla.yalla.model.RoomBroadcastOpenNobleDataModel;
import com.yalla.yalla.model.RoomBroadcastRoomModel;
import com.yalla.yalla.model.room.RoomModel;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p157o00OoOO0.o0OO00O;
import p427o0OoOO00.o0OOO0o;
import p491o0o00OOo.oo0o0O0;
import p557o0oOo.OooOO0O;
import p557o0oOo.OooOOO;
import p557o0oOo.OooOOO0;
import p584o0oOooO0.oO00OOo0;
import p641o0ooOOOO.f9;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u0006"}, d2 = {"Lcom/yalla/yalla/ui/view/room/RoomBroadcastView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lo0o00OOo/oo0o0O0;", "roomBroadcastAnimation", "", "setRoomBroadcastNewAnimation", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class RoomBroadcastView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final f9 f31285OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f31286OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public RoomBroadcastModel f31287OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public oo0o0O0 f31288OooO0oO;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomBroadcastRoomModel f31289OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(RoomBroadcastRoomModel roomBroadcastRoomModel) {
            super(0);
            this.f31289OooO0Oo = roomBroadcastRoomModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            long jOooO0o0 = com.yalla.yalla.service.room.OooO00o.f24978OooO0o0.OooO0o0();
            RoomBroadcastRoomModel roomBroadcastRoomModel = this.f31289OooO0Oo;
            if (jOooO0o0 == roomBroadcastRoomModel.getId()) {
                o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.you_are_already_in_the_room));
            } else {
                RoomModel roomModel = new RoomModel();
                roomModel.setId(roomBroadcastRoomModel.getId());
                roomModel.setRoomIp(roomBroadcastRoomModel.getRoomIp());
                roomModel.websocketaddr = roomBroadcastRoomModel.getWebsocketaddr();
                MutableState mutableState = o0OOO0o.f45698OooO00o;
                o0OOO0o.OooO0o(roomModel, EnterRoomParentPage.lnroom_Broadcast);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomBroadcastView(MixedRoomActivity context) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        f9 f9VarInflate = f9.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(f9VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f31285OooO0Oo = f9VarInflate;
        this.f31286OooO0o = 5000;
        f9VarInflate.f57939OooO0OO.setActivity(context);
        f9VarInflate.f57939OooO0OO.setGoListener(new OooOOO0(this));
        f9VarInflate.f57938OooO0O0.setGoListener(new OooOOO(this));
    }

    public static final void OooO0O0(RoomBroadcastView roomBroadcastView) {
        Long value;
        p592o0oo00O.OooOOO0.OooO0O0("toClick data = " + roomBroadcastView.f31287OooO0o0);
        RoomBroadcastModel roomBroadcastModel = roomBroadcastView.f31287OooO0o0;
        if (roomBroadcastModel != null) {
            p592o0oo00O.OooOOO0.OooO0O0("toClick data.getType = " + roomBroadcastModel.getType());
            if (!OooOO0O.OooO0OO(roomBroadcastModel) && roomBroadcastModel.getType() != 18) {
                if (roomBroadcastModel.getType() == 13) {
                    p592o0oo00O.OooOOO0.OooO0O0("toNobleUserInfo data = " + roomBroadcastModel);
                    if (roomBroadcastModel.getRoomBroadcastOpenNobleDataModel() != null) {
                        RoomBroadcastOpenNobleDataModel roomBroadcastOpenNobleDataModel = roomBroadcastModel.getRoomBroadcastOpenNobleDataModel();
                        if (TextUtils.isEmpty(roomBroadcastOpenNobleDataModel != null ? roomBroadcastOpenNobleDataModel.getUserid() : null)) {
                            return;
                        }
                        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f27240Oooo0o;
                        Context context = roomBroadcastView.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
                        Activity activity = (Activity) context;
                        RoomBroadcastOpenNobleDataModel roomBroadcastOpenNobleDataModel2 = roomBroadcastModel.getRoomBroadcastOpenNobleDataModel();
                        UserInfoActivity.OooO00o.OooO0OO(oooO00o, activity, roomBroadcastOpenNobleDataModel2 != null ? roomBroadcastOpenNobleDataModel2.getUserid() : null, false, 12);
                        return;
                    }
                    return;
                }
                return;
            }
            p592o0oo00O.OooOOO0.OooO0O0("showGiftRoomSelectPop \ndata = " + roomBroadcastModel + "\nloginInformation = " + MixedRoomDataSource.OooO0o0().f23461OooO0o0 + "\nroomConfiguration = " + MixedRoomDataSource.OooO0o0().f23460OooO0o);
            BarInfoModel.RoomInfoOld roominfo = roomBroadcastModel.getRoominfo();
            if (roominfo == null || (value = OooO0O0.f24995OoooOOO.OooO00o().f25001OooO0Oo.getValue()) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue(value, "RoomDataSource.instance().roomId.value ?: return");
            if (roominfo.getId() == value.longValue()) {
                return;
            }
            try {
                RoomBroadcastRoomModel roomBroadcastRoomModel = new RoomBroadcastRoomModel();
                roomBroadcastRoomModel.setId(roominfo.getId());
                roomBroadcastRoomModel.setRoomIp(roominfo.getIp());
                p592o0oo00O.OooOOO0.OooO0O0("showGiftRoomSelectPop try ");
                roomBroadcastView.OooO0OO(roomBroadcastRoomModel);
            } catch (Exception e) {
                p592o0oo00O.OooOOO0.OooO0O0("showGiftRoomSelectPop Exception ");
                e.printStackTrace();
            }
        }
    }

    public final void OooO0OO(RoomBroadcastRoomModel roomBroadcastRoomModel) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        o0OO00O o0oo00o2 = new o0OO00O(context);
        o0oo00o2.OooOoO(o0000.OooO0OO(oO00OOo0.hint));
        o0oo00o2.OooOo00(o0000.OooO0OO(oO00OOo0.giftLayout_to_room));
        o0oo00o2.OooOo(true);
        o0oo00o2.OooOo0(new OooO00o(roomBroadcastRoomModel));
        o0oo00o2.OooOO0o();
    }

    @Override // android.view.View
    public final void clearAnimation() {
        this.f31285OooO0Oo.f57937OooO00o.clearAnimation();
    }

    public final void setRoomBroadcastNewAnimation(@Nullable oo0o0O0 roomBroadcastAnimation) {
        this.f31288OooO0oO = roomBroadcastAnimation;
    }
}

package com.yalla.yalla.ui.view.room;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.util.o0000;
import com.code.android.util.o000O00;
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
import p205o00o0o0o.o000O;
import p405o0Oo0OOO.u0;
import p429o0OoOO.o0Oo0oo;
import p498o0o00Ooo.o0OoOoOo;
import p562o0oOo000.o000000;
import p570o0oOoO.o00000;
import p570o0oOoO.o000000O;
import p570o0oOoO.o00000O0;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u0006"}, d2 = {"Lcom/yalla/yalla/ui/view/room/RoomBroadcastView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lo0o00Ooo/o0OoOoOo;", "roomBroadcastAnimation", "", "setRoomBroadcastNewAnimation", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class RoomBroadcastView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final u0 f30744OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f30745OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public RoomBroadcastModel f30746OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public o0OoOoOo f30747OooO0oO;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomBroadcastRoomModel f30748OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(RoomBroadcastRoomModel roomBroadcastRoomModel) {
            super(0);
            this.f30748OooO0Oo = roomBroadcastRoomModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            long jOooO0o0 = com.yalla.yalla.service.room.OooO00o.f24516OooO0o0.OooO0o0();
            RoomBroadcastRoomModel roomBroadcastRoomModel = this.f30748OooO0Oo;
            if (jOooO0o0 == roomBroadcastRoomModel.getId()) {
                o000O00.OooO0O0(o0000.OooO0OO(o000000.you_are_already_in_the_room));
            } else {
                RoomModel roomModel = new RoomModel();
                roomModel.setId(roomBroadcastRoomModel.getId());
                roomModel.setRoomIp(roomBroadcastRoomModel.getRoomIp());
                roomModel.websocketaddr = roomBroadcastRoomModel.getWebsocketaddr();
                MutableState mutableState = o0Oo0oo.f46817OooO00o;
                o0Oo0oo.OooO0o(roomModel, EnterRoomParentPage.lnroom_Broadcast);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomBroadcastView(MixedRoomActivity context) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        u0 u0VarInflate = u0.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(u0VarInflate, "inflate(...)");
        this.f30744OooO0Oo = u0VarInflate;
        this.f30745OooO0o = 5000;
        u0VarInflate.f45572OooO0OO.setActivity(context);
        u0VarInflate.f45572OooO0OO.setGoListener(new o00000(this));
        u0VarInflate.f45571OooO0O0.setGoListener(new o00000O0(this));
    }

    public static final void OooO0O0(RoomBroadcastView roomBroadcastView) {
        Long value;
        o0000O00.OooO0O0("toClick data = " + roomBroadcastView.f30746OooO0o0);
        RoomBroadcastModel roomBroadcastModel = roomBroadcastView.f30746OooO0o0;
        if (roomBroadcastModel != null) {
            o0000O00.OooO0O0("toClick data.getType = " + roomBroadcastModel.getType());
            if (!o000000O.OooO0OO(roomBroadcastModel) && roomBroadcastModel.getType() != 18) {
                if (roomBroadcastModel.getType() == 13) {
                    o0000O00.OooO0O0("toNobleUserInfo data = " + roomBroadcastModel);
                    if (roomBroadcastModel.getRoomBroadcastOpenNobleDataModel() != null) {
                        RoomBroadcastOpenNobleDataModel roomBroadcastOpenNobleDataModel = roomBroadcastModel.getRoomBroadcastOpenNobleDataModel();
                        if (TextUtils.isEmpty(roomBroadcastOpenNobleDataModel != null ? roomBroadcastOpenNobleDataModel.getUserid() : null)) {
                            return;
                        }
                        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26775Oooo0o;
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
            o0000O00.OooO0O0("showGiftRoomSelectPop \ndata = " + roomBroadcastModel + "\nloginInformation = " + MixedRoomDataSource.OooO0o0().f22992OooO0o0 + "\nroomConfiguration = " + MixedRoomDataSource.OooO0o0().f22991OooO0o);
            BarInfoModel.RoomInfoOld roominfo = roomBroadcastModel.getRoominfo();
            if (roominfo == null || (value = OooO0O0.f24533OoooOOO.OooO00o().f24539OooO0Oo.getValue()) == null) {
                return;
            }
            Intrinsics.checkNotNull(value);
            if (roominfo.getId() == value.longValue()) {
                return;
            }
            try {
                RoomBroadcastRoomModel roomBroadcastRoomModel = new RoomBroadcastRoomModel();
                roomBroadcastRoomModel.setId(roominfo.getId());
                roomBroadcastRoomModel.setRoomIp(roominfo.getIp());
                o0000O00.OooO0O0("showGiftRoomSelectPop try ");
                roomBroadcastView.OooO0OO(roomBroadcastRoomModel);
            } catch (Exception e) {
                o0000O00.OooO0O0("showGiftRoomSelectPop Exception ");
                e.printStackTrace();
            }
        }
    }

    public final void OooO0OO(RoomBroadcastRoomModel roomBroadcastRoomModel) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        o000O o000o = new o000O(context);
        o000o.OooOoO(o0000.OooO0OO(o000000.hint));
        o000o.OooOo00(o0000.OooO0OO(o000000.giftLayout_to_room));
        o000o.OooOo(true);
        o000o.OooOo0(new OooO00o(roomBroadcastRoomModel));
        o000o.OooOO0o();
    }

    @Override // android.view.View
    public final void clearAnimation() {
        this.f30744OooO0Oo.f45570OooO00o.clearAnimation();
    }

    public final void setRoomBroadcastNewAnimation(@Nullable o0OoOoOo roomBroadcastAnimation) {
        this.f30747OooO0oO = roomBroadcastAnimation;
    }
}

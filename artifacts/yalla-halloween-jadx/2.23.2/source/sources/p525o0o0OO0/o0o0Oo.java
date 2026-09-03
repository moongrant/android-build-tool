package p525o0o0OO0;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v4.media.session.OooO0OO;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.protobuf.room.Room;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.OooOo00;
import com.code.android.util.o0000;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.view.UserIdentityView;
import com.yalla.yalla.ui.view.UserLevelView;
import com.yalla.yalla.ui.view.UserMedalView;
import com.yalla.yalla.ui.view.UserNameView;
import com.yalla.yalla.ui.view.UserOnMicView;
import com.yalla.yalla.ui.view.UserPremiumView;
import com.yalla.yalla.ui.view.UserPrettyIdView;
import com.yalla.yalla.ui.view.UserRankView;
import com.yalla.yalla.ui.view.UserSexView;
import com.yalla.yalla.ui.view.UserVipView;
import com.yalla.yalla.ui.view.UserWealthTagView;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.ui.view.room.RoomMemberBadgeView;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import p028Oooo0oO.o00O0000;
import p205o00o0o0o.o000O;
import p289o0O0Oo0.o000O0;
import p289o0O0Oo0.o000Oo0;
import p368o0OOo0Oo.Oooo000;
import p405o0Oo0OOO.o0O00000;
import p405o0Oo0OOO.o0O0O0o0;
import p412o0Oo0o0O.o000O000;
import p473o0OoooOo.o0OOOO0o;
import p483o0o000Oo.o0000O0;
import p540o0o0OoO0.oO0O00o0;
import p559o0oOo.o00O0O;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p571o0oOoO0.o0000oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public class o0o0Oo extends o00OO0O0 {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final /* synthetic */ int f53251OooOo0 = 0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public OooO0O0 f53252OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public RecyclerView f53253OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f53254OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public XRefreshLayout f53255OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public o0O0O0o0 f53256OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public OooOO0 f53257OooOo00;

    public class OooO extends o0OOOO0o {
        public OooO() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(View view) {
            o0oo0000.OooO00o.OooO0O0("102086");
            int i = o0o0Oo.f53251OooOo0;
            o0o0Oo o0o0oo = o0o0Oo.this;
            if (o0o0oo.getContext() instanceof FragmentActivity) {
                o000O o000o = new o000O(o0o0oo.getContext());
                o000o.OooOOoo(o000000.remove_all_guests);
                final boolean[] zArr = {false};
                final o0O00000 o0o00000OooO00o = null;
                if (!com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24559OooOoO.getValue().booleanValue()) {
                    View viewInflate = View.inflate(o0o0oo.getContext(), oo0o0Oo.dialog_kick_guest, null);
                    o0o00000OooO00o = o0O00000.OooO00o(viewInflate);
                    o0o00000OooO00o.f44402OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: o0o0OO0.o00OOO0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i2 = o0o0Oo.f53251OooOo0;
                            boolean[] zArr2 = zArr;
                            boolean z = !zArr2[0];
                            zArr2[0] = z;
                            ((RadioButton) view2).setChecked(z);
                        }
                    });
                    o000o.OooOOo(viewInflate);
                }
                o000o.OooOo0(new Function0() { // from class: o0o0OO0.o00OOO0O
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        o0O00000 o0o00000;
                        int i2 = o0o0Oo.f53251OooOo0;
                        int i3 = (OooO0O0.f24533OoooOOO.OooO00o().f24559OooOoO.getValue().booleanValue() || (o0o00000 = o0o00000OooO00o) == null || !o0o00000.f44402OooO0O0.isChecked()) ? 0 : 1;
                        Room.kickTouristRequest.Builder builderNewBuilder = Room.kickTouristRequest.newBuilder();
                        builderNewBuilder.setKickOp(i3);
                        RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
                        if (roomLiveService == null) {
                            return null;
                        }
                        roomLiveService.OooO0oo(10070, builderNewBuilder.build().toByteArray());
                        return null;
                    }
                });
                o000o.OooOO0o();
            }
        }
    }

    public class OooO00o extends o0OOOO0o {
        public OooO00o() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(View view) {
            o0o0Oo o0o0oo = o0o0Oo.this;
            if (o0o0oo.f53255OooOOo0.getState() == RefreshState.None) {
                o0oo0000.OooO00o.OooO0O0("102283");
                o0o0oo.f53253OooOOOo.scrollToPosition(0);
                o0o0oo.f53255OooOOo0.OooO0oo();
            }
        }
    }

    public class OooO0O0 extends o0000oo<RoomUserInfoModel> {
        public OooO0O0(Context context, int i, ArrayList arrayList) {
            super(i, context, arrayList);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            boolean z;
            ViewHolder viewHolder = (ViewHolder) baseViewHolder;
            RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) obj;
            if (roomUserInfoModel == null) {
                return;
            }
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f13186OooOOOo);
            oooO00o.OooO00o(d1.OooO00o());
            oooO00o.f43126OooO0OO = p403o0Oo0OO.OooO0OO.OooO00o(roomUserInfoModel.getUserHeader().getValue());
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo((ImageView) viewHolder.getView(o0OO00O.sdv_head));
            viewHolder.setGone(o0OO00O.iv_officials, roomUserInfoModel.isOfficialRole());
            SVGAView sVGAView = (SVGAView) viewHolder.getView(o0OO00O.sdv_head_frame_svga);
            NetImageView netImageView = (NetImageView) viewHolder.getView(o0OO00O.sdv_mount);
            UserIdentityView userIdentityView = (UserIdentityView) viewHolder.getView(o0OO00O.identity);
            View view = viewHolder.getView(o0OO00O.lineVertical);
            UserNameView userNameView = (UserNameView) viewHolder.getView(o0OO00O.name);
            UserSexView userSexView = (UserSexView) viewHolder.getView(o0OO00O.sex);
            RoomMemberBadgeView roomMemberBadgeView = (RoomMemberBadgeView) viewHolder.getView(o0OO00O.roomMemberBadgeView);
            UserLevelView userLevelView = (UserLevelView) viewHolder.getView(o0OO00O.level);
            UserOnMicView userOnMicView = (UserOnMicView) viewHolder.getView(o0OO00O.onMic);
            UserRankView userRankView = (UserRankView) viewHolder.getView(o0OO00O.rank);
            UserWealthTagView userWealthTagView = (UserWealthTagView) viewHolder.getView(o0OO00O.cl_wealth);
            userWealthTagView.setTextSize(9.0f);
            UserVipView userVipView = (UserVipView) viewHolder.getView(o0OO00O.kaVip);
            UserPremiumView userPremiumView = (UserPremiumView) viewHolder.getView(o0OO00O.vip);
            UserPrettyIdView userPrettyIdView = (UserPrettyIdView) viewHolder.getView(o0OO00O.prettyId);
            UserMedalView userMedalView = (UserMedalView) viewHolder.getView(o0OO00O.mvMedal);
            o0o0Oo o0o0oo = o0o0Oo.this;
            FragmentActivity activity = o0o0oo.getActivity();
            String value = roomUserInfoModel.getUserHeaderFrame().getValue();
            sVGAView.setImageDrawable(null);
            sVGAView.setVisibility(8);
            boolean z2 = false;
            sVGAView.OooO0oO(false);
            if (!OooOo00.OooO00o(value)) {
                if ("/headframe/0.png".equals(value)) {
                    z2 = false;
                } else {
                    z2 = false;
                    sVGAView.setVisibility(0);
                    sVGAView.f13232OooOooO = 0;
                    sVGAView.setImageResource(0);
                    sVGAView.OooOO0O(value, activity);
                    sVGAView.OooOO0o();
                }
            }
            view.setVisibility(userIdentityView.OooO0OO(roomUserInfoModel.getRoomMemberType().getValue().intValue(), true, z2) ? 0 : 8);
            userNameView.setText(o000O000.OooO0O0(roomUserInfoModel.getUserId().getValue().longValue(), roomUserInfoModel.getUserName().getValue()));
            userNameView.setFlash(roomUserInfoModel.getVipState().getValue().intValue() == 1 && roomUserInfoModel.getShowVIP().getValue().booleanValue() && roomUserInfoModel.getVipLevel().getValue().intValue() >= VipLevel.Vip4.getValue());
            netImageView.setVisibility(0);
            if (TextUtils.isEmpty(roomUserInfoModel.getVehicleUrl().getValue()) || roomUserInfoModel.getVehicleId().getValue().intValue() == 0) {
                z = false;
                netImageView.setVisibility(4);
            } else {
                Oooo000.OooO00o oooO00o2 = new Oooo000.OooO00o(this.f13186OooOOOo);
                oooO00o2.f43126OooO0OO = roomUserInfoModel.getVehicleUrl().getValue();
                z = false;
                oooO00o2.f43124OooO00o = 0;
                oooO00o2.f43138OooOOOo = o0Oo0oo.icon_vehicel_placeholder;
                oooO00o2.OooO0Oo(netImageView);
            }
            userSexView.OooO0OO(roomUserInfoModel.getSex().getValue().intValue());
            roomMemberBadgeView.OooO00o(roomUserInfoModel.getMemberLevel().getValue(), roomUserInfoModel.getBadgeUrl().getValue(), roomUserInfoModel.isTopRank().getValue().booleanValue(), 9.0f);
            userLevelView.OooOO0o(roomUserInfoModel.getUserLevel().getValue().intValue());
            boolean zBooleanValue = roomUserInfoModel.getHasMic().getValue().booleanValue();
            boolean zBooleanValue2 = roomUserInfoModel.getSilenced().getValue().booleanValue();
            userOnMicView.getClass();
            if (zBooleanValue) {
                com.code.android.util.o000O.OooOOOO(userOnMicView);
                userOnMicView.setImageResource(o0Oo0oo.ic_room_online_speaking);
            } else if (zBooleanValue2) {
                com.code.android.util.o000O.OooOOOO(userOnMicView);
                userOnMicView.setImageResource(o0Oo0oo.ic_room_banned);
            } else {
                com.code.android.util.o000O.OooO0O0(userOnMicView);
            }
            userRankView.OooO00o(roomUserInfoModel.getRankWeek().getValue().intValue(), roomUserInfoModel.getRankDay().getValue().intValue());
            userWealthTagView.OooO0O0(o0o0oo.getViewLifecycleOwner(), roomUserInfoModel.getWealthLevel().getValue(), roomUserInfoModel.getWealthBadgeWithBg().getValue(), 10.0f);
            int iIntValue = roomUserInfoModel.getVipLevel().getValue().intValue();
            if (roomUserInfoModel.getVipState().getValue().intValue() == VipState.Vip.getValue() && roomUserInfoModel.getShowVIP().getValue().booleanValue()) {
                z = true;
            }
            userVipView.OooOOOO(iIntValue, z, o0o0oo.getActivity());
            userPremiumView.OooO0Oo(roomUserInfoModel.getPremiumLevel().getValue().intValue(), roomUserInfoModel.isPremium().getValue().booleanValue());
            userPrettyIdView.setUserPrettyId(roomUserInfoModel.getIdLevel().getValue().intValue());
            userMedalView.OooO00o(roomUserInfoModel.getMedal().getValue(), o0o0oo.getViewLifecycleOwner());
        }
    }

    public class OooO0OO implements Observer<Object> {
        public OooO0OO() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            ArrayList<RoomUserInfoModel> arrayList = (ArrayList) obj;
            o0o0Oo o0o0oo = o0o0Oo.this;
            if (o0o0oo.f53254OooOOo) {
                o0o0oo.f53252OooOOOO.OooOoO0(arrayList);
                o0o0oo.f53255OooOOo0.OooOooo(true, true, arrayList.size() < 50);
                o0o0oo.f53254OooOOo = false;
            } else {
                HashSet hashSet = new HashSet(o0o0oo.f53252OooOOOO.f13189OooOOoo.size());
                Iterator it = o0o0oo.f53252OooOOOO.f13189OooOOoo.iterator();
                while (it.hasNext()) {
                    hashSet.add(((RoomUserInfoModel) it.next()).getUserId().getValue());
                }
                ArrayList arrayList2 = new ArrayList();
                for (RoomUserInfoModel roomUserInfoModel : arrayList) {
                    if (!hashSet.contains(roomUserInfoModel.getUserId().getValue())) {
                        arrayList2.add(roomUserInfoModel);
                    }
                }
                o0o0oo.f53252OooOOOO.OooO0O0(arrayList2);
                o0o0oo.f53255OooOOo0.OooOooo(false, true, arrayList.size() < 50);
            }
            String str = o0000.OooO0OO(o000000.Online_Users) + ": " + com.yalla.yalla.service.room.OooO00o.f24519OooOO0.f48494OooO0O0.getValue();
            o0o0oo.f53233OooO0oO = str;
            TextView textView = o0o0oo.f53238OooOOO;
            if (textView != null) {
                textView.setText(str);
            }
        }
    }

    public class OooO0o implements Observer<Integer> {
        public OooO0o() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Integer num) {
            int iIntValue = num.intValue();
            int i = o0o0Oo.f53251OooOo0;
            o0o0Oo.this.OooO0oo(iIntValue);
        }
    }

    public interface OooOO0 {
    }

    @Override // p525o0o0OO0.o00OO0O0
    public final int OooO0Oo() {
        return oo0o0Oo.dialog_content_room_online_user;
    }

    @Override // p525o0o0OO0.o00OO0O0
    public final void OooO0o(int i, @NonNull View view) {
    }

    @Override // p525o0o0OO0.o00OO0O0
    public final void OooO0o0() {
        XRefreshLayout xRefreshLayout = (XRefreshLayout) this.f53234OooO0oo.findViewById(o0OO00O.xrl_dialog_room_onlive);
        this.f53255OooOOo0 = xRefreshLayout;
        xRefreshLayout.setOnRefreshListener(new o000Oo0(this));
        this.f53255OooOOo0.setOnLoadMoreListener(new o00O0O() { // from class: o0o0OO0.o00OOO00
            @Override // p559o0oOo.o00O0O
            public final void OooO0OO() {
                o0o0Oo o0o0oo = this.f53249OooO0Oo;
                o0o0oo.f53254OooOOo = false;
                List<T> list = o0o0oo.f53252OooOOOO.f13189OooOOoo;
                RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) list.get(list.size() - 1);
                long jLongValue = roomUserInfoModel.getPriority().getValue().longValue();
                long jLongValue2 = roomUserInfoModel.getUserId().getValue().longValue();
                RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO0oO(10055, OooO0OO.OooO0O0(o00O0000.OooO00o("{\"prioritid\":", jLongValue, ",\"kind\":1,\"userid\":"), jLongValue2, "}"));
                }
            }
        });
        RecyclerView recyclerView = (RecyclerView) this.f53234OooO0oo.findViewById(o0OO00O.lv_online);
        this.f53253OooOOOo = recyclerView;
        recyclerView.setLayoutManager(new FixLinearLayoutManager(getContext()));
        this.f53253OooOOOo.setNestedScrollingEnabled(false);
        this.f53232OooO0o.setVisibility(0);
        this.f53232OooO0o.setOnClickListener(new OooO00o());
        ArrayList arrayList = new ArrayList();
        for (Long l : com.yalla.yalla.service.room.OooO00o.f24519OooOO0.f48495OooO0OO) {
            ArrayList arrayList2 = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
            arrayList.add(com.yalla.yalla.service.room.OooO00o.OooO0o0(l));
        }
        OooO0O0 oooO0O0 = new OooO0O0(getContext(), oo0o0Oo.room_item_online_sheet, arrayList);
        this.f53252OooOOOO = oooO0O0;
        this.f53253OooOOOo.setAdapter(oooO0O0);
        this.f53252OooOOOO.f13176OooO0o = new o000O0(this);
        View view = new View(getContext());
        int i = 1;
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, 1));
        this.f53252OooOOOO.OooOo0(view);
        this.f53252OooOOOO.OooOooO(false);
        OooO0O0 oooO0O1 = this.f53252OooOOOO;
        oooO0O1.f13183OooOOO = true;
        oooO0O1.f13185OooOOOO = true;
        this.f53255OooOOo0.OooOooo(true, true, arrayList.size() < 50);
        StringBuilder sb = new StringBuilder();
        sb.append(o0000.OooO0OO(o000000.Online_Users));
        sb.append(": ");
        o0000O0 o0000o1 = com.yalla.yalla.service.room.OooO00o.f24519OooOO0;
        sb.append(o0000o1.f48494OooO0O0.getValue());
        String string = sb.toString();
        this.f53233OooO0oO = string;
        TextView textView = this.f53238OooOOO;
        if (textView != null) {
            textView.setText(string);
        }
        OooO0oO();
        LiveEventBus.get("FORBID_GUESTS_ENTER_ROOM", Boolean.class).observe(this, new p491o0o00O0o.o000Oo0(this, i));
        LiveEventBus.get("UPDATE_ONLINE_LIST_DATA").observe(this, new OooO0OO());
        o0000o1.f48496OooO0Oo.observe(this, new OooO0o());
    }

    public final void OooO0oO() {
        this.f53254OooOOo = true;
        RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
        RoomLiveService roomLiveService2 = RoomLiveService.f24596OooOo00;
        if (roomLiveService2 != null) {
            roomLiveService2.OooO0oO(10055, "{\"prioritid\":0,\"kind\":0,\"userid\":0}");
        }
    }

    public final void OooO0oo(int i) {
        if (isDetached() || !isAdded()) {
            return;
        }
        if (i <= 0) {
            OooO0O0 oooO0O0 = this.f53252OooOOOO;
            if (oooO0O0.OooOO0O() == 0) {
                return;
            }
            oooO0O0.f13181OooOO0O.removeAllViews();
            int iOooOO0o = oooO0O0.OooOO0o();
            if (iOooOO0o != -1) {
                oooO0O0.notifyItemRemoved(iOooOO0o);
                return;
            }
            return;
        }
        if (this.f53256OooOOoo == null) {
            this.f53256OooOOoo = o0O0O0o0.inflate(getLayoutInflater());
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(getContext());
            oooO00o.f43130OooO0oO = o0Oo0oo.ic_user_default;
            oooO00o.f43124OooO00o = 1;
            oooO00o.OooO00o(d1.OooO0OO());
            oooO00o.OooO0Oo(this.f53256OooOOoo.f44489OooO0O0);
            this.f53256OooOOoo.f44490OooO0OO.setOnClickListener(new OooO());
            this.f53252OooOOOO.OooOo0O(this.f53256OooOOoo.f44488OooO00o);
        } else if (this.f53252OooOOOO.OooOO0O() == 0) {
            com.code.android.util.o000O.OooO0o(this.f53256OooOOoo.f44488OooO00o);
            this.f53252OooOOOO.OooOo0O(this.f53256OooOOoo.f44488OooO00o);
        }
        if (com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24546OooOO0o.getValue().intValue() == 1) {
            this.f53256OooOOoo.f44490OooO0OO.setVisibility(0);
        } else {
            this.f53256OooOOoo.f44490OooO0OO.setVisibility(8);
        }
        this.f53256OooOOoo.f44491OooO0Oo.setText(o0000.OooO0OO(o000000.Guests) + ZegoConstants.ZegoVideoDataAuxPublishingStream + i);
    }

    @Override // p525o0o0OO0.o00OO0O0
    public final void initData() {
    }

    @Override // androidx.fragment.app.Oooo0, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f53236OooOO0O.Oooo0O0(3);
        OooOO0 oooOO1 = this.f53257OooOo00;
        if (oooOO1 != null) {
            ((oO0O00o0) oooOO1).getClass();
            com.yalla.yalla.service.room.OooO00o.f24519OooOO0.f48493OooO00o.setValue(Boolean.FALSE);
        }
        super.onDismiss(dialogInterface);
    }
}

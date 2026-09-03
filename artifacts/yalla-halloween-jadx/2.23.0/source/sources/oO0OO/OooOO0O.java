package oO0OO;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000OO00;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.activity.room.o00O00O;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p028Oooo0oO.o0O00o0;
import p157o00OoOO0.o0OO00O;
import p203o00o0o0o.o00O;
import p203o00o0o0o.o00OO000;
import p203o00o0o0o.o00OO00O;
import p396o0Oo0O.OooOOO;
import p406o0Oo0Ooo.oOO0O0O;
import p466o0Oooo0o.oo00o;
import p475o0o000.o000000O;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.e2;
import p641o0ooOOOO.m1;

/* JADX INFO: loaded from: classes4.dex */
public class OooOO0O extends oO0OO.OooO00o {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final /* synthetic */ int f60386OooOo0 = 0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public OooO0O0 f60387OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public RecyclerView f60388OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f60389OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public XRefreshLayout f60390OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public e2 f60391OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public OooOO0 f60392OooOo00;

    public class OooO extends oo00o {
        public OooO() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(View view) {
            o0OO000.OooO00o("102086");
            int i = OooOO0O.f60386OooOo0;
            OooOO0O oooOO0O = OooOO0O.this;
            if (oooOO0O.getContext() instanceof FragmentActivity) {
                o0OO00O o0oo00o2 = new o0OO00O(oooOO0O.getContext());
                o0oo00o2.OooOOoo(oO00OOo0.remove_all_guests);
                int i2 = 1;
                boolean[] zArr = {false};
                m1 m1VarOooO00o = null;
                if (!com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25021OooOoO.getValue().booleanValue()) {
                    View viewInflate = View.inflate(oooOO0O.getContext(), oO00OO0O.dialog_kick_guest, null);
                    m1VarOooO00o = m1.OooO00o(viewInflate);
                    m1VarOooO00o.f58392OooO0O0.setOnClickListener(new oO0OO.OooOO0(zArr, 0));
                    o0oo00o2.OooOOo(viewInflate);
                }
                o0oo00o2.OooOo0(new o00O00O(m1VarOooO00o, i2));
                o0oo00o2.OooOO0o();
            }
        }
    }

    public class OooO00o extends oo00o {
        public OooO00o() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(View view) {
            OooOO0O oooOO0O = OooOO0O.this;
            if (oooOO0O.f60390OooOOo0.getState() == RefreshState.None) {
                o0OO000.OooO00o("102283");
                oooOO0O.f60388OooOOOo.scrollToPosition(0);
                oooOO0O.f60390OooOOo0.OooO0oo();
            }
        }
    }

    public class OooO0O0 extends o000O<RoomUserInfoModel> {
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
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this.f10108OooOOOo);
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO00o());
            oooO00o.f43911OooO0OO = OooOOO.OooO00o(roomUserInfoModel.getUserHeader().getValue());
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo((ImageView) viewHolder.getView(oO00O0oO.sdv_head));
            viewHolder.setGone(oO00O0oO.iv_officials, roomUserInfoModel.isOfficialRole());
            SVGAView sVGAView = (SVGAView) viewHolder.getView(oO00O0oO.sdv_head_frame_svga);
            NetImageView netImageView = (NetImageView) viewHolder.getView(oO00O0oO.sdv_mount);
            UserIdentityView userIdentityView = (UserIdentityView) viewHolder.getView(oO00O0oO.identity);
            View view = viewHolder.getView(oO00O0oO.lineVertical);
            UserNameView userNameView = (UserNameView) viewHolder.getView(oO00O0oO.name);
            UserSexView userSexView = (UserSexView) viewHolder.getView(oO00O0oO.sex);
            RoomMemberBadgeView roomMemberBadgeView = (RoomMemberBadgeView) viewHolder.getView(oO00O0oO.roomMemberBadgeView);
            UserLevelView userLevelView = (UserLevelView) viewHolder.getView(oO00O0oO.level);
            UserOnMicView userOnMicView = (UserOnMicView) viewHolder.getView(oO00O0oO.onMic);
            UserRankView userRankView = (UserRankView) viewHolder.getView(oO00O0oO.rank);
            UserWealthTagView userWealthTagView = (UserWealthTagView) viewHolder.getView(oO00O0oO.cl_wealth);
            userWealthTagView.setTextSize(9.0f);
            UserVipView userVipView = (UserVipView) viewHolder.getView(oO00O0oO.kaVip);
            UserPremiumView userPremiumView = (UserPremiumView) viewHolder.getView(oO00O0oO.vip);
            UserPrettyIdView userPrettyIdView = (UserPrettyIdView) viewHolder.getView(oO00O0oO.prettyId);
            UserMedalView userMedalView = (UserMedalView) viewHolder.getView(oO00O0oO.mvMedal);
            OooOO0O oooOO0O = OooOO0O.this;
            FragmentActivity activity = oooOO0O.getActivity();
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
                    sVGAView.f10172OooOooO = 0;
                    sVGAView.setImageResource(0);
                    sVGAView.OooOO0O(value, activity);
                    sVGAView.OooOO0o();
                }
            }
            view.setVisibility(userIdentityView.OooO0OO(roomUserInfoModel.getRoomMemberType().getValue().intValue(), true, z2) ? 0 : 8);
            userNameView.setText(oOO0O0O.OooO0O0(roomUserInfoModel.getUserId().getValue().longValue(), roomUserInfoModel.getUserName().getValue()));
            userNameView.setFlash(roomUserInfoModel.getVipState().getValue().intValue() == 1 && roomUserInfoModel.getShowVIP().getValue().booleanValue() && roomUserInfoModel.getVipLevel().getValue().intValue() >= VipLevel.Vip4.getValue());
            netImageView.setVisibility(0);
            if (TextUtils.isEmpty(roomUserInfoModel.getVehicleUrl().getValue()) || roomUserInfoModel.getVehicleId().getValue().intValue() == 0) {
                z = false;
                netImageView.setVisibility(4);
            } else {
                o0OOo0O.OooOO0.OooO00o oooO00o2 = new o0OOo0O.OooOO0.OooO00o(this.f10108OooOOOo);
                oooO00o2.f43911OooO0OO = roomUserInfoModel.getVehicleUrl().getValue();
                z = false;
                oooO00o2.f43909OooO00o = 0;
                oooO00o2.f43923OooOOOo = oOo00OO0.icon_vehicel_placeholder;
                oooO00o2.OooO0Oo(netImageView);
            }
            userSexView.OooO0OO(roomUserInfoModel.getSex().getValue().intValue());
            roomMemberBadgeView.OooO00o(roomUserInfoModel.getMemberLevel().getValue(), roomUserInfoModel.getBadgeUrl().getValue(), roomUserInfoModel.isTopRank().getValue().booleanValue(), 9.0f);
            userLevelView.OooOO0o(roomUserInfoModel.getUserLevel().getValue().intValue());
            boolean zBooleanValue = roomUserInfoModel.getHasMic().getValue().booleanValue();
            boolean zBooleanValue2 = roomUserInfoModel.getSilenced().getValue().booleanValue();
            userOnMicView.getClass();
            if (zBooleanValue) {
                o000OO00.OooOOOO(userOnMicView);
                userOnMicView.setImageResource(oOo00OO0.ic_room_online_speaking);
            } else if (zBooleanValue2) {
                o000OO00.OooOOOO(userOnMicView);
                userOnMicView.setImageResource(oOo00OO0.ic_room_banned);
            } else {
                o000OO00.OooO0O0(userOnMicView);
            }
            userRankView.OooO00o(roomUserInfoModel.getRankWeek().getValue().intValue(), roomUserInfoModel.getRankDay().getValue().intValue());
            userWealthTagView.OooO0O0(oooOO0O.getViewLifecycleOwner(), roomUserInfoModel.getWealthLevel().getValue(), roomUserInfoModel.getWealthBadgeWithBg().getValue(), 10.0f);
            int iIntValue = roomUserInfoModel.getVipLevel().getValue().intValue();
            if (roomUserInfoModel.getVipState().getValue().intValue() == VipState.Vip.getValue() && roomUserInfoModel.getShowVIP().getValue().booleanValue()) {
                z = true;
            }
            userVipView.OooOOOO(iIntValue, z, oooOO0O.getActivity());
            userPremiumView.OooO0Oo(roomUserInfoModel.getPremiumLevel().getValue().intValue(), roomUserInfoModel.isPremium().getValue().booleanValue());
            userPrettyIdView.setUserPrettyId(roomUserInfoModel.getIdLevel().getValue().intValue());
            userMedalView.OooO00o(roomUserInfoModel.getMedal().getValue(), oooOO0O.getViewLifecycleOwner());
        }
    }

    public class OooO0OO implements Observer<Object> {
        public OooO0OO() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            ArrayList<RoomUserInfoModel> arrayList = (ArrayList) obj;
            OooOO0O oooOO0O = OooOO0O.this;
            if (oooOO0O.f60389OooOOo) {
                oooOO0O.f60387OooOOOO.OooOoO0(arrayList);
                oooOO0O.f60390OooOOo0.OooOooo(true, true, arrayList.size() < 50);
                oooOO0O.f60389OooOOo = false;
            } else {
                HashSet hashSet = new HashSet(oooOO0O.f60387OooOOOO.f10111OooOOoo.size());
                Iterator it = oooOO0O.f60387OooOOOO.f10111OooOOoo.iterator();
                while (it.hasNext()) {
                    hashSet.add(((RoomUserInfoModel) it.next()).getUserId().getValue());
                }
                ArrayList arrayList2 = new ArrayList();
                for (RoomUserInfoModel roomUserInfoModel : arrayList) {
                    if (!hashSet.contains(roomUserInfoModel.getUserId().getValue())) {
                        arrayList2.add(roomUserInfoModel);
                    }
                }
                oooOO0O.f60387OooOOOO.OooO0O0(arrayList2);
                oooOO0O.f60390OooOOo0.OooOooo(false, true, arrayList.size() < 50);
            }
            String str = o0000.OooO0OO(oO00OOo0.Online_Users) + ": " + com.yalla.yalla.service.room.OooO00o.f24981OooOO0.f47413OooO0O0.getValue();
            oooOO0O.f60356OooO0oO = str;
            TextView textView = oooOO0O.f60361OooOOO;
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
            int i = OooOO0O.f60386OooOo0;
            OooOO0O.this.OooO0oo(iIntValue);
        }
    }

    public interface OooOO0 {
    }

    @Override // oO0OO.OooO00o
    public final int OooO0Oo() {
        return oO00OO0O.dialog_content_room_online_user;
    }

    @Override // oO0OO.OooO00o
    public final void OooO0o(int i, @NonNull View view) {
    }

    @Override // oO0OO.OooO00o
    public final void OooO0o0() {
        XRefreshLayout xRefreshLayout = (XRefreshLayout) this.f60357OooO0oo.findViewById(oO00O0oO.xrl_dialog_room_onlive);
        this.f60390OooOOo0 = xRefreshLayout;
        xRefreshLayout.setOnRefreshListener(new o00O(this, 2));
        this.f60390OooOOo0.setOnLoadMoreListener(new o00OO000(this));
        RecyclerView recyclerView = (RecyclerView) this.f60357OooO0oo.findViewById(oO00O0oO.lv_online);
        this.f60388OooOOOo = recyclerView;
        recyclerView.setLayoutManager(new FixLinearLayoutManager(getContext()));
        this.f60388OooOOOo.setNestedScrollingEnabled(false);
        this.f60355OooO0o.setVisibility(0);
        this.f60355OooO0o.setOnClickListener(new OooO00o());
        ArrayList arrayList = new ArrayList();
        for (Long l : com.yalla.yalla.service.room.OooO00o.f24981OooOO0.f47414OooO0OO) {
            ArrayList arrayList2 = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
            arrayList.add(com.yalla.yalla.service.room.OooO00o.OooO0o0(l));
        }
        OooO0O0 oooO0O0 = new OooO0O0(getContext(), oO00OO0O.room_item_online_sheet, arrayList);
        this.f60387OooOOOO = oooO0O0;
        this.f60388OooOOOo.setAdapter(oooO0O0);
        this.f60387OooOOOO.f10098OooO0o = new o00OO00O(this);
        View view = new View(getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, 1));
        this.f60387OooOOOO.OooOo0(view);
        this.f60387OooOOOO.OooOooO(false);
        OooO0O0 oooO0O1 = this.f60387OooOOOO;
        oooO0O1.f10105OooOOO = true;
        oooO0O1.f10107OooOOOO = true;
        this.f60390OooOOo0.OooOooo(true, true, arrayList.size() < 50);
        StringBuilder sb = new StringBuilder();
        sb.append(o0000.OooO0OO(oO00OOo0.Online_Users));
        sb.append(": ");
        o000000O o000000o2 = com.yalla.yalla.service.room.OooO00o.f24981OooOO0;
        sb.append(o000000o2.f47413OooO0O0.getValue());
        String string = sb.toString();
        this.f60356OooO0oO = string;
        TextView textView = this.f60361OooOOO;
        if (textView != null) {
            textView.setText(string);
        }
        OooO0oO();
        LiveEventBus.get("FORBID_GUESTS_ENTER_ROOM", Boolean.class).observe(this, new Observer() { // from class: oO0OO.OooO
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i = OooOO0O.f60386OooOo0;
                OooOO0O oooOO0O = this.f60353OooO0Oo;
                oooOO0O.getClass();
                if (((Boolean) obj).booleanValue()) {
                    String strOooO0OO = o0000.OooO0OO(oO00OOo0.Success);
                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                        o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                        } else {
                            o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                        }
                    }
                }
                oooOO0O.OooO0oo(0);
            }
        });
        LiveEventBus.get("UPDATE_ONLINE_LIST_DATA").observe(this, new OooO0OO());
        o000000o2.f47415OooO0Oo.observe(this, new OooO0o());
    }

    public final void OooO0oO() {
        this.f60389OooOOo = true;
        RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
        RoomLiveService roomLiveService2 = RoomLiveService.f25058OooOo00;
        if (roomLiveService2 != null) {
            roomLiveService2.OooO0oO(10055, "{\"prioritid\":0,\"kind\":0,\"userid\":0}");
        }
    }

    public final void OooO0oo(int i) {
        if (isDetached() || !isAdded()) {
            return;
        }
        if (i <= 0) {
            OooO0O0 oooO0O0 = this.f60387OooOOOO;
            if (oooO0O0.OooOO0O() == 0) {
                return;
            }
            oooO0O0.f10103OooOO0O.removeAllViews();
            int iOooOO0o = oooO0O0.OooOO0o();
            if (iOooOO0o != -1) {
                oooO0O0.notifyItemRemoved(iOooOO0o);
                return;
            }
            return;
        }
        if (this.f60391OooOOoo == null) {
            this.f60391OooOOoo = e2.inflate(getLayoutInflater());
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(getContext());
            oooO00o.f43915OooO0oO = oOo00OO0.ic_user_default;
            oooO00o.f43909OooO00o = 1;
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
            oooO00o.OooO0Oo(this.f60391OooOOoo.f57794OooO0O0);
            this.f60391OooOOoo.f57795OooO0OO.setOnClickListener(new OooO());
            this.f60387OooOOOO.OooOo0O(this.f60391OooOOoo.f57793OooO00o);
        } else if (this.f60387OooOOOO.OooOO0O() == 0) {
            o000OO00.OooO0o(this.f60391OooOOoo.f57793OooO00o);
            this.f60387OooOOOO.OooOo0O(this.f60391OooOOoo.f57793OooO00o);
        }
        if (com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25008OooOO0o.getValue().intValue() == 1) {
            this.f60391OooOOoo.f57795OooO0OO.setVisibility(0);
        } else {
            this.f60391OooOOoo.f57795OooO0OO.setVisibility(8);
        }
        this.f60391OooOOoo.f57796OooO0Oo.setText(o0000.OooO0OO(oO00OOo0.Guests) + ZegoConstants.ZegoVideoDataAuxPublishingStream + i);
    }

    @Override // oO0OO.OooO00o
    public final void initData() {
    }

    @Override // androidx.fragment.app.OooOo, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f60359OooOO0O.Oooo0O0(3);
        OooOO0 oooOO1 = this.f60392OooOo00;
        if (oooOO1 != null) {
            ((o0O00o0) oooOO1).getClass();
            com.yalla.yalla.service.room.OooO00o.f24981OooOO0.f47412OooO00o.setValue(Boolean.FALSE);
        }
        super.onDismiss(dialogInterface);
    }
}

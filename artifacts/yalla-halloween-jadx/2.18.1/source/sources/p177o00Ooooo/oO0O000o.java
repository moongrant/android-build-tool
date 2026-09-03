package p177o00Ooooo;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.umeng.analytics.MobclickAgent;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.common.ui.view.UserTagView;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.common.ui.view.VipState;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.util.netimage.NetImageView;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.functions.Function0;
import p047Oooooo0.o0o0Oo;
import p159o00OoOO.o00O000;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.oo0oOO0;
import p391o0OOooOo.o0O00000;
import p520o0o0O0O0.o00O0O;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.s8;
import p649o0ooOOoo.y7;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public class oO0O000o extends oOo00o0o {

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public static final /* synthetic */ int f32895Ooooo00 = 0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public RecyclerView f32896OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public XRefreshLayout f32897OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f32898OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public s8 f32899OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public OooOO0 f32900OoooOoo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public p188o00o00o0.OooO0OO<RoomUserInfoModel> f32901o000oOoO;

    public class OooO extends o00Oo0 {
        public OooO() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(View view) {
            o0O00000.OooO0OO("InRoom_online_kick");
            oO0O000o oo0o000o = oO0O000o.this;
            int i = oO0O000o.f32895Ooooo00;
            if (oo0o000o.getContext() instanceof FragmentActivity) {
                oo0oOO0 oo0ooo0 = new oo0oOO0(oo0o000o.getContext());
                oo0ooo0.OooOo0(R.string.remove_all_guests);
                boolean[] zArr = {false};
                final y7 y7VarOooO00o = null;
                if (!o00OO00O.f43313OooooOo.OooO00o().f43348Oooo000.getValue().booleanValue()) {
                    View viewInflate = View.inflate(oo0o000o.getContext(), R.layout.dialog_kick_guest, null);
                    y7VarOooO00o = y7.OooO00o(viewInflate);
                    y7VarOooO00o.f50994OooO0O0.setOnClickListener(new oOo000Oo(zArr, 0));
                    oo0ooo0.OooOo00(viewInflate);
                }
                oo0ooo0.OooOo0o(new Function0() { // from class: o00Ooooo.oOo000o0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        y7 y7Var = y7VarOooO00o;
                        int i2 = oO0O000o.f32895Ooooo00;
                        o00O000.OooO().OooO0oO((o00OO00O.f43313OooooOo.OooO00o().f43348Oooo000.getValue().booleanValue() || y7Var == null || !y7Var.f50994OooO0O0.isChecked()) ? 0 : 1);
                        return null;
                    }
                });
                oo0ooo0.OooOOO0();
            }
        }
    }

    public class OooO00o extends o00Oo0 {
        public OooO00o() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(View view) {
            if (oO0O000o.this.f32897OoooOOo.getState() == RefreshState.None) {
                oO0O000o.this.f32896OoooOOO.scrollToPosition(0);
                oO0O000o.this.f32897OoooOOo.OooO0oo();
            }
        }
    }

    public class OooO0O0 extends p188o00o00o0.OooO0OO<RoomUserInfoModel> {
        public OooO0O0(Context context, List list) {
            super(context, R.layout.room_item_online_sheet, list);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            p188o00o00o0.OooO0o oooO0o = (p188o00o00o0.OooO0o) oooO00o;
            RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) obj;
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.mContext);
            oooO00o2.OooO00o(o00OOO.OooO00o.OooO00o());
            oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgSize(roomUserInfoModel.getUserHeader(), OooOo00.OooO00o(40), true);
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.sdv_head));
            oooO0o.OooO0oO(R.id.iv_officials, roomUserInfoModel.isOfficialRole());
            SVGAView sVGAView = (SVGAView) oooO0o.OooO0Oo(R.id.sdv_head_frame_svga);
            UserTagView userTagView = (UserTagView) oooO0o.OooO0Oo(R.id.topUserTagView);
            UserTagView userTagView2 = (UserTagView) oooO0o.OooO0Oo(R.id.bottomUserTagView);
            NetImageView netImageView = (NetImageView) oooO0o.OooO0Oo(R.id.sdv_mount);
            userTagView.OooO00o();
            FragmentActivity activity = oO0O000o.this.getActivity();
            String userHeaderFrame = roomUserInfoModel.getUserHeaderFrame();
            sVGAView.setImageDrawable(null);
            sVGAView.setVisibility(8);
            sVGAView.OooO0o0(false);
            if (!com.yalla.support.common.util.OooO0OO.OooO00o(userHeaderFrame) && !"/headframe/0.png".equals(userHeaderFrame)) {
                sVGAView.setVisibility(0);
                sVGAView.f21010OooooO0 = 0;
                sVGAView.OooO0oo(userHeaderFrame, activity);
                sVGAView.OooO();
            }
            userTagView.setIdentityRoomOnLine(roomUserInfoModel.getRoomMemberType());
            userTagView.setName(o00O0O.f42677OooO00o.OooO0O0(roomUserInfoModel.getUserId(), roomUserInfoModel.getUserName()));
            userTagView.setNameFlash(roomUserInfoModel.getVipState() == 1 && roomUserInfoModel.getShowVIP() && roomUserInfoModel.getVipLevel() >= VipLevel.Vip4.getValue());
            netImageView.setVisibility(0);
            if (TextUtils.isEmpty(roomUserInfoModel.getVehicleUrl()) || roomUserInfoModel.getVehicleId() == 0) {
                netImageView.setVisibility(4);
            } else {
                oO0O00.OooO00o oooO00o3 = new oO0O00.OooO00o(this.mContext);
                oooO00o3.f48429OooO0OO = roomUserInfoModel.getVehicleUrl();
                oooO00o3.f48427OooO00o = 0;
                oooO00o3.f48441OooOOOo = R.drawable.icon_vehicel_placeholder;
                oooO00o3.OooO0o(netImageView);
            }
            userTagView.setSex(roomUserInfoModel.getSex());
            userTagView.setLevel(roomUserInfoModel.getUserLevel());
            userTagView.OooO(Integer.valueOf(roomUserInfoModel.getMemberLevel()), roomUserInfoModel.getBadgeUrl(), roomUserInfoModel.getIsTopRank(), 9.0f);
            userTagView2.OooO00o();
            userTagView2.OooO0o0(roomUserInfoModel.getHasMic(), roomUserInfoModel.getSilenced());
            userTagView2.OooO0oo(roomUserInfoModel.getRankWeek(), roomUserInfoModel.getRankDay());
            userTagView2.OooO0oO(roomUserInfoModel.isPremium(), roomUserInfoModel.getPremiumLevel());
            userTagView2.OooO0Oo(roomUserInfoModel.getMedal(), oO0O000o.this.getViewLifecycleOwner());
            userTagView2.OooO0OO(roomUserInfoModel.getVipLevel(), roomUserInfoModel.getVipState() == VipState.Vip.getValue() && roomUserInfoModel.getShowVIP());
            userTagView2.setPrettyIdUser(roomUserInfoModel.getIdLevel());
        }
    }

    public class OooO0OO implements Observer<Object> {
        public OooO0OO() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            ArrayList arrayList = (ArrayList) obj;
            oO0O000o oo0o000o = oO0O000o.this;
            if (oo0o000o.f32898OoooOo0) {
                oo0o000o.f32898OoooOo0 = false;
                oo0o000o.f32901o000oOoO.setNewData(arrayList);
                oo0o000o.f32897OoooOOo.Oooo0o0(true, true, arrayList.size() < 50);
            } else {
                oo0o000o.f32901o000oOoO.addData(arrayList);
                oo0o000o.f32897OoooOOo.Oooo0o0(false, true, arrayList.size() < 50);
            }
            String str = o000O0O0.OooO0OO(R.string.Online_Users) + ": " + o00O.OooOO0.f43243OooO00o.OooO00o();
            oo0o000o.f32929Oooo0oO = str;
            TextView textView = oo0o000o.f32935OoooOO0;
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
            oO0O000o oo0o000o = oO0O000o.this;
            int iIntValue = num.intValue();
            int i = oO0O000o.f32895Ooooo00;
            oo0o000o.OooO0o0(iIntValue);
        }
    }

    public interface OooOO0 {
    }

    @Override // p177o00Ooooo.oOo00o0o
    public final int OooO0O0() {
        return R.layout.dialog_content_room_online_user;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p177o00Ooooo.oOo00o0o
    public final void OooO0OO() {
        XRefreshLayout xRefreshLayout = (XRefreshLayout) this.f32930Oooo0oo.findViewById(R.id.xrl_dialog_room_onlive);
        this.f32897OoooOOo = xRefreshLayout;
        xRefreshLayout.setOnRefreshListener(new oO0O000(this, 0 == true ? 1 : 0));
        this.f32897OoooOOo.setOnLoadMoreListener(new oO0(this, 0 == true ? 1 : 0));
        RecyclerView recyclerView = (RecyclerView) this.f32930Oooo0oo.findViewById(R.id.lv_online);
        this.f32896OoooOOO = recyclerView;
        recyclerView.setLayoutManager(new FixLinearLayoutManager(getContext()));
        this.f32896OoooOOO.setNestedScrollingEnabled(false);
        this.f32928Oooo0o.setVisibility(0);
        this.f32928Oooo0o.setOnClickListener(new OooO00o());
        ArrayList arrayList = new ArrayList();
        o00O.OooOO0 oooOO1 = o00O.OooOO0.f43243OooO00o;
        ListIterator<Long> listIterator = o00O.OooOO0.f43246OooO0Oo.listIterator();
        while (true) {
            o0o0Oo o0o0oo = (o0o0Oo) listIterator;
            if (!o0o0oo.hasNext()) {
                break;
            } else {
                arrayList.add(o00O.f43140OooO00o.OooOO0(((Long) o0o0oo.next()).longValue()));
            }
        }
        OooO0O0 oooO0O0 = new OooO0O0(getContext(), arrayList);
        this.f32901o000oOoO = oooO0O0;
        this.f32896OoooOOO.setAdapter(oooO0O0);
        this.f32901o000oOoO.setOnItemClickListener(new oOo0000O(this));
        View view = new View(getContext());
        int i = 1;
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, 1));
        this.f32901o000oOoO.setEmptyView(view);
        this.f32901o000oOoO.setEmptyFullScreen(false);
        this.f32901o000oOoO.setHeaderFooterEmpty(true, true);
        this.f32897OoooOOo.Oooo0o0(true, true, arrayList.size() < 50);
        String str = o000O0O0.OooO0OO(R.string.Online_Users) + ": " + o00O.OooOO0.f43243OooO00o.OooO00o();
        this.f32929Oooo0oO = str;
        TextView textView = this.f32935OoooOO0;
        if (textView != null) {
            textView.setText(str);
        }
        this.f32898OoooOo0 = true;
        o00O000.OooO().OooOOo(0L, 0, 0L);
        LiveEventBus.get("FORBID_GUESTS_ENTER_ROOM", Boolean.class).observe(this, new p143o00OOooo.oo0oOO0(this, i));
        LiveEventBus.get("UPDATE_ONLINE_LIST_DATA").observe(this, new OooO0OO());
        o00O.OooOO0.f43247OooO0o0.observe(this, new OooO0o());
    }

    @Override // p177o00Ooooo.oOo00o0o
    public final void OooO0Oo(@NonNull View view, int i) {
    }

    public final void OooO0o0(int i) {
        if (isDetached() || !isAdded()) {
            return;
        }
        if (i <= 0) {
            this.f32901o000oOoO.removeAllFooterView();
            return;
        }
        if (this.f32899OoooOoO == null) {
            this.f32899OoooOoO = s8.inflate(getLayoutInflater());
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(getContext());
            oooO00o.f48433OooO0oO = R.drawable.ic_user_default;
            oooO00o.f48427OooO00o = 1;
            oooO00o.OooO00o(o00OOO.OooO00o.OooO0o0());
            oooO00o.OooO0o(this.f32899OoooOoO.f50523OooO0O0);
            this.f32899OoooOoO.f50524OooO0OO.setOnClickListener(new OooO());
            this.f32901o000oOoO.setFooterView(this.f32899OoooOoO.f50522OooO00o);
        }
        if (o00OO00O.f43313OooooOo.OooO00o().f43329OooOOOO.getValue().intValue() == 1) {
            this.f32899OoooOoO.f50524OooO0OO.setVisibility(0);
        } else {
            this.f32899OoooOoO.f50524OooO0OO.setVisibility(8);
        }
        this.f32899OoooOoO.f50525OooO0Oo.setText(o000O0O0.OooO0OO(R.string.Guests) + ZegoConstants.ZegoVideoDataAuxPublishingStream + i);
    }

    @Override // p177o00Ooooo.oOo00o0o
    public final void initData() {
    }

    @Override // androidx.fragment.app.OooOo00, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f32932OoooO0.Oooo00O(3);
        if (this.f32900OoooOoo != null) {
            o00O.OooOO0 oooOO1 = o00O.OooOO0.f43243OooO00o;
            o00O.OooOO0.f43244OooO0O0.setValue(Boolean.FALSE);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        MobclickAgent.onPageEnd("Room_OnlineList");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        MobclickAgent.onPageStart("Room_OnlineList");
    }
}

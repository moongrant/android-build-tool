package p579o0oOoOOo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.protobuf.room.Room;
import com.app.base.view.SearchView;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.MobclickAgent;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOo00;
import com.yalla.support.statebutton.StateButton;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.common.ui.view.UserTagView;
import com.yalla.yalla.common.ui.view.VipState;
import com.yalla.yalla.common.ui.view.refresh.RefreshLayout;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p028Oooo0o0.o00O0O0O;
import p143o00OOooo.o00O000o;
import p159o00OoOO.o00O000;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p501o0o00o.o0000OO0;
import p502o0o00o0.o0000O0;
import p520o0o0O0O0.o00O0O;
import p524o0o0O0oO.oo00oO;
import p530o0o0OOO.o00O;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class j extends o0000O0 {

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static final /* synthetic */ int f45965OooooO0 = 0;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final List<RoomUserInfoModel> f45966OoooO;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final Function1<List<RoomUserInfoModel>, Unit> f45967OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f45968OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NotNull
    public ArrayList<Long> f45969OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public RecyclerView f45970OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public RefreshLayout f45971OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public SearchView f45972OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public OooO0OO<Long> f45973Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public long f45974Ooooo0o;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final int f45975o000oOoO;

    public static final class OooO00o extends Lambda implements Function1<String, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            if (StringsKt.isBlank(it)) {
                j.this.OooO0oo();
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                j jVar = j.this;
                if (jCurrentTimeMillis - jVar.f45974Ooooo0o > 300) {
                    jVar.f45974Ooooo0o = jCurrentTimeMillis;
                    Objects.requireNonNull(o00O000.OooO());
                    if (o00O000.f32468OooO00o != null) {
                        Room.InRoomUserSearchRequest.Builder builderNewBuilder = Room.InRoomUserSearchRequest.newBuilder();
                        builderNewBuilder.setPattern(it);
                        o00O000.f32468OooO00o.OooO0oO(1000700, builderNewBuilder.build().toByteArray());
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends OooO0OO<Long> {
        public OooO0O0(Context context) {
            super(context, R.layout.room_item_online_list);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            OooO0o oooO0o = (OooO0o) oooO00o;
            Long l = (Long) obj;
            if (l != null) {
                l.longValue();
                RoomUserInfoModel roomUserInfoModelOooOO0 = o00O.f43140OooO00o.OooOO0(l.longValue());
                if (roomUserInfoModelOooOO0 == null || oooO0o == null) {
                    return;
                }
                oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
                oooO00o2.OooO00o(o00OOO.OooO00o.OooO00o());
                oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgSize(roomUserInfoModelOooOO0.getUserHeader(), OooOo00.OooO00o(40), true);
                oooO00o2.f48427OooO00o = 0;
                oooO00o2.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.ivUserAvatar));
                FragmentActivity activity = j.this.getActivity();
                SVGAView sVGAView = (SVGAView) oooO0o.OooO0Oo(R.id.svUserAvatarFrame);
                String userHeaderFrame = roomUserInfoModelOooOO0.getUserHeaderFrame();
                sVGAView.setImageDrawable(null);
                sVGAView.setVisibility(8);
                sVGAView.OooO0o0(false);
                if (!com.yalla.support.common.util.OooO0OO.OooO00o(userHeaderFrame) && !"/headframe/0.png".equals(userHeaderFrame)) {
                    sVGAView.setVisibility(0);
                    sVGAView.f21010OooooO0 = 0;
                    sVGAView.OooO0oo(userHeaderFrame, activity);
                    sVGAView.OooO();
                }
                oooO0o.OooO0oO(R.id.ivOfficials, roomUserInfoModelOooOO0.isOfficialRole());
                UserTagView userTagView = (UserTagView) oooO0o.OooO0Oo(R.id.userTagViewTop);
                UserTagView userTagView2 = (UserTagView) oooO0o.OooO0Oo(R.id.userTagViewBottom);
                userTagView.setIdentityRoomOnLine(roomUserInfoModelOooOO0.getRoomMemberType());
                userTagView.setName(o00O0O.f42677OooO00o.OooO0O0(roomUserInfoModelOooOO0.getUserId(), roomUserInfoModelOooOO0.getUserName()));
                userTagView.setSex(roomUserInfoModelOooOO0.getSex());
                userTagView.setLevel(roomUserInfoModelOooOO0.getUserLevel());
                userTagView2.OooO0oO(roomUserInfoModelOooOO0.isPremium(), roomUserInfoModelOooOO0.getPremiumLevel());
                userTagView2.OooO0OO(roomUserInfoModelOooOO0.getVipLevel(), roomUserInfoModelOooOO0.getVipState() == VipState.Vip.getValue() && roomUserInfoModelOooOO0.getShowVIP());
                userTagView2.OooO0o0(roomUserInfoModelOooOO0.getHasMic(), roomUserInfoModelOooOO0.getSilenced());
                userTagView2.setPrettyIdUser(roomUserInfoModelOooOO0.getIdLevel());
                userTagView2.OooO0oo(roomUserInfoModelOooOO0.getRankWeek(), roomUserInfoModelOooOO0.getRankDay());
                userTagView2.OooO0Oo(roomUserInfoModelOooOO0.getMedal(), j.this);
                ((ImageView) oooO0o.OooO0Oo(R.id.ivSelectState)).setImageResource(j.this.OooO0oO(roomUserInfoModelOooOO0).getFirst().booleanValue() ? R.drawable.room_vote_game_select_user : R.drawable.room_vote_game_not_select_user);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@NotNull List<RoomUserInfoModel> selectUsers, @NotNull Function1<? super List<RoomUserInfoModel>, Unit> addListener) {
        Intrinsics.checkNotNullParameter(selectUsers, "selectUsers");
        Intrinsics.checkNotNullParameter(addListener, "addListener");
        this.f45966OoooO = selectUsers;
        this.f45967OoooOO0 = addListener;
        this.f45975o000oOoO = 50;
        this.f45969OoooOOo = new ArrayList<>();
    }

    public final void OooO(boolean z) {
        this.f45968OoooOOO = z;
        if (z) {
            o00O000.OooO().OooOOo(0L, 0, 0L);
            return;
        }
        if (!(!this.f45969OoooOOo.isEmpty())) {
            this.f45968OoooOOO = true;
            RefreshLayout refreshLayout = this.f45971OoooOoO;
            if (refreshLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rlOnlineList");
                refreshLayout = null;
            }
            refreshLayout.setLoadSuccess(false);
            return;
        }
        o00O o00o2 = o00O.f43140OooO00o;
        ArrayList<Long> arrayList = this.f45969OoooOOo;
        Long l = arrayList.get(arrayList.size() - 1);
        Intrinsics.checkNotNullExpressionValue(l, "onlineData[onlineData.size - 1]");
        RoomUserInfoModel roomUserInfoModelOooOO0 = o00o2.OooOO0(l.longValue());
        if (roomUserInfoModelOooOO0 == null) {
            return;
        }
        o00O000.OooO().OooOOo(roomUserInfoModelOooOO0.getPriority(), 1, roomUserInfoModelOooOO0.getUserId());
    }

    @Override // p502o0o00o0.o0000O0
    public final int OooO0OO() {
        return R.layout.room_dialog_online_list;
    }

    @Override // p502o0o00o0.o0000O0
    public final void OooO0o(@NotNull View bottomSheet, int i) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
    }

    @Override // p502o0o00o0.o0000O0
    @SuppressLint({"NotifyDataSetChanged"})
    public final void OooO0o0() {
        TextView textView = this.f41565Oooo0oO;
        OooO0OO<Long> oooO0OO = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvSelectNum");
            textView = null;
        }
        StringBuilder sbOooO00o = o00O0O0O.OooO00o('(');
        sbOooO00o.append(this.f45966OoooO.size());
        sbOooO00o.append("/20)");
        textView.setText(sbOooO00o.toString());
        View viewFindViewById = OooO0Oo().findViewById(R.id.onlineRefresh);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "viewRoot.findViewById(R.id.onlineRefresh)");
        RefreshLayout refreshLayout = (RefreshLayout) viewFindViewById;
        this.f45971OoooOoO = refreshLayout;
        if (refreshLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rlOnlineList");
            refreshLayout = null;
        }
        refreshLayout.Oooo0(new o00O000o(this));
        RefreshLayout refreshLayout2 = this.f45971OoooOoO;
        if (refreshLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rlOnlineList");
            refreshLayout2 = null;
        }
        refreshLayout2.f19541o00O0O = false;
        View viewFindViewById2 = OooO0Oo().findViewById(R.id.searchView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "viewRoot.findViewById(R.id.searchView)");
        SearchView searchView = (SearchView) viewFindViewById2;
        this.f45972OoooOoo = searchView;
        if (searchView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchView");
            searchView = null;
        }
        searchView.OooO0O0();
        SearchView searchView2 = this.f45972OoooOoo;
        if (searchView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchView");
            searchView2 = null;
        }
        searchView2.setSearchTextChangedListener(new OooO00o());
        View viewFindViewById3 = OooO0Oo().findViewById(R.id.onlineList);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "viewRoot.findViewById(R.id.onlineList)");
        this.f45970OoooOo0 = (RecyclerView) viewFindViewById3;
        this.f45973Ooooo00 = new OooO0O0(getContext());
        View view = new View(getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, 1));
        OooO0OO<Long> oooO0OO2 = this.f45973Ooooo00;
        if (oooO0OO2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO2 = null;
        }
        oooO0OO2.setEmptyView(view);
        OooO0OO<Long> oooO0OO3 = this.f45973Ooooo00;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO3 = null;
        }
        oooO0OO3.setEmptyFullScreen(false);
        OooO0OO<Long> oooO0OO4 = this.f45973Ooooo00;
        if (oooO0OO4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO4 = null;
        }
        oooO0OO4.setHeaderFooterEmpty(true, true);
        OooO0OO<Long> oooO0OO5 = this.f45973Ooooo00;
        if (oooO0OO5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO5 = null;
        }
        oooO0OO5.setOnItemClickListener(new i(this));
        RecyclerView recyclerView = this.f45970OoooOo0;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvOnlineList");
            recyclerView = null;
        }
        recyclerView.setNestedScrollingEnabled(false);
        RecyclerView recyclerView2 = this.f45970OoooOo0;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvOnlineList");
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(new FixLinearLayoutManager(getContext()));
        RecyclerView recyclerView3 = this.f45970OoooOo0;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvOnlineList");
            recyclerView3 = null;
        }
        OooO0OO<Long> oooO0OO6 = this.f45973Ooooo00;
        if (oooO0OO6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            oooO0OO = oooO0OO6;
        }
        recyclerView3.setAdapter(oooO0OO);
        OooO0oo();
        ((StateButton) OooO0Oo().findViewById(R.id.btConfirm)).setOnClickListener(new o00OO0O.OooO0o(this, 4));
        LiveEventBus.get("SEARCH_ONLINE_USER").observe(this, new oo00oO(this, 5));
    }

    public final Pair<Boolean, Integer> OooO0oO(RoomUserInfoModel roomUserInfoModel) {
        int size = this.f45966OoooO.size();
        for (int i = 0; i < size; i++) {
            if (this.f45966OoooO.get(i).getUserId() == roomUserInfoModel.getUserId()) {
                return new Pair<>(Boolean.TRUE, Integer.valueOf(i));
            }
        }
        return new Pair<>(Boolean.FALSE, 0);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void OooO0oo() {
        ArrayList<Long> arrayList = new ArrayList<>();
        this.f45969OoooOOo = arrayList;
        o00O.OooOO0 oooOO1 = o00O.OooOO0.f43243OooO00o;
        arrayList.addAll(o00O.OooOO0.f43246OooO0Oo);
        OooO0OO<Long> oooO0OO = this.f45973Ooooo00;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        oooO0OO.setNewData(this.f45969OoooOOo);
    }

    @Override // p502o0o00o0.o0000O0
    public final void initData() {
        if (getContext() instanceof FragmentActivity) {
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            OooO(true);
            LiveEventBus.get("UPDATE_ONLINE_LIST_DATA").observe((FragmentActivity) context, new o0000OO0(this, 5));
            LiveEventBus.get("FORBID_GUESTS_ENTER_ROOM", Boolean.TYPE).observe(this, new Observer() { // from class: o0oOoOOo.h
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    int i = j.f45965OooooO0;
                }
            });
        }
    }

    @Override // p502o0o00o0.o0000O0, androidx.fragment.app.OooOo00, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        OooO0O0().Oooo00O(3);
        super.onDismiss(dialog);
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

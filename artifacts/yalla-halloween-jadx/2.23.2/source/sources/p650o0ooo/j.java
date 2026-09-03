package p650o0ooo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.protobuf.room.Room;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.OooOo00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.support.statebutton.StateButton;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.activity.room.o0O0OOO0;
import com.yalla.yalla.ui.view.SearchView;
import com.yalla.yalla.ui.view.UserTagView;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.ui.view.refresh.RefreshLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p018OooOoo0.OooOOO;
import p028Oooo0oO.o00O0000;
import p368o0OOo0Oo.Oooo000;
import p371o0OOo0oO.o0OOO0o;
import p412o0Oo0o0O.o000O000;
import p492o0o00OO0.o0000O0O;
import p492o0o00OO0.o000OO;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p571o0oOoO0.o0000oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nOnlineListDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnlineListDialog.kt\ncom/yalla/yalla/ui/dialog/OnlineListDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,246:1\n1855#2,2:247\n1549#2:249\n1620#2,3:250\n1549#2:253\n1620#2,3:254\n*S KotlinDebug\n*F\n+ 1 OnlineListDialog.kt\ncom/yalla/yalla/ui/dialog/OnlineListDialog\n*L\n154#1:247,2\n192#1:249\n192#1:250,3\n203#1:253\n203#1:254,3\n*E\n"})
public final class j extends o00oOoo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ int f58287OooOo0o = 0;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final Function1<List<RoomUserInfoModel>, Unit> f58288OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final List<RoomUserInfoModel> f58289OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f58290OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f58291OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public RecyclerView f58292OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public ArrayList<Long> f58293OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public RefreshLayout f58294OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public OooO0OO f58295OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public SearchView f58296OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public long f58297OooOo0O;

    public static final class OooO00o extends Lambda implements Function1<String, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            boolean zIsBlank = StringsKt.isBlank(it);
            j jVar = j.this;
            if (zIsBlank) {
                jVar.OooOO0();
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - jVar.f58297OooOo0O > 300) {
                    jVar.f58297OooOo0O = jCurrentTimeMillis;
                    Room.InRoomUserSearchRequest.Builder builderNewBuilder = Room.InRoomUserSearchRequest.newBuilder();
                    builderNewBuilder.setPattern(it);
                    RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
                    if (roomLiveService != null) {
                        roomLiveService.OooO0oo(1000700, builderNewBuilder.build().toByteArray());
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Integer, String, Unit> {
        public OooO0O0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, String str) {
            num.intValue();
            Intrinsics.checkNotNullParameter(str, "<anonymous parameter 1>");
            SearchView view = j.this.f58296OooOo00;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchView");
                view = null;
            }
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            InputMethodManager inputMethodManagerOooO00o = o0OOO0o.OooO00o(context);
            kotlin.collections.OooO00o.OooO0O0(view.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view.getWindowToken(), 0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends o0000oo<Long> {
        public OooO0OO(Context context, int i) {
            super(context, i);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            ViewHolder viewHolder = (ViewHolder) baseViewHolder;
            Long l = (Long) obj;
            if (l != null) {
                l.longValue();
                ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
                RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(l);
                if (roomUserInfoModelOooO0o0 == null || viewHolder == null) {
                    return;
                }
                Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f56423OooOo);
                oooO00o.OooO00o(d1.OooO00o());
                oooO00o.f43126OooO0OO = p403o0Oo0OO.OooO0OO.OooO00o(roomUserInfoModelOooO0o0.getUserHeader().getValue());
                boolean z = false;
                oooO00o.f43124OooO00o = 0;
                oooO00o.OooO0Oo((ImageView) viewHolder.getView(o0OO00O.ivUserAvatar));
                j jVar = j.this;
                FragmentActivity activity = jVar.getActivity();
                SVGAView sVGAView = (SVGAView) viewHolder.getView(o0OO00O.svUserAvatarFrame);
                String value = roomUserInfoModelOooO0o0.getUserHeaderFrame().getValue();
                sVGAView.setImageDrawable(null);
                sVGAView.setVisibility(8);
                sVGAView.OooO0oO(false);
                if (!OooOo00.OooO00o(value) && !"/headframe/0.png".equals(value)) {
                    sVGAView.setVisibility(0);
                    sVGAView.f13232OooOooO = 0;
                    sVGAView.setImageResource(0);
                    sVGAView.OooOO0O(value, activity);
                    sVGAView.OooOO0o();
                }
                viewHolder.setGone(o0OO00O.ivOfficials, roomUserInfoModelOooO0o0.isOfficialRole());
                UserTagView userTagView = (UserTagView) viewHolder.getView(o0OO00O.userTagViewTop);
                UserTagView userTagView2 = (UserTagView) viewHolder.getView(o0OO00O.userTagViewBottom);
                userTagView.setIdentityRoomOnLine(roomUserInfoModelOooO0o0.getRoomMemberType().getValue().intValue());
                userTagView.setName(o000O000.OooO0O0(roomUserInfoModelOooO0o0.getUserId().getValue().longValue(), roomUserInfoModelOooO0o0.getUserName().getValue()));
                userTagView.setSex(roomUserInfoModelOooO0o0.getSex().getValue().intValue());
                userTagView.setLevel(roomUserInfoModelOooO0o0.getUserLevel().getValue().intValue());
                userTagView2.OooO0oo(roomUserInfoModelOooO0o0.getPremiumLevel().getValue().intValue(), roomUserInfoModelOooO0o0.isPremium().getValue().booleanValue());
                int iIntValue = roomUserInfoModelOooO0o0.getVipLevel().getValue().intValue();
                if (roomUserInfoModelOooO0o0.getVipState().getValue().intValue() == VipState.Vip.getValue() && roomUserInfoModelOooO0o0.getShowVIP().getValue().booleanValue()) {
                    z = true;
                }
                userTagView2.OooO0Oo(iIntValue, z, jVar.getViewLifecycleOwner());
                userTagView2.OooO0o(roomUserInfoModelOooO0o0.getHasMic().getValue().booleanValue(), roomUserInfoModelOooO0o0.getSilenced().getValue().booleanValue());
                userTagView2.setPrettyIdUser(roomUserInfoModelOooO0o0.getIdLevel().getValue().intValue());
                userTagView2.OooO(roomUserInfoModelOooO0o0.getRankWeek().getValue().intValue(), roomUserInfoModelOooO0o0.getRankDay().getValue().intValue());
                userTagView2.OooO0o0(roomUserInfoModelOooO0o0.getMedal().getValue(), jVar);
                ((ImageView) viewHolder.getView(o0OO00O.ivSelectState)).setImageResource(jVar.OooO(roomUserInfoModelOooO0o0).getFirst().booleanValue() ? o0Oo0oo.room_vote_game_select_user : o0Oo0oo.room_vote_game_not_select_user);
            }
        }
    }

    public j(@NotNull ArrayList selectUsers, @NotNull o0O0OOO0 addListener) {
        Intrinsics.checkNotNullParameter(selectUsers, "selectUsers");
        Intrinsics.checkNotNullParameter(addListener, "addListener");
        this.f58289OooOOO0 = selectUsers;
        this.f58288OooOOO = addListener;
        this.f58290OooOOOO = 50;
        this.f58293OooOOo0 = new ArrayList<>();
    }

    public final Pair<Boolean, Integer> OooO(RoomUserInfoModel roomUserInfoModel) {
        List<RoomUserInfoModel> list = this.f58289OooOOO0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getUserId().getValue().longValue() == roomUserInfoModel.getUserId().getValue().longValue()) {
                return new Pair<>(Boolean.TRUE, Integer.valueOf(i));
            }
        }
        return new Pair<>(Boolean.FALSE, 0);
    }

    @Override // p650o0ooo.o00oOoo
    public final int OooO0o0() {
        return oo0o0Oo.room_dialog_online_list;
    }

    @Override // p650o0ooo.o00oOoo
    @SuppressLint({"NotifyDataSetChanged"})
    public final void OooO0oO() {
        TextView textView = this.f58594OooO0oO;
        OooO0OO oooO0OO = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvSelectNum");
            textView = null;
        }
        textView.setText("(" + this.f58289OooOOO0.size() + "/20)");
        View viewFindViewById = OooO0o().findViewById(o0OO00O.onlineRefresh);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RefreshLayout refreshLayout = (RefreshLayout) viewFindViewById;
        this.f58294OooOOoo = refreshLayout;
        if (refreshLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rlOnlineList");
            refreshLayout = null;
        }
        refreshLayout.OooOoo0(new p335o0OO0o0O.o0OOO0o(this));
        RefreshLayout refreshLayout2 = this.f58294OooOOoo;
        if (refreshLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rlOnlineList");
            refreshLayout2 = null;
        }
        refreshLayout2.f20857OooOooO = false;
        View viewFindViewById2 = OooO0o().findViewById(o0OO00O.searchView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        SearchView searchView = (SearchView) viewFindViewById2;
        this.f58296OooOo00 = searchView;
        if (searchView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchView");
            searchView = null;
        }
        View view = searchView.f30103OooO0o;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewLine");
            view = null;
        }
        view.setVisibility(0);
        SearchView searchView2 = this.f58296OooOo00;
        if (searchView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchView");
            searchView2 = null;
        }
        searchView2.setSearchTextChangedListener(new OooO00o());
        SearchView searchView3 = this.f58296OooOo00;
        if (searchView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchView");
            searchView3 = null;
        }
        searchView3.setSearchClickListener(new OooO0O0());
        View viewFindViewById3 = OooO0o().findViewById(o0OO00O.onlineList);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f58292OooOOo = (RecyclerView) viewFindViewById3;
        this.f58295OooOo0 = new OooO0OO(getContext(), oo0o0Oo.room_item_online_list);
        View view2 = new View(getContext());
        int i = 1;
        view2.setLayoutParams(new ViewGroup.LayoutParams(-1, 1));
        OooO0OO oooO0OO2 = this.f58295OooOo0;
        if (oooO0OO2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO2 = null;
        }
        oooO0OO2.OooOo0(view2);
        OooO0OO oooO0OO3 = this.f58295OooOo0;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO3 = null;
        }
        oooO0OO3.OooOooO(false);
        OooO0OO oooO0OO4 = this.f58295OooOo0;
        if (oooO0OO4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO4 = null;
        }
        oooO0OO4.f13183OooOOO = true;
        oooO0OO4.f13185OooOOOO = true;
        OooO0OO oooO0OO5 = this.f58295OooOo0;
        if (oooO0OO5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO5 = null;
        }
        oooO0OO5.f13176OooO0o = new androidx.media3.session.o0OO00O(this);
        RecyclerView recyclerView = this.f58292OooOOo;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvOnlineList");
            recyclerView = null;
        }
        recyclerView.setNestedScrollingEnabled(false);
        RecyclerView recyclerView2 = this.f58292OooOOo;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvOnlineList");
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(new FixLinearLayoutManager(getContext()));
        RecyclerView recyclerView3 = this.f58292OooOOo;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvOnlineList");
            recyclerView3 = null;
        }
        OooO0OO oooO0OO6 = this.f58295OooOo0;
        if (oooO0OO6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            oooO0OO = oooO0OO6;
        }
        recyclerView3.setAdapter(oooO0OO);
        OooOO0();
        ((StateButton) OooO0o().findViewById(o0OO00O.btConfirm)).setOnClickListener(new h(this, 0));
        LiveEventBus.get("SEARCH_ONLINE_USER").observe(this, new o0000O0O(this, i));
    }

    @Override // p650o0ooo.o00oOoo
    public final void OooO0oo(int i, @NotNull View bottomSheet) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void OooOO0() {
        ArrayList<Long> arrayList = new ArrayList<>();
        this.f58293OooOOo0 = arrayList;
        arrayList.addAll(com.yalla.yalla.service.room.OooO00o.f24519OooOO0.f48495OooO0OO);
        OooO0OO oooO0OO = this.f58295OooOo0;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        oooO0OO.OooOoO0(this.f58293OooOOo0);
    }

    public final void OooOO0O(boolean z) {
        this.f58291OooOOOo = z;
        if (z) {
            RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oO(10055, "{\"prioritid\":0,\"kind\":0,\"userid\":0}");
                return;
            }
            return;
        }
        if (!(!this.f58293OooOOo0.isEmpty())) {
            this.f58291OooOOOo = true;
            RefreshLayout refreshLayout = this.f58294OooOOoo;
            if (refreshLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rlOnlineList");
                refreshLayout = null;
            }
            refreshLayout.setLoadSuccess(false);
            return;
        }
        ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
        RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0((Long) OooOOO.OooO00o(this.f58293OooOOo0, 1));
        if (roomUserInfoModelOooO0o0 == null) {
            return;
        }
        long jLongValue = roomUserInfoModelOooO0o0.getPriority().getValue().longValue();
        long jLongValue2 = roomUserInfoModelOooO0o0.getUserId().getValue().longValue();
        RoomLiveService roomLiveService2 = RoomLiveService.f24596OooOo00;
        if (roomLiveService2 != null) {
            roomLiveService2.OooO0oO(10055, android.support.v4.media.session.OooO0OO.OooO0O0(o00O0000.OooO00o("{\"prioritid\":", jLongValue, ",\"kind\":1,\"userid\":"), jLongValue2, "}"));
        }
    }

    @Override // p650o0ooo.o00oOoo
    public final void initData() {
        OooOO0O(true);
        LiveEventBus.get("UPDATE_ONLINE_LIST_DATA").observe(this, new o000OO(this, 1));
        LiveEventBus.get("FORBID_GUESTS_ENTER_ROOM", Boolean.TYPE).observe(this, new i());
    }

    @Override // p650o0ooo.o00oOoo, androidx.fragment.app.Oooo0, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        OooO0Oo().Oooo0O0(3);
        super.onDismiss(dialog);
    }
}

package p519o0o0O0oO;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.protobuf.room.Room;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.support.statebutton.StateButton;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.activity.room.oo0ooO;
import com.yalla.yalla.ui.view.SearchView;
import com.yalla.yalla.ui.view.UserTagView;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.ui.view.refresh.RefreshLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p022Oooo00O.o000000O;
import p028Oooo0oO.o00O0000;
import p367o0OOo0o0.OooOO0O;
import p367o0OOo0o0.Oooo000;
import p396o0Oo0O.OooOOO;
import p406o0Oo0Ooo.oOO0O0O;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class f extends o00O0O0O {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ int f52228OooOo0o = 0;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final Function1<List<RoomUserInfoModel>, Unit> f52229OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final List<RoomUserInfoModel> f52230OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f52231OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f52232OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public RecyclerView f52233OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public ArrayList<Long> f52234OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public RefreshLayout f52235OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public OooO0OO f52236OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public SearchView f52237OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public long f52238OooOo0O;

    @SourceDebugExtension({"SMAP\nOnlineListDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnlineListDialog.kt\ncom/yalla/yalla/ui/dialog/OnlineListDialog$initData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,246:1\n1549#2:247\n1620#2,3:248\n1549#2:251\n1620#2,3:252\n*S KotlinDebug\n*F\n+ 1 OnlineListDialog.kt\ncom/yalla/yalla/ui/dialog/OnlineListDialog$initData$1\n*L\n192#1:247\n192#1:248,3\n203#1:251\n203#1:252,3\n*E\n"})
    public static final class OooO implements Observer<Object> {
        public OooO() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            ArrayList<RoomUserInfoModel> arrayList = (ArrayList) obj;
            boolean z = arrayList == null || arrayList.isEmpty();
            RefreshLayout refreshLayout = null;
            f fVar = f.this;
            if (z) {
                RefreshLayout refreshLayout2 = fVar.f52235OooOOoo;
                if (refreshLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rlOnlineList");
                } else {
                    refreshLayout = refreshLayout2;
                }
                refreshLayout.OooOoOO(false, true, true);
                return;
            }
            boolean z2 = fVar.f52232OooOOOo;
            int i = fVar.f52231OooOOOO;
            if (z2) {
                fVar.f52232OooOOOo = false;
                fVar.f52234OooOOo0.clear();
                ArrayList<Long> arrayList2 = fVar.f52234OooOOo0;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                for (RoomUserInfoModel roomUserInfoModel : arrayList) {
                    ArrayList arrayList4 = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
                    com.yalla.yalla.service.room.OooO00o.OooO0o(roomUserInfoModel);
                    arrayList3.add(roomUserInfoModel.getUserId().getValue());
                }
                arrayList2.addAll(arrayList3);
                OooO0OO oooO0OO = fVar.f52236OooOo0;
                if (oooO0OO == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    oooO0OO = null;
                }
                oooO0OO.notifyDataSetChanged();
                RefreshLayout refreshLayout3 = fVar.f52235OooOOoo;
                if (refreshLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rlOnlineList");
                    refreshLayout3 = null;
                }
                refreshLayout3.OooOoOO(true, true, arrayList.size() < i);
            } else {
                OooO0OO oooO0OO2 = fVar.f52236OooOo0;
                if (oooO0OO2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    oooO0OO2 = null;
                }
                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                for (RoomUserInfoModel roomUserInfoModel2 : arrayList) {
                    ArrayList arrayList6 = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
                    com.yalla.yalla.service.room.OooO00o.OooO0o(roomUserInfoModel2);
                    arrayList5.add(Long.valueOf(roomUserInfoModel2.getUserId().getValue().longValue()));
                }
                oooO0OO2.OooO0O0(arrayList5);
                RefreshLayout refreshLayout4 = fVar.f52235OooOOoo;
                if (refreshLayout4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rlOnlineList");
                    refreshLayout4 = null;
                }
                refreshLayout4.OooOoOO(false, true, arrayList.size() < i);
            }
            RefreshLayout refreshLayout5 = fVar.f52235OooOOoo;
            if (refreshLayout5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rlOnlineList");
            } else {
                refreshLayout = refreshLayout5;
            }
            refreshLayout.OooOo00(arrayList.size() >= i);
        }
    }

    public static final class OooO00o extends Lambda implements Function1<String, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            boolean zIsBlank = StringsKt.isBlank(it);
            f fVar = f.this;
            if (zIsBlank) {
                fVar.OooOO0();
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - fVar.f52238OooOo0O > 300) {
                    fVar.f52238OooOo0O = jCurrentTimeMillis;
                    Room.InRoomUserSearchRequest.Builder builderNewBuilder = Room.InRoomUserSearchRequest.newBuilder();
                    builderNewBuilder.setPattern(it);
                    RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
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
            SearchView view = f.this.f52237OooOo00;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchView");
                view = null;
            }
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            InputMethodManager inputMethodManagerOooO00o = Oooo000.OooO00o(context);
            OooOO0O.OooO00o(view.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view.getWindowToken(), 0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends o000O<Long> {
        public OooO0OO(Context context, int i) {
            super(context, i);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            ViewHolder viewHolder = (ViewHolder) baseViewHolder;
            Long l = (Long) obj;
            if (l != null) {
                l.longValue();
                ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
                RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(l);
                if (roomUserInfoModelOooO0o0 == null || viewHolder == null) {
                    return;
                }
                o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this.f56196OooOo);
                oooO00o.OooO00o(p543o0oO0O00.OooO.OooO00o());
                oooO00o.f43911OooO0OO = OooOOO.OooO00o(roomUserInfoModelOooO0o0.getUserHeader().getValue());
                boolean z = false;
                oooO00o.f43909OooO00o = 0;
                oooO00o.OooO0Oo((ImageView) viewHolder.getView(oO00O0oO.ivUserAvatar));
                f fVar = f.this;
                FragmentActivity activity = fVar.getActivity();
                SVGAView sVGAView = (SVGAView) viewHolder.getView(oO00O0oO.svUserAvatarFrame);
                String value = roomUserInfoModelOooO0o0.getUserHeaderFrame().getValue();
                sVGAView.setImageDrawable(null);
                sVGAView.setVisibility(8);
                sVGAView.OooO0oO(false);
                if (!OooOo00.OooO00o(value) && !"/headframe/0.png".equals(value)) {
                    sVGAView.setVisibility(0);
                    sVGAView.f10172OooOooO = 0;
                    sVGAView.setImageResource(0);
                    sVGAView.OooOO0O(value, activity);
                    sVGAView.OooOO0o();
                }
                viewHolder.setGone(oO00O0oO.ivOfficials, roomUserInfoModelOooO0o0.isOfficialRole());
                UserTagView userTagView = (UserTagView) viewHolder.getView(oO00O0oO.userTagViewTop);
                UserTagView userTagView2 = (UserTagView) viewHolder.getView(oO00O0oO.userTagViewBottom);
                userTagView.setIdentityRoomOnLine(roomUserInfoModelOooO0o0.getRoomMemberType().getValue().intValue());
                userTagView.setName(oOO0O0O.OooO0O0(roomUserInfoModelOooO0o0.getUserId().getValue().longValue(), roomUserInfoModelOooO0o0.getUserName().getValue()));
                userTagView.setSex(roomUserInfoModelOooO0o0.getSex().getValue().intValue());
                userTagView.setLevel(roomUserInfoModelOooO0o0.getUserLevel().getValue().intValue());
                userTagView2.OooO0oo(roomUserInfoModelOooO0o0.getPremiumLevel().getValue().intValue(), roomUserInfoModelOooO0o0.isPremium().getValue().booleanValue());
                int iIntValue = roomUserInfoModelOooO0o0.getVipLevel().getValue().intValue();
                if (roomUserInfoModelOooO0o0.getVipState().getValue().intValue() == VipState.Vip.getValue() && roomUserInfoModelOooO0o0.getShowVIP().getValue().booleanValue()) {
                    z = true;
                }
                userTagView2.OooO0Oo(iIntValue, z, fVar.getViewLifecycleOwner());
                userTagView2.OooO0o(roomUserInfoModelOooO0o0.getHasMic().getValue().booleanValue(), roomUserInfoModelOooO0o0.getSilenced().getValue().booleanValue());
                userTagView2.setPrettyIdUser(roomUserInfoModelOooO0o0.getIdLevel().getValue().intValue());
                userTagView2.OooO(roomUserInfoModelOooO0o0.getRankWeek().getValue().intValue(), roomUserInfoModelOooO0o0.getRankDay().getValue().intValue());
                userTagView2.OooO0o0(roomUserInfoModelOooO0o0.getMedal().getValue(), fVar);
                ((ImageView) viewHolder.getView(oO00O0oO.ivSelectState)).setImageResource(fVar.OooO(roomUserInfoModelOooO0o0).getFirst().booleanValue() ? oOo00OO0.room_vote_game_select_user : oOo00OO0.room_vote_game_not_select_user);
            }
        }
    }

    @SourceDebugExtension({"SMAP\nOnlineListDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnlineListDialog.kt\ncom/yalla/yalla/ui/dialog/OnlineListDialog$initContentView$7\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,246:1\n1855#2,2:247\n*S KotlinDebug\n*F\n+ 1 OnlineListDialog.kt\ncom/yalla/yalla/ui/dialog/OnlineListDialog$initContentView$7\n*L\n154#1:247,2\n*E\n"})
    public static final class OooO0o implements Observer<Object> {
        public OooO0o() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            f fVar = f.this;
            try {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.app.base.protobuf.room.Room.UserModel>");
                fVar.f52234OooOOo0.clear();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    fVar.f52234OooOOo0.add(RoomUserInfoModel.INSTANCE.of((Room.UserModel) it.next()).getUserId().getValue());
                }
                OooO0OO oooO0OO = fVar.f52236OooOo0;
                if (oooO0OO == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    oooO0OO = null;
                }
                oooO0OO.notifyDataSetChanged();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static final class OooOO0 implements Observer<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f52244OooO0Oo = new OooOO0();

        @Override // androidx.lifecycle.Observer
        public final /* bridge */ /* synthetic */ void onChanged(Boolean bool) {
        }
    }

    public f(@NotNull ArrayList selectUsers, @NotNull oo0ooO addListener) {
        Intrinsics.checkNotNullParameter(selectUsers, "selectUsers");
        Intrinsics.checkNotNullParameter(addListener, "addListener");
        this.f52230OooOOO0 = selectUsers;
        this.f52229OooOOO = addListener;
        this.f52231OooOOOO = 50;
        this.f52234OooOOo0 = new ArrayList<>();
    }

    public final Pair<Boolean, Integer> OooO(RoomUserInfoModel roomUserInfoModel) {
        List<RoomUserInfoModel> list = this.f52230OooOOO0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getUserId().getValue().longValue() == roomUserInfoModel.getUserId().getValue().longValue()) {
                return new Pair<>(Boolean.TRUE, Integer.valueOf(i));
            }
        }
        return new Pair<>(Boolean.FALSE, 0);
    }

    @Override // p519o0o0O0oO.o00O0O0O
    public final int OooO0o0() {
        return oO00OO0O.room_dialog_online_list;
    }

    @Override // p519o0o0O0oO.o00O0O0O
    @SuppressLint({"NotifyDataSetChanged"})
    public final void OooO0oO() {
        TextView textView = this.f52551OooO0oO;
        OooO0OO oooO0OO = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvSelectNum");
            textView = null;
        }
        textView.setText("(" + this.f52230OooOOO0.size() + "/20)");
        View viewFindViewById = OooO0o().findViewById(oO00O0oO.onlineRefresh);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "viewRoot.findViewById(R.id.onlineRefresh)");
        RefreshLayout refreshLayout = (RefreshLayout) viewFindViewById;
        this.f52235OooOOoo = refreshLayout;
        if (refreshLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rlOnlineList");
            refreshLayout = null;
        }
        refreshLayout.OooOoo0(new o000000O(this));
        RefreshLayout refreshLayout2 = this.f52235OooOOoo;
        if (refreshLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rlOnlineList");
            refreshLayout2 = null;
        }
        refreshLayout2.f21330OooOooO = false;
        View viewFindViewById2 = OooO0o().findViewById(oO00O0oO.searchView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "viewRoot.findViewById(R.id.searchView)");
        SearchView searchView = (SearchView) viewFindViewById2;
        this.f52237OooOo00 = searchView;
        if (searchView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchView");
            searchView = null;
        }
        View view = searchView.f30648OooO0o;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewLine");
            view = null;
        }
        view.setVisibility(0);
        SearchView searchView2 = this.f52237OooOo00;
        if (searchView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchView");
            searchView2 = null;
        }
        searchView2.setSearchTextChangedListener(new OooO00o());
        SearchView searchView3 = this.f52237OooOo00;
        if (searchView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchView");
            searchView3 = null;
        }
        searchView3.setSearchClickListener(new OooO0O0());
        View viewFindViewById3 = OooO0o().findViewById(oO00O0oO.onlineList);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "viewRoot.findViewById(R.id.onlineList)");
        this.f52233OooOOo = (RecyclerView) viewFindViewById3;
        this.f52236OooOo0 = new OooO0OO(getContext(), oO00OO0O.room_item_online_list);
        View view2 = new View(getContext());
        view2.setLayoutParams(new ViewGroup.LayoutParams(-1, 1));
        OooO0OO oooO0OO2 = this.f52236OooOo0;
        if (oooO0OO2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO2 = null;
        }
        oooO0OO2.OooOo0(view2);
        OooO0OO oooO0OO3 = this.f52236OooOo0;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO3 = null;
        }
        oooO0OO3.OooOooO(false);
        OooO0OO oooO0OO4 = this.f52236OooOo0;
        if (oooO0OO4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO4 = null;
        }
        oooO0OO4.f10105OooOOO = true;
        oooO0OO4.f10107OooOOOO = true;
        OooO0OO oooO0OO5 = this.f52236OooOo0;
        if (oooO0OO5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO5 = null;
        }
        oooO0OO5.f10098OooO0o = new BaseQuickAdapter.OooO0o() { // from class: o0o0O0oO.d
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
            public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view3, int i) {
                f this$0 = this.f52192OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ArrayList arrayList = OooO00o.f24973OooO00o;
                Object obj = baseQuickAdapter.f10111OooOOoo.get(i);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Long");
                RoomUserInfoModel roomUserInfoModelOooO0o0 = OooO00o.OooO0o0((Long) obj);
                if (roomUserInfoModelOooO0o0 == null) {
                    return;
                }
                Pair<Boolean, Integer> pairOooO = this$0.OooO(roomUserInfoModelOooO0o0);
                boolean zBooleanValue = pairOooO.getFirst().booleanValue();
                List<RoomUserInfoModel> list = this$0.f52230OooOOO0;
                if (zBooleanValue) {
                    list.remove(pairOooO.getSecond().intValue());
                } else {
                    if (list.size() >= 20) {
                        String strOooO0OO = o0000.OooO0OO(oO00OOo0.room_vote_game_master_select_ten_user);
                        if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
                            return;
                        }
                        o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                            return;
                        } else {
                            o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                            return;
                        }
                    }
                    list.add(roomUserInfoModelOooO0o0);
                }
                TextView textView2 = this$0.f52551OooO0oO;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvSelectNum");
                    textView2 = null;
                }
                textView2.setText("(" + list.size() + "/20)");
                baseQuickAdapter.notifyItemChanged(i);
            }
        };
        RecyclerView recyclerView = this.f52233OooOOo;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvOnlineList");
            recyclerView = null;
        }
        recyclerView.setNestedScrollingEnabled(false);
        RecyclerView recyclerView2 = this.f52233OooOOo;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvOnlineList");
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(new FixLinearLayoutManager(getContext()));
        RecyclerView recyclerView3 = this.f52233OooOOo;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvOnlineList");
            recyclerView3 = null;
        }
        OooO0OO oooO0OO6 = this.f52236OooOo0;
        if (oooO0OO6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            oooO0OO = oooO0OO6;
        }
        recyclerView3.setAdapter(oooO0OO);
        OooOO0();
        ((StateButton) OooO0o().findViewById(oO00O0oO.btConfirm)).setOnClickListener(new View.OnClickListener() { // from class: o0o0O0oO.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                f this$0 = this.f52207OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f52229OooOOO.invoke(this$0.f52230OooOOO0);
                this$0.dismiss();
            }
        });
        LiveEventBus.get("SEARCH_ONLINE_USER").observe(this, new OooO0o());
    }

    @Override // p519o0o0O0oO.o00O0O0O
    public final void OooO0oo(int i, @NotNull View bottomSheet) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void OooOO0() {
        ArrayList<Long> arrayList = new ArrayList<>();
        this.f52234OooOOo0 = arrayList;
        arrayList.addAll(com.yalla.yalla.service.room.OooO00o.f24981OooOO0.f47414OooO0OO);
        OooO0OO oooO0OO = this.f52236OooOo0;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        oooO0OO.OooOoO0(this.f52234OooOOo0);
    }

    public final void OooOO0O(boolean z) {
        this.f52232OooOOOo = z;
        if (z) {
            RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oO(10055, "{\"prioritid\":0,\"kind\":0,\"userid\":0}");
                return;
            }
            return;
        }
        if (!(!this.f52234OooOOo0.isEmpty())) {
            this.f52232OooOOOo = true;
            RefreshLayout refreshLayout = this.f52235OooOOoo;
            if (refreshLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rlOnlineList");
                refreshLayout = null;
            }
            refreshLayout.setLoadSuccess(false);
            return;
        }
        ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
        RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0((Long) p018OooOoo0.OooOOO.OooO0O0(this.f52234OooOOo0, 1));
        if (roomUserInfoModelOooO0o0 == null) {
            return;
        }
        long jLongValue = roomUserInfoModelOooO0o0.getPriority().getValue().longValue();
        long jLongValue2 = roomUserInfoModelOooO0o0.getUserId().getValue().longValue();
        RoomLiveService roomLiveService2 = RoomLiveService.f25058OooOo00;
        if (roomLiveService2 != null) {
            roomLiveService2.OooO0oO(10055, android.support.v4.media.session.OooO0o.OooO0O0(o00O0000.OooO00o("{\"prioritid\":", jLongValue, ",\"kind\":1,\"userid\":"), jLongValue2, "}"));
        }
    }

    @Override // p519o0o0O0oO.o00O0O0O
    public final void initData() {
        OooOO0O(true);
        LiveEventBus.get("UPDATE_ONLINE_LIST_DATA").observe(this, new OooO());
        LiveEventBus.get("FORBID_GUESTS_ENTER_ROOM", Boolean.TYPE).observe(this, OooOO0.f52244OooO0Oo);
    }

    @Override // p519o0o0O0oO.o00O0O0O, androidx.fragment.app.OooOo, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        OooO0Oo().Oooo0O0(3);
        super.onDismiss(dialog);
    }
}

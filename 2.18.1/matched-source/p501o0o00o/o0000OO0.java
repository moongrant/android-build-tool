package p501o0o00o;

import android.os.Looper;
import androidx.lifecycle.Observer;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.model.WeeklyStarModel;
import com.yalla.yalla.common.ui.view.DotView;
import com.yalla.yalla.common.ui.view.refresh.RefreshLayout;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.model.MomentSendModel;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.account.UntieAccountBindActivity;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import com.yalla.yalla.ui.activity.moment.UserPostListActivity;
import com.yalla.yalla.ui.fragment.FriendListFragment;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p142o00OOooO.o0000O;
import p169o00Ooo00.OooOOOO;
import p188o00o00o0.OooO0OO;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p507o0o00oOO.o0000O0;
import p515o0o0O00.o00O00;
import p524o0o0O0oO.o0O0000O;
import p530o0o0OOO.o00O;
import p579o0oOoOOo.j;
import p649o0ooOOoo.wa;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000OO0 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f41457OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f41458OooO0O0;

    public /* synthetic */ o0000OO0(Object obj, int i) {
        this.f41457OooO00o = i;
        this.f41458OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        wa waVar = null;
        RefreshLayout refreshLayout = null;
        switch (this.f41457OooO00o) {
            case 0:
                o000 this$0 = (o000) this.f41458OooO0O0;
                WeeklyStarModel weeklyStarModel = (WeeklyStarModel) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (weeklyStarModel != null) {
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.ActivityNotice);
                    webPageInfo.f21221OoooO00 = false;
                    webPageInfo.OooO0OO(weeklyStarModel.getWeekStarsTitle());
                    webPageInfo.OooO0Oo(weeklyStarModel.getWeekStarsUrl());
                    webPageInfo.f21218Oooo0oo = weeklyStarModel.getShopType();
                    o0000O0 o0000o1 = o0000O0.f41691OooO00o;
                    webPageInfo.f21225OoooOOo = o0000O0.f41715OooOoO0;
                    Function1<? super WebPageInfo, Unit> function1 = this$0.f41399OooOO0o;
                    if (function1 != null) {
                        function1.invoke(webPageInfo);
                    }
                }
                break;
            case 1:
                o0O0000O this$1 = (o0O0000O) this.f41458OooO0O0;
                Boolean it = (Boolean) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                wa waVar2 = this$1.f43025OooO0oo;
                if (waVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bindingDrawer");
                } else {
                    waVar = waVar2;
                }
                DotView dotView = waVar.f50875OooO0o.f50940OooO0o0;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                dotView.OooO0OO(it.booleanValue());
                break;
            case 2:
                UntieAccountBindActivity this$2 = (UntieAccountBindActivity) this.f41458OooO0O0;
                Boolean it2 = (Boolean) obj;
                int i = UntieAccountBindActivity.f21887OooooOO;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                if (it2.booleanValue()) {
                    this$2.OooOooO();
                }
                break;
            case 3:
                ShareToFriendsActivity this$3 = (ShareToFriendsActivity) this.f41458OooO0O0;
                Boolean it3 = (Boolean) obj;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                Intrinsics.checkNotNullExpressionValue(it3, "it");
                if (it3.booleanValue()) {
                    String strOooO0OO = OooOOO.OooO0OO(R.string.has_share_friends);
                    ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                        o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O0.run();
                        } else {
                            o00O000 o00o001 = o00O000.f34346OooO00o;
                            o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                        }
                    }
                }
                this$3.finish();
                break;
            case 4:
                UserPostListActivity this$4 = (UserPostListActivity) this.f41458OooO0O0;
                MomentSendModel momentSendModel = (MomentSendModel) obj;
                UserPostListActivity.OooO00o oooO00o = UserPostListActivity.f22674Ooooooo;
                Intrinsics.checkNotNullParameter(this$4, "this$0");
                o00O00.OooO0O0("动态任务 删除 刷新 ");
                if (o0000O.OooO00o(p498o0o00Oo0.OooOOO.f41216OooO00o, this$4.f22677Ooooo0o)) {
                    OooOOOO oooOOOO = OooOOOO.f32671OooO00o;
                    int iOooO0O0 = OooOOOO.OooO0O0(this$4.OooOooo().getData(), momentSendModel);
                    if (iOooO0O0 > -1 && iOooO0O0 < this$4.OooOooo().getData().size()) {
                        this$4.OooOooo().remove(iOooO0O0);
                        break;
                    }
                }
                break;
            case 5:
                j this$5 = (j) this.f41458OooO0O0;
                int i2 = j.f45965OooooO0;
                Intrinsics.checkNotNullParameter(this$5, "this$0");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Pair<java.util.ArrayList<com.yalla.yalla.model.RoomUserInfoModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.yalla.yalla.model.RoomUserInfoModel> }, kotlin.Int>");
                Pair pair = (Pair) obj;
                if (this$5.f45968OoooOOO) {
                    this$5.f45968OoooOOO = false;
                    this$5.f45969OoooOOo.clear();
                    ArrayList<Long> arrayList = this$5.f45969OoooOOo;
                    Iterable<RoomUserInfoModel> iterable = (Iterable) pair.getFirst();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                    for (RoomUserInfoModel roomUserInfoModel : iterable) {
                        o00O.f43140OooO00o.OooOO0o(roomUserInfoModel.getUserId(), roomUserInfoModel);
                        arrayList2.add(Long.valueOf(roomUserInfoModel.getUserId()));
                    }
                    arrayList.addAll(arrayList2);
                    OooO0OO<Long> oooO0OO = this$5.f45973Ooooo00;
                    if (oooO0OO == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        oooO0OO = null;
                    }
                    oooO0OO.notifyDataSetChanged();
                    RefreshLayout refreshLayout2 = this$5.f45971OoooOoO;
                    if (refreshLayout2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rlOnlineList");
                        refreshLayout2 = null;
                    }
                    refreshLayout2.Oooo00o(true, true, ((ArrayList) pair.getFirst()).size() < this$5.f45975o000oOoO);
                } else {
                    OooO0OO<Long> oooO0OO2 = this$5.f45973Ooooo00;
                    if (oooO0OO2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        oooO0OO2 = null;
                    }
                    Iterable<RoomUserInfoModel> iterable2 = (Iterable) pair.getFirst();
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
                    for (RoomUserInfoModel roomUserInfoModel2 : iterable2) {
                        o00O.f43140OooO00o.OooOO0o(roomUserInfoModel2.getUserId(), roomUserInfoModel2);
                        arrayList3.add(Long.valueOf(roomUserInfoModel2.getUserId()));
                    }
                    oooO0OO2.addData(arrayList3);
                    RefreshLayout refreshLayout3 = this$5.f45971OoooOoO;
                    if (refreshLayout3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rlOnlineList");
                        refreshLayout3 = null;
                    }
                    refreshLayout3.Oooo00o(false, true, ((ArrayList) pair.getFirst()).size() < this$5.f45975o000oOoO);
                }
                RefreshLayout refreshLayout4 = this$5.f45971OoooOoO;
                if (refreshLayout4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rlOnlineList");
                } else {
                    refreshLayout = refreshLayout4;
                }
                refreshLayout.OooOoOO(((ArrayList) pair.getFirst()).size() >= this$5.f45975o000oOoO);
                break;
            case 6:
                FriendListFragment.m329initData$lambda0((FriendListFragment) this.f41458OooO0O0, obj);
                break;
            default:
                MainRoomFragment.m454initObserver$lambda8((MainRoomFragment) this.f41458OooO0O0, (Boolean) obj);
                break;
        }
    }
}

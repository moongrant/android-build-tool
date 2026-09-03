package p142o00OOooO;

import android.app.NotificationManager;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.app.base.fragment.MainMomentFragment;
import com.app.base.view.FacePanelView;
import com.app.base.view.HeaderLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.support.common.util.OooOo00;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.model.MomentChangeUserIsInRoomModel;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.data.db.model.SearchHistoryTable;
import com.yalla.yalla.model.GifListJson;
import com.yalla.yalla.model.GiftPropModel;
import com.yalla.yalla.ui.activity.account.LoginOnRoomDialogActivity;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.adapter.PrivateChatAdapter;
import com.yalla.yalla.ui.fragment.BadgeFragment;
import com.yalla.yalla.ui.fragment.UserNewPostFragment;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p031OoooO.o0000O;
import p047Oooooo0.o00OO0OO;
import p497o0o00Oo.OooOOO0;
import p498o0o00Oo0.OooOOO;
import p538o0o0Oo0.ooo0Oo0;
import p579o0oOoOOo.oOOO00Oo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000O00 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31928OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31929OooO0O0;

    public /* synthetic */ o0000O00(Object obj, int i) {
        this.f31928OooO00o = i;
        this.f31929OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        ImageView f12043o00000;
        ImageView f12043o00001;
        UserPremiumView f12046o000000o;
        int i = 0;
        switch (this.f31928OooO00o) {
            case 0:
                MainMomentFragment.m31initObserver$lambda12((MainMomentFragment) this.f31929OooO0O0, (Integer) obj);
                break;
            case 1:
                FacePanelView this$0 = (FacePanelView) this.f31929OooO0O0;
                List<GifListJson> list = (List) obj;
                int i2 = FacePanelView.f11954OoooOo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (list != null) {
                    if (this$0.f11966o000oOoO.size() > 2) {
                        o00OO0OO<FacePanelView.OooO0O0> o00oo0oo = this$0.f11966o000oOoO;
                        o00oo0oo.OooO0oO(2, o00oo0oo.size());
                        o00OO0OO<FacePanelView.OooO0OO> o00oo0oo2 = this$0.f11965OoooOOo;
                        o00oo0oo2.OooO0oO(2, o00oo0oo2.size());
                    }
                    if (this$0.f11966o000oOoO.size() <= 2) {
                        for (GifListJson gifListJson : list) {
                            this$0.f11965OoooOOo.add(new FacePanelView.OooO0OO(3, CloudImageUtilKt.imgFormat(StringsKt.removePrefix(gifListJson.getFolderName(), (CharSequence) "/")) + gifListJson.getFolderIcon(), gifListJson.getBuyType()));
                            FacePanelView.OooO0O0 oooO0O0 = new FacePanelView.OooO0O0(3, new MutableLiveData(gifListJson));
                            this$0.f11966o000oOoO.add(oooO0O0);
                            this$0.f11963OoooOO0.put(Integer.valueOf(gifListJson.getCatalogId()), oooO0O0);
                        }
                    }
                }
                break;
            case 2:
                LoginOnRoomDialogActivity this$1 = (LoginOnRoomDialogActivity) this.f31929OooO0O0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.finish();
                break;
            case 3:
                PrivateChatActivity this$2 = (PrivateChatActivity) this.f31929OooO0O0;
                UserInfo userInfo = (UserInfo) obj;
                PrivateChatActivity.OooO00o oooO00o = PrivateChatActivity.f22166o00oO0o;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                if (userInfo != null) {
                    Intrinsics.checkNotNullParameter("Yalla_Notice_FriendRequest", ViewHierarchyConstants.TAG_KEY);
                    Context context = o0000O.f2657OooO00o;
                    if (context == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(d.R);
                        context = null;
                    }
                    Object systemService = context.getSystemService("notification");
                    Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                    ((NotificationManager) systemService).cancel("Yalla_Notice_FriendRequest", 0);
                    HeaderLayout headerLayout = this$2.f11463OoooO;
                    if (headerLayout != null && (f12046o000000o = headerLayout.getF12046o000000o()) != null) {
                        f12046o000000o.OooO0Oo(userInfo.isPremium(), userInfo.getPremiumLevel());
                    }
                    PrivateChatAdapter privateChatAdapterOooo0 = this$2.Oooo0();
                    Objects.requireNonNull(privateChatAdapterOooo0);
                    Intrinsics.checkNotNullParameter(userInfo, "userInfo");
                    privateChatAdapterOooo0.f23639OooOOoo = userInfo;
                    if (userInfo.getVipLevel() > VipLevel.Vip0.getValue()) {
                        HeaderLayout headerLayout2 = this$2.f11463OoooO;
                        f12043o00000 = headerLayout2 != null ? headerLayout2.getF12043o00000() : null;
                        if (f12043o00000 != null) {
                            f12043o00000.setVisibility(0);
                        }
                        HeaderLayout headerLayout3 = this$2.f11463OoooO;
                        if (headerLayout3 != null && (f12043o00001 = headerLayout3.getF12043o00000()) != null) {
                            f12043o00001.setImageResource(VipLevel.INSTANCE.OooO00o(userInfo.getVipLevel()));
                        }
                    } else {
                        HeaderLayout headerLayout4 = this$2.f11463OoooO;
                        f12043o00000 = headerLayout4 != null ? headerLayout4.getF12043o00000() : null;
                        if (f12043o00000 != null) {
                            f12043o00000.setVisibility(8);
                        }
                    }
                    if (OooO0OO.OooO00o(userInfo)) {
                        this$2.f22182o00o0O.setUserHeader("");
                    } else {
                        float f = 24;
                        this$2.f22182o00o0O.setUserHeader(CloudImageUtilKt.imgSize(userInfo.getUserHeader(), OooOo00.OooO00o(f), OooOo00.OooO00o(f)));
                    }
                    HeaderLayout headerLayout5 = this$2.f11463OoooO;
                    if (headerLayout5 != null) {
                        headerLayout5.setYallaVisible(userInfo.isOfficialRole());
                    }
                    this$2.Oooo0OO().checkIsFriendAndBlock(userInfo.getUserId());
                    break;
                }
                break;
            case 4:
                TopicSearchActivity this$3 = (TopicSearchActivity) this.f31929OooO0O0;
                List<SearchHistoryTable> it = (List) obj;
                TopicSearchActivity.OooO00o oooO00o2 = TopicSearchActivity.f22654OooooOo;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                Group group = this$3.OooOooo().f50362OooO0OO;
                Intrinsics.checkNotNullExpressionValue(group, "recommendHeaderView.groupSearch");
                Intrinsics.checkNotNullExpressionValue(it, "it");
                o00O0O.OooO0oO(group, true ^ it.isEmpty());
                this$3.OooOooo().f50361OooO0O0.removeAllViews();
                for (SearchHistoryTable searchHistoryTable : it) {
                    View viewInflate = View.inflate(this$3, R.layout.tv_search_history, null);
                    Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(this, R.layout.tv_search_history, null)");
                    RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.tag_item_relative);
                    View childAt = relativeLayout.getChildAt(0);
                    Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
                    ((TextView) childAt).setText(searchHistoryTable.getTag());
                    relativeLayout.setOnClickListener(new ooo0Oo0(this$3, i));
                    this$3.OooOooo().f50361OooO0O0.addView(relativeLayout);
                }
                break;
            case 5:
                UserInfoActivity this$4 = (UserInfoActivity) this.f31929OooO0O0;
                Integer num = (Integer) obj;
                UserInfoActivity.OooO00o oooO00o3 = UserInfoActivity.f23452o0ooOO0;
                Intrinsics.checkNotNullParameter(this$4, "this$0");
                if (o0000O.OooO00o(OooOOO.f41216OooO00o, this$4.f23456OooooO0)) {
                    if (num != null && num.intValue() == 1) {
                        this$4.Oooo00o().f50399OooO0Oo.f49988OooO0Oo.f50047OooOO0O.setVisibility(0);
                        this$4.Oooo00o().f50399OooO0Oo.f49988OooO0Oo.f50047OooOO0O.setImageResource(R.drawable.me_top_icon_male);
                    } else if (num != null && num.intValue() == 0) {
                        this$4.Oooo00o().f50399OooO0Oo.f49988OooO0Oo.f50047OooOO0O.setVisibility(0);
                        this$4.Oooo00o().f50399OooO0Oo.f49988OooO0Oo.f50047OooOO0O.setImageResource(R.drawable.me_top_icon_female);
                    } else {
                        this$4.Oooo00o().f50399OooO0Oo.f49988OooO0Oo.f50047OooOO0O.setVisibility(8);
                    }
                }
                break;
            case 6:
                oOOO00Oo this$5 = (oOOO00Oo) this.f31929OooO0O0;
                List<GiftPropModel> list2 = (List) obj;
                Intrinsics.checkNotNullParameter(this$5, "this$0");
                if (list2 == null || list2.isEmpty()) {
                    this$5.f46125OoooOO0.setNewData(null);
                } else {
                    Iterator<GiftPropModel> it2 = list2.iterator();
                    int i3 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            int giftId = it2.next().getGiftId();
                            OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
                            if (!(giftId == OooOOO0.OooO0oO().OooOOO())) {
                                i3++;
                            }
                        } else {
                            i3 = -1;
                        }
                    }
                    i = i3 >= 0 ? i3 : 0;
                    OooOOO0 oooOOO1 = OooOOO0.f41180OooO00o;
                    OooOOO0.OooO0oO().OooOo0o(list2.get(i).getGiftId());
                    OooOOO0.OooO0oO().OooOo0(list2.get(i).getPrice());
                    this$5.f46125OoooOO0.setNewData(list2);
                    this$5.OooOO0O().f49589OooOO0o.scrollToPosition(i);
                    this$5.OooOO0O().f49580OooO0O0.setText(String.valueOf(OooOOO0.OooO0oO().OooOO0o() * ((long) OooOOO0.OooO0oO().OooOOO0())));
                }
                break;
            case 7:
                BadgeFragment.m309initView$lambda1((BadgeFragment) this.f31929OooO0O0, (Integer) obj);
                break;
            default:
                UserNewPostFragment.m428initObserver$lambda1((UserNewPostFragment) this.f31929OooO0O0, (MomentChangeUserIsInRoomModel) obj);
                break;
        }
    }
}

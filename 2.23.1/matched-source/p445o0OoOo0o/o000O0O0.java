package p445o0OoOo0o;

import android.content.Context;
import android.widget.Switch;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import androidx.viewpager2.widget.ViewPager2;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O;
import com.code.android.util.o0OoOo0;
import com.yalla.android.videoplayer.view.VideoView;
import com.yalla.yalla.mixedroom.roomcenter.RoomFrameUIController;
import com.yalla.yalla.model.CategoryModel;
import com.yalla.yalla.ui.activity.main.NoticeSettingActivity;
import com.yalla.yalla.ui.activity.room.ExploreTagRoomListActivity;
import com.yalla.yalla.ui.fragment.ExploreTagRoomListFragment;
import com.yalla.yalla.ui.screen.user.FollowingScreen;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import com.yalla.yalla.ui.vm.user.FollowingVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import o0OOo000.OooO00o;
import o0OOo000.OooO0O0;
import o0OOo000.OooOO0;
import p037OoooOo0.o000O0o;
import p561o0oOOooo.a;
import p565o0oOo000.o0ooOOo;
import p596o0oo000O.OooO0o;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000O0O0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47291OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f47292OooO0o0;

    public /* synthetic */ o000O0O0(Object obj, int i) {
        this.f47291OooO0Oo = i;
        this.f47292OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object it) {
        int i;
        StringBuilder sbOooO0O0;
        int i2 = this.f47291OooO0Oo;
        Object obj = this.f47292OooO0o0;
        switch (i2) {
            case 0:
                RoomFrameUIController this$0 = (RoomFrameUIController) obj;
                String str = (String) it;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                VideoView videoView = this$0.f23098OooO0Oo;
                if (videoView != null) {
                    o000O.OooOOOO(videoView);
                }
                Intrinsics.checkNotNull(str);
                OooOO0 oooOO1 = new OooOO0(str);
                OooO0O0 oooO0O0 = this$0.f23099OooO0o;
                oooO0O0.OooO00o(oooOO1);
                OooO00o oooO00o = oooO0O0.f43006OooO00o;
                if (oooO00o != null) {
                    oooO00o.OooO0Oo();
                }
                break;
            case 1:
                NoticeSettingActivity this$1 = (NoticeSettingActivity) obj;
                Boolean bool = (Boolean) it;
                int i3 = NoticeSettingActivity.f24975OooOo0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOo0();
                Switch r0 = this$1.OooOo().f45569OooO0OO.getViews().f43938OooO0o0;
                Intrinsics.checkNotNull(bool);
                r0.setChecked(bool.booleanValue());
                break;
            case 2:
                ExploreTagRoomListActivity this$2 = (ExploreTagRoomListActivity) obj;
                int i4 = ExploreTagRoomListActivity.f26096OooOoOO;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                List listAsMutableList = TypeIntrinsics.asMutableList(it);
                this$2.f26100OooOo00.clear();
                ArrayList arrayList = this$2.f26099OooOo0;
                arrayList.clear();
                ArrayList arrayList2 = this$2.f26101OooOo0O;
                arrayList2.clear();
                if (listAsMutableList.size() > 0) {
                    int size = listAsMutableList.size();
                    i = 0;
                    for (int i5 = 0; i5 < size; i5++) {
                        if (this$2.f26098OooOo == o0OoOo0.OooO0o(0, ((CategoryModel) listAsMutableList.get(i5)).id)) {
                            this$2.OooOo00(((CategoryModel) listAsMutableList.get(i5)).labelname);
                            i = i5;
                        }
                        if (OooO0o.OooO0o0()) {
                            sbOooO0O0 = o000O0o.OooO0O0(((CategoryModel) listAsMutableList.get(i5)).labelname, "#");
                        } else {
                            String str2 = ((CategoryModel) listAsMutableList.get(i5)).labelname;
                            StringBuilder sb = new StringBuilder("#");
                            sb.append(str2);
                            sbOooO0O0 = sb;
                        }
                        arrayList.add(sbOooO0O0.toString());
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            Result.m4215constructorimpl(Boolean.valueOf(arrayList2.add(new ExploreTagRoomListFragment(o0OoOo0.OooO0o(0, ((CategoryModel) listAsMutableList.get(i5)).id)))));
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            Result.m4215constructorimpl(ResultKt.createFailure(th));
                        }
                    }
                    ConstraintLayout topLayout = this$2.OooOo().f44749OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(topLayout, "topLayout");
                    o000O.OooOOOO(topLayout);
                    this$2.f26100OooOo00.addAll(listAsMutableList);
                } else {
                    ConstraintLayout topLayout2 = this$2.OooOo().f44749OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(topLayout2, "topLayout");
                    o000O.OooO0O0(topLayout2);
                    i = 0;
                }
                Context context = this$2.OooOo().f44751OooO0o0.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                a.OooO00o oooO00o2 = new a.OooO00o(context);
                oooO00o2.OooO0O0(arrayList);
                oooO00o2.f56182OooO0o0 = o0000.OooO00o(o0ooOOo.color_333333);
                oooO00o2.f56184OooO0oo = o0000.OooO00o(o0ooOOo.color_999999);
                float f = 8;
                oooO00o2.f56197OooOo0O = o0000O0.OooO00o(f);
                oooO00o2.f56180OooO0Oo = 15.0f;
                oooO00o2.f56179OooO0OO = 15.0f;
                oooO00o2.f56195OooOo0 = o0000O0.OooO00o(f);
                oooO00o2.f56184OooO0oo = o0000.OooO00o(o0ooOOo.color_alpha_38_A3);
                ViewPager2 vpMoreRoom = this$2.OooOo().f44751OooO0o0;
                Intrinsics.checkNotNullExpressionValue(vpMoreRoom, "vpMoreRoom");
                oooO00o2.OooO0OO(vpMoreRoom);
                oooO00o2.f56176OooO = o0000O0.OooO00o(2);
                oooO00o2.f56185OooOO0 = o0000.OooO00o(o0ooOOo.color_00d8c9);
                oooO00o2.f56186OooOO0O = o0000O0.OooO00o(11);
                oooO00o2.f56187OooOO0o = o0000O0.OooO00o(3);
                oooO00o2.f56177OooO00o.setAdjustMode(false);
                YlTableLayout ylMoreRoom = this$2.OooOo().f44750OooO0o;
                Intrinsics.checkNotNullExpressionValue(ylMoreRoom, "ylMoreRoom");
                oooO00o2.OooO00o(ylMoreRoom);
                this$2.OooOo().f44751OooO0o0.setOffscreenPageLimit(arrayList2.size());
                this$2.OooOo().f44751OooO0o0.setAdapter(this$2.f26104OooOoO0);
                this$2.OooOo().f44751OooO0o0.setCurrentItem(i);
                break;
            default:
                FollowingScreen.InitObservers$lambda$6((FollowingVM) obj, ((Long) it).longValue());
                break;
        }
    }
}

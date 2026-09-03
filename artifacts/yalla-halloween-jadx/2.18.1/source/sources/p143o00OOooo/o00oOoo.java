package p143o00OOooo;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.app.base.fragment.room.RoomInfoMemberListFragment;
import com.app.base.view.dialog.RoomMoraGameListDialog;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.UserPostListActivity;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import com.yalla.yalla.ui.view.AddedTopicHeadView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o00OOO.OooO00o;
import p168o00Ooo0.o0O0O00;
import p254o00ooO0O.o000O0O0;
import p522o0o0O0o.oo0o0O0;
import p530o0o0OOO.o00OOO00;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00oOoo implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32030OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32031OooO0O0;

    public /* synthetic */ o00oOoo(Object obj, int i) {
        this.f32030OooO00o = i;
        this.f32031OooO0O0 = obj;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        boolean z = false;
        switch (this.f32030OooO00o) {
            case 0:
                RoomInfoMemberListFragment.m52initObserve$lambda16((RoomInfoMemberListFragment) this.f32031OooO0O0, (Long) obj);
                break;
            case 1:
                RoomMoraGameListDialog this$0 = (RoomMoraGameListDialog) this.f32031OooO0O0;
                o00OOO00 o00ooo01 = (o00OOO00) obj;
                int i = RoomMoraGameListDialog.f12160OoooOo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                XRefreshLayout xRefreshLayout = this$0.f12163OoooO0O;
                boolean z2 = o00ooo01.f43384OooO0O0;
                if (!z2 && o00ooo01.f43385OooO0OO) {
                    z = true;
                }
                xRefreshLayout.Oooo0o0(z2, true, z);
                break;
            case 2:
                UserPostListActivity this$1 = (UserPostListActivity) this.f32031OooO0O0;
                Response response = (Response) obj;
                UserPostListActivity.OooO00o oooO00o = UserPostListActivity.f22674Ooooooo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (response.getIsSuccess()) {
                    this$1.OooOooO().setVisibility(8);
                    if (response.getData() != null) {
                        Object data = response.getData();
                        Intrinsics.checkNotNull(data);
                        if (true ^ ((Collection) data).isEmpty()) {
                            AddedTopicHeadView addedTopicHeadViewOooOooO = this$1.OooOooO();
                            String str = this$1.f22677Ooooo0o;
                            List list = (List) response.getData();
                            addedTopicHeadViewOooOooO.OooO00o();
                            addedTopicHeadViewOooOooO.f24763Oooo0oO = str;
                            addedTopicHeadViewOooOooO.f24764Oooo0oo.clear();
                            List<TopicInfoModel> list2 = addedTopicHeadViewOooOooO.f24764Oooo0oo;
                            ArrayList arrayList = new ArrayList();
                            if (list != null) {
                                arrayList.addAll(list);
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int size = arrayList.size();
                            for (int i2 = 0; i2 < size && i2 < 3; i2++) {
                                arrayList2.add(arrayList.get(i2));
                            }
                            list2.addAll(arrayList2);
                            if (addedTopicHeadViewOooOooO.f24764Oooo0oo.isEmpty()) {
                                addedTopicHeadViewOooOooO.setVisibility(8);
                            } else {
                                int size2 = addedTopicHeadViewOooOooO.f24764Oooo0oo.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    TopicInfoModel topicInfoModel = addedTopicHeadViewOooOooO.f24764Oooo0oo.get(i3);
                                    AddedTopicHeadView.OooO00o oooO00o2 = addedTopicHeadViewOooOooO.f24761Oooo.get(i3);
                                    if (topicInfoModel != null && oooO00o2 != null) {
                                        ConstraintLayout constraintLayout = oooO00o2.f24766OooO00o;
                                        Intrinsics.checkNotNull(constraintLayout);
                                        constraintLayout.setVisibility(0);
                                        oO0O00.OooO00o oooO00o3 = new oO0O00.OooO00o(addedTopicHeadViewOooOooO.getContext());
                                        oooO00o3.OooO00o(OooO00o.OooO0o());
                                        oooO00o3.f48441OooOOOo = R.drawable.icon_head_default_circular;
                                        oooO00o3.f48431OooO0o = R.drawable.icon_head_default_circular;
                                        oooO00o3.OooO0oO(addedTopicHeadViewOooOooO.f24762Oooo0o);
                                        oooO00o3.f48429OooO0OO = topicInfoModel.getImage();
                                        oooO00o3.f48427OooO00o = 0;
                                        oooO00o3.OooO0o(oooO00o2.f24767OooO0O0);
                                        if (OooO0OO.OooO0O0(topicInfoModel.getName())) {
                                            TextView textView = oooO00o2.f24768OooO0OO;
                                            Intrinsics.checkNotNull(textView);
                                            textView.setVisibility(0);
                                            oooO00o2.f24768OooO0OO.setText(topicInfoModel.getName());
                                            Drawable drawableOooO0O0 = topicInfoModel.isOwner() ? o000O0O0.OooO0O0(R.drawable.ic_topic_owner) : null;
                                            if (topicInfoModel.isManager()) {
                                                drawableOooO0O0 = OooOOO.OooO0O0(R.drawable.ic_topic_manager);
                                            }
                                            oo0o0O0.OooO0oO(oooO00o2.f24768OooO0OO, drawableOooO0O0);
                                        }
                                        if (OooO0OO.OooO0O0(Integer.valueOf(topicInfoModel.getJoinNum()))) {
                                            TextView textView2 = oooO00o2.f24769OooO0Oo;
                                            Intrinsics.checkNotNull(textView2);
                                            textView2.setVisibility(0);
                                            oooO00o2.f24769OooO0Oo.setText(o0O0O00.OooO0oO(topicInfoModel.getJoinNum(), false) + "");
                                        }
                                    }
                                }
                            }
                            this$1.OooOooO().setVisibility(0);
                        }
                    }
                }
                break;
            default:
                WalletActivity this$2 = (WalletActivity) this.f32031OooO0O0;
                long jLongValue = ((Long) obj).longValue();
                WalletActivity.OooO00o oooO00o4 = WalletActivity.f23268OoooooO;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                if (this$2.f23273OooooOO == 0.0d) {
                    this$2.OooOoo().f48971OooO0oO.setText(o0O0O00.OooO0Oo(jLongValue + ""));
                }
                break;
        }
    }
}

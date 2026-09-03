package p540o0o0Oo0;

import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.app.base.view.HeaderLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.TopicBlackUserModel;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p189o00o00o0.OooO0OO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O0000O implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f44005OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f44006OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Object f44007OooO0OO;

    public /* synthetic */ o0O0000O(boolean z, Object obj, int i) {
        this.f44005OooO00o = i;
        this.f44006OooO0O0 = z;
        this.f44007OooO0OO = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        TextView f12058o00000;
        switch (this.f44005OooO00o) {
            case 0:
                boolean z = this.f44006OooO0O0;
                TopicBlackListActivity this$0 = (TopicBlackListActivity) this.f44007OooO0OO;
                Response response = (Response) obj;
                int i = TopicBlackListActivity.f22558OoooooO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooO0OO<TopicBlackUserModel> oooO0OO = null;
                if (response.getIsSuccess()) {
                    if (z) {
                        OooO0OO<TopicBlackUserModel> oooO0OO2 = this$0.f22561OooooOo;
                        if (oooO0OO2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                            oooO0OO2 = null;
                        }
                        oooO0OO2.setNewData((List) response.getData());
                        Collection collection = (Collection) response.getData();
                        if (collection == null || collection.isEmpty()) {
                            HeaderLayout headerLayout = this$0.f11480OoooOOO;
                            if (headerLayout != null && (f12058o00000 = headerLayout.getF12058o00000()) != null) {
                                f12058o00000.setText(R.string.Edit);
                            }
                            HeaderLayout headerLayout2 = this$0.f11480OoooOOO;
                            TextView f12058o00001 = headerLayout2 != null ? headerLayout2.getF12058o00000() : null;
                            if (f12058o00001 != null) {
                                f12058o00001.setEnabled(false);
                            }
                        } else {
                            HeaderLayout headerLayout3 = this$0.f11480OoooOOO;
                            TextView f12058o00002 = headerLayout3 != null ? headerLayout3.getF12058o00000() : null;
                            if (f12058o00002 != null) {
                                f12058o00002.setEnabled(true);
                            }
                        }
                    } else {
                        ArrayList arrayList = (ArrayList) response.getData();
                        if (arrayList != null) {
                            OooO0OO<TopicBlackUserModel> oooO0OO3 = this$0.f22561OooooOo;
                            if (oooO0OO3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                                oooO0OO3 = null;
                            }
                            oooO0OO3.addData(arrayList);
                        }
                    }
                }
                OooO0OO<TopicBlackUserModel> oooO0OO4 = this$0.f22561OooooOo;
                if (oooO0OO4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                    oooO0OO4 = null;
                }
                oooO0OO4.setEmptyText(R.string.topic_black_list_No_Result);
                this$0.OooOoo().f50745OooO0OO.Oooo0o0(z, response.getIsSuccess(), response.getNoMoreData());
                OooO0OO<TopicBlackUserModel> oooO0OO5 = this$0.f22561OooooOo;
                if (oooO0OO5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                } else {
                    oooO0OO = oooO0OO5;
                }
                oooO0OO.setLoadComplete(response.getIsSuccess());
                this$0.Oooo00O(true);
                break;
            default:
                MainRoomMineFollowingFragment.m461loadFollowingRoomList$lambda8(this.f44006OooO0O0, (MainRoomMineFollowingFragment) this.f44007OooO0OO, (Response) obj);
                break;
        }
    }
}

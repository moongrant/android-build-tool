package p524o0o0O0oO;

import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.app.base.view.HeaderLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.TopicBlackUserModel;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p188o00o00o0.OooO0OO;
import p649o0ooOOoo.wa;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0oOOo implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f43096OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f43097OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Object f43098OooO0OO;

    public /* synthetic */ o0oOOo(Object obj, Object obj2, int i) {
        this.f43096OooO00o = i;
        this.f43097OooO0O0 = obj;
        this.f43098OooO0OO = obj2;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        TextView f12044o000000;
        switch (this.f43096OooO00o) {
            case 0:
                wa bindingDrawer = (wa) this.f43097OooO0O0;
                o0O0000O this$0 = (o0O0000O) this.f43098OooO0OO;
                Intrinsics.checkNotNullParameter(bindingDrawer, "$bindingDrawer");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                bindingDrawer.f50877OooO0oO.OooO0O0((String) obj, this$0.f43021OooO0Oo);
                break;
            default:
                TopicBlackListActivity this$1 = (TopicBlackListActivity) this.f43097OooO0O0;
                TopicBlackUserModel userModel = (TopicBlackUserModel) this.f43098OooO0OO;
                ApiResult apiResult = (ApiResult) obj;
                int i = TopicBlackListActivity.f22539OooooOo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(userModel, "$userModel");
                if (apiResult.isSuccess()) {
                    OooO0OO<TopicBlackUserModel> oooO0OO = this$1.f22542Ooooo0o;
                    OooO0OO<TopicBlackUserModel> oooO0OO2 = null;
                    if (oooO0OO == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                        oooO0OO = null;
                    }
                    List<TopicBlackUserModel> data = oooO0OO.getData();
                    Intrinsics.checkNotNullExpressionValue(data, "baseAdapter.data");
                    int i2 = 0;
                    for (Object obj2 : data) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((TopicBlackUserModel) obj2).getUserId() == userModel.getUserId()) {
                            OooO0OO<TopicBlackUserModel> oooO0OO3 = this$1.f22542Ooooo0o;
                            if (oooO0OO3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                                oooO0OO3 = null;
                            }
                            oooO0OO3.remove(i2);
                            OooO0OO<TopicBlackUserModel> oooO0OO4 = this$1.f22542Ooooo0o;
                            if (oooO0OO4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                                oooO0OO4 = null;
                            }
                            if (oooO0OO4.getData().isEmpty()) {
                                this$1.f22543OooooO0 = false;
                                HeaderLayout headerLayout = this$1.f11463OoooO;
                                if (headerLayout != null && (f12044o000000 = headerLayout.getF12044o000000()) != null) {
                                    f12044o000000.setText(R.string.Edit);
                                }
                                HeaderLayout headerLayout2 = this$1.f11463OoooO;
                                TextView f12044o000001 = headerLayout2 != null ? headerLayout2.getF12044o000000() : null;
                                if (f12044o000001 != null) {
                                    f12044o000001.setEnabled(false);
                                }
                                OooO0OO<TopicBlackUserModel> oooO0OO5 = this$1.f22542Ooooo0o;
                                if (oooO0OO5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                                } else {
                                    oooO0OO2 = oooO0OO5;
                                }
                                oooO0OO2.setLoadComplete(apiResult.isSuccess());
                            }
                            this$1.Oooo00O(true);
                        } else {
                            i2 = i3;
                        }
                    }
                }
                break;
        }
    }
}

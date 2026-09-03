package p496o0o00o;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.ProfileLimitModel;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nUserInfoEditActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserInfoEditActivity.kt\ncom/yalla/yalla/ui/activity/user/UserInfoEditActivity$initObserve$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,875:1\n1855#2,2:876\n*S KotlinDebug\n*F\n+ 1 UserInfoEditActivity.kt\ncom/yalla/yalla/ui/activity/user/UserInfoEditActivity$initObserve$5\n*L\n176#1:876,2\n*E\n"})
public final class oO0o0o implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f49176OooO0Oo;

    public oO0o0o(UserInfoEditActivity userInfoEditActivity) {
        this.f49176OooO0Oo = userInfoEditActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        List<ProfileLimitModel> profileLimit;
        ArrayList arrayList = new ArrayList();
        UserInfoEditActivity userInfoEditActivity = this.f49176OooO0Oo;
        UserInfoModel userInfoModel = userInfoEditActivity.f27295OooOooO;
        if (userInfoModel != null && (profileLimit = userInfoModel.getProfileLimit()) != null) {
            for (ProfileLimitModel profileLimitModel : profileLimit) {
                if (profileLimitModel.getOperationType() != 1) {
                    arrayList.add(profileLimitModel);
                }
            }
        }
        UserInfoModel userInfoModel2 = userInfoEditActivity.f27295OooOooO;
        if (userInfoModel2 != null) {
            userInfoModel2.setProfileLimit(arrayList);
        }
        userInfoEditActivity.f27296OooOooo.setValue(null);
    }
}

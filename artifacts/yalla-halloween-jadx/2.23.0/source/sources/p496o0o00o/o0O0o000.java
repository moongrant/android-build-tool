package p496o0o00o;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.ProfileLimitModel;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nUserInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserInfoActivity.kt\ncom/yalla/yalla/ui/activity/user/UserInfoActivity$initObserve$9\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1768:1\n1855#2,2:1769\n*S KotlinDebug\n*F\n+ 1 UserInfoActivity.kt\ncom/yalla/yalla/ui/activity/user/UserInfoActivity$initObserve$9\n*L\n239#1:1769,2\n*E\n"})
public final class o0O0o000 implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f49082OooO0Oo;

    public o0O0o000(UserInfoActivity userInfoActivity) {
        this.f49082OooO0Oo = userInfoActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        List<ProfileLimitModel> profileLimit;
        ArrayList arrayList = new ArrayList();
        UserInfoActivity userInfoActivity = this.f49082OooO0Oo;
        UserInfoModel userInfoModel = userInfoActivity.f27246OooOo0o;
        if (userInfoModel != null && (profileLimit = userInfoModel.getProfileLimit()) != null) {
            for (ProfileLimitModel profileLimitModel : profileLimit) {
                if (profileLimitModel.getOperationType() != 1) {
                    arrayList.add(profileLimitModel);
                }
            }
        }
        UserInfoModel userInfoModel2 = userInfoActivity.f27246OooOo0o;
        if (userInfoModel2 == null) {
            return;
        }
        userInfoModel2.setProfileLimit(arrayList);
    }
}

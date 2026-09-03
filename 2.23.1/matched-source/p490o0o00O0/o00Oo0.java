package p490o0o00O0;

import android.content.Intent;
import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.lifecycle.Observer;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.DeleteAccountParamsModel;
import com.yalla.yalla.model.ProfileLimitModel;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.account.DeleteAccountCheckActivity;
import com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p565o0oOo000.o000OOo;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00Oo0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48810OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f48811OooO0o0;

    public /* synthetic */ o00Oo0(Object obj, int i) {
        this.f48810OooO0Oo = i;
        this.f48811OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        List<ProfileLimitModel> profileLimit;
        int i = this.f48810OooO0Oo;
        boolean z = true;
        Object obj2 = this.f48811OooO0o0;
        switch (i) {
            case 0:
                DeleteAccountCheckActivity activity = (DeleteAccountCheckActivity) obj2;
                Response response = (Response) obj;
                int i2 = DeleteAccountCheckActivity.f24716OooOoO0;
                Intrinsics.checkNotNullParameter(activity, "this$0");
                activity.OooOo0();
                if (response.getIsSuccess() && Intrinsics.areEqual(response.getData(), "1")) {
                    String string = activity.getResources().getString(o000OOo.account_verification_success);
                    if (string != null && !StringsKt.isBlank(string)) {
                        z = false;
                    }
                    if (!z) {
                        o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(string, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                        } else {
                            o000O00O.f13431OooO0O0.post(o000oo0OooO00o);
                        }
                    }
                    DeleteAccountParamsModel deleteAccountParamsModel = (DeleteAccountParamsModel) activity.getIntent().getParcelableExtra("DELETE_REASON_TYPE");
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    Intent intent = new Intent(activity, (Class<?>) DeleteAccountSubmitActivity.class);
                    intent.putExtra("DELETE_REASON_TYPE", deleteAccountParamsModel);
                    activity.startActivity(intent);
                    activity.finish();
                    break;
                } else {
                    String string2 = activity.getResources().getString(o000OOo.account_averification_failed);
                    if (string2 != null && !StringsKt.isBlank(string2)) {
                        z = false;
                    }
                    if (!z) {
                        o000Oo0 o000oo0OooO00o2 = OooOo00.OooO00o(string2, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o2.run();
                        } else {
                            o000O00O.f13431OooO0O0.post(o000oo0OooO00o2);
                        }
                        break;
                    }
                }
                break;
            case 1:
                UserInfoEditActivity this$0 = (UserInfoEditActivity) obj2;
                int i3 = UserInfoEditActivity.f26819Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ArrayList arrayList = new ArrayList();
                UserInfoModel userInfoModel = this$0.f26831OooOooO;
                if (userInfoModel != null && (profileLimit = userInfoModel.getProfileLimit()) != null) {
                    for (ProfileLimitModel profileLimitModel : profileLimit) {
                        if (profileLimitModel.getOperationType() != 1) {
                            arrayList.add(profileLimitModel);
                        }
                    }
                }
                UserInfoModel userInfoModel2 = this$0.f26831OooOooO;
                if (userInfoModel2 != null) {
                    userInfoModel2.setProfileLimit(arrayList);
                }
                this$0.f26832OooOooo.setValue(null);
                break;
            default:
                MomentDetailCommentFragment.initObserver$lambda$1((MomentDetailCommentFragment) obj2, obj);
                break;
        }
    }
}

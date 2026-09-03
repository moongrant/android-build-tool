package p538o0o0OOoo;

import android.os.Looper;
import androidx.lifecycle.Observer;
import com.app.base.base.activity.BaseActivity;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import com.yalla.yalla.ui.activity.room.MemberListConveneActivity;
import com.yalla.yalla.ui.view.TopicInfoHeadView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p074o000O0oo.OooOOO;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o0O0ooO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f43840OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ BaseActivity f43841OooO0O0;

    public /* synthetic */ n(BaseActivity baseActivity, int i) {
        this.f43840OooO00o = i;
        this.f43841OooO0O0 = baseActivity;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Long, com.yalla.yalla.model.RoomUserInfoModel>] */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f43840OooO00o) {
            case 0:
                PrivateChatActivity this$0 = (PrivateChatActivity) this.f43841OooO0O0;
                PrivateChatActivity.OooO00o oooO00o = PrivateChatActivity.f22185o0ooOOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.Oooo0oO();
                break;
            case 1:
                TopicInfoActivity this$1 = (TopicInfoActivity) this.f43841OooO0O0;
                String it = (String) obj;
                TopicInfoActivity.OooO00o oooO00o2 = TopicInfoActivity.f22642ooOO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                TopicInfoHeadView topicInfoHeadViewOooo000 = this$1.Oooo000();
                Intrinsics.checkNotNullExpressionValue(it, "it");
                topicInfoHeadViewOooo000.OooO0Oo(it);
                break;
            default:
                MemberListConveneActivity this$2 = (MemberListConveneActivity) this.f43841OooO0O0;
                int i = MemberListConveneActivity.f22879o00Oo0;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                if (((ApiResult) obj).isSuccess()) {
                    this$2.f22884Oooooo0.clear();
                    this$2.Oooo0();
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.room_member_convene_success);
                    ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                        o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O0.run();
                        } else {
                            o00O000 o00o001 = o00O000.f34368OooO00o;
                            o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                        }
                    }
                    this$2.finish();
                }
                break;
        }
    }
}

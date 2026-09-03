package p536o0o0OOoo;

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
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f43832OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ BaseActivity f43833OooO0O0;

    public /* synthetic */ p(BaseActivity baseActivity, int i) {
        this.f43832OooO00o = i;
        this.f43833OooO0O0 = baseActivity;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Long, com.yalla.yalla.model.RoomUserInfoModel>] */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f43832OooO00o) {
            case 0:
                PrivateChatActivity this$0 = (PrivateChatActivity) this.f43833OooO0O0;
                PrivateChatActivity.OooO00o oooO00o = PrivateChatActivity.f22166o00oO0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.Oooo0oO();
                break;
            case 1:
                TopicInfoActivity this$1 = (TopicInfoActivity) this.f43833OooO0O0;
                String it = (String) obj;
                TopicInfoActivity.OooO00o oooO00o2 = TopicInfoActivity.f22623OoooooO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                TopicInfoHeadView topicInfoHeadViewOooo000 = this$1.Oooo000();
                Intrinsics.checkNotNullExpressionValue(it, "it");
                topicInfoHeadViewOooo000.OooO0Oo(it);
                break;
            default:
                MemberListConveneActivity this$2 = (MemberListConveneActivity) this.f43833OooO0O0;
                int i = MemberListConveneActivity.f22860o0OoOo0;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                if (((ApiResult) obj).isSuccess()) {
                    this$2.f22864OooooO0.clear();
                    this$2.Oooo0();
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.room_member_convene_success);
                    ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                        o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O0.run();
                        } else {
                            o00O000 o00o001 = o00O000.f34346OooO00o;
                            o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                        }
                    }
                    this$2.finish();
                }
                break;
        }
    }
}

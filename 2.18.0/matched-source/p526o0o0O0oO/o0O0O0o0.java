package p526o0o0O0oO;

import android.os.Looper;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.model.MomentSendContentModel;
import com.yalla.yalla.model.MomentSendModel;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.account.AccountBindActivity;
import com.yalla.yalla.ui.activity.main.NoticeSettingActivity;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p074o000O0oo.OooOOO;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o0O0ooO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O0O0o0 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f43063OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f43064OooO0O0;

    public /* synthetic */ o0O0O0o0(Object obj, int i) {
        this.f43063OooO00o = i;
        this.f43064OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f43063OooO00o) {
            case 0:
                o0O0OO0 this$0 = (o0O0OO0) this.f43064OooO0O0;
                Integer it = (Integer) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullExpressionValue(it, "it");
                if (it.intValue() >= 0) {
                    this$0.OooO0o(it.intValue());
                }
                break;
            case 1:
                AccountBindActivity this$1 = (AccountBindActivity) this.f43064OooO0O0;
                Boolean it2 = (Boolean) obj;
                AccountBindActivity.OooO00o oooO00o = AccountBindActivity.f21721Oooooo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                if (!it2.booleanValue()) {
                    TextView textView = this$1.OooOooO().f49268OooOOo0;
                    Intrinsics.checkNotNullExpressionValue(textView, "binding.tvPhoneNum");
                    o00O0O.OooO00o(textView);
                    LinearLayout linearLayout = this$1.OooOooO().f49262OooOO0o;
                    Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llUnprotected");
                    o00O0O.OooO(linearLayout);
                } else {
                    TextView textView2 = this$1.OooOooO().f49268OooOOo0;
                    Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvPhoneNum");
                    o00O0O.OooO(textView2);
                    LinearLayout linearLayout2 = this$1.OooOooO().f49262OooOO0o;
                    Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.llUnprotected");
                    o00O0O.OooO00o(linearLayout2);
                }
                break;
            case 2:
                NoticeSettingActivity this$2 = (NoticeSettingActivity) this.f43064OooO0O0;
                Boolean it3 = (Boolean) obj;
                int i = NoticeSettingActivity.f22048OooooOo;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.OooOoO();
                Switch r0 = this$2.OooOoo().f50150OooO0OO.getF20951Oooo().f51063OooO0o0;
                Intrinsics.checkNotNullExpressionValue(it3, "it");
                r0.setChecked(it3.booleanValue());
                break;
            case 3:
                MomentSendActivity this$3 = (MomentSendActivity) this.f43064OooO0O0;
                MomentSendActivity.OooO00o oooO00o2 = MomentSendActivity.f22386o0ooOOo;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                this$3.OooOoO();
                MomentAdapterTag momentAdapterTag = this$3.OooOooo().getMomentAdapterTag();
                if (momentAdapterTag != null) {
                    int i2 = MomentSendActivity.OooO0O0.$EnumSwitchMapping$0[momentAdapterTag.ordinal()];
                }
                String strOooO0OO = o000O0O0.OooO0OO(R.string.send_successfully);
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
                this$3.finish();
                break;
            default:
                TopicDetailActivity this$4 = (TopicDetailActivity) this.f43064OooO0O0;
                MomentSendModel momentSendModel = (MomentSendModel) obj;
                TopicDetailActivity.OooO00o oooO00o3 = TopicDetailActivity.f22586o00Oo0;
                Intrinsics.checkNotNullParameter(this$4, "this$0");
                if (momentSendModel != null) {
                    TopicInfoModel value = this$4.Oooo000().getTopicDetailLocal().getValue();
                    Long lValueOf = value != null ? Long.valueOf(value.getId()) : null;
                    MomentSendContentModel content = momentSendModel.getContent();
                    if (Intrinsics.areEqual(lValueOf, content != null ? Long.valueOf(content.getCircleId()) : null)) {
                        this$4.Oooo000().isFollow().setValue(Boolean.TRUE);
                    }
                }
                break;
        }
    }
}

package p536o0o0OOoo;

import android.content.Intent;
import androidx.lifecycle.Observer;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.db.table.YallaTeamMessage;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentSendModel;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import com.yalla.yalla.ui.activity.moment.UserPostListActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p169o00Ooo00.OooOOOO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c2 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f43762OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f43763OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Object f43764OooO0OO;

    public /* synthetic */ c2(Object obj, Object obj2, int i) {
        this.f43762OooO00o = i;
        this.f43763OooO0O0 = obj;
        this.f43764OooO0OO = obj2;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        MomentDetailModel momentDetailModel;
        switch (this.f43762OooO00o) {
            case 0:
                YallaTeamMessage message = (YallaTeamMessage) this.f43763OooO0O0;
                YallaTeamMessageActivity context = (YallaTeamMessageActivity) this.f43764OooO0OO;
                String url = (String) obj;
                YallaTeamMessageActivity.OooO00o oooO00o = YallaTeamMessageActivity.f22251OoooooO;
                Intrinsics.checkNotNullParameter(message, "$message");
                Intrinsics.checkNotNullParameter(context, "this$0");
                if (!(url == null || StringsKt.isBlank(url))) {
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.StoreCoin);
                    Intrinsics.checkNotNullExpressionValue(url, "url");
                    Intrinsics.checkNotNullParameter(url, "url");
                    webPageInfo.f21217Oooo0oO = url;
                    webPageInfo.f21220OoooO0 = true;
                    webPageInfo.OooO0OO(OooOOO.OooO0OO(R.string.room_unique_id));
                    webPageInfo.OooO00o("typeid", String.valueOf(message.getJumpType()));
                    webPageInfo.OooO00o("jumpname", message.getJumpId());
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intent intent = new Intent(context, (Class<?>) WebActivity.class);
                    intent.putExtra("pageinfo", webPageInfo);
                    context.startActivity(intent);
                    break;
                }
                break;
            default:
                UserPostListActivity this$0 = (UserPostListActivity) this.f43763OooO0O0;
                MomentSendModel post = (MomentSendModel) this.f43764OooO0OO;
                ApiResult apiResult = (ApiResult) obj;
                UserPostListActivity.OooO00o oooO00o2 = UserPostListActivity.f22674Ooooooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(post, "$post");
                if (apiResult.isSuccess() && (momentDetailModel = (MomentDetailModel) apiResult.getData()) != null) {
                    OooOOOO oooOOOO = OooOOOO.f32671OooO00o;
                    int iOooO0O0 = OooOOOO.OooO0O0(this$0.OooOooo().getData(), post);
                    if (iOooO0O0 > -1 && iOooO0O0 < this$0.OooOooo().getData().size()) {
                        this$0.OooOooo().setData(iOooO0O0, momentDetailModel);
                        break;
                    }
                }
                break;
        }
    }
}

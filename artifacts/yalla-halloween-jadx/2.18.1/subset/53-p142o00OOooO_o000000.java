package p142o00OOooO;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import androidx.paging.compose.OooO0OO;
import com.app.base.fragment.MainMomentFollowingFragment;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.AccountConfirmInfo;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentForwardContent;
import com.yalla.yalla.model.MomentTypeDelete;
import com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity;
import com.yalla.yalla.ui.activity.message.FriendRequestMessageActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p168o00Ooo0.o0O0O00;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;
import p498o0o00Oo0.OooOOO;
import p522o0o0O0o.oo0o0O0;
import p611o0oo0OO0.o0000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000000 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31916OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31917OooO0O0;

    public /* synthetic */ o000000(Object obj, int i) {
        this.f31916OooO00o = i;
        this.f31917OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        MomentForwardContent forwardContent;
        MomentForwardContent forwardContent2;
        switch (this.f31916OooO00o) {
            case 0:
                MainMomentFollowingFragment.m21initObserver$lambda6((MainMomentFollowingFragment) this.f31917OooO0O0, obj);
                break;
            case 1:
                DeleteAccountSubmitActivity this$0 = (DeleteAccountSubmitActivity) this.f31917OooO0O0;
                Response response = (Response) obj;
                DeleteAccountSubmitActivity.OooO00o oooO00o = DeleteAccountSubmitActivity.f21745Ooooo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (response.getIsSuccess() && response.getData() != null) {
                    Object data = response.getData();
                    Intrinsics.checkNotNull(data);
                    AccountConfirmInfo accountConfirmInfo = (AccountConfirmInfo) data;
                    Objects.requireNonNull(this$0);
                    if (accountConfirmInfo.getFriendsNum() > 0) {
                        this$0.OooOoo().f49824OooOOOO.setText(String.valueOf(accountConfirmInfo.getFriendsNum()));
                    } else {
                        LinearLayout linearLayout = this$0.OooOoo().f49815OooO0o;
                        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llFriends");
                        oOO00O.OooO00o(linearLayout);
                    }
                    if (accountConfirmInfo.getFansNum() > 0) {
                        this$0.OooOoo().f49822OooOOO.setText(String.valueOf(accountConfirmInfo.getFansNum()));
                    } else {
                        LinearLayout linearLayout2 = this$0.OooOoo().f49816OooO0o0;
                        Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.llFans");
                        oOO00O.OooO00o(linearLayout2);
                    }
                    if (accountConfirmInfo.getUserLevel() > 0) {
                        this$0.OooOoo().f49825OooOOOo.setText(String.valueOf(accountConfirmInfo.getUserLevel()));
                    } else {
                        LinearLayout linearLayout3 = this$0.OooOoo().f49817OooO0oO;
                        Intrinsics.checkNotNullExpressionValue(linearLayout3, "binding.llLevel");
                        oOO00O.OooO00o(linearLayout3);
                    }
                    if (accountConfirmInfo.getCoinNum() > 0) {
                        this$0.OooOoo().f49819OooOO0.setText(o0O0O00.OooO0Oo(String.valueOf(accountConfirmInfo.getCoinNum())));
                    } else {
                        LinearLayout linearLayout4 = this$0.OooOoo().f49813OooO0OO;
                        Intrinsics.checkNotNullExpressionValue(linearLayout4, "binding.llCoin");
                        oOO00O.OooO00o(linearLayout4);
                    }
                    if (accountConfirmInfo.getCrystalNum() > 0) {
                        this$0.OooOoo().f49821OooOO0o.setText(o0O0O00.OooO0Oo(String.valueOf(accountConfirmInfo.getCrystalNum())));
                    } else {
                        LinearLayout linearLayout5 = this$0.OooOoo().f49814OooO0Oo;
                        Intrinsics.checkNotNullExpressionValue(linearLayout5, "binding.llCrystal");
                        oOO00O.OooO00o(linearLayout5);
                    }
                    if (accountConfirmInfo.getMedalNum() > 0) {
                        this$0.OooOoo().f49818OooO0oo.setText(String.valueOf(accountConfirmInfo.getMedalNum()));
                    } else {
                        LinearLayout linearLayout6 = this$0.OooOoo().f49812OooO0O0;
                        Intrinsics.checkNotNullExpressionValue(linearLayout6, "binding.llBadge");
                        oOO00O.OooO00o(linearLayout6);
                    }
                    TextView textView = this$0.OooOoo().f49823OooOOO0;
                    String strValueOf = String.valueOf(OooOOO.f41216OooO00o.OooOoO().getValue());
                    textView.setText(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.delete_your_account_prompt_content4), strValueOf));
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    oo0o0O0.OooO0o0(textView, new String[]{strValueOf}, o000O0O0.OooO00o(R.color.app_color_));
                }
                this$0.OooOoO();
                break;
            case 2:
                FriendRequestMessageActivity this$1 = (FriendRequestMessageActivity) this.f31917OooO0O0;
                Integer it = (Integer) obj;
                FriendRequestMessageActivity.OooO00o oooO00o2 = FriendRequestMessageActivity.f22157OooooOO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullExpressionValue(it, "it");
                if (it.intValue() <= 0) {
                    this$1.OooOooO().f50180OooO0OO.OooO0o0();
                    TextView textView2 = this$1.f22160Ooooo0o;
                    if (textView2 != null) {
                        oOO00O.OooO00o(textView2);
                    }
                } else {
                    TextView textView3 = this$1.f22160Ooooo0o;
                    if (textView3 != null) {
                        oOO00O.OooO(textView3);
                    }
                    this$1.OooOooO().f50180OooO0OO.OooO0Oo();
                }
                break;
            case 3:
                PostDetailActivity this$2 = (PostDetailActivity) this.f31917OooO0O0;
                Long l = (Long) obj;
                PostDetailActivity.OooO00o oooO00o3 = PostDetailActivity.f22417o0O0O00;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                MomentDetailModel momentDetailModel = this$2.f22420Ooooo0o;
                if ((momentDetailModel == null || (forwardContent2 = momentDetailModel.getForwardContent()) == null || forwardContent2.getShareType() != 20) ? false : true) {
                    MomentDetailModel momentDetailModel2 = this$2.f22420Ooooo0o;
                    if (Intrinsics.areEqual((momentDetailModel2 == null || (forwardContent = momentDetailModel2.getForwardContent()) == null) ? null : Long.valueOf(forwardContent.getId()), l)) {
                        MomentDetailModel momentDetailModel3 = this$2.f22420Ooooo0o;
                        if (momentDetailModel3 != null) {
                            momentDetailModel3.setDeleteType(MomentTypeDelete.EVENT.getValue());
                        }
                        this$2.Oooo0o0();
                    }
                }
                break;
            default:
                OooO0OO lazyPagingItems = (OooO0OO) this.f31917OooO0O0;
                Intrinsics.checkNotNullParameter(lazyPagingItems, "$lazyPagingItems");
                Intrinsics.checkNotNullParameter("102006", "eventId");
                o0000.f48362OooO00o.OooO00o("102006", p606o0oo0O.OooOo.OooO00o(), (String) obj);
                lazyPagingItems.OooO0o();
                break;
        }
    }
}

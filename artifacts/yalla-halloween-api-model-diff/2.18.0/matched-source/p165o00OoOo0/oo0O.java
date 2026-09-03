package p165o00OoOo0;

import OooO00o.OooO00o;
import android.os.Looper;
import android.widget.Switch;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.app.base.mixedroom.model.RoomLoginInformation;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.account.AccountBindActivity;
import com.yalla.yalla.ui.activity.main.NoticeSettingActivity;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o0O0ooO;
import p393o0OOooOo.o0O00000;
import p500o0o00Oo0.OooOOO;
import p532o0o0OOO.o00OO0O0;
import p548o0o0Ooo0.oO0O00O;
import p619o0oo0o.Oooo000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oo0O implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32565OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32566OooO0O0;

    public /* synthetic */ oo0O(Object obj, int i) {
        this.f32565OooO00o = i;
        this.f32566OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        TopicInfoModel topicInfoModel = null;
        switch (this.f32565OooO00o) {
            case 0:
                o00OO this$0 = (o00OO) this.f32566OooO0O0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f32563OooO0O0 = (RoomLoginInformation) obj;
                o00OO0O0.f43338OooooOo.OooO00o().OooOOo();
                break;
            case 1:
                MutableLiveData mutableLiveData = (MutableLiveData) this.f32566OooO0O0;
                Integer num = (Integer) obj;
                if (mutableLiveData != null) {
                    mutableLiveData.setValue(num);
                    break;
                }
                break;
            case 2:
                AccountBindActivity this$1 = (AccountBindActivity) this.f32566OooO0O0;
                Response response = (Response) obj;
                AccountBindActivity.OooO00o oooO00o = AccountBindActivity.f21721Oooooo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOoO();
                if (response.getIsSuccess()) {
                    if (response.getData() != null) {
                        AccountBindInfo accountBindInfo = (AccountBindInfo) response.getData();
                        this$1.f21724OooooOo = accountBindInfo;
                        Intrinsics.checkNotNull(accountBindInfo);
                        if (Oooo000.OooO0O0(accountBindInfo.getIsPh())) {
                            this$1.OooOooO().f49255OooO0Oo.setImageResource(R.drawable.account_phone_green);
                            TextView textView = this$1.OooOooO().f49268OooOOo0;
                            StringBuilder sbOooO0O0 = OooO00o.OooO0O0("\u202d+");
                            sbOooO0O0.append(accountBindInfo.getIsPh());
                            sbOooO0O0.append((char) 8236);
                            textView.setText(sbOooO0O0.toString());
                        }
                        OooOOO.f41235OooO00o.OooOoo().postValue(Boolean.valueOf(Oooo000.OooO0O0(accountBindInfo.getIsPh())));
                        if (Oooo000.OooO0O0(accountBindInfo.getIsFb())) {
                            this$1.OooOooO().f49253OooO0O0.setImageResource(R.drawable.account_facebook_green);
                            this$1.OooOooO().f49265OooOOOO.setText(accountBindInfo.getAccount(4));
                        } else {
                            this$1.OooOooO().f49253OooO0O0.setImageResource(R.drawable.account_facebook_gray);
                            this$1.OooOooO().f49265OooOOOO.setText((CharSequence) null);
                        }
                        if (Oooo000.OooO0O0(accountBindInfo.getIsYc())) {
                            this$1.OooOooO().f49258OooO0oO.setImageResource(R.drawable.account_yalla_chat_green);
                            this$1.OooOooO().f49270OooOo00.setText(accountBindInfo.getAccount(12));
                        } else {
                            this$1.OooOooO().f49258OooO0oO.setImageResource(R.drawable.account_yalla_chat_gray);
                            this$1.OooOooO().f49270OooOo00.setText((CharSequence) null);
                        }
                        if (Oooo000.OooO0O0(accountBindInfo.getIsTt())) {
                            this$1.OooOooO().f49257OooO0o0.setImageResource(R.drawable.icon_twitter);
                            this$1.OooOooO().f49267OooOOo.setText(accountBindInfo.getAccount(9));
                        } else {
                            this$1.OooOooO().f49257OooO0o0.setImageResource(R.drawable.icon_twitter_gray);
                            this$1.OooOooO().f49267OooOOo.setText((CharSequence) null);
                        }
                        if (Oooo000.OooO0O0(accountBindInfo.getIsIg())) {
                            this$1.OooOooO().f49254OooO0OO.setImageResource(R.drawable.icon_instagram);
                            this$1.OooOooO().f49266OooOOOo.setText(accountBindInfo.getAccount(7));
                        } else {
                            this$1.OooOooO().f49254OooO0OO.setImageResource(R.drawable.icon_instagram_gray);
                            this$1.OooOooO().f49266OooOOOo.setText((CharSequence) null);
                        }
                        if (!Oooo000.OooO0O0(accountBindInfo.getIsWx())) {
                            this$1.OooOooO().f49256OooO0o.setImageResource(R.drawable.account_wechat_gray);
                            this$1.OooOooO().f49269OooOOoo.setText((CharSequence) null);
                        } else {
                            this$1.OooOooO().f49256OooO0o.setImageResource(R.drawable.account_wechat_green);
                            this$1.OooOooO().f49269OooOOoo.setText(accountBindInfo.getAccount(5));
                        }
                    }
                }
                break;
            case 3:
                NoticeSettingActivity this$2 = (NoticeSettingActivity) this.f32566OooO0O0;
                Boolean it = (Boolean) obj;
                int i = NoticeSettingActivity.f22048OooooOo;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                Switch r0 = this$2.OooOoo().f50151OooO0Oo.getF20951Oooo().f51063OooO0o0;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                r0.setChecked(it.booleanValue());
                break;
            case 4:
                MomentSendActivity this$3 = (MomentSendActivity) this.f32566OooO0O0;
                MomentSendActivity.OooO00o oooO00o2 = MomentSendActivity.f22386o0ooOOo;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                this$3.OooOoO();
                String strOooO0OO = o000O0O0.OooO0OO(R.string.moment_edit_failed);
                ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                    o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                    if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o00O000 o00o001 = o00O000.f34368OooO00o;
                        o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                    } else {
                        o0o0oooOooO0O0.run();
                    }
                    break;
                }
                break;
            case 5:
                TopicDetailActivity this$4 = (TopicDetailActivity) this.f32566OooO0O0;
                Long l = (Long) obj;
                TopicDetailActivity.OooO00o oooO00o3 = TopicDetailActivity.f22586o00Oo0;
                Intrinsics.checkNotNullParameter(this$4, "this$0");
                TopicInfoModel topicInfoModel2 = this$4.f22588OooooOO;
                if (topicInfoModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("topicInfoModel");
                } else {
                    topicInfoModel = topicInfoModel2;
                }
                long id = topicInfoModel.getId();
                if (l != null && l.longValue() == id) {
                    this$4.Oooo00O().getGroupInfo();
                }
                break;
            default:
                oO0O00O this$5 = (oO0O00O) this.f32566OooO0O0;
                String url = (String) obj;
                Intrinsics.checkNotNullParameter(this$5, "this$0");
                o0O00000.OooO0OO("InRoom_userprofile_uniquePersonalID");
                if (!OooO0OO.OooO00o(url)) {
                    o0O00000.OooO0OO("Me_store_Personal_UniqeID");
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.StoreCoin);
                    Intrinsics.checkNotNull(url);
                    Intrinsics.checkNotNullParameter(url, "url");
                    webPageInfo.f21237OoooO00 = url;
                    webPageInfo.OooO00o("region", String.valueOf(OooOOO.f41235OooO00o.OooOOO().getValue()));
                    webPageInfo.OooO0OO(o000O0O0.OooO0OO(R.string.user_unique_id));
                    webPageInfo.f21239OoooOO0 = true;
                    WebActivity.f22127ooOO.OooO00o(this$5.f44372OooO00o, webPageInfo);
                    break;
                }
                break;
        }
    }
}

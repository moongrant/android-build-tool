package p164o00OoOo0;

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
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p391o0OOooOo.o0O00000;
import p498o0o00Oo0.OooOOO;
import p530o0o0OOO.o00OO00O;
import p546o0o0Ooo0.oO0O00oO;
import p617o0oo0o.Oooo000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00OO0OO implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32540OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32541OooO0O0;

    public /* synthetic */ o00OO0OO(Object obj, int i) {
        this.f32540OooO00o = i;
        this.f32541OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        TopicInfoModel topicInfoModel = null;
        switch (this.f32540OooO00o) {
            case 0:
                oo0O this$0 = (oo0O) this.f32541OooO0O0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f32543OooO0O0 = (RoomLoginInformation) obj;
                o00OO00O.f43313OooooOo.OooO00o().OooOOo();
                break;
            case 1:
                MutableLiveData mutableLiveData = (MutableLiveData) this.f32541OooO0O0;
                Integer num = (Integer) obj;
                if (mutableLiveData != null) {
                    mutableLiveData.setValue(num);
                    break;
                }
                break;
            case 2:
                AccountBindActivity this$1 = (AccountBindActivity) this.f32541OooO0O0;
                Response response = (Response) obj;
                AccountBindActivity.OooO00o oooO00o = AccountBindActivity.f21702OooooOO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOoO();
                if (response.getIsSuccess()) {
                    if (response.getData() != null) {
                        AccountBindInfo accountBindInfo = (AccountBindInfo) response.getData();
                        this$1.f21705Ooooo0o = accountBindInfo;
                        Intrinsics.checkNotNull(accountBindInfo);
                        if (Oooo000.OooO0O0(accountBindInfo.getIsPh())) {
                            this$1.OooOooO().f49318OooO0Oo.setImageResource(R.drawable.account_phone_green);
                            TextView textView = this$1.OooOooO().f49331OooOOo0;
                            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("\u202d+");
                            sbOooO0o0.append(accountBindInfo.getIsPh());
                            sbOooO0o0.append((char) 8236);
                            textView.setText(sbOooO0o0.toString());
                        }
                        OooOOO.f41216OooO00o.OooOoo().postValue(Boolean.valueOf(Oooo000.OooO0O0(accountBindInfo.getIsPh())));
                        if (Oooo000.OooO0O0(accountBindInfo.getIsFb())) {
                            this$1.OooOooO().f49316OooO0O0.setImageResource(R.drawable.account_facebook_green);
                            this$1.OooOooO().f49328OooOOOO.setText(accountBindInfo.getAccount(4));
                        } else {
                            this$1.OooOooO().f49316OooO0O0.setImageResource(R.drawable.account_facebook_gray);
                            this$1.OooOooO().f49328OooOOOO.setText((CharSequence) null);
                        }
                        if (Oooo000.OooO0O0(accountBindInfo.getIsYc())) {
                            this$1.OooOooO().f49321OooO0oO.setImageResource(R.drawable.account_yalla_chat_green);
                            this$1.OooOooO().f49333OooOo00.setText(accountBindInfo.getAccount(12));
                        } else {
                            this$1.OooOooO().f49321OooO0oO.setImageResource(R.drawable.account_yalla_chat_gray);
                            this$1.OooOooO().f49333OooOo00.setText((CharSequence) null);
                        }
                        if (Oooo000.OooO0O0(accountBindInfo.getIsTt())) {
                            this$1.OooOooO().f49320OooO0o0.setImageResource(R.drawable.icon_twitter);
                            this$1.OooOooO().f49330OooOOo.setText(accountBindInfo.getAccount(9));
                        } else {
                            this$1.OooOooO().f49320OooO0o0.setImageResource(R.drawable.icon_twitter_gray);
                            this$1.OooOooO().f49330OooOOo.setText((CharSequence) null);
                        }
                        if (Oooo000.OooO0O0(accountBindInfo.getIsIg())) {
                            this$1.OooOooO().f49317OooO0OO.setImageResource(R.drawable.icon_instagram);
                            this$1.OooOooO().f49329OooOOOo.setText(accountBindInfo.getAccount(7));
                        } else {
                            this$1.OooOooO().f49317OooO0OO.setImageResource(R.drawable.icon_instagram_gray);
                            this$1.OooOooO().f49329OooOOOo.setText((CharSequence) null);
                        }
                        if (!Oooo000.OooO0O0(accountBindInfo.getIsWx())) {
                            this$1.OooOooO().f49319OooO0o.setImageResource(R.drawable.account_wechat_gray);
                            this$1.OooOooO().f49332OooOOoo.setText((CharSequence) null);
                        } else {
                            this$1.OooOooO().f49319OooO0o.setImageResource(R.drawable.account_wechat_green);
                            this$1.OooOooO().f49332OooOOoo.setText(accountBindInfo.getAccount(5));
                        }
                    }
                }
                break;
            case 3:
                NoticeSettingActivity this$2 = (NoticeSettingActivity) this.f32541OooO0O0;
                Boolean it = (Boolean) obj;
                int i = NoticeSettingActivity.f22029Ooooo0o;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                Switch r0 = this$2.OooOoo().f50214OooO0Oo.getF20931Oooo0o().f51126OooO0o0;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                r0.setChecked(it.booleanValue());
                break;
            case 4:
                MomentSendActivity this$3 = (MomentSendActivity) this.f32541OooO0O0;
                MomentSendActivity.OooO00o oooO00o2 = MomentSendActivity.f22367o00oO0o;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                this$3.OooOoO();
                String strOooO0OO = o000O0O0.OooO0OO(R.string.moment_edit_failed);
                ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                    o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                    if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o00O000 o00o001 = o00O000.f34346OooO00o;
                        o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                    } else {
                        o0o0oooOooO0O0.run();
                    }
                    break;
                }
                break;
            case 5:
                TopicDetailActivity this$4 = (TopicDetailActivity) this.f32541OooO0O0;
                Long l = (Long) obj;
                TopicDetailActivity.OooO00o oooO00o3 = TopicDetailActivity.f22567o0OoOo0;
                Intrinsics.checkNotNullParameter(this$4, "this$0");
                TopicInfoModel topicInfoModel2 = this$4.f22569Ooooo00;
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
                oO0O00oO this$5 = (oO0O00oO) this.f32541OooO0O0;
                String url = (String) obj;
                Intrinsics.checkNotNullParameter(this$5, "this$0");
                o0O00000.OooO0OO("InRoom_userprofile_uniquePersonalID");
                if (!OooO0OO.OooO00o(url)) {
                    o0O00000.OooO0OO("Me_store_Personal_UniqeID");
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.StoreCoin);
                    Intrinsics.checkNotNull(url);
                    Intrinsics.checkNotNullParameter(url, "url");
                    webPageInfo.f21217Oooo0oO = url;
                    webPageInfo.OooO00o("region", String.valueOf(OooOOO.f41216OooO00o.OooOOO().getValue()));
                    webPageInfo.OooO0OO(o000O0O0.OooO0OO(R.string.user_unique_id));
                    webPageInfo.f21220OoooO0 = true;
                    WebActivity.f22108OoooooO.OooO00o(this$5.f44365OooO00o, webPageInfo);
                    break;
                }
                break;
        }
    }
}

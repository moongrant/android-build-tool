package p501o0o00o;

import android.content.Intent;
import android.os.Looper;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.app.base.interfaceType.FeedbackType;
import com.app.base.mixedroom.model.RoomConfiguration;
import com.code.android.util.ToastUtil;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.CloudFileInfo;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.common.vm.RoomInfoEditVM;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentType;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import com.yalla.yalla.ui.activity.moment.UserPostListActivity;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment;
import com.yalla.yalla.util.NetWork;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p487o0o000oO.o0OOO0o;
import p487o0o000oO.o0Oo0oo;
import p530o0o0OOO.o00OO00O;
import p579o0oOoOOo.b;
import p617o0oo0o.o00;
import p707oOooo0o.o000O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000O0 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f41452OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f41453OooO0O0;

    public /* synthetic */ o0000O0(Object obj, int i) {
        this.f41452OooO00o = i;
        this.f41453OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        MomentDetailModel forward;
        String strOooO0OO;
        switch (this.f41452OooO00o) {
            case 0:
                o000 this$0 = (o000) this.f41453OooO0O0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOo0o();
                break;
            case 1:
                SmsCodeActivity context = (SmsCodeActivity) this.f41453OooO0O0;
                String url = (String) obj;
                SmsCodeActivity.OooO00o oooO00o = SmsCodeActivity.f21845o00Ooo;
                Intrinsics.checkNotNullParameter(context, "this$0");
                if (((url == null || StringsKt.isBlank(url)) ? 1 : 0) == 0) {
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.VerificationCodeFeedback);
                    Intrinsics.checkNotNullExpressionValue(url, "it");
                    Intrinsics.checkNotNullParameter(url, "url");
                    webPageInfo.f21217Oooo0oO = url;
                    webPageInfo.OooO0OO(OooOOO.OooO0OO(R.string.feedback));
                    String strSubstring = context.f21851OooooOo.substring(context.f21853Oooooo0.length(), context.f21851OooooOo.length());
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    webPageInfo.OooO00o("Tel", strSubstring);
                    webPageInfo.OooO00o("type", FeedbackType.Suggestions);
                    webPageInfo.OooO00o("areaCode", "mAreaCode");
                    o0Oo0oo o0oo0oo2 = o0Oo0oo.f40947OooO00o;
                    webPageInfo.OooO00o("PID", o0Oo0oo.OooO00o());
                    o0OOO0o o0ooo0o2 = o0OOO0o.f40936OooO00o;
                    webPageInfo.OooO00o("appVersion", o0OOO0o.OooO0O0());
                    webPageInfo.OooO00o(DeviceRequestsHelper.DEVICE_INFO_MODEL, o0Oo0oo.OooO0O0());
                    webPageInfo.OooO00o("sysVersion", o0Oo0oo.OooO0Oo());
                    webPageInfo.OooO00o("internet", NetWork.OooO00o().toString());
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intent intent = new Intent(context, (Class<?>) WebActivity.class);
                    intent.putExtra("pageinfo", webPageInfo);
                    context.startActivity(intent);
                    break;
                }
                break;
            case 2:
                ShareToFriendsActivity this$1 = (ShareToFriendsActivity) this.f41453OooO0O0;
                ShareToFriendsActivity.OooO00o oooO00o2 = ShareToFriendsActivity.f22209o00o0O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                    String strOooO0OO2 = OooOOO.OooO0OO(R.string.message_give_theme_success);
                    ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                    if (((strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2)) ? 1 : 0) == 0) {
                        o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO2, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O0.run();
                        } else {
                            o00O000 o00o001 = o00O000.f34346OooO00o;
                            o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                        }
                    }
                    this$1.finish();
                }
                break;
            case 3:
                UserPostListActivity this$2 = (UserPostListActivity) this.f41453OooO0O0;
                MomentDetailModel momentDetailModel = (MomentDetailModel) obj;
                UserPostListActivity.OooO00o oooO00o3 = UserPostListActivity.f22674Ooooooo;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                for (int i = 0; i < this$2.OooOooo().getData().size(); i++) {
                    MomentDetailModel momentDetailModel2 = this$2.OooOooo().getData().get(i);
                    int type = momentDetailModel2.getType();
                    if (type == MomentType.Poll.getValue()) {
                        if (momentDetailModel2.getId() == momentDetailModel.getId()) {
                            this$2.OooOooo().getData().set(i, momentDetailModel);
                            this$2.OooOooo().notifyItemChanged(this$2.OooOooo().getHeaderLayoutCount() + i);
                        }
                    } else if (type == MomentType.Forward.getValue() && (forward = momentDetailModel2.getForward()) != null && forward.getId() == momentDetailModel.getId()) {
                        MomentDetailModel momentDetailModel3 = this$2.OooOooo().getData().get(i);
                        if (momentDetailModel3 != null) {
                            momentDetailModel3.setForward(momentDetailModel);
                        }
                        this$2.OooOooo().notifyItemChanged(this$2.OooOooo().getHeaderLayoutCount() + i);
                    }
                }
                break;
            case 4:
                final RoomSettingActivity this$3 = (RoomSettingActivity) this.f41453OooO0O0;
                final CloudFileInfo cloudFileInfo = (CloudFileInfo) obj;
                RoomSettingActivity.OooO00o oooO00o4 = RoomSettingActivity.f22969o00Ooo;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                o000O o000o = this$3.f22975OooooOo;
                if (o000o != null) {
                    o000o.OooO00o();
                }
                if (cloudFileInfo != null && cloudFileInfo.getUrl() != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(cloudFileInfo);
                    RoomInfoEditVM roomInfoEditVM = this$3.f22982o0OoOo0;
                    if (roomInfoEditVM == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("vm");
                        roomInfoEditVM = null;
                    }
                    RoomConfiguration roomConfiguration = this$3.f22972Ooooo0o;
                    roomInfoEditVM.changeImageUrl(String.valueOf(roomConfiguration != null ? roomConfiguration.getBarid() : null), arrayList).observe(this$3, new Observer() { // from class: o0o0OoOO.c6
                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(Object obj2) {
                            CloudFileInfo cloudFileInfo2 = cloudFileInfo;
                            RoomSettingActivity this$4 = this$3;
                            RoomSettingActivity.OooO00o oooO00o5 = RoomSettingActivity.f22969o00Ooo;
                            Intrinsics.checkNotNullParameter(cloudFileInfo2, "$cloudFileInfo");
                            Intrinsics.checkNotNullParameter(this$4, "this$0");
                            if (((Response) obj2).getIsSuccess()) {
                                o00OO00O.f43313OooooOo.OooO00o().f43316OooO00o.postValue(cloudFileInfo2.getUrl());
                                LiveEventBus.get("RoomHeaderUrl").post(cloudFileInfo2.getUrl());
                                ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.OK));
                                this$4.setResult(-1);
                            }
                        }
                    });
                    break;
                }
                break;
            case 5:
                b this$4 = (b) this.f41453OooO0O0;
                Intrinsics.checkNotNullParameter(this$4, "this$0");
                MusicTable musicTableOooO0O0 = o00.f48461OooO00o.OooO0O0();
                TextView textView = this$4.f45905OoooO.f48921OooOOo0;
                if (musicTableOooO0O0 == null || (strOooO0OO = musicTableOooO0O0.mDisplayName) == null) {
                    strOooO0OO = OooOOO.OooO0OO(R.string.no_more_music);
                }
                textView.setText(strOooO0OO);
                break;
            default:
                MainRoomFragment.m449initObserver$lambda2((MainRoomFragment) this.f41453OooO0O0, obj);
                break;
        }
    }
}

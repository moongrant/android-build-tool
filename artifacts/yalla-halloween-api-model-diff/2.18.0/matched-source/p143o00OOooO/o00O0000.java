package p143o00OOooO;

import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.app.base.fragment.StoreCoinFragment;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.CloudFileInfo;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.data.manager.MusicState;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.moment.UserPostListActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o00OOO.OooO00o;
import p074o000O0oo.OooOOO;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o0O0ooO;
import p393o0OOooOo.o0O00000;
import p448o0OoOo0o.o0O0o000;
import p503o0o00o.o000O000;
import p581o0oOoOOo.a;
import p618o0oo0Ooo.oO0O000o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O0000 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31981OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31982OooO0O0;

    public /* synthetic */ o00O0000(Object obj, int i) {
        this.f31981OooO00o = i;
        this.f31982OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        boolean z = true;
        switch (this.f31981OooO00o) {
            case 0:
                StoreCoinFragment this$0 = (StoreCoinFragment) this.f31982OooO0O0;
                String url = (String) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0O00000.OooO0OO("Me_store_Room_UniqeID");
                if (!OooO0OO.OooO00o(url)) {
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.StoreCoin);
                    Intrinsics.checkNotNull(url);
                    Intrinsics.checkNotNullParameter(url, "url");
                    webPageInfo.f21237OoooO00 = url;
                    webPageInfo.f21239OoooOO0 = true;
                    webPageInfo.OooO0OO(o000O0O0.OooO0OO(R.string.room_unique_id));
                    WebActivity.OooO00o oooO00o = WebActivity.f22127ooOO;
                    FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                    oooO00o.OooO00o(fragmentActivityRequireActivity, webPageInfo);
                    break;
                }
                break;
            case 1:
                o000O000 this$1 = (o000O000) this.f31982OooO0O0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOOoo();
                break;
            case 2:
                SmsCodeActivity this$2 = (SmsCodeActivity) this.f31982OooO0O0;
                Boolean it = (Boolean) obj;
                SmsCodeActivity.OooO00o oooO00o2 = SmsCodeActivity.f21864oo000o;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                Intrinsics.checkNotNullExpressionValue(it, "it");
                this$2.f21875o00o0O = it.booleanValue();
                break;
            case 3:
                UserPostListActivity this$3 = (UserPostListActivity) this.f31982OooO0O0;
                MomentDetailModel momentDetailModel = (MomentDetailModel) obj;
                UserPostListActivity.OooO00o oooO00o3 = UserPostListActivity.f22693o00O0O;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                for (int i = 0; i < this$3.OooOooo().getData().size(); i++) {
                    if (this$3.OooOooo().getData().get(i).getId() == momentDetailModel.getId()) {
                        this$3.OooOooo().getData().get(i).setCommentNum(momentDetailModel.getCommentNum());
                        this$3.OooOooo().notifyItemChanged(this$3.OooOooo().getHeaderLayoutCount() + i);
                    }
                    break;
                }
                break;
            case 4:
                UserInfoEditActivity this$4 = (UserInfoEditActivity) this.f31982OooO0O0;
                CloudFileInfo cloudFileInfo = (CloudFileInfo) obj;
                UserInfoEditActivity.OooO00o oooO00o4 = UserInfoEditActivity.f23512o0Oo0oo;
                Intrinsics.checkNotNullParameter(this$4, "this$0");
                if (cloudFileInfo == null) {
                    this$4.f23518OoooooO = null;
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.Profile_photo_upload_failed);
                    ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (!z) {
                        o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O0.run();
                        } else {
                            o00O000 o00o001 = o00O000.f34368OooO00o;
                            o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                        }
                    }
                } else {
                    Intrinsics.checkNotNull(cloudFileInfo);
                    this$4.f23518OoooooO = cloudFileInfo.getUrl();
                    this$4.f23519Ooooooo = cloudFileInfo.getUploadInfo().getUploadType();
                    oO0O000o.OooO00o oooO00o5 = new oO0O000o.OooO00o(this$4);
                    oooO00o5.OooO00o(OooO00o.OooO0o0());
                    oooO00o5.f48447OooO0OO = CloudImageUtilKt.imgSize$default(cloudFileInfo.getUrl(), OooOo00.OooO00o(110), false, 2, null);
                    oooO00o5.f48445OooO00o = 0;
                    oooO00o5.OooO0o(this$4.OooOooo().f50436OooO0oo);
                }
                this$4.OooOoO();
                this$4.Oooo0o0();
                break;
            case 5:
                a this$5 = (a) this.f31982OooO0O0;
                MusicState.State state = (MusicState.State) obj;
                Intrinsics.checkNotNullParameter(this$5, "this$0");
                int i2 = state == null ? -1 : a.OooO00o.$EnumSwitchMapping$0[state.ordinal()];
                if (i2 == 1) {
                    this$5.f45896OoooOOO.f51066OooO.setImageResource(R.drawable.icon_room_music_playing);
                    MusicState musicState = MusicState.f21421OooO00o;
                    MusicTable value = MusicState.f21422OooO0O0.getValue();
                    if (value != null && value.mDuration == 0) {
                        int iOooO0oO = o0O0o000.OooO0O0().OooO00o().OooO0oO();
                        this$5.f45896OoooOOO.f51084OooOOoo.setText(this$5.OooOO0O(iOooO0oO));
                        value.mDuration = iOooO0oO;
                        p493o0o00O00.OooO0OO.OooO00o().OooOoO().OooO0OO(value);
                        break;
                    }
                } else if (i2 == 2) {
                    this$5.f45896OoooOOO.f51066OooO.setImageResource(R.drawable.icon_room_music_play);
                    break;
                } else if (i2 == 3) {
                    this$5.f45896OoooOOO.f51066OooO.setImageResource(R.drawable.icon_room_music_play);
                    break;
                }
                break;
            default:
                MainRoomFragment.m446initObserver$lambda0((MainRoomFragment) this.f31982OooO0O0, (Boolean) obj);
                break;
        }
    }
}

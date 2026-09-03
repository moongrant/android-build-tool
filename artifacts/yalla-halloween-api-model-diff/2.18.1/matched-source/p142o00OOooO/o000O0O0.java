package p142o00OOooO;

import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.app.base.fragment.StoreCoinFragment;
import com.app.base.framework.view.textView.ViewLocation;
import com.app.base.mixedroom.model.RoomConfiguration;
import com.app.base.model.ProfileLimitModel;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.GiftView;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.data.manager.MusicState;
import com.yalla.yalla.model.OnTopPostForUserPostModel;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import com.yalla.yalla.ui.activity.moment.UserPostListActivity;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p152o00Oo0o0.o00Oo00;
import p168o00Ooo0.oo000o;
import p445o0OoOo0o.o0O0OOOo;
import p498o0o00Oo0.OooOOO;
import p501o0o00o.o000;
import p579o0oOoOOo.b;
import p617o0oo0o.o00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O0O0 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31946OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31947OooO0O0;

    public /* synthetic */ o000O0O0(Object obj, int i) {
        this.f31946OooO00o = i;
        this.f31947OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String strOooO0OO;
        int i;
        RoomConfiguration roomConfiguration;
        ArrayList<ProfileLimitModel> profileLimit;
        ArrayList<ProfileLimitModel> profileLimit2;
        switch (this.f31946OooO00o) {
            case 0:
                StoreCoinFragment.m45initView$lambda2((StoreCoinFragment) this.f31947OooO0O0, (Boolean) obj);
                break;
            case 1:
                o000 this$0 = (o000) this.f31947OooO0O0;
                GiftView giftView = (GiftView) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (Intrinsics.areEqual(this$0.f41408OooOo0, giftView)) {
                    this$0.OooOoO(giftView, giftView.getF20944OoooO0());
                } else {
                    this$0.OooOOoo();
                }
                break;
            case 2:
                SmsCodeActivity this$1 = (SmsCodeActivity) this.f31947OooO0O0;
                SmsCodeActivity.OooO00o oooO00o = SmsCodeActivity.f21845o00Ooo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.finish();
                break;
            case 3:
                UserPostListActivity this$2 = (UserPostListActivity) this.f31947OooO0O0;
                OnTopPostForUserPostModel onTopPostForUserPostModel = (OnTopPostForUserPostModel) obj;
                UserPostListActivity.OooO00o oooO00o2 = UserPostListActivity.f22674Ooooooo;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                String userId = onTopPostForUserPostModel.getUserId();
                long postId = onTopPostForUserPostModel.getPostId();
                if (o0000O.OooO00o(OooOOO.f41216OooO00o, userId)) {
                    this$2.Oooo00o(postId);
                }
                break;
            case 4:
                RoomSettingActivity this$3 = (RoomSettingActivity) this.f31947OooO0O0;
                RoomSettingActivity.OooO00o oooO00o3 = RoomSettingActivity.f22969o00Ooo;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                this$3.f22979Ooooooo.setValue(null);
                RoomConfiguration roomConfiguration2 = this$3.f22972Ooooo0o;
                if (roomConfiguration2 == null || (profileLimit2 = roomConfiguration2.getProfileLimit()) == null) {
                    i = -1;
                } else {
                    int i2 = 0;
                    i = -1;
                    for (Object obj2 : profileLimit2) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((ProfileLimitModel) obj2).getOperationType() == 3) {
                            i = i2;
                        }
                        i2 = i3;
                    }
                }
                if (i > -1 && (roomConfiguration = this$3.f22972Ooooo0o) != null && (profileLimit = roomConfiguration.getProfileLimit()) != null) {
                    profileLimit.remove(i);
                    break;
                }
                break;
            case 5:
                UserInfoEditActivity this$4 = (UserInfoEditActivity) this.f31947OooO0O0;
                ProfileLimitModel profileLimitModel = (ProfileLimitModel) obj;
                UserInfoEditActivity.OooO00o oooO00o4 = UserInfoEditActivity.f23493o0ooOOo;
                Intrinsics.checkNotNullParameter(this$4, "this$0");
                this$4.OooOooo().f50504OooOOO0.setTextColor(p254o00ooO0O.o000O0O0.OooO00o(R.color.color_alpha_87));
                TextView textView = this$4.OooOooo().f50503OooOOO;
                String str = this$4.f23508o00oO0O;
                ViewLocation viewLocation = ViewLocation.end;
                o00Oo00.OooO0O0(textView, null, str, viewLocation, oo000o.OooO0o0());
                if (profileLimitModel != null) {
                    o00Oo00.OooO0O0(this$4.OooOooo().f50503OooOOO, this$4.f23513oo000o, this$4.f23508o00oO0O, viewLocation, oo000o.OooO0o0());
                    if (profileLimitModel.getExpireTime() <= 0 || profileLimitModel.getExpireTime() >= System.currentTimeMillis()) {
                        this$4.OooOooo().f50504OooOOO0.setText("");
                    } else {
                        this$4.OooOooo().f50504OooOOO0.setTextColor(p254o00ooO0O.o000O0O0.OooO00o(R.color.color_CCCCCC));
                    }
                }
                break;
            default:
                b this$5 = (b) this.f31947OooO0O0;
                MusicTable musicTable = (MusicTable) obj;
                Intrinsics.checkNotNullParameter(this$5, "this$0");
                if (musicTable != null) {
                    this$5.f45905OoooO.f48919OooOOOo.setText(musicTable.mDisplayName);
                    MusicTable musicTableOooO0O0 = o00.f48461OooO00o.OooO0O0();
                    TextView textView2 = this$5.f45905OoooO.f48921OooOOo0;
                    if (musicTableOooO0O0 == null || (strOooO0OO = musicTableOooO0O0.mDisplayName) == null) {
                        strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.no_more_music);
                    }
                    textView2.setText(strOooO0OO);
                    this$5.f45905OoooO.f48917OooOOO0.setMax(musicTable.mDuration);
                    this$5.f45905OoooO.f48917OooOOO0.setProgress(o0O0OOOo.OooO0O0().OooO00o().OooO());
                    this$5.f45905OoooO.f48922OooOOoo.setText(this$5.OooOO0O(musicTable.mDuration));
                    MusicState musicState = MusicState.f21402OooO00o;
                    if (MusicState.f21404OooO0OO.getValue() == MusicState.State.Playing) {
                        this$5.OooOO0o();
                    }
                }
                break;
        }
    }
}

package p143o00OOooO;

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
import p153o00Oo0o0.o00Oo00;
import p169o00Ooo0.oo000o;
import p448o0OoOo0o.o0O0o000;
import p500o0o00Oo0.OooOOO;
import p503o0o00o.o000O000;
import p581o0oOoOOo.a;
import p619o0oo0o.o00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O0O0 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31967OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31968OooO0O0;

    public /* synthetic */ o000O0O0(Object obj, int i) {
        this.f31967OooO00o = i;
        this.f31968OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String strOooO0OO;
        int i;
        RoomConfiguration roomConfiguration;
        ArrayList<ProfileLimitModel> profileLimit;
        ArrayList<ProfileLimitModel> profileLimit2;
        switch (this.f31967OooO00o) {
            case 0:
                StoreCoinFragment.m45initView$lambda2((StoreCoinFragment) this.f31968OooO0O0, (Boolean) obj);
                break;
            case 1:
                o000O000 this$0 = (o000O000) this.f31968OooO0O0;
                GiftView giftView = (GiftView) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (Intrinsics.areEqual(this$0.f41467OooOo0, giftView)) {
                    this$0.OooOoO(giftView, giftView.getF20965OoooOO0());
                } else {
                    this$0.OooOOoo();
                }
                break;
            case 2:
                SmsCodeActivity this$1 = (SmsCodeActivity) this.f31968OooO0O0;
                SmsCodeActivity.OooO00o oooO00o = SmsCodeActivity.f21864oo000o;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.finish();
                break;
            case 3:
                UserPostListActivity this$2 = (UserPostListActivity) this.f31968OooO0O0;
                OnTopPostForUserPostModel onTopPostForUserPostModel = (OnTopPostForUserPostModel) obj;
                UserPostListActivity.OooO00o oooO00o2 = UserPostListActivity.f22693o00O0O;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                String userId = onTopPostForUserPostModel.getUserId();
                long postId = onTopPostForUserPostModel.getPostId();
                if (o0000O.OooO00o(OooOOO.f41235OooO00o, userId)) {
                    this$2.Oooo00o(postId);
                }
                break;
            case 4:
                RoomSettingActivity this$3 = (RoomSettingActivity) this.f31968OooO0O0;
                RoomSettingActivity.OooO00o oooO00o3 = RoomSettingActivity.f22988oo000o;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                this$3.f22996o00O0O.setValue(null);
                RoomConfiguration roomConfiguration2 = this$3.f22991OooooOo;
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
                if (i > -1 && (roomConfiguration = this$3.f22991OooooOo) != null && (profileLimit = roomConfiguration.getProfileLimit()) != null) {
                    profileLimit.remove(i);
                    break;
                }
                break;
            case 5:
                UserInfoEditActivity this$4 = (UserInfoEditActivity) this.f31968OooO0O0;
                ProfileLimitModel profileLimitModel = (ProfileLimitModel) obj;
                UserInfoEditActivity.OooO00o oooO00o4 = UserInfoEditActivity.f23512o0Oo0oo;
                Intrinsics.checkNotNullParameter(this$4, "this$0");
                this$4.OooOooo().f50441OooOOO0.setTextColor(p255o00ooO0O.o000O0O0.OooO00o(R.color.color_alpha_87));
                TextView textView = this$4.OooOooo().f50440OooOOO;
                String str = this$4.f23531o0ooOoO;
                ViewLocation viewLocation = ViewLocation.end;
                o00Oo00.OooO0O0(textView, null, str, viewLocation, oo000o.OooO0o0());
                if (profileLimitModel != null) {
                    o00Oo00.OooO0O0(this$4.OooOooo().f50440OooOOO, this$4.f23529o0ooOO0, this$4.f23531o0ooOoO, viewLocation, oo000o.OooO0o0());
                    if (profileLimitModel.getExpireTime() <= 0 || profileLimitModel.getExpireTime() >= System.currentTimeMillis()) {
                        this$4.OooOooo().f50441OooOOO0.setText("");
                    } else {
                        this$4.OooOooo().f50441OooOOO0.setTextColor(p255o00ooO0O.o000O0O0.OooO00o(R.color.color_CCCCCC));
                    }
                }
                break;
            default:
                a this$5 = (a) this.f31968OooO0O0;
                MusicTable musicTable = (MusicTable) obj;
                Intrinsics.checkNotNullParameter(this$5, "this$0");
                if (musicTable != null) {
                    this$5.f45896OoooOOO.f51081OooOOOo.setText(musicTable.mDisplayName);
                    MusicTable musicTableOooO0O0 = o00.f48478OooO00o.OooO0O0();
                    TextView textView2 = this$5.f45896OoooOOO.f51083OooOOo0;
                    if (musicTableOooO0O0 == null || (strOooO0OO = musicTableOooO0O0.mDisplayName) == null) {
                        strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.no_more_music);
                    }
                    textView2.setText(strOooO0OO);
                    this$5.f45896OoooOOO.f51079OooOOO0.setMax(musicTable.mDuration);
                    this$5.f45896OoooOOO.f51079OooOOO0.setProgress(o0O0o000.OooO0O0().OooO00o().OooO());
                    this$5.f45896OoooOOO.f51084OooOOoo.setText(this$5.OooOO0O(musicTable.mDuration));
                    MusicState musicState = MusicState.f21421OooO00o;
                    if (MusicState.f21423OooO0OO.getValue() == MusicState.State.Playing) {
                        this$5.OooOO0o();
                    }
                }
                break;
        }
    }
}

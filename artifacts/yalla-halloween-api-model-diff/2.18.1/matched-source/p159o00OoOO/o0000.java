package p159o00OoOO;

import android.os.Looper;
import androidx.lifecycle.Observer;
import com.app.base.mixedroom.MixedRoomActivity;
import com.code.android.util.ToastUtil;
import com.facebook.appevents.AppEventsConstants;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.CloudFileInfo;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.ui.activity.account.PhoneBindActivity;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.fragment.BadgeFragment;
import java.util.List;
import java.util.Objects;
import kotlin.collections.unsigned.OooO00o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p498o0o00Oo0.OooOOO;
import p561o0oOOooo.oOo000Oo;
import p566o0oOo00O.o0O00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32399OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32400OooO0O0;

    public /* synthetic */ o0000(Object obj, int i) {
        this.f32399OooO00o = i;
        this.f32400OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        boolean z = true;
        switch (this.f32399OooO00o) {
            case 0:
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) this.f32400OooO0O0;
                mixedRoomActivity.OooOoO(mixedRoomActivity.f11802oo0o0Oo);
                break;
            case 1:
                PhoneBindActivity this$0 = (PhoneBindActivity) this.f32400OooO0O0;
                int i = PhoneBindActivity.f21800OooooO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.finish();
                break;
            case 2:
                RoomSettingActivity this$1 = (RoomSettingActivity) this.f32400OooO0O0;
                RoomSettingActivity.OooO00o oooO00o = RoomSettingActivity.f22969o00Ooo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOooo();
                break;
            case 3:
                oOo000Oo this$2 = (oOo000Oo) this.f32400OooO0O0;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
                this$2.OooO(-1, AppEventsConstants.EVENT_PARAM_VALUE_NO, true, ((Boolean) obj).booleanValue());
                break;
            case 4:
                UserInfoActivity this$3 = (UserInfoActivity) this.f32400OooO0O0;
                CloudFileInfo cloudFileInfo = (CloudFileInfo) obj;
                UserInfoActivity.OooO00o oooO00o2 = UserInfoActivity.f23452o0ooOO0;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                if (cloudFileInfo != null) {
                    Intrinsics.checkNotNull(cloudFileInfo);
                    String url = cloudFileInfo.getUrl();
                    int uploadType = cloudFileInfo.getUploadInfo().getUploadType();
                    Objects.requireNonNull(this$3);
                    o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
                    o00000OO.f32209OooO0OO.OooO00o(this$3, OooO00o.OooO0O0(OooOOO.f41216OooO00o), uploadType, CloudImageUtilKt.imgRemoveHost(url), new o0O00(this$3));
                    break;
                } else {
                    this$3.OooOoO();
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.Profile_photo_upload_failed);
                    ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (!z) {
                        o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o00O000 o00o001 = o00O000.f34346OooO00o;
                            o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                        } else {
                            o0o0oooOooO0O0.run();
                        }
                        break;
                    }
                }
                break;
            default:
                BadgeFragment.m307initData$lambda6((BadgeFragment) this.f32400OooO0O0, (List) obj);
                break;
        }
    }
}

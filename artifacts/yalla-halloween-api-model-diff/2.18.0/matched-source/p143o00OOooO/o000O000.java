package p143o00OOooO;

import android.app.Dialog;
import androidx.lifecycle.Observer;
import com.app.base.app.appConfig.apiDataModela.ApiCountryUtils;
import com.app.base.fragment.MomentListFeaturedFragment;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.model.RoomItemInfoModel;
import com.app.base.model.RoomItemInfoModelTag;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import com.yalla.yalla.ui.activity.moment.TopicSettingActivity;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import com.yalla.yalla.ui.fragment.BadgeRankDataFragment;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p524o0o0O0o.o00;
import p581o0oOoOOo.l;
import p581o0oOoOOo.n;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O000 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31964OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31965OooO0O0;

    public /* synthetic */ o000O000(Object obj, int i) {
        this.f31964OooO00o = i;
        this.f31965OooO0O0 = obj;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<com.app.base.model.RoomItemInfoModel>] */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(final Object obj) {
        int i = 0;
        switch (this.f31964OooO00o) {
            case 0:
                MomentListFeaturedFragment.m40initObserver$lambda7((MomentListFeaturedFragment) this.f31965OooO0O0, (Long) obj);
                break;
            case 1:
                final MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) this.f31965OooO0O0;
                int i2 = MixedRoomActivity.f11779o0000O00;
                Objects.requireNonNull(mixedRoomActivity);
                if (obj instanceof Dialog) {
                    n.OooO00o(false, true, new Function1() { // from class: o00OoOO.o0Oo0oo
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            MixedRoomActivity mixedRoomActivity2 = mixedRoomActivity;
                            Object obj3 = obj;
                            l lVar = (l) obj2;
                            int i3 = MixedRoomActivity.f11779o0000O00;
                            Objects.requireNonNull(mixedRoomActivity2);
                            o00.OooO00o((Dialog) obj3, lVar.f41564OoooO00);
                            mixedRoomActivity2.f11797o00000oO = lVar;
                            return null;
                        }
                    });
                }
                break;
            case 2:
                PhoneNumberActivity this$0 = (PhoneNumberActivity) this.f31965OooO0O0;
                PhoneNumberActivity.OooO00o oooO00o = PhoneNumberActivity.f21838Oooooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.finish();
                break;
            case 3:
                TopicSettingActivity this$1 = (TopicSettingActivity) this.f31965OooO0O0;
                String it = (String) obj;
                TopicSettingActivity.OooO00o oooO00o2 = TopicSettingActivity.f22685Oooooo0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                TopicInfoModel topicInfoModel = this$1.f22687OooooOO;
                if (topicInfoModel != null) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    topicInfoModel.setRule(it);
                }
                this$1.OooOoo().f49300OooO.setText(it);
                break;
            case 4:
                RoomSettingActivity this$2 = (RoomSettingActivity) this.f31965OooO0O0;
                Boolean bool = (Boolean) obj;
                RoomSettingActivity.OooO00o oooO00o3 = RoomSettingActivity.f22988oo000o;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                for (Object obj2 : this$2.f22990OooooOO) {
                    int i3 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    RoomItemInfoModel roomItemInfoModel = (RoomItemInfoModel) obj2;
                    if (roomItemInfoModel.getTag() == RoomItemInfoModelTag.AllowLockMic) {
                        roomItemInfoModel.setTurnOnSwitch(bool);
                        this$2.OooOoo().notifyDataSetChanged();
                    } else {
                        i = i3;
                    }
                    break;
                }
                break;
            case 5:
                UserInfoEditActivity this$3 = (UserInfoEditActivity) this.f31965OooO0O0;
                int iIntValue = ((Integer) obj).intValue();
                UserInfoEditActivity.OooO00o oooO00o4 = UserInfoEditActivity.f23512o0Oo0oo;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                String str = iIntValue + "";
                this$3.OooOooo().f50437OooOO0.setText((str.length() > 0 ? 1 : 0) != 0 ? ApiCountryUtils.INSTANCE.getModelNameForId(str) : "");
                break;
            default:
                BadgeRankDataFragment.m317initData$lambda3((BadgeRankDataFragment) this.f31965OooO0O0, (List) obj);
                break;
        }
    }
}

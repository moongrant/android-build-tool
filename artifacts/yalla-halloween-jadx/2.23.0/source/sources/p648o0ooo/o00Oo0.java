package p648o0ooo;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.code.android.util.OooO0O0;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.mixedroom.model.RoomConfiguration;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.share.ShareActivityModel;
import com.yalla.yalla.model.share.ShareContentModel;
import com.yalla.yalla.model.share.ShareContentType;
import com.yalla.yalla.model.share.ShareLogType;
import com.yalla.yalla.model.share.ShareToFriendModel;
import com.yalla.yalla.model.share.ShareWebModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import com.yalla.yalla.ui.vm.ShareLogViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f59760OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ShareLogViewModel f59761OooO0O0;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ShareContentModel f59762OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o00Oo0 f59763OooO0o0;

        /* JADX INFO: renamed from: o0ooo.o00Oo0$OooO00o$OooO00o, reason: collision with other inner class name */
        public /* synthetic */ class C0514OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ShareContentType.values().length];
                try {
                    iArr[ShareContentType.Room.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ShareContentType.Web.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ShareContentType.Events.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ShareContentModel shareContentModel, o00Oo0 o00oo1) {
            super(0);
            this.f59762OooO0Oo = shareContentModel;
            this.f59763OooO0o0 = o00oo1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ShareContentModel shareContentModel = this.f59762OooO0Oo;
            int i = C0514OooO00o.$EnumSwitchMapping$0[shareContentModel.getType().ordinal()];
            boolean z = true;
            o00Oo0 o00oo1 = this.f59763OooO0o0;
            String string = null;
            if (i == 1) {
                RoomConfiguration roomConfiguration = MixedRoomDataSource.OooO0o0().f23460OooO0o;
                string = roomConfiguration != null ? roomConfiguration.getBarid().toString() : null;
                ShareToFriendModel shareToFriendModel = new ShareToFriendModel(ShareContentType.Room);
                int i2 = ShareToFriendsActivity.f25730Oooo00o;
                ShareToFriendsActivity.OooO00o.OooO00o(o00oo1.f59760OooO00o, shareToFriendModel);
            } else if (i == 2) {
                ShareWebModel web = shareContentModel.getWeb();
                if (web != null) {
                    ShareActivityModel shareActivityModel = new ShareActivityModel();
                    String imagesUrl = web.getImagesUrl();
                    if (imagesUrl == null) {
                        imagesUrl = "";
                    }
                    shareActivityModel.setImage1(imagesUrl);
                    String imagesUrl2 = web.getImagesUrl();
                    if (imagesUrl2 == null) {
                        imagesUrl2 = "";
                    }
                    shareActivityModel.setImage2(imagesUrl2);
                    String title = web.getTitle();
                    if (title == null) {
                        title = "";
                    }
                    shareActivityModel.setText1(title);
                    String content = web.getContent();
                    if (content == null) {
                        content = "";
                    }
                    shareActivityModel.setText2(content);
                    String title2 = web.getTitle();
                    if (title2 == null) {
                        title2 = "";
                    }
                    shareActivityModel.setText3(title2);
                    String content2 = web.getContent();
                    if (content2 == null) {
                        content2 = "";
                    }
                    shareActivityModel.setText4(content2);
                    String url = web.getUrl();
                    shareActivityModel.setUrl(url != null ? url : "");
                    ShareToFriendModel shareToFriendModel2 = new ShareToFriendModel(ShareContentType.Web);
                    shareToFriendModel2.setShareActivityModel(shareActivityModel);
                    int i3 = ShareToFriendsActivity.f25730Oooo00o;
                    ShareToFriendsActivity.OooO00o.OooO00o(o00oo1.f59760OooO00o, shareToFriendModel2);
                }
            } else if (i != 3) {
                Intrinsics.checkNotNullParameter("Error：unsupported share type", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
            } else {
                EventModel event = shareContentModel.getEvent();
                if (event != null) {
                    string = String.valueOf(event.getId());
                    ShareToFriendModel shareToFriendModel3 = new ShareToFriendModel(ShareContentType.Events);
                    shareToFriendModel3.setEventModel(event);
                    int i4 = ShareToFriendsActivity.f25730Oooo00o;
                    ShareToFriendsActivity.OooO00o.OooO00o(o00oo1.f59760OooO00o, shareToFriendModel3);
                }
            }
            if (string != null && string.length() != 0) {
                z = false;
            }
            if (!z) {
                o00oo1.f59761OooO0O0.shareLog(shareContentModel.getType(), String.valueOf(string), ShareLogType.Friend);
            }
            return Unit.INSTANCE;
        }
    }

    public o00Oo0(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f59760OooO00o = activity;
        this.f59761OooO0O0 = (ShareLogViewModel) new ViewModelProvider(activity).get(ShareLogViewModel.class);
    }

    public final void OooO00o(@Nullable ShareContentModel shareContentModel) {
        if (shareContentModel == null) {
            return;
        }
        OooO00o onLogin = new OooO00o(shareContentModel, this);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i = LoginActivity.f25186OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }
}

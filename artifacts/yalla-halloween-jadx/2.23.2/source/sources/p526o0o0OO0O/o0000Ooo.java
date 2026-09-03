package p526o0o0OO0O;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.code.android.util.o0000;
import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.ShareDialog;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.share.ShareContentModel;
import com.yalla.yalla.model.share.ShareContentType;
import com.yalla.yalla.model.share.ShareLogType;
import com.yalla.yalla.model.share.ShareWebModel;
import com.yalla.yalla.repository.AppConfigRepo;
import com.yalla.yalla.ui.activity.BaseAppCompatActivity;
import com.yalla.yalla.ui.view.pop.roomSharePop.RoomShareModel;
import com.yalla.yalla.ui.vm.ShareLogViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO0.o0OoOo0;
import p205o00o0o0o.o000O;
import p562o0oOo000.o000000;
import p650o0ooo.o0O00o0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f53290OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ShareLogViewModel f53291OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final CallbackManager f53292OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ShareDialog f53293OooO0Oo;

    public /* synthetic */ class OooO00o {
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
                iArr[ShareContentType.WebH5Content.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShareContentType.Events.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f53295OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ShareContentModel f53296OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(ShareContentModel shareContentModel, String str) {
            super(0);
            this.f53296OooO0o0 = shareContentModel;
            this.f53295OooO0o = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0000Ooo.this.f53291OooO0O0.shareLog(this.f53296OooO0o0.getType(), String.valueOf(this.f53295OooO0o), ShareLogType.Facebook);
            return Unit.INSTANCE;
        }
    }

    public o0000Ooo(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f53290OooO00o = activity;
        this.f53291OooO0O0 = (ShareLogViewModel) new ViewModelProvider(activity).get(ShareLogViewModel.class);
        this.f53292OooO0OO = CallbackManager.Factory.create();
        this.f53293OooO0Oo = new ShareDialog(activity);
        FacebookSdk.setApplicationId(o0000.OooO0OO(o000000.single_facebook_app_id));
        Context applicationContext = activity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        FacebookSdk.sdkInitialize(applicationContext);
    }

    public final void OooO00o(@Nullable ShareContentModel shareContentModel) {
        String strOooO0O0;
        AppConfigRepo.f24292OooO00o.getClass();
        boolean zAreEqual = Intrinsics.areEqual(AppConfigRepo.f24294OooO0OO.getValue(), Boolean.TRUE);
        FragmentActivity fragmentActivity = this.f53290OooO00o;
        boolean z = true;
        if (zAreEqual) {
            int i = o000000.facebook_update_dialog_Content;
            Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
            o000O o000o = new o000O(fragmentActivity);
            o000o.OooOoO0(o000000.facebook_update_dialog_Title);
            o000o.OooOOoo(i);
            o000o.OooOo(true);
            o000o.OooOOOO(o000000.facebook_update_dialog_Update);
            o000o.OooOo0(o0O00o0.f58639OooO0Oo);
            o000o.OooOO0o();
            return;
        }
        if (shareContentModel == null) {
            return;
        }
        int i2 = OooO00o.$EnumSwitchMapping$0[shareContentModel.getType().ordinal()];
        String roomid = null;
        roomid = null;
        roomid = null;
        roomid = null;
        if (i2 == 1) {
            RoomShareModel room = shareContentModel.getRoom();
            String url = room != null ? room.getUrl() : null;
            RoomShareModel room2 = shareContentModel.getRoom();
            strOooO0O0 = o0OoOo0.OooO0O0(url, "?RoomId=", room2 != null ? room2.getRoomIdx() : null);
            RoomShareModel room3 = shareContentModel.getRoom();
            if (room3 != null) {
                roomid = room3.getRoomid();
            }
        } else if (i2 == 2) {
            ShareWebModel web = shareContentModel.getWeb();
            String url2 = web != null ? web.getUrl() : null;
            ShareWebModel web2 = shareContentModel.getWeb();
            strOooO0O0 = o0OoOo0.OooO0O0(url2, "?RoomId=", web2 != null ? web2.getIdx() : null);
            ShareWebModel web3 = shareContentModel.getWeb();
            if (web3 != null) {
                roomid = web3.getId();
            }
        } else if (i2 == 3) {
            ShareWebModel web4 = shareContentModel.getWeb();
            strOooO0O0 = web4 != null ? web4.getUrl() : null;
            ShareWebModel web5 = shareContentModel.getWeb();
            if (web5 != null) {
                roomid = web5.getId();
            }
        } else if (i2 != 4) {
            strOooO0O0 = null;
        } else {
            EventModel event = shareContentModel.getEvent();
            strOooO0O0 = event != null ? event.getEventShareUrl() : null;
            EventModel event2 = shareContentModel.getEvent();
            roomid = String.valueOf(event2 != null ? Long.valueOf(event2.getRoomIdx()) : null);
        }
        OooO0O0 oooO0O0 = new OooO0O0(shareContentModel, roomid);
        if (strOooO0O0 != null && !StringsKt.isBlank(strOooO0O0)) {
            z = false;
        }
        if (z) {
            return;
        }
        ShareLinkContent shareLinkContentBuild = new ShareLinkContent.Builder().setContentUrl(Uri.parse(strOooO0O0)).build();
        if (ShareDialog.INSTANCE.canShow(ShareLinkContent.class)) {
            if (fragmentActivity instanceof BaseAppCompatActivity) {
                ((BaseAppCompatActivity) fragmentActivity).f24677OooO0o0 = new o0000(this);
            }
            ShareDialog shareDialog = this.f53293OooO0Oo;
            shareDialog.registerCallback(this.f53292OooO0OO, new o0000O00());
            shareDialog.show(shareLinkContentBuild);
            oooO0O0.invoke();
        }
    }
}

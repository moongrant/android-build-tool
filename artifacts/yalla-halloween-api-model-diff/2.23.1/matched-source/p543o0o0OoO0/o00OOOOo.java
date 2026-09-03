package p543o0o0OoO0;

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
import p565o0oOo000.o000OOo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00OOOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f54853OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ShareLogViewModel f54854OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final CallbackManager f54855OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ShareDialog f54856OooO0Oo;

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
        public final /* synthetic */ String f54858OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ShareContentModel f54859OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(ShareContentModel shareContentModel, String str) {
            super(0);
            this.f54859OooO0o0 = shareContentModel;
            this.f54858OooO0o = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00OOOOo.this.f54854OooO0O0.shareLog(this.f54859OooO0o0.getType(), String.valueOf(this.f54858OooO0o), ShareLogType.Facebook);
            return Unit.INSTANCE;
        }
    }

    public o00OOOOo(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f54853OooO00o = activity;
        this.f54854OooO0O0 = (ShareLogViewModel) new ViewModelProvider(activity).get(ShareLogViewModel.class);
        this.f54855OooO0OO = CallbackManager.Factory.create();
        this.f54856OooO0Oo = new ShareDialog(activity);
        FacebookSdk.setApplicationId(o0000.OooO0OO(o000OOo.single_facebook_app_id));
        Context applicationContext = activity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        FacebookSdk.sdkInitialize(applicationContext);
    }

    public final void OooO00o(@Nullable ShareContentModel shareContentModel) {
        String strOooO00o;
        String roomid;
        if (shareContentModel == null) {
            return;
        }
        int i = OooO00o.$EnumSwitchMapping$0[shareContentModel.getType().ordinal()];
        boolean z = true;
        String str = null;
        str = null;
        str = null;
        str = null;
        if (i == 1) {
            RoomShareModel room = shareContentModel.getRoom();
            String url = room != null ? room.getUrl() : null;
            RoomShareModel room2 = shareContentModel.getRoom();
            strOooO00o = o0OoOo0.OooO00o(url, "?RoomId=", room2 != null ? room2.getRoomIdx() : null);
            RoomShareModel room3 = shareContentModel.getRoom();
            if (room3 != null) {
                roomid = room3.getRoomid();
                str = roomid;
            }
        } else if (i == 2) {
            ShareWebModel web = shareContentModel.getWeb();
            String url2 = web != null ? web.getUrl() : null;
            ShareWebModel web2 = shareContentModel.getWeb();
            strOooO00o = o0OoOo0.OooO00o(url2, "?RoomId=", web2 != null ? web2.getIdx() : null);
            ShareWebModel web3 = shareContentModel.getWeb();
            if (web3 != null) {
                roomid = web3.getId();
                str = roomid;
            }
        } else if (i == 3) {
            ShareWebModel web4 = shareContentModel.getWeb();
            strOooO00o = web4 != null ? web4.getUrl() : null;
            ShareWebModel web5 = shareContentModel.getWeb();
            if (web5 != null) {
                roomid = web5.getId();
                str = roomid;
            }
        } else if (i != 4) {
            strOooO00o = null;
        } else {
            EventModel event = shareContentModel.getEvent();
            strOooO00o = event != null ? event.getEventShareUrl() : null;
            EventModel event2 = shareContentModel.getEvent();
            roomid = String.valueOf(event2 != null ? Long.valueOf(event2.getRoomIdx()) : null);
            str = roomid;
        }
        OooO0O0 oooO0O0 = new OooO0O0(shareContentModel, str);
        if (strOooO00o != null && !StringsKt.isBlank(strOooO00o)) {
            z = false;
        }
        if (z) {
            return;
        }
        ShareLinkContent shareLinkContentBuild = new ShareLinkContent.Builder().setContentUrl(Uri.parse(strOooO00o)).build();
        if (ShareDialog.INSTANCE.canShow(ShareLinkContent.class)) {
            FragmentActivity fragmentActivity = this.f54853OooO00o;
            if (fragmentActivity instanceof BaseAppCompatActivity) {
                ((BaseAppCompatActivity) fragmentActivity).f24685OooO0o0 = new o00Oo00(this);
            }
            ShareDialog shareDialog = this.f54856OooO0Oo;
            shareDialog.registerCallback(this.f54855OooO0OO, new o0oOO());
            shareDialog.show(shareLinkContentBuild);
            oooO0O0.invoke();
        }
    }
}

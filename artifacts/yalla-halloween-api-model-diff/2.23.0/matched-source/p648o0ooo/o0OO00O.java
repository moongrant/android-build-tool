package p648o0ooo;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.code.android.util.OooO0O0;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.moment.MomentSendShareModel;
import com.yalla.yalla.model.moment.MomentSendShareType;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.model.share.ShareContentModel;
import com.yalla.yalla.model.share.ShareContentType;
import com.yalla.yalla.model.share.ShareLogType;
import com.yalla.yalla.model.share.ShareWebModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.view.pop.roomSharePop.RoomShareModel;
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
public final class o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f59774OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ShareLogViewModel f59775OooO0O0;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ShareContentModel f59776OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0OO00O f59777OooO0o0;

        /* JADX INFO: renamed from: o0ooo.o0OO00O$OooO00o$OooO00o, reason: collision with other inner class name */
        public /* synthetic */ class C0516OooO00o {
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
        public OooO00o(ShareContentModel shareContentModel, o0OO00O o0oo00o2) {
            super(0);
            this.f59776OooO0Oo = shareContentModel;
            this.f59777OooO0o0 = o0oo00o2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            String string;
            String strValueOf;
            ShareContentModel shareContentModel = this.f59776OooO0Oo;
            int i = C0516OooO00o.$EnumSwitchMapping$0[shareContentModel.getType().ordinal()];
            o0OO00O o0oo00o2 = this.f59777OooO0o0;
            if (i != 1) {
                if (i == 2) {
                    ShareWebModel web = shareContentModel.getWeb();
                    if (web != null) {
                        String id = web.getId();
                        if (!(id == null || id.length() == 0)) {
                            string = String.valueOf(web.getId());
                            int i2 = MomentSendActivity.f26175Oooo0OO;
                            FragmentActivity context = o0oo00o2.f59774OooO00o;
                            Intrinsics.checkNotNullParameter(context, "context");
                            MomentSendShareModel momentSendShareModel = new MomentSendShareModel(MomentType.Share.getValue());
                            momentSendShareModel.setSharePostType(MomentSendShareType.ShareWeb);
                            momentSendShareModel.setWebModel(web);
                            MomentSendActivity.OooO00o.OooO0O0(context, momentSendShareModel);
                            strValueOf = string;
                        }
                    }
                } else if (i != 3) {
                    Intrinsics.checkNotNullParameter("Error：unsupported share type", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
                } else {
                    EventModel event = shareContentModel.getEvent();
                    if (event != null) {
                        strValueOf = String.valueOf(event.getId());
                        MomentSendShareModel momentSendShareModel2 = new MomentSendShareModel(MomentType.Share.getValue());
                        momentSendShareModel2.setSharePostType(MomentSendShareType.ShareEvent);
                        momentSendShareModel2.setEventModel(shareContentModel.getEvent());
                        int i3 = MomentSendActivity.f26175Oooo0OO;
                        MomentSendActivity.OooO00o.OooO0O0(o0oo00o2.f59774OooO00o, momentSendShareModel2);
                    }
                }
                strValueOf = null;
            } else {
                RoomShareModel room = shareContentModel.getRoom();
                if (room != null) {
                    String roomid = room.getRoomid();
                    if (!(roomid == null || roomid.length() == 0)) {
                        string = room.getRoomid().toString();
                        RoomShareModel roomShareModel = new RoomShareModel(room.getTitle(), room.getContent(), room.getUrl(), room.getImageUrl(), room.getRoomid(), room.getRoomIdx(), 1);
                        int i4 = MomentSendActivity.f26175Oooo0OO;
                        FragmentActivity context2 = o0oo00o2.f59774OooO00o;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        MomentSendShareModel momentSendShareModel3 = new MomentSendShareModel(MomentType.Share.getValue());
                        momentSendShareModel3.setSharePostType(MomentSendShareType.ShareRoom);
                        momentSendShareModel3.setRoomShareModel(roomShareModel);
                        MomentSendActivity.OooO00o.OooO0O0(context2, momentSendShareModel3);
                        strValueOf = string;
                    }
                }
                strValueOf = null;
            }
            if (!(strValueOf == null || strValueOf.length() == 0)) {
                o0oo00o2.f59775OooO0O0.shareLog(shareContentModel.getType(), String.valueOf(strValueOf), ShareLogType.Moments);
            }
            return Unit.INSTANCE;
        }
    }

    public o0OO00O(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f59774OooO00o = activity;
        this.f59775OooO0O0 = (ShareLogViewModel) new ViewModelProvider(activity).get(ShareLogViewModel.class);
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

package p506o0o00oO0;

import androidx.fragment.app.FragmentActivity;
import com.app.base.view.pop.roomSharePop.RoomShareModel;
import com.yalla.yalla.common.model.ShareLogType;
import com.yalla.yalla.common.model.ShareModel;
import com.yalla.yalla.common.model.ShareType;
import com.yalla.yalla.common.model.ShareWebModel;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.model.MomentSendShareModel;
import com.yalla.yalla.model.MomentSendShareType;
import com.yalla.yalla.model.MomentType;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOOOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ShareModel f41653Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00Oo00 f41654Oooo0oO;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShareType.values().length];
            iArr[ShareType.Room.ordinal()] = 1;
            iArr[ShareType.Web.ordinal()] = 2;
            iArr[ShareType.Events.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOOOo(ShareModel shareModel, o00Oo00 o00oo00) {
        super(0);
        this.f41653Oooo0o = shareModel;
        this.f41654Oooo0oO = o00oo00;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EventModel event;
        int i = OooO00o.$EnumSwitchMapping$0[this.f41653Oooo0o.getType().ordinal()];
        String string = null;
        if (i == 1) {
            RoomShareModel room = this.f41653Oooo0o.getRoom();
            if (room != null) {
                o00Oo00 o00oo00 = this.f41654Oooo0oO;
                String roomid = room.getRoomid();
                if (!(roomid == null || roomid.length() == 0)) {
                    string = room.getRoomid().toString();
                    RoomShareModel roomShareModel = new RoomShareModel(room.getTitle(), room.getContent(), room.getUrl(), room.getImageUrl(), room.getRoomid(), room.getRoomIdx(), 1);
                    MomentSendActivity.OooO00o oooO00o = MomentSendActivity.f22367o00oO0o;
                    FragmentActivity context = o00oo00.f41655OooO00o;
                    Intrinsics.checkNotNullParameter(context, "context");
                    MomentSendShareModel momentSendShareModel = new MomentSendShareModel(MomentType.Share.getValue());
                    momentSendShareModel.setSharePostType(MomentSendShareType.ShareRoom);
                    momentSendShareModel.setRoomShareModel(roomShareModel);
                    oooO00o.OooO0O0(context, momentSendShareModel);
                }
            }
        } else if (i == 2) {
            ShareWebModel web = this.f41653Oooo0o.getWeb();
            if (web != null) {
                o00Oo00 o00oo01 = this.f41654Oooo0oO;
                String id = web.getId();
                if (!(id == null || id.length() == 0)) {
                    string = String.valueOf(web.getId());
                    MomentSendActivity.OooO00o oooO00o2 = MomentSendActivity.f22367o00oO0o;
                    FragmentActivity context2 = o00oo01.f41655OooO00o;
                    Intrinsics.checkNotNullParameter(context2, "context");
                    MomentSendShareModel momentSendShareModel2 = new MomentSendShareModel(MomentType.Share.getValue());
                    momentSendShareModel2.setSharePostType(MomentSendShareType.ShareWeb);
                    momentSendShareModel2.setWebModel(web);
                    oooO00o2.OooO0O0(context2, momentSendShareModel2);
                }
            }
        } else if (i == 3 && (event = this.f41653Oooo0o.getEvent()) != null) {
            o00Oo00 o00oo02 = this.f41654Oooo0oO;
            ShareModel shareModel = this.f41653Oooo0o;
            String strValueOf = String.valueOf(event.getId());
            MomentSendShareModel momentSendShareModel3 = new MomentSendShareModel(MomentType.Share.getValue());
            momentSendShareModel3.setSharePostType(MomentSendShareType.ShareEvent);
            momentSendShareModel3.setEventModel(shareModel.getEvent());
            MomentSendActivity.f22367o00oO0o.OooO0O0(o00oo02.f41655OooO00o, momentSendShareModel3);
            string = strValueOf;
        }
        if (!(string == null || string.length() == 0)) {
            this.f41654Oooo0oO.f41656OooO0O0.shareLog(this.f41653Oooo0o.getType(), String.valueOf(string), ShareLogType.Moments);
        }
        return Unit.INSTANCE;
    }
}

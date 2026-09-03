package p508o0o00oO0;

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
public final class o00Oo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ ShareModel f41669Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o0oOO f41670OoooO00;

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
    public o00Oo00(ShareModel shareModel, o0oOO o0ooo2) {
        super(0);
        this.f41669Oooo = shareModel;
        this.f41670OoooO00 = o0ooo2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EventModel event;
        int i = OooO00o.$EnumSwitchMapping$0[this.f41669Oooo.getType().ordinal()];
        String string = null;
        if (i == 1) {
            RoomShareModel room = this.f41669Oooo.getRoom();
            if (room != null) {
                o0oOO o0ooo2 = this.f41670OoooO00;
                String roomid = room.getRoomid();
                if (!(roomid == null || roomid.length() == 0)) {
                    string = room.getRoomid().toString();
                    RoomShareModel roomShareModel = new RoomShareModel(room.getTitle(), room.getContent(), room.getUrl(), room.getImageUrl(), room.getRoomid(), room.getRoomIdx(), 1);
                    MomentSendActivity.OooO00o oooO00o = MomentSendActivity.f22386o0ooOOo;
                    FragmentActivity context = o0ooo2.f41695OooO00o;
                    Intrinsics.checkNotNullParameter(context, "context");
                    MomentSendShareModel momentSendShareModel = new MomentSendShareModel(MomentType.Share.getValue());
                    momentSendShareModel.setSharePostType(MomentSendShareType.ShareRoom);
                    momentSendShareModel.setRoomShareModel(roomShareModel);
                    oooO00o.OooO0O0(context, momentSendShareModel);
                }
            }
        } else if (i == 2) {
            ShareWebModel web = this.f41669Oooo.getWeb();
            if (web != null) {
                o0oOO o0ooo3 = this.f41670OoooO00;
                String id = web.getId();
                if (!(id == null || id.length() == 0)) {
                    string = String.valueOf(web.getId());
                    MomentSendActivity.OooO00o oooO00o2 = MomentSendActivity.f22386o0ooOOo;
                    FragmentActivity context2 = o0ooo3.f41695OooO00o;
                    Intrinsics.checkNotNullParameter(context2, "context");
                    MomentSendShareModel momentSendShareModel2 = new MomentSendShareModel(MomentType.Share.getValue());
                    momentSendShareModel2.setSharePostType(MomentSendShareType.ShareWeb);
                    momentSendShareModel2.setWebModel(web);
                    oooO00o2.OooO0O0(context2, momentSendShareModel2);
                }
            }
        } else if (i == 3 && (event = this.f41669Oooo.getEvent()) != null) {
            o0oOO o0ooo4 = this.f41670OoooO00;
            ShareModel shareModel = this.f41669Oooo;
            String strValueOf = String.valueOf(event.getId());
            MomentSendShareModel momentSendShareModel3 = new MomentSendShareModel(MomentType.Share.getValue());
            momentSendShareModel3.setSharePostType(MomentSendShareType.ShareEvent);
            momentSendShareModel3.setEventModel(shareModel.getEvent());
            MomentSendActivity.f22386o0ooOOo.OooO0O0(o0ooo4.f41695OooO00o, momentSendShareModel3);
            string = strValueOf;
        }
        if (!(string == null || string.length() == 0)) {
            this.f41670OoooO00.f41696OooO0O0.shareLog(this.f41669Oooo.getType(), String.valueOf(string), ShareLogType.Moments);
        }
        return Unit.INSTANCE;
    }
}

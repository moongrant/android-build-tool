package OooOOO;

import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.mixedroom.room_bottom.RoomReplyView;
import com.app.base.model.ChatModel;
import com.qiniu.android.http.ResponseInfo;
import com.yallatech.support.platform.share.bean.ShareResponse;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p151o00Oo0Oo.OooOo;
import p163o00OoOOo.oo00oO;
import p548o0o0Ooo0.oO00OOOo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0o implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f163Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f164OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f165OoooO00;

    public /* synthetic */ OooO0o(Object obj, Object obj2, int i) {
        this.f163Oooo = i;
        this.f165OoooO00 = obj;
        this.f164OoooO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f163Oooo) {
            case 0:
                OooO this$0 = (OooO) this.f165OoooO00;
                OooO0OO this_apply = (OooO0OO) this.f164OoooO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                try {
                    this$0.OooO0o(this_apply.f162OooO0OO);
                } catch (Exception e) {
                    String message = e.getMessage();
                    String str = message != null ? message : "";
                    OooOOOO oooOOOO = this$0.f155OooO0O0;
                    Objects.requireNonNull(oooOOOO);
                    oooOOOO.OooO0Oo(ShareResponse.INSTANCE.createShareResponse(ResponseInfo.UnknownHost, str));
                }
                break;
            default:
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) this.f165OoooO00;
                ChatModel model = (ChatModel) this.f164OoooO0;
                oo00oO oo00oo = mixedRoomActivity.f11788o00000;
                if (oo00oo != null) {
                    Intrinsics.checkNotNullParameter(model, "model");
                    oo00oo.OooO0O0();
                    oO00OOOo oo00oooo = oo00oo.f32531OooO00o;
                    Objects.requireNonNull(oo00oooo);
                    Intrinsics.checkNotNullParameter(model, "model");
                    long userId = model.from.getUserId();
                    Long value = p500o0o00Oo0.OooOOO.f41235OooO00o.OooOo().getValue();
                    if (value != null && userId == value.longValue()) {
                        oo00oooo.OooO0OO().setText("");
                    } else {
                        oo00oooo.OooO0o0(new OooOo(model.from.getUserName(), model.from.getUserId()), false);
                    }
                    RoomReplyView roomReplyViewOooO0Oo = oo00oooo.OooO0Oo();
                    if (roomReplyViewOooO0Oo != null) {
                        roomReplyViewOooO0Oo.setChatModel(model);
                    }
                }
                break;
        }
    }
}

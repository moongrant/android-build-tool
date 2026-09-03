package OooOOO;

import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.mixedroom.room_bottom.RoomReplyView;
import com.app.base.model.ChatModel;
import com.qiniu.android.http.ResponseInfo;
import com.yallatech.support.platform.share.bean.ShareResponse;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p150o00Oo0Oo.OooOo;
import p162o00OoOOo.oo00oO;
import p546o0o0Ooo0.oO00Oo00;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0o implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f163Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f164Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f165Oooo0oo;

    public /* synthetic */ OooO0o(Object obj, Object obj2, int i) {
        this.f163Oooo0o = i;
        this.f164Oooo0oO = obj;
        this.f165Oooo0oo = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f163Oooo0o) {
            case 0:
                OooO this$0 = (OooO) this.f164Oooo0oO;
                OooO0OO this_apply = (OooO0OO) this.f165Oooo0oo;
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
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) this.f164Oooo0oO;
                ChatModel model = (ChatModel) this.f165Oooo0oo;
                oo00oO oo00oo = mixedRoomActivity.f11776o000000;
                if (oo00oo != null) {
                    Intrinsics.checkNotNullParameter(model, "model");
                    oo00oo.OooO0O0();
                    oO00Oo00 oo00oo00 = oo00oo.f32509OooO00o;
                    Objects.requireNonNull(oo00oo00);
                    Intrinsics.checkNotNullParameter(model, "model");
                    long userId = model.from.getUserId();
                    Long value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue();
                    if (value != null && userId == value.longValue()) {
                        oo00oo00.OooO0OO().setText("");
                    } else {
                        oo00oo00.OooO0o0(new OooOo(model.from.getUserName(), model.from.getUserId()), false);
                    }
                    RoomReplyView roomReplyViewOooO0Oo = oo00oo00.OooO0Oo();
                    if (roomReplyViewOooO0Oo != null) {
                        roomReplyViewOooO0Oo.setChatModel(model);
                    }
                }
                break;
        }
    }
}

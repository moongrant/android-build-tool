package p606o0oo00oO;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.app.base.app.appConfig.apiDataModela.ApiRoomShareUtils;
import com.app.base.model.ShareUrlModel;
import com.app.base.view.pop.roomSharePop.RoomShareModel;
import com.yalla.yalla.common.model.ShareModel;
import com.yalla.yalla.common.model.ShareType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00O;
import p100o000oOoO.o0OOO00;
import p393o0OOooOo.o0O00000;
import p532o0o0OOO.o00OO0O0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class ooOOOOoo extends ViewModel {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public o0O00O<Boolean> f48301OooO00o = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Boolean.FALSE);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f48302OooO0O0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(null);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f48303OooO0OO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(null);

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final ShareType OooO0O0() {
        return (ShareType) this.f48302OooO0O0.getValue();
    }

    public final void OooO0OO() {
        o0O00000.OooO0OO("InRoom_hostShare");
        ShareType shareType = ShareType.Room;
        this.f48302OooO0O0.setValue(shareType);
        ShareModel shareModel = new ShareModel(shareType);
        o00OO0O0.OooO00o oooO00o = o00OO0O0.f43338OooooOo;
        String value = oooO00o.OooO00o().f43342OooO0O0.getValue();
        String value2 = oooO00o.OooO00o().f43362OooOo0O.getValue();
        ShareUrlModel shareUrlModelLoad = ApiRoomShareUtils.INSTANCE.getShareUrlModelLoad();
        String shareUrl = shareUrlModelLoad != null ? shareUrlModelLoad.getShareUrl() : null;
        if (shareUrl == null) {
            shareUrl = "https://www.yalla.live/";
        } else {
            Intrinsics.checkNotNullExpressionValue(shareUrl, "ApiRoomShareUtils.shareU…reUrl ?: AppUrl.YallaLive");
        }
        shareModel.setRoom(new RoomShareModel(value, value2, shareUrl, oooO00o.OooO00o().f43341OooO00o.getValue(), String.valueOf(oooO00o.OooO00o().f43344OooO0Oo.getValue()), String.valueOf(oooO00o.OooO00o().f43343OooO0OO.getValue()), 1));
        this.f48303OooO0OO.setValue(shareModel);
        this.f48301OooO00o.setValue(Boolean.TRUE);
    }
}

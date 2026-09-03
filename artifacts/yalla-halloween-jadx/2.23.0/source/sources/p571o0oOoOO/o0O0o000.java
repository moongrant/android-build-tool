package p571o0oOoOO;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.yalla.yalla.app.golbalData.ApiRoomShareUtils;
import com.yalla.yalla.model.share.ShareContentModel;
import com.yalla.yalla.model.share.ShareContentType;
import com.yalla.yalla.model.share.ShareUrlModel;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.ui.view.pop.roomSharePop.RoomShareModel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nShareThirdVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareThirdVM.kt\ncom/yalla/yalla/ui/vm/ShareThirdVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,107:1\n81#2:108\n107#2,2:109\n81#2:111\n107#2,2:112\n81#2:114\n107#2,2:115\n81#2:117\n107#2,2:118\n81#2:120\n107#2,2:121\n*S KotlinDebug\n*F\n+ 1 ShareThirdVM.kt\ncom/yalla/yalla/ui/vm/ShareThirdVM\n*L\n25#1:108\n25#1:109,2\n27#1:111\n27#1:112,2\n31#1:114\n31#1:115,2\n35#1:117\n35#1:118,2\n39#1:120\n39#1:121,2\n*E\n"})
public final class o0O0o000 extends ViewModel {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f56247OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableState f56248OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableState f56249OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MutableState f56250OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState f56251OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final MutableState f56252OooO0o0;

    public o0O0o000() {
        Boolean bool = Boolean.FALSE;
        this.f56247OooO00o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f56248OooO0O0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f56249OooO0OO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f56250OooO0Oo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f56252OooO0o0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f56251OooO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooO0O0() {
        return ((Boolean) this.f56249OooO0OO.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final ShareContentModel OooO0OO() {
        return (ShareContentModel) this.f56248OooO0O0.getValue();
    }

    public final void OooO0Oo() {
        ShareContentModel shareContentModel = new ShareContentModel(ShareContentType.Room);
        OooO0O0.OooO00o oooO00o = OooO0O0.f24995OoooOOO;
        String strValueOf = String.valueOf(oooO00o.OooO00o().f25000OooO0OO.getValue());
        String value = oooO00o.OooO00o().f24999OooO0O0.getValue();
        String value2 = OooO00o.f24978OooO0o0.f47490OooO0o.getValue();
        if (StringsKt.isBlank(value2)) {
            value2 = o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.share_content_twitterOrWhatsApp), strValueOf);
        }
        String str = value2;
        ApiRoomShareUtils.f22714OooO00o.getClass();
        ShareUrlModel shareUrlModelOooO00o = ApiRoomShareUtils.OooO00o();
        String shareUrl = shareUrlModelOooO00o != null ? shareUrlModelOooO00o.getShareUrl() : null;
        if (shareUrl == null) {
            shareUrl = "https://www.yalla.live/";
        } else {
            Intrinsics.checkNotNullExpressionValue(shareUrl, "ApiRoomShareUtils.shareU…reUrl ?: AppUrl.YallaLive");
        }
        shareContentModel.setRoom(new RoomShareModel(value, str, shareUrl, oooO00o.OooO00o().f24998OooO00o.getValue(), String.valueOf(oooO00o.OooO00o().f25001OooO0Oo.getValue()), strValueOf, 1));
        this.f56248OooO0O0.setValue(shareContentModel);
        Boolean bool = Boolean.TRUE;
        this.f56249OooO0OO.setValue(bool);
        this.f56250OooO0Oo.setValue(bool);
        this.f56252OooO0o0.setValue(bool);
        this.f56247OooO00o.setValue(bool);
    }
}

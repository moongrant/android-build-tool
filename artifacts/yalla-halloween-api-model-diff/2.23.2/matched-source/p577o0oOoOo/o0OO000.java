package p577o0oOoOo;

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
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nShareThirdVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareThirdVM.kt\ncom/yalla/yalla/ui/vm/ShareThirdVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,107:1\n81#2:108\n107#2,2:109\n81#2:111\n107#2,2:112\n81#2:114\n107#2,2:115\n81#2:117\n107#2,2:118\n81#2:120\n107#2,2:121\n*S KotlinDebug\n*F\n+ 1 ShareThirdVM.kt\ncom/yalla/yalla/ui/vm/ShareThirdVM\n*L\n25#1:108\n25#1:109,2\n27#1:111\n27#1:112,2\n31#1:114\n31#1:115,2\n35#1:117\n35#1:118,2\n39#1:120\n39#1:121,2\n*E\n"})
public final class o0OO000 extends ViewModel {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f56514OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableState f56515OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableState f56516OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MutableState f56517OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState f56518OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final MutableState f56519OooO0o0;

    public o0OO000() {
        Boolean bool = Boolean.FALSE;
        this.f56514OooO00o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f56515OooO0O0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f56516OooO0OO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f56517OooO0Oo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f56519OooO0o0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f56518OooO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooO0O0() {
        return ((Boolean) this.f56516OooO0OO.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final ShareContentModel OooO0OO() {
        return (ShareContentModel) this.f56515OooO0O0.getValue();
    }

    public final void OooO0Oo() {
        ShareContentModel shareContentModel = new ShareContentModel(ShareContentType.Room);
        OooO0O0.OooO00o oooO00o = OooO0O0.f24533OoooOOO;
        String strValueOf = String.valueOf(oooO00o.OooO00o().f24538OooO0OO.getValue());
        String value = oooO00o.OooO00o().f24537OooO0O0.getValue();
        String value2 = OooO00o.f24516OooO0o0.f48463OooO0o.getValue();
        if (StringsKt.isBlank(value2)) {
            value2 = o0000O.OooO00o(o0000.OooO0OO(o000000.share_content_twitterOrWhatsApp), strValueOf);
        }
        String str = value2;
        ApiRoomShareUtils.f22241OooO00o.getClass();
        ShareUrlModel shareUrlModelOooO00o = ApiRoomShareUtils.OooO00o();
        String shareUrl = shareUrlModelOooO00o != null ? shareUrlModelOooO00o.getShareUrl() : null;
        if (shareUrl == null) {
            shareUrl = "https://www.yalla.live/";
        } else {
            Intrinsics.checkNotNull(shareUrl);
        }
        shareContentModel.setRoom(new RoomShareModel(value, str, shareUrl, oooO00o.OooO00o().f24536OooO00o.getValue(), String.valueOf(oooO00o.OooO00o().f24539OooO0Oo.getValue()), strValueOf, 1));
        this.f56515OooO0O0.setValue(shareContentModel);
        Boolean bool = Boolean.TRUE;
        this.f56516OooO0OO.setValue(bool);
        this.f56517OooO0Oo.setValue(bool);
        this.f56519OooO0o0.setValue(bool);
        this.f56514OooO00o.setValue(bool);
    }
}

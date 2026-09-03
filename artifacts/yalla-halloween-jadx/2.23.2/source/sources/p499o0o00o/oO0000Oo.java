package p499o0o00o;

import android.view.View;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.moment.MomentSendShareModel;
import com.yalla.yalla.model.moment.MomentSendShareType;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.activity.room.live.side.RoomScreenShotManager;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o0oo0000.OooO00o;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0000Oo extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ RoomScreenShotManager f50020OooO0oO;

    public oO0000Oo(RoomScreenShotManager roomScreenShotManager) {
        this.f50020OooO0oO = roomScreenShotManager;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        OooO00o.OooO0O0("102094");
        RoomScreenShotManager roomScreenShotManager = this.f50020OooO0oO;
        String str = roomScreenShotManager.f26362OooO0o;
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        int i = MomentSendActivity.f25726Oooo0OO;
        String str2 = roomScreenShotManager.f26362OooO0o;
        MixedRoomActivity context = roomScreenShotManager.f49626OooO00o;
        Intrinsics.checkNotNullParameter(context, "context");
        MomentSendShareModel momentSendShareModel = new MomentSendShareModel(MomentType.Image.getValue());
        momentSendShareModel.setSharePostType(MomentSendShareType.ShareImage);
        momentSendShareModel.setImagePath(str2);
        MomentSendActivity.OooO00o.OooO0O0(context, momentSendShareModel);
    }
}

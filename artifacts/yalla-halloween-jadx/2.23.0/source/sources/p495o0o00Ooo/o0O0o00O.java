package p495o0o00Ooo;

import android.view.View;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.moment.MomentSendShareModel;
import com.yalla.yalla.model.moment.MomentSendShareType;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.activity.room.live.side.RoomScreenShotManager;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p466o0Oooo0o.oo00o;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o00O extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ RoomScreenShotManager f48853OooO0oO;

    public o0O0o00O(RoomScreenShotManager roomScreenShotManager) {
        this.f48853OooO0oO = roomScreenShotManager;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        o0OO000.OooO00o("102094");
        RoomScreenShotManager roomScreenShotManager = this.f48853OooO0oO;
        String str = roomScreenShotManager.f26816OooO0o;
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        int i = MomentSendActivity.f26175Oooo0OO;
        String str2 = roomScreenShotManager.f26816OooO0o;
        MixedRoomActivity context = roomScreenShotManager.f48470OooO00o;
        Intrinsics.checkNotNullParameter(context, "context");
        MomentSendShareModel momentSendShareModel = new MomentSendShareModel(MomentType.Image.getValue());
        momentSendShareModel.setSharePostType(MomentSendShareType.ShareImage);
        momentSendShareModel.setImagePath(str2);
        MomentSendActivity.OooO00o.OooO0O0(context, momentSendShareModel);
    }
}

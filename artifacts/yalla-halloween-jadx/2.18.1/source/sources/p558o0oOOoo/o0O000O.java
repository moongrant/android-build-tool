package p558o0oOOoo;

import android.view.View;
import com.app.base.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.MomentSendShareModel;
import com.yalla.yalla.model.MomentSendShareType;
import com.yalla.yalla.model.MomentType;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.activity.room.live.side.RoomScreenShotManager;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p391o0OOooOo.o0O00000;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O000O extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ RoomScreenShotManager f44747Oooo;

    public o0O000O(RoomScreenShotManager roomScreenShotManager) {
        this.f44747Oooo = roomScreenShotManager;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        o0O00000.OooO0OO("Screenshot_share");
        String str = this.f44747Oooo.f23138OooO0o;
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        MomentSendActivity.OooO00o oooO00o = MomentSendActivity.f22367o00oO0o;
        RoomScreenShotManager roomScreenShotManager = this.f44747Oooo;
        MixedRoomActivity context = roomScreenShotManager.f44365OooO00o;
        String str2 = roomScreenShotManager.f23138OooO0o;
        Intrinsics.checkNotNullParameter(context, "context");
        MomentSendShareModel momentSendShareModel = new MomentSendShareModel(MomentType.Image.getValue());
        momentSendShareModel.setSharePostType(MomentSendShareType.ShareImage);
        momentSendShareModel.setImagePath(str2);
        oooO00o.OooO0O0(context, momentSendShareModel);
    }
}

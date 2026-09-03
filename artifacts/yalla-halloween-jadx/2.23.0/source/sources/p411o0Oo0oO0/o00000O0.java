package p411o0Oo0oO0;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooO0O0;
import com.didichuxing.doraemonkit.kit.AbstractKit;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00000O0 extends AbstractKit {
    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final int getIcon() {
        return oOo00OO0.event_setting;
    }

    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final int getName() {
        return oO00OOo0.didi_kit_lic_kit;
    }

    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final void onAppInit(@Nullable Context context) {
    }

    @Override // com.didichuxing.doraemonkit.kit.AbstractKit, com.didichuxing.doraemonkit.kit.IKit
    public final boolean onClickWithReturn(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        OooOOO0.OooO0OO("topActivityName", OooO0O0.OooO0OO());
        RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
        if (roomLiveService == null) {
            return true;
        }
        roomLiveService.OooO0o0();
        return true;
    }
}

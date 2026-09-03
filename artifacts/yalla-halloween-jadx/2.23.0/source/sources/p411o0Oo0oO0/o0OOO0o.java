package p411o0Oo0oO0;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.common.support.apm.Sailfish;
import com.didichuxing.doraemonkit.kit.AbstractKit;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0OOO0o extends AbstractKit {
    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final int getIcon() {
        return oOo00OO0.icon_home_explore_country_fire;
    }

    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final int getName() {
        return oO00OOo0.didi_kit_show_buried_point_upload;
    }

    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final void onAppInit(@Nullable Context context) {
    }

    @Override // com.didichuxing.doraemonkit.kit.AbstractKit, com.didichuxing.doraemonkit.kit.IKit
    public final void onClick(@Nullable Context context) {
        Sailfish.INSTANCE.flush();
    }
}

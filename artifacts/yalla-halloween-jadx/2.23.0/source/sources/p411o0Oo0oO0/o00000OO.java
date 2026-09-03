package p411o0Oo0oO0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooO0O0;
import com.didichuxing.doraemonkit.kit.AbstractKit;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00000OO extends AbstractKit {
    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final int getIcon() {
        return oOo00OO0.icon_gift_star;
    }

    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final int getName() {
        return oO00OOo0.didi_kit_net_monitor;
    }

    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final void onAppInit(@Nullable Context context) {
    }

    @Override // com.didichuxing.doraemonkit.kit.AbstractKit, com.didichuxing.doraemonkit.kit.IKit
    public final void onClick(@Nullable Context context) {
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            activityOooO0O0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("netmonitor://net/net")));
        }
    }
}

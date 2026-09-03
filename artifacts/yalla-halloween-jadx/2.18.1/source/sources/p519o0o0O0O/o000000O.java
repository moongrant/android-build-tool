package p519o0o0O0O;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.didichuxing.doraemonkit.kit.AbstractKit;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.main.ChangeRegionActivity;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o00000O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o000000O extends AbstractKit {
    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final int getIcon() {
        return R.drawable.icon_add_photo;
    }

    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final int getName() {
        return R.string.didi_kit_change_language;
    }

    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final void onAppInit(@Nullable Context context) {
    }

    @Override // com.didichuxing.doraemonkit.kit.AbstractKit, com.didichuxing.doraemonkit.kit.IKit
    public final void onClick(@Nullable Context context) {
        Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
        if (activityOooO0O0 != null) {
            activityOooO0O0.startActivity(new Intent(activityOooO0O0, (Class<?>) ChangeRegionActivity.class));
        }
    }
}

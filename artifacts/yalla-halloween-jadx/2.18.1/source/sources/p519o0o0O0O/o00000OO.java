package p519o0o0O0O;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.didichuxing.doraemonkit.kit.AbstractKit;
import com.weieyu.yalla.R;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o00oOoo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00000OO extends AbstractKit {
    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final int getIcon() {
        return R.drawable.medalrankingstong_avatar_2;
    }

    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final int getName() {
        return R.string.didi_kit_xbf_test;
    }

    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final void onAppInit(@Nullable Context context) {
    }

    @Override // com.didichuxing.doraemonkit.kit.AbstractKit, com.didichuxing.doraemonkit.kit.IKit
    public final void onClick(@Nullable Context context) {
        o00oOoo.OooO0O0("1");
    }
}

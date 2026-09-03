package p519o0o0O0O;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.didichuxing.doraemonkit.kit.AbstractKit;
import com.weieyu.yalla.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p530o0o0OOO.oo0O;
import p533o0o0OOOo.oO0000O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00000O0 extends AbstractKit {
    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final int getIcon() {
        return R.drawable.room_theme_send_gift;
    }

    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final int getName() {
        return R.string.didi_kit_room;
    }

    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final void onAppInit(@Nullable Context context) {
    }

    @Override // com.didichuxing.doraemonkit.kit.AbstractKit, com.didichuxing.doraemonkit.kit.IKit
    public final boolean onClickWithReturn(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        oo0O oo0o = oo0O.f43387OooO00o;
        oO0000O oo0000o = oo0O.f43388OooO0O0;
        byte[] bytes = "{\"code\":0,\"isVIP\":1,\"nVIPLv\":100,\"uid\":94579}".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        oo0000o.OooO0Oo(10045, bytes);
        return true;
    }
}

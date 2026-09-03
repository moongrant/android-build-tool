package p417o0Oo0oo0;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o000O00;
import com.didichuxing.doraemonkit.kit.AbstractKit;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p386o0OOooO.o0OOO0o;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00000OO extends AbstractKit {
    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final int getIcon() {
        return o0Oo0oo.event_setting;
    }

    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final int getName() {
        return o000000.didi_kit_theme_switch;
    }

    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final void onAppInit(@Nullable Context context) {
    }

    @Override // com.didichuxing.doraemonkit.kit.AbstractKit, com.didichuxing.doraemonkit.kit.IKit
    public final boolean onClickWithReturn(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!(activity instanceof ScreenNavigationActivity)) {
            o000O00.OooO0O0("the current page not support theme switch");
            return true;
        }
        Lazy lazy = o0OOO0o.f43500OooO0O0;
        MutableLiveData<Integer> mutableLiveData = o0OOO0o.f43502OooO0Oo;
        Integer value = mutableLiveData.getValue();
        if (value != null && value.intValue() == 1) {
            mutableLiveData.setValue(2);
        } else if (value != null && value.intValue() == 2) {
            mutableLiveData.setValue(1);
        } else if (value != null && value.intValue() == 0) {
            if ((((ScreenNavigationActivity) activity).getResources().getConfiguration().uiMode & 48) == 32) {
                mutableLiveData.setValue(1);
            } else {
                mutableLiveData.setValue(2);
            }
        }
        return true;
    }
}

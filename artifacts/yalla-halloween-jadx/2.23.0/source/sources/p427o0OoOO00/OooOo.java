package p427o0OoOO00;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.manager.AppUIThemeConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.oo000o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<Integer> f45669OooO00o = new MutableLiveData<>(Integer.valueOf(((oo000o) o00Oo0.f45188OooOOO0.getValue()).OooO0OO("config", 0)));

    @NotNull
    public static AppUIThemeConfig OooO00o(@Nullable Integer num) {
        if (num != null && num.intValue() == 0) {
            return AppUIThemeConfig.NORMAL;
        }
        if (num != null && num.intValue() == 1) {
            return AppUIThemeConfig.RAMADAN;
        }
        return (num != null && num.intValue() == 2) ? AppUIThemeConfig.SEVEN_YEAR : AppUIThemeConfig.NORMAL;
    }
}

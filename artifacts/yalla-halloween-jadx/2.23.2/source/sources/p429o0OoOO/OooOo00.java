package p429o0OoOO;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.manager.AppUIThemeConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p414o0Oo0oO.oO000O0O;
import p415o0Oo0oO0.o00Ooo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<Integer> f46776OooO00o = new MutableLiveData<>(Integer.valueOf(((oO000O0O) o00Ooo.f46419OooOOO0.getValue()).OooO0OO("config", 0)));

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

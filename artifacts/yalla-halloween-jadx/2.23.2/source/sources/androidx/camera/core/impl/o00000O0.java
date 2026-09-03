package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00000O0 {
    @NonNull
    public static o00O0O00 OooO00o(@Nullable Config config, @Nullable Config config2) {
        if (config == null && config2 == null) {
            return o00O0O00.f3722Oooo00O;
        }
        oOO00O ooo00oOooo0o0 = config2 != null ? oOO00O.Oooo0o0(config2) : oOO00O.Oooo0OO();
        if (config != null) {
            Iterator<Config.OooO00o<?>> it = config.OooO0oo().iterator();
            while (it.hasNext()) {
                OooO0O0(ooo00oOooo0o0, config2, config, it.next());
            }
        }
        return o00O0O00.Oooo0O0(ooo00oOooo0o0);
    }

    public static void OooO0O0(@NonNull oOO00O ooo00o, @NonNull Config config, @NonNull Config config2, @NonNull Config.OooO00o<?> oooO00o) {
        if (!Objects.equals(oooO00o, ImageOutputConfig.f3547OooOOoo)) {
            ooo00o.Oooo0o(oooO00o, config2.OooOoo(oooO00o), config2.OooO0O0(oooO00o));
            return;
        }
        ResolutionSelector resolutionSelector = (ResolutionSelector) config2.OooOoO(oooO00o, null);
        ResolutionSelector resolutionSelector2 = (ResolutionSelector) config.OooOoO(oooO00o, null);
        Config.OptionPriority optionPriorityOooOoo = config2.OooOoo(oooO00o);
        if (resolutionSelector == null) {
            resolutionSelector = resolutionSelector2;
        } else if (resolutionSelector2 != null) {
            AspectRatioStrategy aspectRatioStrategy = resolutionSelector.f3843OooO00o;
            if (aspectRatioStrategy == null) {
                aspectRatioStrategy = resolutionSelector2.f3843OooO00o;
            }
            ResolutionStrategy resolutionStrategy = resolutionSelector.f3844OooO0O0;
            if (resolutionStrategy == null) {
                resolutionStrategy = resolutionSelector2.f3844OooO0O0;
            }
            int i = resolutionSelector.f3845OooO0OO;
            if (i == 0) {
                i = resolutionSelector2.f3845OooO0OO;
            }
            resolutionSelector2 = new ResolutionSelector(aspectRatioStrategy, resolutionStrategy, i);
            resolutionSelector = resolutionSelector2;
        }
        ooo00o.Oooo0o(oooO00o, optionPriorityOooOoo, resolutionSelector);
    }
}

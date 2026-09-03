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
    public static o00O0 OooO00o(@Nullable Config config, @Nullable Config config2) {
        if (config == null && config2 == null) {
            return o00O0.f3709Oooo00O;
        }
        o00O00O o00o00oOooo0o0 = config2 != null ? o00O00O.Oooo0o0(config2) : o00O00O.Oooo0OO();
        if (config != null) {
            Iterator<Config.OooO00o<?>> it = config.OooO0oo().iterator();
            while (it.hasNext()) {
                OooO0O0(o00o00oOooo0o0, config2, config, it.next());
            }
        }
        return o00O0.Oooo0O0(o00o00oOooo0o0);
    }

    public static void OooO0O0(@NonNull o00O00O o00o00o2, @NonNull Config config, @NonNull Config config2, @NonNull Config.OooO00o<?> oooO00o) {
        if (!Objects.equals(oooO00o, ImageOutputConfig.f3549OooOOoo)) {
            o00o00o2.Oooo0o(oooO00o, config2.OooOoo(oooO00o), config2.OooO0O0(oooO00o));
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
        o00o00o2.Oooo0o(oooO00o, optionPriorityOooOoo, resolutionSelector);
    }
}

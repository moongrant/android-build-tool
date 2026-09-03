package androidx.camera.core.impl;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi(21)
public abstract class SurfaceConfig {

    public enum ConfigSize {
        VGA(0),
        s720p(1),
        PREVIEW(2),
        s1440p(3),
        RECORD(4),
        MAXIMUM(5),
        ULTRA_MAXIMUM(6),
        NOT_SUPPORT(7);

        final int mId;

        ConfigSize(int i) {
            this.mId = i;
        }
    }

    public enum ConfigType {
        PRIV,
        YUV,
        JPEG,
        RAW
    }

    @NonNull
    public static Oooo000 OooO00o(@NonNull ConfigType configType, @NonNull ConfigSize configSize) {
        return new Oooo000(configType, configSize, 0L);
    }

    @NonNull
    public static Oooo000 OooO0o0(int i, int i2, @NonNull Size size, @NonNull Oooo0 oooo0) {
        ConfigType configType;
        if (i2 == 35) {
            configType = ConfigType.YUV;
        } else if (i2 == 256) {
            configType = ConfigType.JPEG;
        } else {
            configType = i2 == 32 ? ConfigType.RAW : ConfigType.PRIV;
        }
        ConfigSize configSize = ConfigSize.NOT_SUPPORT;
        Size size2 = p036OoooOOo.o0000oo.f1445OooO00o;
        int height = size.getHeight() * size.getWidth();
        if (i == 1) {
            if (height <= p036OoooOOo.o0000oo.OooO00o(oooo0.f3604OooO0O0.get(Integer.valueOf(i2)))) {
                configSize = ConfigSize.s720p;
            } else {
                if (height <= p036OoooOOo.o0000oo.OooO00o(oooo0.f3606OooO0Oo.get(Integer.valueOf(i2)))) {
                    configSize = ConfigSize.s1440p;
                }
            }
        } else if (height <= p036OoooOOo.o0000oo.OooO00o(oooo0.f3603OooO00o)) {
            configSize = ConfigSize.VGA;
        } else if (height <= p036OoooOOo.o0000oo.OooO00o(oooo0.f3605OooO0OO)) {
            configSize = ConfigSize.PREVIEW;
        } else if (height <= p036OoooOOo.o0000oo.OooO00o(oooo0.f3608OooO0o0)) {
            configSize = ConfigSize.RECORD;
        } else if (height <= p036OoooOOo.o0000oo.OooO00o(oooo0.OooO0O0().get(Integer.valueOf(i2)))) {
            configSize = ConfigSize.MAXIMUM;
        } else {
            Size size3 = oooo0.f3609OooO0oO.get(Integer.valueOf(i2));
            if (size3 != null) {
                if (height <= size3.getHeight() * size3.getWidth()) {
                    configSize = ConfigSize.ULTRA_MAXIMUM;
                }
            }
        }
        return OooO00o(configType, configSize);
    }

    @NonNull
    public abstract ConfigSize OooO0O0();

    @NonNull
    public abstract ConfigType OooO0OO();

    public abstract long OooO0Oo();
}

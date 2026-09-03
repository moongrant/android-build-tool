package p022Oooo00O;

import android.util.JsonReader;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.o00OO0OO;
import io.opentelemetry.compat.Supplier;
import io.opentelemetry.sdk.trace.SpanLimits;
import java.util.ArrayList;
import p288o0O0Oo0O.OooOOO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O00oO0 implements OooOOO.OooO00o, Supplier {
    public static o00OO0OO OooO00o(SurfaceConfig.ConfigType configType, SurfaceConfig.ConfigSize configSize, o00OO0OO o00oo0oo, SurfaceConfig.ConfigType configType2, SurfaceConfig.ConfigSize configSize2, ArrayList arrayList, o00OO0OO o00oo0oo2) {
        o00oo0oo.OooO00o(SurfaceConfig.OooO00o(configType, configSize));
        o00oo0oo.OooO00o(SurfaceConfig.OooO00o(configType2, configSize2));
        arrayList.add(o00oo0oo2);
        return new o00OO0OO();
    }

    @Override // o0O0Oo0O.OooOOO.OooO00o
    public Object OooO0O0(JsonReader jsonReader) {
        return OooOOO.OooO0O0(jsonReader);
    }

    @Override // io.opentelemetry.compat.Supplier
    public Object get() {
        return SpanLimits.f33525OooO00o;
    }
}

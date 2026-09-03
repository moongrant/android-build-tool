package p022Oooo00O;

import android.os.Bundle;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.o00OO;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.media3.common.OooO0OO;
import androidx.media3.session.LibraryResult;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.InstrumentManager;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import oo0OOoo.OooO00o;
import p233o00oOoOO.o0O000o0;
import p288o0O0Oo.OooO0O0;
import p299o0O0o00.oo000o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O00oO0 implements OooO0OO.OooO00o, FeatureManager.Callback, o0O000o0 {
    public static o00OO OooO00o(SurfaceConfig.ConfigType configType, SurfaceConfig.ConfigSize configSize, o00OO o00oo2, SurfaceConfig.ConfigType configType2, SurfaceConfig.ConfigSize configSize2, ArrayList arrayList, o00OO o00oo3) {
        o00oo2.OooO00o(SurfaceConfig.OooO00o(configType, configSize));
        o00oo2.OooO00o(SurfaceConfig.OooO00o(configType2, configSize2));
        arrayList.add(o00oo3);
        return new o00OO();
    }

    public static MeasurePolicy OooO0O0(Alignment.Companion companion, Arrangement.Vertical vertical, Composer composer, int i, int i2) {
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(vertical, companion.getStart(), composer, i);
        composer.startReplaceableGroup(i2);
        return measurePolicyColumnMeasurePolicy;
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public OooO0OO OooO0OO(Bundle bundle) {
        return LibraryResult.OooO0OO(bundle, null);
    }

    @Override // p233o00oOoOO.o0O000o0
    public Object apply(Object obj) {
        CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
        OooO00o.f60310OooO0O0.getClass();
        oo000o oo000oVar = OooO0O0.f41451OooO00o;
        oo000oVar.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            oo000oVar.OooO00o(stringWriter, crashlyticsReport);
        } catch (IOException unused) {
        }
        return stringWriter.toString().getBytes(Charset.forName("UTF-8"));
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public void onCompleted(boolean z) {
        InstrumentManager.m4151start$lambda2(z);
    }
}

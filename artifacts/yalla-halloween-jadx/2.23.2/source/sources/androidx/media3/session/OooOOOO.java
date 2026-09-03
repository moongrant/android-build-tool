package androidx.media3.session;

import android.os.Bundle;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.common.support.apm.otlp.biz.HttpTracer;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.InstrumentManager;
import io.opentelemetry.context.propagation.TextMapSetter;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooOOOO implements androidx.media3.common.OooO0OO.OooO00o, TextMapSetter, FeatureManager.Callback, o000OoO.o00000O0.OooO00o {
    public /* synthetic */ OooOOOO(AnalyticsListener.OooO00o oooO00o, int i) {
    }

    @Override // io.opentelemetry.context.propagation.TextMapSetter
    public void OooO00o(LinkedHashMap linkedHashMap, String str, String str2) {
        HttpTracer.m4024textMapSetter$lambda0(linkedHashMap, str, str2);
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        return LibraryResult.OooO0OO(bundle, 2);
    }

    @Override // o000OoO.o00000O0.OooO00o
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).OoooOOo();
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public void onCompleted(boolean z) {
        InstrumentManager.m4149start$lambda0(z);
    }
}

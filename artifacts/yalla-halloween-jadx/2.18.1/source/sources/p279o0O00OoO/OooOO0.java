package p279o0O00OoO;

import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.InstrumentManager;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.nio.charset.Charset;
import o0O0O0Oo.OooO0o;
import o0OOo00.OooO00o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOO0 implements FeatureManager.Callback, OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ OooOO0 f35144OooO0Oo = new OooOO0();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ OooOO0 f35145OooO0o0 = new OooOO0();

    @Override // o0O0O0Oo.OooO0o
    public final Object apply(Object obj) {
        return OooO00o.f38584OooO0O0.OooO0oo((CrashlyticsReport) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public final void onCompleted(boolean z) {
        InstrumentManager.m203start$lambda1(z);
    }
}

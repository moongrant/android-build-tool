package p279o0O00OoO;

import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.InstrumentManager;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO implements FeatureManager.Callback {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ OooO f35141OooO0Oo = new OooO();

    public static int OooO00o() {
        return String.valueOf(System.currentTimeMillis()).length();
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public void onCompleted(boolean z) {
        InstrumentManager.m204start$lambda2(z);
    }
}

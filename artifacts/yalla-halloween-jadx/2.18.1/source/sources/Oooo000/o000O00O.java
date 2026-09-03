package Oooo000;

import androidx.compose.foundation.layout.SizeKt;
import com.facebook.appevents.AppEventsManager;
import com.facebook.internal.FeatureManager;
import p048OoooooO.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O00O implements FeatureManager.Callback {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ o000O00O f871OooO0Oo = new o000O00O();

    public static int OooO00o(float f, int i, int i2) {
        return (Float.floatToIntBits(f) + i) * i2;
    }

    public static o00OOOO0 OooO0O0(p100o000oOoO.oOO00O ooo00o, int i, int i2, o00OOOO0.OooO00o oooO00o) {
        ooo00o.OooO0o0(i);
        ooo00o.OooO0o0(i2);
        return SizeKt.OooO0o(oooO00o);
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public void onCompleted(boolean z) {
        AppEventsManager.AnonymousClass1.m123onSuccess$lambda4(z);
    }
}

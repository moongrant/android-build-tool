package p022Oooo00O;

import android.hardware.camera2.TotalCaptureResult;
import android.os.Bundle;
import com.google.android.exoplayer2.OooO;
import com.google.android.exoplayer2.trackselection.OooO0O0;
import com.google.firebase.components.oo000o;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;
import p245o00oo0o.o00O000o;
import p464o0Oooo.o0O00oO0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00 implements o000O0Oo.OooO.OooO00o, OooO.OooO00o, com.google.firebase.components.OooO {
    public static void OooO0Oo(o0O00oO0 o0o00oo1, String str, String str2, CancellableContinuation cancellableContinuation) {
        o0o00oo1.getClass();
        cancellableContinuation.resumeWith(Result.m4213constructorimpl(o0O00oO0.OooO00o(str, str2)));
    }

    @Override // Oooo00O.o000O0Oo.OooO.OooO00o
    public boolean OooO00o(TotalCaptureResult totalCaptureResult) {
        return o000O0Oo.OooO00o(totalCaptureResult, false);
    }

    @Override // com.google.android.exoplayer2.OooO.OooO00o
    public OooO OooO0O0(Bundle bundle) {
        int i = bundle.getInt(OooO0O0.OooO0o.f13699OooO0oO, -1);
        int[] intArray = bundle.getIntArray(OooO0O0.OooO0o.f13700OooO0oo);
        int i2 = bundle.getInt(OooO0O0.OooO0o.f13698OooO, -1);
        o00O000o.OooO00o(i >= 0 && i2 >= 0);
        intArray.getClass();
        return new OooO0O0.OooO0o(i, i2, intArray);
    }

    @Override // com.google.firebase.components.OooO
    public Object OooO0OO(oo000o oo000oVar) {
        return FirebaseMessagingRegistrar.lambda$getComponents$0(oo000oVar);
    }
}

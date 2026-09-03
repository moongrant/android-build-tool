package p036OoooOOo;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.OooOOO0;
import androidx.camera.core.impl.CameraCaptureMetaData$AeState;
import androidx.camera.core.impl.CameraCaptureMetaData$AfState;
import androidx.camera.core.impl.CameraCaptureMetaData$AwbState;
import androidx.camera.core.impl.o00Oo0;
import p022Oooo00O.o0OO0oO0;
import p028Oooo0oO.oo00o;
import p034OoooOO0.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0000O0 extends o0000<OooOOO0> {
    public o0000O0(@NonNull o0OO0oO0 o0oo0oo1) {
        super(3, o0oo0oo1);
    }

    @Override // p036OoooOOo.o0000
    /* JADX INFO: renamed from: OooO0Oo, reason: merged with bridge method [inline-methods] */
    public final void OooO0O0(@NonNull OooOOO0 oooOOO0) throws Exception {
        oo00o oo00oVarO00000OO = oooOOO0.o00000OO();
        o00Oo0 o00oo1 = oo00oVarO00000OO instanceof o0OoOo0 ? ((o0OoOo0) oo00oVarO00000OO).f1461OooO00o : null;
        if ((o00oo1.OooO0o() == CameraCaptureMetaData$AfState.LOCKED_FOCUSED || o00oo1.OooO0o() == CameraCaptureMetaData$AfState.PASSIVE_FOCUSED) && o00oo1.OooO0oo() == CameraCaptureMetaData$AeState.CONVERGED && o00oo1.OooO0oO() == CameraCaptureMetaData$AwbState.CONVERGED) {
            super.OooO0O0(oooOOO0);
        } else {
            ((o0OO0oO0) this.f1472OooO0Oo).getClass();
            oooOOO0.close();
        }
    }
}

package Oooo0;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(33)
public final class Oooo000 extends OooOo {
    public Oooo000(int i, @NonNull Surface surface) {
        super(new OutputConfiguration(i, surface));
    }

    @Override // Oooo0.Oooo0, Oooo0.OooOOO.OooO00o
    public final void OooO00o(long j) {
        if (j == -1) {
            return;
        }
        ((OutputConfiguration) OooO0oO()).setStreamUseCase(j);
    }

    @Override // Oooo0.OooOo, Oooo0.OooOo00, Oooo0.OooOOOO, Oooo0.Oooo0, Oooo0.OooOOO.OooO00o
    public final void OooO0OO(long j) {
        ((OutputConfiguration) OooO0oO()).setDynamicRangeProfile(j);
    }

    @Override // Oooo0.OooOo, Oooo0.OooOo00, Oooo0.OooOOOO, Oooo0.Oooo0, Oooo0.OooOOO.OooO00o
    @NonNull
    public final Object OooO0oO() {
        Object obj = this.f417OooO00o;
        o000OO.OooOOO0.OooO00o(obj instanceof OutputConfiguration);
        return obj;
    }
}

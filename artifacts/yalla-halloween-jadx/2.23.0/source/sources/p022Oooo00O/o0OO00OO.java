package p022Oooo00O;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraControl;
import androidx.lifecycle.MutableLiveData;
import java.util.concurrent.Executor;
import p023Oooo00o.oO00O0o0;
import p025Oooo0OO.o000000O;
import p031OoooO0.o0Oo0oo;
import p033OoooO0O.o0O0O00;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0OO00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0Oo0oo f801OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final MutableLiveData<Integer> f802OooO0O0 = new MutableLiveData<>(0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f803OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Executor f804OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o00O000.OooO00o<Void> f805OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f806OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f807OooO0oO;

    public o0OO00OO(@NonNull o0Oo0oo o0oo0oo2, @NonNull oO00O0o0 oo00o0o0, @NonNull o0O0O00 o0o0o00) {
        this.f801OooO00o = o0oo0oo2;
        this.f804OooO0Oo = o0o0o00;
        this.f803OooO0OO = o000000O.OooO00o(new o0OO000o(oo00o0o0));
        o0oo0oo2.OooOO0(new o0Oo0oo.OooO0OO() { // from class: Oooo00O.oo0oO0
            @Override // Oooo00O.o0Oo0oo.OooO0OO
            public final boolean OooO00o(TotalCaptureResult totalCaptureResult) {
                o0OO00OO o0oo00oo2 = this.f913OooO00o;
                if (o0oo00oo2.f805OooO0o != null) {
                    Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
                    if ((num != null && num.intValue() == 2) == o0oo00oo2.f807OooO0oO) {
                        o0oo00oo2.f805OooO0o.OooO0O0(null);
                        o0oo00oo2.f805OooO0o = null;
                    }
                }
                return false;
            }
        });
    }

    public static void OooO0O0(@NonNull MutableLiveData mutableLiveData, Integer num) {
        if (o0Oo0oo.OooO0O0()) {
            mutableLiveData.setValue(num);
        } else {
            mutableLiveData.postValue(num);
        }
    }

    public final void OooO00o(@Nullable o00O000.OooO00o<Void> oooO00o, boolean z) {
        if (!this.f803OooO0OO) {
            if (oooO00o != null) {
                oooO00o.OooO0OO(new IllegalStateException("No flash unit"));
                return;
            }
            return;
        }
        boolean z2 = this.f806OooO0o0;
        MutableLiveData<Integer> mutableLiveData = this.f802OooO0O0;
        if (!z2) {
            OooO0O0(mutableLiveData, 0);
            if (oooO00o != null) {
                oooO00o.OooO0OO(new CameraControl.OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        this.f807OooO0oO = z;
        this.f801OooO00o.OooOO0o(z);
        OooO0O0(mutableLiveData, Integer.valueOf(z ? 1 : 0));
        o00O000.OooO00o<Void> oooO00o2 = this.f805OooO0o;
        if (oooO00o2 != null) {
            oooO00o2.OooO0OO(new CameraControl.OperationCanceledException("There is a new enableTorch being set"));
        }
        this.f805OooO0o = oooO00o;
    }
}

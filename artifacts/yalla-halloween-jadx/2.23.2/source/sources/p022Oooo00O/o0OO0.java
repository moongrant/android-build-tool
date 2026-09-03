package p022Oooo00O;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraControl;
import androidx.lifecycle.MutableLiveData;
import java.util.concurrent.Executor;
import p023Oooo00o.oO000o00;
import p025Oooo0OO.o000000O;
import p031OoooO0.o0Oo0oo;
import p033OoooO0O.o0O0O00;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0Oo0oo f797OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final MutableLiveData<Integer> f798OooO0O0 = new MutableLiveData<>(0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f799OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Executor f800OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o000Oo0.OooO00o<Void> f801OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f802OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f803OooO0oO;

    public o0OO0(@NonNull o0Oo0oo o0oo0oo2, @NonNull oO000o00 oo000o00, @NonNull o0O0O00 o0o0o00) {
        this.f797OooO00o = o0oo0oo2;
        this.f800OooO0Oo = o0o0o00;
        this.f799OooO0OO = o000000O.OooO00o(new o0OO00OO(oo000o00));
        o0oo0oo2.OooOO0(new o0Oo0oo.OooO0OO() { // from class: Oooo00O.o0OO00o0
            @Override // Oooo00O.o0Oo0oo.OooO0OO
            public final boolean OooO00o(TotalCaptureResult totalCaptureResult) {
                o0OO0 o0oo1 = this.f811OooO00o;
                if (o0oo1.f801OooO0o != null) {
                    Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
                    if ((num != null && num.intValue() == 2) == o0oo1.f803OooO0oO) {
                        o0oo1.f801OooO0o.OooO0O0(null);
                        o0oo1.f801OooO0o = null;
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

    public final void OooO00o(@Nullable o000Oo0.OooO00o<Void> oooO00o, boolean z) {
        if (!this.f799OooO0OO) {
            if (oooO00o != null) {
                oooO00o.OooO0OO(new IllegalStateException("No flash unit"));
                return;
            }
            return;
        }
        boolean z2 = this.f802OooO0o0;
        MutableLiveData<Integer> mutableLiveData = this.f798OooO0O0;
        if (!z2) {
            OooO0O0(mutableLiveData, 0);
            if (oooO00o != null) {
                oooO00o.OooO0OO(new CameraControl.OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        this.f803OooO0oO = z;
        this.f797OooO00o.OooOO0o(z);
        OooO0O0(mutableLiveData, Integer.valueOf(z ? 1 : 0));
        o000Oo0.OooO00o<Void> oooO00o2 = this.f801OooO0o;
        if (oooO00o2 != null) {
            oooO00o2.OooO0OO(new CameraControl.OperationCanceledException("There is a new enableTorch being set"));
        }
        this.f801OooO0o = oooO00o;
    }
}

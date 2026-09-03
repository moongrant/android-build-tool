package com.zego.ve;

import android.annotation.TargetApi;
import android.hardware.camera2.CameraManager;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
@TargetApi(21)
public class CameraAvailabilityCallback extends CameraManager.AvailabilityCallback {
    private Listener mListener;
    private final AtomicLong mThis;

    public interface Listener {
        void onCameraAvailable(long j, String str);

        void onCameraUnavailable(long j, String str);
    }

    public CameraAvailabilityCallback(long j, Listener listener) {
        AtomicLong atomicLong = new AtomicLong();
        this.mThis = atomicLong;
        atomicLong.set(j);
        this.mListener = listener;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public void onCameraAvailable(String str) {
        long j = this.mThis.get();
        if (j != 0) {
            this.mListener.onCameraAvailable(j, str);
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public void onCameraUnavailable(String str) {
        long j = this.mThis.get();
        if (j != 0) {
            this.mListener.onCameraUnavailable(j, str);
        }
    }

    public void uninit() {
        this.mThis.set(0L);
    }
}

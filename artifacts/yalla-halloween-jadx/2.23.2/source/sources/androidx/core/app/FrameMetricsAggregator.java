package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.compose.animation.core.AnimationKt;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes.dex */
public class FrameMetricsAggregator {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0 f5234OooO00o;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface MetricType {
    }

    @RequiresApi(24)
    public static class OooO00o extends OooO0O0 {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static Handler f5235OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static HandlerThread f5236OooO0o0;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public SparseIntArray[] f5238OooO0O0 = new SparseIntArray[9];

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ArrayList<WeakReference<Activity>> f5239OooO0OO = new ArrayList<>();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final WindowOnFrameMetricsAvailableListenerC0120OooO00o f5240OooO0Oo = new WindowOnFrameMetricsAvailableListenerC0120OooO00o();

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f5237OooO00o = 1;

        /* JADX INFO: renamed from: androidx.core.app.FrameMetricsAggregator$OooO00o$OooO00o, reason: collision with other inner class name */
        public class WindowOnFrameMetricsAvailableListenerC0120OooO00o implements Window$OnFrameMetricsAvailableListener {
            public WindowOnFrameMetricsAvailableListenerC0120OooO00o() {
            }

            public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                OooO00o oooO00o = OooO00o.this;
                if ((oooO00o.f5237OooO00o & 1) != 0) {
                    OooO00o.OooO0o0(oooO00o.f5238OooO0O0[0], frameMetrics.getMetric(8));
                }
                OooO00o oooO00o2 = OooO00o.this;
                if ((oooO00o2.f5237OooO00o & 2) != 0) {
                    OooO00o.OooO0o0(oooO00o2.f5238OooO0O0[1], frameMetrics.getMetric(1));
                }
                OooO00o oooO00o3 = OooO00o.this;
                if ((oooO00o3.f5237OooO00o & 4) != 0) {
                    OooO00o.OooO0o0(oooO00o3.f5238OooO0O0[2], frameMetrics.getMetric(3));
                }
                OooO00o oooO00o4 = OooO00o.this;
                if ((oooO00o4.f5237OooO00o & 8) != 0) {
                    OooO00o.OooO0o0(oooO00o4.f5238OooO0O0[3], frameMetrics.getMetric(4));
                }
                OooO00o oooO00o5 = OooO00o.this;
                if ((oooO00o5.f5237OooO00o & 16) != 0) {
                    OooO00o.OooO0o0(oooO00o5.f5238OooO0O0[4], frameMetrics.getMetric(5));
                }
                OooO00o oooO00o6 = OooO00o.this;
                if ((oooO00o6.f5237OooO00o & 64) != 0) {
                    OooO00o.OooO0o0(oooO00o6.f5238OooO0O0[6], frameMetrics.getMetric(7));
                }
                OooO00o oooO00o7 = OooO00o.this;
                if ((oooO00o7.f5237OooO00o & 32) != 0) {
                    OooO00o.OooO0o0(oooO00o7.f5238OooO0O0[5], frameMetrics.getMetric(6));
                }
                OooO00o oooO00o8 = OooO00o.this;
                if ((oooO00o8.f5237OooO00o & 128) != 0) {
                    OooO00o.OooO0o0(oooO00o8.f5238OooO0O0[7], frameMetrics.getMetric(0));
                }
                OooO00o oooO00o9 = OooO00o.this;
                if ((oooO00o9.f5237OooO00o & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    OooO00o.OooO0o0(oooO00o9.f5238OooO0O0[8], frameMetrics.getMetric(2));
                }
            }
        }

        public static void OooO0o0(SparseIntArray sparseIntArray, long j) {
            if (sparseIntArray != null) {
                int i = (int) ((500000 + j) / AnimationKt.MillisToNanos);
                if (j >= 0) {
                    sparseIntArray.put(i, sparseIntArray.get(i) + 1);
                }
            }
        }

        @Override // androidx.core.app.FrameMetricsAggregator.OooO0O0
        public final void OooO00o(Activity activity) {
            if (f5236OooO0o0 == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f5236OooO0o0 = handlerThread;
                handlerThread.start();
                f5235OooO0o = new Handler(f5236OooO0o0.getLooper());
            }
            for (int i = 0; i <= 8; i++) {
                SparseIntArray[] sparseIntArrayArr = this.f5238OooO0O0;
                if (sparseIntArrayArr[i] == null && (this.f5237OooO00o & (1 << i)) != 0) {
                    sparseIntArrayArr[i] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f5240OooO0Oo, f5235OooO0o);
            this.f5239OooO0OO.add(new WeakReference<>(activity));
        }

        @Override // androidx.core.app.FrameMetricsAggregator.OooO0O0
        public final SparseIntArray[] OooO0O0() {
            return this.f5238OooO0O0;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.OooO0O0
        public final SparseIntArray[] OooO0OO(Activity activity) {
            ArrayList<WeakReference<Activity>> arrayList = this.f5239OooO0OO;
            for (WeakReference<Activity> weakReference : arrayList) {
                if (weakReference.get() == activity) {
                    arrayList.remove(weakReference);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f5240OooO0Oo);
            return this.f5238OooO0O0;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.OooO0O0
        public final SparseIntArray[] OooO0Oo() {
            SparseIntArray[] sparseIntArrayArr = this.f5238OooO0O0;
            this.f5238OooO0O0 = new SparseIntArray[9];
            return sparseIntArrayArr;
        }
    }

    public static class OooO0O0 {
        public void OooO00o(Activity activity) {
        }

        public SparseIntArray[] OooO0O0() {
            return null;
        }

        public SparseIntArray[] OooO0OO(Activity activity) {
            return null;
        }

        public SparseIntArray[] OooO0Oo() {
            return null;
        }
    }

    public FrameMetricsAggregator() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f5234OooO00o = new OooO00o();
        } else {
            this.f5234OooO00o = new OooO0O0();
        }
    }
}

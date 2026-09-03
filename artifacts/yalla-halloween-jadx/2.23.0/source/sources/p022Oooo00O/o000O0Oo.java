package p022Oooo00O;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.impl.CameraCaptureMetaData$AeState;
import androidx.camera.core.impl.CameraCaptureMetaData$AfMode;
import androidx.camera.core.impl.CameraCaptureMetaData$AfState;
import androidx.camera.core.impl.CameraCaptureMetaData$AwbState;
import androidx.camera.core.impl.o000000O;
import androidx.camera.core.impl.o00O0;
import androidx.camera.core.impl.o00O00O;
import androidx.camera.core.impl.o00O0OO0;
import androidx.camera.core.impl.o00OO;
import com.google.common.util.concurrent.OooO00o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p023Oooo00o.oO00O0o0;
import p025Oooo0OO.o0000O00;
import p025Oooo0OO.o0000OO0;
import p028Oooo0oO.o00O0O0;
import p030OoooO.OooOOO;
import p030OoooO.OooOo00;
import p030OoooO.Oooo0;
import p033OoooO0O.o00oO0o;
import p033OoooO0O.o0O0O00;
import p033OoooO0O.o0ooOOo;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o000O0Oo {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Set<CameraCaptureMetaData$AeState> f513OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final Set<CameraCaptureMetaData$AeState> f514OooOO0O;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final o0Oo0oo f515OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final o0000OO0 f516OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f517OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final o00O0OO0 f518OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f519OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final Executor f520OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f521OooO0oO = 1;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Set<CameraCaptureMetaData$AfState> f512OooO0oo = Collections.unmodifiableSet(EnumSet.of(CameraCaptureMetaData$AfState.PASSIVE_FOCUSED, CameraCaptureMetaData$AfState.PASSIVE_NOT_FOCUSED, CameraCaptureMetaData$AfState.LOCKED_FOCUSED, CameraCaptureMetaData$AfState.LOCKED_NOT_FOCUSED));

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final Set<CameraCaptureMetaData$AwbState> f511OooO = Collections.unmodifiableSet(EnumSet.of(CameraCaptureMetaData$AwbState.CONVERGED, CameraCaptureMetaData$AwbState.UNKNOWN));

    public static class OooO implements o0Oo0oo.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public o00O000.OooO00o<TotalCaptureResult> f522OooO00o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f524OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO00o f525OooO0Oo;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o00O000.OooO0o f523OooO0O0 = o00O000.OooO00o(new o00O000.OooO0OO() { // from class: Oooo00O.o00oOoo
            @Override // o0ooOO0.o00O000.OooO0OO
            public final Object OooO0o0(o00O000.OooO00o oooO00o) {
                this.f671OooO0Oo.f522OooO00o = oooO00o;
                return "waitFor3AResult";
            }
        });

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public volatile Long f526OooO0o0 = null;

        public interface OooO00o {
            boolean OooO00o(@NonNull TotalCaptureResult totalCaptureResult);
        }

        public OooO(long j, @Nullable OooO00o oooO00o) {
            this.f524OooO0OO = j;
            this.f525OooO0Oo = oooO00o;
        }

        @Override // Oooo00O.o0Oo0oo.OooO0OO
        public final boolean OooO00o(@NonNull TotalCaptureResult totalCaptureResult) {
            Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l != null && this.f526OooO0o0 == null) {
                this.f526OooO0o0 = l;
            }
            Long l2 = this.f526OooO0o0;
            if (0 == this.f524OooO0OO || l2 == null || l == null || l.longValue() - l2.longValue() <= this.f524OooO0OO) {
                OooO00o oooO00o = this.f525OooO0Oo;
                if (oooO00o != null && !oooO00o.OooO00o(totalCaptureResult)) {
                    return false;
                }
                this.f522OooO00o.OooO0O0(totalCaptureResult);
                return true;
            }
            this.f522OooO00o.OooO0O0(null);
            o00O0O0.OooO00o("Camera2CapturePipeline", "Wait for capture result timeout, current:" + l + " first: " + l2);
            return true;
        }
    }

    public static class OooO00o implements OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0Oo0oo f527OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0000O00 f528OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f529OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f530OooO0Oo = false;

        public OooO00o(@NonNull o0Oo0oo o0oo0oo2, int i, @NonNull o0000O00 o0000o00) {
            this.f527OooO00o = o0oo0oo2;
            this.f529OooO0OO = i;
            this.f528OooO0O0 = o0000o00;
        }

        @Override // Oooo00O.o000O0Oo.OooO0o
        @NonNull
        public final com.google.common.util.concurrent.OooO00o<Boolean> OooO00o(@Nullable TotalCaptureResult totalCaptureResult) {
            if (!o000O0Oo.OooO0O0(this.f529OooO0OO, totalCaptureResult)) {
                return OooOo00.OooO0Oo(Boolean.FALSE);
            }
            o00O0O0.OooO00o("Camera2CapturePipeline", "Trigger AE");
            this.f530OooO0Oo = true;
            OooOOO oooOOOOooO00o = OooOOO.OooO00o(o00O000.OooO00o(new o000O00O(this, 0)));
            o000O0 o000o0 = new o000O0();
            o0ooOOo o0oooooOooO00o = o00oO0o.OooO00o();
            oooOOOOooO00o.getClass();
            return OooOo00.OooO0oo(oooOOOOooO00o, o000o0, o0oooooOooO00o);
        }

        @Override // Oooo00O.o000O0Oo.OooO0o
        public final boolean OooO0O0() {
            return this.f529OooO0OO == 0;
        }

        @Override // Oooo00O.o000O0Oo.OooO0o
        public final void OooO0OO() {
            if (this.f530OooO0Oo) {
                o00O0O0.OooO00o("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f527OooO00o.f845OooO0oo.OooO00o(false, true);
                this.f528OooO0O0.f1051OooO0O0 = false;
            }
        }
    }

    public static class OooO0O0 implements OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0Oo0oo f531OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f532OooO0O0 = false;

        public OooO0O0(@NonNull o0Oo0oo o0oo0oo2) {
            this.f531OooO00o = o0oo0oo2;
        }

        @Override // Oooo00O.o000O0Oo.OooO0o
        @NonNull
        public final com.google.common.util.concurrent.OooO00o<Boolean> OooO00o(@Nullable TotalCaptureResult totalCaptureResult) {
            Integer num;
            Oooo0.OooO0OO OooO0Oo2 = OooOo00.OooO0Oo(Boolean.TRUE);
            if (totalCaptureResult == null || (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) == null) {
                return OooO0Oo2;
            }
            int iIntValue = num.intValue();
            if (iIntValue == 1 || iIntValue == 2) {
                o00O0O0.OooO00o("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    o00O0O0.OooO00o("Camera2CapturePipeline", "Trigger AF");
                    this.f532OooO0O0 = true;
                    o0O0000O o0o0000o2 = this.f531OooO00o.f845OooO0oo;
                    if (o0o0000o2.f682OooO0O0) {
                        o000000O.OooO00o oooO00o = new o000000O.OooO00o();
                        oooO00o.f3657OooO0OO = o0o0000o2.f683OooO0OO;
                        oooO00o.f3659OooO0o = true;
                        o00O00O o00o00oOooo0OO = o00O00O.Oooo0OO();
                        o00o00oOooo0OO.Oooo0oO(Oooo000.OooO00o.Oooo0O0(CaptureRequest.CONTROL_AF_TRIGGER), 1);
                        oooO00o.OooO0OO(new Oooo000.OooO00o(o00O0.Oooo0O0(o00o00oOooo0OO)));
                        oooO00o.OooO0O0(new o0());
                        o0o0000o2.f681OooO00o.OooOo00(Collections.singletonList(oooO00o.OooO0Oo()));
                    }
                }
            }
            return OooO0Oo2;
        }

        @Override // Oooo00O.o000O0Oo.OooO0o
        public final boolean OooO0O0() {
            return true;
        }

        @Override // Oooo00O.o000O0Oo.OooO0o
        public final void OooO0OO() {
            if (this.f532OooO0O0) {
                o00O0O0.OooO00o("Camera2CapturePipeline", "cancel TriggerAF");
                this.f531OooO00o.f845OooO0oo.OooO00o(true, false);
            }
        }
    }

    @VisibleForTesting
    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final long f533OooO;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final long f534OooOO0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f535OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Executor f536OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o0Oo0oo f537OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o0000O00 f538OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f540OooO0o0;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f539OooO0o = f533OooO;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final ArrayList f541OooO0oO = new ArrayList();

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final OooO00o f542OooO0oo = new OooO00o();

        public class OooO00o implements OooO0o {
            public OooO00o() {
            }

            @Override // Oooo00O.o000O0Oo.OooO0o
            @NonNull
            public final com.google.common.util.concurrent.OooO00o<Boolean> OooO00o(@Nullable TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator it = OooO0OO.this.f541OooO0oO.iterator();
                while (it.hasNext()) {
                    arrayList.add(((OooO0o) it.next()).OooO00o(totalCaptureResult));
                }
                return OooOo00.OooO0oo(OooOo00.OooO00o(arrayList), new o00O0000(), o00oO0o.OooO00o());
            }

            @Override // Oooo00O.o000O0Oo.OooO0o
            public final boolean OooO0O0() {
                Iterator it = OooO0OO.this.f541OooO0oO.iterator();
                while (it.hasNext()) {
                    if (((OooO0o) it.next()).OooO0O0()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // Oooo00O.o000O0Oo.OooO0o
            public final void OooO0OO() {
                Iterator it = OooO0OO.this.f541OooO0oO.iterator();
                while (it.hasNext()) {
                    ((OooO0o) it.next()).OooO0OO();
                }
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f533OooO = timeUnit.toNanos(1L);
            f534OooOO0 = timeUnit.toNanos(5L);
        }

        public OooO0OO(int i, @NonNull Executor executor, @NonNull o0Oo0oo o0oo0oo2, boolean z, @NonNull o0000O00 o0000o00) {
            this.f535OooO00o = i;
            this.f536OooO0O0 = executor;
            this.f537OooO0OO = o0oo0oo2;
            this.f540OooO0o0 = z;
            this.f538OooO0Oo = o0000o00;
        }
    }

    public interface OooO0o {
        @NonNull
        com.google.common.util.concurrent.OooO00o<Boolean> OooO00o(@Nullable TotalCaptureResult totalCaptureResult);

        boolean OooO0O0();

        void OooO0OO();
    }

    public static class OooOO0 implements OooO0o {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final long f544OooO0o0 = TimeUnit.SECONDS.toNanos(2);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0Oo0oo f545OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f546OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f547OooO0OO = false;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Executor f548OooO0Oo;

        public OooOO0(@NonNull o0Oo0oo o0oo0oo2, int i, @NonNull Executor executor) {
            this.f545OooO00o = o0oo0oo2;
            this.f546OooO0O0 = i;
            this.f548OooO0Oo = executor;
        }

        @Override // Oooo00O.o000O0Oo.OooO0o
        @NonNull
        public final com.google.common.util.concurrent.OooO00o<Boolean> OooO00o(@Nullable TotalCaptureResult totalCaptureResult) {
            if (o000O0Oo.OooO0O0(this.f546OooO0O0, totalCaptureResult)) {
                if (!this.f545OooO00o.f852OooOOOo) {
                    o00O0O0.OooO00o("Camera2CapturePipeline", "Turn on torch");
                    this.f547OooO0OO = true;
                    return OooOo00.OooO0oo(OooOOO.OooO00o(o00O000.OooO00o(new o00O000o(this))).OooO0OO(new p030OoooO.OooOO0() { // from class: Oooo00O.o00O00
                        @Override // p030OoooO.OooOO0
                        public final OooO00o apply(Object obj) {
                            o00O000 o00o001 = new o00O000();
                            long j = o000O0Oo.OooOO0.f544OooO0o0;
                            o0Oo0oo o0oo0oo2 = this.f611OooO00o.f545OooO00o;
                            Set<CameraCaptureMetaData$AfState> set = o000O0Oo.f512OooO0oo;
                            o000O0Oo.OooO oooO = new o000O0Oo.OooO(j, o00o001);
                            o0oo0oo2.OooOO0(oooO);
                            return oooO.f523OooO0O0;
                        }
                    }, this.f548OooO0Oo), new o00O00O(), o00oO0o.OooO00o());
                }
                o00O0O0.OooO00o("Camera2CapturePipeline", "Torch already on, not turn on");
            }
            return OooOo00.OooO0Oo(Boolean.FALSE);
        }

        @Override // Oooo00O.o000O0Oo.OooO0o
        public final boolean OooO0O0() {
            return this.f546OooO0O0 == 0;
        }

        @Override // Oooo00O.o000O0Oo.OooO0o
        public final void OooO0OO() {
            if (this.f547OooO0OO) {
                this.f545OooO00o.f846OooOO0.OooO00o(null, false);
                o00O0O0.OooO00o("Camera2CapturePipeline", "Turn off torch");
            }
        }
    }

    static {
        CameraCaptureMetaData$AeState cameraCaptureMetaData$AeState = CameraCaptureMetaData$AeState.CONVERGED;
        CameraCaptureMetaData$AeState cameraCaptureMetaData$AeState2 = CameraCaptureMetaData$AeState.FLASH_REQUIRED;
        CameraCaptureMetaData$AeState cameraCaptureMetaData$AeState3 = CameraCaptureMetaData$AeState.UNKNOWN;
        Set<CameraCaptureMetaData$AeState> setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(cameraCaptureMetaData$AeState, cameraCaptureMetaData$AeState2, cameraCaptureMetaData$AeState3));
        f513OooOO0 = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(cameraCaptureMetaData$AeState2);
        enumSetCopyOf.remove(cameraCaptureMetaData$AeState3);
        f514OooOO0O = Collections.unmodifiableSet(enumSetCopyOf);
    }

    public o000O0Oo(@NonNull o0Oo0oo o0oo0oo2, @NonNull oO00O0o0 oo00o0o0, @NonNull o00O0OO0 o00o0oo1, @NonNull o0O0O00 o0o0o00) {
        this.f515OooO00o = o0oo0oo2;
        Integer num = (Integer) oo00o0o0.OooO00o(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f519OooO0o = num != null && num.intValue() == 2;
        this.f520OooO0o0 = o0o0o00;
        this.f518OooO0Oo = o00o0oo1;
        this.f516OooO0O0 = new o0000OO0(o00o0oo1);
        this.f517OooO0OO = p025Oooo0OO.o000000O.OooO00o(new o000O00(oo00o0o0));
    }

    public static boolean OooO00o(@Nullable TotalCaptureResult totalCaptureResult, boolean z) {
        if (totalCaptureResult == null) {
            return false;
        }
        OooOOOO oooOOOO = new OooOOOO(o00OO.f3727OooO0O0, totalCaptureResult);
        boolean z2 = oooOOOO.OooO() == CameraCaptureMetaData$AfMode.OFF || oooOOOO.OooO() == CameraCaptureMetaData$AfMode.UNKNOWN || f512OooO0oo.contains(oooOOOO.OooO0o());
        boolean z3 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 0;
        boolean z4 = !z ? !(z3 || f513OooOO0.contains(oooOOOO.OooO0oo())) : !(z3 || f514OooOO0O.contains(oooOOOO.OooO0oo()));
        boolean z5 = (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AWB_MODE)).intValue() == 0) || f511OooO.contains(oooOOOO.OooO0oO());
        o00O0O0.OooO00o("Camera2CapturePipeline", "checkCaptureResult, AE=" + oooOOOO.OooO0oo() + " AF =" + oooOOOO.OooO0o() + " AWB=" + oooOOOO.OooO0oO());
        return z2 && z4 && z5;
    }

    public static boolean OooO0O0(int i, @Nullable TotalCaptureResult totalCaptureResult) {
        if (i == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            return num != null && num.intValue() == 4;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new AssertionError(i);
    }
}

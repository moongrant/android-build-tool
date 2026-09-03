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
import androidx.camera.core.impl.o00O0O00;
import androidx.camera.core.impl.o00OOO0;
import androidx.camera.core.impl.oOO00O;
import androidx.camera.core.impl.oo0o0O0;
import com.google.common.util.concurrent.OooOO0O;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p023Oooo00o.oO000o00;
import p025Oooo0OO.o0000O00;
import p025Oooo0OO.o0000OO0;
import p028Oooo0oO.o00O0O0;
import p030OoooO.OooOOO;
import p030OoooO.OooOo;
import p030OoooO.o000oOoO;
import p033OoooO0O.o00oO0o;
import p033OoooO0O.o0O0O00;
import p033OoooO0O.o0ooOOo;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o000O0Oo {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Set<CameraCaptureMetaData$AeState> f512OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final Set<CameraCaptureMetaData$AeState> f513OooOO0O;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final o0Oo0oo f514OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final o0000OO0 f515OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f516OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final oo0o0O0 f517OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f518OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final Executor f519OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f520OooO0oO = 1;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Set<CameraCaptureMetaData$AfState> f511OooO0oo = Collections.unmodifiableSet(EnumSet.of(CameraCaptureMetaData$AfState.PASSIVE_FOCUSED, CameraCaptureMetaData$AfState.PASSIVE_NOT_FOCUSED, CameraCaptureMetaData$AfState.LOCKED_FOCUSED, CameraCaptureMetaData$AfState.LOCKED_NOT_FOCUSED));

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final Set<CameraCaptureMetaData$AwbState> f510OooO = Collections.unmodifiableSet(EnumSet.of(CameraCaptureMetaData$AwbState.CONVERGED, CameraCaptureMetaData$AwbState.UNKNOWN));

    public static class OooO implements o0Oo0oo.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public o000Oo0.OooO00o<TotalCaptureResult> f521OooO00o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f523OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO00o f524OooO0Oo;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000Oo0.OooO0o f522OooO0O0 = o000Oo0.OooO00o(new o00oOoo(this));

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public volatile Long f525OooO0o0 = null;

        public interface OooO00o {
            boolean OooO00o(@NonNull TotalCaptureResult totalCaptureResult);
        }

        public OooO(long j, @Nullable OooO00o oooO00o) {
            this.f523OooO0OO = j;
            this.f524OooO0Oo = oooO00o;
        }

        @Override // Oooo00O.o0Oo0oo.OooO0OO
        public final boolean OooO00o(@NonNull TotalCaptureResult totalCaptureResult) {
            Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l != null && this.f525OooO0o0 == null) {
                this.f525OooO0o0 = l;
            }
            Long l2 = this.f525OooO0o0;
            if (0 == this.f523OooO0OO || l2 == null || l == null || l.longValue() - l2.longValue() <= this.f523OooO0OO) {
                OooO00o oooO00o = this.f524OooO0Oo;
                if (oooO00o != null && !oooO00o.OooO00o(totalCaptureResult)) {
                    return false;
                }
                this.f521OooO00o.OooO0O0(totalCaptureResult);
                return true;
            }
            this.f521OooO00o.OooO0O0(null);
            o00O0O0.OooO00o("Camera2CapturePipeline", "Wait for capture result timeout, current:" + l + " first: " + l2);
            return true;
        }
    }

    public static class OooO00o implements OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0Oo0oo f526OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0000O00 f527OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f528OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f529OooO0Oo = false;

        public OooO00o(@NonNull o0Oo0oo o0oo0oo2, int i, @NonNull o0000O00 o0000o00) {
            this.f526OooO00o = o0oo0oo2;
            this.f528OooO0OO = i;
            this.f527OooO0O0 = o0000o00;
        }

        @Override // Oooo00O.o000O0Oo.OooO0o
        @NonNull
        public final OooOO0O<Boolean> OooO00o(@Nullable TotalCaptureResult totalCaptureResult) {
            if (!o000O0Oo.OooO0O0(this.f528OooO0OO, totalCaptureResult)) {
                return OooOo.OooO0Oo(Boolean.FALSE);
            }
            o00O0O0.OooO00o("Camera2CapturePipeline", "Trigger AE");
            this.f529OooO0Oo = true;
            OooOOO oooOOOOooO00o = OooOOO.OooO00o(o000Oo0.OooO00o(new o000O00O(this, 0)));
            o000O0 o000o0 = new o000O0();
            o0ooOOo o0oooooOooO00o = o00oO0o.OooO00o();
            oooOOOOooO00o.getClass();
            return OooOo.OooO0oo(oooOOOOooO00o, o000o0, o0oooooOooO00o);
        }

        @Override // Oooo00O.o000O0Oo.OooO0o
        public final boolean OooO0O0() {
            return this.f528OooO0OO == 0;
        }

        @Override // Oooo00O.o000O0Oo.OooO0o
        public final void OooO0OO() {
            if (this.f529OooO0Oo) {
                o00O0O0.OooO00o("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f526OooO00o.f852OooO0oo.OooO00o(false, true);
                this.f527OooO0O0.f1040OooO0O0 = false;
            }
        }
    }

    public static class OooO0O0 implements OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0Oo0oo f530OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f531OooO0O0 = false;

        public OooO0O0(@NonNull o0Oo0oo o0oo0oo2) {
            this.f530OooO00o = o0oo0oo2;
        }

        @Override // Oooo00O.o000O0Oo.OooO0o
        @NonNull
        public final OooOO0O<Boolean> OooO00o(@Nullable TotalCaptureResult totalCaptureResult) {
            Integer num;
            o000oOoO.OooO0OO OooO0Oo2 = OooOo.OooO0Oo(Boolean.TRUE);
            if (totalCaptureResult == null || (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) == null) {
                return OooO0Oo2;
            }
            int iIntValue = num.intValue();
            if (iIntValue == 1 || iIntValue == 2) {
                o00O0O0.OooO00o("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    o00O0O0.OooO00o("Camera2CapturePipeline", "Trigger AF");
                    this.f531OooO0O0 = true;
                    o0O0000O o0o0000o2 = this.f530OooO00o.f852OooO0oo;
                    if (o0o0000o2.f688OooO0O0) {
                        o000000O.OooO00o oooO00o = new o000000O.OooO00o();
                        oooO00o.f3656OooO0OO = o0o0000o2.f689OooO0OO;
                        oooO00o.f3658OooO0o = true;
                        oOO00O ooo00oOooo0OO = oOO00O.Oooo0OO();
                        ooo00oOooo0OO.Oooo0oO(Oooo000.OooO00o.Oooo0O0(CaptureRequest.CONTROL_AF_TRIGGER), 1);
                        oooO00o.OooO0OO(new Oooo000.OooO00o(o00O0O00.Oooo0O0(ooo00oOooo0OO)));
                        oooO00o.OooO0O0(new o0());
                        o0o0000o2.f687OooO00o.OooOo00(Collections.singletonList(oooO00o.OooO0Oo()));
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
            if (this.f531OooO0O0) {
                o00O0O0.OooO00o("Camera2CapturePipeline", "cancel TriggerAF");
                this.f530OooO00o.f852OooO0oo.OooO00o(true, false);
            }
        }
    }

    @VisibleForTesting
    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final long f532OooO;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final long f533OooOO0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f534OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Executor f535OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o0Oo0oo f536OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o0000O00 f537OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f539OooO0o0;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f538OooO0o = f532OooO;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final ArrayList f540OooO0oO = new ArrayList();

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final OooO00o f541OooO0oo = new OooO00o();

        public class OooO00o implements OooO0o {
            public OooO00o() {
            }

            @Override // Oooo00O.o000O0Oo.OooO0o
            @NonNull
            public final OooOO0O<Boolean> OooO00o(@Nullable TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator it = OooO0OO.this.f540OooO0oO.iterator();
                while (it.hasNext()) {
                    arrayList.add(((OooO0o) it.next()).OooO00o(totalCaptureResult));
                }
                return OooOo.OooO0oo(OooOo.OooO00o(arrayList), new o00O0000(), o00oO0o.OooO00o());
            }

            @Override // Oooo00O.o000O0Oo.OooO0o
            public final boolean OooO0O0() {
                Iterator it = OooO0OO.this.f540OooO0oO.iterator();
                while (it.hasNext()) {
                    if (((OooO0o) it.next()).OooO0O0()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // Oooo00O.o000O0Oo.OooO0o
            public final void OooO0OO() {
                Iterator it = OooO0OO.this.f540OooO0oO.iterator();
                while (it.hasNext()) {
                    ((OooO0o) it.next()).OooO0OO();
                }
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f532OooO = timeUnit.toNanos(1L);
            f533OooOO0 = timeUnit.toNanos(5L);
        }

        public OooO0OO(int i, @NonNull Executor executor, @NonNull o0Oo0oo o0oo0oo2, boolean z, @NonNull o0000O00 o0000o00) {
            this.f534OooO00o = i;
            this.f535OooO0O0 = executor;
            this.f536OooO0OO = o0oo0oo2;
            this.f539OooO0o0 = z;
            this.f537OooO0Oo = o0000o00;
        }
    }

    public interface OooO0o {
        @NonNull
        OooOO0O<Boolean> OooO00o(@Nullable TotalCaptureResult totalCaptureResult);

        boolean OooO0O0();

        void OooO0OO();
    }

    public static class OooOO0 implements OooO0o {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final long f543OooO0o0 = TimeUnit.SECONDS.toNanos(2);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0Oo0oo f544OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f545OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f546OooO0OO = false;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Executor f547OooO0Oo;

        public OooOO0(@NonNull o0Oo0oo o0oo0oo2, int i, @NonNull Executor executor) {
            this.f544OooO00o = o0oo0oo2;
            this.f545OooO0O0 = i;
            this.f547OooO0Oo = executor;
        }

        @Override // Oooo00O.o000O0Oo.OooO0o
        @NonNull
        public final OooOO0O<Boolean> OooO00o(@Nullable TotalCaptureResult totalCaptureResult) {
            if (o000O0Oo.OooO0O0(this.f545OooO0O0, totalCaptureResult)) {
                if (!this.f544OooO00o.f859OooOOOo) {
                    o00O0O0.OooO00o("Camera2CapturePipeline", "Turn on torch");
                    this.f546OooO0OO = true;
                    return OooOo.OooO0oo(OooOOO.OooO00o(o000Oo0.OooO00o(new o00O000(this))).OooO0OO(new p030OoooO.OooOO0() { // from class: Oooo00O.o00O000o
                        @Override // p030OoooO.OooOO0
                        public final OooOO0O apply(Object obj) {
                            o00O00O o00o00o2 = new o00O00O();
                            long j = o000O0Oo.OooOO0.f543OooO0o0;
                            o0Oo0oo o0oo0oo2 = this.f609OooO00o.f544OooO00o;
                            Set<CameraCaptureMetaData$AfState> set = o000O0Oo.f511OooO0oo;
                            o000O0Oo.OooO oooO = new o000O0Oo.OooO(j, o00o00o2);
                            o0oo0oo2.OooOO0(oooO);
                            return oooO.f522OooO0O0;
                        }
                    }, this.f547OooO0Oo), new o00O00(), o00oO0o.OooO00o());
                }
                o00O0O0.OooO00o("Camera2CapturePipeline", "Torch already on, not turn on");
            }
            return OooOo.OooO0Oo(Boolean.FALSE);
        }

        @Override // Oooo00O.o000O0Oo.OooO0o
        public final boolean OooO0O0() {
            return this.f545OooO0O0 == 0;
        }

        @Override // Oooo00O.o000O0Oo.OooO0o
        public final void OooO0OO() {
            if (this.f546OooO0OO) {
                this.f544OooO00o.f853OooOO0.OooO00o(null, false);
                o00O0O0.OooO00o("Camera2CapturePipeline", "Turn off torch");
            }
        }
    }

    static {
        CameraCaptureMetaData$AeState cameraCaptureMetaData$AeState = CameraCaptureMetaData$AeState.CONVERGED;
        CameraCaptureMetaData$AeState cameraCaptureMetaData$AeState2 = CameraCaptureMetaData$AeState.FLASH_REQUIRED;
        CameraCaptureMetaData$AeState cameraCaptureMetaData$AeState3 = CameraCaptureMetaData$AeState.UNKNOWN;
        Set<CameraCaptureMetaData$AeState> setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(cameraCaptureMetaData$AeState, cameraCaptureMetaData$AeState2, cameraCaptureMetaData$AeState3));
        f512OooOO0 = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(cameraCaptureMetaData$AeState2);
        enumSetCopyOf.remove(cameraCaptureMetaData$AeState3);
        f513OooOO0O = Collections.unmodifiableSet(enumSetCopyOf);
    }

    public o000O0Oo(@NonNull o0Oo0oo o0oo0oo2, @NonNull oO000o00 oo000o00, @NonNull oo0o0O0 oo0o0o0, @NonNull o0O0O00 o0o0o00) {
        this.f514OooO00o = o0oo0oo2;
        Integer num = (Integer) oo000o00.OooO00o(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f518OooO0o = num != null && num.intValue() == 2;
        this.f519OooO0o0 = o0o0o00;
        this.f517OooO0Oo = oo0o0o0;
        this.f515OooO0O0 = new o0000OO0(oo0o0o0);
        this.f516OooO0OO = p025Oooo0OO.o000000O.OooO00o(new o000O00(oo000o00));
    }

    public static boolean OooO00o(@Nullable TotalCaptureResult totalCaptureResult, boolean z) {
        if (totalCaptureResult == null) {
            return false;
        }
        OooOOOO oooOOOO = new OooOOOO(o00OOO0.f3743OooO0O0, totalCaptureResult);
        boolean z2 = oooOOOO.OooO() == CameraCaptureMetaData$AfMode.OFF || oooOOOO.OooO() == CameraCaptureMetaData$AfMode.UNKNOWN || f511OooO0oo.contains(oooOOOO.OooO0o());
        boolean z3 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 0;
        boolean z4 = !z ? !(z3 || f512OooOO0.contains(oooOOOO.OooO0oo())) : !(z3 || f513OooOO0O.contains(oooOOOO.OooO0oo()));
        boolean z5 = (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AWB_MODE)).intValue() == 0) || f510OooO.contains(oooOOOO.OooO0oO());
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

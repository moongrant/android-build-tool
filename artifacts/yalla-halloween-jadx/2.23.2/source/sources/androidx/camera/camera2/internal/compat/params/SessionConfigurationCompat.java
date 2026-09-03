package androidx.camera.camera2.internal.compat.params;

import Oooo0.OooOOO;
import Oooo0.OooOOO0;
import Oooo0.OooOOOO;
import Oooo0.OooOo;
import Oooo0.OooOo00;
import Oooo0.Oooo000;
import Oooo0.o000oOoO;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p022Oooo00O.oo0OOoo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class SessionConfigurationCompat {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO f3384OooO00o;

    @RequiresApi(28)
    public static final class OooO00o implements OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final SessionConfiguration f3385OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final List<OooOOO> f3386OooO0O0;

        public OooO00o(@NonNull ArrayList arrayList, @NonNull Executor executor, @NonNull oo0OOoo oo0oooo) {
            SessionConfiguration sessionConfiguration = new SessionConfiguration(0, SessionConfigurationCompat.OooO00o(arrayList), executor, oo0oooo);
            this.f3385OooO00o = sessionConfiguration;
            List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
            ArrayList arrayList2 = new ArrayList(outputConfigurations.size());
            for (OutputConfiguration outputConfiguration : outputConfigurations) {
                OooOOO oooOOO = null;
                if (outputConfiguration != null) {
                    int i = Build.VERSION.SDK_INT;
                    OooOOOO oooo000 = i >= 33 ? new Oooo000(outputConfiguration) : i >= 28 ? new OooOo(new OooOo.OooO00o(outputConfiguration)) : i >= 26 ? new OooOo00(new OooOo00.OooO00o(outputConfiguration)) : i >= 24 ? new OooOOOO(new OooOOOO.OooO00o(outputConfiguration)) : null;
                    if (oooo000 != null) {
                        oooOOO = new OooOOO(oooo000);
                    }
                }
                arrayList2.add(oooOOO);
            }
            this.f3386OooO0O0 = Collections.unmodifiableList(arrayList2);
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.OooO0OO
        public final OooOOO0 OooO00o() {
            return OooOOO0.OooO00o(this.f3385OooO00o.getInputConfiguration());
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.OooO0OO
        @NonNull
        public final CameraCaptureSession.StateCallback OooO0O0() {
            return this.f3385OooO00o.getStateCallback();
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.OooO0OO
        @NonNull
        public final List<OooOOO> OooO0OO() {
            return this.f3386OooO0O0;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.OooO0OO
        @Nullable
        public final Object OooO0Oo() {
            return this.f3385OooO00o;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.OooO0OO
        public final void OooO0o(@NonNull OooOOO0 oooOOO0) {
            this.f3385OooO00o.setInputConfiguration(oooOOO0.f406OooO00o.OooO00o());
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.OooO0OO
        @NonNull
        public final Executor OooO0o0() {
            return this.f3385OooO00o.getExecutor();
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.OooO0OO
        public final int OooO0oO() {
            return this.f3385OooO00o.getSessionType();
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.OooO0OO
        public final void OooO0oo(@NonNull CaptureRequest captureRequest) {
            this.f3385OooO00o.setSessionParameters(captureRequest);
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            return Objects.equals(this.f3385OooO00o, ((OooO00o) obj).f3385OooO00o);
        }

        public final int hashCode() {
            return this.f3385OooO00o.hashCode();
        }
    }

    @RequiresApi(21)
    public static final class OooO0O0 implements OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<OooOOO> f3387OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final CameraCaptureSession.StateCallback f3388OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Executor f3389OooO0OO;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public OooOOO0 f3391OooO0o0 = null;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f3390OooO0Oo = 0;

        public OooO0O0(@NonNull ArrayList arrayList, @NonNull Executor executor, @NonNull oo0OOoo oo0oooo) {
            this.f3387OooO00o = Collections.unmodifiableList(new ArrayList(arrayList));
            this.f3388OooO0O0 = oo0oooo;
            this.f3389OooO0OO = executor;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.OooO0OO
        @Nullable
        public final OooOOO0 OooO00o() {
            return this.f3391OooO0o0;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.OooO0OO
        @NonNull
        public final CameraCaptureSession.StateCallback OooO0O0() {
            return this.f3388OooO0O0;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.OooO0OO
        @NonNull
        public final List<OooOOO> OooO0OO() {
            return this.f3387OooO00o;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.OooO0OO
        @Nullable
        public final Object OooO0Oo() {
            return null;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.OooO0OO
        public final void OooO0o(@NonNull OooOOO0 oooOOO0) {
            if (this.f3390OooO0Oo == 1) {
                throw new UnsupportedOperationException("Method not supported for high speed session types");
            }
            this.f3391OooO0o0 = oooOOO0;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.OooO0OO
        @NonNull
        public final Executor OooO0o0() {
            return this.f3389OooO0OO;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.OooO0OO
        public final int OooO0oO() {
            return this.f3390OooO0Oo;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.OooO0OO
        public final void OooO0oo(@NonNull CaptureRequest captureRequest) {
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OooO0O0) {
                OooO0O0 oooO0O0 = (OooO0O0) obj;
                if (Objects.equals(this.f3391OooO0o0, oooO0O0.f3391OooO0o0) && this.f3390OooO0Oo == oooO0O0.f3390OooO0Oo) {
                    List<OooOOO> list = this.f3387OooO00o;
                    int size = list.size();
                    List<OooOOO> list2 = oooO0O0.f3387OooO00o;
                    if (size == list2.size()) {
                        for (int i = 0; i < list.size(); i++) {
                            if (!list.get(i).equals(list2.get(i))) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = this.f3387OooO00o.hashCode() ^ 31;
            int i = (iHashCode << 5) - iHashCode;
            OooOOO0 oooOOO0 = this.f3391OooO0o0;
            int iHashCode2 = (oooOOO0 == null ? 0 : oooOOO0.hashCode()) ^ i;
            return this.f3390OooO0Oo ^ ((iHashCode2 << 5) - iHashCode2);
        }
    }

    public interface OooO0OO {
        @Nullable
        OooOOO0 OooO00o();

        @NonNull
        CameraCaptureSession.StateCallback OooO0O0();

        @NonNull
        List<OooOOO> OooO0OO();

        @Nullable
        Object OooO0Oo();

        void OooO0o(@NonNull OooOOO0 oooOOO0);

        @NonNull
        Executor OooO0o0();

        int OooO0oO();

        void OooO0oo(@NonNull CaptureRequest captureRequest);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface SessionMode {
    }

    public SessionConfigurationCompat(@NonNull ArrayList arrayList, @NonNull Executor executor, @NonNull oo0OOoo oo0oooo) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f3384OooO00o = new OooO0O0(arrayList, executor, oo0oooo);
        } else {
            this.f3384OooO00o = new OooO00o(arrayList, executor, oo0oooo);
        }
    }

    @NonNull
    @RequiresApi(24)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static ArrayList OooO00o(@NonNull List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(o000oOoO.OooO00o(((OooOOO) it.next()).f405OooO00o.OooO0oO()));
        }
        return arrayList;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SessionConfigurationCompat)) {
            return false;
        }
        return this.f3384OooO00o.equals(((SessionConfigurationCompat) obj).f3384OooO00o);
    }

    public final int hashCode() {
        return this.f3384OooO00o.hashCode();
    }
}

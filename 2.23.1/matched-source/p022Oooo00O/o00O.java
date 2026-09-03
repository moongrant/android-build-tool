package p022Oooo00O;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraState;
import androidx.camera.core.OooO0O0;
import androidx.camera.core.OooO0OO;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.o0O0O00;
import androidx.lifecycle.MutableLiveData;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p028Oooo0oO.o00O0O0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final o0O0O00 f604OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final MutableLiveData<CameraState> f605OooO0O0;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f606OooO00o;

        static {
            int[] iArr = new int[CameraInternal.State.values().length];
            f606OooO00o = iArr;
            try {
                iArr[CameraInternal.State.PENDING_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f606OooO00o[CameraInternal.State.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f606OooO00o[CameraInternal.State.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f606OooO00o[CameraInternal.State.CONFIGURED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f606OooO00o[CameraInternal.State.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f606OooO00o[CameraInternal.State.RELEASING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f606OooO00o[CameraInternal.State.CLOSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f606OooO00o[CameraInternal.State.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public o00O(@NonNull o0O0O00 o0o0o00) {
        this.f604OooO00o = o0o0o00;
        MutableLiveData<CameraState> mutableLiveData = new MutableLiveData<>();
        this.f605OooO0O0 = mutableLiveData;
        mutableLiveData.postValue(new OooO0O0(CameraState.Type.CLOSED, null));
    }

    public final void OooO00o(@NonNull CameraInternal.State state, @Nullable OooO0OO oooO0OO) {
        boolean z;
        OooO0O0 oooO0O0;
        switch (OooO00o.f606OooO00o[state.ordinal()]) {
            case 1:
                o0O0O00 o0o0o00 = this.f604OooO00o;
                synchronized (o0o0o00.f3748OooO0O0) {
                    Iterator it = o0o0o00.f3752OooO0o0.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                        } else if (((o0O0O00.OooO00o) ((Map.Entry) it.next()).getValue()).f3753OooO00o == CameraInternal.State.CLOSING) {
                            z = true;
                        }
                    }
                }
                oooO0O0 = z ? new OooO0O0(CameraState.Type.OPENING, null) : new OooO0O0(CameraState.Type.PENDING_OPEN, null);
                break;
            case 2:
                oooO0O0 = new OooO0O0(CameraState.Type.OPENING, oooO0OO);
                break;
            case 3:
            case 4:
                oooO0O0 = new OooO0O0(CameraState.Type.OPEN, oooO0OO);
                break;
            case 5:
            case 6:
                oooO0O0 = new OooO0O0(CameraState.Type.CLOSING, oooO0OO);
                break;
            case 7:
            case 8:
                oooO0O0 = new OooO0O0(CameraState.Type.CLOSED, oooO0OO);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + state);
        }
        o00O0O0.OooO00o("CameraStateMachine", "New public camera state " + oooO0O0 + " from " + state + " and " + oooO0OO);
        if (Objects.equals(this.f605OooO0O0.getValue(), oooO0O0)) {
            return;
        }
        o00O0O0.OooO00o("CameraStateMachine", "Publishing new public camera state " + oooO0O0);
        this.f605OooO0O0.postValue(oooO0O0);
    }
}

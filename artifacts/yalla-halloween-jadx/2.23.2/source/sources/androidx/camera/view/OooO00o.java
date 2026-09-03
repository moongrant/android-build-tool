package androidx.camera.view;

import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.arch.core.util.Function;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.o0Oo0oo;
import androidx.camera.core.impl.oo00o;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import p028Oooo0oO.o00O0O0;
import p030OoooO.OooOO0;
import p030OoooO.OooOO0O;
import p030OoooO.OooOOO;
import p030OoooO.OooOo;
import p033OoooO0O.o00oO0o;
import p440o0OoOo0.o00O0O;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooO00o implements oo00o.OooO00o<CameraInternal.State> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0Oo0oo f4105OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final MutableLiveData<PreviewView.StreamState> f4106OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("this")
    public PreviewView.StreamState f4107OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0OO f4108OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f4109OooO0o = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooOOO f4110OooO0o0;

    public OooO00o(o0Oo0oo o0oo0oo2, MutableLiveData<PreviewView.StreamState> mutableLiveData, OooO0OO oooO0OO) {
        this.f4105OooO00o = o0oo0oo2;
        this.f4106OooO0O0 = mutableLiveData;
        this.f4108OooO0Oo = oooO0OO;
        synchronized (this) {
            this.f4107OooO0OO = mutableLiveData.getValue();
        }
    }

    @Override // androidx.camera.core.impl.oo00o.OooO00o
    @MainThread
    public final void OooO00o(@Nullable CameraInternal.State state) {
        CameraInternal.State state2 = state;
        if (state2 == CameraInternal.State.CLOSING || state2 == CameraInternal.State.CLOSED || state2 == CameraInternal.State.RELEASING || state2 == CameraInternal.State.RELEASED) {
            OooO0O0(PreviewView.StreamState.IDLE);
            if (this.f4109OooO0o) {
                this.f4109OooO0o = false;
                OooOOO oooOOO = this.f4110OooO0o0;
                if (oooOOO != null) {
                    oooOOO.cancel(false);
                    this.f4110OooO0o0 = null;
                    return;
                }
                return;
            }
            return;
        }
        if ((state2 == CameraInternal.State.OPENING || state2 == CameraInternal.State.OPEN || state2 == CameraInternal.State.PENDING_OPEN) && !this.f4109OooO0o) {
            OooO0O0(PreviewView.StreamState.IDLE);
            final ArrayList arrayList = new ArrayList();
            final o0Oo0oo o0oo0oo2 = this.f4105OooO00o;
            OooOO0O oooOO0OOooO0oo = OooOo.OooO0oo(OooOOO.OooO00o(o000Oo0.OooO00o(new o000Oo0.OooO0OO() { // from class: o0OoOo0.o0OoOo0
                @Override // o0ooOO0.o000Oo0.OooO0OO
                public final Object OooO0o0(o000Oo0.OooO00o oooO00o) {
                    this.getClass();
                    CameraInfo cameraInfo = o0oo0oo2;
                    o00Oo0 o00oo1 = new o00Oo0(oooO00o, cameraInfo);
                    arrayList.add(o00oo1);
                    ((o0Oo0oo) cameraInfo).OooO(o00oO0o.OooO00o(), o00oo1);
                    return "waitForCaptureResult";
                }
            })).OooO0OO(new OooOO0() { // from class: o0OoOo0.Oooo0
                @Override // p030OoooO.OooOO0
                public final com.google.common.util.concurrent.OooOO0O apply(Object obj) {
                    return this.f47176OooO00o.f4108OooO0Oo.OooO0oO();
                }
            }, o00oO0o.OooO00o()), new Function() { // from class: o0OoOo0.o000oOoO
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    this.f47188OooO00o.OooO0O0(PreviewView.StreamState.STREAMING);
                    return null;
                }
            }, o00oO0o.OooO00o());
            this.f4110OooO0o0 = oooOO0OOooO0oo;
            o00O0O o00o0o2 = new o00O0O(o0oo0oo2, this, arrayList);
            oooOO0OOooO0oo.OooO0oo(new OooOo.OooO0O0(oooOO0OOooO0oo, o00o0o2), o00oO0o.OooO00o());
            this.f4109OooO0o = true;
        }
    }

    public final void OooO0O0(PreviewView.StreamState streamState) {
        synchronized (this) {
            if (this.f4107OooO0OO.equals(streamState)) {
                return;
            }
            this.f4107OooO0OO = streamState;
            o00O0O0.OooO00o("StreamStateObserver", "Update Preview stream state to " + streamState);
            this.f4106OooO0O0.postValue(streamState);
        }
    }

    @Override // androidx.camera.core.impl.oo00o.OooO00o
    @MainThread
    public final void onError(@NonNull Throwable th) {
        OooOOO oooOOO = this.f4110OooO0o0;
        if (oooOOO != null) {
            oooOOO.cancel(false);
            this.f4110OooO0o0 = null;
        }
        OooO0O0(PreviewView.StreamState.IDLE);
    }
}

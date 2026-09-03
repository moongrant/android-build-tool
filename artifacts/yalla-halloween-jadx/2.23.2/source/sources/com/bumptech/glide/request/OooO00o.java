package com.bumptech.glide.request;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import p170o00Ooo0o.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements RequestCoordinator, Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f13158OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final RequestCoordinator f13159OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile Oooo0 f13160OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile Oooo0 f13161OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState f13162OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState f13163OooO0o0;

    public OooO00o(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f13163OooO0o0 = requestState;
        this.f13162OooO0o = requestState;
        this.f13158OooO00o = obj;
        this.f13159OooO0O0 = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean OooO(Oooo0 oooo0) {
        boolean z;
        synchronized (this.f13158OooO00o) {
            RequestCoordinator requestCoordinator = this.f13159OooO0O0;
            z = false;
            if ((requestCoordinator == null || requestCoordinator.OooO(this)) && oooo0.equals(this.f13160OooO0OO)) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, p170o00Ooo0o.Oooo0
    public final boolean OooO00o() {
        boolean z;
        synchronized (this.f13158OooO00o) {
            z = this.f13160OooO0OO.OooO00o() || this.f13161OooO0Oo.OooO00o();
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean OooO0O0(Oooo0 oooo0) {
        boolean z;
        boolean zEquals;
        RequestCoordinator.RequestState requestState;
        synchronized (this.f13158OooO00o) {
            RequestCoordinator requestCoordinator = this.f13159OooO0O0;
            z = false;
            if (requestCoordinator == null || requestCoordinator.OooO0O0(this)) {
                RequestCoordinator.RequestState requestState2 = this.f13163OooO0o0;
                RequestCoordinator.RequestState requestState3 = RequestCoordinator.RequestState.FAILED;
                if (requestState2 != requestState3) {
                    zEquals = oooo0.equals(this.f13160OooO0OO);
                } else {
                    zEquals = oooo0.equals(this.f13161OooO0Oo) && ((requestState = this.f13162OooO0o) == RequestCoordinator.RequestState.SUCCESS || requestState == requestState3);
                }
                if (zEquals) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // p170o00Ooo0o.Oooo0
    public final boolean OooO0OO() {
        boolean z;
        synchronized (this.f13158OooO00o) {
            RequestCoordinator.RequestState requestState = this.f13163OooO0o0;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
            z = requestState == requestState2 && this.f13162OooO0o == requestState2;
        }
        return z;
    }

    @Override // p170o00Ooo0o.Oooo0
    public final boolean OooO0Oo() {
        boolean z;
        synchronized (this.f13158OooO00o) {
            RequestCoordinator.RequestState requestState = this.f13163OooO0o0;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
            z = requestState == requestState2 || this.f13162OooO0o == requestState2;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void OooO0o(Oooo0 oooo0) {
        synchronized (this.f13158OooO00o) {
            if (oooo0.equals(this.f13160OooO0OO)) {
                this.f13163OooO0o0 = RequestCoordinator.RequestState.SUCCESS;
            } else if (oooo0.equals(this.f13161OooO0Oo)) {
                this.f13162OooO0o = RequestCoordinator.RequestState.SUCCESS;
            }
            RequestCoordinator requestCoordinator = this.f13159OooO0O0;
            if (requestCoordinator != null) {
                requestCoordinator.OooO0o(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean OooO0o0(Oooo0 oooo0) {
        boolean z;
        synchronized (this.f13158OooO00o) {
            RequestCoordinator requestCoordinator = this.f13159OooO0O0;
            z = requestCoordinator == null || requestCoordinator.OooO0o0(this);
        }
        return z;
    }

    @Override // p170o00Ooo0o.Oooo0
    public final boolean OooO0oO(Oooo0 oooo0) {
        if (!(oooo0 instanceof OooO00o)) {
            return false;
        }
        OooO00o oooO00o = (OooO00o) oooo0;
        return this.f13160OooO0OO.OooO0oO(oooO00o.f13160OooO0OO) && this.f13161OooO0Oo.OooO0oO(oooO00o.f13161OooO0Oo);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void OooO0oo(Oooo0 oooo0) {
        synchronized (this.f13158OooO00o) {
            if (oooo0.equals(this.f13161OooO0Oo)) {
                this.f13162OooO0o = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator requestCoordinator = this.f13159OooO0O0;
                if (requestCoordinator != null) {
                    requestCoordinator.OooO0oo(this);
                }
                return;
            }
            this.f13163OooO0o0 = RequestCoordinator.RequestState.FAILED;
            RequestCoordinator.RequestState requestState = this.f13162OooO0o;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState != requestState2) {
                this.f13162OooO0o = requestState2;
                this.f13161OooO0Oo.OooOO0();
            }
        }
    }

    @Override // p170o00Ooo0o.Oooo0
    public final void OooOO0() {
        synchronized (this.f13158OooO00o) {
            RequestCoordinator.RequestState requestState = this.f13163OooO0o0;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState != requestState2) {
                this.f13163OooO0o0 = requestState2;
                this.f13160OooO0OO.OooOO0();
            }
        }
    }

    @Override // p170o00Ooo0o.Oooo0
    public final void clear() {
        synchronized (this.f13158OooO00o) {
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f13163OooO0o0 = requestState;
            this.f13160OooO0OO.clear();
            if (this.f13162OooO0o != requestState) {
                this.f13162OooO0o = requestState;
                this.f13161OooO0Oo.clear();
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f13158OooO00o) {
            RequestCoordinator requestCoordinator = this.f13159OooO0O0;
            root = requestCoordinator != null ? requestCoordinator.getRoot() : this;
        }
        return root;
    }

    @Override // p170o00Ooo0o.Oooo0
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f13158OooO00o) {
            RequestCoordinator.RequestState requestState = this.f13163OooO0o0;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            z = requestState == requestState2 || this.f13162OooO0o == requestState2;
        }
        return z;
    }

    @Override // p170o00Ooo0o.Oooo0
    public final void pause() {
        synchronized (this.f13158OooO00o) {
            RequestCoordinator.RequestState requestState = this.f13163OooO0o0;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState == requestState2) {
                this.f13163OooO0o0 = RequestCoordinator.RequestState.PAUSED;
                this.f13160OooO0OO.pause();
            }
            if (this.f13162OooO0o == requestState2) {
                this.f13162OooO0o = RequestCoordinator.RequestState.PAUSED;
                this.f13161OooO0Oo.pause();
            }
        }
    }
}

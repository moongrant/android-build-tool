package com.bumptech.glide.request;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import p234o00oOoOO.oOO0O0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements RequestCoordinator, oOO0O0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f12535OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final RequestCoordinator f12536OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile oOO0O0O0 f12537OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile oOO0O0O0 f12538OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState f12539OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState f12540OooO0o0;

    public OooO00o(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f12540OooO0o0 = requestState;
        this.f12539OooO0o = requestState;
        this.f12535OooO00o = obj;
        this.f12536OooO0O0 = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void OooO(oOO0O0O0 ooo0o0o0) {
        synchronized (this.f12535OooO00o) {
            if (ooo0o0o0.equals(this.f12538OooO0Oo)) {
                this.f12539OooO0o = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator requestCoordinator = this.f12536OooO0O0;
                if (requestCoordinator != null) {
                    requestCoordinator.OooO(this);
                }
                return;
            }
            this.f12540OooO0o0 = RequestCoordinator.RequestState.FAILED;
            RequestCoordinator.RequestState requestState = this.f12539OooO0o;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState != requestState2) {
                this.f12539OooO0o = requestState2;
                this.f12538OooO0Oo.OooO0oo();
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, p234o00oOoOO.oOO0O0O0
    public final boolean OooO00o() {
        boolean z;
        synchronized (this.f12535OooO00o) {
            z = this.f12537OooO0OO.OooO00o() || this.f12538OooO0Oo.OooO00o();
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final RequestCoordinator OooO0O0() {
        RequestCoordinator requestCoordinatorOooO0O0;
        synchronized (this.f12535OooO00o) {
            RequestCoordinator requestCoordinator = this.f12536OooO0O0;
            requestCoordinatorOooO0O0 = requestCoordinator != null ? requestCoordinator.OooO0O0() : this;
        }
        return requestCoordinatorOooO0O0;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean OooO0OO(oOO0O0O0 ooo0o0o0) {
        boolean z;
        synchronized (this.f12535OooO00o) {
            RequestCoordinator requestCoordinator = this.f12536OooO0O0;
            z = true;
            if (!(requestCoordinator == null || requestCoordinator.OooO0OO(this)) || !OooOO0o(ooo0o0o0)) {
                z = false;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean OooO0Oo(oOO0O0O0 ooo0o0o0) {
        boolean z;
        synchronized (this.f12535OooO00o) {
            RequestCoordinator requestCoordinator = this.f12536OooO0O0;
            z = false;
            if ((requestCoordinator == null || requestCoordinator.OooO0Oo(this)) && OooOO0o(ooo0o0o0)) {
                z = true;
            }
        }
        return z;
    }

    @Override // p234o00oOoOO.oOO0O0O0
    public final boolean OooO0o() {
        boolean z;
        synchronized (this.f12535OooO00o) {
            RequestCoordinator.RequestState requestState = this.f12540OooO0o0;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
            z = requestState == requestState2 && this.f12539OooO0o == requestState2;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean OooO0o0(oOO0O0O0 ooo0o0o0) {
        boolean z;
        synchronized (this.f12535OooO00o) {
            RequestCoordinator requestCoordinator = this.f12536OooO0O0;
            z = true;
            if (!(requestCoordinator == null || requestCoordinator.OooO0o0(this)) || !OooOO0o(ooo0o0o0)) {
                z = false;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void OooO0oO(oOO0O0O0 ooo0o0o0) {
        synchronized (this.f12535OooO00o) {
            if (ooo0o0o0.equals(this.f12537OooO0OO)) {
                this.f12540OooO0o0 = RequestCoordinator.RequestState.SUCCESS;
            } else if (ooo0o0o0.equals(this.f12538OooO0Oo)) {
                this.f12539OooO0o = RequestCoordinator.RequestState.SUCCESS;
            }
            RequestCoordinator requestCoordinator = this.f12536OooO0O0;
            if (requestCoordinator != null) {
                requestCoordinator.OooO0oO(this);
            }
        }
    }

    @Override // p234o00oOoOO.oOO0O0O0
    public final void OooO0oo() {
        synchronized (this.f12535OooO00o) {
            RequestCoordinator.RequestState requestState = this.f12540OooO0o0;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState != requestState2) {
                this.f12540OooO0o0 = requestState2;
                this.f12537OooO0OO.OooO0oo();
            }
        }
    }

    @Override // p234o00oOoOO.oOO0O0O0
    public final boolean OooOO0() {
        boolean z;
        synchronized (this.f12535OooO00o) {
            RequestCoordinator.RequestState requestState = this.f12540OooO0o0;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
            z = requestState == requestState2 || this.f12539OooO0o == requestState2;
        }
        return z;
    }

    @Override // p234o00oOoOO.oOO0O0O0
    public final boolean OooOO0O(oOO0O0O0 ooo0o0o0) {
        if (!(ooo0o0o0 instanceof OooO00o)) {
            return false;
        }
        OooO00o oooO00o = (OooO00o) ooo0o0o0;
        return this.f12537OooO0OO.OooOO0O(oooO00o.f12537OooO0OO) && this.f12538OooO0Oo.OooOO0O(oooO00o.f12538OooO0Oo);
    }

    @GuardedBy("requestLock")
    public final boolean OooOO0o(oOO0O0O0 ooo0o0o0) {
        return ooo0o0o0.equals(this.f12537OooO0OO) || (this.f12540OooO0o0 == RequestCoordinator.RequestState.FAILED && ooo0o0o0.equals(this.f12538OooO0Oo));
    }

    @Override // p234o00oOoOO.oOO0O0O0
    public final void clear() {
        synchronized (this.f12535OooO00o) {
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f12540OooO0o0 = requestState;
            this.f12537OooO0OO.clear();
            if (this.f12539OooO0o != requestState) {
                this.f12539OooO0o = requestState;
                this.f12538OooO0Oo.clear();
            }
        }
    }

    @Override // p234o00oOoOO.oOO0O0O0
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f12535OooO00o) {
            RequestCoordinator.RequestState requestState = this.f12540OooO0o0;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            z = requestState == requestState2 || this.f12539OooO0o == requestState2;
        }
        return z;
    }

    @Override // p234o00oOoOO.oOO0O0O0
    public final void pause() {
        synchronized (this.f12535OooO00o) {
            RequestCoordinator.RequestState requestState = this.f12540OooO0o0;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState == requestState2) {
                this.f12540OooO0o0 = RequestCoordinator.RequestState.PAUSED;
                this.f12537OooO0OO.pause();
            }
            if (this.f12539OooO0o == requestState2) {
                this.f12539OooO0o = RequestCoordinator.RequestState.PAUSED;
                this.f12538OooO0Oo.pause();
            }
        }
    }
}

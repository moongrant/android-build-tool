package com.bumptech.glide.request;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import p234o00oOoOO.oOO0O0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 implements RequestCoordinator, oOO0O0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final RequestCoordinator f12541OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f12542OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile oOO0O0O0 f12543OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile oOO0O0O0 f12544OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState f12545OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState f12546OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @GuardedBy("requestLock")
    public boolean f12547OooO0oO;

    public OooO0O0(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f12546OooO0o0 = requestState;
        this.f12545OooO0o = requestState;
        this.f12542OooO0O0 = obj;
        this.f12541OooO00o = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void OooO(oOO0O0O0 ooo0o0o0) {
        synchronized (this.f12542OooO0O0) {
            if (!ooo0o0o0.equals(this.f12543OooO0OO)) {
                this.f12545OooO0o = RequestCoordinator.RequestState.FAILED;
                return;
            }
            this.f12546OooO0o0 = RequestCoordinator.RequestState.FAILED;
            RequestCoordinator requestCoordinator = this.f12541OooO00o;
            if (requestCoordinator != null) {
                requestCoordinator.OooO(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, p234o00oOoOO.oOO0O0O0
    public final boolean OooO00o() {
        boolean z;
        synchronized (this.f12542OooO0O0) {
            z = this.f12544OooO0Oo.OooO00o() || this.f12543OooO0OO.OooO00o();
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final RequestCoordinator OooO0O0() {
        RequestCoordinator requestCoordinatorOooO0O0;
        synchronized (this.f12542OooO0O0) {
            RequestCoordinator requestCoordinator = this.f12541OooO00o;
            requestCoordinatorOooO0O0 = requestCoordinator != null ? requestCoordinator.OooO0O0() : this;
        }
        return requestCoordinatorOooO0O0;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean OooO0OO(oOO0O0O0 ooo0o0o0) {
        boolean z;
        synchronized (this.f12542OooO0O0) {
            RequestCoordinator requestCoordinator = this.f12541OooO00o;
            z = false;
            if ((requestCoordinator == null || requestCoordinator.OooO0OO(this)) && (ooo0o0o0.equals(this.f12543OooO0OO) || this.f12546OooO0o0 != RequestCoordinator.RequestState.SUCCESS)) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean OooO0Oo(oOO0O0O0 ooo0o0o0) {
        boolean z;
        synchronized (this.f12542OooO0O0) {
            RequestCoordinator requestCoordinator = this.f12541OooO00o;
            z = false;
            if ((requestCoordinator == null || requestCoordinator.OooO0Oo(this)) && ooo0o0o0.equals(this.f12543OooO0OO) && !OooO00o()) {
                z = true;
            }
        }
        return z;
    }

    @Override // p234o00oOoOO.oOO0O0O0
    public final boolean OooO0o() {
        boolean z;
        synchronized (this.f12542OooO0O0) {
            z = this.f12546OooO0o0 == RequestCoordinator.RequestState.CLEARED;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean OooO0o0(oOO0O0O0 ooo0o0o0) {
        boolean z;
        synchronized (this.f12542OooO0O0) {
            RequestCoordinator requestCoordinator = this.f12541OooO00o;
            z = false;
            if ((requestCoordinator == null || requestCoordinator.OooO0o0(this)) && ooo0o0o0.equals(this.f12543OooO0OO) && this.f12546OooO0o0 != RequestCoordinator.RequestState.PAUSED) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void OooO0oO(oOO0O0O0 ooo0o0o0) {
        synchronized (this.f12542OooO0O0) {
            if (ooo0o0o0.equals(this.f12544OooO0Oo)) {
                this.f12545OooO0o = RequestCoordinator.RequestState.SUCCESS;
                return;
            }
            this.f12546OooO0o0 = RequestCoordinator.RequestState.SUCCESS;
            RequestCoordinator requestCoordinator = this.f12541OooO00o;
            if (requestCoordinator != null) {
                requestCoordinator.OooO0oO(this);
            }
            if (!this.f12545OooO0o.OooO00o()) {
                this.f12544OooO0Oo.clear();
            }
        }
    }

    @Override // p234o00oOoOO.oOO0O0O0
    public final void OooO0oo() {
        synchronized (this.f12542OooO0O0) {
            this.f12547OooO0oO = true;
            try {
                if (this.f12546OooO0o0 != RequestCoordinator.RequestState.SUCCESS) {
                    RequestCoordinator.RequestState requestState = this.f12545OooO0o;
                    RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                    if (requestState != requestState2) {
                        this.f12545OooO0o = requestState2;
                        this.f12544OooO0Oo.OooO0oo();
                    }
                }
                if (this.f12547OooO0oO) {
                    RequestCoordinator.RequestState requestState3 = this.f12546OooO0o0;
                    RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                    if (requestState3 != requestState4) {
                        this.f12546OooO0o0 = requestState4;
                        this.f12543OooO0OO.OooO0oo();
                    }
                }
                this.f12547OooO0oO = false;
            } catch (Throwable th) {
                this.f12547OooO0oO = false;
                throw th;
            }
        }
    }

    @Override // p234o00oOoOO.oOO0O0O0
    public final boolean OooOO0() {
        boolean z;
        synchronized (this.f12542OooO0O0) {
            z = this.f12546OooO0o0 == RequestCoordinator.RequestState.SUCCESS;
        }
        return z;
    }

    @Override // p234o00oOoOO.oOO0O0O0
    public final boolean OooOO0O(oOO0O0O0 ooo0o0o0) {
        if (!(ooo0o0o0 instanceof OooO0O0)) {
            return false;
        }
        OooO0O0 oooO0O0 = (OooO0O0) ooo0o0o0;
        if (this.f12543OooO0OO == null) {
            if (oooO0O0.f12543OooO0OO != null) {
                return false;
            }
        } else if (!this.f12543OooO0OO.OooOO0O(oooO0O0.f12543OooO0OO)) {
            return false;
        }
        if (this.f12544OooO0Oo == null) {
            if (oooO0O0.f12544OooO0Oo != null) {
                return false;
            }
        } else if (!this.f12544OooO0Oo.OooOO0O(oooO0O0.f12544OooO0Oo)) {
            return false;
        }
        return true;
    }

    @Override // p234o00oOoOO.oOO0O0O0
    public final void clear() {
        synchronized (this.f12542OooO0O0) {
            this.f12547OooO0oO = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f12546OooO0o0 = requestState;
            this.f12545OooO0o = requestState;
            this.f12544OooO0Oo.clear();
            this.f12543OooO0OO.clear();
        }
    }

    @Override // p234o00oOoOO.oOO0O0O0
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f12542OooO0O0) {
            z = this.f12546OooO0o0 == RequestCoordinator.RequestState.RUNNING;
        }
        return z;
    }

    @Override // p234o00oOoOO.oOO0O0O0
    public final void pause() {
        synchronized (this.f12542OooO0O0) {
            if (!this.f12545OooO0o.OooO00o()) {
                this.f12545OooO0o = RequestCoordinator.RequestState.PAUSED;
                this.f12544OooO0Oo.pause();
            }
            if (!this.f12546OooO0o0.OooO00o()) {
                this.f12546OooO0o0 = RequestCoordinator.RequestState.PAUSED;
                this.f12543OooO0OO.pause();
            }
        }
    }
}

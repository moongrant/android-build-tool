package com.bumptech.glide.request;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import o00OO.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements RequestCoordinator, OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final RequestCoordinator f10086OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f10087OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile OooO0OO f10088OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile OooO0OO f10089OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState f10090OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState f10091OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @GuardedBy("requestLock")
    public boolean f10092OooO0oO;

    public OooO0O0(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f10091OooO0o0 = requestState;
        this.f10090OooO0o = requestState;
        this.f10087OooO0O0 = obj;
        this.f10086OooO00o = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean OooO(OooO0OO oooO0OO) {
        boolean z;
        synchronized (this.f10087OooO0O0) {
            RequestCoordinator requestCoordinator = this.f10086OooO00o;
            z = false;
            if ((requestCoordinator == null || requestCoordinator.OooO(this)) && oooO0OO.equals(this.f10088OooO0OO) && this.f10091OooO0o0 != RequestCoordinator.RequestState.PAUSED) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, o00OO.OooO0OO
    public final boolean OooO00o() {
        boolean z;
        synchronized (this.f10087OooO0O0) {
            z = this.f10089OooO0Oo.OooO00o() || this.f10088OooO0OO.OooO00o();
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void OooO0O0(OooO0OO oooO0OO) {
        synchronized (this.f10087OooO0O0) {
            if (!oooO0OO.equals(this.f10088OooO0OO)) {
                this.f10090OooO0o = RequestCoordinator.RequestState.FAILED;
                return;
            }
            this.f10091OooO0o0 = RequestCoordinator.RequestState.FAILED;
            RequestCoordinator requestCoordinator = this.f10086OooO00o;
            if (requestCoordinator != null) {
                requestCoordinator.OooO0O0(this);
            }
        }
    }

    @Override // o00OO.OooO0OO
    public final boolean OooO0OO(OooO0OO oooO0OO) {
        if (!(oooO0OO instanceof OooO0O0)) {
            return false;
        }
        OooO0O0 oooO0O0 = (OooO0O0) oooO0OO;
        if (this.f10088OooO0OO == null) {
            if (oooO0O0.f10088OooO0OO != null) {
                return false;
            }
        } else if (!this.f10088OooO0OO.OooO0OO(oooO0O0.f10088OooO0OO)) {
            return false;
        }
        if (this.f10089OooO0Oo == null) {
            if (oooO0O0.f10089OooO0Oo != null) {
                return false;
            }
        } else if (!this.f10089OooO0Oo.OooO0OO(oooO0O0.f10089OooO0Oo)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean OooO0Oo(OooO0OO oooO0OO) {
        boolean z;
        synchronized (this.f10087OooO0O0) {
            RequestCoordinator requestCoordinator = this.f10086OooO00o;
            z = false;
            if ((requestCoordinator == null || requestCoordinator.OooO0Oo(this)) && (oooO0OO.equals(this.f10088OooO0OO) || this.f10091OooO0o0 != RequestCoordinator.RequestState.SUCCESS)) {
                z = true;
            }
        }
        return z;
    }

    @Override // o00OO.OooO0OO
    public final boolean OooO0o() {
        boolean z;
        synchronized (this.f10087OooO0O0) {
            z = this.f10091OooO0o0 == RequestCoordinator.RequestState.CLEARED;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void OooO0o0(OooO0OO oooO0OO) {
        synchronized (this.f10087OooO0O0) {
            if (oooO0OO.equals(this.f10089OooO0Oo)) {
                this.f10090OooO0o = RequestCoordinator.RequestState.SUCCESS;
                return;
            }
            this.f10091OooO0o0 = RequestCoordinator.RequestState.SUCCESS;
            RequestCoordinator requestCoordinator = this.f10086OooO00o;
            if (requestCoordinator != null) {
                requestCoordinator.OooO0o0(this);
            }
            if (!this.f10090OooO0o.OooO00o()) {
                this.f10089OooO0Oo.clear();
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean OooO0oO(OooO0OO oooO0OO) {
        boolean z;
        synchronized (this.f10087OooO0O0) {
            RequestCoordinator requestCoordinator = this.f10086OooO00o;
            z = false;
            if ((requestCoordinator == null || requestCoordinator.OooO0oO(this)) && oooO0OO.equals(this.f10088OooO0OO) && !OooO00o()) {
                z = true;
            }
        }
        return z;
    }

    @Override // o00OO.OooO0OO
    public final boolean OooO0oo() {
        boolean z;
        synchronized (this.f10087OooO0O0) {
            z = this.f10091OooO0o0 == RequestCoordinator.RequestState.SUCCESS;
        }
        return z;
    }

    @Override // o00OO.OooO0OO
    public final void OooOO0() {
        synchronized (this.f10087OooO0O0) {
            this.f10092OooO0oO = true;
            try {
                if (this.f10091OooO0o0 != RequestCoordinator.RequestState.SUCCESS) {
                    RequestCoordinator.RequestState requestState = this.f10090OooO0o;
                    RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                    if (requestState != requestState2) {
                        this.f10090OooO0o = requestState2;
                        this.f10089OooO0Oo.OooOO0();
                    }
                }
                if (this.f10092OooO0oO) {
                    RequestCoordinator.RequestState requestState3 = this.f10091OooO0o0;
                    RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                    if (requestState3 != requestState4) {
                        this.f10091OooO0o0 = requestState4;
                        this.f10088OooO0OO.OooOO0();
                    }
                }
                this.f10092OooO0oO = false;
            } catch (Throwable th) {
                this.f10092OooO0oO = false;
                throw th;
            }
        }
    }

    @Override // o00OO.OooO0OO
    public final void clear() {
        synchronized (this.f10087OooO0O0) {
            this.f10092OooO0oO = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f10091OooO0o0 = requestState;
            this.f10090OooO0o = requestState;
            this.f10089OooO0Oo.clear();
            this.f10088OooO0OO.clear();
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f10087OooO0O0) {
            RequestCoordinator requestCoordinator = this.f10086OooO00o;
            root = requestCoordinator != null ? requestCoordinator.getRoot() : this;
        }
        return root;
    }

    @Override // o00OO.OooO0OO
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f10087OooO0O0) {
            z = this.f10091OooO0o0 == RequestCoordinator.RequestState.RUNNING;
        }
        return z;
    }

    @Override // o00OO.OooO0OO
    public final void pause() {
        synchronized (this.f10087OooO0O0) {
            if (!this.f10090OooO0o.OooO00o()) {
                this.f10090OooO0o = RequestCoordinator.RequestState.PAUSED;
                this.f10089OooO0Oo.pause();
            }
            if (!this.f10091OooO0o0.OooO00o()) {
                this.f10091OooO0o0 = RequestCoordinator.RequestState.PAUSED;
                this.f10088OooO0OO.pause();
            }
        }
    }
}

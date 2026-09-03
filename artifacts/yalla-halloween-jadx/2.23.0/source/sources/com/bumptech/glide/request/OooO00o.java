package com.bumptech.glide.request;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import o00OO.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements RequestCoordinator, OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f10080OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final RequestCoordinator f10081OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile OooO0OO f10082OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile OooO0OO f10083OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState f10084OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState f10085OooO0o0;

    public OooO00o(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f10085OooO0o0 = requestState;
        this.f10084OooO0o = requestState;
        this.f10080OooO00o = obj;
        this.f10081OooO0O0 = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean OooO(OooO0OO oooO0OO) {
        boolean z;
        synchronized (this.f10080OooO00o) {
            RequestCoordinator requestCoordinator = this.f10081OooO0O0;
            z = false;
            if ((requestCoordinator == null || requestCoordinator.OooO(this)) && oooO0OO.equals(this.f10082OooO0OO)) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, o00OO.OooO0OO
    public final boolean OooO00o() {
        boolean z;
        synchronized (this.f10080OooO00o) {
            z = this.f10082OooO0OO.OooO00o() || this.f10083OooO0Oo.OooO00o();
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void OooO0O0(OooO0OO oooO0OO) {
        synchronized (this.f10080OooO00o) {
            if (oooO0OO.equals(this.f10083OooO0Oo)) {
                this.f10084OooO0o = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator requestCoordinator = this.f10081OooO0O0;
                if (requestCoordinator != null) {
                    requestCoordinator.OooO0O0(this);
                }
                return;
            }
            this.f10085OooO0o0 = RequestCoordinator.RequestState.FAILED;
            RequestCoordinator.RequestState requestState = this.f10084OooO0o;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState != requestState2) {
                this.f10084OooO0o = requestState2;
                this.f10083OooO0Oo.OooOO0();
            }
        }
    }

    @Override // o00OO.OooO0OO
    public final boolean OooO0OO(OooO0OO oooO0OO) {
        if (!(oooO0OO instanceof OooO00o)) {
            return false;
        }
        OooO00o oooO00o = (OooO00o) oooO0OO;
        return this.f10082OooO0OO.OooO0OO(oooO00o.f10082OooO0OO) && this.f10083OooO0Oo.OooO0OO(oooO00o.f10083OooO0Oo);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean OooO0Oo(OooO0OO oooO0OO) {
        boolean z;
        synchronized (this.f10080OooO00o) {
            RequestCoordinator requestCoordinator = this.f10081OooO0O0;
            z = requestCoordinator == null || requestCoordinator.OooO0Oo(this);
        }
        return z;
    }

    @Override // o00OO.OooO0OO
    public final boolean OooO0o() {
        boolean z;
        synchronized (this.f10080OooO00o) {
            RequestCoordinator.RequestState requestState = this.f10085OooO0o0;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
            z = requestState == requestState2 && this.f10084OooO0o == requestState2;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void OooO0o0(OooO0OO oooO0OO) {
        synchronized (this.f10080OooO00o) {
            if (oooO0OO.equals(this.f10082OooO0OO)) {
                this.f10085OooO0o0 = RequestCoordinator.RequestState.SUCCESS;
            } else if (oooO0OO.equals(this.f10083OooO0Oo)) {
                this.f10084OooO0o = RequestCoordinator.RequestState.SUCCESS;
            }
            RequestCoordinator requestCoordinator = this.f10081OooO0O0;
            if (requestCoordinator != null) {
                requestCoordinator.OooO0o0(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean OooO0oO(OooO0OO oooO0OO) {
        boolean z;
        boolean zEquals;
        RequestCoordinator.RequestState requestState;
        synchronized (this.f10080OooO00o) {
            RequestCoordinator requestCoordinator = this.f10081OooO0O0;
            z = false;
            if (requestCoordinator == null || requestCoordinator.OooO0oO(this)) {
                RequestCoordinator.RequestState requestState2 = this.f10085OooO0o0;
                RequestCoordinator.RequestState requestState3 = RequestCoordinator.RequestState.FAILED;
                if (requestState2 != requestState3) {
                    zEquals = oooO0OO.equals(this.f10082OooO0OO);
                } else {
                    zEquals = oooO0OO.equals(this.f10083OooO0Oo) && ((requestState = this.f10084OooO0o) == RequestCoordinator.RequestState.SUCCESS || requestState == requestState3);
                }
                if (zEquals) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // o00OO.OooO0OO
    public final boolean OooO0oo() {
        boolean z;
        synchronized (this.f10080OooO00o) {
            RequestCoordinator.RequestState requestState = this.f10085OooO0o0;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
            z = requestState == requestState2 || this.f10084OooO0o == requestState2;
        }
        return z;
    }

    @Override // o00OO.OooO0OO
    public final void OooOO0() {
        synchronized (this.f10080OooO00o) {
            RequestCoordinator.RequestState requestState = this.f10085OooO0o0;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState != requestState2) {
                this.f10085OooO0o0 = requestState2;
                this.f10082OooO0OO.OooOO0();
            }
        }
    }

    @Override // o00OO.OooO0OO
    public final void clear() {
        synchronized (this.f10080OooO00o) {
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f10085OooO0o0 = requestState;
            this.f10082OooO0OO.clear();
            if (this.f10084OooO0o != requestState) {
                this.f10084OooO0o = requestState;
                this.f10083OooO0Oo.clear();
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f10080OooO00o) {
            RequestCoordinator requestCoordinator = this.f10081OooO0O0;
            root = requestCoordinator != null ? requestCoordinator.getRoot() : this;
        }
        return root;
    }

    @Override // o00OO.OooO0OO
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f10080OooO00o) {
            RequestCoordinator.RequestState requestState = this.f10085OooO0o0;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            z = requestState == requestState2 || this.f10084OooO0o == requestState2;
        }
        return z;
    }

    @Override // o00OO.OooO0OO
    public final void pause() {
        synchronized (this.f10080OooO00o) {
            RequestCoordinator.RequestState requestState = this.f10085OooO0o0;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState == requestState2) {
                this.f10085OooO0o0 = RequestCoordinator.RequestState.PAUSED;
                this.f10082OooO0OO.pause();
            }
            if (this.f10084OooO0o == requestState2) {
                this.f10084OooO0o = RequestCoordinator.RequestState.PAUSED;
                this.f10083OooO0Oo.pause();
            }
        }
    }
}

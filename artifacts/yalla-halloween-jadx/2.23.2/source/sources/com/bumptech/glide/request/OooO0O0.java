package com.bumptech.glide.request;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import p170o00Ooo0o.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements RequestCoordinator, Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final RequestCoordinator f13164OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f13165OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile Oooo0 f13166OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile Oooo0 f13167OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState f13168OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState f13169OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @GuardedBy("requestLock")
    public boolean f13170OooO0oO;

    public OooO0O0(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f13169OooO0o0 = requestState;
        this.f13168OooO0o = requestState;
        this.f13165OooO0O0 = obj;
        this.f13164OooO00o = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean OooO(Oooo0 oooo0) {
        boolean z;
        synchronized (this.f13165OooO0O0) {
            RequestCoordinator requestCoordinator = this.f13164OooO00o;
            z = false;
            if ((requestCoordinator == null || requestCoordinator.OooO(this)) && oooo0.equals(this.f13166OooO0OO) && this.f13169OooO0o0 != RequestCoordinator.RequestState.PAUSED) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, p170o00Ooo0o.Oooo0
    public final boolean OooO00o() {
        boolean z;
        synchronized (this.f13165OooO0O0) {
            z = this.f13167OooO0Oo.OooO00o() || this.f13166OooO0OO.OooO00o();
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean OooO0O0(Oooo0 oooo0) {
        boolean z;
        synchronized (this.f13165OooO0O0) {
            RequestCoordinator requestCoordinator = this.f13164OooO00o;
            z = false;
            if ((requestCoordinator == null || requestCoordinator.OooO0O0(this)) && oooo0.equals(this.f13166OooO0OO) && !OooO00o()) {
                z = true;
            }
        }
        return z;
    }

    @Override // p170o00Ooo0o.Oooo0
    public final boolean OooO0OO() {
        boolean z;
        synchronized (this.f13165OooO0O0) {
            z = this.f13169OooO0o0 == RequestCoordinator.RequestState.CLEARED;
        }
        return z;
    }

    @Override // p170o00Ooo0o.Oooo0
    public final boolean OooO0Oo() {
        boolean z;
        synchronized (this.f13165OooO0O0) {
            z = this.f13169OooO0o0 == RequestCoordinator.RequestState.SUCCESS;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void OooO0o(Oooo0 oooo0) {
        synchronized (this.f13165OooO0O0) {
            if (oooo0.equals(this.f13167OooO0Oo)) {
                this.f13168OooO0o = RequestCoordinator.RequestState.SUCCESS;
                return;
            }
            this.f13169OooO0o0 = RequestCoordinator.RequestState.SUCCESS;
            RequestCoordinator requestCoordinator = this.f13164OooO00o;
            if (requestCoordinator != null) {
                requestCoordinator.OooO0o(this);
            }
            if (!this.f13168OooO0o.OooO00o()) {
                this.f13167OooO0Oo.clear();
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean OooO0o0(Oooo0 oooo0) {
        boolean z;
        synchronized (this.f13165OooO0O0) {
            RequestCoordinator requestCoordinator = this.f13164OooO00o;
            z = false;
            if ((requestCoordinator == null || requestCoordinator.OooO0o0(this)) && (oooo0.equals(this.f13166OooO0OO) || this.f13169OooO0o0 != RequestCoordinator.RequestState.SUCCESS)) {
                z = true;
            }
        }
        return z;
    }

    @Override // p170o00Ooo0o.Oooo0
    public final boolean OooO0oO(Oooo0 oooo0) {
        if (!(oooo0 instanceof OooO0O0)) {
            return false;
        }
        OooO0O0 oooO0O0 = (OooO0O0) oooo0;
        if (this.f13166OooO0OO == null) {
            if (oooO0O0.f13166OooO0OO != null) {
                return false;
            }
        } else if (!this.f13166OooO0OO.OooO0oO(oooO0O0.f13166OooO0OO)) {
            return false;
        }
        if (this.f13167OooO0Oo == null) {
            if (oooO0O0.f13167OooO0Oo != null) {
                return false;
            }
        } else if (!this.f13167OooO0Oo.OooO0oO(oooO0O0.f13167OooO0Oo)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void OooO0oo(Oooo0 oooo0) {
        synchronized (this.f13165OooO0O0) {
            if (!oooo0.equals(this.f13166OooO0OO)) {
                this.f13168OooO0o = RequestCoordinator.RequestState.FAILED;
                return;
            }
            this.f13169OooO0o0 = RequestCoordinator.RequestState.FAILED;
            RequestCoordinator requestCoordinator = this.f13164OooO00o;
            if (requestCoordinator != null) {
                requestCoordinator.OooO0oo(this);
            }
        }
    }

    @Override // p170o00Ooo0o.Oooo0
    public final void OooOO0() {
        synchronized (this.f13165OooO0O0) {
            this.f13170OooO0oO = true;
            try {
                if (this.f13169OooO0o0 != RequestCoordinator.RequestState.SUCCESS) {
                    RequestCoordinator.RequestState requestState = this.f13168OooO0o;
                    RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                    if (requestState != requestState2) {
                        this.f13168OooO0o = requestState2;
                        this.f13167OooO0Oo.OooOO0();
                    }
                }
                if (this.f13170OooO0oO) {
                    RequestCoordinator.RequestState requestState3 = this.f13169OooO0o0;
                    RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                    if (requestState3 != requestState4) {
                        this.f13169OooO0o0 = requestState4;
                        this.f13166OooO0OO.OooOO0();
                    }
                }
                this.f13170OooO0oO = false;
            } catch (Throwable th) {
                this.f13170OooO0oO = false;
                throw th;
            }
        }
    }

    @Override // p170o00Ooo0o.Oooo0
    public final void clear() {
        synchronized (this.f13165OooO0O0) {
            this.f13170OooO0oO = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f13169OooO0o0 = requestState;
            this.f13168OooO0o = requestState;
            this.f13167OooO0Oo.clear();
            this.f13166OooO0OO.clear();
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f13165OooO0O0) {
            RequestCoordinator requestCoordinator = this.f13164OooO00o;
            root = requestCoordinator != null ? requestCoordinator.getRoot() : this;
        }
        return root;
    }

    @Override // p170o00Ooo0o.Oooo0
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f13165OooO0O0) {
            z = this.f13169OooO0o0 == RequestCoordinator.RequestState.RUNNING;
        }
        return z;
    }

    @Override // p170o00Ooo0o.Oooo0
    public final void pause() {
        synchronized (this.f13165OooO0O0) {
            if (!this.f13168OooO0o.OooO00o()) {
                this.f13168OooO0o = RequestCoordinator.RequestState.PAUSED;
                this.f13167OooO0Oo.pause();
            }
            if (!this.f13169OooO0o0.OooO00o()) {
                this.f13169OooO0o0 = RequestCoordinator.RequestState.PAUSED;
                this.f13166OooO0OO.pause();
            }
        }
    }
}

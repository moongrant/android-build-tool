package com.bumptech.glide.request;

import p234o00oOoOO.oOO0O0O0;

/* JADX INFO: loaded from: classes.dex */
public interface RequestCoordinator {

    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);

        private final boolean isComplete;

        RequestState(boolean z) {
            this.isComplete = z;
        }

        public final boolean OooO00o() {
            return this.isComplete;
        }
    }

    void OooO(oOO0O0O0 ooo0o0o0);

    boolean OooO00o();

    RequestCoordinator OooO0O0();

    boolean OooO0OO(oOO0O0O0 ooo0o0o0);

    boolean OooO0Oo(oOO0O0O0 ooo0o0o0);

    boolean OooO0o0(oOO0O0O0 ooo0o0o0);

    void OooO0oO(oOO0O0O0 ooo0o0o0);
}

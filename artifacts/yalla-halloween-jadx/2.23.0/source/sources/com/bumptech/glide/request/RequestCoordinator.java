package com.bumptech.glide.request;

import o00OO.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
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

    boolean OooO(OooO0OO oooO0OO);

    boolean OooO00o();

    void OooO0O0(OooO0OO oooO0OO);

    boolean OooO0Oo(OooO0OO oooO0OO);

    void OooO0o0(OooO0OO oooO0OO);

    boolean OooO0oO(OooO0OO oooO0OO);

    RequestCoordinator getRoot();
}

package com.bumptech.glide.request;

import p170o00Ooo0o.Oooo0;

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

    boolean OooO(Oooo0 oooo0);

    boolean OooO00o();

    boolean OooO0O0(Oooo0 oooo0);

    void OooO0o(Oooo0 oooo0);

    boolean OooO0o0(Oooo0 oooo0);

    void OooO0oo(Oooo0 oooo0);

    RequestCoordinator getRoot();
}

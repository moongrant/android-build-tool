package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.OooO0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class LogEventDropped {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f13922OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Reason f13923OooO0O0;

    public enum Reason implements OooO0O0 {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        private final int number_;

        Reason(int i) {
            this.number_ = i;
        }

        @Override // com.google.firebase.encoders.proto.OooO0O0
        public final int getNumber() {
            return this.number_;
        }
    }

    public LogEventDropped(long j, Reason reason) {
        this.f13922OooO00o = j;
        this.f13923OooO0O0 = reason;
    }
}

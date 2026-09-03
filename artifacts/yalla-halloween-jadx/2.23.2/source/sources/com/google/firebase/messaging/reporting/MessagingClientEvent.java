package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.proto.OooO0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class MessagingClientEvent {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f19918OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f19919OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f19920OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f19921OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final MessageType f19922OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f19923OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final SDKPlatform f19924OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f19925OooO0oO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final String f19927OooOO0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Event f19929OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final String f19931OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final String f19932OooOOOO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f19926OooO0oo = 0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final long f19928OooOO0O = 0;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final long f19930OooOOO = 0;

    public enum Event implements OooO0O0 {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);

        private final int number_;

        Event(int i) {
            this.number_ = i;
        }

        @Override // com.google.firebase.encoders.proto.OooO0O0
        public final int getNumber() {
            return this.number_;
        }
    }

    public enum MessageType implements OooO0O0 {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);

        private final int number_;

        MessageType(int i) {
            this.number_ = i;
        }

        @Override // com.google.firebase.encoders.proto.OooO0O0
        public final int getNumber() {
            return this.number_;
        }
    }

    public enum SDKPlatform implements OooO0O0 {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);

        private final int number_;

        SDKPlatform(int i) {
            this.number_ = i;
        }

        @Override // com.google.firebase.encoders.proto.OooO0O0
        public final int getNumber() {
            return this.number_;
        }
    }

    public MessagingClientEvent(long j, String str, String str2, MessageType messageType, SDKPlatform sDKPlatform, String str3, String str4, int i, String str5, Event event, String str6, String str7) {
        this.f19919OooO00o = j;
        this.f19920OooO0O0 = str;
        this.f19921OooO0OO = str2;
        this.f19922OooO0Oo = messageType;
        this.f19924OooO0o0 = sDKPlatform;
        this.f19923OooO0o = str3;
        this.f19925OooO0oO = str4;
        this.f19918OooO = i;
        this.f19927OooOO0 = str5;
        this.f19929OooOO0o = event;
        this.f19931OooOOO0 = str6;
        this.f19932OooOOOO = str7;
    }
}

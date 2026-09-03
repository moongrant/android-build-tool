package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.proto.OooO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class MessagingClientEvent {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f19207OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f19208OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f19209OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f19210OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final MessageType f19211OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f19212OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final SDKPlatform f19213OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f19214OooO0oO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final String f19216OooOO0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Event f19218OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final String f19220OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final String f19221OooOOOO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f19215OooO0oo = 0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final long f19217OooOO0O = 0;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final long f19219OooOOO = 0;

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
        this.f19208OooO00o = j;
        this.f19209OooO0O0 = str;
        this.f19210OooO0OO = str2;
        this.f19211OooO0Oo = messageType;
        this.f19213OooO0o0 = sDKPlatform;
        this.f19212OooO0o = str3;
        this.f19214OooO0oO = str4;
        this.f19207OooO = i;
        this.f19216OooOO0 = str5;
        this.f19218OooOO0o = event;
        this.f19220OooOOO0 = str6;
        this.f19221OooOOOO = str7;
    }
}

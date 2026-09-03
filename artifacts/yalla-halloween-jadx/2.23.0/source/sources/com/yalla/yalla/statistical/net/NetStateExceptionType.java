package com.yalla.yalla.statistical.net;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
@Retention(RetentionPolicy.SOURCE)
public @interface NetStateExceptionType {
    public static final String CONNECTION_ROOM_FAILED = "CONNECTION_ROOM_FAILED";
    public static final String CONNECT_IM = "Connect_IM";
    public static final String CONNECT_ROOM = "Connect_ROOM";
    public static final String OFFLINE_ROOM = "OFFLINE_ROOM";
    public static final String SEND_EMOTION = "Send_Emotion";
    public static final String SEND_GIF = "Send_Gif";
    public static final String SEND_GIFT = "Send_Gift";
    public static final String SEND_TEXT = "Send_Text";
    public static final String SEND_VOICE = "Send_Voice";
    public static final String Track = "Track";
}

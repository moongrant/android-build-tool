package com.yalla.yalla.common.manager.cloud_file;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/yalla/yalla/common/manager/cloud_file/CloudFileType;", "", "code", "", "(Ljava/lang/String;II)V", "getCode", "()I", "Qiniu_Err", "USER_AVATAR", "USER_CHAT_VOICE", "ROOM_COVER", "ROOM_CHAT_IMG", "REPORT_USER_ROOM", "USER_BACKGROUND", "ROOM_CUSTOM_THEME", "ROOM_EVENT_AVATAR", "REPORT_ROOM_EVENT", "MOMENT_POST", "MOMENT_TOPIC_HEADER", "MOMENT_REPORT_TOPIC", "MOMENT_REPORT_POST", "MOMENT_REPORT_COMMENT", "MOMENT_EDIT", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public enum CloudFileType {
    Qiniu_Err(0),
    USER_AVATAR(1),
    USER_CHAT_VOICE(2),
    ROOM_COVER(3),
    ROOM_CHAT_IMG(4),
    REPORT_USER_ROOM(5),
    USER_BACKGROUND(7),
    ROOM_CUSTOM_THEME(8),
    ROOM_EVENT_AVATAR(9),
    REPORT_ROOM_EVENT(10),
    MOMENT_POST(0),
    MOMENT_TOPIC_HEADER(1),
    MOMENT_REPORT_TOPIC(2),
    MOMENT_REPORT_POST(3),
    MOMENT_REPORT_COMMENT(4),
    MOMENT_EDIT(5);

    private final int code;

    CloudFileType(int i) {
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }
}

package com.yalla.yalla.manager.cloud_file;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v8 com.yalla.yalla.manager.cloud_file.CloudFileType[], still in use, count: 1, list:
  (r8v8 com.yalla.yalla.manager.cloud_file.CloudFileType[]) from 0x00ed: INVOKE (r8v8 com.yalla.yalla.manager.cloud_file.CloudFileType[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:238)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/yalla/yalla/manager/cloud_file/CloudFileType;", "", "", "code", "I", "OooO00o", "()I", "Qiniu_Err", "USER_AVATAR", "USER_CHAT_VOICE", "ROOM_COVER", "ROOM_CHAT_IMG", "REPORT_USER_ROOM", "USER_BACKGROUND", "ROOM_CUSTOM_THEME", "ROOM_EVENT_AVATAR", "REPORT_ROOM_EVENT", "MOMENT_POST", "MOMENT_TOPIC_HEADER", "MOMENT_REPORT_TOPIC", "MOMENT_REPORT_POST", "MOMENT_REPORT_COMMENT", "MOMENT_EDIT", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class CloudFileType {
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

    private static final /* synthetic */ EnumEntries $ENTRIES;
    private final int code;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(cloudFileTypeArr);
    }

    public CloudFileType(int i) {
        super(str, i);
        this.code = i;
    }

    public static CloudFileType valueOf(String str) {
        return (CloudFileType) Enum.valueOf(CloudFileType.class, str);
    }

    public static CloudFileType[] values() {
        return (CloudFileType[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final int getCode() {
        return this.code;
    }
}

package com.yalla.yalla.model;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;
import p562o0oOo000.o000000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'postTopOfTopic' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/yalla/yalla/model/MoreTag;", "", ViewHierarchyConstants.TEXT_KEY, "", "(Ljava/lang/String;II)V", "getText", "()I", "dislike", "hide", "reply", "copy", "delete", "repost", "report", "deletePost", "postTopOfTopic", "postUnTopOfTopic", "postRemoveOutOfTopic", "DisableTheUser", "postTopOfUser", "postUnTopOfUser", "postEdit", "postEditHistory", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MoreTag {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MoreTag[] $VALUES;
    public static final MoreTag DisableTheUser;
    public static final MoreTag postEdit;
    public static final MoreTag postEditHistory;
    public static final MoreTag postRemoveOutOfTopic;
    public static final MoreTag postTopOfTopic;
    public static final MoreTag postTopOfUser;
    public static final MoreTag postUnTopOfTopic;
    public static final MoreTag postUnTopOfUser;
    private final int text;
    public static final MoreTag dislike = new MoreTag("dislike", 0, o000000.event_unSubscribe_confirm);
    public static final MoreTag hide = new MoreTag("hide", 1, o000000.Hide);
    public static final MoreTag reply = new MoreTag("reply", 2, o000000.reply);
    public static final MoreTag copy = new MoreTag("copy", 3, o000000.Copy);
    public static final MoreTag delete = new MoreTag("delete", 4, o000000.Delete);
    public static final MoreTag repost = new MoreTag("repost", 5, o000000.Repost);
    public static final MoreTag report = new MoreTag("report", 6, o000000.Report);
    public static final MoreTag deletePost = new MoreTag("deletePost", 7, o000000.Delete_Post);

    private static final /* synthetic */ MoreTag[] $values() {
        return new MoreTag[]{dislike, hide, reply, copy, delete, repost, report, deletePost, postTopOfTopic, postUnTopOfTopic, postRemoveOutOfTopic, DisableTheUser, postTopOfUser, postUnTopOfUser, postEdit, postEditHistory};
    }

    static {
        int i = o000000.user_top_pin_post;
        postTopOfTopic = new MoreTag("postTopOfTopic", 8, i);
        int i2 = o000000.user_top_unpin_post;
        postUnTopOfTopic = new MoreTag("postUnTopOfTopic", 9, i2);
        postRemoveOutOfTopic = new MoreTag("postRemoveOutOfTopic", 10, o000000.Remove_Post);
        DisableTheUser = new MoreTag("DisableTheUser", 11, o000000.Topic_No_Entry);
        postTopOfUser = new MoreTag("postTopOfUser", 12, i);
        postUnTopOfUser = new MoreTag("postUnTopOfUser", 13, i2);
        postEdit = new MoreTag("postEdit", 14, o000000.Moment_Edit_Page_Title);
        postEditHistory = new MoreTag("postEditHistory", 15, o000000.Moment_Edit_History_Select);
        MoreTag[] moreTagArr$values = $values();
        $VALUES = moreTagArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(moreTagArr$values);
    }

    private MoreTag(String str, int i, int i2) {
        super(str, i);
        this.text = i2;
    }

    @NotNull
    public static EnumEntries<MoreTag> getEntries() {
        return $ENTRIES;
    }

    public static MoreTag valueOf(String str) {
        return (MoreTag) Enum.valueOf(MoreTag.class, str);
    }

    public static MoreTag[] values() {
        return (MoreTag[]) $VALUES.clone();
    }

    public final int getText() {
        return this.text;
    }
}

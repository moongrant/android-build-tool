package com.yalla.yalla.ui.dialog;

import com.facebook.share.widget.ShareDialog;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import p562o0oOo000.o000000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'postTopOfTopic' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/yalla/yalla/ui/dialog/MenuDialogTag;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "nullData", "reply", "copy", "copyEvent", "delete", "repost", "report", "dislike", ShareDialog.WEB_SHARE_DIALOG, "deletePost", "postTopOfTopic", "postUnTopOfTopic", "postRemoveOutOfTopic", "DisableTheUser", "postTopOfUser", "postUnTopOfUser", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class MenuDialogTag {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MenuDialogTag[] $VALUES;
    public static final MenuDialogTag DisableTheUser;
    public static final MenuDialogTag copy;
    public static final MenuDialogTag copyEvent;
    public static final MenuDialogTag delete;
    public static final MenuDialogTag deletePost;
    public static final MenuDialogTag dislike;
    public static final MenuDialogTag nullData;
    public static final MenuDialogTag postRemoveOutOfTopic;
    public static final MenuDialogTag postTopOfTopic;
    public static final MenuDialogTag postTopOfUser;
    public static final MenuDialogTag postUnTopOfTopic;
    public static final MenuDialogTag postUnTopOfUser;
    public static final MenuDialogTag reply;
    public static final MenuDialogTag report;
    public static final MenuDialogTag repost;
    public static final MenuDialogTag share;
    private final int value;

    static {
        MenuDialogTag menuDialogTag = new MenuDialogTag("nullData", 0, 0);
        nullData = menuDialogTag;
        MenuDialogTag menuDialogTag2 = new MenuDialogTag("reply", 1, o000000.reply);
        reply = menuDialogTag2;
        MenuDialogTag menuDialogTag3 = new MenuDialogTag("copy", 2, o000000.Copy);
        copy = menuDialogTag3;
        MenuDialogTag menuDialogTag4 = new MenuDialogTag("copyEvent", 3, o000000.Copy_Evnet);
        copyEvent = menuDialogTag4;
        MenuDialogTag menuDialogTag5 = new MenuDialogTag("delete", 4, o000000.Delete);
        delete = menuDialogTag5;
        MenuDialogTag menuDialogTag6 = new MenuDialogTag("repost", 5, o000000.Repost);
        repost = menuDialogTag6;
        MenuDialogTag menuDialogTag7 = new MenuDialogTag("report", 6, o000000.Report);
        report = menuDialogTag7;
        MenuDialogTag menuDialogTag8 = new MenuDialogTag("dislike", 7, o000000.event_unSubscribe_confirm);
        dislike = menuDialogTag8;
        MenuDialogTag menuDialogTag9 = new MenuDialogTag(ShareDialog.WEB_SHARE_DIALOG, 8, o000000.share);
        share = menuDialogTag9;
        MenuDialogTag menuDialogTag10 = new MenuDialogTag("deletePost", 9, o000000.Delete_Post);
        deletePost = menuDialogTag10;
        int i = o000000.user_top_pin_post;
        MenuDialogTag menuDialogTag11 = new MenuDialogTag("postTopOfTopic", 10, i);
        postTopOfTopic = menuDialogTag11;
        int i2 = o000000.user_top_unpin_post;
        MenuDialogTag menuDialogTag12 = new MenuDialogTag("postUnTopOfTopic", 11, i2);
        postUnTopOfTopic = menuDialogTag12;
        MenuDialogTag menuDialogTag13 = new MenuDialogTag("postRemoveOutOfTopic", 12, o000000.Remove_Post);
        postRemoveOutOfTopic = menuDialogTag13;
        MenuDialogTag menuDialogTag14 = new MenuDialogTag("DisableTheUser", 13, o000000.Topic_No_Entry);
        DisableTheUser = menuDialogTag14;
        MenuDialogTag menuDialogTag15 = new MenuDialogTag("postTopOfUser", 14, i);
        postTopOfUser = menuDialogTag15;
        MenuDialogTag menuDialogTag16 = new MenuDialogTag("postUnTopOfUser", 15, i2);
        postUnTopOfUser = menuDialogTag16;
        MenuDialogTag[] menuDialogTagArr = {menuDialogTag, menuDialogTag2, menuDialogTag3, menuDialogTag4, menuDialogTag5, menuDialogTag6, menuDialogTag7, menuDialogTag8, menuDialogTag9, menuDialogTag10, menuDialogTag11, menuDialogTag12, menuDialogTag13, menuDialogTag14, menuDialogTag15, menuDialogTag16};
        $VALUES = menuDialogTagArr;
        $ENTRIES = EnumEntriesKt.enumEntries(menuDialogTagArr);
    }

    public MenuDialogTag(String str, int i, int i2) {
        super(str, i);
        this.value = i2;
    }

    public static MenuDialogTag valueOf(String str) {
        return (MenuDialogTag) Enum.valueOf(MenuDialogTag.class, str);
    }

    public static MenuDialogTag[] values() {
        return (MenuDialogTag[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}

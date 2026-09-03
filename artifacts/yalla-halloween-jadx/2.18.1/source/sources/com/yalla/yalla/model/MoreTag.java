package com.yalla.yalla.model;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.weieyu.yalla.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/model/MoreTag;", "", ViewHierarchyConstants.TEXT_KEY, "", "(Ljava/lang/String;II)V", "getText", "()I", "reply", "copy", "delete", "repost", "report", "deletePost", "postTopOfTopic", "postUnTopOfTopic", "postRemoveOutOfTopic", "DisableTheUser", "postTopOfUser", "postUnTopOfUser", "postEdit", "postEditHistory", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public enum MoreTag {
    reply(R.string.reply),
    copy(R.string.Copy),
    delete(R.string.Delete),
    repost(R.string.Repost),
    report(R.string.report),
    deletePost(R.string.Delete_Post),
    postTopOfTopic(R.string.user_top_pin_post),
    postUnTopOfTopic(R.string.user_top_unpin_post),
    postRemoveOutOfTopic(R.string.Remove_Post),
    DisableTheUser(R.string.Topic_No_Entry),
    postTopOfUser(R.string.user_top_pin_post),
    postUnTopOfUser(R.string.user_top_unpin_post),
    postEdit(R.string.Moment_Edit_Page_Title),
    postEditHistory(R.string.Moment_Edit_History_Select);

    private final int text;

    MoreTag(int i) {
        this.text = i;
    }

    public final int getText() {
        return this.text;
    }
}

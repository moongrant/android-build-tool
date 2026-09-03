package com.app.base.dialog.baseDialog;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.weieyu.yalla.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/app/base/dialog/baseDialog/MenuDialogTag;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "nullData", "reply", "copy", "copyEvent", "delete", "repost", "report", "share", "deletePost", "postTopOfTopic", "postUnTopOfTopic", "postRemoveOutOfTopic", "DisableTheUser", "postTopOfUser", "postUnTopOfUser", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public enum MenuDialogTag {
    nullData(0),
    reply(R.string.reply),
    copy(R.string.Copy),
    copyEvent(R.string.Copy_Evnet),
    delete(R.string.Delete),
    repost(R.string.Repost),
    report(R.string.report),
    share(R.string.share),
    deletePost(R.string.Delete_Post),
    postTopOfTopic(R.string.user_top_pin_post),
    postUnTopOfTopic(R.string.user_top_unpin_post),
    postRemoveOutOfTopic(R.string.Remove_Post),
    DisableTheUser(R.string.Topic_No_Entry),
    postTopOfUser(R.string.user_top_pin_post),
    postUnTopOfUser(R.string.user_top_unpin_post);

    private final int value;

    MenuDialogTag(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}

package com.yalla.yalla.model;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/yalla/yalla/model/MomentLogSourcePage;", "", "id", "", "(Ljava/lang/String;II)V", "getId", "()I", "moments_following_top", "moments_following", "moments_following_recommend", "moments_featured", "moments_topic_poluar", "moments_topic_latest", "room_moments", "moments_content", "comment_replies", "moments_notifications", "personal_moments", "others", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum MomentLogSourcePage {
    moments_following_top(1),
    moments_following(2),
    moments_following_recommend(3),
    moments_featured(4),
    moments_topic_poluar(5),
    moments_topic_latest(6),
    room_moments(7),
    moments_content(8),
    comment_replies(9),
    moments_notifications(10),
    personal_moments(11),
    others(0);

    private final int id;

    MomentLogSourcePage(int i) {
        this.id = i;
    }

    public final int getId() {
        return this.id;
    }
}

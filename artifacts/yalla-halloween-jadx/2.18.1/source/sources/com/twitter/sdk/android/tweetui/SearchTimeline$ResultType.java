package com.twitter.sdk.android.tweetui;

/* JADX INFO: loaded from: classes2.dex */
public enum SearchTimeline$ResultType {
    RECENT("recent"),
    POPULAR("popular"),
    MIXED("mixed"),
    FILTERED("filtered");

    public final String type;

    SearchTimeline$ResultType(String str) {
        this.type = str;
    }
}

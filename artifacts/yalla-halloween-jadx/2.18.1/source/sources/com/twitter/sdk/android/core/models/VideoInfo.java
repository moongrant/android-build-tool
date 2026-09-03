package com.twitter.sdk.android.core.models;

import com.android.billingclient.api.o0000;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class VideoInfo implements Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @SerializedName("aspect_ratio")
    public final List<Integer> f20055Oooo0o = o0000.OooO0OO(null);

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @SerializedName("duration_millis")
    public final long f20056Oooo0oO = 0;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @SerializedName("variants")
    public final List<Variant> f20057Oooo0oo = o0000.OooO0OO(null);

    public static class Variant implements Serializable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @SerializedName("bitrate")
        public final long f20058Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @SerializedName("content_type")
        public final String f20059Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @SerializedName("url")
        public final String f20060Oooo0oo;
    }

    private VideoInfo() {
    }
}

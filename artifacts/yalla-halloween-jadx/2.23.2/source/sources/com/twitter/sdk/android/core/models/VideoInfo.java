package com.twitter.sdk.android.core.models;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class VideoInfo implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SerializedName("aspect_ratio")
    public final List<Integer> f21724OooO0Oo = OooOOOO.OooO00o(null);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @SerializedName("duration_millis")
    public final long f21726OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @SerializedName("variants")
    public final List<Variant> f21725OooO0o = OooOOOO.OooO00o(null);

    public static class Variant implements Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @SerializedName("bitrate")
        public final long f21727OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @SerializedName("url")
        public final String f21728OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @SerializedName("content_type")
        public final String f21729OooO0o0;
    }

    private VideoInfo() {
    }
}

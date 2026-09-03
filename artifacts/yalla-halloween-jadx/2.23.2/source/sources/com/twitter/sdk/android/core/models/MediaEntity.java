package com.twitter.sdk.android.core.models;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class MediaEntity extends UrlEntity {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @SerializedName("id_str")
    public final String f21552OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @SerializedName("id")
    public final long f21553OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @SerializedName("media_url")
    public final String f21554OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @SerializedName("media_url_https")
    public final String f21555OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @SerializedName("sizes")
    public final Sizes f21556OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @SerializedName("source_status_id_str")
    public final String f21557OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @SerializedName("source_status_id")
    public final long f21558OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @SerializedName("type")
    public final String f21559OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @SerializedName("video_info")
    public final VideoInfo f21560OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @SerializedName("ext_alt_text")
    public final String f21561OooOOo0;

    public static class Size implements Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @SerializedName("w")
        public final int f21562OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @SerializedName("resize")
        public final String f21563OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @SerializedName("h")
        public final int f21564OooO0o0;
    }

    public static class Sizes implements Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @SerializedName("medium")
        public final Size f21565OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @SerializedName("small")
        public final Size f21566OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @SerializedName("thumb")
        public final Size f21567OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @SerializedName("large")
        public final Size f21568OooO0oO;
    }
}

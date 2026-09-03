package com.twitter.sdk.android.core.models;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class MediaEntity extends UrlEntity {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @SerializedName("media_url_https")
    public final String f19988OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @SerializedName("id_str")
    public final String f19989OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @SerializedName("id")
    public final long f19990OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @SerializedName("media_url")
    public final String f19991OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @SerializedName("sizes")
    public final Sizes f19992OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @SerializedName("source_status_id_str")
    public final String f19993OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @SerializedName("type")
    public final String f19994OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @SerializedName("video_info")
    public final VideoInfo f19995OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @SerializedName("ext_alt_text")
    public final String f19996OoooOoO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @SerializedName("source_status_id")
    public final long f19997o000oOoO;

    public static class Size implements Serializable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @SerializedName("w")
        public final int f19998Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @SerializedName("h")
        public final int f19999Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @SerializedName("resize")
        public final String f20000Oooo0oo;
    }

    public static class Sizes implements Serializable {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        @SerializedName("large")
        public final Size f20001Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @SerializedName("medium")
        public final Size f20002Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @SerializedName("thumb")
        public final Size f20003Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @SerializedName("small")
        public final Size f20004Oooo0oo;
    }
}

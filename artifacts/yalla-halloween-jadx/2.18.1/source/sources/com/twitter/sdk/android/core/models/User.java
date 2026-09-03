package com.twitter.sdk.android.core.models;

import com.facebook.internal.AnalyticsEvents;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import p436o0OoOOOO.o0O00OOO;
import p436o0OoOOOO.o0O00oO0;

/* JADX INFO: loaded from: classes2.dex */
public class User implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @SerializedName("default_profile_image")
    public final boolean f20013Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @SerializedName("contributors_enabled")
    public final boolean f20014Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @SerializedName("created_at")
    public final String f20015Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @SerializedName("default_profile")
    public final boolean f20016Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @SerializedName("favourites_count")
    public final int f20017OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @SerializedName("email")
    public final String f20018OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @SerializedName("description")
    public final String f20019OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @SerializedName("entities")
    public final o0O00oO0 f20020OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @SerializedName("follow_request_sent")
    public final boolean f20021OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @SerializedName("friends_count")
    public final int f20022OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @SerializedName("geo_enabled")
    public final boolean f20023OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @SerializedName("id")
    public final long f20024OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @SerializedName("id_str")
    public final String f20025OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @SerializedName("is_translator")
    public final boolean f20026OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @SerializedName("lang")
    public final String f20027Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @SerializedName("listed_count")
    public final int f20028Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @SerializedName("location")
    public final String f20029OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @SerializedName("name")
    public final String f20030OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @SerializedName("profile_background_color")
    public final String f20031OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @SerializedName("profile_background_image_url_https")
    public final String f20032Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @SerializedName("profile_background_image_url")
    public final String f20033Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @SerializedName("profile_background_tile")
    public final boolean f20034OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @SerializedName("profile_banner_url")
    public final String f20035Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @SerializedName("followers_count")
    public final int f20036o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    @SerializedName("profile_link_color")
    public final String f20037o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    @SerializedName("profile_sidebar_border_color")
    public final String f20038o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    @SerializedName("profile_sidebar_fill_color")
    public final String f20039o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    @SerializedName("profile_text_color")
    public final String f20040o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    @SerializedName("show_all_inline_media")
    public final boolean f20041o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    @SerializedName("screen_name")
    public final String f20042o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    @SerializedName("profile_use_background_image")
    public final boolean f20043o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    @SerializedName("withheld_scope")
    public final String f20044o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    @SerializedName("verified")
    public final boolean f20045o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    @SerializedName("url")
    public final String f20046o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    @SerializedName("utc_offset")
    public final int f20047o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    @SerializedName("profile_image_url")
    public final String f20048o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    @SerializedName(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS)
    public final o0O00OOO f20049o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    @SerializedName("statuses_count")
    public final int f20050o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    @SerializedName("time_zone")
    public final String f20051o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    @SerializedName("protected")
    public final boolean f20052oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    @SerializedName("withheld_in_countries")
    public final List<String> f20053oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    @SerializedName("profile_image_url_https")
    public final String f20054ooOO;
}

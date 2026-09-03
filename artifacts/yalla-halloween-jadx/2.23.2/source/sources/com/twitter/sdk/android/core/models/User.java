package com.twitter.sdk.android.core.models;

import com.facebook.internal.AnalyticsEvents;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class User implements Serializable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @SerializedName("email")
    public final String f21682OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SerializedName("contributors_enabled")
    public final boolean f21683OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @SerializedName("default_profile")
    public final boolean f21684OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @SerializedName("created_at")
    public final String f21685OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @SerializedName("default_profile_image")
    public final boolean f21686OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @SerializedName("description")
    public final String f21687OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @SerializedName("entities")
    public final o000oOoO f21688OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @SerializedName("favourites_count")
    public final int f21689OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @SerializedName("follow_request_sent")
    public final boolean f21690OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @SerializedName("friends_count")
    public final int f21691OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @SerializedName("followers_count")
    public final int f21692OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @SerializedName("geo_enabled")
    public final boolean f21693OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @SerializedName("id")
    public final long f21694OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @SerializedName("is_translator")
    public final boolean f21695OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @SerializedName("id_str")
    public final String f21696OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @SerializedName("lang")
    public final String f21697OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @SerializedName("profile_background_image_url")
    public final String f21698OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @SerializedName("location")
    public final String f21699OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @SerializedName("listed_count")
    public final int f21700OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @SerializedName("name")
    public final String f21701OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @SerializedName("profile_background_color")
    public final String f21702OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @SerializedName("profile_background_tile")
    public final boolean f21703OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @SerializedName("profile_background_image_url_https")
    public final String f21704OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @SerializedName("profile_banner_url")
    public final String f21705OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @SerializedName("profile_image_url_https")
    public final String f21706OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @SerializedName("profile_image_url")
    public final String f21707OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @SerializedName("profile_link_color")
    public final String f21708OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @SerializedName("profile_sidebar_border_color")
    public final String f21709OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @SerializedName("utc_offset")
    public final int f21710Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    @SerializedName("protected")
    public final boolean f21711Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @SerializedName("profile_sidebar_fill_color")
    public final String f21712Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @SerializedName("profile_text_color")
    public final String f21713Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @SerializedName("profile_use_background_image")
    public final boolean f21714Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    @SerializedName("screen_name")
    public final String f21715Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @SerializedName("show_all_inline_media")
    public final boolean f21716Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @SerializedName("statuses_count")
    public final int f21717Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    @SerializedName(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS)
    public final OooOo f21718Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @SerializedName("time_zone")
    public final String f21719Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @SerializedName("url")
    public final String f21720Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @SerializedName("withheld_in_countries")
    public final List<String> f21721OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @SerializedName("verified")
    public final boolean f21722OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @SerializedName("withheld_scope")
    public final String f21723OoooO0O;
}

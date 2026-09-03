package com.twitter.sdk.android.core.models;

import com.facebook.internal.AnalyticsEvents;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class User implements Serializable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @SerializedName("email")
    public final String f22153OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SerializedName("contributors_enabled")
    public final boolean f22154OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @SerializedName("default_profile")
    public final boolean f22155OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @SerializedName("created_at")
    public final String f22156OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @SerializedName("default_profile_image")
    public final boolean f22157OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @SerializedName("description")
    public final String f22158OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @SerializedName("entities")
    public final o000oOoO f22159OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @SerializedName("favourites_count")
    public final int f22160OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @SerializedName("follow_request_sent")
    public final boolean f22161OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @SerializedName("friends_count")
    public final int f22162OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @SerializedName("followers_count")
    public final int f22163OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @SerializedName("geo_enabled")
    public final boolean f22164OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @SerializedName("id")
    public final long f22165OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @SerializedName("is_translator")
    public final boolean f22166OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @SerializedName("id_str")
    public final String f22167OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @SerializedName("lang")
    public final String f22168OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @SerializedName("profile_background_image_url")
    public final String f22169OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @SerializedName("location")
    public final String f22170OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @SerializedName("listed_count")
    public final int f22171OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @SerializedName("name")
    public final String f22172OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @SerializedName("profile_background_color")
    public final String f22173OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @SerializedName("profile_background_tile")
    public final boolean f22174OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @SerializedName("profile_background_image_url_https")
    public final String f22175OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @SerializedName("profile_banner_url")
    public final String f22176OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @SerializedName("profile_image_url_https")
    public final String f22177OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @SerializedName("profile_image_url")
    public final String f22178OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @SerializedName("profile_link_color")
    public final String f22179OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @SerializedName("profile_sidebar_border_color")
    public final String f22180OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @SerializedName("utc_offset")
    public final int f22181Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    @SerializedName("protected")
    public final boolean f22182Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @SerializedName("profile_sidebar_fill_color")
    public final String f22183Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @SerializedName("profile_text_color")
    public final String f22184Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @SerializedName("profile_use_background_image")
    public final boolean f22185Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    @SerializedName("screen_name")
    public final String f22186Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @SerializedName("show_all_inline_media")
    public final boolean f22187Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @SerializedName("statuses_count")
    public final int f22188Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    @SerializedName(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS)
    public final OooOo f22189Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @SerializedName("time_zone")
    public final String f22190Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @SerializedName("url")
    public final String f22191Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @SerializedName("withheld_in_countries")
    public final List<String> f22192OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @SerializedName("verified")
    public final boolean f22193OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @SerializedName("withheld_scope")
    public final String f22194OoooO0O;
}

package com.twitter.sdk.android.core.models;

import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @SerializedName("id")
    public final long f22064OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @SerializedName("coordinates")
    public final OooO f22065OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @SerializedName("created_at")
    public final String f22066OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @SerializedName("current_user_retweet")
    public final Object f22067OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SerializedName("entities")
    public final Oooo0 f22068OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @SerializedName("favorite_count")
    public final Integer f22069OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @SerializedName("extended_entities")
    public final Oooo0 f22070OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @SerializedName("favorited")
    public final boolean f22071OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @SerializedName("filter_level")
    public final String f22072OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @SerializedName("id_str")
    public final String f22073OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @SerializedName("in_reply_to_screen_name")
    public final String f22074OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @SerializedName("in_reply_to_status_id")
    public final long f22075OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @SerializedName("in_reply_to_user_id")
    public final long f22076OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @SerializedName("in_reply_to_status_id_str")
    public final String f22077OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @SerializedName("in_reply_to_user_id_str")
    public final String f22078OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @SerializedName("lang")
    public final String f22079OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @SerializedName("possibly_sensitive")
    public final boolean f22080OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @SerializedName("place")
    public final OooOo00 f22081OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @SerializedName("scopes")
    public final Object f22082OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @SerializedName("retweeted")
    public final boolean f22083OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @SerializedName("quoted_status_id_str")
    public final String f22084OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @SerializedName("quoted_status_id")
    public final long f22085OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @SerializedName("quoted_status")
    public final OooOo f22086OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @SerializedName("retweet_count")
    public final int f22087OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @SerializedName("source")
    public final String f22088OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @SerializedName("retweeted_status")
    public final OooOo f22089OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @SerializedName(alternate = {"full_text"}, value = ViewHierarchyConstants.TEXT_KEY)
    public final String f22090OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @SerializedName("truncated")
    public final boolean f22091OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @SerializedName("display_text_range")
    public final List<Integer> f22092OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @SerializedName("user")
    public final User f22093OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @SerializedName("withheld_copyright")
    public final boolean f22094OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @SerializedName("withheld_in_countries")
    public final List<String> f22095Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @SerializedName("withheld_scope")
    public final String f22096Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @SerializedName("card")
    public final OooO0o f22097Oooo00o;

    /* JADX WARN: Illegal instructions before constructor call */
    public OooOo() {
        Oooo0 oooo0 = Oooo0.f22109OooO0o;
        this(null, null, null, oooo0, oooo0, 0, false, null, 0L, AppEventsConstants.EVENT_PARAM_VALUE_NO, null, 0L, AppEventsConstants.EVENT_PARAM_VALUE_NO, 0L, AppEventsConstants.EVENT_PARAM_VALUE_NO, null, null, false, null, 0L, AppEventsConstants.EVENT_PARAM_VALUE_NO, null, 0, false, null, null, null, null, false, null, false, null, null, null);
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof OooOo) && this.f22064OooO == ((OooOo) obj).f22064OooO;
    }

    public final int hashCode() {
        return (int) this.f22064OooO;
    }

    public OooOo(OooO oooO, String str, Object obj, Oooo0 oooo0, Oooo0 oooo1, Integer num, boolean z, String str2, long j, String str3, String str4, long j2, String str5, long j3, String str6, String str7, OooOo00 oooOo00, boolean z2, Object obj2, long j4, String str8, OooOo oooOo, int i, boolean z3, OooOo oooOo2, String str9, String str10, List<Integer> list, boolean z4, User user, boolean z5, List<String> list2, String str11, OooO0o oooO0o) {
        this.f22065OooO00o = oooO;
        this.f22066OooO0O0 = str;
        this.f22067OooO0OO = obj;
        this.f22068OooO0Oo = oooo0 == null ? Oooo0.f22109OooO0o : oooo0;
        this.f22070OooO0o0 = oooo1 == null ? Oooo0.f22109OooO0o : oooo1;
        this.f22069OooO0o = num;
        this.f22071OooO0oO = z;
        this.f22072OooO0oo = str2;
        this.f22064OooO = j;
        this.f22073OooOO0 = str3;
        this.f22074OooOO0O = str4;
        this.f22075OooOO0o = j2;
        this.f22077OooOOO0 = str5;
        this.f22076OooOOO = j3;
        this.f22078OooOOOO = str6;
        this.f22079OooOOOo = str7;
        this.f22081OooOOo0 = oooOo00;
        this.f22080OooOOo = z2;
        this.f22082OooOOoo = obj2;
        this.f22085OooOo00 = j4;
        this.f22084OooOo0 = str8;
        this.f22086OooOo0O = oooOo;
        this.f22087OooOo0o = i;
        this.f22083OooOo = z3;
        this.f22089OooOoO0 = oooOo2;
        this.f22088OooOoO = str9;
        this.f22090OooOoOO = str10;
        this.f22092OooOoo0 = OooOOOO.OooO00o(list);
        this.f22091OooOoo = z4;
        this.f22093OooOooO = user;
        this.f22094OooOooo = z5;
        this.f22095Oooo000 = OooOOOO.OooO00o(list2);
        this.f22096Oooo00O = str11;
        this.f22097Oooo00o = oooO0o;
    }
}

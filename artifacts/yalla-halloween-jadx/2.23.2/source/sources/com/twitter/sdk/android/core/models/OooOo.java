package com.twitter.sdk.android.core.models;

import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @SerializedName("id")
    public final long f21593OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @SerializedName("coordinates")
    public final OooO f21594OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @SerializedName("created_at")
    public final String f21595OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @SerializedName("current_user_retweet")
    public final Object f21596OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SerializedName("entities")
    public final Oooo0 f21597OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @SerializedName("favorite_count")
    public final Integer f21598OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @SerializedName("extended_entities")
    public final Oooo0 f21599OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @SerializedName("favorited")
    public final boolean f21600OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @SerializedName("filter_level")
    public final String f21601OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @SerializedName("id_str")
    public final String f21602OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @SerializedName("in_reply_to_screen_name")
    public final String f21603OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @SerializedName("in_reply_to_status_id")
    public final long f21604OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @SerializedName("in_reply_to_user_id")
    public final long f21605OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @SerializedName("in_reply_to_status_id_str")
    public final String f21606OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @SerializedName("in_reply_to_user_id_str")
    public final String f21607OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @SerializedName("lang")
    public final String f21608OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @SerializedName("possibly_sensitive")
    public final boolean f21609OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @SerializedName("place")
    public final OooOo00 f21610OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @SerializedName("scopes")
    public final Object f21611OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @SerializedName("retweeted")
    public final boolean f21612OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @SerializedName("quoted_status_id_str")
    public final String f21613OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @SerializedName("quoted_status_id")
    public final long f21614OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @SerializedName("quoted_status")
    public final OooOo f21615OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @SerializedName("retweet_count")
    public final int f21616OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @SerializedName("source")
    public final String f21617OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @SerializedName("retweeted_status")
    public final OooOo f21618OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @SerializedName(alternate = {"full_text"}, value = ViewHierarchyConstants.TEXT_KEY)
    public final String f21619OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @SerializedName("truncated")
    public final boolean f21620OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @SerializedName("display_text_range")
    public final List<Integer> f21621OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @SerializedName("user")
    public final User f21622OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @SerializedName("withheld_copyright")
    public final boolean f21623OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @SerializedName("withheld_in_countries")
    public final List<String> f21624Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @SerializedName("withheld_scope")
    public final String f21625Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @SerializedName("card")
    public final OooO0o f21626Oooo00o;

    /* JADX WARN: Illegal instructions before constructor call */
    public OooOo() {
        Oooo0 oooo0 = Oooo0.f21638OooO0o;
        this(null, null, null, oooo0, oooo0, 0, false, null, 0L, AppEventsConstants.EVENT_PARAM_VALUE_NO, null, 0L, AppEventsConstants.EVENT_PARAM_VALUE_NO, 0L, AppEventsConstants.EVENT_PARAM_VALUE_NO, null, null, false, null, 0L, AppEventsConstants.EVENT_PARAM_VALUE_NO, null, 0, false, null, null, null, null, false, null, false, null, null, null);
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof OooOo) && this.f21593OooO == ((OooOo) obj).f21593OooO;
    }

    public final int hashCode() {
        return (int) this.f21593OooO;
    }

    public OooOo(OooO oooO, String str, Object obj, Oooo0 oooo0, Oooo0 oooo1, Integer num, boolean z, String str2, long j, String str3, String str4, long j2, String str5, long j3, String str6, String str7, OooOo00 oooOo00, boolean z2, Object obj2, long j4, String str8, OooOo oooOo, int i, boolean z3, OooOo oooOo2, String str9, String str10, List<Integer> list, boolean z4, User user, boolean z5, List<String> list2, String str11, OooO0o oooO0o) {
        this.f21594OooO00o = oooO;
        this.f21595OooO0O0 = str;
        this.f21596OooO0OO = obj;
        this.f21597OooO0Oo = oooo0 == null ? Oooo0.f21638OooO0o : oooo0;
        this.f21599OooO0o0 = oooo1 == null ? Oooo0.f21638OooO0o : oooo1;
        this.f21598OooO0o = num;
        this.f21600OooO0oO = z;
        this.f21601OooO0oo = str2;
        this.f21593OooO = j;
        this.f21602OooOO0 = str3;
        this.f21603OooOO0O = str4;
        this.f21604OooOO0o = j2;
        this.f21606OooOOO0 = str5;
        this.f21605OooOOO = j3;
        this.f21607OooOOOO = str6;
        this.f21608OooOOOo = str7;
        this.f21610OooOOo0 = oooOo00;
        this.f21609OooOOo = z2;
        this.f21611OooOOoo = obj2;
        this.f21614OooOo00 = j4;
        this.f21613OooOo0 = str8;
        this.f21615OooOo0O = oooOo;
        this.f21616OooOo0o = i;
        this.f21612OooOo = z3;
        this.f21618OooOoO0 = oooOo2;
        this.f21617OooOoO = str9;
        this.f21619OooOoOO = str10;
        this.f21621OooOoo0 = OooOOOO.OooO00o(list);
        this.f21620OooOoo = z4;
        this.f21622OooOooO = user;
        this.f21623OooOooo = z5;
        this.f21624Oooo000 = OooOOOO.OooO00o(list2);
        this.f21625Oooo00O = str11;
        this.f21626Oooo00o = oooO0o;
    }
}

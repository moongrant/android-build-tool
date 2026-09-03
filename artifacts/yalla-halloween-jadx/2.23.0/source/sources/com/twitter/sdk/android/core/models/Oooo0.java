package com.twitter.sdk.android.core.models;

import com.facebook.share.internal.ShareConstants;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Oooo0 f22109OooO0o = new Oooo0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @SerializedName("urls")
    public final List<UrlEntity> f22110OooO00o = OooOOOO.OooO00o(null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @SerializedName("user_mentions")
    public final List<MentionEntity> f22111OooO0O0 = OooOOOO.OooO00o(null);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @SerializedName(ShareConstants.WEB_DIALOG_PARAM_MEDIA)
    public final List<MediaEntity> f22112OooO0OO = OooOOOO.OooO00o(null);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SerializedName("hashtags")
    public final List<HashtagEntity> f22113OooO0Oo = OooOOOO.OooO00o(null);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @SerializedName("symbols")
    public final List<SymbolEntity> f22114OooO0o0 = OooOOOO.OooO00o(null);
}

package p436o0OoOOOO;

import com.android.billingclient.api.o0000;
import com.facebook.share.internal.ShareConstants;
import com.google.gson.annotations.SerializedName;
import com.twitter.sdk.android.core.models.HashtagEntity;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.core.models.MentionEntity;
import com.twitter.sdk.android.core.models.SymbolEntity;
import com.twitter.sdk.android.core.models.UrlEntity;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00o00 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final o0O00o00 f40036OooO0o = new o0O00o00(null, null, null, null, null);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @SerializedName("urls")
    public final List<UrlEntity> f40037OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @SerializedName("user_mentions")
    public final List<MentionEntity> f40038OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @SerializedName(ShareConstants.WEB_DIALOG_PARAM_MEDIA)
    public final List<MediaEntity> f40039OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SerializedName("hashtags")
    public final List<HashtagEntity> f40040OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @SerializedName("symbols")
    public final List<SymbolEntity> f40041OooO0o0;

    public o0O00o00() {
        this(null, null, null, null, null);
    }

    public o0O00o00(List<UrlEntity> list, List<MentionEntity> list2, List<MediaEntity> list3, List<HashtagEntity> list4, List<SymbolEntity> list5) {
        this.f40037OooO00o = o0000.OooO0OO(null);
        this.f40038OooO0O0 = o0000.OooO0OO(null);
        this.f40039OooO0OO = o0000.OooO0OO(null);
        this.f40040OooO0Oo = o0000.OooO0OO(null);
        this.f40041OooO0o0 = o0000.OooO0OO(null);
    }
}

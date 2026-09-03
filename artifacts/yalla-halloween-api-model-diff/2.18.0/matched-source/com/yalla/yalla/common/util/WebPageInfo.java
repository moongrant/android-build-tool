package com.yalla.yalla.common.util;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yalla.yalla.common.model.WebFrom;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o0000O0O.OooOOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p509o0o00oOO.o0000O0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/common/util/WebPageInfo;", "Ljava/io/Serializable;", "OooO00o", "ShareType", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class WebPageInfo implements Serializable {

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f21232OooooO0 = new OooO00o();

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public static final WebPageInfo f21233OooooOO = new WebPageInfo(WebFrom.Unknow);

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final WebFrom f21234Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f21235OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f21236OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public String f21237OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public String f21238OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f21239OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NotNull
    public ShareType f21240OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NotNull
    public String f21241OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NotNull
    public String f21242OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f21243OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public long f21244OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @Nullable
    public OooOOO0 f21245Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @Nullable
    public Long f21246Ooooo0o;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public Map<String, String> f21247o000oOoO;

    public static final class OooO00o {
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WebFrom.values().length];
            iArr[WebFrom.RoomActivity.ordinal()] = 1;
            iArr[WebFrom.ActivityNotice.ordinal()] = 2;
            iArr[WebFrom.RoomMainBanner.ordinal()] = 3;
            iArr[WebFrom.PrivateChatShare.ordinal()] = 4;
            iArr[WebFrom.MomentActivityBanner.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/common/util/WebPageInfo$ShareType;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "Companion", "NoShare", "ShareWithID", "Share", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
    public enum ShareType {
        NoShare(0),
        ShareWithID(1),
        Share(2);


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        private final int value;

        /* JADX INFO: renamed from: com.yalla.yalla.common.util.WebPageInfo$ShareType$OooO00o, reason: from kotlin metadata */
        public static final class Companion {
            /* JADX WARN: Code duplicated, block: B:13:0x001d  */
            /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
            @NotNull
            public final ShareType OooO00o(int i) {
                for (ShareType shareType : ShareType.values()) {
                    if (shareType.getValue() == i) {
                        if (shareType == null) {
                            return ShareType.NoShare;
                        }
                        return shareType;
                    }
                }
                shareType = null;
                if (shareType == null) {
                    return ShareType.NoShare;
                }
                return shareType;
            }
        }

        ShareType(int i) {
            this.value = i;
        }

        /* JADX INFO: renamed from: OooO00o, reason: from getter */
        public final int getValue() {
            return this.value;
        }
    }

    public WebPageInfo(@NotNull WebFrom from) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.f21234Oooo = from;
        this.f21237OoooO00 = "";
        this.f21238OoooO0O = "";
        this.f21235OoooO = true;
        this.f21247o000oOoO = new LinkedHashMap();
        this.f21240OoooOOO = ShareType.NoShare;
        this.f21241OoooOOo = "";
        this.f21242OoooOo0 = "";
        o0000O0 o0000o1 = o0000O0.f41710OooO00o;
        this.f21244OoooOoo = o0000O0.f41712OooO0OO;
    }

    @NotNull
    public final WebPageInfo OooO00o(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f21247o000oOoO.put(key, value);
        return this;
    }

    @NotNull
    public final WebPageInfo OooO0O0(@NotNull ShareType type, @NotNull String imgUrl, @NotNull String content) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(imgUrl, "imgUrl");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f21240OoooOOO = type;
        this.f21241OoooOOo = imgUrl;
        this.f21242OoooOo0 = content;
        return this;
    }

    @NotNull
    public final WebPageInfo OooO0OO(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f21238OoooO0O = title;
        return this;
    }

    @NotNull
    public final WebPageInfo OooO0Oo(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f21237OoooO00 = url;
        return this;
    }
}

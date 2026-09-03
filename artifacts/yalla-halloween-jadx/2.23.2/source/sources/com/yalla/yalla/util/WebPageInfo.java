package com.yalla.yalla.util;

import OooO0OO.OooO0O0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.MutableLiveData;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yalla.yalla.model.WebFrom;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p386o0OOooO.oo0o0Oo;
import p423o0OoO0OO.o000O000;
import p475o0Ooooo0.o0O00oO0;
import p476o0OooooO.o0OOo000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yalla/yalla/util/WebPageInfo;", "Ljava/io/Serializable;", "ShareType", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class WebPageInfo implements Serializable {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public static final WebPageInfo f32279OooOOo = new WebPageInfo(WebFrom.Unknow);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f32280OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final WebFrom f32281OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f32282OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public String f32283OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public String f32284OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f32285OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f32286OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public ShareType f32287OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public String f32288OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f32289OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public String f32290OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f32291OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public Dp f32292OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public Long f32293OooOOo0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WebFrom.values().length];
            try {
                iArr[WebFrom.RoomActivity.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WebFrom.ActivityNotice.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WebFrom.RoomMainBanner.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WebFrom.PrivateChatShare.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WebFrom.MomentActivityBanner.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 com.yalla.yalla.util.WebPageInfo$ShareType[], still in use, count: 1, list:
      (r5v2 com.yalla.yalla.util.WebPageInfo$ShareType[]) from 0x0029: INVOKE (r5v2 com.yalla.yalla.util.WebPageInfo$ShareType[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:42)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/util/WebPageInfo$ShareType;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "Companion", "NoShare", "ShareWithID", "Share", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
    public static final class ShareType {
        NoShare(0),
        ShareWithID(1),
        Share(2);

        private static final /* synthetic */ EnumEntries $ENTRIES;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        private final int value;

        /* JADX INFO: renamed from: com.yalla.yalla.util.WebPageInfo$ShareType$OooO00o, reason: from kotlin metadata */
        @SourceDebugExtension({"SMAP\nWebPageInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebPageInfo.kt\ncom/yalla/yalla/util/WebPageInfo$ShareType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n1#2:168\n*E\n"})
        public static final class Companion {
            /* JADX WARN: Code duplicated, block: B:13:0x001d  */
            /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
            @NotNull
            public static ShareType OooO00o(int i) {
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

        static {
            $ENTRIES = EnumEntriesKt.enumEntries(new ShareType[]{r0, r1, r3});
        }

        public ShareType(int i) {
            super(str, i);
            this.value = i;
        }

        public static ShareType valueOf(String str) {
            return (ShareType) Enum.valueOf(ShareType.class, str);
        }

        public static ShareType[] values() {
            return (ShareType[]) $VALUES.clone();
        }

        /* JADX INFO: renamed from: OooO00o, reason: from getter */
        public final int getValue() {
            return this.value;
        }
    }

    public WebPageInfo(@NotNull WebFrom from) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.f32281OooO0Oo = from;
        this.f32283OooO0o0 = "";
        this.f32284OooO0oO = "";
        this.f32285OooO0oo = true;
        this.f32286OooOO0 = new LinkedHashMap();
        this.f32287OooOO0O = ShareType.NoShare;
        this.f32288OooOO0o = "";
        this.f32290OooOOO0 = "";
        this.f32291OooOOOO = o0OOo000.f48135OooO0O0;
    }

    @NotNull
    public final void OooO00o(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f32286OooOO0.put(key, value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String OooO0O0(boolean z) {
        StringBuffer stringBuffer = new StringBuffer(this.f32283OooO0o0);
        if (StringsKt__StringsKt.contains$default(stringBuffer, "?", false, 2, (Object) null)) {
            stringBuffer.append("&t=" + System.currentTimeMillis());
        } else {
            stringBuffer.append("?t=" + System.currentTimeMillis());
        }
        stringBuffer.append("&p=2");
        stringBuffer.append("&v=" + oo0o0Oo.OooO0OO());
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        stringBuffer.append("&region=" + o0O00oO0.OooOOO0().getValue());
        stringBuffer.append("&halfScreen=" + (!z ? 1 : 0));
        stringBuffer.append("&statusHeight=" + o000O000.OooO00o());
        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            stringBuffer.append("&userid=" + o0O00oO0.OooOOo0().getValue());
            int i = OooO00o.$EnumSwitchMapping$0[this.f32281OooO0Oo.ordinal()];
            stringBuffer.append("&token=" + ((i == 1 || i == 2 || i == 3 || i == 4 || i == 5) ? (String) ((MutableLiveData) o0O00oO0.f47962OooOoo.getValue()).getValue() : (String) o0O00oO0.OooOOOO().getValue()));
        }
        LinkedHashMap linkedHashMap = this.f32286OooOO0;
        if (true ^ linkedHashMap.isEmpty()) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                stringBuffer.append("&" + ((String) entry.getKey()) + "=" + ((String) entry.getValue()));
            }
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final void OooO0OO(@NotNull ShareType type, @NotNull String imgUrl, @NotNull String content) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(imgUrl, "imgUrl");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f32287OooOO0O = type;
        this.f32288OooOO0o = imgUrl;
        this.f32290OooOOO0 = content;
    }

    @NotNull
    public final void OooO0Oo(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f32284OooO0oO = title;
    }

    @NotNull
    public final void OooO0o0(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f32283OooO0o0 = url;
    }

    @NotNull
    public final String toString() {
        String str = this.f32283OooO0o0;
        boolean z = this.f32282OooO0o;
        String str2 = this.f32284OooO0oO;
        boolean z2 = this.f32285OooO0oo;
        boolean z3 = this.f32280OooO;
        LinkedHashMap linkedHashMap = this.f32286OooOO0;
        ShareType shareType = this.f32287OooOO0O;
        String str3 = this.f32288OooOO0o;
        String str4 = this.f32290OooOOO0;
        boolean z4 = this.f32289OooOOO;
        String strM1689toStringimpl = Color.m1689toStringimpl(this.f32291OooOOOO);
        Dp dp = this.f32292OooOOOo;
        Long l = this.f32293OooOOo0;
        StringBuilder sb = new StringBuilder("WebPageInfo(from=");
        sb.append(this.f32281OooO0Oo);
        sb.append(", url='");
        sb.append(str);
        sb.append("', isFullScreen=");
        sb.append(z);
        sb.append(", title='");
        sb.append(str2);
        sb.append("', showTitle=");
        sb.append(z2);
        sb.append(", showClose=");
        sb.append(z3);
        sb.append(", params=");
        sb.append(linkedHashMap);
        sb.append(", shareType=");
        sb.append(shareType);
        sb.append(", shareImg='");
        OooO0O0.OooO00o(sb, str3, "', shareContent='", str4, "', showOpenInBrowser=");
        sb.append(z4);
        sb.append(", background=");
        sb.append(strM1689toStringimpl);
        sb.append(", containerHeight=");
        sb.append(dp);
        sb.append(", activityId=");
        sb.append(l);
        sb.append(")");
        return sb.toString();
    }
}

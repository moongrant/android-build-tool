package com.yalla.yalla.common.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'FAQ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#¨\u0006$"}, d2 = {"Lcom/yalla/yalla/common/model/WebFrom;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "isShowOpenInBrowser", "", "(Ljava/lang/String;IIZ)V", "()Z", "getValue", "()I", "LoginInstagram", "RoomActivity", "ActivityNotice", "RoomMainBanner", "FAQ", "StoreCoin", "TermsOfService", "UserLevel", "LoginPageFeedback", "VerificationCodeFeedback", "CrystalExchangeRecord", "VIPNobleIntroductionPage", "MomentActivityBanner", "Mintroute_Recharge", "PrivateChatShare", "Ad", "RoomBonus", "YallaTeamLink", "KaVipDetails", "FirstChargeRewardUrlWallet", "FirstChargeRewardUrlMain", "FirstChargeRewardUrlGiftDialog", "YallaChatDownUrl", "StoreBubbleObtain", "FaqRule", "Unknow", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class WebFrom {
    public static final WebFrom Ad;
    public static final WebFrom CrystalExchangeRecord;
    public static final WebFrom FAQ;
    public static final WebFrom FaqRule;
    public static final WebFrom FirstChargeRewardUrlGiftDialog;
    public static final WebFrom FirstChargeRewardUrlMain;
    public static final WebFrom FirstChargeRewardUrlWallet;
    public static final WebFrom KaVipDetails;
    public static final WebFrom LoginPageFeedback;
    public static final WebFrom Mintroute_Recharge;
    public static final WebFrom PrivateChatShare;
    public static final WebFrom RoomBonus;
    public static final WebFrom StoreBubbleObtain;
    public static final WebFrom StoreCoin;
    public static final WebFrom TermsOfService;
    public static final WebFrom Unknow;
    public static final WebFrom UserLevel;
    public static final WebFrom VerificationCodeFeedback;
    public static final WebFrom YallaChatDownUrl;
    public static final WebFrom YallaTeamLink;
    private final boolean isShowOpenInBrowser;
    private final int value;
    public static final WebFrom LoginInstagram = new WebFrom("LoginInstagram", 0, 0, false, 2, null);
    public static final WebFrom RoomActivity = new WebFrom("RoomActivity", 1, 1, true);
    public static final WebFrom ActivityNotice = new WebFrom("ActivityNotice", 2, 2, true);
    public static final WebFrom RoomMainBanner = new WebFrom("RoomMainBanner", 3, 3, false, 2, null);
    public static final WebFrom VIPNobleIntroductionPage = new WebFrom("VIPNobleIntroductionPage", 11, 11, true);
    public static final WebFrom MomentActivityBanner = new WebFrom("MomentActivityBanner", 12, 12, false, 2, null);
    private static final /* synthetic */ WebFrom[] $VALUES = $values();

    private static final /* synthetic */ WebFrom[] $values() {
        return new WebFrom[]{LoginInstagram, RoomActivity, ActivityNotice, RoomMainBanner, FAQ, StoreCoin, TermsOfService, UserLevel, LoginPageFeedback, VerificationCodeFeedback, CrystalExchangeRecord, VIPNobleIntroductionPage, MomentActivityBanner, Mintroute_Recharge, PrivateChatShare, Ad, RoomBonus, YallaTeamLink, KaVipDetails, FirstChargeRewardUrlWallet, FirstChargeRewardUrlMain, FirstChargeRewardUrlGiftDialog, YallaChatDownUrl, StoreBubbleObtain, FaqRule, Unknow};
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        FAQ = new WebFrom("FAQ", 4, 4, false, 2, defaultConstructorMarker);
        boolean z = false;
        int i = 2;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        StoreCoin = new WebFrom("StoreCoin", 5, 5, z, i, defaultConstructorMarker2);
        boolean z2 = false;
        int i2 = 2;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        TermsOfService = new WebFrom("TermsOfService", 6, 6, z2, i2, defaultConstructorMarker3);
        UserLevel = new WebFrom("UserLevel", 7, 7, z, i, defaultConstructorMarker2);
        LoginPageFeedback = new WebFrom("LoginPageFeedback", 8, 8, z2, i2, defaultConstructorMarker3);
        VerificationCodeFeedback = new WebFrom("VerificationCodeFeedback", 9, 9, z, i, defaultConstructorMarker2);
        CrystalExchangeRecord = new WebFrom("CrystalExchangeRecord", 10, 10, z2, i2, defaultConstructorMarker3);
        Mintroute_Recharge = new WebFrom("Mintroute_Recharge", 13, 13, false, 2, defaultConstructorMarker);
        boolean z3 = false;
        int i3 = 2;
        DefaultConstructorMarker defaultConstructorMarker4 = null;
        PrivateChatShare = new WebFrom("PrivateChatShare", 14, 14, z3, i3, defaultConstructorMarker4);
        boolean z4 = false;
        int i4 = 2;
        DefaultConstructorMarker defaultConstructorMarker5 = null;
        Ad = new WebFrom("Ad", 15, 15, z4, i4, defaultConstructorMarker5);
        RoomBonus = new WebFrom("RoomBonus", 16, 16, z3, i3, defaultConstructorMarker4);
        YallaTeamLink = new WebFrom("YallaTeamLink", 17, 17, z4, i4, defaultConstructorMarker5);
        KaVipDetails = new WebFrom("KaVipDetails", 18, 18, z3, i3, defaultConstructorMarker4);
        FirstChargeRewardUrlWallet = new WebFrom("FirstChargeRewardUrlWallet", 19, 19, z4, i4, defaultConstructorMarker5);
        FirstChargeRewardUrlMain = new WebFrom("FirstChargeRewardUrlMain", 20, 20, z3, i3, defaultConstructorMarker4);
        FirstChargeRewardUrlGiftDialog = new WebFrom("FirstChargeRewardUrlGiftDialog", 21, 21, z4, i4, defaultConstructorMarker5);
        YallaChatDownUrl = new WebFrom("YallaChatDownUrl", 22, 22, z3, i3, defaultConstructorMarker4);
        StoreBubbleObtain = new WebFrom("StoreBubbleObtain", 23, 23, z4, i4, defaultConstructorMarker5);
        FaqRule = new WebFrom("FaqRule", 24, 24, z3, i3, defaultConstructorMarker4);
        Unknow = new WebFrom("Unknow", 25, 100, z4, i4, defaultConstructorMarker5);
    }

    private WebFrom(String str, int i, int i2, boolean z) {
        super(str, i);
        this.value = i2;
        this.isShowOpenInBrowser = z;
    }

    public static WebFrom valueOf(String str) {
        return (WebFrom) Enum.valueOf(WebFrom.class, str);
    }

    public static WebFrom[] values() {
        return (WebFrom[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: isShowOpenInBrowser, reason: from getter */
    public final boolean getIsShowOpenInBrowser() {
        return this.isShowOpenInBrowser;
    }

    public /* synthetic */ WebFrom(String str, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i3 & 2) != 0 ? false : z);
    }
}

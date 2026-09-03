package com.yalla.yalla.model.gift;

import OooO0OO.OooO0O0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO0.o0OoOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b6\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0010J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0097\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u00109\u001a\u00020\u00032\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010)\"\u0004\b*\u0010+¨\u0006>"}, d2 = {"Lcom/yalla/yalla/model/gift/ThemeConfig;", "", "isNew", "", "beforePic", "", "beforeBgColor", "beforeText", "beforeTextColor", "beforeBtnColor", "beforeBtnTextColor", "beforeTips1", "beforeTips2", "afterBgColor", "afterIconColor", "afterTextColor", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAfterBgColor", "()Ljava/lang/String;", "setAfterBgColor", "(Ljava/lang/String;)V", "getAfterIconColor", "setAfterIconColor", "getAfterTextColor", "setAfterTextColor", "getBeforeBgColor", "setBeforeBgColor", "getBeforeBtnColor", "setBeforeBtnColor", "getBeforeBtnTextColor", "setBeforeBtnTextColor", "getBeforePic", "setBeforePic", "getBeforeText", "setBeforeText", "getBeforeTextColor", "setBeforeTextColor", "getBeforeTips1", "setBeforeTips1", "getBeforeTips2", "setBeforeTips2", "()Z", "setNew", "(Z)V", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ThemeConfig {
    public static final int $stable = 8;

    @Nullable
    private String afterBgColor;

    @Nullable
    private String afterIconColor;

    @Nullable
    private String afterTextColor;

    @Nullable
    private String beforeBgColor;

    @Nullable
    private String beforeBtnColor;

    @Nullable
    private String beforeBtnTextColor;

    @Nullable
    private String beforePic;

    @Nullable
    private String beforeText;

    @Nullable
    private String beforeTextColor;

    @Nullable
    private String beforeTips1;

    @Nullable
    private String beforeTips2;
    private boolean isNew;

    public ThemeConfig(boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11) {
        this.isNew = z;
        this.beforePic = str;
        this.beforeBgColor = str2;
        this.beforeText = str3;
        this.beforeTextColor = str4;
        this.beforeBtnColor = str5;
        this.beforeBtnTextColor = str6;
        this.beforeTips1 = str7;
        this.beforeTips2 = str8;
        this.afterBgColor = str9;
        this.afterIconColor = str10;
        this.afterTextColor = str11;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsNew() {
        return this.isNew;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAfterBgColor() {
        return this.afterBgColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getAfterIconColor() {
        return this.afterIconColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getAfterTextColor() {
        return this.afterTextColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBeforePic() {
        return this.beforePic;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBeforeBgColor() {
        return this.beforeBgColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBeforeText() {
        return this.beforeText;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBeforeTextColor() {
        return this.beforeTextColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBeforeBtnColor() {
        return this.beforeBtnColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBeforeBtnTextColor() {
        return this.beforeBtnTextColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBeforeTips1() {
        return this.beforeTips1;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBeforeTips2() {
        return this.beforeTips2;
    }

    @NotNull
    public final ThemeConfig copy(boolean isNew, @Nullable String beforePic, @Nullable String beforeBgColor, @Nullable String beforeText, @Nullable String beforeTextColor, @Nullable String beforeBtnColor, @Nullable String beforeBtnTextColor, @Nullable String beforeTips1, @Nullable String beforeTips2, @Nullable String afterBgColor, @Nullable String afterIconColor, @Nullable String afterTextColor) {
        return new ThemeConfig(isNew, beforePic, beforeBgColor, beforeText, beforeTextColor, beforeBtnColor, beforeBtnTextColor, beforeTips1, beforeTips2, afterBgColor, afterIconColor, afterTextColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThemeConfig)) {
            return false;
        }
        ThemeConfig themeConfig = (ThemeConfig) other;
        return this.isNew == themeConfig.isNew && Intrinsics.areEqual(this.beforePic, themeConfig.beforePic) && Intrinsics.areEqual(this.beforeBgColor, themeConfig.beforeBgColor) && Intrinsics.areEqual(this.beforeText, themeConfig.beforeText) && Intrinsics.areEqual(this.beforeTextColor, themeConfig.beforeTextColor) && Intrinsics.areEqual(this.beforeBtnColor, themeConfig.beforeBtnColor) && Intrinsics.areEqual(this.beforeBtnTextColor, themeConfig.beforeBtnTextColor) && Intrinsics.areEqual(this.beforeTips1, themeConfig.beforeTips1) && Intrinsics.areEqual(this.beforeTips2, themeConfig.beforeTips2) && Intrinsics.areEqual(this.afterBgColor, themeConfig.afterBgColor) && Intrinsics.areEqual(this.afterIconColor, themeConfig.afterIconColor) && Intrinsics.areEqual(this.afterTextColor, themeConfig.afterTextColor);
    }

    @Nullable
    public final String getAfterBgColor() {
        return this.afterBgColor;
    }

    @Nullable
    public final String getAfterIconColor() {
        return this.afterIconColor;
    }

    @Nullable
    public final String getAfterTextColor() {
        return this.afterTextColor;
    }

    @Nullable
    public final String getBeforeBgColor() {
        return this.beforeBgColor;
    }

    @Nullable
    public final String getBeforeBtnColor() {
        return this.beforeBtnColor;
    }

    @Nullable
    public final String getBeforeBtnTextColor() {
        return this.beforeBtnTextColor;
    }

    @Nullable
    public final String getBeforePic() {
        return this.beforePic;
    }

    @Nullable
    public final String getBeforeText() {
        return this.beforeText;
    }

    @Nullable
    public final String getBeforeTextColor() {
        return this.beforeTextColor;
    }

    @Nullable
    public final String getBeforeTips1() {
        return this.beforeTips1;
    }

    @Nullable
    public final String getBeforeTips2() {
        return this.beforeTips2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    public int hashCode() {
        boolean z = this.isNew;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.beforePic;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.beforeBgColor;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.beforeText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.beforeTextColor;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.beforeBtnColor;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.beforeBtnTextColor;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.beforeTips1;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.beforeTips2;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.afterBgColor;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.afterIconColor;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.afterTextColor;
        return iHashCode10 + (str11 != null ? str11.hashCode() : 0);
    }

    public final boolean isNew() {
        return this.isNew;
    }

    public final void setAfterBgColor(@Nullable String str) {
        this.afterBgColor = str;
    }

    public final void setAfterIconColor(@Nullable String str) {
        this.afterIconColor = str;
    }

    public final void setAfterTextColor(@Nullable String str) {
        this.afterTextColor = str;
    }

    public final void setBeforeBgColor(@Nullable String str) {
        this.beforeBgColor = str;
    }

    public final void setBeforeBtnColor(@Nullable String str) {
        this.beforeBtnColor = str;
    }

    public final void setBeforeBtnTextColor(@Nullable String str) {
        this.beforeBtnTextColor = str;
    }

    public final void setBeforePic(@Nullable String str) {
        this.beforePic = str;
    }

    public final void setBeforeText(@Nullable String str) {
        this.beforeText = str;
    }

    public final void setBeforeTextColor(@Nullable String str) {
        this.beforeTextColor = str;
    }

    public final void setBeforeTips1(@Nullable String str) {
        this.beforeTips1 = str;
    }

    public final void setBeforeTips2(@Nullable String str) {
        this.beforeTips2 = str;
    }

    public final void setNew(boolean z) {
        this.isNew = z;
    }

    @NotNull
    public String toString() {
        boolean z = this.isNew;
        String str = this.beforePic;
        String str2 = this.beforeBgColor;
        String str3 = this.beforeText;
        String str4 = this.beforeTextColor;
        String str5 = this.beforeBtnColor;
        String str6 = this.beforeBtnTextColor;
        String str7 = this.beforeTips1;
        String str8 = this.beforeTips2;
        String str9 = this.afterBgColor;
        String str10 = this.afterIconColor;
        String str11 = this.afterTextColor;
        StringBuilder sb = new StringBuilder("ThemeConfig(isNew=");
        sb.append(z);
        sb.append(", beforePic=");
        sb.append(str);
        sb.append(", beforeBgColor=");
        OooO0O0.OooO00o(sb, str2, ", beforeText=", str3, ", beforeTextColor=");
        OooO0O0.OooO00o(sb, str4, ", beforeBtnColor=", str5, ", beforeBtnTextColor=");
        OooO0O0.OooO00o(sb, str6, ", beforeTips1=", str7, ", beforeTips2=");
        OooO0O0.OooO00o(sb, str8, ", afterBgColor=", str9, ", afterIconColor=");
        return o0OoOo0.OooO0OO(sb, str10, ", afterTextColor=", str11, ")");
    }

    public /* synthetic */ ThemeConfig(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : str8, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : str9, (i & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? null : str10, (i & 2048) == 0 ? str11 : null);
    }
}

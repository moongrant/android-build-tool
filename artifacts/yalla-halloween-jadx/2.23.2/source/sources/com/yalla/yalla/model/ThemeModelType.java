package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/model/ThemeModelType;", "", "()V", "CurrState_Approved", "", "CurrState_Frozen", "CurrState_UnderReview", "themeType_30Days", "themeType_7Days", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ThemeModelType {
    public static final int $stable = 0;
    public static final int CurrState_Approved = 1;
    public static final int CurrState_Frozen = 3;
    public static final int CurrState_UnderReview = 0;

    @NotNull
    public static final ThemeModelType INSTANCE = new ThemeModelType();
    public static final int themeType_30Days = 1;
    public static final int themeType_7Days = 2;

    private ThemeModelType() {
    }
}

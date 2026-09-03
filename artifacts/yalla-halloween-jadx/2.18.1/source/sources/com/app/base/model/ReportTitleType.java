package com.app.base.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/app/base/model/ReportTitleType;", "", "()V", "bullying_or_harassment", "", "impersonating_a_user", "normal", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ReportTitleType {
    public static final int $stable = 0;

    @NotNull
    public static final ReportTitleType INSTANCE = new ReportTitleType();
    public static final int bullying_or_harassment = 1;
    public static final int impersonating_a_user = 2;
    public static final int normal = 0;

    private ReportTitleType() {
    }
}

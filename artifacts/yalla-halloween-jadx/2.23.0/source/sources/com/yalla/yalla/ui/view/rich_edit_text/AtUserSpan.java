package com.yalla.yalla.ui.view.rich_edit_text;

import android.text.style.ForegroundColorSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yalla/yalla/ui/view/rich_edit_text/AtUserSpan;", "Landroid/text/style/ForegroundColorSpan;", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class AtUserSpan extends ForegroundColorSpan {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String f31274OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final String f31275OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f31276OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f31277OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f31278OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AtUserSpan(long j, @NotNull String atContent, int i, @NotNull String userName) {
        super(i);
        Intrinsics.checkNotNullParameter(atContent, "atContent");
        Intrinsics.checkNotNullParameter(userName, "userName");
        this.f31274OooO0Oo = atContent;
        this.f31276OooO0o0 = j;
        this.f31275OooO0o = userName;
    }
}

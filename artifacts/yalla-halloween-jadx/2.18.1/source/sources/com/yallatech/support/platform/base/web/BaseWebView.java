package com.yallatech.support.platform.base.web;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.umeng.analytics.pro.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\u0019\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0015B+\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0017J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/yallatech/support/platform/base/web/BaseWebView;", "Landroid/webkit/WebView;", "", "can", "", "setCanGoBack", "(Z)V", "setCanGoForward", "", "step", "setGoBackStep", "(I)V", "setGoForwardStep", "Landroid/content/Context;", d.R, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class BaseWebView extends WebView {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f26317Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f26318Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f26319Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWebView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26317Oooo0o = true;
        this.f26318Oooo0oO = true;
        this.f26319Oooo0oo = 1;
        getSettings().setAllowFileAccessFromFileURLs(false);
        getSettings().setAllowUniversalAccessFromFileURLs(false);
        getSettings().setSavePassword(false);
        getSettings().setSaveFormData(false);
    }

    @Override // android.webkit.WebView
    public final boolean canGoBack() {
        if (this.f26317Oooo0o) {
            return super.canGoBack();
        }
        this.f26317Oooo0o = true;
        return false;
    }

    @Override // android.webkit.WebView
    public final boolean canGoForward() {
        if (this.f26318Oooo0oO) {
            return super.canGoForward();
        }
        this.f26318Oooo0oO = true;
        return false;
    }

    @Override // android.webkit.WebView
    public final void goBack() {
        int i = this.f26319Oooo0oo;
        if (i < -1) {
            goBackOrForward(i);
        } else {
            super.goBack();
        }
    }

    @Override // android.webkit.WebView
    public final void goForward() {
        int i = this.f26319Oooo0oo;
        if (i > 1) {
            goBackOrForward(i);
        } else {
            super.goForward();
        }
    }

    public final void setCanGoBack(boolean can) {
        this.f26317Oooo0o = can;
    }

    public final void setCanGoForward(boolean can) {
        this.f26318Oooo0oO = can;
    }

    public final void setGoBackStep(int step) {
        this.f26319Oooo0oo = step;
    }

    public final void setGoForwardStep(int step) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWebView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f26317Oooo0o = true;
        this.f26318Oooo0oO = true;
        this.f26319Oooo0oo = 1;
        getSettings().setAllowFileAccessFromFileURLs(false);
        getSettings().setAllowUniversalAccessFromFileURLs(false);
        getSettings().setSavePassword(false);
        getSettings().setSaveFormData(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWebView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26317Oooo0o = true;
        this.f26318Oooo0oO = true;
        this.f26319Oooo0oo = 1;
        getSettings().setAllowFileAccessFromFileURLs(false);
        getSettings().setAllowUniversalAccessFromFileURLs(false);
        getSettings().setSavePassword(false);
        getSettings().setSaveFormData(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public BaseWebView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26317Oooo0o = true;
        this.f26318Oooo0oO = true;
        this.f26319Oooo0oo = 1;
        getSettings().setAllowFileAccessFromFileURLs(false);
        getSettings().setAllowUniversalAccessFromFileURLs(false);
        getSettings().setSavePassword(false);
        getSettings().setSaveFormData(false);
    }
}

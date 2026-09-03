package com.geetest.captcha;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p041Ooooo0o.o00000;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010\u001b\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011J\r\u0010\u001c\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u001dJ\b\u0010\u001e\u001a\u00020\u0013H\u0016R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/geetest/captcha/dialog/GTC4Dialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dialogStyle", "", "(Landroid/content/Context;Ljava/lang/String;)V", "themeResId", "", "(Landroid/content/Context;I)V", "cancelable", "", "cancelListener", "Landroid/content/DialogInterface$OnCancelListener;", "(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;)V", "webView", "Landroid/view/View;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onInflaterView", "inflater", "Landroid/view/LayoutInflater;", "onInitView", ViewHierarchyConstants.VIEW_KEY, "setContent", "setScreenAttributes", "setScreenAttributes$captcha_release", "show", "captcha_release"}, k = 1, mv = {1, 1, 16})
public final class d extends Dialog {
    public View a;

    public d(@NotNull Context context) {
        super(context, af.b(context, "gt4_captcha_dialog_style"));
    }

    public final void a() {
        Window window = getWindow();
        if (window != null) {
            window.addFlags(1280);
        }
        Window window2 = getWindow();
        WindowManager.LayoutParams attributes = window2 != null ? window2.getAttributes() : null;
        ab abVar = ab.a;
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        int iA = ab.a(context);
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        int iB = ab.b(context2);
        if (attributes != null) {
            attributes.width = iA;
        }
        if (attributes != null) {
            attributes.height = iB;
        }
        ag agVar = ag.a;
        StringBuilder sbOooO00o = o00000.OooO00o("ScreenWidth: ", iA, ", ScreenHeight: ", iB, ", DialogWidth: ");
        sbOooO00o.append(attributes != null ? Integer.valueOf(attributes.width) : null);
        sbOooO00o.append(", DialogHeight: ");
        sbOooO00o.append(attributes != null ? Integer.valueOf(attributes.height) : null);
        ag.b(sbOooO00o.toString());
        if (attributes != null) {
            attributes.gravity = 17;
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setAttributes(attributes);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = LayoutInflater.from(getContext());
        Intrinsics.checkExpressionValueIsNotNull(inflater, "inflater");
        View view = this.a;
        if (view != null) {
            setContentView(view);
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        a();
    }

    public d(@NotNull Context context, @NotNull String str) {
        super(context, af.b(context, str));
    }
}

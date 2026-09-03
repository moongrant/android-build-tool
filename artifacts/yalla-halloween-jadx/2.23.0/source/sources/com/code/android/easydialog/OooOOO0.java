package com.code.android.easydialog;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 extends LifeCycleDialog {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ OooO<OooO<Object>> f10145OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(int i, OooO<OooO<Object>> oooO, Context context) {
        super(context, i);
        this.f10145OooO0oo = oooO;
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(@NotNull MotionEvent event) {
        Window window;
        View decorView;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 1 && (window = getWindow()) != null && (decorView = window.getDecorView()) != null && isShowing() && this.f10145OooO0oo.f10136OooO0Oo) {
            int x = (int) event.getX();
            int y = (int) event.getY();
            if (x <= 0 || y <= 0 || x > decorView.getWidth() || y > decorView.getHeight()) {
                cancel();
                return true;
            }
        }
        return false;
    }
}

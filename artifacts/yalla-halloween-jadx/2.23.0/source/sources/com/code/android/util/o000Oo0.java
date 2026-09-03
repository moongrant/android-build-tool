package com.code.android.util;

import android.R;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o000Oo0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ToastUtil f10370OooO0Oo = ToastUtil.f10293OooO00o;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f10371OooO0o = 0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ CharSequence f10372OooO0o0;

    /* JADX WARN: Code duplicated, block: B:23:0x00b5  */
    @Override // java.lang.Runnable
    public final void run() {
        View viewInflate;
        ToastUtil utils = this.f10370OooO0Oo;
        Intrinsics.checkNotNullParameter(utils, "$utils");
        WeakReference<ToastUtil.OooO0O0> weakReference = ToastUtil.f10294OooO0O0;
        if (weakReference != null) {
            Intrinsics.checkNotNull(weakReference);
            ToastUtil.OooO0O0 oooO0O0 = weakReference.get();
            if (oooO0O0 != null) {
                oooO0O0.cancel();
            }
            ToastUtil.f10294OooO0O0 = null;
        }
        ToastUtil.OooO0OO oooO0OO = new ToastUtil.OooO0OO(utils);
        ToastUtil.f10294OooO0O0 = new WeakReference<>(oooO0OO);
        oooO0OO.f10297OooO0O0.getClass();
        ToastUtil.MODE.INSTANCE.getClass();
        boolean zAreEqual = Intrinsics.areEqual("dark", (Object) null);
        CharSequence charSequence = this.f10372OooO0o0;
        if (zAreEqual || Intrinsics.areEqual("light", (Object) null)) {
            int i = o000000O.android_util_toast_view;
            Object systemService = o000O0.OooO00o().getSystemService("layout_inflater");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            viewInflate = ((LayoutInflater) systemService).inflate(i, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate.inflate(layoutId, null)");
            TextView textView = (TextView) viewInflate.findViewById(R.id.message);
            if (Intrinsics.areEqual("dark", (Object) null)) {
                Drawable drawableMutate = viewInflate.getBackground().mutate();
                Intrinsics.checkNotNull(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                ((GradientDrawable) drawableMutate).setColor(Color.parseColor("#BB000000"));
                textView.setTextColor(-1);
            }
            textView.setText(charSequence);
        } else {
            viewInflate = null;
        }
        if (viewInflate != null) {
            oooO0OO.f10298OooO0OO = viewInflate;
            Toast toast = oooO0OO.f10296OooO00o;
            Intrinsics.checkNotNull(toast);
            toast.setView(oooO0OO.f10298OooO0OO);
        } else {
            Toast toast2 = oooO0OO.f10296OooO00o;
            Intrinsics.checkNotNull(toast2);
            View view = toast2.getView();
            oooO0OO.f10298OooO0OO = view;
            if (view != null) {
                Intrinsics.checkNotNull(view);
                if (view.findViewById(R.id.message) == null) {
                    int i2 = o000000O.android_util_toast_view;
                    Object systemService2 = o000O0.OooO00o().getSystemService("layout_inflater");
                    Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View viewInflate2 = ((LayoutInflater) systemService2).inflate(i2, (ViewGroup) null);
                    Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate.inflate(layoutId, null)");
                    oooO0OO.f10298OooO0OO = viewInflate2;
                    Toast toast3 = oooO0OO.f10296OooO00o;
                    Intrinsics.checkNotNull(toast3);
                    toast3.setView(oooO0OO.f10298OooO0OO);
                }
            } else {
                int i3 = o000000O.android_util_toast_view;
                Object systemService3 = o000O0.OooO00o().getSystemService("layout_inflater");
                Intrinsics.checkNotNull(systemService3, "null cannot be cast to non-null type android.view.LayoutInflater");
                View viewInflate3 = ((LayoutInflater) systemService3).inflate(i3, (ViewGroup) null);
                Intrinsics.checkNotNullExpressionValue(viewInflate3, "inflate.inflate(layoutId, null)");
                oooO0OO.f10298OooO0OO = viewInflate3;
                Toast toast4 = oooO0OO.f10296OooO00o;
                Intrinsics.checkNotNull(toast4);
                toast4.setView(oooO0OO.f10298OooO0OO);
            }
            View view2 = oooO0OO.f10298OooO0OO;
            Intrinsics.checkNotNull(view2);
            ((TextView) view2.findViewById(R.id.message)).setText(charSequence);
        }
        Toast toast5 = oooO0OO.f10296OooO00o;
        if (toast5 == null) {
            return;
        }
        Intrinsics.checkNotNull(toast5);
        toast5.setDuration(this.f10371OooO0o);
        Toast toast6 = oooO0OO.f10296OooO00o;
        Intrinsics.checkNotNull(toast6);
        toast6.show();
    }
}

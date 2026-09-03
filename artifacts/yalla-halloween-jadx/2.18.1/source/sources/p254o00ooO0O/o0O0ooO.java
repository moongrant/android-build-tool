package p254o00ooO0O;

import android.R;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.code.android.util.ToastUtil;
import java.lang.ref.WeakReference;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O0ooO implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ToastUtil f34355Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ CharSequence f34356Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f34357Oooo0oo = 0;

    public /* synthetic */ o0O0ooO(ToastUtil toastUtil, CharSequence charSequence) {
        this.f34355Oooo0o = toastUtil;
        this.f34356Oooo0oO = charSequence;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b9  */
    @Override // java.lang.Runnable
    public final void run() {
        View viewInflate;
        ToastUtil utils = this.f34355Oooo0o;
        CharSequence charSequence = this.f34356Oooo0oO;
        int i = this.f34357Oooo0oo;
        Intrinsics.checkNotNullParameter(utils, "$utils");
        WeakReference<ToastUtil.OooO0OO> weakReference = ToastUtil.f12569OooO0OO;
        if (weakReference != null) {
            Intrinsics.checkNotNull(weakReference);
            ToastUtil.OooO0OO oooO0OO = weakReference.get();
            if (oooO0OO != null) {
                oooO0OO.cancel();
            }
            ToastUtil.f12569OooO0OO = null;
        }
        ToastUtil.OooO0o oooO0o = new ToastUtil.OooO0o(utils);
        ToastUtil.f12569OooO0OO = new WeakReference<>(oooO0o);
        Objects.requireNonNull(oooO0o.f12572OooO0O0);
        Objects.requireNonNull(ToastUtil.MODE.Companion);
        if (Intrinsics.areEqual("dark", (Object) null) || Intrinsics.areEqual("light", (Object) null)) {
            int i2 = o000O00.android_util_toast_view;
            o00O000 o00o001 = o00O000.f34346OooO00o;
            Object systemService = o00O000.OooO00o().getSystemService("layout_inflater");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            viewInflate = ((LayoutInflater) systemService).inflate(i2, (ViewGroup) null);
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
            oooO0o.f12573OooO0OO = viewInflate;
            Toast toast = oooO0o.f12571OooO00o;
            Intrinsics.checkNotNull(toast);
            toast.setView(oooO0o.f12573OooO0OO);
        } else {
            Toast toast2 = oooO0o.f12571OooO00o;
            Intrinsics.checkNotNull(toast2);
            View view = toast2.getView();
            oooO0o.f12573OooO0OO = view;
            if (view != null) {
                Intrinsics.checkNotNull(view);
                if (view.findViewById(R.id.message) == null) {
                    int i3 = o000O00.android_util_toast_view;
                    o00O000 o00o002 = o00O000.f34346OooO00o;
                    Object systemService2 = o00O000.OooO00o().getSystemService("layout_inflater");
                    Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View viewInflate2 = ((LayoutInflater) systemService2).inflate(i3, (ViewGroup) null);
                    Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate.inflate(layoutId, null)");
                    oooO0o.f12573OooO0OO = viewInflate2;
                    Toast toast3 = oooO0o.f12571OooO00o;
                    Intrinsics.checkNotNull(toast3);
                    toast3.setView(oooO0o.f12573OooO0OO);
                }
            } else {
                int i4 = o000O00.android_util_toast_view;
                o00O000 o00o003 = o00O000.f34346OooO00o;
                Object systemService3 = o00O000.OooO00o().getSystemService("layout_inflater");
                Intrinsics.checkNotNull(systemService3, "null cannot be cast to non-null type android.view.LayoutInflater");
                View viewInflate3 = ((LayoutInflater) systemService3).inflate(i4, (ViewGroup) null);
                Intrinsics.checkNotNullExpressionValue(viewInflate3, "inflate.inflate(layoutId, null)");
                oooO0o.f12573OooO0OO = viewInflate3;
                Toast toast4 = oooO0o.f12571OooO00o;
                Intrinsics.checkNotNull(toast4);
                toast4.setView(oooO0o.f12573OooO0OO);
            }
            View view2 = oooO0o.f12573OooO0OO;
            Intrinsics.checkNotNull(view2);
            ((TextView) view2.findViewById(R.id.message)).setText(charSequence);
        }
        Toast toast5 = oooO0o.f12571OooO00o;
        if (toast5 == null) {
            return;
        }
        Intrinsics.checkNotNull(toast5);
        toast5.setDuration(i);
        Toast toast6 = oooO0o.f12571OooO00o;
        Intrinsics.checkNotNull(toast6);
        toast6.show();
    }
}

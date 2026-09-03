package oO0OO;

import android.R;
import android.app.Dialog;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.code.android.util.o0000O0;
import com.code.android.util.o0000O0O;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.squareup.okhttp.OooOo;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import p270o0O0000o.o0000Ooo;
import p418o0OoO000.Oooo000;
import p466o0Oooo0o.oo00o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00Oo00;

/* JADX INFO: loaded from: classes4.dex */
public abstract class OooO00o extends com.google.android.material.bottomsheet.OooO0OO implements Oooo000, ViewStub.OnInflateListener, com.yalla.yalla.base.fragment.OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public View f60354OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ImageView f60355OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public String f60356OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public View f60357OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f60358OooOO0 = 0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f60359OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public com.google.android.material.bottomsheet.OooO0O0 f60360OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public TextView f60361OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public ViewStub f60362OooOOO0;

    /* JADX INFO: renamed from: oO0OO.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C0518OooO00o extends oo00o {
        public C0518OooO00o() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(View view) {
            OooO00o oooO00o = OooO00o.this;
            if (oooO00o.getDialog() != null) {
                oooO00o.getDialog().dismiss();
            }
        }
    }

    public class OooO0O0 extends BottomSheetBehavior.OooO0OO {
        public OooO0O0() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.OooO0OO
        public final void OooO0O0(@NonNull View view) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.OooO0OO
        public final void OooO0OO(int i, @NonNull View view) {
            OooO00o oooO00o = OooO00o.this;
            if (i == 5) {
                oooO00o.f60360OooOO0o.dismiss();
                oooO00o.f60359OooOO0O.Oooo0O0(4);
            }
            oooO00o.OooO0o(i, view);
        }
    }

    public abstract int OooO0Oo();

    public abstract void OooO0o(int i, @NonNull View view);

    public abstract void OooO0o0();

    public abstract void initData();

    @Override // androidx.fragment.app.OooOo, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        OooOo.OooO0Oo(this);
        super.onCreate(bundle);
    }

    @Override // com.google.android.material.bottomsheet.OooO0OO, androidx.appcompat.app.o0O0O00, androidx.fragment.app.OooOo
    @NonNull
    public final Dialog onCreateDialog(Bundle bundle) {
        setStyle(0, oO00Oo00.TransBottomSheetDialogStyle);
        return super.onCreateDialog(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        initData();
        if (this.f60358OooOO0 == 0) {
            this.f60358OooOO0 = o0000O0.OooO00o(57);
        }
        View viewInflate = layoutInflater.inflate(oO00OO0O.dialog_sheet_base, viewGroup);
        this.f60357OooO0oo = viewInflate;
        this.f60354OooO = viewInflate.findViewById(oO00O0oO.splitLine);
        ViewStub viewStub = (ViewStub) this.f60357OooO0oo.findViewById(oO00O0oO.vs_sheet_dialog);
        this.f60362OooOOO0 = viewStub;
        viewStub.setOnInflateListener(this);
        this.f60362OooOOO0.setLayoutResource(OooO0Oo());
        this.f60362OooOOO0.inflate();
        ((ImageView) this.f60357OooO0oo.findViewById(oO00O0oO.iv_sheet_dialog_close)).setOnClickListener(new C0518OooO00o());
        TextView textView = (TextView) this.f60357OooO0oo.findViewById(oO00O0oO.tv_sheet_dialog_title);
        this.f60361OooOOO = textView;
        textView.setText(this.f60356OooO0oO);
        this.f60355OooO0o = (ImageView) this.f60357OooO0oo.findViewById(oO00O0oO.iv_sheet_dialog_refresh);
        OooO0o0();
        return this.f60357OooO0oo;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        OooOo.OooO0o0(this);
        FragmentActivity activity = requireActivity();
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object systemService = activity.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(activity.findViewById(R.id.content).getWindowToken(), 0);
        super.onDestroy();
    }

    @Override // p418o0OoO000.Oooo000
    @Subscribe(threadMode = ThreadMode.POSTING)
    public void onEvent(p418o0OoO000.OooOo oooOo) {
    }

    @Override // p418o0OoO000.Oooo000
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(p418o0OoO000.OooOo oooOo) {
    }

    @Override // android.view.ViewStub.OnInflateListener
    public final void onInflate(ViewStub viewStub, View view) {
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0059  */
    @Override // androidx.fragment.app.OooOo, androidx.fragment.app.Fragment
    public final void onStart() {
        int iOooO0Oo;
        super.onStart();
        com.google.android.material.bottomsheet.OooO0O0 oooO0O0 = (com.google.android.material.bottomsheet.OooO0O0) getDialog();
        this.f60360OooOO0o = oooO0O0;
        oooO0O0.getWindow().setSoftInputMode(2);
        FrameLayout frameLayout = (FrameLayout) this.f60360OooOO0o.OooO0o0().OooO0o(o0000Ooo.design_bottom_sheet);
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(0);
            CoordinatorLayout.OooO0o oooO0o = (CoordinatorLayout.OooO0o) frameLayout.getLayoutParams();
            if (getContext() != null) {
                WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
                Point point = new Point();
                if (windowManager != null) {
                    windowManager.getDefaultDisplay().getSize(point);
                    iOooO0Oo = (point.y - this.f60358OooOO0) - o0000O0O.OooO0Oo();
                } else {
                    iOooO0Oo = 1920;
                }
            } else {
                iOooO0Oo = 1920;
            }
            ((ViewGroup.MarginLayoutParams) oooO0o).height = iOooO0Oo;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorOooOoO = BottomSheetBehavior.OooOoO(frameLayout);
            this.f60359OooOO0O = bottomSheetBehaviorOooOoO;
            bottomSheetBehaviorOooOoO.Oooo0O0(3);
            this.f60359OooOO0O.Oooo0(((ViewGroup.MarginLayoutParams) oooO0o).height);
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f60359OooOO0O;
            OooO0O0 oooO0O1 = new OooO0O0();
            bottomSheetBehavior.getClass();
            Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
            ArrayList<BottomSheetBehavior.OooO0OO> arrayList = bottomSheetBehavior.f16479OoooOOo;
            arrayList.clear();
            arrayList.add(oooO0O1);
        }
    }

    @Override // androidx.fragment.app.OooOo
    public final void show(FragmentManager fragmentManager, String str) {
        this.f60356OooO0oO = str;
        try {
            super.show(fragmentManager, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

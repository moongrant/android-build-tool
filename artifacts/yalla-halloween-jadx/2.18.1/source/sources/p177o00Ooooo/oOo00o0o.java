package p177o00Ooooo;

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
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo00;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import p034OoooO0O.o0Oo0oo;
import p140o00OOOoO.OooO0OO;
import p140o00OOOoO.OooO0o;
import p254o00ooO0O.o000OOo0;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public abstract class oOo00o0o extends com.google.android.material.bottomsheet.OooO0O0 implements OooO0o, ViewStub.OnInflateListener, o00OOO0.OooO0O0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public View f32927Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ImageView f32928Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public String f32929Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public View f32930Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public ViewStub f32931OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f32932OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f32933OoooO00 = 0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public com.google.android.material.bottomsheet.OooO00o f32934OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public TextView f32935OoooOO0;

    public class OooO00o extends o00Oo0 {
        public OooO00o() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(View view) {
            if (oOo00o0o.this.getDialog() != null) {
                oOo00o0o.this.getDialog().dismiss();
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
        public final void OooO0OO(@NonNull View view, int i) {
            if (i == 5) {
                oOo00o0o.this.f32934OoooO0O.dismiss();
                oOo00o0o.this.f32932OoooO0.Oooo00O(4);
            }
            oOo00o0o.this.OooO0Oo(view, i);
        }
    }

    public abstract int OooO0O0();

    public abstract void OooO0OO();

    public abstract void OooO0Oo(@NonNull View view, int i);

    public abstract void initData();

    @Override // o00OOO0.OooO0O0
    public final boolean isVisiableSystem() {
        return isAdded();
    }

    @Override // androidx.fragment.app.OooOo00, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        o0Oo0oo.OooO0oo(this);
        super.onCreate(bundle);
    }

    @Override // com.google.android.material.bottomsheet.OooO0O0, androidx.appcompat.app.Oooo0, androidx.fragment.app.OooOo00
    @NonNull
    public final Dialog onCreateDialog(Bundle bundle) {
        setStyle(0, R.style.TransBottomSheetDialogStyle);
        return super.onCreateDialog(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        initData();
        if (this.f32933OoooO00 == 0) {
            this.f32933OoooO00 = OooOo00.OooO00o(57.0f);
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_sheet_base, viewGroup);
        this.f32930Oooo0oo = viewInflate;
        this.f32927Oooo = viewInflate.findViewById(R.id.splitLine);
        ViewStub viewStub = (ViewStub) this.f32930Oooo0oo.findViewById(R.id.vs_sheet_dialog);
        this.f32931OoooO = viewStub;
        viewStub.setOnInflateListener(this);
        this.f32931OoooO.setLayoutResource(OooO0O0());
        this.f32931OoooO.inflate();
        ((ImageView) this.f32930Oooo0oo.findViewById(R.id.iv_sheet_dialog_close)).setOnClickListener(new OooO00o());
        TextView textView = (TextView) this.f32930Oooo0oo.findViewById(R.id.tv_sheet_dialog_title);
        this.f32935OoooOO0 = textView;
        textView.setText(this.f32929Oooo0oO);
        this.f32928Oooo0o = (ImageView) this.f32930Oooo0oo.findViewById(R.id.iv_sheet_dialog_refresh);
        OooO0OO();
        return this.f32930Oooo0oo;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        o0Oo0oo.OooO(this);
        FragmentActivity activity = requireActivity();
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object systemService = activity.getSystemService("input_method");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        View viewFindViewById = activity.findViewById(android.R.id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "activity.findViewById<View>(android.R.id.content)");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(viewFindViewById.getWindowToken(), 0);
        super.onDestroy();
    }

    @Override // p140o00OOOoO.OooO0o
    @Subscribe(threadMode = ThreadMode.POSTING)
    public void onEvent(OooO0OO oooO0OO) {
    }

    @Override // p140o00OOOoO.OooO0o
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(OooO0OO oooO0OO) {
    }

    @Override // android.view.ViewStub.OnInflateListener
    public final void onInflate(ViewStub viewStub, View view) {
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0059  */
    @Override // androidx.fragment.app.OooOo00, androidx.fragment.app.Fragment
    public final void onStart() {
        int iOooO0OO;
        super.onStart();
        com.google.android.material.bottomsheet.OooO00o oooO00o = (com.google.android.material.bottomsheet.OooO00o) getDialog();
        this.f32934OoooO0O = oooO00o;
        oooO00o.getWindow().setSoftInputMode(2);
        FrameLayout frameLayout = (FrameLayout) this.f32934OoooO0O.OooO0oO().OooO0o0(R.id.design_bottom_sheet);
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(0);
            CoordinatorLayout.OooO0o oooO0o = (CoordinatorLayout.OooO0o) frameLayout.getLayoutParams();
            if (getContext() != null) {
                WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
                Point point = new Point();
                if (windowManager != null) {
                    windowManager.getDefaultDisplay().getSize(point);
                    iOooO0OO = (point.y - this.f32933OoooO00) - o000OOo0.OooO0OO();
                } else {
                    iOooO0OO = 1920;
                }
            } else {
                iOooO0OO = 1920;
            }
            ((ViewGroup.MarginLayoutParams) oooO0o).height = iOooO0OO;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorOooOoO0 = BottomSheetBehavior.OooOoO0(frameLayout);
            this.f32932OoooO0 = bottomSheetBehaviorOooOoO0;
            bottomSheetBehaviorOooOoO0.Oooo00O(3);
            this.f32932OoooO0.Oooo000(((ViewGroup.MarginLayoutParams) oooO0o).height);
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f32932OoooO0;
            OooO0O0 oooO0O0 = new OooO0O0();
            Objects.requireNonNull(bottomSheetBehavior);
            Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
            bottomSheetBehavior.f16636OoooO.clear();
            bottomSheetBehavior.f16636OoooO.add(oooO0O0);
        }
    }

    @Override // androidx.fragment.app.OooOo00
    public final void show(FragmentManager fragmentManager, String str) {
        this.f32929Oooo0oO = str;
        try {
            super.show(fragmentManager, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

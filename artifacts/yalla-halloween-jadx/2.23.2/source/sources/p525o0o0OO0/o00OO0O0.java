package p525o0o0OO0;

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
import com.google.android.material.bottomsheet.OooO0OO;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import p272o0O0000o.o0000Ooo;
import p473o0OoooOo.o0OOOO0o;
import p545o0oO0O00.OooOOO;
import p545o0oO0O00.OooOOOO;
import p545o0oO0O00.OooOo00;
import p562o0oOo000.o000000O;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o00OO0O0 extends OooO0OO implements OooOOOO, ViewStub.OnInflateListener, com.yalla.yalla.base.fragment.OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public View f53231OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ImageView f53232OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public String f53233OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public View f53234OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f53235OooOO0 = 0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f53236OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public com.google.android.material.bottomsheet.OooO0O0 f53237OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public TextView f53238OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public ViewStub f53239OooOOO0;

    public class OooO00o extends o0OOOO0o {
        public OooO00o() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(View view) {
            o00OO0O0 o00oo0o1 = o00OO0O0.this;
            if (o00oo0o1.getDialog() != null) {
                o00oo0o1.getDialog().dismiss();
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
            o00OO0O0 o00oo0o1 = o00OO0O0.this;
            if (i == 5) {
                o00oo0o1.f53237OooOO0o.dismiss();
                o00oo0o1.f53236OooOO0O.Oooo0O0(4);
            }
            o00oo0o1.OooO0o(i, view);
        }
    }

    public abstract int OooO0Oo();

    public abstract void OooO0o(int i, @NonNull View view);

    public abstract void OooO0o0();

    public abstract void initData();

    @Override // androidx.fragment.app.Oooo0, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        OooOo00.OooO0OO(this);
        super.onCreate(bundle);
    }

    @Override // com.google.android.material.bottomsheet.OooO0OO, androidx.appcompat.app.o0O0O00, androidx.fragment.app.Oooo0
    @NonNull
    public final Dialog onCreateDialog(Bundle bundle) {
        setStyle(0, o000000O.TransBottomSheetDialogStyle);
        return super.onCreateDialog(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        initData();
        if (this.f53235OooOO0 == 0) {
            this.f53235OooOO0 = o0000O0.OooO00o(57);
        }
        View viewInflate = layoutInflater.inflate(oo0o0Oo.dialog_sheet_base, viewGroup);
        this.f53234OooO0oo = viewInflate;
        this.f53231OooO = viewInflate.findViewById(o0OO00O.splitLine);
        ViewStub viewStub = (ViewStub) this.f53234OooO0oo.findViewById(o0OO00O.vs_sheet_dialog);
        this.f53239OooOOO0 = viewStub;
        viewStub.setOnInflateListener(this);
        this.f53239OooOOO0.setLayoutResource(OooO0Oo());
        this.f53239OooOOO0.inflate();
        ((ImageView) this.f53234OooO0oo.findViewById(o0OO00O.iv_sheet_dialog_close)).setOnClickListener(new OooO00o());
        TextView textView = (TextView) this.f53234OooO0oo.findViewById(o0OO00O.tv_sheet_dialog_title);
        this.f53238OooOOO = textView;
        textView.setText(this.f53233OooO0oO);
        this.f53232OooO0o = (ImageView) this.f53234OooO0oo.findViewById(o0OO00O.iv_sheet_dialog_refresh);
        OooO0o0();
        return this.f53234OooO0oo;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        OooOo00.OooO0Oo(this);
        FragmentActivity activity = requireActivity();
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object systemService = activity.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(activity.findViewById(R.id.content).getWindowToken(), 0);
        super.onDestroy();
    }

    @Override // p545o0oO0O00.OooOOOO
    @Subscribe(threadMode = ThreadMode.POSTING)
    public void onEvent(OooOOO oooOOO) {
    }

    @Override // p545o0oO0O00.OooOOOO
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(OooOOO oooOOO) {
    }

    @Override // android.view.ViewStub.OnInflateListener
    public final void onInflate(ViewStub viewStub, View view) {
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0059  */
    @Override // androidx.fragment.app.Oooo0, androidx.fragment.app.Fragment
    public final void onStart() {
        int iOooO0Oo;
        super.onStart();
        com.google.android.material.bottomsheet.OooO0O0 oooO0O0 = (com.google.android.material.bottomsheet.OooO0O0) getDialog();
        this.f53237OooOO0o = oooO0O0;
        oooO0O0.getWindow().setSoftInputMode(2);
        FrameLayout frameLayout = (FrameLayout) this.f53237OooOO0o.OooO0o0().OooO0o(o0000Ooo.design_bottom_sheet);
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(0);
            CoordinatorLayout.OooO0o oooO0o = (CoordinatorLayout.OooO0o) frameLayout.getLayoutParams();
            if (getContext() != null) {
                WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
                Point point = new Point();
                if (windowManager != null) {
                    windowManager.getDefaultDisplay().getSize(point);
                    iOooO0Oo = (point.y - this.f53235OooOO0) - o0000O0O.OooO0Oo();
                } else {
                    iOooO0Oo = 1920;
                }
            } else {
                iOooO0Oo = 1920;
            }
            ((ViewGroup.MarginLayoutParams) oooO0o).height = iOooO0Oo;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorOooOoO = BottomSheetBehavior.OooOoO(frameLayout);
            this.f53236OooOO0O = bottomSheetBehaviorOooOoO;
            bottomSheetBehaviorOooOoO.Oooo0O0(3);
            this.f53236OooOO0O.Oooo0(((ViewGroup.MarginLayoutParams) oooO0o).height);
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f53236OooOO0O;
            OooO0O0 oooO0O1 = new OooO0O0();
            bottomSheetBehavior.getClass();
            Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
            ArrayList<BottomSheetBehavior.OooO0OO> arrayList = bottomSheetBehavior.f16006OoooOOo;
            arrayList.clear();
            arrayList.add(oooO0O1);
        }
    }

    @Override // androidx.fragment.app.Oooo0
    public final void show(FragmentManager fragmentManager, String str) {
        this.f53233OooO0oO = str;
        try {
            super.show(fragmentManager, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

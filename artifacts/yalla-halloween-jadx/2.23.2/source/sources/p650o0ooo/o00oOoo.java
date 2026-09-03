package p650o0ooo;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.OooO0O0;
import com.google.android.material.bottomsheet.OooO0OO;
import com.yalla.yalla.ui.activity.message.o000oOoO;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p272o0O0000o.o0000Ooo;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lo0ooo/o00oOoo;", "Lcom/google/android/material/bottomsheet/OooO0OO;", "Landroid/view/ViewStub$OnInflateListener;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public abstract class o00oOoo extends OooO0OO implements ViewStub.OnInflateListener {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final /* synthetic */ int f58591OooOO0o = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public ViewStub f58592OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public View f58593OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public TextView f58594OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public String f58595OooO0oo = "";

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f58596OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public OooO0O0 f58597OooOO0O;

    public static final class OooO00o extends BottomSheetBehavior.OooO0OO {
        public OooO00o() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.OooO0OO
        public final void OooO0O0(@NotNull View bottomSheet) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.OooO0OO
        public final void OooO0OO(int i, @NotNull View bottomSheet) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            o00oOoo o00oooo2 = o00oOoo.this;
            if (i == 5) {
                OooO0O0 oooO0O0 = o00oooo2.f58597OooOO0O;
                Intrinsics.checkNotNull(oooO0O0);
                oooO0O0.dismiss();
                o00oooo2.OooO0Oo().Oooo0O0(4);
            }
            o00oooo2.OooO0oo(i, bottomSheet);
        }
    }

    @NotNull
    public final BottomSheetBehavior<FrameLayout> OooO0Oo() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f58596OooOO0;
        if (bottomSheetBehavior != null) {
            return bottomSheetBehavior;
        }
        Intrinsics.throwUninitializedPropertyAccessException("behavior");
        return null;
    }

    @NotNull
    public final View OooO0o() {
        View view = this.f58593OooO0o;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewRoot");
        return null;
    }

    public abstract int OooO0o0();

    public abstract void OooO0oO();

    public abstract void OooO0oo(int i, @NotNull View view);

    public abstract void initData();

    @Override // com.google.android.material.bottomsheet.OooO0OO, androidx.appcompat.app.o0O0O00, androidx.fragment.app.Oooo0
    @NotNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(dialogOnCreateDialog, "onCreateDialog(...)");
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setDimAmount(0.3f);
        }
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(oo0o0Oo.base_bottom_sheet_fragment, viewGroup);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        Intrinsics.checkNotNullParameter(viewInflate, "<set-?>");
        this.f58593OooO0o = viewInflate;
        ViewStub viewStub = (ViewStub) OooO0o().findViewById(o0OO00O.baseSheetViewStub);
        this.f58592OooO = viewStub;
        Intrinsics.checkNotNull(viewStub);
        viewStub.setOnInflateListener(this);
        ViewStub viewStub2 = this.f58592OooO;
        Intrinsics.checkNotNull(viewStub2);
        viewStub2.setLayoutResource(OooO0o0());
        ViewStub viewStub3 = this.f58592OooO;
        Intrinsics.checkNotNull(viewStub3);
        viewStub3.inflate();
        ImageView imageView = (ImageView) OooO0o().findViewById(o0OO00O.baseSheetDialogClose);
        Intrinsics.checkNotNull(imageView);
        imageView.setOnClickListener(new o000oOoO(this, 1));
        View viewFindViewById = OooO0o().findViewById(o0OO00O.baseSheetDialogTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseSheetDialogTitle");
            textView = null;
        }
        textView.setText(this.f58595OooO0oo);
        View viewFindViewById2 = OooO0o().findViewById(o0OO00O.tvSelectNum);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById2;
        Intrinsics.checkNotNullParameter(textView2, "<set-?>");
        this.f58594OooO0oO = textView2;
        OooO0oO();
        initData();
        return OooO0o();
    }

    @Override // androidx.fragment.app.Oooo0, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
    }

    @Override // android.view.ViewStub.OnInflateListener
    public final void onInflate(@NotNull ViewStub stub, @NotNull View inflated) {
        Intrinsics.checkNotNullParameter(stub, "stub");
        Intrinsics.checkNotNullParameter(inflated, "inflated");
    }

    @Override // androidx.fragment.app.Oooo0, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        OooO0O0 oooO0O0 = (OooO0O0) getDialog();
        this.f58597OooOO0O = oooO0O0;
        Intrinsics.checkNotNull(oooO0O0);
        Window window = oooO0O0.getWindow();
        Intrinsics.checkNotNull(window);
        window.setSoftInputMode(2);
        OooO0O0 oooO0O1 = this.f58597OooOO0O;
        Intrinsics.checkNotNull(oooO0O1);
        FrameLayout frameLayout = (FrameLayout) oooO0O1.OooO0o0().OooO0o(o0000Ooo.design_bottom_sheet);
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(0);
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            CoordinatorLayout.OooO0o oooO0o = (CoordinatorLayout.OooO0o) layoutParams;
            ((ViewGroup.MarginLayoutParams) oooO0o).height = -1;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorOooOoO = BottomSheetBehavior.OooOoO(frameLayout);
            Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorOooOoO, "from(...)");
            this.f58596OooOO0 = bottomSheetBehaviorOooOoO;
            OooO0Oo().Oooo0O0(3);
            OooO0Oo().Oooo0(((ViewGroup.MarginLayoutParams) oooO0o).height);
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorOooO0Oo = OooO0Oo();
            OooO00o oooO00o = new OooO00o();
            bottomSheetBehaviorOooO0Oo.getClass();
            Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
            ArrayList<BottomSheetBehavior.OooO0OO> arrayList = bottomSheetBehaviorOooO0Oo.f16006OoooOOo;
            arrayList.clear();
            arrayList.add(oooO00o);
        }
    }

    @Override // androidx.fragment.app.Oooo0
    public final void show(@NotNull FragmentManager manager, @Nullable String str) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.f58595OooO0oo = str == null ? "" : str;
        try {
            super.show(manager, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

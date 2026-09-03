package p502o0o00o0;

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
import com.weieyu.yalla.R;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p250o00oo0oO.o000;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lo0o00o0/o0000O0;", "Lcom/google/android/material/bottomsheet/OooO0O0;", "Landroid/view/ViewStub$OnInflateListener;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public abstract class o0000O0 extends OooO0O0 implements ViewStub.OnInflateListener {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final /* synthetic */ int f41562OoooO0O = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public ViewStub f41563Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public View f41564Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public TextView f41565Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public String f41566Oooo0oo = "";

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public com.google.android.material.bottomsheet.OooO00o f41567OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f41568OoooO00;

    public static final class OooO00o extends BottomSheetBehavior.OooO0OO {
        public OooO00o() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.OooO0OO
        public final void OooO0O0(@NotNull View bottomSheet) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.OooO0OO
        public final void OooO0OO(@NotNull View bottomSheet, int i) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if (i == 5) {
                com.google.android.material.bottomsheet.OooO00o oooO00o = o0000O0.this.f41567OoooO0;
                Intrinsics.checkNotNull(oooO00o);
                oooO00o.dismiss();
                o0000O0.this.OooO0O0().Oooo00O(4);
            }
            o0000O0.this.OooO0o(bottomSheet, i);
        }
    }

    @NotNull
    public final BottomSheetBehavior<FrameLayout> OooO0O0() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f41568OoooO00;
        if (bottomSheetBehavior != null) {
            return bottomSheetBehavior;
        }
        Intrinsics.throwUninitializedPropertyAccessException("behavior");
        return null;
    }

    public abstract int OooO0OO();

    @NotNull
    public final View OooO0Oo() {
        View view = this.f41564Oooo0o;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewRoot");
        return null;
    }

    public abstract void OooO0o(@NotNull View view, int i);

    public abstract void OooO0o0();

    public abstract void initData();

    @Override // com.google.android.material.bottomsheet.OooO0O0, androidx.appcompat.app.Oooo0, androidx.fragment.app.OooOo00
    @NotNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(dialogOnCreateDialog, "super.onCreateDialog(savedInstanceState)");
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
        View viewInflate = inflater.inflate(R.layout.base_bottom_sheet_fragment, viewGroup);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflater.inflate(R.layou…heet_fragment, container)");
        Intrinsics.checkNotNullParameter(viewInflate, "<set-?>");
        this.f41564Oooo0o = viewInflate;
        ViewStub viewStub = (ViewStub) OooO0Oo().findViewById(R.id.baseSheetViewStub);
        this.f41563Oooo = viewStub;
        Intrinsics.checkNotNull(viewStub);
        viewStub.setOnInflateListener(this);
        ViewStub viewStub2 = this.f41563Oooo;
        Intrinsics.checkNotNull(viewStub2);
        viewStub2.setLayoutResource(OooO0OO());
        ViewStub viewStub3 = this.f41563Oooo;
        Intrinsics.checkNotNull(viewStub3);
        viewStub3.inflate();
        ImageView imageView = (ImageView) OooO0Oo().findViewById(R.id.baseSheetDialogClose);
        Intrinsics.checkNotNull(imageView);
        imageView.setOnClickListener(new o000(this, 1));
        View viewFindViewById = OooO0Oo().findViewById(R.id.baseSheetDialogTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "viewRoot.findViewById(R.id.baseSheetDialogTitle)");
        TextView textView = (TextView) viewFindViewById;
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseSheetDialogTitle");
            textView = null;
        }
        textView.setText(this.f41566Oooo0oo);
        View viewFindViewById2 = OooO0Oo().findViewById(R.id.tvSelectNum);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "viewRoot.findViewById(R.id.tvSelectNum)");
        TextView textView2 = (TextView) viewFindViewById2;
        Intrinsics.checkNotNullParameter(textView2, "<set-?>");
        this.f41565Oooo0oO = textView2;
        OooO0o0();
        initData();
        return OooO0Oo();
    }

    @Override // androidx.fragment.app.OooOo00, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
    }

    @Override // android.view.ViewStub.OnInflateListener
    public final void onInflate(@NotNull ViewStub stub, @NotNull View inflated) {
        Intrinsics.checkNotNullParameter(stub, "stub");
        Intrinsics.checkNotNullParameter(inflated, "inflated");
    }

    @Override // androidx.fragment.app.OooOo00, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        com.google.android.material.bottomsheet.OooO00o oooO00o = (com.google.android.material.bottomsheet.OooO00o) getDialog();
        this.f41567OoooO0 = oooO00o;
        Intrinsics.checkNotNull(oooO00o);
        Window window = oooO00o.getWindow();
        Intrinsics.checkNotNull(window);
        window.setSoftInputMode(2);
        com.google.android.material.bottomsheet.OooO00o oooO00o2 = this.f41567OoooO0;
        Intrinsics.checkNotNull(oooO00o2);
        FrameLayout frameLayout = (FrameLayout) oooO00o2.OooO0oO().OooO0o0(R.id.design_bottom_sheet);
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(0);
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            CoordinatorLayout.OooO0o oooO0o = (CoordinatorLayout.OooO0o) layoutParams;
            ((ViewGroup.MarginLayoutParams) oooO0o).height = -1;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorOooOoO0 = BottomSheetBehavior.OooOoO0(frameLayout);
            Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorOooOoO0, "from(bottomSheet)");
            this.f41568OoooO00 = bottomSheetBehaviorOooOoO0;
            OooO0O0().Oooo00O(3);
            OooO0O0().Oooo000(((ViewGroup.MarginLayoutParams) oooO0o).height);
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorOooO0O0 = OooO0O0();
            OooO00o oooO00o3 = new OooO00o();
            Objects.requireNonNull(bottomSheetBehaviorOooO0O0);
            Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
            bottomSheetBehaviorOooO0O0.f16636OoooO.clear();
            bottomSheetBehaviorOooO0O0.f16636OoooO.add(oooO00o3);
        }
    }

    @Override // androidx.fragment.app.OooOo00
    public final void show(@NotNull FragmentManager manager, @Nullable String str) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.f41566Oooo0oo = str == null ? "" : str;
        try {
            super.show(manager, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.yalla.yalla.base.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Deprecated(message = "replace it later")
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0014J\b\u0010\f\u001a\u00020\bH&¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/base/fragment/LazyViewFragment;", "Lcom/yalla/yalla/base/fragment/OooO00o;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "", "onLazyInit", "onLazyCreateView", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public abstract class LazyViewFragment extends OooO00o {
    public static final int $stable = 0;

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context context = getContext();
        Intrinsics.checkNotNull(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.rootView = frameLayout;
        return frameLayout;
    }

    @NotNull
    public abstract View onLazyCreateView();

    @Override // com.yalla.yalla.base.fragment.OooO00o
    public void onLazyInit() {
        super.onLazyInit();
        View viewOnLazyCreateView = onLazyCreateView();
        View view = this.rootView;
        if (view instanceof FrameLayout) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.FrameLayout");
            ((FrameLayout) view).addView(viewOnLazyCreateView);
        }
    }
}

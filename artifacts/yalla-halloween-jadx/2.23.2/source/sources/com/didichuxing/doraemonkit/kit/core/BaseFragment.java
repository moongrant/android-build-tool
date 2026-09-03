package com.didichuxing.doraemonkit.kit.core;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.fragment.app.Fragment;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\u000eH\u0004J\b\u0010\u000f\u001a\u00020\u000eH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\tH%J\u001a\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J$\u0010\u001a\u001a\u00020\f2\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0016H\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/didichuxing/doraemonkit/kit/core/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "TAG", "", "findViewById", "T", "Landroid/view/View;", "id", "", "(I)Landroid/view/View;", "finish", "", "interceptTouchEvents", "", "onBackPressed", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onRequestLayout", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "showContent", "fragmentClass", "Ljava/lang/Class;", "bundle", "dokit-no-op_release"}, k = 1, mv = {1, 4, 2})
public abstract class BaseFragment extends Fragment {

    @JvmField
    @NotNull
    public final String TAG;

    public BaseFragment() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "this.javaClass.simpleName");
        this.TAG = simpleName;
    }

    public static /* synthetic */ void showContent$default(BaseFragment baseFragment, Class cls, Bundle bundle, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showContent");
        }
        if ((i & 2) != 0) {
            bundle = null;
        }
        baseFragment.showContent(cls, bundle);
    }

    @NotNull
    public final <T extends View> T findViewById(@IdRes int id) {
        T t = (T) new Activity().findViewById(id);
        Intrinsics.checkNotNullExpressionValue(t, "Activity().findViewById(id)");
        return t;
    }

    public final void finish() {
    }

    public final boolean interceptTouchEvents() {
        return false;
    }

    public boolean onBackPressed() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return null;
    }

    @LayoutRes
    public abstract int onRequestLayout();

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
    }

    @JvmOverloads
    public final void showContent(@NotNull Class<? extends BaseFragment> cls) {
        showContent$default(this, cls, null, 2, null);
    }

    @JvmOverloads
    public final void showContent(@NotNull Class<? extends BaseFragment> fragmentClass, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
    }
}

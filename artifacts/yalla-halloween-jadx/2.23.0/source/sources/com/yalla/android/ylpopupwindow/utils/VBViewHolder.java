package com.yalla.android.ylpopupwindow.utils;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.chad.library.adapter.base.BaseViewHolder;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p081o000OoOO.OooO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/yalla/android/ylpopupwindow/utils/VBViewHolder;", "Lo000OoOO/OooO;", "VB", "Lcom/chad/library/adapter/base/BaseViewHolder;", "viewBinding", "Lo000OoOO/OooO;", "getViewBinding", "()Lo000OoOO/OooO;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "<init>", "(Lo000OoOO/OooO;Landroid/view/View;)V", "YLPopupWindow_release"}, k = 1, mv = {1, 8, 0})
public final class VBViewHolder<VB extends OooO> extends BaseViewHolder {
    public static final int $stable = 0;

    @NotNull
    private final VB viewBinding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VBViewHolder(@NotNull VB viewBinding, @NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
        Intrinsics.checkNotNullParameter(view, "view");
        this.viewBinding = viewBinding;
    }

    @NotNull
    public final VB getViewBinding() {
        return this.viewBinding;
    }
}

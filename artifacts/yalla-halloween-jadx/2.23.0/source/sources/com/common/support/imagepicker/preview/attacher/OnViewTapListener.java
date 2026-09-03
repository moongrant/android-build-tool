package com.common.support.imagepicker.preview.attacher;

import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/common/support/imagepicker/preview/attacher/OnViewTapListener;", "", "onViewTap", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "x", "", "y", "preview_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface OnViewTapListener {
    void onViewTap(@Nullable View view, float x, float y);
}

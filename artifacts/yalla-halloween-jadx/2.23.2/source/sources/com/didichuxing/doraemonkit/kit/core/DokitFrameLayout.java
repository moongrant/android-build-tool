package com.didichuxing.doraemonkit.kit.core;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class DokitFrameLayout extends FrameLayout implements DokitViewInterface {
    public static final int DoKitFrameLayoutFlag_CHILD = 200;
    public static final int DoKitFrameLayoutFlag_ROOT = 100;

    public DokitFrameLayout(@NonNull Context context, int i) {
        super(context);
    }

    public DokitFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DokitFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

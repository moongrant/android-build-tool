package com.google.android.material.badge;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalBadgeUtils
public final class OooO00o {
    public static void OooO00o(@NonNull BadgeDrawable badgeDrawable, @NonNull View view) {
        OooO0OO(badgeDrawable, view);
        if (badgeDrawable.OooO0Oo() != null) {
            badgeDrawable.OooO0Oo().setForeground(badgeDrawable);
        } else {
            view.getOverlay().add(badgeDrawable);
        }
    }

    public static void OooO0O0(@Nullable BadgeDrawable badgeDrawable, @NonNull View view) {
        if (badgeDrawable == null) {
            return;
        }
        if (badgeDrawable.OooO0Oo() != null) {
            badgeDrawable.OooO0Oo().setForeground(null);
        } else {
            view.getOverlay().remove(badgeDrawable);
        }
    }

    public static void OooO0OO(@NonNull BadgeDrawable badgeDrawable, @NonNull View view) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.OooO0oO(view, null);
    }
}

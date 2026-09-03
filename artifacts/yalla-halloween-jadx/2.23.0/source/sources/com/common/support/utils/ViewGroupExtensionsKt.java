package com.common.support.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"inflater", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "getInflater", "(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;", "inflate", "Landroid/view/View;", "layoutRes", "", "utils_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ViewGroupExtensionsKt {
    @NotNull
    public static final LayoutInflater getInflater(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "<get-inflater>");
        return layoutInflaterFrom;
    }

    @NotNull
    public static final View inflate(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "from(context).inflate(layoutRes, this, false)");
        return viewInflate;
    }
}

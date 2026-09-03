package com.yalla.yalla.ui.fragment;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p582o0oOoOoO.y1;
import p649o0ooOOoo.cg;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0014¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/ui/fragment/RoomEventInfoFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/cg;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "", "onLazyInit", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class RoomEventInfoFragment extends p503o0o00o00.OooO<cg> {
    public static final int $stable = 0;

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        ComposeView composeView = getBinding().f49108OooO0O0;
        y1 y1Var = y1.f46916OooO00o;
        composeView.setContent(y1.f46918OooO0OO);
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public cg getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        cg cgVarInflate = cg.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(cgVarInflate, "inflate(inflater, container, false)");
        return cgVarInflate;
    }
}

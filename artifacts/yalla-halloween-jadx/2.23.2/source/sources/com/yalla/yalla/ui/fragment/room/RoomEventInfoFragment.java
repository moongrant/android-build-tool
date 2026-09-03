package com.yalla.yalla.ui.fragment.room;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p193o00o0O0O.o0000oo;
import p405o0Oo0OOO.g0;
import p527o0o0OO0o.o000O;
import p530o0o0OOOO.o0O000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0014¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/ui/fragment/room/RoomEventInfoFragment;", "Lo0o0OO0o/o000O;", "Lo0Oo0OOO/g0;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "", "onLazyInit", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class RoomEventInfoFragment extends o000O<g0> {
    public static final int $stable = 0;

    @Override // p586o0oOooO0.oO0Oo0o0
    public void onLazyInit() {
        super.onLazyInit();
        ComposeView composeView = getBinding().f43871OooO0O0;
        Intrinsics.checkNotNullExpressionValue(composeView, "composeView");
        o0000oo.OooO0Oo(composeView, o0O000O.f53390OooO00o);
    }

    @Override // p527o0o0OO0o.o000O
    @NotNull
    public g0 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        g0 g0VarInflate = g0.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(g0VarInflate, "inflate(...)");
        return g0VarInflate;
    }
}

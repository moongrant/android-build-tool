package com.yalla.yalla.ui.fragment.room;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147o00Oo0Oo.o000OOo;
import p524o0o0OO0o.o00OOOOo;
import p641o0ooOOOO.s8;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0014¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/ui/fragment/room/RoomEventInfoFragment;", "Lo0o0O/OooOO0O;", "Lo0ooOOOO/s8;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "", "onLazyInit", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class RoomEventInfoFragment extends p508o0o0O.OooOO0O<s8> {
    public static final int $stable = 0;

    @Override // p401o0Oo0OO0.o00O0O
    public void onLazyInit() {
        super.onLazyInit();
        ComposeView composeView = getBinding().f58807OooO0O0;
        Intrinsics.checkNotNullExpressionValue(composeView, "binding.composeView");
        o000OOo.OooO0Oo(composeView, o00OOOOo.f53461OooO00o);
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public s8 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        s8 s8VarInflate = s8.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(s8VarInflate, "inflate(inflater, container, false)");
        return s8VarInflate;
    }
}

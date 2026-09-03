package com.yalla.yalla.ui.fragment.mainroom;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p403o0Oo0OOo.oO0O0OoO;
import p418o0OoO000.OooOo;
import p464o0Oooo.o000000O;
import p486o0o00O00.o000000;
import p500o0o00oO.o00000;
import p508o0o0O.OooOO0O;
import p579o0oOoo.oO0OOO00;
import p581o0oOoo00.o000OOo;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.n4;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0014J\b\u0010\f\u001a\u00020\u0003H\u0016J\u0006\u0010\r\u001a\u00020\u0003J\u0014\u0010\u0010\u001a\u00020\u00032\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomMineRecentlyFragment;", "Lo0o0O/OooOO0O;", "Lo0ooOOOO/n4;", "", "initView", "load", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "onResume", "scrollToTop", "Lo0OoO000/OooOo;", "msg", "onEventMainThread", "Lo0o00oO/o00000;", "relatedAdapter", "Lo0o00oO/o00000;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class MainRoomMineRecentlyFragment extends OooOO0O<n4> {
    public static final int $stable = 8;

    @Nullable
    private o00000 relatedAdapter;

    private final void initView() {
        getBinding().f58450OooO0OO.setOnRefreshListener(new o000000(this));
        o00000 o00000Var = new o00000(getActivity());
        this.relatedAdapter = o00000Var;
        o00000Var.f49421OooOoo0 = EnterRoomParentPage.Related_Rencently;
        o00000Var.OooOooo(oOo00OO0.ic_empty_room);
        o00000 o00000Var2 = this.relatedAdapter;
        if (o00000Var2 != null) {
            o00000Var2.Oooo000(oO00OOo0.no_data);
        }
        getBinding().f58449OooO0O0.setLayoutManager(new FixLinearLayoutManager(getContext()));
        getBinding().f58449OooO0O0.setAdapter(this.relatedAdapter);
        oO0OOO00 oo0ooo00 = oO0OOO00.f56606OooO00o;
        RecyclerView recyclerView = getBinding().f58449OooO0O0;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.rvMainRelated");
        oO0OOO00.OooO0O0(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(MainRoomMineRecentlyFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.load();
    }

    private final void load() {
        oO0O0OoO oo0o0oooOooOoOO = o000OOo.OooO00o().OooOoOO();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        ArrayList arrayListOooO00o = oo0o0oooOooOoOO.OooO00o(String.valueOf(o000000O.OooOOo0().getValue()));
        o00000 o00000Var = this.relatedAdapter;
        if (o00000Var != null) {
            o00000Var.OooOoO0(arrayListOooO00o);
        }
        o00000 o00000Var2 = this.relatedAdapter;
        if (o00000Var2 != null) {
            o00000Var2.Oooo00o();
        }
        getBinding().f58450OooO0OO.OooOooo(true, true, true);
    }

    @Override // p508o0o0O.OooOO0O, p418o0OoO000.Oooo000
    public void onEventMainThread(@NotNull OooOo<?> msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        super.onEventMainThread(msg);
        if (msg.f45532OooO00o == 583 && getIsLazyInit()) {
            load();
        }
    }

    @Override // p401o0Oo0OO0.o00O0O
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        load();
    }

    @Override // p508o0o0O.OooOO0O, p401o0Oo0OO0.o00O0O, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        o0OO000.OooO00o("201006");
    }

    public final void scrollToTop() {
        getBinding().f58449OooO0O0.scrollToPosition(0);
        getBinding().f58450OooO0OO.OooOoOO();
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public n4 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        n4 n4VarInflate = n4.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(n4VarInflate, "inflate(inflater, container, false)");
        return n4VarInflate;
    }
}

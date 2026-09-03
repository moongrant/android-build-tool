package com.yalla.yalla.ui.fragment.mainroom;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.session.o000OO;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.oO00OOOo;
import p407o0Oo0Oo.o0O00OOO;
import p408o0Oo0Oo0.o00Oo0;
import p475o0Ooooo0.o0O00oO0;
import p507o0o00oo.o00oO0o;
import p527o0o0OO0o.o000O;
import p545o0oO0O00.OooOOO;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p590o0oOooo0.oo000000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0014J\b\u0010\f\u001a\u00020\u0003H\u0016J\u0006\u0010\r\u001a\u00020\u0003J\u0014\u0010\u0010\u001a\u00020\u00032\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomMineRecentlyFragment;", "Lo0o0OO0o/o000O;", "Lo0Oo0OOO/oO00OOOo;", "", "initView", "load", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "onResume", "scrollToTop", "Lo0oO0O00/OooOOO;", "msg", "onEventMainThread", "Lo0o00oo/o00oO0o;", "relatedAdapter", "Lo0o00oo/o00oO0o;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class MainRoomMineRecentlyFragment extends o000O<oO00OOOo> {
    public static final int $stable = 8;

    @Nullable
    private o00oO0o relatedAdapter;

    private final void initView() {
        getBinding().f44812OooO0OO.setOnRefreshListener(new o000OO(this, 3));
        o00oO0o o00oo0o2 = new o00oO0o(getActivity());
        this.relatedAdapter = o00oo0o2;
        o00oo0o2.f50617OooOoo0 = EnterRoomParentPage.Related_Rencently;
        o00oo0o2.OooOooo(o0Oo0oo.ic_empty_room);
        o00oO0o o00oo0o3 = this.relatedAdapter;
        if (o00oo0o3 != null) {
            o00oo0o3.Oooo000(o000000.no_data);
        }
        getBinding().f44811OooO0O0.setLayoutManager(new FixLinearLayoutManager(getContext()));
        getBinding().f44811OooO0O0.setAdapter(this.relatedAdapter);
        oo000000 oo000000Var = oo000000.f57240OooO00o;
        RecyclerView rvMainRelated = getBinding().f44811OooO0O0;
        Intrinsics.checkNotNullExpressionValue(rvMainRelated, "rvMainRelated");
        oo000000.OooO0O0(rvMainRelated);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(MainRoomMineRecentlyFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.load();
    }

    private final void load() {
        o0O00OOO o0o00oooOooOoo0 = o00Oo0.OooO00o().OooOoo0();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        ArrayList arrayListOooO00o = o0o00oooOooOoo0.OooO00o(String.valueOf(o0O00oO0.OooOOo0().getValue()));
        o00oO0o o00oo0o2 = this.relatedAdapter;
        if (o00oo0o2 != null) {
            o00oo0o2.OooOoO0(arrayListOooO00o);
        }
        o00oO0o o00oo0o3 = this.relatedAdapter;
        if (o00oo0o3 != null) {
            o00oo0o3.Oooo00o();
        }
        getBinding().f44812OooO0OO.OooOooo(true, true, true);
    }

    @Override // p527o0o0OO0o.o000O, p545o0oO0O00.OooOOOO
    public void onEventMainThread(@NotNull OooOOO<?> msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        super.onEventMainThread(msg);
        if (msg.f55758OooO00o == 583 && getIsLazyInit()) {
            load();
        }
    }

    @Override // p586o0oOooO0.oO0Oo0o0
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        load();
    }

    @Override // p527o0o0OO0o.o000O, p586o0oOooO0.oO0Oo0o0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        o0oo0000.OooO00o.OooO0O0("201006");
    }

    public final void scrollToTop() {
        getBinding().f44811OooO0O0.scrollToPosition(0);
        getBinding().f44812OooO0OO.OooOoOO();
    }

    @Override // p527o0o0OO0o.o000O
    @NotNull
    public oO00OOOo getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        oO00OOOo oo00ooooInflate = oO00OOOo.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(oo00ooooInflate, "inflate(...)");
        return oo00ooooInflate;
    }
}

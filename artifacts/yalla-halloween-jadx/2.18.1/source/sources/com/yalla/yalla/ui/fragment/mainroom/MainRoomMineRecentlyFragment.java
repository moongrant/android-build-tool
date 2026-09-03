package com.yalla.yalla.ui.fragment.mainroom;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.data.db.model.RoomHistory;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooo.oo0O;
import p391o0OOooOo.o0O00000;
import p498o0o00Oo0.OooOOO;
import p617o0oo0o.o00000OO;
import p649o0ooOOoo.gb;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0014J\b\u0010\f\u001a\u00020\u0003H\u0016J\u0006\u0010\r\u001a\u00020\u0003J\u0014\u0010\u0010\u001a\u00020\u00032\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomMineRecentlyFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/gb;", "", "initView", "load", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "onResume", "scrollToTop", "Lo00OOOoO/OooO0OO;", "msg", "onEventMainThread", "", "umengTag", "Ljava/lang/String;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MainRoomMineRecentlyFragment extends p503o0o00o00.OooO<gb> {
    public static final int $stable = 8;

    @Nullable
    private o00OO0.OooOO0 relatedAdapter;

    @NotNull
    private final String umengTag = "Room_related_recently";

    private final void initView() {
        getBinding().f49449OooO0OO.setOnRefreshListener(new oo0O(this, 5));
        o00OO0.OooOO0 oooOO1 = new o00OO0.OooOO0(getActivity());
        this.relatedAdapter = oooOO1;
        oooOO1.f31181OooO00o = EnterRoomParentPage.Related_Rencently;
        oooOO1.setEmptyImageRes(R.drawable.ic_empty_room);
        o00OO0.OooOO0 oooOO2 = this.relatedAdapter;
        if (oooOO2 != null) {
            oooOO2.setEmptyText(R.string.no_data);
        }
        getBinding().f49448OooO0O0.setLayoutManager(new FixLinearLayoutManager(getContext()));
        getBinding().f49448OooO0O0.setAdapter(this.relatedAdapter);
        o00000OO o00000oo2 = o00000OO.f48476OooO00o;
        RecyclerView recyclerView = getBinding().f49448OooO0O0;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.rvMainRelated");
        o00000OO.OooO00o(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-0, reason: not valid java name */
    public static final void m475initView$lambda0(MainRoomMineRecentlyFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.load();
    }

    private final void load() {
        List<RoomHistory> listOooO00o = p491o0o00O00.OooO0OO.OooO00o().OooOoo().OooO00o(String.valueOf(OooOOO.f41216OooO00o.OooOo().getValue()));
        o00OO0.OooOO0 oooOO1 = this.relatedAdapter;
        if (oooOO1 != null) {
            oooOO1.setNewData(listOooO00o);
        }
        o00OO0.OooOO0 oooOO2 = this.relatedAdapter;
        if (oooOO2 != null) {
            oooOO2.setLoadComplete();
        }
        getBinding().f49449OooO0OO.Oooo0o0(true, true, true);
    }

    @Override // p503o0o00o00.OooO, p140o00OOOoO.OooO0o
    public void onEventMainThread(@NotNull p140o00OOOoO.OooO0OO<?> msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        super.onEventMainThread(msg);
        if (msg.f31885OooO00o == 583 && getIsLazyInit()) {
            load();
        }
    }

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        load();
    }

    @Override // p503o0o00o00.OooO, p462o0Ooo0o.o0000, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        o0O00000.OooO0OO(this.umengTag);
    }

    public final void scrollToTop() {
        getBinding().f49448OooO0O0.scrollToPosition(0);
        getBinding().f49449OooO0OO.Oooo00o();
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public gb getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        gb gbVarInflate = gb.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(gbVarInflate, "inflate(inflater, container, false)");
        return gbVarInflate;
    }
}

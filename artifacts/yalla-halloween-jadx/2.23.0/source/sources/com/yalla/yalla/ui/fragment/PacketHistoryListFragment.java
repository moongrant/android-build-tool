package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.data.constant.LucklyPacket$Action;
import com.yalla.yalla.data.constant.LucklyPacket$Type;
import com.yalla.yalla.model.PacketHistoryItemModel;
import com.yalla.yalla.model.PacketHistoryModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.ui.vm.room.PacketHistoryVM;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p466o0Oooo0o.oo00o;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.d7;
import p641o0ooOOOO.f7;
import p641o0ooOOOO.r8;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b'\u0010(J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0014R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/yalla/yalla/ui/fragment/PacketHistoryListFragment;", "Lo0o0O/OooOO0O;", "Lo0ooOOOO/r8;", "", "initView", "", "refresh", "loadData", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "Lcom/yalla/yalla/ui/vm/room/PacketHistoryVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/room/PacketHistoryVM;", "vm", "Lcom/yalla/yalla/data/constant/LucklyPacket$Type;", "packetType", "Lcom/yalla/yalla/data/constant/LucklyPacket$Type;", "Lcom/yalla/yalla/data/constant/LucklyPacket$Action;", "listType", "Lcom/yalla/yalla/data/constant/LucklyPacket$Action;", "Lo0oOo0OO/o000O;", "Lcom/yalla/yalla/model/PacketHistoryItemModel;", "adapter", "Lo0oOo0OO/o000O;", "Lo0ooOOOO/d7;", "header", "Lo0ooOOOO/d7;", "Lo0ooOOOO/f7;", "footer", "Lo0ooOOOO/f7;", "<init>", "()V", "Companion", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPacketHistoryListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PacketHistoryListFragment.kt\ncom/yalla/yalla/ui/fragment/PacketHistoryListFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,155:1\n106#2,15:156\n*S KotlinDebug\n*F\n+ 1 PacketHistoryListFragment.kt\ncom/yalla/yalla/ui/fragment/PacketHistoryListFragment\n*L\n49#1:156,15\n*E\n"})
public final class PacketHistoryListFragment extends p508o0o0O.OooOO0O<r8> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final String ListType = "list_type";

    @NotNull
    private static final String PacketType = "packet_type";
    private p564o0oOo0OO.o000O<PacketHistoryItemModel> adapter;
    private f7 footer;
    private d7 header;

    @NotNull
    private LucklyPacket$Action listType;

    @NotNull
    private LucklyPacket$Type packetType;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    public static final class OooO extends Lambda implements Function1<ApiResult<PacketHistoryModel>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f28242OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(boolean z) {
            super(1);
            this.f28242OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<PacketHistoryModel> apiResult) {
            ApiResult<PacketHistoryModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            PacketHistoryListFragment packetHistoryListFragment = PacketHistoryListFragment.this;
            XRefreshLayout xRefreshLayout = packetHistoryListFragment.getBinding().f58757OooO0Oo;
            boolean zIsSuccess = it.isSuccess();
            PacketHistoryModel data = it.getData();
            p564o0oOo0OO.o000O o000o = null;
            List<PacketHistoryItemModel> data2 = data != null ? data.getData() : null;
            xRefreshLayout.OooOooo(this.f28242OooO0o0, zIsSuccess, data2 == null || data2.isEmpty());
            p564o0oOo0OO.o000O o000o2 = packetHistoryListFragment.adapter;
            if (o000o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                o000o = o000o2;
            }
            o000o.Oooo0O0(it.isSuccess());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.PacketHistoryListFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
        @NotNull
        public static PacketHistoryListFragment OooO00o(@NotNull LucklyPacket$Type packetType, @NotNull LucklyPacket$Action listType) {
            Intrinsics.checkNotNullParameter(packetType, "packetType");
            Intrinsics.checkNotNullParameter(listType, "listType");
            PacketHistoryListFragment packetHistoryListFragment = new PacketHistoryListFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(PacketHistoryListFragment.PacketType, packetType.getValue());
            bundle.putInt(PacketHistoryListFragment.ListType, listType.getValue());
            packetHistoryListFragment.setArguments(bundle);
            return packetHistoryListFragment;
        }
    }

    public static final class OooO0O0 extends p564o0oOo0OO.o000O<PacketHistoryItemModel> {
        public OooO0O0(Context context, int i) {
            super(context, i);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            StringBuilder sb;
            ViewHolder viewHolder = (ViewHolder) baseViewHolder;
            PacketHistoryItemModel packetHistoryItemModel = (PacketHistoryItemModel) obj;
            if (packetHistoryItemModel == null || viewHolder == null) {
                return;
            }
            int i = oO00O0oO.name;
            viewHolder.setText(i, packetHistoryItemModel.getNickName());
            viewHolder.setText(oO00O0oO.time, p601o0oo0O0.o0000oo.OooO0Oo(packetHistoryItemModel.getSendtime(), System.currentTimeMillis()));
            viewHolder.setGone(oO00O0oO.head, false);
            PacketHistoryListFragment packetHistoryListFragment = PacketHistoryListFragment.this;
            if (packetHistoryListFragment.packetType == LucklyPacket$Type.Gift) {
                int i2 = oO00O0oO.number;
                if (p591o0oo000O.OooO.OooO0o0()) {
                    int giftNum = packetHistoryItemModel.getGiftNum();
                    sb = new StringBuilder();
                    sb.append(giftNum);
                    sb.append("x");
                } else {
                    int giftNum2 = packetHistoryItemModel.getGiftNum();
                    sb = new StringBuilder("x");
                    sb.append(giftNum2);
                }
                viewHolder.setText(i2, sb.toString());
                o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this.f56196OooOo);
                oooO00o.f43911OooO0OO = packetHistoryItemModel.getGiftUrl();
                oooO00o.f43909OooO00o = 0;
                oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0O0());
                oooO00o.OooO0Oo((ImageView) viewHolder.getView(oO00O0oO.pic));
            } else {
                viewHolder.setText(oO00O0oO.number, packetHistoryItemModel.getAmount());
                viewHolder.setImageResource(oO00O0oO.pic, oOo00OO0.coin28_stroke);
            }
            if (packetHistoryListFragment.listType != LucklyPacket$Action.Send) {
                viewHolder.setText(i, packetHistoryItemModel.getNickName());
                viewHolder.setVisible(oO00O0oO.tvPacket, false);
                return;
            }
            p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
            viewHolder.setText(i, (CharSequence) p464o0Oooo.o000000O.OooOOoo().getValue());
            int i3 = oO00O0oO.tvPacket;
            viewHolder.setVisible(i3, true);
            viewHolder.setText(i3, packetHistoryItemModel.getGetnum() + com.code.android.util.o0000.OooO0OO(oO00OOo0.packets));
            viewHolder.setTextColor(i3, com.code.android.util.o0000.OooO00o(oO00O0o.color_999999));
        }
    }

    public static final class OooO0OO extends oo00o {
        public OooO0OO() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@Nullable View view) {
            PacketHistoryListFragment packetHistoryListFragment = PacketHistoryListFragment.this;
            p564o0oOo0OO.o000O o000o = packetHistoryListFragment.adapter;
            if (o000o == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o000o = null;
            }
            o000o.Oooo00O(true);
            packetHistoryListFragment.loadData(true);
        }
    }

    public static final class OooO0o extends Lambda implements Function1<PacketHistoryModel, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f28246OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z) {
            super(1);
            this.f28246OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PacketHistoryModel packetHistoryModel) {
            PacketHistoryModel packetHistoryModel2 = packetHistoryModel;
            PacketHistoryListFragment packetHistoryListFragment = PacketHistoryListFragment.this;
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(packetHistoryListFragment.getContext());
            Intrinsics.checkNotNull(packetHistoryModel2);
            oooO00o.f43911OooO0OO = packetHistoryModel2.getHeadhrl();
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
            d7 d7Var = packetHistoryListFragment.header;
            p564o0oOo0OO.o000O o000o = null;
            d7 d7Var2 = null;
            d7 d7Var3 = null;
            if (d7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("header");
                d7Var = null;
            }
            oooO00o.OooO0Oo(d7Var.f57735OooO0O0);
            d7 d7Var4 = packetHistoryListFragment.header;
            if (d7Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("header");
                d7Var4 = null;
            }
            d7Var4.f57737OooO0Oo.setText(String.valueOf(packetHistoryModel2.getAmountsum()));
            packetHistoryListFragment.getBinding().f58756OooO0OO.setText(packetHistoryListFragment.listType == LucklyPacket$Action.Receive ? com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.Lucky_Bag_Received_Total), String.valueOf(packetHistoryModel2.getRedsum())) : com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.Lucky_Bag_Send_Total), String.valueOf(packetHistoryModel2.getRedsum())));
            if (this.f28246OooO0o0) {
                p564o0oOo0OO.o000O o000o2 = packetHistoryListFragment.adapter;
                if (o000o2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    o000o2 = null;
                }
                o000o2.OooOoO0(packetHistoryModel2.getData());
                if (!packetHistoryModel2.getData().isEmpty()) {
                    d7 d7Var5 = packetHistoryListFragment.header;
                    if (d7Var5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("header");
                    } else {
                        d7Var2 = d7Var5;
                    }
                    ConstraintLayout constraintLayout = d7Var2.f57734OooO00o;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "header.root");
                    com.code.android.util.o000OO00.OooOOOO(constraintLayout);
                    AppCompatTextView appCompatTextView = packetHistoryListFragment.getBinding().f58756OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.tvTotally");
                    com.code.android.util.o000OO00.OooOOOO(appCompatTextView);
                } else {
                    d7 d7Var6 = packetHistoryListFragment.header;
                    if (d7Var6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("header");
                    } else {
                        d7Var3 = d7Var6;
                    }
                    ConstraintLayout constraintLayout2 = d7Var3.f57734OooO00o;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout2, "header.root");
                    com.code.android.util.o000OO00.OooO0O0(constraintLayout2);
                    AppCompatTextView appCompatTextView2 = packetHistoryListFragment.getBinding().f58756OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "binding.tvTotally");
                    com.code.android.util.o000OO00.OooO0O0(appCompatTextView2);
                }
            } else {
                p564o0oOo0OO.o000O o000o3 = packetHistoryListFragment.adapter;
                if (o000o3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    o000o = o000o3;
                }
                o000o.OooO0O0(packetHistoryModel2.getData());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.yalla.yalla.ui.fragment.PacketHistoryListFragment$special$$inlined$viewModels$default$1] */
    public PacketHistoryListFragment() {
        final ?? r0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.PacketHistoryListFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.PacketHistoryListFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) r0.invoke();
            }
        });
        this.vm = androidx.fragment.app.o000O0o.OooO0O0(this, Reflection.getOrCreateKotlinClass(PacketHistoryVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.PacketHistoryListFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return androidx.fragment.app.o000O0o.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.PacketHistoryListFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f28250OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f28250OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000O0o.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.PacketHistoryListFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000O0o.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.packetType = LucklyPacket$Type.Gift;
        this.listType = LucklyPacket$Action.Receive;
    }

    private final PacketHistoryVM getVm() {
        return (PacketHistoryVM) this.vm.getValue();
    }

    private final void initView() {
        getBinding().f58757OooO0Oo.setOnRefreshListener(new p496o0o00o.o000O0O0(this, 1));
        getBinding().f58757OooO0Oo.setOnLoadMoreListener(new p562o0oOo0O.o000oOoO() { // from class: com.yalla.yalla.ui.fragment.o0000O00
            @Override // p562o0oOo0O.o000oOoO
            public final void OooO0O0() {
                PacketHistoryListFragment.initView$lambda$1(this.f28900OooO0Oo);
            }
        });
        this.adapter = new OooO0O0(getContext(), oO00OO0O.room_activity_lucky_packet_detail_item_layout);
        d7 d7VarInflate = d7.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(d7VarInflate, "inflate(layoutInflater)");
        this.header = d7VarInflate;
        p564o0oOo0OO.o000O<PacketHistoryItemModel> o000o = null;
        if (d7VarInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("header");
            d7VarInflate = null;
        }
        ConstraintLayout constraintLayout = d7VarInflate.f57734OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "header.root");
        com.code.android.util.o000OO00.OooO0O0(constraintLayout);
        if (this.listType == LucklyPacket$Action.Receive) {
            d7 d7Var = this.header;
            if (d7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("header");
                d7Var = null;
            }
            d7Var.f57736OooO0OO.setText(oO00OOo0.Lucky_Bag_Received_lastMonth);
        } else {
            d7 d7Var2 = this.header;
            if (d7Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("header");
                d7Var2 = null;
            }
            d7Var2.f57736OooO0OO.setText(oO00OOo0.Lucky_Bag_Send_lastMonth);
        }
        p564o0oOo0OO.o000O<PacketHistoryItemModel> o000o2 = this.adapter;
        if (o000o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o000o2 = null;
        }
        o000o2.Oooo0OO(new OooO0OO());
        p564o0oOo0OO.o000O<PacketHistoryItemModel> o000o3 = this.adapter;
        if (o000o3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o000o3 = null;
        }
        d7 d7Var3 = this.header;
        if (d7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("header");
            d7Var3 = null;
        }
        o000o3.OooOo(d7Var3.f57734OooO00o);
        p564o0oOo0OO.o000O<PacketHistoryItemModel> o000o4 = this.adapter;
        if (o000o4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o000o4 = null;
        }
        o000o4.OooOooo(oOo00OO0.ic_empty_message_system);
        getBinding().f58755OooO0O0.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerView = getBinding().f58755OooO0O0;
        p564o0oOo0OO.o000O<PacketHistoryItemModel> o000o5 = this.adapter;
        if (o000o5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            o000o = o000o5;
        }
        recyclerView.setAdapter(o000o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(PacketHistoryListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadData(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(PacketHistoryListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadData(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadData(boolean refresh) {
        getVm().loadPacketHistory(refresh, this.packetType, this.listType).observe(getViewLifecycleOwner(), new p377o0OOoOo.o0000OO0(new OooO0o(refresh), null, new OooO(refresh), false, 10));
    }

    @Override // p508o0o0O.OooOO0O, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        LucklyPacket$Action lucklyPacket$Action;
        super.onCreate(savedInstanceState);
        LucklyPacket$Type.Companion companion = LucklyPacket$Type.INSTANCE;
        Bundle arguments = getArguments();
        int i = arguments != null ? arguments.getInt(PacketType) : LucklyPacket$Type.Gift.getValue();
        companion.getClass();
        this.packetType = LucklyPacket$Type.Companion.OooO00o(i);
        LucklyPacket$Action.Companion companion2 = LucklyPacket$Action.INSTANCE;
        Bundle arguments2 = getArguments();
        int i2 = arguments2 != null ? arguments2.getInt(ListType) : LucklyPacket$Action.Receive.getValue();
        companion2.getClass();
        LucklyPacket$Action[] lucklyPacket$ActionArrValues = LucklyPacket$Action.values();
        int length = lucklyPacket$ActionArrValues.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                lucklyPacket$Action = null;
                break;
            }
            lucklyPacket$Action = lucklyPacket$ActionArrValues[i3];
            if (lucklyPacket$Action.getValue() == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (lucklyPacket$Action == null) {
            lucklyPacket$Action = LucklyPacket$Action.Receive;
        }
        this.listType = lucklyPacket$Action;
    }

    @Override // p401o0Oo0OO0.o00O0O
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        loadData(true);
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public r8 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        r8 r8VarInflate = r8.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(r8VarInflate, "inflate(inflater, container, false)");
        return r8VarInflate;
    }
}

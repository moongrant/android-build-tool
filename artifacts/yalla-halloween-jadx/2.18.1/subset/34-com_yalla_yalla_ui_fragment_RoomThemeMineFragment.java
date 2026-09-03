package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.model.MyThemeListModel;
import com.yalla.yalla.model.ThemeModel;
import com.yalla.yalla.ui.activity.room.RoomThemeMineActivity;
import com.yalla.yalla.ui.view.ThemeLayout;
import com.yalla.yalla.ui.vm.store.ThemeStoreVM;
import java.util.ArrayList;
import java.util.Iterator;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p176o00OoooO.oO00o000;
import p530o0o0OOO.o00OO00O;
import p649o0ooOOoo.eg;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0014R\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/yalla/yalla/ui/fragment/RoomThemeMineFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/eg;", "", "initView", "loadData", "", "Lcom/yalla/yalla/model/ThemeModel;", "themeModelList", "addDefaultTheme", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "Lcom/yalla/yalla/ui/vm/store/ThemeStoreVM;", "storeVm$delegate", "Lkotlin/Lazy;", "getStoreVm", "()Lcom/yalla/yalla/ui/vm/store/ThemeStoreVM;", "storeVm", "", "currentThemeId", "J", "Lcom/yalla/yalla/ui/activity/room/RoomThemeMineActivity;", "getActivity", "()Lcom/yalla/yalla/ui/activity/room/RoomThemeMineActivity;", "activity", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class RoomThemeMineFragment extends p503o0o00o00.OooO<eg> {
    public static final int $stable = 8;
    private long currentThemeId;

    @Nullable
    private p188o00o00o0.OooO0OO<ThemeModel> mAdapter;

    /* JADX INFO: renamed from: storeVm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy storeVm;

    public static final class OooO00o extends p188o00o00o0.OooO0OO<ThemeModel> {
        public OooO00o(Context context) {
            super(context, R.layout.room_item_theme_mine);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            RoomThemeMineActivity activity;
            p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
            ThemeModel item = (ThemeModel) obj;
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            View viewOooO0Oo = helper.OooO0Oo(R.id.tlTheme);
            RoomThemeMineFragment roomThemeMineFragment = RoomThemeMineFragment.this;
            ThemeLayout themeLayout = (ThemeLayout) viewOooO0Oo;
            themeLayout.OooO00o(item);
            themeLayout.OooO0O0(item, new o000Oo0(roomThemeMineFragment, item));
            Intrinsics.checkNotNullExpressionValue(themeLayout, "");
            ThemeLayout.OooO0OO(themeLayout, item, false, null, null, 26);
            themeLayout.setSelectTheme(item.getShopId() == roomThemeMineFragment.currentThemeId);
            if (item.getShopId() != roomThemeMineFragment.currentThemeId || (activity = roomThemeMineFragment.getActivity()) == null) {
                return;
            }
            activity.f22999OooooOo = RoomThemeMineActivity.ThemeType.Mine;
        }
    }

    public static final class OooO0O0 extends p654o0ooo.o00Oo0 {
        public OooO0O0() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@Nullable View view) {
            RoomThemeMineFragment.this.loadData();
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<MyThemeListModel, Unit> {
        public OooO0OO() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0032  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MyThemeListModel myThemeListModel) {
            p188o00o00o0.OooO0OO oooO0OO;
            ArrayList<ThemeModel> data;
            MyThemeListModel myThemeListModel2 = myThemeListModel;
            RoomThemeMineFragment.this.currentThemeId = myThemeListModel2 != null ? myThemeListModel2.getCurrentThemeId() : 0L;
            p188o00o00o0.OooO0OO oooO0OO2 = RoomThemeMineFragment.this.mAdapter;
            if (oooO0OO2 != null) {
                RoomThemeMineFragment roomThemeMineFragment = RoomThemeMineFragment.this;
                if (myThemeListModel2 != null && (data = myThemeListModel2.getData()) != null) {
                    oooO0OO2.setNewData(roomThemeMineFragment.addDefaultTheme(data));
                    oooO0OO = RoomThemeMineFragment.this.mAdapter;
                    if (oooO0OO != null) {
                        oooO0OO.setLoadComplete();
                    }
                }
            } else {
                oooO0OO = RoomThemeMineFragment.this.mAdapter;
                if (oooO0OO != null) {
                    oooO0OO.setLoadComplete();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<ApiError, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            p188o00o00o0.OooO0OO oooO0OO = RoomThemeMineFragment.this.mAdapter;
            if (oooO0OO != null) {
                oooO0OO.loadError();
            }
            return Unit.INSTANCE;
        }
    }

    public RoomThemeMineFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.RoomThemeMineFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.RoomThemeMineFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        this.storeVm = androidx.fragment.app.o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(ThemeStoreVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.RoomThemeMineFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o00OO0O.OooOO0.OooO00o(lazy, "owner.viewModelStore");
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.RoomThemeMineFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f24219Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = this.f24219Oooo0o;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.RoomThemeMineFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.currentThemeId = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ThemeModel> addDefaultTheme(List<ThemeModel> themeModelList) {
        Iterator<ThemeModel> it = themeModelList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().getIsSelected()) {
                z = true;
            }
        }
        ThemeModel themeModel = new ThemeModel();
        String string = getString(R.string.Yalla_1);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.Yalla_1)");
        ThemeModel defaultDrawable = themeModel.setDefaultDrawable(true, string);
        if (!z) {
            defaultDrawable.setSelected(true);
        }
        themeModelList.add(0, defaultDrawable);
        return themeModelList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RoomThemeMineActivity getActivity() {
        if (!(getContext() instanceof RoomThemeMineActivity)) {
            return null;
        }
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.room.RoomThemeMineActivity");
        return (RoomThemeMineActivity) context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ThemeStoreVM getStoreVm() {
        return (ThemeStoreVM) this.storeVm.getValue();
    }

    private final void initView() {
        LiveEventBus.get("ROOM_THEME_UPDATE").observe(this, new oO00o000(this, 7));
        OooO00o oooO00o = new OooO00o(getContext());
        this.mAdapter = oooO00o;
        oooO00o.setLoadErrorClickListener(new OooO0O0());
        p188o00o00o0.OooO0OO<ThemeModel> oooO0OO = this.mAdapter;
        if (oooO0OO != null) {
            oooO0OO.setEmptyImageRes(R.drawable.ic_empty_message_system);
        }
        p188o00o00o0.OooO0OO<ThemeModel> oooO0OO2 = this.mAdapter;
        if (oooO0OO2 != null) {
            oooO0OO2.setEmptyText(R.string.no_data);
        }
        getBinding().f49275OooO0O0.setLayoutManager(new GridLayoutManager(getContext(), 2));
        getBinding().f49275OooO0O0.setAdapter(this.mAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-0, reason: not valid java name */
    public static final void m397initView$lambda0(RoomThemeMineFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadData() {
        Integer value = o00OO00O.f43313OooooOo.OooO00o().f43321OooO0o0.getValue();
        if (value == null) {
            return;
        }
        getStoreVm().getThemeMineListData(value.intValue(), 2).observe(this, new o0o0000.OooOo(new OooO0OO(), new OooO0o(), null, false, 12));
    }

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        loadData();
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public eg getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        eg egVarInflate = eg.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(egVarInflate, "inflate(inflater, container, false)");
        return egVarInflate;
    }
}

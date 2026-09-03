package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.model.BadgeNews;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.view.materialdesign.FixGridLayoutManager;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p609o0oo0O0o.o00O000;
import p609o0oo0O0o.o00oOoo;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.gi;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002!\"B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0014R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u001c¨\u0006#"}, d2 = {"Lcom/yalla/yalla/ui/fragment/BadgeNewsFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/gi;", "", "initView", "initData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onLazyInit", "", "type", "I", "Lo0oo0O0o/o00O000;", "mVm$delegate", "Lkotlin/Lazy;", "getMVm", "()Lo0oo0O0o/o00O000;", "mVm", "footer$delegate", "getFooter", "()Landroid/view/View;", "footer", "<init>", "()V", "Companion", "OooO00o", BadgeNewsFragment.MEDAL_TYPE, "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class BadgeNewsFragment extends p503o0o00o00.OooO<gi> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final String MEDAL_TYPE = "MedalType";

    /* JADX INFO: renamed from: footer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy footer;
    private p188o00o00o0.OooO0OO<BadgeNews> mAdapter;

    /* JADX INFO: renamed from: mVm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mVm;
    private int type = MedalType.GoldMedal.getValue();

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yalla/yalla/ui/fragment/BadgeNewsFragment$MedalType;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "setValue", "(I)V", "NotMedal", "BronzeMedal", "SilverMedal", "GoldMedal", "DiamondMedal", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
    public enum MedalType {
        NotMedal(0),
        BronzeMedal(1),
        SilverMedal(2),
        GoldMedal(3),
        DiamondMedal(4);

        private int value;

        MedalType(int i) {
            this.value = i;
        }

        /* JADX INFO: renamed from: OooO00o, reason: from getter */
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.BadgeNewsFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
        @NotNull
        public final BadgeNewsFragment OooO00o(@NotNull MedalType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            BadgeNewsFragment badgeNewsFragment = new BadgeNewsFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(BadgeNewsFragment.MEDAL_TYPE, type.getValue());
            badgeNewsFragment.setArguments(bundle);
            return badgeNewsFragment;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<View> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            return View.inflate(BadgeNewsFragment.this.getBinding().f49500OooO0O0.getContext(), R.layout.user_footer_badge_news, null);
        }
    }

    public static final class OooO0OO extends p188o00o00o0.OooO0OO<BadgeNews> {
        public OooO0OO(Context context) {
            super(context, R.layout.user_item_badge_news);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            p188o00o00o0.OooO0o oooO0o = (p188o00o00o0.OooO0o) oooO00o;
            BadgeNews badgeNews = (BadgeNews) obj;
            if (oooO0o == null || badgeNews == null) {
                return;
            }
            oooO0o.OooO0oO(R.id.vPlaceholder, badgeNews.getNum() % 3 != 2);
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.mContext);
            oooO00o2.OooO00o(o00OOO.OooO00o.OooO00o());
            oooO00o2.f48429OooO0OO = badgeNews.getImageUrl();
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.OooO0OO(1, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_e2e2e2));
            oooO00o2.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.ivUserImage));
            Uri uriOooO00o = p168o00Ooo0.o00oO0o.OooO00o(badgeNews.getMedalId(), BadgeNewsFragment.this.type);
            View viewOooO0Oo = oooO0o.OooO0Oo(R.id.ivBadge);
            Intrinsics.checkNotNull(viewOooO0Oo, "null cannot be cast to non-null type com.yalla.yalla.common.ui.view.SVGAView");
            SVGAView sVGAView = (SVGAView) viewOooO0Oo;
            sVGAView.f21010OooooO0 = R.drawable.icon_badge_no_pic;
            sVGAView.OooO0oo(CloudImageUtilKt.imgFormat(uriOooO00o.toString()), BadgeNewsFragment.this);
            sVGAView.OooO();
            oooO0o.OooOO0(R.id.tvUserName, badgeNews.getNickName());
            oooO0o.OooO0O0(R.id.ivUserImage);
        }
    }

    public BadgeNewsFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.BadgeNewsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.BadgeNewsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        this.mVm = androidx.fragment.app.o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(o00O000.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.BadgeNewsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o00OO0O.OooOO0.OooO00o(lazy, "owner.viewModelStore");
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.BadgeNewsFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f23817Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = this.f23817Oooo0o;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.BadgeNewsFragment$special$$inlined$viewModels$default$5
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
        this.footer = LazyKt.lazy(new OooO0O0());
    }

    private final View getFooter() {
        Object value = this.footer.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-footer>(...)");
        return (View) value;
    }

    private final o00O000 getMVm() {
        return (o00O000) this.mVm.getValue();
    }

    private final void initData() {
        o00O000 mVm = getMVm();
        int i = this.type;
        Objects.requireNonNull(mVm);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(mVm), null, null, new o00oOoo(i, mVm, null), 3, null);
        getMVm().f48353OooO00o.observe(getViewLifecycleOwner(), new p142o00OOooO.o000O0o(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initData$lambda-1, reason: not valid java name */
    public static final void m315initData$lambda1(BadgeNewsFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p188o00o00o0.OooO0OO<BadgeNews> oooO0OO = this$0.mAdapter;
        p188o00o00o0.OooO0OO<BadgeNews> oooO0OO2 = null;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            oooO0OO = null;
        }
        oooO0OO.setNewData(list);
        p188o00o00o0.OooO0OO<BadgeNews> oooO0OO3 = this$0.mAdapter;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        } else {
            oooO0OO2 = oooO0OO3;
        }
        oooO0OO2.setLoadComplete(true);
    }

    private final void initView() {
        OooO0OO oooO0OO = new OooO0OO(getContext());
        this.mAdapter = oooO0OO;
        oooO0OO.setEmptyImageRes(R.drawable.ic_empty_message_system);
        p188o00o00o0.OooO0OO<BadgeNews> oooO0OO2 = this.mAdapter;
        p188o00o00o0.OooO0OO<BadgeNews> oooO0OO3 = null;
        if (oooO0OO2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            oooO0OO2 = null;
        }
        oooO0OO2.setHeaderAndEmpty(true);
        p188o00o00o0.OooO0OO<BadgeNews> oooO0OO4 = this.mAdapter;
        if (oooO0OO4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            oooO0OO4 = null;
        }
        oooO0OO4.addFooterView(getFooter());
        getBinding().f49500OooO0O0.setLayoutManager(new FixGridLayoutManager(getBinding().f49500OooO0O0.getContext(), 3));
        RecyclerView recyclerView = getBinding().f49500OooO0O0;
        p188o00o00o0.OooO0OO<BadgeNews> oooO0OO5 = this.mAdapter;
        if (oooO0OO5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            oooO0OO5 = null;
        }
        recyclerView.setAdapter(oooO0OO5);
        p188o00o00o0.OooO0OO<BadgeNews> oooO0OO6 = this.mAdapter;
        if (oooO0OO6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        } else {
            oooO0OO3 = oooO0OO6;
        }
        oooO0OO3.setOnItemChildClickListener(new p070o0000ooO.o00Ooo(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-0, reason: not valid java name */
    public static final void m316initView$lambda0(BadgeNewsFragment this$0, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23452o0ooOO0;
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        Object obj = baseQuickAdapter.getData().get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.BadgeNews");
        UserInfoActivity.OooO00o.OooO0Oo(oooO00o, fragmentActivityRequireActivity, String.valueOf(((BadgeNews) obj).getUserid()), false, 12);
    }

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        initData();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        this.type = arguments != null ? arguments.getInt(MEDAL_TYPE) : MedalType.GoldMedal.getValue();
        initView();
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public gi getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        gi giVarInflate = gi.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(giVarInflate, "inflate(layoutInflater)");
        return giVarInflate;
    }
}

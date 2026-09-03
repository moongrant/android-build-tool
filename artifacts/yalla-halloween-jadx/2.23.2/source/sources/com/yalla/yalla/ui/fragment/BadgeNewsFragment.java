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
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.uikit.svga.SVGAView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yalla.yalla.model.BadgeNews;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.view.materialdesign.FixGridLayoutManager;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.l2;
import p588o0oOooOo.x2;
import p588o0oOooOo.y2;
import p590o0oOooo0.O0O0;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002%&B\u0007¢\u0006\u0004\b\"\u0010#J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0014R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010!\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010 ¨\u0006'"}, d2 = {"Lcom/yalla/yalla/ui/fragment/BadgeNewsFragment;", "Lo0o0OO0o/o000O;", "Lo0Oo0OOO/l2;", "", "initView", "initData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onLazyInit", "Lo0oOoO0/o0000oo;", "Lcom/yalla/yalla/model/BadgeNews;", "mAdapter", "Lo0oOoO0/o0000oo;", "", "type", "I", "Lo0oOooOo/y2;", "mVm$delegate", "Lkotlin/Lazy;", "getMVm", "()Lo0oOooOo/y2;", "mVm", "footer$delegate", "getFooter", "()Landroid/view/View;", "footer", "<init>", "()V", "Companion", "OooO00o", BadgeNewsFragment.MEDAL_TYPE, "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBadgeNewsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BadgeNewsFragment.kt\ncom/yalla/yalla/ui/fragment/BadgeNewsFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,111:1\n106#2,15:112\n*S KotlinDebug\n*F\n+ 1 BadgeNewsFragment.kt\ncom/yalla/yalla/ui/fragment/BadgeNewsFragment\n*L\n33#1:112,15\n*E\n"})
public final class BadgeNewsFragment extends p527o0o0OO0o.o000O<l2> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final String MEDAL_TYPE = "MedalType";

    /* JADX INFO: renamed from: footer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy footer;
    private p571o0oOoO0.o0000oo<BadgeNews> mAdapter;

    /* JADX INFO: renamed from: mVm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mVm;
    private int type = MedalType.GoldMedal.getValue();

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v2 com.yalla.yalla.ui.fragment.BadgeNewsFragment$MedalType[], still in use, count: 1, list:
      (r9v2 com.yalla.yalla.ui.fragment.BadgeNewsFragment$MedalType[]) from 0x0041: INVOKE (r9v2 com.yalla.yalla.ui.fragment.BadgeNewsFragment$MedalType[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:66)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yalla/yalla/ui/fragment/BadgeNewsFragment$MedalType;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "setValue", "(I)V", "NotMedal", "BronzeMedal", "SilverMedal", "GoldMedal", "DiamondMedal", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
    public static final class MedalType {
        NotMedal(0),
        BronzeMedal(1),
        SilverMedal(2),
        GoldMedal(3),
        DiamondMedal(4);

        private static final /* synthetic */ EnumEntries $ENTRIES;
        private int value;

        static {
            $ENTRIES = EnumEntriesKt.enumEntries(medalTypeArr);
        }

        public MedalType(int i) {
            super(str, i);
            this.value = i;
        }

        public static MedalType valueOf(String str) {
            return (MedalType) Enum.valueOf(MedalType.class, str);
        }

        public static MedalType[] values() {
            return (MedalType[]) $VALUES.clone();
        }

        /* JADX INFO: renamed from: OooO00o, reason: from getter */
        public final int getValue() {
            return this.value;
        }
    }

    public static final class OooO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f27586OooO0Oo;

        public OooO(OooO0OO function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f27586OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f27586OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f27586OooO0Oo;
        }

        public final int hashCode() {
            return this.f27586OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f27586OooO0Oo.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.BadgeNewsFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
        @NotNull
        public static BadgeNewsFragment OooO00o(@NotNull MedalType type) {
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
            return View.inflate(BadgeNewsFragment.this.getBinding().f44118OooO0O0.getContext(), p562o0oOo000.oo0o0Oo.user_footer_badge_news, null);
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<List<BadgeNews>, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<BadgeNews> list) {
            List<BadgeNews> list2 = list;
            BadgeNewsFragment badgeNewsFragment = BadgeNewsFragment.this;
            p571o0oOoO0.o0000oo o0000ooVar = badgeNewsFragment.mAdapter;
            p571o0oOoO0.o0000oo o0000ooVar2 = null;
            if (o0000ooVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                o0000ooVar = null;
            }
            o0000ooVar.OooOoO0(list2);
            p571o0oOoO0.o0000oo o0000ooVar3 = badgeNewsFragment.mAdapter;
            if (o0000ooVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            } else {
                o0000ooVar2 = o0000ooVar3;
            }
            o0000ooVar2.Oooo0O0(true);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends p571o0oOoO0.o0000oo<BadgeNews> {
        public OooO0o(Context context, int i) {
            super(context, i);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            ViewHolder viewHolder = (ViewHolder) baseViewHolder;
            BadgeNews badgeNews = (BadgeNews) obj;
            if (viewHolder == null || badgeNews == null) {
                return;
            }
            viewHolder.setGone(p562o0oOo000.o0OO00O.vPlaceholder, badgeNews.getNum() % 3 != 2);
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f13186OooOOOo);
            oooO00o.OooO00o(d1.OooO00o());
            oooO00o.f43126OooO0OO = badgeNews.getImageUrl();
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0O0(1, com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_e2e2e2));
            int i = p562o0oOo000.o0OO00O.ivUserImage;
            oooO00o.OooO0Oo((ImageView) viewHolder.getView(i));
            int medalId = badgeNews.getMedalId();
            BadgeNewsFragment badgeNewsFragment = BadgeNewsFragment.this;
            Uri uriOooO00o = O0O0.OooO00o(medalId, badgeNewsFragment.type);
            View view = viewHolder.getView(p562o0oOo000.o0OO00O.ivBadge);
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.code.android.uikit.svga.SVGAView");
            SVGAView sVGAView = (SVGAView) view;
            int i2 = p562o0oOo000.o0Oo0oo.icon_badge_no_pic;
            sVGAView.f13232OooOooO = i2;
            sVGAView.setImageResource(i2);
            sVGAView.OooOO0O(p184o00o00O0.OooO0OO.OooO0Oo(uriOooO00o.toString()), badgeNewsFragment);
            sVGAView.OooOO0o();
            viewHolder.setText(p562o0oOo000.o0OO00O.tvUserName, badgeNews.getNickName());
            viewHolder.addOnClickListener(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.yalla.yalla.ui.fragment.BadgeNewsFragment$special$$inlined$viewModels$default$1] */
    public BadgeNewsFragment() {
        final ?? r0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.BadgeNewsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.BadgeNewsFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) r0.invoke();
            }
        });
        this.mVm = androidx.fragment.app.o000Oo0.OooO0O0(this, Reflection.getOrCreateKotlinClass(y2.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.BadgeNewsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return androidx.fragment.app.o000Oo0.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.BadgeNewsFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f27593OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f27593OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000Oo0.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.BadgeNewsFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000Oo0.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.footer = LazyKt.lazy(new OooO0O0());
    }

    private final View getFooter() {
        Object value = this.footer.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (View) value;
    }

    private final y2 getMVm() {
        return (y2) this.mVm.getValue();
    }

    private final void initData() {
        y2 mVm = getMVm();
        int i = this.type;
        mVm.getClass();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(mVm), null, null, new x2(i, mVm, null), 3, null);
        getMVm().f57085OooO00o.observe(getViewLifecycleOwner(), new OooO(new OooO0OO()));
    }

    private final void initView() {
        OooO0o oooO0o = new OooO0o(getContext(), p562o0oOo000.oo0o0Oo.user_item_badge_news);
        this.mAdapter = oooO0o;
        oooO0o.OooOooo(p562o0oOo000.o0Oo0oo.ic_empty_message_system);
        p571o0oOoO0.o0000oo<BadgeNews> o0000ooVar = this.mAdapter;
        p571o0oOoO0.o0000oo<BadgeNews> o0000ooVar2 = null;
        if (o0000ooVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            o0000ooVar = null;
        }
        o0000ooVar.OooOo0o();
        p571o0oOoO0.o0000oo<BadgeNews> o0000ooVar3 = this.mAdapter;
        if (o0000ooVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            o0000ooVar3 = null;
        }
        o0000ooVar3.OooO0Oo(getFooter(), -1);
        int i = 3;
        getBinding().f44118OooO0O0.setLayoutManager(new FixGridLayoutManager(getBinding().f44118OooO0O0.getContext(), 3));
        RecyclerView recyclerView = getBinding().f44118OooO0O0;
        p571o0oOoO0.o0000oo<BadgeNews> o0000ooVar4 = this.mAdapter;
        if (o0000ooVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            o0000ooVar4 = null;
        }
        recyclerView.setAdapter(o0000ooVar4);
        p571o0oOoO0.o0000oo<BadgeNews> o0000ooVar5 = this.mAdapter;
        if (o0000ooVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        } else {
            o0000ooVar2 = o0000ooVar5;
        }
        o0000ooVar2.f13179OooO0oo = new o000O0.OooO0OO(this, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(BadgeNewsFragment this$0, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26775Oooo0o;
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Object obj = baseQuickAdapter.f13189OooOOoo.get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.BadgeNews");
        UserInfoActivity.OooO00o.OooO0OO(oooO00o, fragmentActivityRequireActivity, String.valueOf(((BadgeNews) obj).getUserid()), false, 12);
    }

    @Override // p586o0oOooO0.oO0Oo0o0
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

    @Override // p527o0o0OO0o.o000O
    @NotNull
    public l2 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        l2 l2VarInflate = l2.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(l2VarInflate, "inflate(...)");
        return l2VarInflate;
    }
}

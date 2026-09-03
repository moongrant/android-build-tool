package com.app.base.adapter.roomExplore;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o0000O;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOOO;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.ui.fragment.MainExploreFragment;
import com.yalla.yalla.ui.vm.event.EventViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o00OO0O.OooO0o;
import o00OO0O.OooOO0;
import org.jetbrains.annotations.NotNull;
import p027Oooo0o.Oooo000;
import p043OooooO0.o00O0000;
import p047Oooooo0.o00OO0OO;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class RoomExploreEventsManager {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final ViewGroup f11391OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f11392OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final View f11393OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ComposeView f11394OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public o00OO0OO<EventModel> f11395OooO0o0;

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {
        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            oOO00O ooo00o2 = ooo00o;
            if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                if (RoomExploreEventsManager.this.f11395OooO0o0.isEmpty()) {
                    ooo00o2.OooO0o0(-156320658);
                    OooOOOO.OooO00o(ooo00o2, 0);
                    ooo00o2.Oooo0o0();
                } else {
                    ooo00o2.OooO0o0(-156320606);
                    Oooo000.OooO0O0(null, null, PaddingKt.OooO00o(16, 0), false, p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(8), null, null, false, new com.app.base.adapter.roomExplore.OooO00o(RoomExploreEventsManager.this), ooo00o2, 24960, 235);
                    ooo00o2.Oooo0o0();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public RoomExploreEventsManager(@NotNull final MainExploreFragment fragment, @NotNull ViewGroup root) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(root, "root");
        this.f11391OooO00o = root;
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.app.base.adapter.roomExplore.RoomExploreEventsManager$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return fragment;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.app.base.adapter.roomExplore.RoomExploreEventsManager$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        this.f11392OooO0O0 = (ViewModelLazy) o0000O.OooO0O0(fragment, Reflection.getOrCreateKotlinClass(EventViewModel.class), new Function0<ViewModelStore>() { // from class: com.app.base.adapter.roomExplore.RoomExploreEventsManager$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return OooOO0.OooO00o(lazy, "owner.viewModelStore");
            }
        }, new Function0<CreationExtras>() { // from class: com.app.base.adapter.roomExplore.RoomExploreEventsManager$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f11402Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = this.f11402Oooo0o;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.app.base.adapter.roomExplore.RoomExploreEventsManager$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        View viewFindViewById = root.findViewById(R.id.llEventHeader);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "root.findViewById(R.id.llEventHeader)");
        this.f11393OooO0OO = viewFindViewById;
        View viewFindViewById2 = root.findViewById(R.id.eventCompose);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "root.findViewById(R.id.eventCompose)");
        ComposeView composeView = (ComposeView) viewFindViewById2;
        this.f11394OooO0Oo = composeView;
        this.f11395OooO0o0 = new o00OO0OO<>();
        p254o00ooO0O.oOO00O.OooO00o(viewFindViewById);
        p254o00ooO0O.oOO00O.OooO00o(composeView);
        composeView.setContent(o00O0000.OooO0O0(1126899584, true, new OooO00o()));
        root.findViewById(R.id.tvEventMore).setOnClickListener(new OooO0o(this, 0));
    }
}

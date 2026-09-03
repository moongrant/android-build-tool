package com.yalla.yalla.module.event.ui.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.o000Oo0;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.yalla.yalla.module.event.ui.screen.EventPage;
import com.yalla.yalla.module.event.vm.EventViewModel;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p193o00o0O0O.o0000oo;
import p407o0Oo0OOO.o0O0oo0o;
import p450o0OoOoo.o00O0O0O;
import p450o0OoOoo.oOO00O;
import p527o0o0OO0.o00OO0O0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\r\u001a\u00020\fH\u0014R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/yalla/yalla/module/event/ui/page/EventDisplayChildFragment;", "Lo0o0OO0/o00OO0O0;", "Lo0Oo0OOO/o0O0oo0o;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "getViewBinding", "", "onLazyInit", "Lcom/yalla/yalla/module/event/vm/EventViewModel;", "eventVM$delegate", "Lkotlin/Lazy;", "getEventVM", "()Lcom/yalla/yalla/module/event/vm/EventViewModel;", "eventVM", "Lcom/yalla/yalla/module/event/ui/screen/EventPage;", "eventPage", "Lcom/yalla/yalla/module/event/ui/screen/EventPage;", "<init>", "()V", "Companion", "OooO00o", "Event_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nEventDisplayChildFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventDisplayChildFragment.kt\ncom/yalla/yalla/module/event/ui/page/EventDisplayChildFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,53:1\n172#2,9:54\n*S KotlinDebug\n*F\n+ 1 EventDisplayChildFragment.kt\ncom/yalla/yalla/module/event/ui/page/EventDisplayChildFragment\n*L\n25#1:54,9\n*E\n"})
public final class EventDisplayChildFragment extends o00OO0O0<o0O0oo0o> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private EventPage eventPage;

    /* JADX INFO: renamed from: eventVM$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy eventVM = o000Oo0.OooO0O0(this, Reflection.getOrCreateKotlinClass(EventViewModel.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.module.event.ui.page.EventDisplayChildFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.module.event.ui.page.EventDisplayChildFragment$special$$inlined$activityViewModels$default$2

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f23193OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f23193OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.module.event.ui.page.EventDisplayChildFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    });

    /* JADX INFO: renamed from: com.yalla.yalla.module.event.ui.page.EventDisplayChildFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        public /* synthetic */ class OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EventPage.values().length];
                try {
                    iArr[EventPage.MineSubscribe.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EventPage.MineCreator.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public OooO0O0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1943171731, iIntValue, -1, "com.yalla.yalla.module.event.ui.page.EventDisplayChildFragment.onLazyInit.<anonymous> (EventDisplayChildFragment.kt:40)");
                }
                EventDisplayChildFragment eventDisplayChildFragment = EventDisplayChildFragment.this;
                EventPage eventPage = eventDisplayChildFragment.eventPage;
                if (eventPage == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventPage");
                    eventPage = null;
                }
                int i = OooO00o.$EnumSwitchMapping$0[eventPage.ordinal()];
                if (i == 1) {
                    composer2.startReplaceableGroup(156009615);
                    o00O0O0O.OooO00o(eventDisplayChildFragment.getEventVM(), composer2, 0);
                    composer2.endReplaceableGroup();
                } else if (i != 2) {
                    composer2.startReplaceableGroup(156009894);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(156009802);
                    oOO00O.OooO00o(eventDisplayChildFragment.getEventVM(), composer2, 0);
                    composer2.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EventViewModel getEventVM() {
        return (EventViewModel) this.eventVM.getValue();
    }

    @Override // p527o0o0OO0.o00OO0O0, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("EventPage") : null;
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.yalla.yalla.module.event.ui.screen.EventPage");
        this.eventPage = (EventPage) serializable;
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override // p588o0oOooO0.o0O0O0O
    public void onLazyInit() {
        super.onLazyInit();
        ComposeView displayChildComposeView = getBinding().f44534OooO0O0;
        Intrinsics.checkNotNullExpressionValue(displayChildComposeView, "displayChildComposeView");
        o0000oo.OooO0Oo(displayChildComposeView, ComposableLambdaKt.composableLambdaInstance(1943171731, true, new OooO0O0()));
    }

    @Override // p527o0o0OO0.o00OO0O0
    @NotNull
    public o0O0oo0o getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        o0O0oo0o o0o0oo0oInflate = o0O0oo0o.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(o0o0oo0oInflate, "inflate(...)");
        return o0o0oo0oInflate;
    }
}

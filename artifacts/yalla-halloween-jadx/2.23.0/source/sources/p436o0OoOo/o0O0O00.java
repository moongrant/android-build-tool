package p436o0OoOo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o000O0;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.ui.screen.EventCreateScreen;
import com.yalla.yalla.module.event.ui.screen.EventDetailScreen;
import com.yalla.yalla.module.event.ui.screen.EventDisplayActivity;
import com.yalla.yalla.module.event.ui.screen.EventPage;
import com.yalla.yalla.module.event.vm.EventViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p442o0OoOoO0.o0O0oo0o;
import p445o0OoOoo.o0oOOo;
import p521o0o0OO.o0OO00O;
import p526o0o0OOO0.oo0oOO0;
import p560o0oOo000.o00000O0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nEventModuleService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventModuleService.kt\ncom/yalla/yalla/module/event/EventModuleService\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,49:1\n75#2,13:50\n*S KotlinDebug\n*F\n+ 1 EventModuleService.kt\ncom/yalla/yalla/module/event/EventModuleService\n*L\n45#1:50,13\n*E\n"})
public final class o0O0O00 implements o00000O0 {

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f46047OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateList<EventModel> f46048OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(SnapshotStateList<EventModel> snapshotStateList, int i) {
            super(2);
            this.f46048OooO0o0 = snapshotStateList;
            this.f46047OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f46047OooO0o | 1);
            o0O0O00.this.OooO0O0(this.f46048OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f46050OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i) {
            super(2);
            this.f46050OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f46050OooO0o0 | 1);
            o0O0O00.this.OooO0o0(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @Override // p560o0oOo000.o00000O0
    public final void OooO00o() {
        oo0oOO0.OooO0o0(EventCreateScreen.INSTANCE, null, false, null, 14);
    }

    @Override // p560o0oOo000.o00000O0
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0O0(@NotNull SnapshotStateList<EventModel> list, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(list, "list");
        Composer composerStartRestartGroup = composer.startRestartGroup(-227817276);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-227817276, i2, -1, "com.yalla.yalla.module.event.EventModuleService.onExploreEvent (EventModuleService.kt:35)");
            }
            o0oOOo.OooO0O0(list, composerStartRestartGroup, i2 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(list, i));
    }

    @Override // p560o0oOo000.o00000O0
    public final void OooO0OO() {
        Context context = o000O0.f10354OooO00o;
        Activity context2 = com.code.android.util.OooO0O0.OooO0O0();
        if (context2 != null) {
            int i = EventDisplayActivity.f23815OooO;
            EventPage eventPage = EventPage.SquareOngoing;
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(eventPage, "eventPage");
            Intent intent = new Intent(context2, (Class<?>) EventDisplayActivity.class);
            intent.putExtra("EVENT_PAGE", eventPage);
            context2.startActivity(intent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p560o0oOo000.o00000O0
    public final void OooO0Oo(@NotNull final MixedRoomActivity activity, @NotNull EventModel model, @NotNull Function1 requestAction) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(requestAction, "requestAction");
        ((EventViewModel) new ViewModelLazy(Reflection.getOrCreateKotlinClass(EventViewModel.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.module.event.EventModuleService$subscribeEvent$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = activity.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.module.event.EventModuleService$subscribeEvent$$inlined$viewModels$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = activity.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.module.event.EventModuleService$subscribeEvent$$inlined$viewModels$default$3

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f23638OooO0Oo = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f23638OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = activity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }).getValue()).subscribeEvent(model, requestAction);
    }

    @Override // p560o0oOo000.o00000O0
    public final void OooO0o(@NotNull EventModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        EventDetailScreen.INSTANCE.navigate(model);
    }

    @Override // p560o0oOo000.o00000O0
    @Composable
    public final void OooO0o0(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-253612730);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-253612730, i, -1, "com.yalla.yalla.module.event.EventModuleService.onRoomEventInfoPage (EventModuleService.kt:30)");
            }
            o0OO00O.OooO00o.OooO00o(o0O0oo0o.f46265OooO00o, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(i));
    }
}

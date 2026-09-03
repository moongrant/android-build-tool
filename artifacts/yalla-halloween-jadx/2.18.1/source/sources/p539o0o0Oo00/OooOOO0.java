package p539o0o0Oo00;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.yalla.yalla.developer.crash.CrashListScreen$Content$3$1$invoke$$inlined$items$default$1;
import com.yalla.yalla.developer.crash.CrashListViewModel;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.File;
import java.util.Objects;
import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import o0000O0O.OooO;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p027Oooo0o.Oooo000;
import p027Oooo0o.o000;
import p027Oooo0o.o000oOoO;
import p028Oooo0o0.o00O0O00;
import p028Oooo0o0.o0O0O0O;
import p028Oooo0o0.o0O0OO0;
import p031OoooO.OooOOO0;
import p031OoooO.o000O0O0;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p047Oooooo0.o00OO0OO;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p507o0o00oOO.o0000O0;
import p539o0o0Oo00.OooOOO;
import p539o0o0Oo00.OooOOOO;
import p571o0oOo0o.o00O0OO;
import p584o0oOoo.o0000O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOOO0 extends o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooOOO0 f44134OooO00o = new OooOOO0();

    public static final class OooO00o extends Lambda implements Function3<o0O0O0O, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ CrashListViewModel f44135Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(CrashListViewModel crashListViewModel) {
            super(3);
            this.f44135Oooo0o = crashListViewModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o0O0O0O o0o0o0o, oOO00O ooo00o, Integer num) {
            o0O0O0O Toolbar = o0o0o0o;
            oOO00O ooo00o2 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(Toolbar, "$this$Toolbar");
            if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                o0000O0 o0000o1 = o0000O0.f41691OooO00o;
                o000O0O0.OooO0OO("clear all", PaddingKt.OooO0o0(ClickableKt.OooO0Oo(o00OOOO0.OooO00o.f4198Oooo0o, false, new OooOO0O(this.f44135Oooo0o), 7), 10), o0000O0.f41693OooO0OO, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, ooo00o2, 390, 0, 65528);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.developer.crash.CrashListScreen$Content$2", f = "CrashListScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ CrashListViewModel f44136Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(CrashListViewModel crashListViewModel, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f44136Oooo0o = crashListViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f44136Oooo0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            if (this.f44136Oooo0o.getListLiveData().isEmpty()) {
                this.f44136Oooo0o.loadCrashFiles();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<o000, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ CrashListViewModel f44137Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(CrashListViewModel crashListViewModel) {
            super(1);
            this.f44137Oooo0o = crashListViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o000 o000Var) {
            o000 LazyColumn = o000Var;
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            final o00OO0OO<Pair<String, File>> listLiveData = this.f44137Oooo0o.getListLiveData();
            final CrashListScreen$Content$3$1$invoke$$inlined$items$default$1 crashListScreen$Content$3$1$invoke$$inlined$items$default$1 = new Function1() { // from class: com.yalla.yalla.developer.crash.CrashListScreen$Content$3$1$invoke$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return null;
                }
            };
            LazyColumn.OooO0OO(listLiveData.size(), null, new Function1<Integer, Object>() { // from class: com.yalla.yalla.developer.crash.CrashListScreen$Content$3$1$invoke$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Integer num) {
                    return crashListScreen$Content$3$1$invoke$$inlined$items$default$1.invoke(listLiveData.get(num.intValue()));
                }
            }, o00O0000.OooO0O0(-632812321, true, new Function4<o000oOoO, Integer, oOO00O, Integer, Unit>() { // from class: com.yalla.yalla.developer.crash.CrashListScreen$Content$3$1$invoke$$inlined$items$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public final Unit invoke(o000oOoO o000oooo2, Integer num, oOO00O ooo00o, Integer num2) {
                    int i;
                    o000oOoO items = o000oooo2;
                    int iIntValue = num.intValue();
                    oOO00O ooo00o2 = ooo00o;
                    int iIntValue2 = num2.intValue();
                    Intrinsics.checkNotNullParameter(items, "$this$items");
                    if ((iIntValue2 & 14) == 0) {
                        i = (ooo00o2.Oooo0oo(items) ? 4 : 2) | iIntValue2;
                    } else {
                        i = iIntValue2;
                    }
                    if ((iIntValue2 & 112) == 0) {
                        i |= ooo00o2.OooO(iIntValue) ? 32 : 16;
                    }
                    if ((i & 731) == 146 && ooo00o2.OooOo0()) {
                        ooo00o2.OooOoo0();
                    } else {
                        Pair pair = (Pair) listLiveData.get(iIntValue);
                        OooOOO0.OooO00o(ClickableKt.OooO0Oo(SizeKt.OooO0o(PaddingKt.OooO0o0(o00OOOO0.OooO00o.f4198Oooo0o, 10)), false, new OooOOO(pair), 7), null, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00o2, 1194592952, new OooOOOO(pair)), ooo00o2, 1572864, 62);
                    }
                    return Unit.INSTANCE;
                }
            }));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O0O00 f44139Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f44140Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o00O0O00 o00o0o01, int i) {
            super(2);
            this.f44139Oooo0oO = o00o0o01;
            this.f44140Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            OooOOO0.this.OooO00o(this.f44139Oooo0oO, ooo00o, this.f44140Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @Override // p584o0oOoo.o0000O
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@NotNull o00O0O00 o00o0o01, @Nullable oOO00O ooo00o, int i) {
        CreationExtras defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(o00o0o01, "<this>");
        oOO00O composer = ooo00o.OooOOo(1927698129);
        if ((i & 1) == 0 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            composer.OooO0o0(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel(CrashListViewModel.class, current, null, null, defaultViewModelCreationExtras, composer, 36936, 0);
            composer.Oooo0o0();
            CrashListViewModel crashListViewModel = (CrashListViewModel) viewModel;
            o00O0OO.OooO00o("Crash Log", 0L, 0, null, null, o00O0000.OooO00o(composer, -156312940, new OooO00o(crashListViewModel)), 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, composer, 196614, 0, 2014);
            o00Oo00.OooO0o0(Unit.INSTANCE, new OooO0O0(crashListViewModel, null), composer);
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            o00OOOO0 o00oooo0OooO0o0 = SizeKt.OooO0o0(oooO00o);
            composer.OooO0o0(733328855);
            o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
            composer.OooO0o0(-1323940314);
            OooO oooO = (OooO) composer.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(androidx.compose.ui.platform.o000.f6360OooOO0O);
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(androidx.compose.ui.platform.o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0o0);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function0);
            } else {
                composer.Oooo00O();
            }
            composer.OooOo0O();
            Intrinsics.checkNotNullParameter(composer, "composer");
            oO00000o.OooO0O0(composer, o000000VarOooO0Oo, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
            oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-2137368960);
            if (crashListViewModel.getListLiveData().isEmpty()) {
                composer.OooO0o0(1836021198);
                p048OoooooO.o00OO0OO alignment = o00OO0O0.OooO00o.f4175OooO0o;
                Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                Intrinsics.checkNotNullParameter(alignment, "alignment");
                Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
                Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
                p028Oooo0o0.o00O00O other = new p028Oooo0o0.o00O00O(alignment, false);
                Intrinsics.checkNotNullParameter(other, "other");
                o000O0O0.OooO0OO("no data ", other, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 6, 0, 65532);
                composer.Oooo0o0();
            } else {
                composer.OooO0o0(1836021304);
                Oooo000.OooO00o(null, null, null, false, null, null, null, false, new OooO0OO(crashListViewModel), composer, 0, KotlinVersion.MAX_COMPONENT_VALUE);
                composer.Oooo0o0();
            }
            o0O0OO0.OooO00o(composer);
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0o(o00o0o01, i));
    }
}

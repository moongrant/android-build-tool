package p591o0oOooOo;

import Oooo000.o00oO0o;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o0O0O00;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import com.app.base.fragment.ContributionFragment;
import com.google.accompanist.pager.ExperimentalPagerApi;
import com.google.accompanist.pager.Pager;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.SquareEventRoomModel;
import com.yalla.yalla.ui.composable.event.EventKt;
import com.yalla.yalla.ui.vm.event.EventRoomPreviewPageViewModel;
import com.yalla.yalla.ui.vm.event.EventRoomPreviewViewModel;
import com.yalla.yalla.ui.vm.event.EventViewModel;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.oo000o;
import p028Oooo0o0.o00O0O00;
import p028Oooo0o0.o0O0OO0;
import p028Oooo0o0.oo00o;
import p031OoooO.o000O00;
import p031OoooO.o000Oo0;
import p033OoooO00.o00O0O;
import p043OooooO0.o00;
import p043OooooO0.o000OOo0;
import p043OooooO0.o00O0000;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OOO0O;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o00OO0OO;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p142o00OOooO.o00000O0;
import p145o00Oo0.o000O0Oo;
import p261o00ooOoO.u;
import p479o0o00.OooOOO;
import p479o0o00.OooOo;
import p479o0o00.OooOo00;
import p507o0o00oOO.o0000O0;
import p510o0o00oo0.o0O00OO;
import p522o0o0O0o.o00O000o;
import p534o0o0OOo0.o0OoOoOo;
import p549o0oO0O0o.o000O;
import p549o0oO0O0o.o000OO00;
import p571o0oOo0o.o00O0OO;
import p584o0oOoo.o0000O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class n4 extends o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final n4 f47289OooO00o = new n4();

    public static final class OooO extends Lambda implements Function3<List<? extends OooOo00>, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O0O0O.OooOO0 f47290Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(o0O0O0O.OooOO0 oooOO1) {
            super(3);
            this.f47290Oooo0o = oooOO1;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(List<? extends OooOo00> list, oOO00O ooo00o, Integer num) {
            List<? extends OooOo00> tabPositions = list;
            num.intValue();
            Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            OooOo oooOo = OooOo.f40725OooO00o;
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            o0O0O0O.OooOO0 pagerState = this.f47290Oooo0o;
            oo000o<Float> oo000oVar = p479o0o00.OooO.f40674OooO00o;
            Intrinsics.checkNotNullParameter(oooO00o, "<this>");
            Intrinsics.checkNotNullParameter(pagerState, "pagerState");
            Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
            o00OOOO0 o00oooo0OooO0O0 = o00OOO0O.OooO0O0(oooO00o, new OooOOO(pagerState, tabPositions));
            u3 u3Var = u3.f47344OooO00o;
            oooOo.OooO0O0(o00oooo0OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, 0L, false, u3.f47345OooO0O0, ooo00o, 14155776, 62);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Context f47291Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context) {
            super(0);
            this.f47291Oooo0o = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Context context = this.f47291Oooo0o;
            if (context instanceof Activity) {
                ((Activity) context).onBackPressed();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f47292Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O0O0O.OooOO0 f47293Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(CoroutineScope coroutineScope, o0O0O0O.OooOO0 oooOO1) {
            super(1);
            this.f47292Oooo0o = coroutineScope;
            this.f47293Oooo0oO = oooOO1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            BuildersKt__Builders_commonKt.launch$default(this.f47292Oooo0o, null, null, new o4(this.f47293Oooo0oO, num.intValue(), null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function4<o0O0O0O.OooO0o, Integer, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ ArrayList<SquareEventRoomModel> f47294Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Context f47295Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ EventViewModel f47296Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(ArrayList<SquareEventRoomModel> arrayList, Context context, EventViewModel eventViewModel) {
            super(4);
            this.f47294Oooo0o = arrayList;
            this.f47295Oooo0oO = context;
            this.f47296Oooo0oo = eventViewModel;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(o0O0O0O.OooO0o oooO0o, Integer num, oOO00O ooo00o, Integer num2) {
            CreationExtras defaultViewModelCreationExtras;
            o0O0O0O.OooO0o HorizontalPager = oooO0o;
            int iIntValue = num.intValue();
            oOO00O composer = ooo00o;
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
            if ((iIntValue2 & 112) == 0) {
                iIntValue2 |= composer.OooO(iIntValue) ? 32 : 16;
            }
            if ((iIntValue2 & 721) == 144 && composer.OooOo0()) {
                composer.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                o00OOOO0 o00oooo0OooO0o0 = SizeKt.OooO0o0(oooO00o);
                ArrayList<SquareEventRoomModel> arrayList = this.f47294Oooo0o;
                Context context = this.f47295Oooo0oO;
                EventViewModel eventViewModel = this.f47296Oooo0oo;
                composer.OooO0o0(733328855);
                o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                composer.OooO0o0(-1323940314);
                o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
                LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
                o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
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
                String strValueOf = String.valueOf(iIntValue);
                w4 w4Var = new w4(arrayList, iIntValue);
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
                ViewModel viewModel = ViewModelKt.viewModel(EventRoomPreviewPageViewModel.class, current, strValueOf, w4Var, defaultViewModelCreationExtras, composer, 36936, 0);
                composer.Oooo0o0();
                EventRoomPreviewPageViewModel eventRoomPreviewPageViewModel = (EventRoomPreviewPageViewModel) viewModel;
                androidx.paging.compose.OooO0OO oooO0OOOooO00o = androidx.paging.compose.OooOO0.OooO00o(eventRoomPreviewPageViewModel.getEventRoomPreviewPager().f48686OooO0oo, composer);
                Observable<Object> observable = LiveEventBus.get("EVENT_UPDATE_SUBSCRIBE_NUMBER");
                Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.EVENT_UPDATE_SUBSCRIBE_NUMBER)");
                int i = 4;
                o00O000o.OooO00o(observable, new o00000O0(eventRoomPreviewPageViewModel, i), composer, 72);
                Observable<Object> observable2 = LiveEventBus.get("EVENT_DELETED");
                Intrinsics.checkNotNullExpressionValue(observable2, "get(EventKey.EVENT_DELETED)");
                o00O000o.OooO00o(observable2, new o0OoOoOo(eventRoomPreviewPageViewModel, i), composer, 72);
                o0O00OO.OooO00o(oooO0OOOooO00o, SizeKt.OooO0o0(oooO00o), null, null, null, o00O0000.OooO00o(composer, -238376734, new v4(oooO0OOOooO00o, context, eventViewModel)), composer, 196664, 28);
                o0O0OO0.OooO00o(composer);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O0O00 f47298Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47299Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o00O0O00 o00o0o01, int i) {
            super(2);
            this.f47298Oooo0oO = o00o0o01;
            this.f47299Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            n4.this.OooO00o(this.f47298Oooo0oO, ooo00o, this.f47299Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f47300Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ ArrayList<SquareEventRoomModel> f47301Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O0O0O.OooOO0 f47302Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f47303Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Context f47304OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0(ArrayList<SquareEventRoomModel> arrayList, o0O0O0O.OooOO0 oooOO1, Function1<? super Integer, Unit> function1, int i, Context context) {
            super(2);
            this.f47301Oooo0o = arrayList;
            this.f47302Oooo0oO = oooOO1;
            this.f47303Oooo0oo = function1;
            this.f47300Oooo = i;
            this.f47304OoooO00 = context;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            oOO00O ooo00o2 = ooo00o;
            if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                int size = this.f47301Oooo0o.size();
                o0O0O0O.OooOO0 oooOO1 = this.f47302Oooo0oO;
                ArrayList<SquareEventRoomModel> arrayList = this.f47301Oooo0o;
                Function1<Integer, Unit> function1 = this.f47303Oooo0oo;
                int i = this.f47300Oooo;
                Context context = this.f47304OoooO00;
                int i2 = 0;
                while (i2 < size) {
                    boolean z = oooOO1.OooO0o0() == i2;
                    boolean z2 = z;
                    o000O00.OooO00o(z2, x4.f47411Oooo0o, SizeKt.OooO0Oo(o00OOOO0.OooO00o.f4198Oooo0o), true, null, o00O0000.OooO00o(ooo00o2, 1362527405, new a5(arrayList, i2, z, function1, i, context)), null, 0L, 0L, ooo00o2, 200112, 464);
                    i2++;
                    size = size;
                    context = context;
                    function1 = function1;
                    i = i;
                    arrayList = arrayList;
                    oooOO1 = oooOO1;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function4 = oo0o0O0.f29705OooO00o;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f47305Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O0O0O.OooOO0 f47307Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f47308Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0O(o0O0O0O.OooOO0 oooOO1, Function1<? super Integer, Unit> function1, int i) {
            super(2);
            this.f47307Oooo0oO = oooOO1;
            this.f47308Oooo0oo = function1;
            this.f47305Oooo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            n4.this.OooO0o0(this.f47307Oooo0oO, this.f47308Oooo0oo, ooo00o, this.f47305Oooo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f47309Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O0O0O.OooOO0 f47311Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f47312Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOOO0(o0O0O0O.OooOO0 oooOO1, Function1<? super Integer, Unit> function1, int i) {
            super(2);
            this.f47311Oooo0oO = oooOO1;
            this.f47312Oooo0oo = function1;
            this.f47309Oooo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            n4.this.OooO0o0(this.f47311Oooo0oO, this.f47312Oooo0oo, ooo00o, this.f47309Oooo | 1);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r15v4, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    /* JADX WARN: Type inference failed for: r17v2, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r3v52, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r5v17, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r5v23, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    @Override // p584o0oOoo.o0000O
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@NotNull o00O0O00 o00o0o01, @Nullable oOO00O ooo00o, int i) {
        CreationExtras defaultViewModelCreationExtras;
        CreationExtras defaultViewModelCreationExtras2;
        Intrinsics.checkNotNullParameter(o00o0o01, "<this>");
        oOO00O composer = ooo00o.OooOOo(1871441064);
        if ((i & 1) == 0 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            Context context = (Context) composer.OooOO0o(o0O0O00.f6591OooO0O0);
            o000O o000oOooO00o = o000OO00.OooO00o(composer);
            composer.OooO0o0(1729797275);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composer, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel(EventRoomPreviewViewModel.class, current, null, null, defaultViewModelCreationExtras, composer, 36936, 0);
            composer.Oooo0o0();
            EventRoomPreviewViewModel eventRoomPreviewViewModel = (EventRoomPreviewViewModel) viewModel;
            Bundle bundleOooO0O0 = p584o0oOoo.o000OO00.OooO0O0((NavBackStackEntry) composer.OooOO0o(p584o0oOoo.o000OO00.f46954OooO00o), composer);
            composer.OooO0o0(1157296644);
            boolean zOooo0oo = composer.Oooo0oo(bundleOooO0O0);
            Object objOooO0o = composer.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = Long.valueOf(bundleOooO0O0.getLong(ContributionFragment.ARG_1, 0L));
                composer.Oooo00o(objOooO0o);
            }
            composer.Oooo0o0();
            eventRoomPreviewViewModel.setInitialPageRoomId(((Number) objOooO0o).longValue());
            composer.OooO0o0(1157296644);
            boolean zOooo0oo2 = composer.Oooo0oo(bundleOooO0O0);
            Object objOooO0o2 = composer.OooO0o();
            if (zOooo0oo2 || objOooO0o2 == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o2 = bundleOooO0O0.getParcelableArrayList("roomList");
                composer.Oooo00o(objOooO0o2);
            }
            composer.Oooo0o0();
            eventRoomPreviewViewModel.setRoomListSquare((ArrayList) objOooO0o2);
            composer.OooO0o0(1729797275);
            ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composer, 6);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current2 instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras2 = ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras2, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                defaultViewModelCreationExtras2 = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel2 = ViewModelKt.viewModel(EventViewModel.class, current2, null, null, defaultViewModelCreationExtras2, composer, 36936, 0);
            composer.Oooo0o0();
            EventViewModel eventViewModel = (EventViewModel) viewModel2;
            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
            o000oOooO00o.OooO00o(o0000O0.f41692OooO0O0, true, o000OO00.f44601OooO0O0);
            p504o0o00o0O.OooOo.OooO00o(eventViewModel.getShowLoadingDialog().getValue().booleanValue(), null, null, composer, 0, 6);
            EventKt.OooOOO0(eventViewModel.getShowAddToCalendarDialog(), context, eventViewModel.getAddToCalendarEventModel(), composer, 576);
            o00OOOO0 o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooO0o0(o00OOOO0.OooO00o.f4198Oooo0o), u.OooO0O0(composer).OooOo00(), o000O0Oo.f32099OooO00o);
            composer.OooO0o0(-483455358);
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000 o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, o00OO0O0.OooO00o.f4182OooOOO, composer);
            composer.OooO0o0(-1323940314);
            o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O0);
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
            oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
            oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-1163856341);
            composer.OooO0o0(773894976);
            composer.OooO0o0(-492369756);
            Object objOooO0o3 = composer.OooO0o();
            if (objOooO0o3 == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o3 = o00oO0o.OooO0OO(o00Oo00.OooO0oo(EmptyCoroutineContext.INSTANCE, composer), composer);
            }
            composer.Oooo0o0();
            CoroutineScope coroutineScope = ((o00OO0OO) objOooO0o3).f29498Oooo0o;
            composer.Oooo0o0();
            o00O0OO.OooO00o(null, u.OooO0O0(composer).OooO0oO(), R.drawable.event_preview_close, new OooO00o(context), null, null, u.OooO0O0(composer).OooOo00(), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, composer, 0, 0, 1969);
            ArrayList<SquareEventRoomModel> roomListSquare = eventRoomPreviewViewModel.getRoomListSquare();
            if (roomListSquare != null && !roomListSquare.isEmpty()) {
                Iterator<SquareEventRoomModel> it = roomListSquare.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    } else {
                        if (it.next().getRoomId() == eventRoomPreviewViewModel.getInitialPageRoomId()) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                o0O0O0O.OooOO0 oooOO0OooO00o = o0O0O0O.OooOOO0.OooO00o(i2, composer, 0);
                o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                o00OOOO0 o00oooo0OooO0o0 = SizeKt.OooO0o0(oooO00o);
                composer.OooO0o0(733328855);
                p048OoooooO.o00OO0OO o00oo0oo = o00OO0O0.OooO00o.f4172OooO0O0;
                o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00oo0oo, false, composer);
                composer.OooO0o0(-1323940314);
                o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6356OooO0o0;
                o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
                LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
                o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                Function0<o000000.OooO00o> function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o0);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function1);
                } else {
                    composer.Oooo00O();
                }
                composer.OooOo0O();
                Intrinsics.checkNotNullParameter(composer, "composer");
                ?? r15 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r15);
                ?? r3 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                oO00000o.OooO0O0(composer, oooO2, r3);
                ?? r5 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                oO00000o.OooO0O0(composer, layoutDirection2, r5);
                ?? r17 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                ((o00) function3OooO0O1).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo3, r17, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                f47289OooO00o.OooO0o0(oooOO0OooO00o, new OooO0O0(coroutineScope, oooOO0OooO00o), composer, 384);
                o00OOOO0 o00oooo0OooO = PaddingKt.OooO(SizeKt.OooO0o0(oooO00o), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 101, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 13);
                o0000O0 o0000o2 = o0000O0.f41691OooO00o;
                float f = 12;
                o00OOOO0 o00oooo0OooO0O1 = BackgroundKt.OooO0O0(o00oooo0OooO, o0000O0.f41693OooO0OO, o00O0O.OooO0o0(f, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 12));
                composer.OooO0o0(733328855);
                o000000 o000000VarOooO0Oo2 = p028Oooo0o0.oOO00O.OooO0Oo(o00oo0oo, false, composer);
                composer.OooO0o0(-1323940314);
                o0000O0O.OooO oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                LayoutDirection layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00OOOOo o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O2 = o00Oo0.OooO0O0(o00oooo0OooO0O1);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function1);
                } else {
                    composer.Oooo00O();
                }
                ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo2, r15, composer, oooO3, r3, composer, layoutDirection3, r5, composer, o00ooooo4, r17, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                Pager.OooO00o(roomListSquare.size(), null, oooOO0OooO00o, false, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, null, null, null, false, o00O0000.OooO00o(composer, -2038912721, new OooO0OO(roomListSquare, context, eventViewModel)), composer, 0, 6, 1018);
                o00OO0O.OooOO0O.OooO00o(composer);
            }
            o0O0OO0.OooO00o(composer);
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function4 = oo0o0O0.f29705OooO00o;
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0o(o00o0o01, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalPagerApi
    public final void OooO0o0(o0O0O0O.OooOO0 oooOO1, Function1<? super Integer, Unit> function1, oOO00O ooo00o, int i) {
        int i2;
        CreationExtras defaultViewModelCreationExtras;
        oOO00O ooo00o2;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(297259640);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(oooOO1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= ooo00oOooOOo.Oooo0oo(function1) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) == 18 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
            ooo00o2 = ooo00oOooOOo;
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            ooo00oOooOOo.OooO0o0(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(ooo00oOooOOo, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel(EventRoomPreviewViewModel.class, current, null, null, defaultViewModelCreationExtras, ooo00oOooOOo, 36936, 0);
            ooo00oOooOOo.Oooo0o0();
            ArrayList<SquareEventRoomModel> roomListSquare = ((EventRoomPreviewViewModel) viewModel).getRoomListSquare();
            if (roomListSquare == null) {
                oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOOO0(oooOO1, function1, i));
                return;
            }
            Context context = (Context) ooo00oOooOOo.OooOO0o(o0O0O00.f6591OooO0O0);
            long jOooOo00 = u.OooO0O0(ooo00oOooOOo).OooOo00();
            o00OOOO0 o00oooo0OooO0oO = SizeKt.OooO0oO(o00OOOO0.OooO00o.f4198Oooo0o, 109);
            o000OOo0 o000ooo0OooO00o = o00O0000.OooO00o(ooo00oOooOOo, 397738392, new OooO(oooOO1));
            u3 u3Var = u3.f47344OooO00o;
            ooo00o2 = ooo00oOooOOo;
            p479o0o00.OooO.OooO00o(oooOO1.OooO0o0(), o00oooo0OooO0oO, jOooOo00, 0L, 0, o000ooo0OooO00o, u3.f47346OooO0OO, o00O0000.OooO00o(ooo00o2, -1057353832, new OooOO0(roomListSquare, oooOO1, function1, i3, context)), ooo00o2, 14377008, 8);
        }
        oo0ooO oo0oooOooOo2 = ooo00o2.OooOo();
        if (oo0oooOooOo2 == null) {
            return;
        }
        oo0oooOooOo2.OooO00o(new OooOO0O(oooOO1, function1, i));
    }
}

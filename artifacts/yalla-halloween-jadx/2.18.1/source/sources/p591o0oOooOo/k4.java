package p591o0oOooOo;

import Oooo000.o00oO0o;
import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.platform.o0O0O00;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.booking.rtlviewpager.RtlViewPager;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.composable.event.EventKt;
import com.yalla.yalla.ui.fragment.EventMineFragment;
import com.yalla.yalla.ui.fragment.EventSquareFragment;
import com.yalla.yalla.ui.screen.event.EventPage;
import com.yalla.yalla.ui.vm.event.EventDisplayViewModel;
import com.yalla.yalla.ui.vm.event.EventViewModel;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o000O00;
import p028Oooo0o0.o0O000O;
import p028Oooo0o0.o0O0OO0;
import p028Oooo0o0.o0O0OOO0;
import p028Oooo0o0.oo00o;
import p031OoooO.o000O0O0;
import p031OoooO.o000Oo0;
import p031OoooO.o0OOO0o;
import p033OoooO00.o00O0O;
import p043OooooO0.o00;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o00OO0OO;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p142o00OOooO.oo000o;
import p145o00Oo0.o00000O0;
import p145o00Oo0.o000O0Oo;
import p145o00Oo0.o000OO;
import p254o00ooO0O.o000O0o;
import p261o00ooOoO.u;
import p263o00ooo.o000OO0O;
import p442o0OoOo0.Oooo000;
import p462o0Ooo0o.o0000O00;
import p507o0o00oOO.o0000O0;
import p522o0o0O0o.o00O000o;
import p549o0oO0O0o.o000O;
import p549o0oO0O0o.o000OO00;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final class k4 {

    public static final class OooO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f47262Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i) {
            super(2);
            this.f47262Oooo0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            k4.OooO0O0(ooo00o, this.f47262Oooo0o | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f47263Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i) {
            super(2);
            this.f47263Oooo0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            k4.OooO00o(ooo00o, this.f47263Oooo0o | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Context, RtlViewPager> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ EventDisplayViewModel f47264Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f47265Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<RtlViewPager> f47266Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(EventDisplayViewModel eventDisplayViewModel, FragmentActivity fragmentActivity, o0O00OO<RtlViewPager> o0o00oo2) {
            super(1);
            this.f47264Oooo0o = eventDisplayViewModel;
            this.f47265Oooo0oO = fragmentActivity;
            this.f47266Oooo0oo = o0o00oo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final RtlViewPager invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            RtlViewPager rtlViewPager = new RtlViewPager(it);
            EventDisplayViewModel eventDisplayViewModel = this.f47264Oooo0o;
            FragmentActivity fragmentActivity = this.f47265Oooo0oO;
            o0O00OO<RtlViewPager> o0o00oo2 = this.f47266Oooo0oo;
            List listMutableListOf = CollectionsKt.mutableListOf(new EventSquareFragment(), new EventMineFragment());
            rtlViewPager.setId(R.id.viewPagerId);
            rtlViewPager.setOffscreenPageLimit(listMutableListOf.size());
            rtlViewPager.setCurrentItem(!eventDisplayViewModel.isSquareState() ? 1 : 0);
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "context.supportFragmentManager");
            rtlViewPager.setAdapter(new o0000O00(supportFragmentManager, listMutableListOf));
            rtlViewPager.OooO0O0(new l4(listMutableListOf, eventDisplayViewModel));
            o0o00oo2.setValue(rtlViewPager);
            return rtlViewPager;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Object, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ EventDisplayViewModel f47267Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(EventDisplayViewModel eventDisplayViewModel) {
            super(1);
            this.f47267Oooo0o = eventDisplayViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            this.f47267Oooo0o.setEventPageState(EventPage.MineCreator);
            this.f47267Oooo0o.setSquareState(false);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f47268Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(2);
            this.f47268Oooo0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            k4.OooO00o(ooo00o, this.f47268Oooo0o | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Context f47269Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(Context context) {
            super(0);
            this.f47269Oooo0o = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Context context = this.f47269Oooo0o;
            if (context instanceof Activity) {
                ((Activity) context).onBackPressed();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ EventDisplayViewModel f47270Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(EventDisplayViewModel eventDisplayViewModel) {
            super(0);
            this.f47270Oooo0o = eventDisplayViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f47270Oooo0o.setSquareState(true);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ EventViewModel f47271Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f47272Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(EventViewModel eventViewModel, CoroutineScope coroutineScope) {
            super(0);
            this.f47271Oooo0o = eventViewModel;
            this.f47272Oooo0oO = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            OooOo.OooO0O0("101001");
            this.f47271Oooo0o.getShowLoadingDialog().setValue(Boolean.TRUE);
            BuildersKt__Builders_commonKt.launch$default(this.f47272Oooo0oO, null, null, new m4(this.f47271Oooo0o, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ EventDisplayViewModel f47273Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(EventDisplayViewModel eventDisplayViewModel) {
            super(0);
            this.f47273Oooo0o = eventDisplayViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f47273Oooo0o.setSquareState(false);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f47274Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(int i) {
            super(2);
            this.f47274Oooo0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            k4.OooO0OO(ooo00o, this.f47274Oooo0o | 1);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(oOO00O ooo00o, int i) {
        CreationExtras defaultViewModelCreationExtras;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(1748826958);
        if (i == 0 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o0O0O0o0<Context> o0o0o0o0 = o0O0O00.f6591OooO0O0;
            if (!(ooo00oOooOOo.OooOO0o(o0o0o0o0) instanceof FragmentActivity)) {
                oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO00o(i));
                return;
            }
            Object objOooOO0o = ooo00oOooOOo.OooOO0o(o0o0o0o0);
            Intrinsics.checkNotNull(objOooOO0o, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            FragmentActivity fragmentActivity = (FragmentActivity) objOooOO0o;
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
            ViewModel viewModel = ViewModelKt.viewModel(EventDisplayViewModel.class, current, null, null, defaultViewModelCreationExtras, ooo00oOooOOo, 36936, 0);
            ooo00oOooOOo.Oooo0o0();
            EventDisplayViewModel eventDisplayViewModel = (EventDisplayViewModel) viewModel;
            Object objOooO0O0 = o000O00.OooO0O0(ooo00oOooOOo, 1137657659, -492369756);
            oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
            Object obj = objOooO0O0;
            if (objOooO0O0 == c0323OooO00o) {
                o0O00OO o0o00ooOooO0Oo = o0OOO00.OooO0Oo(null);
                ooo00oOooOOo.Oooo00o(o0o00ooOooO0Oo);
                obj = o0o00ooOooO0Oo;
            }
            ooo00oOooOOo.Oooo0o0();
            o0O00OO o0o00oo2 = (o0O00OO) obj;
            RtlViewPager rtlViewPager = (RtlViewPager) o0o00oo2.getValue();
            if (rtlViewPager != null) {
                rtlViewPager.setCurrentItem(!eventDisplayViewModel.isSquareState() ? 1 : 0);
            }
            AndroidView_androidKt.OooO00o(new OooO0O0(eventDisplayViewModel, fragmentActivity, o0o00oo2), SizeKt.OooO0o0(o00OOOO0.OooO00o.f4198Oooo0o), null, ooo00oOooOOo, 48, 4);
            ooo00oOooOOo.Oooo0o0();
            Observable<Object> observable = LiveEventBus.get("EVENT_CREATE_SUCCESS");
            Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.EVENT_CREATE_SUCCESS)");
            ooo00oOooOOo.OooO0o0(1157296644);
            boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(eventDisplayViewModel);
            Object objOooO0o = ooo00oOooOOo.OooO0o();
            Object obj2 = objOooO0o;
            if (zOooo0oo || objOooO0o == c0323OooO00o) {
                OooO0OO oooO0OO = new OooO0OO(eventDisplayViewModel);
                ooo00oOooOOo.Oooo00o(oooO0OO);
                obj2 = oooO0OO;
            }
            ooo00oOooOOo.Oooo0o0();
            o00O000o.OooO00o(observable, new oo000o((Function1) obj2, 5), ooo00oOooOOo, 72);
        }
        oo0ooO oo0oooOooOo2 = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo2 == null) {
            return;
        }
        oo0oooOooOo2.OooO00o(new OooO0o(i));
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(@Nullable oOO00O ooo00o, int i) {
        CreationExtras defaultViewModelCreationExtras;
        oOO00O composer = ooo00o.OooOOo(341135094);
        if (i == 0 && composer.OooOo0()) {
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
            ViewModel viewModel = ViewModelKt.viewModel(EventViewModel.class, current, null, null, defaultViewModelCreationExtras, composer, 36936, 0);
            composer.Oooo0o0();
            EventViewModel eventViewModel = (EventViewModel) viewModel;
            o000O o000oOooO00o = o000OO00.OooO00o(composer);
            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
            o000oOooO00o.OooO00o(o0000O0.f41692OooO0O0, true, o000OO00.f44601OooO0O0);
            p504o0o00o0O.OooOo.OooO00o(eventViewModel.getShowLoadingDialog().getValue().booleanValue(), null, null, composer, 0, 6);
            EventKt.OooOOO0(eventViewModel.getShowAddToCalendarDialog(), (Context) composer.OooOO0o(o0O0O00.f6591OooO0O0), eventViewModel.getAddToCalendarEventModel(), composer, 576);
            o00OOOO0 o00oooo0OooO0o0 = SizeKt.OooO0o0(o00OOOO0.OooO00o.f4198Oooo0o);
            composer.OooO0o0(-483455358);
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000 o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, o00OO0O0.OooO00o.f4182OooOOO, composer);
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
            oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
            oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-1163856341);
            OooO0OO(composer, 0);
            OooO00o(composer, 0);
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
            composer.Oooo0o0();
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO(i));
    }

    /* JADX WARN: Type inference failed for: r26v1, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r2v24, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r3v10, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    /* JADX WARN: Type inference failed for: r9v7, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(oOO00O ooo00o, int i) {
        CreationExtras defaultViewModelCreationExtras;
        CreationExtras defaultViewModelCreationExtras2;
        long jOooO;
        long jOooO0o;
        oOO00O composer = ooo00o.OooOOo(738182540);
        if (i == 0 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            Context context = (Context) composer.OooOO0o(o0O0O00.f6591OooO0O0);
            Object objOooO0O0 = o000O00.OooO0O0(composer, 773894976, -492369756);
            Object obj = oOO00O.OooO00o.f29689OooO0O0;
            if (objOooO0O0 == obj) {
                objOooO0O0 = o00oO0o.OooO0OO(o00Oo00.OooO0oo(EmptyCoroutineContext.INSTANCE, composer), composer);
            }
            composer.Oooo0o0();
            CoroutineScope coroutineScope = ((o00OO0OO) objOooO0O0).f29498Oooo0o;
            composer.Oooo0o0();
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
            ViewModel viewModel = ViewModelKt.viewModel(EventDisplayViewModel.class, current, null, null, defaultViewModelCreationExtras, composer, 36936, 0);
            composer.Oooo0o0();
            EventDisplayViewModel eventDisplayViewModel = (EventDisplayViewModel) viewModel;
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
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            o00OOOO0 o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooO0oO(WindowInsetsPadding_androidKt.OooO0O0(SizeKt.OooO0o(oooO00o)), 50), u.OooO0O0(composer).OooOo00(), o000O0Oo.f32099OooO00o);
            OoooooO.o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4181OooOO0o;
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            Oooo0o0.o00O000.OooO0O0 oooO0O1 = p028Oooo0o0.o00O000.f2033OooO0o;
            o000000 o000000VarOooO0O0 = p139o00OOOo0.o0O0O00.OooO0O0(composer, 693286680, oooO0O1, oooO0O0, composer, -1323940314);
            o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6356OooO0o0;
            o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
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
            ?? r9 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
            oO00000o.OooO0O0(composer, o000000VarOooO0O0, r9);
            ?? r2 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
            oO00000o.OooO0O0(composer, oooO, r2);
            ?? r3 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
            oO00000o.OooO0O0(composer, layoutDirection, r3);
            ?? r26 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r26, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-678309503);
            float f = 8;
            o0O0OOO0.OooO00o(SizeKt.OooOO0o(oooO00o, f), composer, 6);
            o0OOO0o.OooO00o(o00000.OooO0O0.OooO00o(R.drawable.btn_return, composer), null, PaddingKt.OooO0o0(ClickableKt.OooO0Oo(Oooo000.OooO00o(SizeKt.OooOO0(oooO00o, 40), o00O0O.f3431OooO00o), false, new OooOO0(context), 7), f), u.OooO0O0(composer).OooO0o(), composer, 56, 0);
            o00OOOO0 o00oooo0OooO0Oo = SizeKt.OooO0Oo(oooO00o);
            Intrinsics.checkNotNullParameter(o00oooo0OooO0Oo, "<this>");
            if (!(((double) 1.0f) > 0.0d)) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
            }
            Function1<androidx.compose.ui.platform.o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
            Function1<androidx.compose.ui.platform.o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
            o00OOOO0 o00oooo0OooOOoo = o00oooo0OooO0Oo.OooOOoo(new o0O000O(true));
            o000000 o000000VarOooO0O1 = p139o00OOOo0.o0O0O00.OooO0O0(composer, 693286680, oooO0O1, oooO0O0, composer, -1323940314);
            o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooOOoo);
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
            ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0O1, r9, composer, oooO2, r2, composer, layoutDirection2, r3, composer, o00ooooo3, r26, composer, "composer", composer), composer, 0);
            String strOooO00o = p074o000O0oo.OooOOO.OooO00o(composer, 2058660585, -678309503, R.string.event_square_title, composer);
            long jOooO0OO = o0000O0O.o00Oo0.OooO0OO(17);
            if (eventDisplayViewModel.isSquareState()) {
                composer.OooO0o0(491962920);
                jOooO = u.OooO0O0(composer).OooO0o();
            } else {
                composer.OooO0o0(491962940);
                jOooO = u.OooO0O0(composer).OooO();
            }
            long j = jOooO;
            composer.Oooo0o0();
            composer.OooO0o0(1157296644);
            boolean zOooo0oo = composer.Oooo0oo(eventDisplayViewModel);
            Object objOooO0o = composer.OooO0o();
            if (zOooo0oo || objOooO0o == obj) {
                objOooO0o = new OooOO0O(eventDisplayViewModel);
                composer.Oooo00o(objOooO0o);
            }
            composer.Oooo0o0();
            o000O0O0.OooO0OO(strOooO00o, o000O0o.OooO0O0(oooO00o, false, false, null, (Function0) objOooO0o, 253), j, jOooO0OO, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 3072, 0, 65520);
            o0O0OOO0.OooO00o(SizeKt.OooOO0o(oooO00o, 23), composer, 6);
            String strOooO00o2 = o00000.OooO0OO.OooO00o(R.string.event_mine_title, composer);
            long jOooO0OO2 = o0000O0O.o00Oo0.OooO0OO(17);
            if (eventDisplayViewModel.isSquareState()) {
                composer.OooO0o0(491963301);
                jOooO0o = u.OooO0O0(composer).OooO();
            } else {
                composer.OooO0o0(491963321);
                jOooO0o = u.OooO0O0(composer).OooO0o();
            }
            long j2 = jOooO0o;
            composer.Oooo0o0();
            composer.OooO0o0(1157296644);
            boolean zOooo0oo2 = composer.Oooo0oo(eventDisplayViewModel);
            Object objOooO0o2 = composer.OooO0o();
            if (zOooo0oo2 || objOooO0o2 == obj) {
                objOooO0o2 = new OooOOO0(eventDisplayViewModel);
                composer.Oooo00o(objOooO0o2);
            }
            composer.Oooo0o0();
            o000O0O0.OooO0OO(strOooO00o2, o000O0o.OooO0O0(oooO00o, false, false, null, (Function0) objOooO0o2, 253), j2, jOooO0OO2, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 3072, 0, 65520);
            o0O0OO0.OooO00o(composer);
            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
            List colors = CollectionsKt.listOf((Object[]) new o00000O0[]{new o00000O0(o0000O0.f41798o00o0O), new o00000O0(o0000O0.f41710OooOo0)});
            Intrinsics.checkNotNullParameter(colors, "colors");
            long jOooO00o = o00O0O.OooOO0.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            long jOooO00o2 = o00O0O.OooOO0.OooO00o(Float.POSITIVE_INFINITY, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            Intrinsics.checkNotNullParameter(colors, "colors");
            o00OOOO0 o00oooo0OooO0Oo2 = ClickableKt.OooO0Oo(BackgroundKt.OooO00o(Oooo000.OooO00o(SizeKt.OooO0oO(SizeKt.OooOO0o(oooO00o, 42), 25), o00O0O.OooO0OO(13)), new o000OO(colors, jOooO00o, jOooO00o2, 0), null, 6), false, new OooOOO(eventViewModel, coroutineScope), 7);
            composer.OooO0o0(733328855);
            o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
            composer.OooO0o0(-1323940314);
            o0000O0O.OooO oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            LayoutDirection layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o00OOOOo o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O2 = o00Oo0.OooO0O0(o00oooo0OooO0Oo2);
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
            ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r9, composer, oooO3, r2, composer, layoutDirection3, r3, composer, o00ooooo4, r26, composer, "composer", composer), composer, 0);
            o000OO0O o000oo0oOooO00o = com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -2137368960, R.drawable.ic_event_create_title, composer);
            o00OOOO0 o00oooo0OooOO0 = SizeKt.OooOO0(oooO00o, 15);
            p048OoooooO.o00OO0OO alignment = o00OO0O0.OooO00o.f4175OooO0o;
            Intrinsics.checkNotNullParameter(o00oooo0OooOO0, "<this>");
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            Function1<androidx.compose.ui.platform.o00O000o, Unit> function4 = o00oOoo.f6560OooO00o;
            Function1<androidx.compose.ui.platform.o00O000o, Unit> function5 = o00oOoo.f6560OooO00o;
            Oooo0.o00.OooO00o(o000oo0oOooO00o, null, o00oooo0OooOO0.OooOOoo(new p028Oooo0o0.o00O00O(alignment, false)), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 56, 120);
            o0O0OO0.OooO00o(composer);
            o0O0OOO0.OooO00o(SizeKt.OooOO0o(oooO00o, 10), composer, 6);
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
            composer.Oooo0o0();
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOOOO(i));
    }
}

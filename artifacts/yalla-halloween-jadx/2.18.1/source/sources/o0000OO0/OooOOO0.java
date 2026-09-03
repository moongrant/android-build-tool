package o0000OO0;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1;
import androidx.compose.ui.window.PopupLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import o0O0O00.OooOo00;
import o0O0O00.o000000;
import o0O0O00.o000000O;
import o0O0O00.o00000O0;
import o0O0O00.o000O000;
import o0O0O00.o000OOo;
import o0O0O00.o0O0O00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p043OooooO0.o00;
import p043OooooO0.o000OOo0;
import p043OooooO0.o00O0000;
import p045OooooOo.o00O0;
import p100o000oOoO.o;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o00O0OOO;
import p100o000oOoO.o00OO0O0;
import p100o000oOoO.o00OOOO0;
import p100o000oOoO.o00OOOOo;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.o0o0Oo;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O0O0o0<String> f27447OooO00o = (o00OOOOo) o00OO0O0.OooO0O0(o.f29323OooO00o, OooO00o.f27450Oooo0o);

    public static final class OooO extends Lambda implements Function1<o00OOOO0, o0o0Oo> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ PopupLayout f27448Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0OO00O f27449Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(PopupLayout popupLayout, o0OO00O o0oo00o2) {
            super(1);
            this.f27448Oooo0o = popupLayout;
            this.f27449Oooo0oO = o0oo00o2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final o0o0Oo invoke(o00OOOO0 o00oooo1) {
            o00OOOO0 DisposableEffect = o00oooo1;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            this.f27448Oooo0o.setPositionProvider(this.f27449Oooo0oO);
            this.f27448Oooo0o.OooOOOo();
            return new o0000OO0.OooOOOO();
        }
    }

    public static final class OooO00o extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f27450Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ oo0o0Oo f27451Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ p048OoooooO.o00OO0O0 f27452Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ long f27453Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f27454Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f27455OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Function2<oOO00O, Integer, Unit> f27456OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ int f27457OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(p048OoooooO.o00OO0O0 o00oo0o1, long j, Function0<Unit> function0, oo0o0Oo oo0o0oo, Function2<? super oOO00O, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            this.f27452Oooo0o = o00oo0o1;
            this.f27453Oooo0oO = j;
            this.f27454Oooo0oo = function0;
            this.f27451Oooo = oo0o0oo;
            this.f27456OoooO00 = function2;
            this.f27455OoooO0 = i;
            this.f27457OoooO0O = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            OooOOO0.OooO0O0(this.f27452Oooo0o, this.f27453Oooo0oO, this.f27454Oooo0oo, this.f27451Oooo, this.f27456OoooO00, ooo00o, this.f27455OoooO0 | 1, this.f27457OoooO0O);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<o00OOOO0, o0o0Oo> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f27458Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ PopupLayout f27459Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f27460Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ oo0o0Oo f27461Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ LayoutDirection f27462OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(PopupLayout popupLayout, Function0<Unit> function0, oo0o0Oo oo0o0oo, String str, LayoutDirection layoutDirection) {
            super(1);
            this.f27459Oooo0o = popupLayout;
            this.f27460Oooo0oO = function0;
            this.f27461Oooo0oo = oo0o0oo;
            this.f27458Oooo = str;
            this.f27462OoooO00 = layoutDirection;
        }

        @Override // kotlin.jvm.functions.Function1
        public final o0o0Oo invoke(o00OOOO0 o00oooo1) {
            o00OOOO0 DisposableEffect = o00oooo1;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            PopupLayout popupLayout = this.f27459Oooo0o;
            popupLayout.f6744OoooOo0.addView(popupLayout, popupLayout.com.facebook.internal.NativeProtocol.WEB_DIALOG_PARAMS java.lang.String);
            this.f27459Oooo0o.OooOOO0(this.f27460Oooo0oO, this.f27461Oooo0oo, this.f27458Oooo, this.f27462OoooO00);
            return new o0000OO0.OooOOO(this.f27459Oooo0o);
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f27463Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ PopupLayout f27464Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f27465Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ oo0o0Oo f27466Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ LayoutDirection f27467OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(PopupLayout popupLayout, Function0<Unit> function0, oo0o0Oo oo0o0oo, String str, LayoutDirection layoutDirection) {
            super(0);
            this.f27464Oooo0o = popupLayout;
            this.f27465Oooo0oO = function0;
            this.f27466Oooo0oo = oo0o0oo;
            this.f27463Oooo = str;
            this.f27467OoooO00 = layoutDirection;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f27464Oooo0o.OooOOO0(this.f27465Oooo0oO, this.f27466Oooo0oo, this.f27463Oooo, this.f27467OoooO00);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5", f = "AndroidPopup.android.kt", i = {0}, l = {299}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
    public static final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f27468Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f27469Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ PopupLayout f27470Oooo0oo;

        public static final class OooO00o extends Lambda implements Function1<Long, Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public static final OooO00o f27471Oooo0o = new OooO00o();

            public OooO00o() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                l.longValue();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(PopupLayout popupLayout, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f27470Oooo0oo = popupLayout;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0 oooOO1 = new OooOO0(this.f27470Oooo0oo, continuation);
            oooOO1.f27469Oooo0oO = obj;
            return oooOO1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x002b  */
        /* JADX WARN: Code duplicated, block: B:13:0x003f  */
        /* JADX WARN: Code duplicated, block: B:14:0x0044  */
        /* JADX WARN: Code duplicated, block: B:16:0x0050 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x0065  */
        /* JADX WARN: Code duplicated, block: B:21:0x0069  */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x002b
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.f27468Oooo0o
                r2 = 1
                if (r1 == 0) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r1 = r9.f27469Oooo0oO
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.ResultKt.throwOnFailure(r10)
                r10 = r9
                goto L51
            L14:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1c:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r10 = r9.f27469Oooo0oO
                kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
                r1 = r10
                r10 = r9
            L25:
                boolean r3 = kotlinx.coroutines.CoroutineScopeKt.isActive(r1)
                if (r3 == 0) goto L6d
                o0000OO0.OooOOO0$OooOO0$OooO00o r3 = o0000OO0.OooOOO0.OooOO0.OooO00o.f27471Oooo0o
                r10.f27469Oooo0oO = r1
                r10.f27468Oooo0o = r2
                kotlin.coroutines.CoroutineContext r4 = r10.getContext()
                androidx.compose.ui.platform.o00$OooO00o r5 = androidx.compose.ui.platform.o00.OooO00o.f6349Oooo0o
                kotlin.coroutines.CoroutineContext$Element r4 = r4.get(r5)
                androidx.compose.ui.platform.o00 r4 = (androidx.compose.ui.platform.o00) r4
                if (r4 != 0) goto L44
                java.lang.Object r3 = p100o000oOoO.o0O00.OooO0O0(r3, r10)
                goto L4e
            L44:
                androidx.compose.ui.platform.o00O0000 r5 = new androidx.compose.ui.platform.o00O0000
                r6 = 0
                r5.<init>(r3, r6)
                java.lang.Object r3 = r4.OooO0Oo()
            L4e:
                if (r3 != r0) goto L51
                return r0
            L51:
                androidx.compose.ui.window.PopupLayout r3 = r10.f27470Oooo0oo
                int[] r4 = r3.f6755Ooooooo
                r5 = 0
                r6 = r4[r5]
                r7 = r4[r2]
                android.view.View r8 = r3.f6742OoooOOO
                r8.getLocationOnScreen(r4)
                int[] r4 = r3.f6755Ooooooo
                r5 = r4[r5]
                if (r6 != r5) goto L69
                r4 = r4[r2]
                if (r7 == r4) goto L25
            L69:
                r3.OooOOO()
                goto L25
            L6d:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: o0000OO0.OooOOO0.OooOO0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<o0O0O00.Oooo000, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ PopupLayout f27472Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(PopupLayout popupLayout) {
            super(1);
            this.f27472Oooo0o = popupLayout;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0O0O00.Oooo000 oooo000) {
            o0O0O00.Oooo000 childCoordinates = oooo000;
            Intrinsics.checkNotNullParameter(childCoordinates, "childCoordinates");
            o0O0O00.Oooo000 oooo000Oooo0oo = childCoordinates.Oooo0oo();
            Intrinsics.checkNotNull(oooo000Oooo0oo);
            this.f27472Oooo0o.OooOOOO(oooo000Oooo0oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function2<oOO00O, Integer, Unit> f27473Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0OO00O f27474Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f27475Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ oo0o0Oo f27476Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f27477OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f27478OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOOO(o0OO00O o0oo00o2, Function0<Unit> function0, oo0o0Oo oo0o0oo, Function2<? super oOO00O, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            this.f27474Oooo0o = o0oo00o2;
            this.f27475Oooo0oO = function0;
            this.f27476Oooo0oo = oo0o0oo;
            this.f27473Oooo = function2;
            this.f27478OoooO00 = i;
            this.f27477OoooO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            OooOOO0.OooO00o(this.f27474Oooo0o, this.f27475Oooo0oO, this.f27476Oooo0oo, this.f27473Oooo, ooo00o, this.f27478OoooO00 | 1, this.f27477OoooO0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o0000OO0.OooOOO0$OooOOO0, reason: collision with other inner class name */
    public static final class C0291OooOOO0 implements o000000 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ PopupLayout f27479OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ LayoutDirection f27480OooO0O0;

        /* JADX INFO: renamed from: o0000OO0.OooOOO0$OooOOO0$OooO00o */
        public static final class OooO00o extends Lambda implements Function1<o000O000.OooO00o, Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public static final OooO00o f27481Oooo0o = new OooO00o();

            public OooO00o() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(o000O000.OooO00o oooO00o) {
                o000O000.OooO00o layout = oooO00o;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                return Unit.INSTANCE;
            }
        }

        public C0291OooOOO0(PopupLayout popupLayout, LayoutDirection layoutDirection) {
            this.f27479OooO00o = popupLayout;
            this.f27480OooO0O0 = layoutDirection;
        }

        @Override // o0O0O00.o000000
        @NotNull
        public final o000000O OooO00o(@NotNull o00000O0 Layout, @NotNull List<? extends o0O0O00.o0O0O00> list, long j) {
            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
            Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
            this.f27479OooO00o.setParentLayoutDirection(this.f27480OooO0O0);
            return Layout.OooOooo(0, 0, MapsKt.emptyMap(), OooO00o.f27481Oooo0o);
        }

        @Override // o0O0O00.o000000
        public final /* synthetic */ int OooO0O0(o0O0O00.OooOo00 oooOo00, List list, int i) {
            return o000OOo.OooO0Oo(this, oooOo00, list, i);
        }

        @Override // o0O0O00.o000000
        public final /* synthetic */ int OooO0OO(o0O0O00.OooOo00 oooOo00, List list, int i) {
            return o000OOo.OooO0O0(this, oooOo00, list, i);
        }

        @Override // o0O0O00.o000000
        public final /* synthetic */ int OooO0Oo(o0O0O00.OooOo00 oooOo00, List list, int i) {
            return o000OOo.OooO00o(this, oooOo00, list, i);
        }

        @Override // o0O0O00.o000000
        public final /* synthetic */ int OooO0o0(o0O0O00.OooOo00 oooOo00, List list, int i) {
            return o000OOo.OooO0OO(this, oooOo00, list, i);
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<UUID> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOOOO f27482Oooo0o = new OooOOOO();

        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ PopupLayout f27483Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<Function2<oOO00O, Integer, Unit>> f27484Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOo00(PopupLayout popupLayout, oO0Oo<? extends Function2<? super oOO00O, ? super Integer, Unit>> oo0oo) {
            super(2);
            this.f27483Oooo0o = popupLayout;
            this.f27484Oooo0oO = oo0oo;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            oOO00O composer = ooo00o;
            if ((num.intValue() & 11) == 2 && composer.OooOo0()) {
                composer.OooOoo0();
            } else {
                p048OoooooO.o00OOOO0 o00oooo0OooO00o = p442o0OoOo0.OooOOOO.OooO00o(OnRemeasuredModifierKt.OooO00o(SemanticsModifierKt.OooO00o(OoooooO.o00OOOO0.OooO00o.f4198Oooo0o, false, o0000OO0.OooOo00.f27486Oooo0o), new OooOo(this.f27483Oooo0o)), this.f27483Oooo0o.getCanCalculatePosition() ? 1.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                o000OOo0 o000ooo0OooO00o = o00O0000.OooO00o(composer, 606497925, new Oooo000(this.f27484Oooo0oO));
                composer.OooO0o0(1406149896);
                AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = new o000000() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1
                    @Override // o0O0O00.o000000
                    @NotNull
                    public final o000000O OooO00o(@NotNull o00000O0 Layout, @NotNull List<? extends o0O0O00> measurables, long j) {
                        int i;
                        int i2;
                        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                        int size = measurables.size();
                        if (size == 0) {
                            return Layout.OooOooo(0, 0, MapsKt.emptyMap(), new Function1<o000O000.OooO00o, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$1
                                @Override // kotlin.jvm.functions.Function1
                                public final Unit invoke(o000O000.OooO00o oooO00o) {
                                    o000O000.OooO00o layout = oooO00o;
                                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                    return Unit.INSTANCE;
                                }
                            });
                        }
                        int i3 = 0;
                        if (size == 1) {
                            final o000O000 o000o000Oooo000 = measurables.get(0).Oooo000(j);
                            return Layout.OooOooo(o000o000Oooo000.f35265Oooo0o, o000o000Oooo000.f35266Oooo0oO, MapsKt.emptyMap(), new Function1<o000O000.OooO00o, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$2
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Unit invoke(o000O000.OooO00o oooO00o) {
                                    o000O000.OooO00o layout = oooO00o;
                                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                    o000O000.OooO00o.OooO0oO(layout, o000o000Oooo000, 0, 0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
                                    return Unit.INSTANCE;
                                }
                            });
                        }
                        final ArrayList arrayList = new ArrayList(measurables.size());
                        int size2 = measurables.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            arrayList.add(measurables.get(i4).Oooo000(j));
                        }
                        int lastIndex = CollectionsKt.getLastIndex(arrayList);
                        if (lastIndex >= 0) {
                            int iMax = 0;
                            int iMax2 = 0;
                            while (true) {
                                o000O000 o000o001 = (o000O000) arrayList.get(i3);
                                iMax = Math.max(iMax, o000o001.f35265Oooo0o);
                                iMax2 = Math.max(iMax2, o000o001.f35266Oooo0oO);
                                if (i3 == lastIndex) {
                                    break;
                                }
                                i3++;
                            }
                            i = iMax;
                            i2 = iMax2;
                        } else {
                            i = 0;
                            i2 = 0;
                        }
                        return Layout.OooOooo(i, i2, MapsKt.emptyMap(), new Function1<o000O000.OooO00o, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Unit invoke(o000O000.OooO00o oooO00o) {
                                o000O000.OooO00o layout = oooO00o;
                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                int lastIndex2 = CollectionsKt.getLastIndex(arrayList);
                                if (lastIndex2 >= 0) {
                                    int i5 = 0;
                                    while (true) {
                                        o000O000.OooO00o.OooO0oO(layout, arrayList.get(i5), 0, 0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
                                        if (i5 == lastIndex2) {
                                            break;
                                        }
                                        i5++;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    }

                    @Override // o0O0O00.o000000
                    public final /* synthetic */ int OooO0O0(OooOo00 oooOo00, List list, int i) {
                        return o000OOo.OooO0Oo(this, oooOo00, list, i);
                    }

                    @Override // o0O0O00.o000000
                    public final /* synthetic */ int OooO0OO(OooOo00 oooOo00, List list, int i) {
                        return o000OOo.OooO0O0(this, oooOo00, list, i);
                    }

                    @Override // o0O0O00.o000000
                    public final /* synthetic */ int OooO0Oo(OooOo00 oooOo00, List list, int i) {
                        return o000OOo.OooO00o(this, oooOo00, list, i);
                    }

                    @Override // o0O0O00.o000000
                    public final /* synthetic */ int OooO0o0(OooOo00 oooOo00, List list, int i) {
                        return o000OOo.OooO0OO(this, oooOo00, list, i);
                    }
                };
                composer.OooO0o0(-1323940314);
                o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
                LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
                androidx.compose.ui.platform.o00OOOOo o00ooooo2 = (androidx.compose.ui.platform.o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO00o);
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
                oO00000o.OooO0O0(composer, androidPopup_androidKt$SimpleStack$1, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
                oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
                oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                ((o00) o000ooo0OooO00o).invoke(composer, 6);
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bc A[PHI: r2
      0x00bc: PHI (r2v13 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r2v3 kotlin.jvm.functions.Function0<kotlin.Unit>), (r2v2 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:60:0x00a8, B:56:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x010b  */
    /* JADX WARN: Code duplicated, block: B:66:0x013d  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x01be  */
    /* JADX WARN: Code duplicated, block: B:77:0x0210  */
    /* JADX WARN: Code duplicated, block: B:79:0x0222  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v39, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void OooO00o(@NotNull o0OO00O popupPositionProvider, @Nullable Function0<Unit> function0, @Nullable oo0o0Oo oo0o0oo, @NotNull Function2<? super oOO00O, ? super Integer, Unit> content, @Nullable oOO00O ooo00o, int i, int i2) {
        int i3;
        Function0<Unit> function1;
        oo0o0Oo oo0o0oo2;
        int i4;
        oo0o0Oo oo0o0oo3;
        Function0<Unit> function2;
        View view;
        o0000O0O.OooO oooO;
        String str;
        o00O0OOO o00o0oooOooO0O0;
        oO0Oo oo0ooOooO0o;
        UUID popupId;
        Object objOooO0o;
        C0291OooOOO0 c0291OooOOO0;
        o0000O0O.OooO oooO2;
        LayoutDirection layoutDirection;
        androidx.compose.ui.platform.o00OOOOo o00ooooo2;
        Function0<o000000.OooO00o> function3;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0;
        oo0ooO oo0oooOooOo;
        Intrinsics.checkNotNullParameter(popupPositionProvider, "popupPositionProvider");
        Intrinsics.checkNotNullParameter(content, "content");
        oOO00O composer = ooo00o.OooOOo(-830247068);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composer.Oooo0oo(popupPositionProvider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 112) == 0) {
                function1 = function0;
                i3 |= composer.Oooo0oo(function1) ? 32 : 16;
            }
            if ((i & 896) == 0) {
                if ((i2 & 4) == 0) {
                    oo0o0oo2 = oo0o0oo;
                    int i6 = composer.Oooo0oo(oo0o0oo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    oo0o0oo2 = oo0o0oo;
                }
                i3 |= i6;
            } else {
                oo0o0oo2 = oo0o0oo;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (composer.Oooo0oo(content)) {
                    i4 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            if ((i3 & 5851) == 1170 || !composer.OooOo0()) {
                composer.OooOOo0();
                if ((i & 1) != 0 || composer.Oooo000()) {
                    if (i5 != 0) {
                        function1 = null;
                    }
                    if ((i2 & 4) != 0) {
                        oo0o0oo3 = new oo0o0Oo(false, false, false, false, 63);
                        function2 = function1;
                    }
                    composer.Oooo0oO();
                    view = (View) composer.OooOO0o(androidx.compose.ui.platform.o0O0O00.f6594OooO0o);
                    o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6356OooO0o0;
                    oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    str = (String) composer.OooOO0o(f27447OooO00o);
                    o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
                    LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00o0oooOooO0O0 = o00O00O.OooO0O0(composer);
                    oo0ooOooO0o = o0OOO00.OooO0o(content, composer);
                    popupId = (UUID) o00O0.OooO00o(new Object[0], null, OooOOOO.f27482Oooo0o, composer, 6);
                    composer.OooO0o0(-492369756);
                    objOooO0o = composer.OooO0o();
                    if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                        Intrinsics.checkNotNullExpressionValue(popupId, "popupId");
                        PopupLayout popupLayout = new PopupLayout(function2, oo0o0oo3, str, view, oooO, popupPositionProvider, popupId);
                        popupLayout.OooOO0o(o00o0oooOooO0O0, o00O0000.OooO0O0(1302892335, true, new OooOo00(popupLayout, oo0ooOooO0o)));
                        composer.Oooo00o(popupLayout);
                        objOooO0o = popupLayout;
                    }
                    composer.Oooo0o0();
                    PopupLayout popupLayout2 = (PopupLayout) objOooO0o;
                    Function0<Unit> function4 = function2;
                    oo0o0Oo oo0o0oo4 = oo0o0oo3;
                    o00Oo00.OooO0O0(popupLayout2, new OooO0OO(popupLayout2, function4, oo0o0oo4, str, layoutDirection2), composer);
                    o00Oo00.OooO0oO(new OooO0o(popupLayout2, function4, oo0o0oo4, str, layoutDirection2), composer);
                    o00Oo00.OooO0O0(popupPositionProvider, new OooO(popupLayout2, popupPositionProvider), composer);
                    o00Oo00.OooO0o0(popupLayout2, new OooOO0(popupLayout2, null), composer);
                    p048OoooooO.o00OOOO0 o00oooo0OooO00o = OnGloballyPositionedModifierKt.OooO00o(OoooooO.o00OOOO0.OooO00o.f4198Oooo0o, new OooOO0O(popupLayout2));
                    c0291OooOOO0 = new C0291OooOOO0(popupLayout2, layoutDirection2);
                    composer.OooO0o0(-1323940314);
                    oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo2 = (androidx.compose.ui.platform.o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
                    Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                    function3 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                    function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO00o);
                    if (composer.OooOo0o() instanceof o00O000) {
                        o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function3);
                    } else {
                        composer.Oooo00O();
                    }
                    composer.OooOo0O();
                    Intrinsics.checkNotNullParameter(composer, "composer");
                    oO00000o.OooO0O0(composer, c0291OooOOO0, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
                    oO00000o.OooO0O0(composer, oooO2, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
                    oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
                    ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(2085825549);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    function1 = function2;
                    oo0o0oo2 = oo0o0oo3;
                } else {
                    composer.OooOoo0();
                }
                function2 = function1;
                oo0o0oo3 = oo0o0oo2;
                composer.Oooo0oO();
                view = (View) composer.OooOO0o(androidx.compose.ui.platform.o0O0O00.f6594OooO0o);
                o0O0O0o0<o0000O0O.OooO> o0o0o0o2 = o000.f6356OooO0o0;
                oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o2);
                str = (String) composer.OooOO0o(f27447OooO00o);
                o0O0O0o0<LayoutDirection> o0o0o0o3 = o000.f6360OooOO0O;
                LayoutDirection layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o3);
                o00o0oooOooO0O0 = o00O00O.OooO0O0(composer);
                oo0ooOooO0o = o0OOO00.OooO0o(content, composer);
                popupId = (UUID) o00O0.OooO00o(new Object[0], null, OooOOOO.f27482Oooo0o, composer, 6);
                composer.OooO0o0(-492369756);
                objOooO0o = composer.OooO0o();
                if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                    Intrinsics.checkNotNullExpressionValue(popupId, "popupId");
                    PopupLayout popupLayout3 = new PopupLayout(function2, oo0o0oo3, str, view, oooO, popupPositionProvider, popupId);
                    popupLayout3.OooOO0o(o00o0oooOooO0O0, o00O0000.OooO0O0(1302892335, true, new OooOo00(popupLayout3, oo0ooOooO0o)));
                    composer.Oooo00o(popupLayout3);
                    objOooO0o = popupLayout3;
                }
                composer.Oooo0o0();
                PopupLayout popupLayout4 = (PopupLayout) objOooO0o;
                Function0<Unit> function5 = function2;
                oo0o0Oo oo0o0oo5 = oo0o0oo3;
                o00Oo00.OooO0O0(popupLayout4, new OooO0OO(popupLayout4, function5, oo0o0oo5, str, layoutDirection3), composer);
                o00Oo00.OooO0oO(new OooO0o(popupLayout4, function5, oo0o0oo5, str, layoutDirection3), composer);
                o00Oo00.OooO0O0(popupPositionProvider, new OooO(popupLayout4, popupPositionProvider), composer);
                o00Oo00.OooO0o0(popupLayout4, new OooOO0(popupLayout4, null), composer);
                p048OoooooO.o00OOOO0 o00oooo0OooO00o2 = OnGloballyPositionedModifierKt.OooO00o(OoooooO.o00OOOO0.OooO00o.f4198Oooo0o, new OooOO0O(popupLayout4));
                c0291OooOOO0 = new C0291OooOOO0(popupLayout4, layoutDirection3);
                composer.OooO0o0(-1323940314);
                oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o2);
                layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o3);
                o00ooooo2 = (androidx.compose.ui.platform.o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                function3 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO00o2);
                if (composer.OooOo0o() instanceof o00O000) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function3);
                } else {
                    composer.Oooo00O();
                }
                composer.OooOo0O();
                Intrinsics.checkNotNullParameter(composer, "composer");
                oO00000o.OooO0O0(composer, c0291OooOOO0, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
                oO00000o.OooO0O0(composer, oooO2, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
                oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(2085825549);
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                function1 = function2;
                oo0o0oo2 = oo0o0oo3;
            } else {
                composer.OooOoo0();
            }
            oo0oooOooOo = composer.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooOOO(popupPositionProvider, function1, oo0o0oo2, content, i, i2));
        }
        i3 |= 48;
        function1 = function0;
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                oo0o0oo2 = oo0o0oo;
                if (composer.Oooo0oo(oo0o0oo2)) {
                }
                i3 |= i6;
            } else {
                oo0o0oo2 = oo0o0oo;
            }
            i3 |= i6;
        } else {
            oo0o0oo2 = oo0o0oo;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (composer.Oooo0oo(content)) {
                i4 = RecyclerView.oo0o0Oo.FLAG_MOVED;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 5851) == 1170) {
            composer.OooOOo0();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    function1 = null;
                }
                if ((i2 & 4) != 0) {
                    oo0o0oo3 = new oo0o0Oo(false, false, false, false, 63);
                    function2 = function1;
                } else {
                    function2 = function1;
                    oo0o0oo3 = oo0o0oo2;
                }
            } else {
                if (i5 != 0) {
                    function1 = null;
                }
                if ((i2 & 4) != 0) {
                    oo0o0oo3 = new oo0o0Oo(false, false, false, false, 63);
                    function2 = function1;
                } else {
                    function2 = function1;
                    oo0o0oo3 = oo0o0oo2;
                }
            }
            composer.Oooo0oO();
            view = (View) composer.OooOO0o(androidx.compose.ui.platform.o0O0O00.f6594OooO0o);
            o0O0O0o0<o0000O0O.OooO> o0o0o0o4 = o000.f6356OooO0o0;
            oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o4);
            str = (String) composer.OooOO0o(f27447OooO00o);
            o0O0O0o0<LayoutDirection> o0o0o0o5 = o000.f6360OooOO0O;
            LayoutDirection layoutDirection4 = (LayoutDirection) composer.OooOO0o(o0o0o0o5);
            o00o0oooOooO0O0 = o00O00O.OooO0O0(composer);
            oo0ooOooO0o = o0OOO00.OooO0o(content, composer);
            popupId = (UUID) o00O0.OooO00o(new Object[0], null, OooOOOO.f27482Oooo0o, composer, 6);
            composer.OooO0o0(-492369756);
            objOooO0o = composer.OooO0o();
            if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                Intrinsics.checkNotNullExpressionValue(popupId, "popupId");
                PopupLayout popupLayout5 = new PopupLayout(function2, oo0o0oo3, str, view, oooO, popupPositionProvider, popupId);
                popupLayout5.OooOO0o(o00o0oooOooO0O0, o00O0000.OooO0O0(1302892335, true, new OooOo00(popupLayout5, oo0ooOooO0o)));
                composer.Oooo00o(popupLayout5);
                objOooO0o = popupLayout5;
            }
            composer.Oooo0o0();
            PopupLayout popupLayout6 = (PopupLayout) objOooO0o;
            Function0<Unit> function6 = function2;
            oo0o0Oo oo0o0oo6 = oo0o0oo3;
            o00Oo00.OooO0O0(popupLayout6, new OooO0OO(popupLayout6, function6, oo0o0oo6, str, layoutDirection4), composer);
            o00Oo00.OooO0oO(new OooO0o(popupLayout6, function6, oo0o0oo6, str, layoutDirection4), composer);
            o00Oo00.OooO0O0(popupPositionProvider, new OooO(popupLayout6, popupPositionProvider), composer);
            o00Oo00.OooO0o0(popupLayout6, new OooOO0(popupLayout6, null), composer);
            p048OoooooO.o00OOOO0 o00oooo0OooO00o3 = OnGloballyPositionedModifierKt.OooO00o(OoooooO.o00OOOO0.OooO00o.f4198Oooo0o, new OooOO0O(popupLayout6));
            c0291OooOOO0 = new C0291OooOOO0(popupLayout6, layoutDirection4);
            composer.OooO0o0(-1323940314);
            oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o4);
            layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o5);
            o00ooooo2 = (androidx.compose.ui.platform.o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            function3 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO00o3);
            if (composer.OooOo0o() instanceof o00O000) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function3);
            } else {
                composer.Oooo00O();
            }
            composer.OooOo0O();
            Intrinsics.checkNotNullParameter(composer, "composer");
            oO00000o.OooO0O0(composer, c0291OooOOO0, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
            oO00000o.OooO0O0(composer, oooO2, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(2085825549);
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
            function1 = function2;
            oo0o0oo2 = oo0o0oo3;
        } else {
            composer.OooOOo0();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    function1 = null;
                }
                if ((i2 & 4) != 0) {
                    oo0o0oo3 = new oo0o0Oo(false, false, false, false, 63);
                    function2 = function1;
                } else {
                    function2 = function1;
                    oo0o0oo3 = oo0o0oo2;
                }
            } else {
                if (i5 != 0) {
                    function1 = null;
                }
                if ((i2 & 4) != 0) {
                    oo0o0oo3 = new oo0o0Oo(false, false, false, false, 63);
                    function2 = function1;
                } else {
                    function2 = function1;
                    oo0o0oo3 = oo0o0oo2;
                }
            }
            composer.Oooo0oO();
            view = (View) composer.OooOO0o(androidx.compose.ui.platform.o0O0O00.f6594OooO0o);
            o0O0O0o0<o0000O0O.OooO> o0o0o0o6 = o000.f6356OooO0o0;
            oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o6);
            str = (String) composer.OooOO0o(f27447OooO00o);
            o0O0O0o0<LayoutDirection> o0o0o0o7 = o000.f6360OooOO0O;
            LayoutDirection layoutDirection5 = (LayoutDirection) composer.OooOO0o(o0o0o0o7);
            o00o0oooOooO0O0 = o00O00O.OooO0O0(composer);
            oo0ooOooO0o = o0OOO00.OooO0o(content, composer);
            popupId = (UUID) o00O0.OooO00o(new Object[0], null, OooOOOO.f27482Oooo0o, composer, 6);
            composer.OooO0o0(-492369756);
            objOooO0o = composer.OooO0o();
            if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                Intrinsics.checkNotNullExpressionValue(popupId, "popupId");
                PopupLayout popupLayout7 = new PopupLayout(function2, oo0o0oo3, str, view, oooO, popupPositionProvider, popupId);
                popupLayout7.OooOO0o(o00o0oooOooO0O0, o00O0000.OooO0O0(1302892335, true, new OooOo00(popupLayout7, oo0ooOooO0o)));
                composer.Oooo00o(popupLayout7);
                objOooO0o = popupLayout7;
            }
            composer.Oooo0o0();
            PopupLayout popupLayout8 = (PopupLayout) objOooO0o;
            Function0<Unit> function7 = function2;
            oo0o0Oo oo0o0oo7 = oo0o0oo3;
            o00Oo00.OooO0O0(popupLayout8, new OooO0OO(popupLayout8, function7, oo0o0oo7, str, layoutDirection5), composer);
            o00Oo00.OooO0oO(new OooO0o(popupLayout8, function7, oo0o0oo7, str, layoutDirection5), composer);
            o00Oo00.OooO0O0(popupPositionProvider, new OooO(popupLayout8, popupPositionProvider), composer);
            o00Oo00.OooO0o0(popupLayout8, new OooOO0(popupLayout8, null), composer);
            p048OoooooO.o00OOOO0 o00oooo0OooO00o4 = OnGloballyPositionedModifierKt.OooO00o(OoooooO.o00OOOO0.OooO00o.f4198Oooo0o, new OooOO0O(popupLayout8));
            c0291OooOOO0 = new C0291OooOOO0(popupLayout8, layoutDirection5);
            composer.OooO0o0(-1323940314);
            oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o6);
            layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o7);
            o00ooooo2 = (androidx.compose.ui.platform.o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            function3 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO00o4);
            if (composer.OooOo0o() instanceof o00O000) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function3);
            } else {
                composer.Oooo00O();
            }
            composer.OooOo0O();
            Intrinsics.checkNotNullParameter(composer, "composer");
            oO00000o.OooO0O0(composer, c0291OooOOO0, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
            oO00000o.OooO0O0(composer, oooO2, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(2085825549);
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
            function1 = function2;
            oo0o0oo2 = oo0o0oo3;
        }
        oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOOO(popupPositionProvider, function1, oo0o0oo2, content, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00de  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:85:0x011a  */
    /* JADX WARN: Code duplicated, block: B:87:0x011e  */
    /* JADX WARN: Code duplicated, block: B:92:0x014b  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void OooO0O0(@Nullable p048OoooooO.o00OO0O0 o00oo0o1, long j, @Nullable Function0<Unit> function0, @Nullable oo0o0Oo oo0o0oo, @NotNull Function2<? super oOO00O, ? super Integer, Unit> content, @Nullable oOO00O ooo00o, int i, int i2) {
        p048OoooooO.o00OO0O0 o00oo0o2;
        int i3;
        long j2;
        int i4;
        Function0<Unit> function1;
        int i5;
        oo0o0Oo oo0o0oo2;
        int i6;
        p048OoooooO.o00OO0O0 o00oo0o3;
        long jOooO00o;
        Function0<Unit> function2;
        oo0o0Oo oo0o0oo3;
        p048OoooooO.o00OO0O0 o00oo0o4;
        long j3;
        boolean zOooo0oo;
        Object objOooO0o;
        long j4;
        Function0<Unit> function3;
        oo0o0Oo oo0o0oo4;
        oo0ooO oo0oooOooOo;
        Intrinsics.checkNotNullParameter(content, "content");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(295309329);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            o00oo0o2 = o00oo0o1;
        } else if ((i & 14) == 0) {
            o00oo0o2 = o00oo0o1;
            i3 = (ooo00oOooOOo.Oooo0oo(o00oo0o2) ? 4 : 2) | i;
        } else {
            o00oo0o2 = o00oo0o1;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 112) == 0) {
                j2 = j;
                i3 |= ooo00oOooOOo.OooOO0(j2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    function1 = function0;
                    if (ooo00oOooOOo.Oooo0oo(function1)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        oo0o0oo2 = oo0o0oo;
                        int i9 = ooo00oOooOOo.Oooo0oo(oo0o0oo2) ? RecyclerView.oo0o0Oo.FLAG_MOVED : 1024;
                        i3 |= i9;
                    } else {
                        oo0o0oo2 = oo0o0oo;
                    }
                    i3 |= i9;
                } else {
                    oo0o0oo2 = oo0o0oo;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(content)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i3 |= i6;
                }
                if ((46811 & i3) == 9362 || !ooo00oOooOOo.OooOo0()) {
                    ooo00oOooOOo.OooOOo0();
                    if ((i & 1) != 0 || ooo00oOooOOo.Oooo000()) {
                        if (i7 != 0) {
                            o00oo0o3 = OoooooO.o00OO0O0.OooO00o.f4172OooO0O0;
                        } else {
                            o00oo0o3 = o00oo0o2;
                        }
                        if (i8 != 0) {
                            jOooO00o = o0000O0O.Oooo000.OooO00o(0, 0);
                        } else {
                            jOooO00o = j2;
                        }
                        if (i4 != 0) {
                            function1 = null;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            oo0o0oo3 = new oo0o0Oo(false, false, false, false, 63);
                            j3 = jOooO00o;
                            function2 = function1;
                            o00oo0o4 = o00oo0o3;
                        } else {
                            function2 = function1;
                            oo0o0oo3 = oo0o0oo2;
                            o00oo0o4 = o00oo0o3;
                            j3 = jOooO00o;
                        }
                    } else {
                        ooo00oOooOOo.OooOoo0();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        function2 = function1;
                        oo0o0oo3 = oo0o0oo2;
                        o00oo0o4 = o00oo0o2;
                        j3 = j2;
                    }
                    ooo00oOooOOo.Oooo0oO();
                    o0000O0O.OooOo oooOo = new o0000O0O.OooOo(j3);
                    ooo00oOooOOo.OooO0o0(511388516);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(oooOo) | ooo00oOooOOo.Oooo0oo(o00oo0o4);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                        objOooO0o = new o0000OO0.OooO00o(o00oo0o4, j3);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o0000OO0.OooO00o oooO00o = (o0000OO0.OooO00o) objOooO0o;
                    int i10 = i3 >> 3;
                    OooO00o(oooO00o, function2, oo0o0oo3, content, ooo00oOooOOo, (i10 & 112) | (i10 & 896) | (i10 & 7168), 0);
                    o00oo0o2 = o00oo0o4;
                    j4 = j3;
                    function3 = function2;
                    oo0o0oo4 = oo0o0oo3;
                } else {
                    ooo00oOooOOo.OooOoo0();
                    j4 = j2;
                    function3 = function1;
                    oo0o0oo4 = oo0o0oo2;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0O0(o00oo0o2, j4, function3, oo0o0oo4, content, i, i2));
            }
            i3 |= 384;
            function1 = function0;
            if ((i & 7168) == 0) {
                if ((i2 & 8) == 0) {
                    oo0o0oo2 = oo0o0oo;
                    if (ooo00oOooOOo.Oooo0oo(oo0o0oo2)) {
                    }
                    i3 |= i9;
                } else {
                    oo0o0oo2 = oo0o0oo;
                }
                i3 |= i9;
            } else {
                oo0o0oo2 = oo0o0oo;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                if (ooo00oOooOOo.Oooo0oo(content)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((46811 & i3) == 9362) {
                ooo00oOooOOo.OooOOo0();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        o00oo0o3 = OoooooO.o00OO0O0.OooO00o.f4172OooO0O0;
                    } else {
                        o00oo0o3 = o00oo0o2;
                    }
                    if (i8 != 0) {
                        jOooO00o = o0000O0O.Oooo000.OooO00o(0, 0);
                    } else {
                        jOooO00o = j2;
                    }
                    if (i4 != 0) {
                        function1 = null;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        oo0o0oo3 = new oo0o0Oo(false, false, false, false, 63);
                        j3 = jOooO00o;
                        function2 = function1;
                        o00oo0o4 = o00oo0o3;
                    } else {
                        function2 = function1;
                        oo0o0oo3 = oo0o0oo2;
                        o00oo0o4 = o00oo0o3;
                        j3 = jOooO00o;
                    }
                } else {
                    if (i7 != 0) {
                        o00oo0o3 = OoooooO.o00OO0O0.OooO00o.f4172OooO0O0;
                    } else {
                        o00oo0o3 = o00oo0o2;
                    }
                    if (i8 != 0) {
                        jOooO00o = o0000O0O.Oooo000.OooO00o(0, 0);
                    } else {
                        jOooO00o = j2;
                    }
                    if (i4 != 0) {
                        function1 = null;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        oo0o0oo3 = new oo0o0Oo(false, false, false, false, 63);
                        j3 = jOooO00o;
                        function2 = function1;
                        o00oo0o4 = o00oo0o3;
                    } else {
                        function2 = function1;
                        oo0o0oo3 = oo0o0oo2;
                        o00oo0o4 = o00oo0o3;
                        j3 = jOooO00o;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                o0000O0O.OooOo oooOo2 = new o0000O0O.OooOo(j3);
                ooo00oOooOOo.OooO0o0(511388516);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(oooOo2) | ooo00oOooOOo.Oooo0oo(o00oo0o4);
                objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o = new o0000OO0.OooO00o(o00oo0o4, j3);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new o0000OO0.OooO00o(o00oo0o4, j3);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                o0000OO0.OooO00o oooO00o2 = (o0000OO0.OooO00o) objOooO0o;
                int i11 = i3 >> 3;
                OooO00o(oooO00o2, function2, oo0o0oo3, content, ooo00oOooOOo, (i11 & 112) | (i11 & 896) | (i11 & 7168), 0);
                o00oo0o2 = o00oo0o4;
                j4 = j3;
                function3 = function2;
                oo0o0oo4 = oo0o0oo3;
            } else {
                ooo00oOooOOo.OooOOo0();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        o00oo0o3 = OoooooO.o00OO0O0.OooO00o.f4172OooO0O0;
                    } else {
                        o00oo0o3 = o00oo0o2;
                    }
                    if (i8 != 0) {
                        jOooO00o = o0000O0O.Oooo000.OooO00o(0, 0);
                    } else {
                        jOooO00o = j2;
                    }
                    if (i4 != 0) {
                        function1 = null;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        oo0o0oo3 = new oo0o0Oo(false, false, false, false, 63);
                        j3 = jOooO00o;
                        function2 = function1;
                        o00oo0o4 = o00oo0o3;
                    } else {
                        function2 = function1;
                        oo0o0oo3 = oo0o0oo2;
                        o00oo0o4 = o00oo0o3;
                        j3 = jOooO00o;
                    }
                } else {
                    if (i7 != 0) {
                        o00oo0o3 = OoooooO.o00OO0O0.OooO00o.f4172OooO0O0;
                    } else {
                        o00oo0o3 = o00oo0o2;
                    }
                    if (i8 != 0) {
                        jOooO00o = o0000O0O.Oooo000.OooO00o(0, 0);
                    } else {
                        jOooO00o = j2;
                    }
                    if (i4 != 0) {
                        function1 = null;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        oo0o0oo3 = new oo0o0Oo(false, false, false, false, 63);
                        j3 = jOooO00o;
                        function2 = function1;
                        o00oo0o4 = o00oo0o3;
                    } else {
                        function2 = function1;
                        oo0o0oo3 = oo0o0oo2;
                        o00oo0o4 = o00oo0o3;
                        j3 = jOooO00o;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                o0000O0O.OooOo oooOo3 = new o0000O0O.OooOo(j3);
                ooo00oOooOOo.OooO0o0(511388516);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(oooOo3) | ooo00oOooOOo.Oooo0oo(o00oo0o4);
                objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o = new o0000OO0.OooO00o(o00oo0o4, j3);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new o0000OO0.OooO00o(o00oo0o4, j3);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                o0000OO0.OooO00o oooO00o3 = (o0000OO0.OooO00o) objOooO0o;
                int i12 = i3 >> 3;
                OooO00o(oooO00o3, function2, oo0o0oo3, content, ooo00oOooOOo, (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
                o00oo0o2 = o00oo0o4;
                j4 = j3;
                function3 = function2;
                oo0o0oo4 = oo0o0oo3;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0O0(o00oo0o2, j4, function3, oo0o0oo4, content, i, i2));
        }
        i3 |= 48;
        j2 = j;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                function1 = function0;
                if (ooo00oOooOOo.Oooo0oo(function1)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 7168) == 0) {
                if ((i2 & 8) == 0) {
                    oo0o0oo2 = oo0o0oo;
                    if (ooo00oOooOOo.Oooo0oo(oo0o0oo2)) {
                    }
                    i3 |= i9;
                } else {
                    oo0o0oo2 = oo0o0oo;
                }
                i3 |= i9;
            } else {
                oo0o0oo2 = oo0o0oo;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                if (ooo00oOooOOo.Oooo0oo(content)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((46811 & i3) == 9362) {
                ooo00oOooOOo.OooOOo0();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        o00oo0o3 = OoooooO.o00OO0O0.OooO00o.f4172OooO0O0;
                    } else {
                        o00oo0o3 = o00oo0o2;
                    }
                    if (i8 != 0) {
                        jOooO00o = o0000O0O.Oooo000.OooO00o(0, 0);
                    } else {
                        jOooO00o = j2;
                    }
                    if (i4 != 0) {
                        function1 = null;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        oo0o0oo3 = new oo0o0Oo(false, false, false, false, 63);
                        j3 = jOooO00o;
                        function2 = function1;
                        o00oo0o4 = o00oo0o3;
                    } else {
                        function2 = function1;
                        oo0o0oo3 = oo0o0oo2;
                        o00oo0o4 = o00oo0o3;
                        j3 = jOooO00o;
                    }
                } else {
                    if (i7 != 0) {
                        o00oo0o3 = OoooooO.o00OO0O0.OooO00o.f4172OooO0O0;
                    } else {
                        o00oo0o3 = o00oo0o2;
                    }
                    if (i8 != 0) {
                        jOooO00o = o0000O0O.Oooo000.OooO00o(0, 0);
                    } else {
                        jOooO00o = j2;
                    }
                    if (i4 != 0) {
                        function1 = null;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        oo0o0oo3 = new oo0o0Oo(false, false, false, false, 63);
                        j3 = jOooO00o;
                        function2 = function1;
                        o00oo0o4 = o00oo0o3;
                    } else {
                        function2 = function1;
                        oo0o0oo3 = oo0o0oo2;
                        o00oo0o4 = o00oo0o3;
                        j3 = jOooO00o;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                o0000O0O.OooOo oooOo4 = new o0000O0O.OooOo(j3);
                ooo00oOooOOo.OooO0o0(511388516);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(oooOo4) | ooo00oOooOOo.Oooo0oo(o00oo0o4);
                objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o = new o0000OO0.OooO00o(o00oo0o4, j3);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new o0000OO0.OooO00o(o00oo0o4, j3);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                o0000OO0.OooO00o oooO00o4 = (o0000OO0.OooO00o) objOooO0o;
                int i13 = i3 >> 3;
                OooO00o(oooO00o4, function2, oo0o0oo3, content, ooo00oOooOOo, (i13 & 112) | (i13 & 896) | (i13 & 7168), 0);
                o00oo0o2 = o00oo0o4;
                j4 = j3;
                function3 = function2;
                oo0o0oo4 = oo0o0oo3;
            } else {
                ooo00oOooOOo.OooOOo0();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        o00oo0o3 = OoooooO.o00OO0O0.OooO00o.f4172OooO0O0;
                    } else {
                        o00oo0o3 = o00oo0o2;
                    }
                    if (i8 != 0) {
                        jOooO00o = o0000O0O.Oooo000.OooO00o(0, 0);
                    } else {
                        jOooO00o = j2;
                    }
                    if (i4 != 0) {
                        function1 = null;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        oo0o0oo3 = new oo0o0Oo(false, false, false, false, 63);
                        j3 = jOooO00o;
                        function2 = function1;
                        o00oo0o4 = o00oo0o3;
                    } else {
                        function2 = function1;
                        oo0o0oo3 = oo0o0oo2;
                        o00oo0o4 = o00oo0o3;
                        j3 = jOooO00o;
                    }
                } else {
                    if (i7 != 0) {
                        o00oo0o3 = OoooooO.o00OO0O0.OooO00o.f4172OooO0O0;
                    } else {
                        o00oo0o3 = o00oo0o2;
                    }
                    if (i8 != 0) {
                        jOooO00o = o0000O0O.Oooo000.OooO00o(0, 0);
                    } else {
                        jOooO00o = j2;
                    }
                    if (i4 != 0) {
                        function1 = null;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        oo0o0oo3 = new oo0o0Oo(false, false, false, false, 63);
                        j3 = jOooO00o;
                        function2 = function1;
                        o00oo0o4 = o00oo0o3;
                    } else {
                        function2 = function1;
                        oo0o0oo3 = oo0o0oo2;
                        o00oo0o4 = o00oo0o3;
                        j3 = jOooO00o;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                o0000O0O.OooOo oooOo5 = new o0000O0O.OooOo(j3);
                ooo00oOooOOo.OooO0o0(511388516);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(oooOo5) | ooo00oOooOOo.Oooo0oo(o00oo0o4);
                objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o = new o0000OO0.OooO00o(o00oo0o4, j3);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new o0000OO0.OooO00o(o00oo0o4, j3);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                o0000OO0.OooO00o oooO00o5 = (o0000OO0.OooO00o) objOooO0o;
                int i14 = i3 >> 3;
                OooO00o(oooO00o5, function2, oo0o0oo3, content, ooo00oOooOOo, (i14 & 112) | (i14 & 896) | (i14 & 7168), 0);
                o00oo0o2 = o00oo0o4;
                j4 = j3;
                function3 = function2;
                oo0o0oo4 = oo0o0oo3;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0O0(o00oo0o2, j4, function3, oo0o0oo4, content, i, i2));
        }
        i3 |= 384;
        function1 = function0;
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                oo0o0oo2 = oo0o0oo;
                if (ooo00oOooOOo.Oooo0oo(oo0o0oo2)) {
                }
                i3 |= i9;
            } else {
                oo0o0oo2 = oo0o0oo;
            }
            i3 |= i9;
        } else {
            oo0o0oo2 = oo0o0oo;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (ooo00oOooOOo.Oooo0oo(content)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((46811 & i3) == 9362) {
            ooo00oOooOOo.OooOOo0();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    o00oo0o3 = OoooooO.o00OO0O0.OooO00o.f4172OooO0O0;
                } else {
                    o00oo0o3 = o00oo0o2;
                }
                if (i8 != 0) {
                    jOooO00o = o0000O0O.Oooo000.OooO00o(0, 0);
                } else {
                    jOooO00o = j2;
                }
                if (i4 != 0) {
                    function1 = null;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    oo0o0oo3 = new oo0o0Oo(false, false, false, false, 63);
                    j3 = jOooO00o;
                    function2 = function1;
                    o00oo0o4 = o00oo0o3;
                } else {
                    function2 = function1;
                    oo0o0oo3 = oo0o0oo2;
                    o00oo0o4 = o00oo0o3;
                    j3 = jOooO00o;
                }
            } else {
                if (i7 != 0) {
                    o00oo0o3 = OoooooO.o00OO0O0.OooO00o.f4172OooO0O0;
                } else {
                    o00oo0o3 = o00oo0o2;
                }
                if (i8 != 0) {
                    jOooO00o = o0000O0O.Oooo000.OooO00o(0, 0);
                } else {
                    jOooO00o = j2;
                }
                if (i4 != 0) {
                    function1 = null;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    oo0o0oo3 = new oo0o0Oo(false, false, false, false, 63);
                    j3 = jOooO00o;
                    function2 = function1;
                    o00oo0o4 = o00oo0o3;
                } else {
                    function2 = function1;
                    oo0o0oo3 = oo0o0oo2;
                    o00oo0o4 = o00oo0o3;
                    j3 = jOooO00o;
                }
            }
            ooo00oOooOOo.Oooo0oO();
            o0000O0O.OooOo oooOo6 = new o0000O0O.OooOo(j3);
            ooo00oOooOOo.OooO0o0(511388516);
            zOooo0oo = ooo00oOooOOo.Oooo0oo(oooOo6) | ooo00oOooOOo.Oooo0oo(o00oo0o4);
            objOooO0o = ooo00oOooOOo.OooO0o();
            if (zOooo0oo) {
                objOooO0o = new o0000OO0.OooO00o(o00oo0o4, j3);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            } else {
                objOooO0o = new o0000OO0.OooO00o(o00oo0o4, j3);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            o0000OO0.OooO00o oooO00o6 = (o0000OO0.OooO00o) objOooO0o;
            int i15 = i3 >> 3;
            OooO00o(oooO00o6, function2, oo0o0oo3, content, ooo00oOooOOo, (i15 & 112) | (i15 & 896) | (i15 & 7168), 0);
            o00oo0o2 = o00oo0o4;
            j4 = j3;
            function3 = function2;
            oo0o0oo4 = oo0o0oo3;
        } else {
            ooo00oOooOOo.OooOOo0();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    o00oo0o3 = OoooooO.o00OO0O0.OooO00o.f4172OooO0O0;
                } else {
                    o00oo0o3 = o00oo0o2;
                }
                if (i8 != 0) {
                    jOooO00o = o0000O0O.Oooo000.OooO00o(0, 0);
                } else {
                    jOooO00o = j2;
                }
                if (i4 != 0) {
                    function1 = null;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    oo0o0oo3 = new oo0o0Oo(false, false, false, false, 63);
                    j3 = jOooO00o;
                    function2 = function1;
                    o00oo0o4 = o00oo0o3;
                } else {
                    function2 = function1;
                    oo0o0oo3 = oo0o0oo2;
                    o00oo0o4 = o00oo0o3;
                    j3 = jOooO00o;
                }
            } else {
                if (i7 != 0) {
                    o00oo0o3 = OoooooO.o00OO0O0.OooO00o.f4172OooO0O0;
                } else {
                    o00oo0o3 = o00oo0o2;
                }
                if (i8 != 0) {
                    jOooO00o = o0000O0O.Oooo000.OooO00o(0, 0);
                } else {
                    jOooO00o = j2;
                }
                if (i4 != 0) {
                    function1 = null;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    oo0o0oo3 = new oo0o0Oo(false, false, false, false, 63);
                    j3 = jOooO00o;
                    function2 = function1;
                    o00oo0o4 = o00oo0o3;
                } else {
                    function2 = function1;
                    oo0o0oo3 = oo0o0oo2;
                    o00oo0o4 = o00oo0o3;
                    j3 = jOooO00o;
                }
            }
            ooo00oOooOOo.Oooo0oO();
            o0000O0O.OooOo oooOo7 = new o0000O0O.OooOo(j3);
            ooo00oOooOOo.OooO0o0(511388516);
            zOooo0oo = ooo00oOooOOo.Oooo0oo(oooOo7) | ooo00oOooOOo.Oooo0oo(o00oo0o4);
            objOooO0o = ooo00oOooOOo.OooO0o();
            if (zOooo0oo) {
                objOooO0o = new o0000OO0.OooO00o(o00oo0o4, j3);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            } else {
                objOooO0o = new o0000OO0.OooO00o(o00oo0o4, j3);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            o0000OO0.OooO00o oooO00o7 = (o0000OO0.OooO00o) objOooO0o;
            int i16 = i3 >> 3;
            OooO00o(oooO00o7, function2, oo0o0oo3, content, ooo00oOooOOo, (i16 & 112) | (i16 & 896) | (i16 & 7168), 0);
            o00oo0o2 = o00oo0o4;
            j4 = j3;
            function3 = function2;
            oo0o0oo4 = oo0o0oo3;
        }
        oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(o00oo0o2, j4, function3, oo0o0oo4, content, i, i2));
    }

    public static final boolean OooO0OO(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}

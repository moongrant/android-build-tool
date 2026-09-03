package p054o00000oo;

import android.content.Context;
import android.view.View;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import o00000O.o0OO00O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00OO00O implements o00O0O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Lazy f27220OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final View f27221OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final oOO00O f27222OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f27223OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public Function1<? super List<? extends o000O>, Unit> f27224OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public oo0oOO0 f27225OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public Function1<? super o00O000o, Unit> f27226OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public o00O00 f27227OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public o00O0OO0 f27228OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final Channel<OooO00o> f27229OooOO0;

    @DebugMetadata(c = "androidx.compose.ui.text.input.TextInputServiceAndroid", f = "TextInputServiceAndroid.android.kt", i = {0}, l = {189}, m = "textInputCommandEventLoop", n = {"this"}, s = {"L$0"})
    public static final class OooO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public o00OO00O f27230Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public int f27231OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public /* synthetic */ Object f27232OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public ChannelIterator f27233OoooO00;

        public OooO(Continuation<? super OooO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f27232OoooO0 = obj;
            this.f27231OoooO |= Integer.MIN_VALUE;
            return o00OO00O.this.OooO0oO(this);
        }
    }

    public enum OooO00o {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OooO00o.values().length];
            iArr[OooO00o.StartInput.ordinal()] = 1;
            iArr[OooO00o.StopInput.ordinal()] = 2;
            iArr[OooO00o.ShowKeyboard.ordinal()] = 3;
            iArr[OooO00o.HideKeyboard.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<List<? extends o000O>, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public static final OooO0OO f27235Oooo = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<? extends o000O> list) {
            List<? extends o000O> it = list;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<o00O000o, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public static final OooO0o f27236Oooo = new OooO0o();

        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(o00O000o o00o000o2) {
            int i = o00o000o2.f27196OooO00o;
            return Unit.INSTANCE;
        }
    }

    public o00OO00O(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        o00O00OO inputMethodManager = new o00O00OO(context);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(inputMethodManager, "inputMethodManager");
        this.f27221OooO00o = view;
        this.f27222OooO0O0 = inputMethodManager;
        this.f27224OooO0Oo = oo0O.f27251Oooo;
        this.f27226OooO0o0 = o00OO.f27217Oooo;
        o0OO00O.OooO00o oooO00o = o0OO00O.f26893OooO0O0;
        this.f27225OooO0o = new oo0oOO0("", o0OO00O.f26894OooO0OO, 4);
        this.f27227OooO0oO = o00O00.f27190OooO0oO;
        this.f27220OooO = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new o00OO0O0(this));
        this.f27229OooOO0 = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
    }

    @Override // p054o00000oo.o00O0O0O
    public final void OooO00o() {
        this.f27229OooOO0.mo2017trySendJP2dKIU(OooO00o.ShowKeyboard);
    }

    @Override // p054o00000oo.o00O0O0O
    public final void OooO0O0() {
        this.f27223OooO0OO = false;
        this.f27224OooO0Oo = OooO0OO.f27235Oooo;
        this.f27226OooO0o0 = OooO0o.f27236Oooo;
        this.f27229OooOO0.mo2017trySendJP2dKIU(OooO00o.StopInput);
    }

    @Override // p054o00000oo.o00O0O0O
    public final void OooO0OO(@Nullable oo0oOO0 oo0ooo0, @NotNull oo0oOO0 value) {
        Intrinsics.checkNotNullParameter(value, "newValue");
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (o0OO00O.OooO0O0(this.f27225OooO0o.f27257OooO0O0, value.f27257OooO0O0) && Intrinsics.areEqual(this.f27225OooO0o.f27258OooO0OO, value.f27258OooO0OO)) ? false : true;
        this.f27225OooO0o = value;
        o00O0OO0 o00o0oo1 = this.f27228OooO0oo;
        if (o00o0oo1 != null) {
            Intrinsics.checkNotNullParameter(value, "value");
            o00o0oo1.f27210OooO0Oo = value;
        }
        if (Intrinsics.areEqual(oo0ooo0, value)) {
            if (z3) {
                oOO00O ooo00o = this.f27222OooO0O0;
                View view = this.f27221OooO00o;
                int iOooO0oO = o0OO00O.OooO0oO(value.f27257OooO0O0);
                int iOooO0o = o0OO00O.OooO0o(value.f27257OooO0O0);
                o0OO00O o0oo00o2 = this.f27225OooO0o.f27258OooO0OO;
                int iOooO0oO2 = o0oo00o2 != null ? o0OO00O.OooO0oO(o0oo00o2.f26895OooO00o) : -1;
                o0OO00O o0oo00o3 = this.f27225OooO0o.f27258OooO0OO;
                ooo00o.OooO0OO(view, iOooO0oO, iOooO0o, iOooO0oO2, o0oo00o3 != null ? o0OO00O.OooO0o(o0oo00o3.f26895OooO00o) : -1);
                return;
            }
            return;
        }
        if (oo0ooo0 != null) {
            if (Intrinsics.areEqual(oo0ooo0.f27256OooO00o.f26774Oooo, value.f27256OooO00o.f26774Oooo) && (!o0OO00O.OooO0O0(oo0ooo0.f27257OooO0O0, value.f27257OooO0O0) || Intrinsics.areEqual(oo0ooo0.f27258OooO0OO, value.f27258OooO0OO))) {
                z = false;
            }
            z2 = z;
        }
        if (z2) {
            OooO0o();
            return;
        }
        o00O0OO0 o00o0oo2 = this.f27228OooO0oo;
        if (o00o0oo2 != null) {
            oo0oOO0 value2 = this.f27225OooO0o;
            oOO00O inputMethodManager = this.f27222OooO0O0;
            View view2 = this.f27221OooO00o;
            Intrinsics.checkNotNullParameter(value2, "state");
            Intrinsics.checkNotNullParameter(inputMethodManager, "inputMethodManager");
            Intrinsics.checkNotNullParameter(view2, "view");
            if (o00o0oo2.f27214OooO0oo) {
                Intrinsics.checkNotNullParameter(value2, "value");
                o00o0oo2.f27210OooO0Oo = value2;
                if (o00o0oo2.f27211OooO0o) {
                    inputMethodManager.OooO0Oo(view2, o00o0oo2.f27212OooO0o0, o00O00o0.OooO00o(value2));
                }
                o0OO00O o0oo00o4 = value2.f27258OooO0OO;
                int iOooO0oO3 = o0oo00o4 != null ? o0OO00O.OooO0oO(o0oo00o4.f26895OooO00o) : -1;
                o0OO00O o0oo00o5 = value2.f27258OooO0OO;
                inputMethodManager.OooO0OO(view2, o0OO00O.OooO0oO(value2.f27257OooO0O0), o0OO00O.OooO0o(value2.f27257OooO0O0), iOooO0oO3, o0oo00o5 != null ? o0OO00O.OooO0o(o0oo00o5.f26895OooO00o) : -1);
            }
        }
    }

    @Override // p054o00000oo.o00O0O0O
    public final void OooO0Oo(@NotNull oo0oOO0 value, @NotNull o00O00 imeOptions, @NotNull Function1<? super List<? extends o000O>, Unit> onEditCommand, @NotNull Function1<? super o00O000o, Unit> onImeActionPerformed) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(imeOptions, "imeOptions");
        Intrinsics.checkNotNullParameter(onEditCommand, "onEditCommand");
        Intrinsics.checkNotNullParameter(onImeActionPerformed, "onImeActionPerformed");
        this.f27223OooO0OO = true;
        this.f27225OooO0o = value;
        this.f27227OooO0oO = imeOptions;
        this.f27224OooO0Oo = onEditCommand;
        this.f27226OooO0o0 = onImeActionPerformed;
        this.f27229OooOO0.mo2017trySendJP2dKIU(OooO00o.StartInput);
    }

    public final void OooO0o() {
        this.f27222OooO0O0.OooO0o0(this.f27221OooO00o);
    }

    @Override // p054o00000oo.o00O0O0O
    public final void OooO0o0() {
        this.f27229OooOO0.mo2017trySendJP2dKIU(OooO00o.HideKeyboard);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0087  */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c1 A[EDGE_INSN: B:62:0x00c1->B:46:0x00c1 BREAK  A[LOOP:1: B:26:0x007a->B:45:0x00b4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v21, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r11v26, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r11v27, types: [T, java.lang.Boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004a -> B:18:0x004d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:37:0x0091
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object OooO0oO(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p054o00000oo.o00OO00O.OooO0oO(kotlin.coroutines.Continuation):java.lang.Object");
    }
}

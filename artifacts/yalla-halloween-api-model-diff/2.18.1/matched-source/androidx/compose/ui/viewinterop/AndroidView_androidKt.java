package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o0O0O00;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.LifecycleOwner;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000000.o0000;
import o000000.o0000O0;
import o00000O0.o0OO00O;
import o0000O0O.oo000o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045OooooOo.o00O0OO;
import p045OooooOo.oo0oOO0;
import p048OoooooO.o00OOO0O;
import p048OoooooO.o00OOOO0;
import p094o000o0OO.o00Oo0;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o00O0OOO;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0o0Oo;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidView_androidKt {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Function1<View, Unit> f6706OooO00o = OooOo.f6730Oooo0o;

    public static final class OooO extends Lambda implements Function2<LayoutNode, o00Oo0, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0000<ViewFactoryHolder<T>> f6708Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(o0000<ViewFactoryHolder<T>> o0000Var) {
            super(2);
            this.f6708Oooo0o = o0000Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(LayoutNode layoutNode, o00Oo0 o00oo1) {
            LayoutNode set = layoutNode;
            o00Oo0 it = o00oo1;
            Intrinsics.checkNotNullParameter(set, "$this$set");
            Intrinsics.checkNotNullParameter(it, "it");
            T t = this.f6708Oooo0o.f26623OooO00o;
            Intrinsics.checkNotNull(t);
            ((ViewFactoryHolder) t).setSavedStateRegistryOwner(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<LayoutNode> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function1<Context, T> f6709Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Context f6710Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O0OOO f6711Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ p346o0OOO0o.OooOOOO f6712Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ String f6713OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o00O0OO f6714OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ o0000<ViewFactoryHolder<T>> f6715OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Context context, o00O0OOO o00o0ooo2, p346o0OOO0o.OooOOOO oooOOOO, Function1<? super Context, ? extends T> function1, o00O0OO o00o0oo2, String str, o0000<ViewFactoryHolder<T>> o0000Var) {
            super(0);
            this.f6710Oooo0o = context;
            this.f6711Oooo0oO = o00o0ooo2;
            this.f6712Oooo0oo = oooOOOO;
            this.f6709Oooo = function1;
            this.f6714OoooO00 = o00o0oo2;
            this.f6713OoooO0 = str;
            this.f6715OoooO0O = o0000Var;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, androidx.compose.ui.viewinterop.AndroidViewHolder, androidx.compose.ui.viewinterop.ViewFactoryHolder] */
        @Override // kotlin.jvm.functions.Function0
        public final LayoutNode invoke() {
            View typedView$ui_release;
            ?? viewFactoryHolder = new ViewFactoryHolder(this.f6710Oooo0o, this.f6711Oooo0oO, this.f6712Oooo0oo);
            viewFactoryHolder.setFactory(this.f6709Oooo);
            o00O0OO o00o0oo2 = this.f6714OoooO00;
            Object objOooO0O0 = o00o0oo2 != null ? o00o0oo2.OooO0O0(this.f6713OoooO0) : null;
            SparseArray<Parcelable> sparseArray = objOooO0O0 instanceof SparseArray ? (SparseArray) objOooO0O0 : null;
            if (sparseArray != null && (typedView$ui_release = viewFactoryHolder.getTypedView$ui_release()) != null) {
                typedView$ui_release.restoreHierarchyState(sparseArray);
            }
            this.f6715OoooO0O.f26623OooO00o = viewFactoryHolder;
            return viewFactoryHolder.getLayoutNode();
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<LayoutNode, o00OOOO0, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0000<ViewFactoryHolder<T>> f6716Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0000<ViewFactoryHolder<T>> o0000Var) {
            super(2);
            this.f6716Oooo0o = o0000Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(LayoutNode layoutNode, o00OOOO0 o00oooo1) {
            LayoutNode set = layoutNode;
            o00OOOO0 it = o00oooo1;
            Intrinsics.checkNotNullParameter(set, "$this$set");
            Intrinsics.checkNotNullParameter(it, "it");
            T t = this.f6716Oooo0o.f26623OooO00o;
            Intrinsics.checkNotNull(t);
            ((ViewFactoryHolder) t).setModifier(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<LayoutNode, o0000O0O.OooO, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0000<ViewFactoryHolder<T>> f6717Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o0000<ViewFactoryHolder<T>> o0000Var) {
            super(2);
            this.f6717Oooo0o = o0000Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(LayoutNode layoutNode, o0000O0O.OooO oooO) {
            LayoutNode set = layoutNode;
            o0000O0O.OooO it = oooO;
            Intrinsics.checkNotNullParameter(set, "$this$set");
            Intrinsics.checkNotNullParameter(it, "it");
            T t = this.f6717Oooo0o.f26623OooO00o;
            Intrinsics.checkNotNull(t);
            ((ViewFactoryHolder) t).setDensity(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<LayoutNode, LifecycleOwner, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0000<ViewFactoryHolder<T>> f6718Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o0000<ViewFactoryHolder<T>> o0000Var) {
            super(2);
            this.f6718Oooo0o = o0000Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(LayoutNode layoutNode, LifecycleOwner lifecycleOwner) {
            LayoutNode set = layoutNode;
            LifecycleOwner it = lifecycleOwner;
            Intrinsics.checkNotNullParameter(set, "$this$set");
            Intrinsics.checkNotNullParameter(it, "it");
            T t = this.f6718Oooo0o.f26623OooO00o;
            Intrinsics.checkNotNull(t);
            ((ViewFactoryHolder) t).setLifecycleOwner(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class OooOO0<T> extends Lambda implements Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0000<ViewFactoryHolder<T>> f6719Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(o0000<ViewFactoryHolder<T>> o0000Var) {
            super(2);
            this.f6719Oooo0o = o0000Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(LayoutNode layoutNode, Object obj) {
            LayoutNode set = layoutNode;
            Function1 it = (Function1) obj;
            Intrinsics.checkNotNullParameter(set, "$this$set");
            Intrinsics.checkNotNullParameter(it, "it");
            ViewFactoryHolder<T> viewFactoryHolder = this.f6719Oooo0o.f26623OooO00o;
            Intrinsics.checkNotNull(viewFactoryHolder);
            viewFactoryHolder.setUpdateBlock(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<LayoutNode, LayoutDirection, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0000<ViewFactoryHolder<T>> f6720Oooo0o;

        public /* synthetic */ class OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LayoutDirection.values().length];
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(o0000<ViewFactoryHolder<T>> o0000Var) {
            super(2);
            this.f6720Oooo0o = o0000Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(LayoutNode layoutNode, LayoutDirection layoutDirection) {
            LayoutNode set = layoutNode;
            LayoutDirection it = layoutDirection;
            Intrinsics.checkNotNullParameter(set, "$this$set");
            Intrinsics.checkNotNullParameter(it, "it");
            T t = this.f6720Oooo0o.f26623OooO00o;
            Intrinsics.checkNotNull(t);
            ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) t;
            int i = OooO00o.$EnumSwitchMapping$0[it.ordinal()];
            int i2 = 1;
            if (i == 1) {
                i2 = 0;
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            viewFactoryHolder.setLayoutDirection(i2);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f6721Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function1<Context, T> f6722Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f6723Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Unit> f6724Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f6725OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOOO(Function1<? super Context, ? extends T> function1, o00OOOO0 o00oooo1, Function1<? super T, Unit> function2, int i, int i2) {
            super(2);
            this.f6722Oooo0o = function1;
            this.f6723Oooo0oO = o00oooo1;
            this.f6724Oooo0oo = function2;
            this.f6721Oooo = i;
            this.f6725OoooO00 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            AndroidView_androidKt.OooO00o(this.f6722Oooo0o, this.f6723Oooo0oO, this.f6724Oooo0oo, ooo00o, this.f6721Oooo | 1, this.f6725OoooO00);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<p100o000oOoO.o00OOOO0, o0o0Oo> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00O0OO f6726Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ String f6727Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0000<ViewFactoryHolder<T>> f6728Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(o00O0OO o00o0oo2, String str, o0000<ViewFactoryHolder<T>> o0000Var) {
            super(1);
            this.f6726Oooo0o = o00o0oo2;
            this.f6727Oooo0oO = str;
            this.f6728Oooo0oo = o0000Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final o0o0Oo invoke(p100o000oOoO.o00OOOO0 o00oooo1) {
            p100o000oOoO.o00OOOO0 DisposableEffect = o00oooo1;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new o0000O.OooO0o(this.f6726Oooo0o.OooO0OO(this.f6727Oooo0oO, new androidx.compose.ui.viewinterop.OooO00o(this.f6728Oooo0oo)));
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<o0OO00O, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOOOO f6729Oooo0o = new OooOOOO();

        public OooOOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OO00O o0oo00o2) {
            o0OO00O semantics = o0oo00o2;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOo f6730Oooo0o = new OooOo();

        public OooOo() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "$this$null");
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 implements p346o0OOO0o.OooOOO {
        @Override // p346o0OOO0o.OooOOO
        public final Object OooO00o(long j, long j2, Continuation continuation) {
            oo000o.OooO00o oooO00o = oo000o.f27328OooO0O0;
            return new oo000o(oo000o.f27329OooO0OO);
        }

        @Override // p346o0OOO0o.OooOOO
        public final long OooO0O0(long j, int i) {
            o00O0O.OooO.OooO00o oooO00o = o00O0O.OooO.f30391OooO0O0;
            return o00O0O.OooO.f30392OooO0OO;
        }

        @Override // p346o0OOO0o.OooOOO
        public final /* synthetic */ Object OooO0OO(long j, Continuation continuation) {
            return p346o0OOO0o.OooOOO0.OooO00o();
        }

        @Override // p346o0OOO0o.OooOOO
        public final long OooO0Oo(long j, long j2, int i) {
            o00O0O.OooO.OooO00o oooO00o = o00O0O.OooO.f30391OooO0O0;
            return o00O0O.OooO.f30392OooO0OO;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
    /* JADX WARN: Code duplicated, block: B:52:0x00af  */
    /* JADX WARN: Code duplicated, block: B:55:0x0101  */
    /* JADX WARN: Code duplicated, block: B:58:0x0144  */
    /* JADX WARN: Code duplicated, block: B:60:0x014d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0156  */
    /* JADX WARN: Code duplicated, block: B:64:0x019a  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:71:0x01be  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    @Composable
    @UiComposable
    public static final <T extends View> void OooO00o(@NotNull Function1<? super Context, ? extends T> factory, @Nullable o00OOOO0 o00oooo1, @Nullable Function1<? super T, Unit> function1, @Nullable oOO00O ooo00o, int i, int i2) {
        int i3;
        o00OOOO0 o00oooo2;
        int i4;
        Function1<? super T, Unit> function2;
        int i5;
        o00OOOO0 o00oooo3;
        Function1<? super T, Unit> function3;
        Object objOooO0o;
        oOO00O.OooO00o.C0323OooO00o c0323OooO00o;
        Object objOooO0o2;
        o00OOOO0 o00oooo0OooO0OO;
        o0000O0O.OooO oooO;
        LayoutDirection layoutDirection;
        o00O0OO o00o0oo2;
        String strValueOf;
        Object objOooO0o3;
        o0000 o0000Var;
        LifecycleOwner lifecycleOwner;
        o00Oo0 o00oo1;
        final OooO00o oooO00o;
        o00OOOO0 o00oooo4;
        Function1<? super T, Unit> function4;
        oo0ooO oo0oooOooOo;
        Intrinsics.checkNotNullParameter(factory, "factory");
        oOO00O composer = ooo00o.OooOOo(-1783766393);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composer.Oooo0oo(factory) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 112) == 0) {
                o00oooo2 = o00oooo1;
                i3 |= composer.Oooo0oo(o00oooo2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    function2 = function1;
                    if (composer.Oooo0oo(function2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i3 & 731) == 146 || !composer.OooOo0()) {
                    if (i6 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        function3 = f6706OooO00o;
                    } else {
                        function3 = function2;
                    }
                    Context context = (Context) composer.OooOO0o(o0O0O00.f6591OooO0O0);
                    composer.OooO0o0(-492369756);
                    objOooO0o = composer.OooO0o();
                    c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                    if (objOooO0o == c0323OooO00o) {
                        objOooO0o = new OooOo00();
                        composer.Oooo00o(objOooO0o);
                    }
                    composer.Oooo0o0();
                    OooOo00 oooOo00 = (OooOo00) objOooO0o;
                    composer.OooO0o0(-492369756);
                    objOooO0o2 = composer.OooO0o();
                    if (objOooO0o2 == c0323OooO00o) {
                        objOooO0o2 = new p346o0OOO0o.OooOOOO();
                        composer.Oooo00o(objOooO0o2);
                    }
                    composer.Oooo0o0();
                    p346o0OOO0o.OooOOOO oooOOOO = (p346o0OOO0o.OooOOOO) objOooO0o2;
                    o00oooo0OooO0OO = o00OOO0O.OooO0OO(composer, SemanticsModifierKt.OooO00o(o00oooo3.OooOOoo(NestedScrollModifierKt.OooO00o(o00OOOO0.OooO00o.f4198Oooo0o, oooOo00, oooOOOO)), true, OooOOOO.f6729Oooo0o));
                    oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
                    layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
                    o00O0OOO o00o0oooOooO0O0 = o00O00O.OooO0O0(composer);
                    o00o0oo2 = (o00O0OO) composer.OooOO0o(oo0oOO0.f4048OooO00o);
                    strValueOf = String.valueOf(composer.Oooo0());
                    composer.OooO0o0(-492369756);
                    objOooO0o3 = composer.OooO0o();
                    if (objOooO0o3 == c0323OooO00o) {
                        objOooO0o3 = new o0000();
                        composer.Oooo00o(objOooO0o3);
                    }
                    composer.Oooo0o0();
                    o0000Var = (o0000) objOooO0o3;
                    lifecycleOwner = (LifecycleOwner) composer.OooOO0o(o0O0O00.f6593OooO0Oo);
                    o00oo1 = (o00Oo0) composer.OooOO0o(o0O0O00.f6595OooO0o0);
                    o00oooo4 = o00oooo3;
                    oooO00o = new OooO00o(context, o00o0oooOooO0O0, oooOOOO, factory, o00o0oo2, strValueOf, o0000Var);
                    composer.OooO0o0(1886828752);
                    if (!(composer.OooOo0o() instanceof o0000O0)) {
                        o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOoO();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return oooO00o.invoke();
                            }
                        });
                    } else {
                        composer.Oooo00O();
                    }
                    Intrinsics.checkNotNullParameter(composer, "composer");
                    oO00000o.OooO0O0(composer, o00oooo0OooO0OO, new OooO0O0(o0000Var));
                    oO00000o.OooO0O0(composer, oooO, new OooO0OO(o0000Var));
                    oO00000o.OooO0O0(composer, lifecycleOwner, new OooO0o(o0000Var));
                    oO00000o.OooO0O0(composer, o00oo1, new OooO(o0000Var));
                    oO00000o.OooO0O0(composer, function3, new OooOO0(o0000Var));
                    oO00000o.OooO0O0(composer, layoutDirection, new OooOO0O(o0000Var));
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    if (o00o0oo2 != null) {
                        o00Oo00.OooO00o(o00o0oo2, strValueOf, new OooOOO0(o00o0oo2, strValueOf, o0000Var), composer);
                    }
                    o00oooo2 = o00oooo4;
                    function4 = function3;
                } else {
                    composer.OooOoo0();
                    function4 = function2;
                }
                oo0oooOooOo = composer.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOOO(factory, o00oooo2, function4, i, i2));
            }
            i3 |= 384;
            function2 = function1;
            if ((i3 & 731) == 146) {
                if (i6 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    function3 = f6706OooO00o;
                } else {
                    function3 = function2;
                }
                Context context2 = (Context) composer.OooOO0o(o0O0O00.f6591OooO0O0);
                composer.OooO0o0(-492369756);
                objOooO0o = composer.OooO0o();
                c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                if (objOooO0o == c0323OooO00o) {
                    objOooO0o = new OooOo00();
                    composer.Oooo00o(objOooO0o);
                }
                composer.Oooo0o0();
                OooOo00 oooOo01 = (OooOo00) objOooO0o;
                composer.OooO0o0(-492369756);
                objOooO0o2 = composer.OooO0o();
                if (objOooO0o2 == c0323OooO00o) {
                    objOooO0o2 = new p346o0OOO0o.OooOOOO();
                    composer.Oooo00o(objOooO0o2);
                }
                composer.Oooo0o0();
                p346o0OOO0o.OooOOOO oooOOOO2 = (p346o0OOO0o.OooOOOO) objOooO0o2;
                o00oooo0OooO0OO = o00OOO0O.OooO0OO(composer, SemanticsModifierKt.OooO00o(o00oooo3.OooOOoo(NestedScrollModifierKt.OooO00o(o00OOOO0.OooO00o.f4198Oooo0o, oooOo01, oooOOOO2)), true, OooOOOO.f6729Oooo0o));
                oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
                layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
                o00O0OOO o00o0oooOooO0O1 = o00O00O.OooO0O0(composer);
                o00o0oo2 = (o00O0OO) composer.OooOO0o(oo0oOO0.f4048OooO00o);
                strValueOf = String.valueOf(composer.Oooo0());
                composer.OooO0o0(-492369756);
                objOooO0o3 = composer.OooO0o();
                if (objOooO0o3 == c0323OooO00o) {
                    objOooO0o3 = new o0000();
                    composer.Oooo00o(objOooO0o3);
                }
                composer.Oooo0o0();
                o0000Var = (o0000) objOooO0o3;
                lifecycleOwner = (LifecycleOwner) composer.OooOO0o(o0O0O00.f6593OooO0Oo);
                o00oo1 = (o00Oo0) composer.OooOO0o(o0O0O00.f6595OooO0o0);
                o00oooo4 = o00oooo3;
                oooO00o = new OooO00o(context2, o00o0oooOooO0O1, oooOOOO2, factory, o00o0oo2, strValueOf, o0000Var);
                composer.OooO0o0(1886828752);
                if (!(composer.OooOo0o() instanceof o0000O0)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOoO();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final LayoutNode invoke() {
                            return oooO00o.invoke();
                        }
                    });
                } else {
                    composer.Oooo00O();
                }
                Intrinsics.checkNotNullParameter(composer, "composer");
                oO00000o.OooO0O0(composer, o00oooo0OooO0OO, new OooO0O0(o0000Var));
                oO00000o.OooO0O0(composer, oooO, new OooO0OO(o0000Var));
                oO00000o.OooO0O0(composer, lifecycleOwner, new OooO0o(o0000Var));
                oO00000o.OooO0O0(composer, o00oo1, new OooO(o0000Var));
                oO00000o.OooO0O0(composer, function3, new OooOO0(o0000Var));
                oO00000o.OooO0O0(composer, layoutDirection, new OooOO0O(o0000Var));
                composer.Oooo0o();
                composer.Oooo0o0();
                if (o00o0oo2 != null) {
                    o00Oo00.OooO00o(o00o0oo2, strValueOf, new OooOOO0(o00o0oo2, strValueOf, o0000Var), composer);
                }
                o00oooo2 = o00oooo4;
                function4 = function3;
            } else {
                if (i6 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    function3 = f6706OooO00o;
                } else {
                    function3 = function2;
                }
                Context context3 = (Context) composer.OooOO0o(o0O0O00.f6591OooO0O0);
                composer.OooO0o0(-492369756);
                objOooO0o = composer.OooO0o();
                c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                if (objOooO0o == c0323OooO00o) {
                    objOooO0o = new OooOo00();
                    composer.Oooo00o(objOooO0o);
                }
                composer.Oooo0o0();
                OooOo00 oooOo02 = (OooOo00) objOooO0o;
                composer.OooO0o0(-492369756);
                objOooO0o2 = composer.OooO0o();
                if (objOooO0o2 == c0323OooO00o) {
                    objOooO0o2 = new p346o0OOO0o.OooOOOO();
                    composer.Oooo00o(objOooO0o2);
                }
                composer.Oooo0o0();
                p346o0OOO0o.OooOOOO oooOOOO3 = (p346o0OOO0o.OooOOOO) objOooO0o2;
                o00oooo0OooO0OO = o00OOO0O.OooO0OO(composer, SemanticsModifierKt.OooO00o(o00oooo3.OooOOoo(NestedScrollModifierKt.OooO00o(o00OOOO0.OooO00o.f4198Oooo0o, oooOo02, oooOOOO3)), true, OooOOOO.f6729Oooo0o));
                oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
                layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
                o00O0OOO o00o0oooOooO0O2 = o00O00O.OooO0O0(composer);
                o00o0oo2 = (o00O0OO) composer.OooOO0o(oo0oOO0.f4048OooO00o);
                strValueOf = String.valueOf(composer.Oooo0());
                composer.OooO0o0(-492369756);
                objOooO0o3 = composer.OooO0o();
                if (objOooO0o3 == c0323OooO00o) {
                    objOooO0o3 = new o0000();
                    composer.Oooo00o(objOooO0o3);
                }
                composer.Oooo0o0();
                o0000Var = (o0000) objOooO0o3;
                lifecycleOwner = (LifecycleOwner) composer.OooOO0o(o0O0O00.f6593OooO0Oo);
                o00oo1 = (o00Oo0) composer.OooOO0o(o0O0O00.f6595OooO0o0);
                o00oooo4 = o00oooo3;
                oooO00o = new OooO00o(context3, o00o0oooOooO0O2, oooOOOO3, factory, o00o0oo2, strValueOf, o0000Var);
                composer.OooO0o0(1886828752);
                if (!(composer.OooOo0o() instanceof o0000O0)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOoO();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final LayoutNode invoke() {
                            return oooO00o.invoke();
                        }
                    });
                } else {
                    composer.Oooo00O();
                }
                Intrinsics.checkNotNullParameter(composer, "composer");
                oO00000o.OooO0O0(composer, o00oooo0OooO0OO, new OooO0O0(o0000Var));
                oO00000o.OooO0O0(composer, oooO, new OooO0OO(o0000Var));
                oO00000o.OooO0O0(composer, lifecycleOwner, new OooO0o(o0000Var));
                oO00000o.OooO0O0(composer, o00oo1, new OooO(o0000Var));
                oO00000o.OooO0O0(composer, function3, new OooOO0(o0000Var));
                oO00000o.OooO0O0(composer, layoutDirection, new OooOO0O(o0000Var));
                composer.Oooo0o();
                composer.Oooo0o0();
                if (o00o0oo2 != null) {
                    o00Oo00.OooO00o(o00o0oo2, strValueOf, new OooOOO0(o00o0oo2, strValueOf, o0000Var), composer);
                }
                o00oooo2 = o00oooo4;
                function4 = function3;
            }
            oo0oooOooOo = composer.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooOOO(factory, o00oooo2, function4, i, i2));
        }
        i3 |= 48;
        o00oooo2 = o00oooo1;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                function2 = function1;
                if (composer.Oooo0oo(function2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i3 & 731) == 146) {
                if (i6 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    function3 = f6706OooO00o;
                } else {
                    function3 = function2;
                }
                Context context4 = (Context) composer.OooOO0o(o0O0O00.f6591OooO0O0);
                composer.OooO0o0(-492369756);
                objOooO0o = composer.OooO0o();
                c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                if (objOooO0o == c0323OooO00o) {
                    objOooO0o = new OooOo00();
                    composer.Oooo00o(objOooO0o);
                }
                composer.Oooo0o0();
                OooOo00 oooOo03 = (OooOo00) objOooO0o;
                composer.OooO0o0(-492369756);
                objOooO0o2 = composer.OooO0o();
                if (objOooO0o2 == c0323OooO00o) {
                    objOooO0o2 = new p346o0OOO0o.OooOOOO();
                    composer.Oooo00o(objOooO0o2);
                }
                composer.Oooo0o0();
                p346o0OOO0o.OooOOOO oooOOOO4 = (p346o0OOO0o.OooOOOO) objOooO0o2;
                o00oooo0OooO0OO = o00OOO0O.OooO0OO(composer, SemanticsModifierKt.OooO00o(o00oooo3.OooOOoo(NestedScrollModifierKt.OooO00o(o00OOOO0.OooO00o.f4198Oooo0o, oooOo03, oooOOOO4)), true, OooOOOO.f6729Oooo0o));
                oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
                layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
                o00O0OOO o00o0oooOooO0O3 = o00O00O.OooO0O0(composer);
                o00o0oo2 = (o00O0OO) composer.OooOO0o(oo0oOO0.f4048OooO00o);
                strValueOf = String.valueOf(composer.Oooo0());
                composer.OooO0o0(-492369756);
                objOooO0o3 = composer.OooO0o();
                if (objOooO0o3 == c0323OooO00o) {
                    objOooO0o3 = new o0000();
                    composer.Oooo00o(objOooO0o3);
                }
                composer.Oooo0o0();
                o0000Var = (o0000) objOooO0o3;
                lifecycleOwner = (LifecycleOwner) composer.OooOO0o(o0O0O00.f6593OooO0Oo);
                o00oo1 = (o00Oo0) composer.OooOO0o(o0O0O00.f6595OooO0o0);
                o00oooo4 = o00oooo3;
                oooO00o = new OooO00o(context4, o00o0oooOooO0O3, oooOOOO4, factory, o00o0oo2, strValueOf, o0000Var);
                composer.OooO0o0(1886828752);
                if (!(composer.OooOo0o() instanceof o0000O0)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOoO();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final LayoutNode invoke() {
                            return oooO00o.invoke();
                        }
                    });
                } else {
                    composer.Oooo00O();
                }
                Intrinsics.checkNotNullParameter(composer, "composer");
                oO00000o.OooO0O0(composer, o00oooo0OooO0OO, new OooO0O0(o0000Var));
                oO00000o.OooO0O0(composer, oooO, new OooO0OO(o0000Var));
                oO00000o.OooO0O0(composer, lifecycleOwner, new OooO0o(o0000Var));
                oO00000o.OooO0O0(composer, o00oo1, new OooO(o0000Var));
                oO00000o.OooO0O0(composer, function3, new OooOO0(o0000Var));
                oO00000o.OooO0O0(composer, layoutDirection, new OooOO0O(o0000Var));
                composer.Oooo0o();
                composer.Oooo0o0();
                if (o00o0oo2 != null) {
                    o00Oo00.OooO00o(o00o0oo2, strValueOf, new OooOOO0(o00o0oo2, strValueOf, o0000Var), composer);
                }
                o00oooo2 = o00oooo4;
                function4 = function3;
            } else {
                if (i6 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    function3 = f6706OooO00o;
                } else {
                    function3 = function2;
                }
                Context context5 = (Context) composer.OooOO0o(o0O0O00.f6591OooO0O0);
                composer.OooO0o0(-492369756);
                objOooO0o = composer.OooO0o();
                c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                if (objOooO0o == c0323OooO00o) {
                    objOooO0o = new OooOo00();
                    composer.Oooo00o(objOooO0o);
                }
                composer.Oooo0o0();
                OooOo00 oooOo04 = (OooOo00) objOooO0o;
                composer.OooO0o0(-492369756);
                objOooO0o2 = composer.OooO0o();
                if (objOooO0o2 == c0323OooO00o) {
                    objOooO0o2 = new p346o0OOO0o.OooOOOO();
                    composer.Oooo00o(objOooO0o2);
                }
                composer.Oooo0o0();
                p346o0OOO0o.OooOOOO oooOOOO5 = (p346o0OOO0o.OooOOOO) objOooO0o2;
                o00oooo0OooO0OO = o00OOO0O.OooO0OO(composer, SemanticsModifierKt.OooO00o(o00oooo3.OooOOoo(NestedScrollModifierKt.OooO00o(o00OOOO0.OooO00o.f4198Oooo0o, oooOo04, oooOOOO5)), true, OooOOOO.f6729Oooo0o));
                oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
                layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
                o00O0OOO o00o0oooOooO0O4 = o00O00O.OooO0O0(composer);
                o00o0oo2 = (o00O0OO) composer.OooOO0o(oo0oOO0.f4048OooO00o);
                strValueOf = String.valueOf(composer.Oooo0());
                composer.OooO0o0(-492369756);
                objOooO0o3 = composer.OooO0o();
                if (objOooO0o3 == c0323OooO00o) {
                    objOooO0o3 = new o0000();
                    composer.Oooo00o(objOooO0o3);
                }
                composer.Oooo0o0();
                o0000Var = (o0000) objOooO0o3;
                lifecycleOwner = (LifecycleOwner) composer.OooOO0o(o0O0O00.f6593OooO0Oo);
                o00oo1 = (o00Oo0) composer.OooOO0o(o0O0O00.f6595OooO0o0);
                o00oooo4 = o00oooo3;
                oooO00o = new OooO00o(context5, o00o0oooOooO0O4, oooOOOO5, factory, o00o0oo2, strValueOf, o0000Var);
                composer.OooO0o0(1886828752);
                if (!(composer.OooOo0o() instanceof o0000O0)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOoO();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final LayoutNode invoke() {
                            return oooO00o.invoke();
                        }
                    });
                } else {
                    composer.Oooo00O();
                }
                Intrinsics.checkNotNullParameter(composer, "composer");
                oO00000o.OooO0O0(composer, o00oooo0OooO0OO, new OooO0O0(o0000Var));
                oO00000o.OooO0O0(composer, oooO, new OooO0OO(o0000Var));
                oO00000o.OooO0O0(composer, lifecycleOwner, new OooO0o(o0000Var));
                oO00000o.OooO0O0(composer, o00oo1, new OooO(o0000Var));
                oO00000o.OooO0O0(composer, function3, new OooOO0(o0000Var));
                oO00000o.OooO0O0(composer, layoutDirection, new OooOO0O(o0000Var));
                composer.Oooo0o();
                composer.Oooo0o0();
                if (o00o0oo2 != null) {
                    o00Oo00.OooO00o(o00o0oo2, strValueOf, new OooOOO0(o00o0oo2, strValueOf, o0000Var), composer);
                }
                o00oooo2 = o00oooo4;
                function4 = function3;
            }
            oo0oooOooOo = composer.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooOOO(factory, o00oooo2, function4, i, i2));
        }
        i3 |= 384;
        function2 = function1;
        if ((i3 & 731) == 146) {
            if (i6 != 0) {
                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
            } else {
                o00oooo3 = o00oooo2;
            }
            if (i4 != 0) {
                function3 = f6706OooO00o;
            } else {
                function3 = function2;
            }
            Context context6 = (Context) composer.OooOO0o(o0O0O00.f6591OooO0O0);
            composer.OooO0o0(-492369756);
            objOooO0o = composer.OooO0o();
            c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
            if (objOooO0o == c0323OooO00o) {
                objOooO0o = new OooOo00();
                composer.Oooo00o(objOooO0o);
            }
            composer.Oooo0o0();
            OooOo00 oooOo05 = (OooOo00) objOooO0o;
            composer.OooO0o0(-492369756);
            objOooO0o2 = composer.OooO0o();
            if (objOooO0o2 == c0323OooO00o) {
                objOooO0o2 = new p346o0OOO0o.OooOOOO();
                composer.Oooo00o(objOooO0o2);
            }
            composer.Oooo0o0();
            p346o0OOO0o.OooOOOO oooOOOO6 = (p346o0OOO0o.OooOOOO) objOooO0o2;
            o00oooo0OooO0OO = o00OOO0O.OooO0OO(composer, SemanticsModifierKt.OooO00o(o00oooo3.OooOOoo(NestedScrollModifierKt.OooO00o(o00OOOO0.OooO00o.f4198Oooo0o, oooOo05, oooOOOO6)), true, OooOOOO.f6729Oooo0o));
            oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
            layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00O0OOO o00o0oooOooO0O5 = o00O00O.OooO0O0(composer);
            o00o0oo2 = (o00O0OO) composer.OooOO0o(oo0oOO0.f4048OooO00o);
            strValueOf = String.valueOf(composer.Oooo0());
            composer.OooO0o0(-492369756);
            objOooO0o3 = composer.OooO0o();
            if (objOooO0o3 == c0323OooO00o) {
                objOooO0o3 = new o0000();
                composer.Oooo00o(objOooO0o3);
            }
            composer.Oooo0o0();
            o0000Var = (o0000) objOooO0o3;
            lifecycleOwner = (LifecycleOwner) composer.OooOO0o(o0O0O00.f6593OooO0Oo);
            o00oo1 = (o00Oo0) composer.OooOO0o(o0O0O00.f6595OooO0o0);
            o00oooo4 = o00oooo3;
            oooO00o = new OooO00o(context6, o00o0oooOooO0O5, oooOOOO6, factory, o00o0oo2, strValueOf, o0000Var);
            composer.OooO0o0(1886828752);
            if (!(composer.OooOo0o() instanceof o0000O0)) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOoO();
            if (composer.OooOOO0()) {
                composer.OooOoO0(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final LayoutNode invoke() {
                        return oooO00o.invoke();
                    }
                });
            } else {
                composer.Oooo00O();
            }
            Intrinsics.checkNotNullParameter(composer, "composer");
            oO00000o.OooO0O0(composer, o00oooo0OooO0OO, new OooO0O0(o0000Var));
            oO00000o.OooO0O0(composer, oooO, new OooO0OO(o0000Var));
            oO00000o.OooO0O0(composer, lifecycleOwner, new OooO0o(o0000Var));
            oO00000o.OooO0O0(composer, o00oo1, new OooO(o0000Var));
            oO00000o.OooO0O0(composer, function3, new OooOO0(o0000Var));
            oO00000o.OooO0O0(composer, layoutDirection, new OooOO0O(o0000Var));
            composer.Oooo0o();
            composer.Oooo0o0();
            if (o00o0oo2 != null) {
                o00Oo00.OooO00o(o00o0oo2, strValueOf, new OooOOO0(o00o0oo2, strValueOf, o0000Var), composer);
            }
            o00oooo2 = o00oooo4;
            function4 = function3;
        } else {
            if (i6 != 0) {
                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
            } else {
                o00oooo3 = o00oooo2;
            }
            if (i4 != 0) {
                function3 = f6706OooO00o;
            } else {
                function3 = function2;
            }
            Context context7 = (Context) composer.OooOO0o(o0O0O00.f6591OooO0O0);
            composer.OooO0o0(-492369756);
            objOooO0o = composer.OooO0o();
            c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
            if (objOooO0o == c0323OooO00o) {
                objOooO0o = new OooOo00();
                composer.Oooo00o(objOooO0o);
            }
            composer.Oooo0o0();
            OooOo00 oooOo06 = (OooOo00) objOooO0o;
            composer.OooO0o0(-492369756);
            objOooO0o2 = composer.OooO0o();
            if (objOooO0o2 == c0323OooO00o) {
                objOooO0o2 = new p346o0OOO0o.OooOOOO();
                composer.Oooo00o(objOooO0o2);
            }
            composer.Oooo0o0();
            p346o0OOO0o.OooOOOO oooOOOO7 = (p346o0OOO0o.OooOOOO) objOooO0o2;
            o00oooo0OooO0OO = o00OOO0O.OooO0OO(composer, SemanticsModifierKt.OooO00o(o00oooo3.OooOOoo(NestedScrollModifierKt.OooO00o(o00OOOO0.OooO00o.f4198Oooo0o, oooOo06, oooOOOO7)), true, OooOOOO.f6729Oooo0o));
            oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
            layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00O0OOO o00o0oooOooO0O6 = o00O00O.OooO0O0(composer);
            o00o0oo2 = (o00O0OO) composer.OooOO0o(oo0oOO0.f4048OooO00o);
            strValueOf = String.valueOf(composer.Oooo0());
            composer.OooO0o0(-492369756);
            objOooO0o3 = composer.OooO0o();
            if (objOooO0o3 == c0323OooO00o) {
                objOooO0o3 = new o0000();
                composer.Oooo00o(objOooO0o3);
            }
            composer.Oooo0o0();
            o0000Var = (o0000) objOooO0o3;
            lifecycleOwner = (LifecycleOwner) composer.OooOO0o(o0O0O00.f6593OooO0Oo);
            o00oo1 = (o00Oo0) composer.OooOO0o(o0O0O00.f6595OooO0o0);
            o00oooo4 = o00oooo3;
            oooO00o = new OooO00o(context7, o00o0oooOooO0O6, oooOOOO7, factory, o00o0oo2, strValueOf, o0000Var);
            composer.OooO0o0(1886828752);
            if (!(composer.OooOo0o() instanceof o0000O0)) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOoO();
            if (composer.OooOOO0()) {
                composer.OooOoO0(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final LayoutNode invoke() {
                        return oooO00o.invoke();
                    }
                });
            } else {
                composer.Oooo00O();
            }
            Intrinsics.checkNotNullParameter(composer, "composer");
            oO00000o.OooO0O0(composer, o00oooo0OooO0OO, new OooO0O0(o0000Var));
            oO00000o.OooO0O0(composer, oooO, new OooO0OO(o0000Var));
            oO00000o.OooO0O0(composer, lifecycleOwner, new OooO0o(o0000Var));
            oO00000o.OooO0O0(composer, o00oo1, new OooO(o0000Var));
            oO00000o.OooO0O0(composer, function3, new OooOO0(o0000Var));
            oO00000o.OooO0O0(composer, layoutDirection, new OooOO0O(o0000Var));
            composer.Oooo0o();
            composer.Oooo0o0();
            if (o00o0oo2 != null) {
                o00Oo00.OooO00o(o00o0oo2, strValueOf, new OooOOO0(o00o0oo2, strValueOf, o0000Var), composer);
            }
            o00oooo2 = o00oooo4;
            function4 = function3;
        }
        oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOOO(factory, o00oooo2, function4, i, i2));
    }
}

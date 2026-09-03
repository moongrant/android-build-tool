package androidx.compose.ui.platform;

import androidx.compose.runtime.ComposableInferredTarget;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/WrappedComposition;", "Lo000oOoO/o00O0OO;", "Landroidx/lifecycle/LifecycleEventObserver;", "ui_release"}, k = 1, mv = {1, 6, 0})
final class WrappedComposition implements p100o000oOoO.o00O0OO, LifecycleEventObserver {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public Lifecycle f6341Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final AndroidComposeView f6342Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final p100o000oOoO.o00O0OO f6343Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f6344Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public Function2<? super p100o000oOoO.oOO00O, ? super Integer, Unit> f6345OoooO00;

    public static final class OooO00o extends Lambda implements Function1<AndroidComposeView.OooO0O0, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function2<p100o000oOoO.oOO00O, Integer, Unit> f6347Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Function2<? super p100o000oOoO.oOO00O, ? super Integer, Unit> function2) {
            super(1);
            this.f6347Oooo0oO = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AndroidComposeView.OooO0O0 oooO0O0) {
            AndroidComposeView.OooO0O0 it = oooO0O0;
            Intrinsics.checkNotNullParameter(it, "it");
            if (!WrappedComposition.this.f6344Oooo0oo) {
                Lifecycle lifecycle = it.f6265OooO00o.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "it.lifecycleOwner.lifecycle");
                WrappedComposition wrappedComposition = WrappedComposition.this;
                wrappedComposition.f6345OoooO00 = this.f6347Oooo0oO;
                if (wrappedComposition.f6341Oooo == null) {
                    wrappedComposition.f6341Oooo = lifecycle;
                    lifecycle.addObserver(wrappedComposition);
                } else if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                    WrappedComposition wrappedComposition2 = WrappedComposition.this;
                    wrappedComposition2.f6343Oooo0oO.OooO(p043OooooO0.o00O0000.OooO0O0(-2000640158, true, new o0O00O0o(wrappedComposition2, this.f6347Oooo0oO)));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public WrappedComposition(@NotNull AndroidComposeView owner, @NotNull p100o000oOoO.o00O0OO original) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(original, "original");
        this.f6342Oooo0o = owner;
        this.f6343Oooo0oO = original;
        o0000OO0 o0000oo1 = o0000OO0.f6408OooO00o;
        this.f6345OoooO00 = o0000OO0.f6409OooO0O0;
    }

    @Override // p100o000oOoO.o00O0OO
    @ComposableInferredTarget(scheme = "[0[0]]")
    public final void OooO(@NotNull Function2<? super p100o000oOoO.oOO00O, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f6342Oooo0o.setOnViewTreeOwnersAvailable(new OooO00o(content));
    }

    @Override // p100o000oOoO.o00O0OO
    public final boolean OooO0o0() {
        return this.f6343Oooo0oO.OooO0o0();
    }

    @Override // p100o000oOoO.o00O0OO
    public final boolean OooOOO() {
        return this.f6343Oooo0oO.OooOOO();
    }

    @Override // p100o000oOoO.o00O0OO
    public final void dispose() {
        if (!this.f6344Oooo0oo) {
            this.f6344Oooo0oo = true;
            this.f6342Oooo0o.getView().setTag(p048OoooooO.o0oOO.wrapped_composition_tag, null);
            Lifecycle lifecycle = this.f6341Oooo;
            if (lifecycle != null) {
                lifecycle.removeObserver(this);
            }
        }
        this.f6343Oooo0oO.dispose();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        } else {
            if (event != Lifecycle.Event.ON_CREATE || this.f6344Oooo0oo) {
                return;
            }
            OooO(this.f6345OoooO00);
        }
    }
}

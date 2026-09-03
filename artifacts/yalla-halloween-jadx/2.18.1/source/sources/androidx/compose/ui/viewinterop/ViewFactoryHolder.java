package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.AbstractComposeView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o00O0OOO;
import p346o0OOO0o.OooOOOO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004R$\u0010\u000b\u001a\u0004\u0018\u00018\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nRF\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014RB\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\b¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "Landroid/view/View;", "T", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "", "OooooOo", "Landroid/view/View;", "getTypedView$ui_release", "()Landroid/view/View;", "setTypedView$ui_release", "(Landroid/view/View;)V", "typedView", "Lkotlin/Function1;", "Landroid/content/Context;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Oooooo0", "Lkotlin/jvm/functions/Function1;", "getFactory", "()Lkotlin/jvm/functions/Function1;", "setFactory", "(Lkotlin/jvm/functions/Function1;)V", "factory", "", "Oooooo", "getUpdateBlock", "setUpdateBlock", "updateBlock", "getViewRoot", "viewRoot", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder {

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public T typedView;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function1<? super T, Unit> updateBlock;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Context, ? extends T> factory;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ ViewFactoryHolder<T> f6735Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ViewFactoryHolder<T> viewFactoryHolder) {
            super(0);
            this.f6735Oooo0o = viewFactoryHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            View typedView$ui_release = this.f6735Oooo0o.getTypedView$ui_release();
            if (typedView$ui_release != null) {
                this.f6735Oooo0o.getUpdateBlock().invoke(typedView$ui_release);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewFactoryHolder(@NotNull Context context, @Nullable o00O0OOO o00o0ooo2, @NotNull OooOOOO dispatcher) {
        super(context, o00o0ooo2, dispatcher);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Function1<View, Unit> function1 = AndroidView_androidKt.f6706OooO00o;
        this.updateBlock = AndroidView_androidKt.f6706OooO00o;
    }

    @Nullable
    public final Function1<Context, T> getFactory() {
        return this.factory;
    }

    @Nullable
    public /* bridge */ /* synthetic */ AbstractComposeView getSubCompositionView() {
        return null;
    }

    @Nullable
    public final T getTypedView$ui_release() {
        return this.typedView;
    }

    @NotNull
    public final Function1<T, Unit> getUpdateBlock() {
        return this.updateBlock;
    }

    @NotNull
    public View getViewRoot() {
        return this;
    }

    public final void setFactory(@Nullable Function1<? super Context, ? extends T> function1) {
        this.factory = function1;
        if (function1 != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            T tInvoke = function1.invoke(context);
            this.typedView = tInvoke;
            setView$ui_release(tInvoke);
        }
    }

    public final void setTypedView$ui_release(@Nullable T t) {
        this.typedView = t;
    }

    public final void setUpdateBlock(@NotNull Function1<? super T, Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.updateBlock = value;
        setUpdate(new OooO00o(this));
    }
}

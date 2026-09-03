package androidx.compose.compiler.plugins.kotlin.inference;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0002J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000eJ\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0006\u0010\u0017\u001a\u00020\nJ\u0016\u0010\u0018\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/inference/Bindings;", "", "()V", "listeners", "", "Lkotlin/Function0;", "", "bind", "", "a", "Landroidx/compose/compiler/plugins/kotlin/inference/Binding;", "b", "binding", "token", "", "bindingValueChanged", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Landroidx/compose/compiler/plugins/kotlin/inference/Value;", "changed", "closed", "target", "onChange", "callback", "open", "unify", "unifyValues", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Bindings {

    @NotNull
    private final List<Function0<Unit>> listeners = new ArrayList();

    private final boolean bind(Binding a, Binding b) {
        Value value = a.getValue();
        Value value2 = b.getValue();
        if (Intrinsics.areEqual(value, value2)) {
            return true;
        }
        int size = value.getSize();
        int size2 = value2.getSize();
        Set<Bindings> setPlus = SetsKt.plus((Set) value.getObservers(), (Iterable) value2.getObservers());
        if (size > size2) {
            value.setSize(value.getSize() + size2);
            value.setObservers(setPlus);
            unifyValues(b, value);
        } else {
            value2.setSize(value2.getSize() + size);
            value2.setObservers(setPlus);
            unifyValues(a, value2);
        }
        Binding next = a.getNext();
        a.setNext(b.getNext());
        b.setNext(next);
        bindingValueChanged(a.getValue());
        return true;
    }

    private final void bindingValueChanged(Value value) {
        Iterator<Bindings> it = value.getObservers().iterator();
        while (it.hasNext()) {
            it.next().changed();
        }
    }

    private final void changed() {
        if (!this.listeners.isEmpty()) {
            Iterator it = CollectionsKt.toMutableList((Collection) this.listeners).iterator();
            while (it.hasNext()) {
                ((Function0) it.next()).invoke();
            }
        }
    }

    private final void unifyValues(Binding b, Value value) {
        b.setValue(value);
        for (Binding next = b.getNext(); !Intrinsics.areEqual(next, b); next = next.getNext()) {
            next.setValue(value);
        }
    }

    @NotNull
    public final Binding closed(@NotNull String target) {
        Intrinsics.checkNotNullParameter(target, "target");
        return new Binding(target, SetsKt.emptySet());
    }

    @NotNull
    public final Function0<Unit> onChange(@NotNull final Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.listeners.add(callback);
        return new Function0<Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.inference.Bindings.onChange.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Bindings.this.listeners.remove(callback);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Binding open() {
        return new Binding(null, SetsKt.setOf(this), 1, 0 == true ? 1 : 0);
    }

    public final boolean unify(@NotNull Binding a, @NotNull Binding b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        String token = a.getValue().getToken();
        String token2 = b.getValue().getToken();
        if (token != null && token2 == null) {
            return bind(b, token);
        }
        if (token != null || token2 == null) {
            return (token == null || token2 == null) ? bind(a, b) : Intrinsics.areEqual(token, token2);
        }
        return bind(a, token2);
    }

    private final boolean bind(Binding binding, String token) {
        Value value = binding.getValue();
        value.setToken(token);
        bindingValueChanged(value);
        value.setObservers(SetsKt.emptySet());
        return true;
    }
}

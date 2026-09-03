package androidx.lifecycle.viewmodel.compose;

import android.os.Bundle;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.lifecycle.SavedStateHandle;
import androidx.savedstate.OooO00o;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.PropertyDelegateProvider;
import kotlin.properties.ReadOnlyProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p063o0000oO.o00Ooo;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a>\u0010\u0000\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00020\u0001\"\u0004\b\u0000\u0010\u00032\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\b\u0001\u0012\u00020\u00040\u0001H\u0002\u001am\u0010\u0006\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u0002H\u00030\b0\u0007\"\b\b\u0000\u0010\u0003*\u00020\u0004\"\u000e\b\u0001\u0010\t*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\b\u0001\u0012\u00020\u00040\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\t0\rH\u0007¢\u0006\u0002\b\u000e\u001aX\u0010\u0006\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u0002H\u00030\u000f0\u0007\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\n2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\b\u0001\u0012\u00020\u00040\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00030\rH\u0007\u001aI\u0010\u0006\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\b\u0001\u0012\u00020\u00040\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00030\rH\u0007¢\u0006\u0002\u0010\u0013\u001aJ\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\b\u0001\u0012\u00020\u00040\u00012\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\rH\u0007¨\u0006\u0014"}, d2 = {"mutableStateSaver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/runtime/MutableState;", "T", "", "inner", "saveable", "Lkotlin/properties/PropertyDelegateProvider;", "Lkotlin/properties/ReadWriteProperty;", "M", "Landroidx/lifecycle/SavedStateHandle;", "stateSaver", "init", "Lkotlin/Function0;", "saveableMutableState", "Lkotlin/properties/ReadOnlyProperty;", "saver", "key", "", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Landroidx/compose/runtime/saveable/Saver;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "lifecycle-viewmodel-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSavedStateHandleSaver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSaver.kt\nandroidx/lifecycle/viewmodel/compose/SavedStateHandleSaverKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
public final class SavedStateHandleSaverKt {
    private static final <T> Saver<MutableState<T>, MutableState<Object>> mutableStateSaver(final Saver<T, ? extends Object> saver) {
        Intrinsics.checkNotNull(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver, kotlin.Any>");
        return SaverKt.Saver(new Function2<SaverScope, MutableState<T>, MutableState<Object>>() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$mutableStateSaver$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final MutableState<Object> invoke(@NotNull SaverScope Saver, @NotNull MutableState<T> state) {
                Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                Intrinsics.checkNotNullParameter(state, "state");
                if (!(state instanceof SnapshotMutableState)) {
                    throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()".toString());
                }
                Object objSave = saver.save(Saver, state.getValue());
                SnapshotMutationPolicy<T> policy = ((SnapshotMutableState) state).getPolicy();
                Intrinsics.checkNotNull(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
                return SnapshotStateKt.mutableStateOf(objSave, policy);
            }
        }, new Function1<MutableState<Object>, MutableState<T>>() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$mutableStateSaver$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final MutableState<T> invoke(@NotNull MutableState<Object> it) {
                T tRestore;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof SnapshotMutableState)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                if (it.getValue() != null) {
                    Saver<T, Object> saver2 = saver;
                    Object value = it.getValue();
                    Intrinsics.checkNotNull(value);
                    tRestore = saver2.restore(value);
                } else {
                    tRestore = null;
                }
                SnapshotMutationPolicy<T> policy = ((SnapshotMutableState) it).getPolicy();
                Intrinsics.checkNotNull(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver$lambda$0?>");
                MutableState<T> mutableStateMutableStateOf = SnapshotStateKt.mutableStateOf(tRestore, policy);
                Intrinsics.checkNotNull(mutableStateMutableStateOf, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver$lambda$0>");
                return mutableStateMutableStateOf;
            }
        });
    }

    @SavedStateHandleSaveableApi
    @NotNull
    /* JADX INFO: renamed from: saveable, reason: collision with other method in class */
    public static final <T> T m4012saveable(@NotNull SavedStateHandle savedStateHandle, @NotNull String key, @NotNull final Saver<T, ? extends Object> saver, @NotNull Function0<? extends T> init) {
        final T tInvoke;
        Object obj;
        Intrinsics.checkNotNullParameter(savedStateHandle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(saver, "saver");
        Intrinsics.checkNotNullParameter(init, "init");
        Bundle bundle = (Bundle) savedStateHandle.get(key);
        if (bundle == null || (obj = bundle.get(AppMeasurementSdk.ConditionalUserProperty.VALUE)) == null || (tInvoke = saver.restore(obj)) == null) {
            tInvoke = init.invoke();
        }
        savedStateHandle.setSavedStateProvider(key, new OooO00o.OooO0O0() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.saveable.1
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
            @Override // androidx.savedstate.OooO00o.OooO0O0
            @NotNull
            public final Bundle saveState() {
                return o00Ooo.OooO0O0(TuplesKt.to(AppMeasurementSdk.ConditionalUserProperty.VALUE, saver.save(new SavedStateHandleSaverKt$saveable$1$saveState$1$1(SavedStateHandle.INSTANCE), tInvoke)));
            }
        });
        return tInvoke;
    }

    public static /* synthetic */ Object saveable$default(SavedStateHandle savedStateHandle, String str, Saver saver, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            saver = SaverKt.autoSaver();
        }
        return m4012saveable(savedStateHandle, str, saver, function0);
    }

    @SavedStateHandleSaveableApi
    @JvmName(name = "saveableMutableState")
    @NotNull
    public static final <T, M extends MutableState<T>> PropertyDelegateProvider<Object, ReadWriteProperty<Object, T>> saveableMutableState(@NotNull final SavedStateHandle savedStateHandle, @NotNull final Saver<T, ? extends Object> stateSaver, @NotNull final Function0<? extends M> init) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "<this>");
        Intrinsics.checkNotNullParameter(stateSaver, "stateSaver");
        Intrinsics.checkNotNullParameter(init, "init");
        return new PropertyDelegateProvider<Object, ReadWriteProperty<? super Object, T>>() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.saveable.3
            @Override // kotlin.properties.PropertyDelegateProvider
            public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, KProperty kProperty) {
                return provideDelegate(obj, (KProperty<?>) kProperty);
            }

            @Override // kotlin.properties.PropertyDelegateProvider
            @NotNull
            public final ReadWriteProperty<Object, T> provideDelegate(@Nullable Object obj, @NotNull KProperty<?> property) {
                Intrinsics.checkNotNullParameter(property, "property");
                final MutableState mutableStateSaveable = SavedStateHandleSaverKt.saveable(savedStateHandle, property.getName(), (Saver) stateSaver, (Function0) init);
                return new ReadWriteProperty<Object, T>() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$saveable$3$provideDelegate$1
                    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
                    @NotNull
                    public T getValue(@Nullable Object thisRef, @NotNull KProperty<?> property2) {
                        Intrinsics.checkNotNullParameter(property2, "property");
                        return mutableStateSaveable.getValue();
                    }

                    @Override // kotlin.properties.ReadWriteProperty
                    public void setValue(@Nullable Object thisRef, @NotNull KProperty<?> property2, @NotNull T value) {
                        Intrinsics.checkNotNullParameter(property2, "property");
                        Intrinsics.checkNotNullParameter(value, "value");
                        mutableStateSaveable.setValue(value);
                    }
                };
            }
        };
    }

    public static /* synthetic */ PropertyDelegateProvider saveableMutableState$default(SavedStateHandle savedStateHandle, Saver saver, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            saver = SaverKt.autoSaver();
        }
        return saveableMutableState(savedStateHandle, saver, function0);
    }

    @SavedStateHandleSaveableApi
    @NotNull
    public static final <T> MutableState<T> saveable(@NotNull SavedStateHandle savedStateHandle, @NotNull String key, @NotNull Saver<T, ? extends Object> stateSaver, @NotNull Function0<? extends MutableState<T>> init) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(stateSaver, "stateSaver");
        Intrinsics.checkNotNullParameter(init, "init");
        return (MutableState) m4012saveable(savedStateHandle, key, mutableStateSaver(stateSaver), (Function0) init);
    }

    public static /* synthetic */ PropertyDelegateProvider saveable$default(SavedStateHandle savedStateHandle, Saver saver, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            saver = SaverKt.autoSaver();
        }
        return saveable(savedStateHandle, saver, function0);
    }

    @SavedStateHandleSaveableApi
    @NotNull
    public static final <T> PropertyDelegateProvider<Object, ReadOnlyProperty<Object, T>> saveable(@NotNull final SavedStateHandle savedStateHandle, @NotNull final Saver<T, ? extends Object> saver, @NotNull final Function0<? extends T> init) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "<this>");
        Intrinsics.checkNotNullParameter(saver, "saver");
        Intrinsics.checkNotNullParameter(init, "init");
        return new PropertyDelegateProvider<Object, ReadOnlyProperty<? super Object, ? extends T>>() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.saveable.2
            @Override // kotlin.properties.PropertyDelegateProvider
            public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, KProperty kProperty) {
                return provideDelegate(obj, (KProperty<?>) kProperty);
            }

            @Override // kotlin.properties.PropertyDelegateProvider
            @NotNull
            public final ReadOnlyProperty<Object, T> provideDelegate(@Nullable Object obj, @NotNull KProperty<?> property) {
                Intrinsics.checkNotNullParameter(property, "property");
                final Object objM4012saveable = SavedStateHandleSaverKt.m4012saveable(savedStateHandle, property.getName(), (Saver<Object, ? extends Object>) saver, (Function0<? extends Object>) init);
                return new ReadOnlyProperty<Object, T>() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$saveable$2$provideDelegate$1
                    @Override // kotlin.properties.ReadOnlyProperty
                    @NotNull
                    public final T getValue(@Nullable Object obj2, @NotNull KProperty<?> kProperty) {
                        Intrinsics.checkNotNullParameter(kProperty, "<anonymous parameter 1>");
                        return objM4012saveable;
                    }
                };
            }
        };
    }
}

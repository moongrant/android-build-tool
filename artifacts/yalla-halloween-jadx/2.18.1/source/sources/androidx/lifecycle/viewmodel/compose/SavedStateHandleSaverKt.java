package androidx.lifecycle.viewmodel.compose;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.PropertyDelegateProvider;
import kotlin.properties.ReadOnlyProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import o000O00O.OooO0OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045OooooOo.o00O;
import p045OooooOo.o00OO000;
import p045OooooOo.o00OO00O;
import p047Oooooo0.o00OO0O0;
import p094o000o0OO.o0OoOo0;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aK\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001aJ\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00052\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u0007H\u0007\u001aX\u0010\t\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00028\u00000\u000e0\r\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007\u001ao\u0010\t\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00028\u00000\u00100\r\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\f*\u00020\u00022\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a>\u0010\u0014\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\f0\u0005\"\u0004\b\u0000\u0010\u00012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u0005H\u0002¨\u0006\u0015"}, d2 = {"", "T", "Landroidx/lifecycle/SavedStateHandle;", "", "key", "LOooooOo/o00O;", "saver", "Lkotlin/Function0;", "init", "saveable", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;LOooooOo/o00O;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "stateSaver", "Lo000oOoO/o0O00OO;", "Lkotlin/properties/PropertyDelegateProvider;", "Lkotlin/properties/ReadOnlyProperty;", "M", "Lkotlin/properties/ReadWriteProperty;", "saveableMutableState", "(Landroidx/lifecycle/SavedStateHandle;LOooooOo/o00O;Lkotlin/jvm/functions/Function0;)Lkotlin/properties/PropertyDelegateProvider;", ak.au, "mutableStateSaver", "lifecycle-viewmodel-compose_release"}, k = 2, mv = {1, 6, 0})
public final class SavedStateHandleSaverKt {
    private static final <T> o00O<o0O00OO<T>, o0O00OO<Object>> mutableStateSaver(final o00O<T, ? extends Object> o00o2) {
        return o00OO000.OooO00o(new Function2<o00OO00O, o0O00OO<T>, o0O00OO<Object>>() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$mutableStateSaver$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final o0O00OO<Object> invoke(@NotNull o00OO00O Saver, @NotNull o0O00OO<T> state) {
                Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                Intrinsics.checkNotNullParameter(state, "state");
                if (state instanceof o00OO0O0) {
                    return o0OOO00.OooO0OO(o00o2.OooO0O0(Saver, state.getValue()), ((o00OO0O0) state).OooO());
                }
                throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()".toString());
            }
        }, new Function1<o0O00OO<Object>, o0O00OO<T>>() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$mutableStateSaver$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final o0O00OO<T> invoke(@NotNull o0O00OO<Object> it) {
                T tOooO00o;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof o00OO0O0)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                if (it.getValue() != null) {
                    o00O<T, Object> o00o3 = o00o2;
                    Object value = it.getValue();
                    Intrinsics.checkNotNull(value);
                    tOooO00o = o00o3.OooO00o(value);
                } else {
                    tOooO00o = null;
                }
                return o0OOO00.OooO0OO(tOooO00o, ((o00OO0O0) it).OooO());
            }
        });
    }

    @SavedStateHandleSaveableApi
    @NotNull
    public static final <T> T saveable(@NotNull SavedStateHandle savedStateHandle, @NotNull String key, @NotNull final o00O<T, ? extends Object> saver, @NotNull Function0<? extends T> init) {
        final T tInvoke;
        Object obj;
        Intrinsics.checkNotNullParameter(savedStateHandle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(saver, "saver");
        Intrinsics.checkNotNullParameter(init, "init");
        Bundle bundle = (Bundle) savedStateHandle.get(key);
        if (bundle == null || (obj = bundle.get(AppMeasurementSdk.ConditionalUserProperty.VALUE)) == null || (tInvoke = saver.OooO00o(obj)) == null) {
            tInvoke = init.invoke();
        }
        savedStateHandle.setSavedStateProvider(key, new o0OoOo0.OooO0O0() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.saveable.1
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
            @Override // o000o0OO.o0OoOo0.OooO0O0
            @NotNull
            public final Bundle saveState() {
                return OooO0OO.OooO0O0(TuplesKt.to(AppMeasurementSdk.ConditionalUserProperty.VALUE, saver.OooO0O0(new SavedStateHandleSaverKt$saveable$1$saveState$1$1(SavedStateHandle.INSTANCE), tInvoke)));
            }
        });
        return tInvoke;
    }

    public static Object saveable$default(SavedStateHandle savedStateHandle, String str, o00O o00o2, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            o00o2 = o00OO000.f4038OooO00o;
        }
        return saveable(savedStateHandle, str, o00o2, function0);
    }

    @SavedStateHandleSaveableApi
    @JvmName(name = "saveableMutableState")
    @NotNull
    public static final <T, M extends o0O00OO<T>> PropertyDelegateProvider<Object, ReadWriteProperty<Object, T>> saveableMutableState(@NotNull final SavedStateHandle savedStateHandle, @NotNull final o00O<T, ? extends Object> stateSaver, @NotNull final Function0<? extends M> init) {
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
                final o0O00OO o0o00ooM9saveable = SavedStateHandleSaverKt.m9saveable(savedStateHandle, property.getName(), (o00O) stateSaver, (Function0) init);
                return new ReadWriteProperty<Object, T>() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$saveable$3$provideDelegate$1
                    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
                    @NotNull
                    public T getValue(@Nullable Object thisRef, @NotNull KProperty<?> property2) {
                        Intrinsics.checkNotNullParameter(property2, "property");
                        return o0o00ooM9saveable.getValue();
                    }

                    @Override // kotlin.properties.ReadWriteProperty
                    public void setValue(@Nullable Object thisRef, @NotNull KProperty<?> property2, @NotNull T value) {
                        Intrinsics.checkNotNullParameter(property2, "property");
                        Intrinsics.checkNotNullParameter(value, "value");
                        o0o00ooM9saveable.setValue(value);
                    }
                };
            }
        };
    }

    public static PropertyDelegateProvider saveableMutableState$default(SavedStateHandle savedStateHandle, o00O o00o2, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            o00o2 = o00OO000.f4038OooO00o;
        }
        return saveableMutableState(savedStateHandle, o00o2, function0);
    }

    @SavedStateHandleSaveableApi
    @NotNull
    /* JADX INFO: renamed from: saveable, reason: collision with other method in class */
    public static final <T> o0O00OO<T> m9saveable(@NotNull SavedStateHandle savedStateHandle, @NotNull String key, @NotNull o00O<T, ? extends Object> stateSaver, @NotNull Function0<? extends o0O00OO<T>> init) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(stateSaver, "stateSaver");
        Intrinsics.checkNotNullParameter(init, "init");
        return (o0O00OO) saveable(savedStateHandle, key, mutableStateSaver(stateSaver), (Function0) init);
    }

    public static PropertyDelegateProvider saveable$default(SavedStateHandle savedStateHandle, o00O o00o2, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            o00o2 = o00OO000.f4038OooO00o;
        }
        return saveable(savedStateHandle, o00o2, function0);
    }

    @SavedStateHandleSaveableApi
    @NotNull
    public static final <T> PropertyDelegateProvider<Object, ReadOnlyProperty<Object, T>> saveable(@NotNull final SavedStateHandle savedStateHandle, @NotNull final o00O<T, ? extends Object> saver, @NotNull final Function0<? extends T> init) {
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
                final Object objSaveable = SavedStateHandleSaverKt.saveable(savedStateHandle, property.getName(), (o00O<Object, ? extends Object>) saver, (Function0<? extends Object>) init);
                return new ReadOnlyProperty<Object, T>() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$saveable$2$provideDelegate$1
                    @Override // kotlin.properties.ReadOnlyProperty
                    @NotNull
                    public final T getValue(@Nullable Object obj2, @NotNull KProperty<?> kProperty) {
                        Intrinsics.checkNotNullParameter(kProperty, "<anonymous parameter 1>");
                        return objSaveable;
                    }
                };
            }
        };
    }
}

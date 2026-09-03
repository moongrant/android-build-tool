package p254o00ooO0O;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.reflect.InvocationTargetException;
import kotlin.Lazy;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p104o000oo0O.o00O0O;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o00O000o<VB extends o00O0O> implements Lazy<VB> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public VB f34349Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final KClass<VB> f34350Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final Context f34351Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public final Function0<ViewGroup> f34352Oooo0oo;

    /* JADX WARN: Multi-variable type inference failed */
    public o00O000o(@NotNull KClass<VB> viewBindingClass, @NotNull Context context, @Nullable Function0<? extends ViewGroup> function0) {
        Intrinsics.checkNotNullParameter(viewBindingClass, "viewBindingClass");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34350Oooo0o = viewBindingClass;
        this.f34351Oooo0oO = context;
        this.f34352Oooo0oo = function0;
    }

    @Override // kotlin.Lazy
    public final Object getValue() throws IllegalAccessException, InvocationTargetException {
        VB vb = this.f34349Oooo;
        if (vb != null) {
            return vb;
        }
        if (this.f34352Oooo0oo == null) {
            Object objInvoke = JvmClassMappingKt.getJavaClass((KClass) this.f34350Oooo0o).getMethod("inflate", LayoutInflater.class).invoke(null, LayoutInflater.from(this.f34351Oooo0oO));
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type VB of com.code.android.util.ViewBindingParentLazy");
            VB vb2 = (VB) objInvoke;
            this.f34349Oooo = vb2;
            return vb2;
        }
        Object objInvoke2 = JvmClassMappingKt.getJavaClass((KClass) this.f34350Oooo0o).getMethod("inflate", LayoutInflater.class, ViewGroup.class, Boolean.TYPE).invoke(null, LayoutInflater.from(this.f34351Oooo0oO), this.f34352Oooo0oo.invoke(), Boolean.TRUE);
        Intrinsics.checkNotNull(objInvoke2, "null cannot be cast to non-null type VB of com.code.android.util.ViewBindingParentLazy");
        VB vb3 = (VB) objInvoke2;
        this.f34349Oooo = vb3;
        return vb3;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this.f34349Oooo != null;
    }
}

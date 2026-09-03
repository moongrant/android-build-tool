package com.code.android.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.reflect.InvocationTargetException;
import kotlin.Lazy;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p081o000OoOO.OooO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nViewBindingUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingParentLazy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n1#2:50\n*E\n"})
public final class o000O0Oo<VB extends p081o000OoOO.OooO> implements Lazy<VB> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final KClass<VB> f10358OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final Function0<ViewGroup> f10359OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Context f10360OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public VB f10361OooO0oO;

    /* JADX WARN: Multi-variable type inference failed */
    public o000O0Oo(@NotNull KClass<VB> viewBindingClass, @NotNull Context context, @Nullable Function0<? extends ViewGroup> function0) {
        Intrinsics.checkNotNullParameter(viewBindingClass, "viewBindingClass");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10358OooO0Oo = viewBindingClass;
        this.f10360OooO0o0 = context;
        this.f10359OooO0o = function0;
    }

    @Override // kotlin.Lazy
    public final Object getValue() throws IllegalAccessException, InvocationTargetException {
        VB vb = this.f10361OooO0oO;
        if (vb != null) {
            return vb;
        }
        Context context = this.f10360OooO0o0;
        KClass<VB> kClass = this.f10358OooO0Oo;
        Function0<ViewGroup> function0 = this.f10359OooO0o;
        if (function0 == null) {
            Object objInvoke = JvmClassMappingKt.getJavaClass((KClass) kClass).getMethod("inflate", LayoutInflater.class).invoke(null, LayoutInflater.from(context));
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type VB of com.code.android.util.ViewBindingParentLazy");
            VB vb2 = (VB) objInvoke;
            this.f10361OooO0oO = vb2;
            return vb2;
        }
        Object objInvoke2 = JvmClassMappingKt.getJavaClass((KClass) kClass).getMethod("inflate", LayoutInflater.class, ViewGroup.class, Boolean.TYPE).invoke(null, LayoutInflater.from(context), function0.invoke(), Boolean.TRUE);
        Intrinsics.checkNotNull(objInvoke2, "null cannot be cast to non-null type VB of com.code.android.util.ViewBindingParentLazy");
        VB vb3 = (VB) objInvoke2;
        this.f10361OooO0oO = vb3;
        return vb3;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this.f10361OooO0oO != null;
    }
}

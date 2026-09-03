package com.yalla.yalla.ui.activity.user;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ BadgeActivity f23344OooO00o;

    public OooO00o(BadgeActivity badgeActivity) {
        this.f23344OooO00o = badgeActivity;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    public final <T extends ViewModel> T create(@NotNull Class<T> modelClass) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        T tNewInstance = modelClass.getConstructor(Long.TYPE).newInstance(Long.valueOf(this.f23344OooO00o.getIntent().getLongExtra("USER_ID", 0L)));
        Intrinsics.checkNotNullExpressionValue(tNewInstance, "modelClass.getConstructo…getLongExtra(USER_ID, 0))");
        return tNewInstance;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
        return androidx.lifecycle.OooOOOO.OooO0O0(this, cls, creationExtras);
    }
}

package com.yalla.yalla.module.event.ui.screen;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.yalla.yalla.model.SquareEventRoomModel;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O0 implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ArrayList<SquareEventRoomModel> f23939OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ int f23940OooO0O0;

    public o00000O0(ArrayList<SquareEventRoomModel> arrayList, int i) {
        this.f23939OooO00o = arrayList;
        this.f23940OooO0O0 = i;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
        return androidx.lifecycle.OooOo.OooO0O0(this, cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    public final <T extends ViewModel> T create(@NotNull Class<T> modelClass) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        T tNewInstance = modelClass.getConstructor(Long.TYPE).newInstance(Long.valueOf(this.f23939OooO00o.get(this.f23940OooO0O0).getRoomId()));
        Intrinsics.checkNotNullExpressionValue(tNewInstance, "modelClass.getConstructo…omList[pageIndex].roomId)");
        return tNewInstance;
    }
}

package com.yalla.yalla.module.media.music;

import androidx.compose.runtime.State;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ State<Boolean> f24584OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(State<Boolean> state) {
        super(0);
        this.f24584OooO0Oo = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!MusicScreen.Content$lambda$15(this.f24584OooO0Oo)) {
            MusicEditScreen.navigate$default(MusicEditScreen.INSTANCE, false, null, 3, null);
        }
        return Unit.INSTANCE;
    }
}

package com.yalla.yalla.module.media.music;

import androidx.compose.runtime.State;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f24120OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ State<Boolean> f24121OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(boolean z, State<Boolean> state) {
        super(0);
        this.f24120OooO0Oo = z;
        this.f24121OooO0o0 = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!MusicScreen.Content$lambda$15(this.f24121OooO0o0)) {
            MusicEditScreen.navigate$default(MusicEditScreen.INSTANCE, false, null, this.f24120OooO0Oo, 3, null);
        }
        return Unit.INSTANCE;
    }
}

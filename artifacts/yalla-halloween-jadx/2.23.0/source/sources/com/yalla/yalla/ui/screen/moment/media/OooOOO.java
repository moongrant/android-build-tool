package com.yalla.yalla.ui.screen.moment.media;

import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.LifecycleOwnerKt;
import com.common.support.roomgiftplayer.download.VideoDownLoadManager;
import com.yalla.yalla.model.moment.MomentDetailModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f29427OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f29428OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f29429OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f29430OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableIntState f29431OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f29432OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(MutableState<Boolean> mutableState, MomentDetailModel momentDetailModel, AppCompatActivity appCompatActivity, MutableIntState mutableIntState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3) {
        super(1);
        this.f29428OooO0Oo = mutableState;
        this.f29430OooO0o0 = momentDetailModel;
        this.f29429OooO0o = appCompatActivity;
        this.f29431OooO0oO = mutableIntState;
        this.f29432OooO0oo = mutableState2;
        this.f29427OooO = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            Boolean bool2 = Boolean.TRUE;
            MutableState<Boolean> mutableState = this.f29428OooO0Oo;
            mutableState.setValue(bool2);
            MutableIntState mutableIntState = this.f29431OooO0oO;
            mutableIntState.setIntValue(0);
            MutableState<Boolean> mutableState2 = this.f29432OooO0oo;
            VideoFeedScreen.MainContent$lambda$16(mutableState2, false);
            MutableState<Boolean> mutableState3 = this.f29427OooO;
            VideoFeedScreen.MainContent$lambda$19(mutableState3, false);
            VideoDownLoadManager.INSTANCE.startDownLoad(this.f29430OooO0o0.getVideoUrl(), LifecycleOwnerKt.getLifecycleScope(this.f29429OooO0o), new OooOO0O(mutableIntState), new OooOOO0(mutableState, mutableState2, mutableState3));
        }
        return Unit.INSTANCE;
    }
}

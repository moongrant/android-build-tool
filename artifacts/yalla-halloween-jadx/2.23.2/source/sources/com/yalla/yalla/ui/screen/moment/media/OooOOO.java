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
    public final /* synthetic */ MutableState<Boolean> f28893OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f28894OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f28895OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f28896OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableIntState f28897OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f28898OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(MutableState<Boolean> mutableState, MomentDetailModel momentDetailModel, AppCompatActivity appCompatActivity, MutableIntState mutableIntState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3) {
        super(1);
        this.f28894OooO0Oo = mutableState;
        this.f28896OooO0o0 = momentDetailModel;
        this.f28895OooO0o = appCompatActivity;
        this.f28897OooO0oO = mutableIntState;
        this.f28898OooO0oo = mutableState2;
        this.f28893OooO = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            Boolean bool2 = Boolean.TRUE;
            MutableState<Boolean> mutableState = this.f28894OooO0Oo;
            mutableState.setValue(bool2);
            MutableIntState mutableIntState = this.f28897OooO0oO;
            mutableIntState.setIntValue(0);
            MutableState<Boolean> mutableState2 = this.f28898OooO0oo;
            VideoFeedScreen.MainContent$lambda$16(mutableState2, false);
            MutableState<Boolean> mutableState3 = this.f28893OooO;
            VideoFeedScreen.MainContent$lambda$19(mutableState3, false);
            VideoDownLoadManager.INSTANCE.startDownLoad(this.f28896OooO0o0.getVideoUrl(), LifecycleOwnerKt.getLifecycleScope(this.f28895OooO0o), new OooOO0O(mutableIntState), new OooOOO0(mutableState, mutableState2, mutableState3));
        }
        return Unit.INSTANCE;
    }
}

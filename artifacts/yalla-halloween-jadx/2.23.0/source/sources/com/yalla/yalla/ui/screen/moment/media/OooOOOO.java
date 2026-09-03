package com.yalla.yalla.ui.screen.moment.media;

import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOOO extends Lambda implements Function1<MomentDetailModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f29436OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f29437OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f29438OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableIntState f29439OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f29440OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(AppCompatActivity appCompatActivity, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableIntState mutableIntState, MutableState<Boolean> mutableState3) {
        super(1);
        this.f29436OooO0Oo = appCompatActivity;
        this.f29438OooO0o0 = mutableState;
        this.f29437OooO0o = mutableState2;
        this.f29439OooO0oO = mutableIntState;
        this.f29440OooO0oo = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentDetailModel momentDetailModel) {
        AppCompatActivity appCompatActivity;
        MomentDetailModel item = momentDetailModel;
        Intrinsics.checkNotNullParameter(item, "item");
        if (VideoFeedScreen.MainContent$lambda$18(this.f29438OooO0o0) && (appCompatActivity = this.f29436OooO0Oo) != null) {
            com.yalla.yalla.util.permission.OooO00o.OooO0OO(appCompatActivity, PermissionGroupReveal.f32884OooO0o0, null, new OooOOO(this.f29437OooO0o, item, appCompatActivity, this.f29439OooO0oO, this.f29440OooO0oo, this.f29438OooO0o0));
        }
        return Unit.INSTANCE;
    }
}

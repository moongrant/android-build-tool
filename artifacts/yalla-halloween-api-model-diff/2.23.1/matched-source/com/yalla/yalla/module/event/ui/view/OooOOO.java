package com.yalla.yalla.module.event.ui.view;

import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.MutableState;
import com.yalla.yalla.model.event.EventModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p587o0oOooO.oO0Oo0oo;
import p593o0oOoooO.h0;
import p606o0oo0O0.Oooo000;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f23608OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f23609OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ EventModel f23610OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f23611OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(Context context, EventModel eventModel, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
        super(0);
        this.f23608OooO0Oo = context;
        this.f23610OooO0o0 = eventModel;
        this.f23609OooO0o = mutableState;
        this.f23611OooO0oO = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        h0.OooO0O0("101018");
        if (Build.VERSION.SDK_INT >= 24) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new OooOO0O(this.f23609OooO0o, null), 2, null);
            Context context = this.f23608OooO0Oo;
            EventModel eventModel = this.f23610OooO0o0;
            oO0Oo0oo.OooO00o(context, eventModel.getEventName(), eventModel.getEventDesc(), Oooo000.OooO00o(eventModel.getEventStartTime()), Oooo000.OooO00o(eventModel.getEventEndTime()), new OooOOO0(this.f23611OooO0oO));
        }
        return Unit.INSTANCE;
    }
}

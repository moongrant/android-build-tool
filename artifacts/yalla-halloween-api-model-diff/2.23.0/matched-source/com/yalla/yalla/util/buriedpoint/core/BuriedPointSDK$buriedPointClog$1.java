package com.yalla.yalla.util.buriedpoint.core;

import com.code.android.json.OooO00o;
import com.code.android.util.OooOOO;
import com.yalla.yalla.data.db.model.BuriedPoint;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.yalla.yalla.util.buriedpoint.core.BuriedPointSDK$buriedPointClog$1", f = "BuriedPointSDK.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nBuriedPointSDK.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuriedPointSDK.kt\ncom/yalla/yalla/util/buriedpoint/core/BuriedPointSDK$buriedPointClog$1\n+ 2 JsonUtil.kt\ncom/code/android/json/JsonUtil\n+ 3 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n*L\n1#1,66:1\n109#2:67\n109#2:68\n62#3:69\n*S KotlinDebug\n*F\n+ 1 BuriedPointSDK.kt\ncom/yalla/yalla/util/buriedpoint/core/BuriedPointSDK$buriedPointClog$1\n*L\n36#1:67\n40#1:68\n41#1:69\n*E\n"})
public final class BuriedPointSDK$buriedPointClog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f32833OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f32834OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f32835OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Map<String, Object> f32836OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuriedPointSDK$buriedPointClog$1(String str, String str2, Map<String, ? extends Object> map, Continuation<? super BuriedPointSDK$buriedPointClog$1> continuation) {
        super(2, continuation);
        this.f32835OooO0o0 = str;
        this.f32834OooO0o = str2;
        this.f32836OooO0oO = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BuriedPointSDK$buriedPointClog$1(this.f32835OooO0o0, this.f32834OooO0o, this.f32836OooO0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BuriedPointSDK$buriedPointClog$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f32833OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            BuriedPoint.Factory factory = BuriedPoint.Factory.INSTANCE;
            String str = this.f32835OooO0o0;
            BuriedPoint buriedPointCreate = factory.create(str, this.f32834OooO0o, this.f32836OooO0oO);
            buriedPointCreate.setEventTime(System.currentTimeMillis());
            Function2<? super String, ? super Throwable, Unit> function2 = OooO00o.f10146OooO00o;
            String strOooO0oo = OooO00o.OooO00o().OooO0oo(CollectionsKt.listOf(buriedPointCreate));
            if (strOooO0oo == null) {
                strOooO0oo = "";
            }
            OooOOO0.OooO0OO("BuriedPointSDK", "eventId is " + str + ", json is :" + strOooO0oo);
            Intrinsics.checkNotNullParameter("/Webservers/events/point", "<this>");
            String url = o000OOo0.OooO0o0(7, "/Webservers/events/point");
            Intrinsics.checkNotNullParameter(url, "url");
            o0O0ooO o0o0ooo = new o0O0ooO(url, 1);
            o0o0ooo.OooO0O0("1", "type");
            o0o0ooo.OooO0O0(str, "event_id");
            String strOooO0oo2 = OooO00o.OooO00o().OooO0oo(CollectionsKt.listOf(buriedPointCreate));
            o0o0ooo.OooO0O0(strOooO0oo2 != null ? strOooO0oo2 : "", "content");
            BuriedPointSDK$buriedPointClog$1$invokeSuspend$$inlined$call$1 buriedPointSDK$buriedPointClog$1$invokeSuspend$$inlined$call$1 = new BuriedPointSDK$buriedPointClog$1$invokeSuspend$$inlined$call$1(o0o0ooo, null);
            this.f32833OooO0Oo = 1;
            if (OooOOO.OooO0Oo(buriedPointSDK$buriedPointClog$1$invokeSuspend$$inlined$call$1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}

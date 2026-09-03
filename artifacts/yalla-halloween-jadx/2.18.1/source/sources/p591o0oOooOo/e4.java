package p591o0oOooOo;

import androidx.lifecycle.LifecycleOwner;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.ui.vm.event.EventCreateViewModel;
import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import o0o0000.o000oOoO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p516o0o0O000.o0OOO0o;
import p584o0oOoo.o000O;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.screen.event.EventCreateScreen$toEventCreate$1", f = "EventCreateScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class e4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ EventCreateViewModel f47226Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f47227Oooo0oO;

    public static final class OooO00o extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f47228Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(EventCreateViewModel eventCreateViewModel) {
            super(1);
            this.f47228Oooo0o = eventCreateViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("roomid", String.valueOf(this.f47228Oooo0o.getRoomId()));
            linkedHashMap.put("roomeventid", String.valueOf(l));
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(linkedHashMap);
            if (strOooO0oo == null) {
                strOooO0oo = "";
            } else {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
            }
            LiveEventBus.get("EVENT_CREATE_SUCCESS").post(strOooO0oo);
            o000O o000o = o000O.f46945OooO00o;
            o000O.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(EventCreateViewModel eventCreateViewModel, LifecycleOwner lifecycleOwner, Continuation<? super e4> continuation) {
        super(2, continuation);
        this.f47226Oooo0o = eventCreateViewModel;
        this.f47227Oooo0oO = lifecycleOwner;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new e4(this.f47226Oooo0o, this.f47227Oooo0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((e4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        EventCreateViewModel eventCreateViewModel = this.f47226Oooo0o;
        o000oOoO.OooO0Oo(eventCreateViewModel.create(eventCreateViewModel.getCreateToken(), String.valueOf(this.f47226Oooo0o.getRoomId())), this.f47227Oooo0oO, new OooO00o(this.f47226Oooo0o));
        return Unit.INSTANCE;
    }
}

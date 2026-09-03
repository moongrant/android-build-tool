package p485o0o000oO;

import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.SilenceModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO00o;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMicMsgProcessor$parseBeBarredSpeakingMessage$1", f = "RoomMicMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o000OO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SilenceModel f48679OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO0O(SilenceModel silenceModel, Continuation<? super o000OO0O> continuation) {
        super(2, continuation);
        this.f48679OooO0Oo = silenceModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000OO0O(this.f48679OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000OO0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ArrayList arrayList = OooO00o.f24511OooO00o;
        SilenceModel silenceModel = this.f48679OooO0Oo;
        RoomUserInfoModel roomUserInfoModelOooO0o0 = OooO00o.OooO0o0(Boxing.boxLong(silenceModel.to.uid));
        MutableStateFlow<Boolean> silenced = roomUserInfoModelOooO0o0 != null ? roomUserInfoModelOooO0o0.getSilenced() : null;
        if (silenced != null) {
            silenced.setValue(Boxing.boxBoolean(silenceModel.silence));
        }
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Long l = (Long) o0O00oO0.OooOOo0().getValue();
        long j = silenceModel.to.uid;
        if (l != null && l.longValue() == j) {
            if (silenceModel.silence) {
                String strOooO00o = o0000O.OooO00o(o0000.OooO0OO(o000000.dailog_isSilence_1), silenceModel.from.name);
                if (!StringsKt.isBlank(strOooO00o)) {
                    o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO00o, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    }
                }
            } else {
                String strOooO00o2 = o0000O.OooO00o(o0000.OooO0OO(o000000.dailog_isSilence_0), silenceModel.from.name);
                if (!StringsKt.isBlank(strOooO00o2)) {
                    o000Oo0 o000oo0OooO00o2 = OooOo00.OooO00o(strOooO00o2, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o2.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}

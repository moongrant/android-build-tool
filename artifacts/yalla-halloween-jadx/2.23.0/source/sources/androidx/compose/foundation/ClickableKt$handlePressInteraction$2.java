package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import com.facebook.GraphResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", f = "Clickable.kt", i = {0, 1, 2}, l = {299, 301, 308, 309, 318}, m = "invokeSuspend", n = {"delayJob", GraphResponse.SUCCESS_KEY, "release"}, s = {"L$0", "Z$0", "L$0"})
public final class ClickableKt$handlePressInteraction$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Boolean> $delayPressInteraction;
    final /* synthetic */ AbstractClickableNode.InteractionData $interactionData;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ long $pressPoint;
    final /* synthetic */ PressGestureScope $this_handlePressInteraction;
    private /* synthetic */ Object L$0;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$handlePressInteraction$2(PressGestureScope pressGestureScope, long j, MutableInteractionSource mutableInteractionSource, AbstractClickableNode.InteractionData interactionData, Function0<Boolean> function0, Continuation<? super ClickableKt$handlePressInteraction$2> continuation) {
        super(2, continuation);
        this.$this_handlePressInteraction = pressGestureScope;
        this.$pressPoint = j;
        this.$interactionSource = mutableInteractionSource;
        this.$interactionData = interactionData;
        this.$delayPressInteraction = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ClickableKt$handlePressInteraction$2 clickableKt$handlePressInteraction$2 = new ClickableKt$handlePressInteraction$2(this.$this_handlePressInteraction, this.$pressPoint, this.$interactionSource, this.$interactionData, this.$delayPressInteraction, continuation);
        clickableKt$handlePressInteraction$2.L$0 = obj;
        return clickableKt$handlePressInteraction$2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008e  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b4 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Job jobLaunch$default;
        Object objTryAwaitRelease;
        boolean z;
        PressInteraction.Press press;
        PressInteraction.Release release;
        MutableInteractionSource mutableInteractionSource;
        PressInteraction.Release release2;
        MutableInteractionSource mutableInteractionSource2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jobLaunch$default = (Job) this.L$0;
                ResultKt.throwOnFailure(obj);
                objTryAwaitRelease = obj;
            } else if (i == 2) {
                z = this.Z$0;
                ResultKt.throwOnFailure(obj);
                if (z) {
                    press = new PressInteraction.Press(this.$pressPoint, null);
                    release = new PressInteraction.Release(press);
                    mutableInteractionSource = this.$interactionSource;
                    this.L$0 = release;
                    this.label = 3;
                    if (mutableInteractionSource.emit(press, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    release2 = release;
                    mutableInteractionSource2 = this.$interactionSource;
                    this.L$0 = null;
                    this.label = 4;
                    if (mutableInteractionSource2.emit(release2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i == 3) {
                release2 = (PressInteraction.Release) this.L$0;
                ResultKt.throwOnFailure(obj);
                mutableInteractionSource2 = this.$interactionSource;
                this.L$0 = null;
                this.label = 4;
                if (mutableInteractionSource2.emit(release2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 4 && i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$interactionData.setPressInteraction(null);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        jobLaunch$default = BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new ClickableKt$handlePressInteraction$2$delayJob$1(this.$delayPressInteraction, this.$pressPoint, this.$interactionSource, this.$interactionData, null), 3, null);
        PressGestureScope pressGestureScope = this.$this_handlePressInteraction;
        this.L$0 = jobLaunch$default;
        this.label = 1;
        objTryAwaitRelease = pressGestureScope.tryAwaitRelease(this);
        if (objTryAwaitRelease == coroutine_suspended) {
            return coroutine_suspended;
        }
        boolean zBooleanValue = ((Boolean) objTryAwaitRelease).booleanValue();
        if (jobLaunch$default.isActive()) {
            this.L$0 = null;
            this.Z$0 = zBooleanValue;
            this.label = 2;
            if (JobKt.cancelAndJoin(jobLaunch$default, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            z = zBooleanValue;
            if (z) {
                press = new PressInteraction.Press(this.$pressPoint, null);
                release = new PressInteraction.Release(press);
                mutableInteractionSource = this.$interactionSource;
                this.L$0 = release;
                this.label = 3;
                if (mutableInteractionSource.emit(press, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                release2 = release;
                mutableInteractionSource2 = this.$interactionSource;
                this.L$0 = null;
                this.label = 4;
                if (mutableInteractionSource2.emit(release2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            PressInteraction.Press pressInteraction = this.$interactionData.getPressInteraction();
            if (pressInteraction != null) {
                MutableInteractionSource mutableInteractionSource3 = this.$interactionSource;
                Interaction release3 = zBooleanValue ? new PressInteraction.Release(pressInteraction) : new PressInteraction.Cancel(pressInteraction);
                this.L$0 = null;
                this.label = 5;
                if (mutableInteractionSource3.emit(release3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        this.$interactionData.setPressInteraction(null);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ClickableKt$handlePressInteraction$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}

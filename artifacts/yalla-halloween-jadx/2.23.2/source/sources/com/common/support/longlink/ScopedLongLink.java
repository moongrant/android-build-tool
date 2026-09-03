package com.common.support.longlink;

import com.qiniu.android.collect.ReportItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0002J;\u0010\u0010\u001a\u00020\u00112'\u0010\u0012\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0013¢\u0006\u0002\b\u0016H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/common/support/longlink/ScopedLongLink;", "IN", "Lcom/common/support/longlink/LongLink;", "coroutineParentContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "longLinkScope", "Lkotlinx/coroutines/CoroutineScope;", "getLongLinkScope$longlink_release", "()Lkotlinx/coroutines/CoroutineScope;", "cancelLongLinkScope", "", "close", "code", "", "createLongLinkScope", "launch", "Lkotlinx/coroutines/Job;", ReportItem.LogTypeBlock, "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "launch$longlink_release", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "longlink_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class ScopedLongLink<IN> implements LongLink<IN> {

    @Nullable
    private final CoroutineContext coroutineParentContext;

    @NotNull
    private final CoroutineScope longLinkScope;

    /* JADX WARN: Multi-variable type inference failed */
    public ScopedLongLink() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void cancelLongLinkScope() {
        CoroutineScopeKt.cancel$default(this.longLinkScope, null, 1, null);
    }

    private final CoroutineScope createLongLinkScope() {
        return new CoroutineScope(this) { // from class: com.common.support.longlink.ScopedLongLink.createLongLinkScope.1

            @NotNull
            private final CoroutineContext coroutineContext;
            final /* synthetic */ ScopedLongLink<IN> this$0;

            {
                this.this$0 = this;
                CoroutineContext coroutineContext = ((ScopedLongLink) this).coroutineParentContext;
                this.coroutineContext = coroutineContext == null ? SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()) : coroutineContext;
            }

            @Override // kotlinx.coroutines.CoroutineScope
            @NotNull
            public CoroutineContext getCoroutineContext() {
                return this.coroutineContext;
            }
        };
    }

    @Override // com.common.support.longlink.LongLink
    public void close(int code) {
        cancelLongLinkScope();
    }

    @NotNull
    /* JADX INFO: renamed from: getLongLinkScope$longlink_release, reason: from getter */
    public final CoroutineScope getLongLinkScope() {
        return this.longLinkScope;
    }

    @NotNull
    public final Job launch$longlink_release(@NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return BuildersKt__Builders_commonKt.launch$default(this.longLinkScope, null, null, new ScopedLongLink$launch$1(block, null), 3, null);
    }

    public ScopedLongLink(@Nullable CoroutineContext coroutineContext) {
        this.coroutineParentContext = coroutineContext;
        this.longLinkScope = createLongLinkScope();
    }

    public /* synthetic */ ScopedLongLink(CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : coroutineContext);
    }
}

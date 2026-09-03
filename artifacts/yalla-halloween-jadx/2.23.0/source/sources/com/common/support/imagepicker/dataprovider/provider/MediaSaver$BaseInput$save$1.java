package com.common.support.imagepicker.dataprovider.provider;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "com.common.support.imagepicker.dataprovider.provider.MediaSaver$BaseInput", f = "MediaSaver.kt", i = {}, l = {50}, m = "save", n = {}, s = {})
public final class MediaSaver$BaseInput$save$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MediaSaver.BaseInput this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaSaver$BaseInput$save$1(MediaSaver.BaseInput baseInput, Continuation<? super MediaSaver$BaseInput$save$1> continuation) {
        super(continuation);
        this.this$0 = baseInput;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.save(this);
    }
}

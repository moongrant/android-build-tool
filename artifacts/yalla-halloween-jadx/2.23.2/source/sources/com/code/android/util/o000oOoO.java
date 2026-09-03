package com.code.android.util;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO {
    public static SharedFlow OooO00o(ViewModel viewModel, Function2 block) {
        CoroutineDispatcher dispatcher = Dispatchers.getIO();
        Intrinsics.checkNotNullParameter(viewModel, "<this>");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(block, "block");
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(viewModel), dispatcher, null, new Oooo0(block, mutableSharedFlowMutableSharedFlow$default, null), 2, null);
        return FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }
}

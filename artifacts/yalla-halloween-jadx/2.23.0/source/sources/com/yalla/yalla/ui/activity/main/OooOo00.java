package com.yalla.yalla.ui.activity.main;

import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.vm.main.TaskViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p486o0o00O00.o00OOO0O;
import p519o0o0O0oO.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 extends Lambda implements Function3<String, OpenAuthManager.AuthType, String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TaskActivity f25455OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(TaskActivity taskActivity) {
        super(3);
        this.f25455OooO0Oo = taskActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(String str, OpenAuthManager.AuthType authType, String str2) {
        String str3 = str;
        TaskActivity taskActivity = this.f25455OooO0Oo;
        ((oO00O0oO) taskActivity.f25544OooOoO.getValue()).show();
        TaskViewModel taskViewModel = (TaskViewModel) taskActivity.f25545OooOoO0.getValue();
        Intrinsics.checkNotNull(str3);
        taskViewModel.yallaChatBindTask(str3).observe(taskActivity, new TaskActivity.OooOo00(new o00OOO0O(taskActivity)));
        return Unit.INSTANCE;
    }
}

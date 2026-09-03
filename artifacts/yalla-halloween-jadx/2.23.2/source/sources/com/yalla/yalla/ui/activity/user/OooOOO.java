package com.yalla.yalla.ui.activity.user;

import android.os.Looper;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.user.UserHeaderFrameModel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f26663OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UserHeaderFrameActivity f26664OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserHeaderFrameModel f26665OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(int i, UserHeaderFrameModel userHeaderFrameModel, UserHeaderFrameActivity userHeaderFrameActivity) {
        super(userHeaderFrameActivity);
        this.f26664OooO0o0 = userHeaderFrameActivity;
        this.f26663OooO0o = i;
        this.f26665OooO0oO = userHeaderFrameModel;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0O0(@NotNull String code, @NotNull String message) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        super.OooO0O0(code, message);
        this.f26664OooO0o0.f26767OooOo0 = false;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(@NotNull String response) {
        UserHeaderFrameActivity userHeaderFrameActivity = this.f26664OooO0o0;
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            try {
                int i = userHeaderFrameActivity.f26770OooOo0o;
                UserHeaderFrameModel userHeaderFrameModel = this.f26665OooO0oO;
                boolean z = true;
                if (i >= 0) {
                    ArrayList arrayList = userHeaderFrameActivity.f26768OooOo00;
                    int size = arrayList.size();
                    int i2 = userHeaderFrameActivity.f26770OooOo0o;
                    if (size > i2) {
                        UserHeaderFrameModel userHeaderFrameModel2 = (UserHeaderFrameModel) arrayList.get(i2);
                        if (userHeaderFrameModel2.getIsweared() == 1) {
                            userHeaderFrameModel2.setIsweared(0);
                        }
                    }
                    userHeaderFrameActivity.f26770OooOo0o = this.f26663OooO0o;
                    userHeaderFrameModel.setIsweared(1);
                    ((OooOO0O) userHeaderFrameActivity.f26771OooOoO.getValue()).notifyItemChanged(userHeaderFrameActivity.f26770OooOo0o);
                }
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                o0O00oO0.OooO0oo().postValue(userHeaderFrameModel.getPic());
                userHeaderFrameActivity.OooOoO0().f45277OooO0Oo.setVisibility(8);
                String strOooO0OO = o0000.OooO0OO(o000000.Operation_succeeded);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (!z) {
                    o000Oo0 runnable = new o000Oo0(strOooO0OO);
                    Intrinsics.checkNotNullParameter(runnable, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        runnable.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(runnable);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            userHeaderFrameActivity.f26767OooOo0 = false;
        }
    }
}

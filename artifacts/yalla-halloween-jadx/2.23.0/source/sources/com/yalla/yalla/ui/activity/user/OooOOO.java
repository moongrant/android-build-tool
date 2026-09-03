package com.yalla.yalla.ui.activity.user;

import android.os.Looper;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.user.UserHeaderFrameModel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f27130OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UserHeaderFrameActivity f27131OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserHeaderFrameModel f27132OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(int i, UserHeaderFrameModel userHeaderFrameModel, UserHeaderFrameActivity userHeaderFrameActivity) {
        super(userHeaderFrameActivity);
        this.f27131OooO0o0 = userHeaderFrameActivity;
        this.f27130OooO0o = i;
        this.f27132OooO0oO = userHeaderFrameModel;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0O0(@NotNull String code, @NotNull String message) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        super.OooO0O0(code, message);
        this.f27131OooO0o0.f27232OooOo0 = false;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(@NotNull String response) {
        UserHeaderFrameActivity userHeaderFrameActivity = this.f27131OooO0o0;
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            try {
                int i = userHeaderFrameActivity.f27235OooOo0o;
                UserHeaderFrameModel userHeaderFrameModel = this.f27132OooO0oO;
                boolean z = true;
                if (i >= 0) {
                    ArrayList arrayList = userHeaderFrameActivity.f27233OooOo00;
                    int size = arrayList.size();
                    int i2 = userHeaderFrameActivity.f27235OooOo0o;
                    if (size > i2) {
                        UserHeaderFrameModel userHeaderFrameModel2 = (UserHeaderFrameModel) arrayList.get(i2);
                        if (userHeaderFrameModel2.getIsweared() == 1) {
                            userHeaderFrameModel2.setIsweared(0);
                        }
                    }
                    userHeaderFrameActivity.f27235OooOo0o = this.f27130OooO0o;
                    userHeaderFrameModel.setIsweared(1);
                    ((OooOO0O) userHeaderFrameActivity.f27236OooOoO.getValue()).notifyItemChanged(userHeaderFrameActivity.f27235OooOo0o);
                }
                o000000O o000000o2 = o000000O.f46674OooO00o;
                o000000O.OooO0oo().postValue(userHeaderFrameModel.getPic());
                userHeaderFrameActivity.OooOoO0().f58703OooO0Oo.setVisibility(8);
                String strOooO0OO = o0000.OooO0OO(oO00OOo0.Operation_succeeded);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (!z) {
                    o000Oo0 runnable = new o000Oo0(strOooO0OO);
                    Intrinsics.checkNotNullParameter(runnable, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        runnable.run();
                    } else {
                        o000O0.f10355OooO0O0.post(runnable);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            userHeaderFrameActivity.f27232OooOo0 = false;
        }
    }
}

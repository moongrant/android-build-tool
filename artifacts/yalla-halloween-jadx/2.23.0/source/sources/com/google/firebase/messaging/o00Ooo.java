package com.google.firebase.messaging;

import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00Ooo implements OnSuccessListener, androidx.activity.result.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f20369OooO0Oo;

    public /* synthetic */ o00Ooo(Object obj) {
        this.f20369OooO0Oo = obj;
    }

    @Override // androidx.activity.result.OooO00o
    public final void onActivityResult(Object obj) {
        p331o0OO0o0.o000OOo this$0 = (p331o0OO0o0.o000OOo) this.f20369OooO0Oo;
        int i = p331o0OO0o0.o000OOo.f43179OooOO0o;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.OooO0O0()) {
            p331o0OO0o0.o0Oo0oo o0oo0oo2 = this$0.f43183OooO0o0;
            p331o0OO0o0.o000000 o000000Var = null;
            if (o0oo0oo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("task");
                o0oo0oo2 = null;
            }
            p331o0OO0o0.o000000 o000000Var2 = this$0.f43181OooO0Oo;
            if (o000000Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
            } else {
                o000000Var = o000000Var2;
            }
            o0oo0oo2.OooO0O0(new ArrayList(o000000Var.f43177OooOO0));
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        boolean z;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f20369OooO0Oo;
        o0000O o0000o2 = (o0000O) obj;
        o0000O00 o0000o00 = FirebaseMessaging.f20230OooOOO0;
        if (firebaseMessaging.OooO0oO()) {
            if (o0000o2.f20313OooO0oo.OooO00o() != null) {
                synchronized (o0000o2) {
                    z = o0000o2.f20312OooO0oO;
                }
                if (z) {
                    return;
                }
                o0000o2.OooO0oo(0L);
            }
        }
    }
}

package com.yalla.yalla.util.Function;

import com.yalla.yalla.model.http.ApiError;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import p375o0OOoOO.o00000O0;
import p519o0o0O0oO.O0000000;
import p519o0o0O0oO.o0O00O0o;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes5.dex */
public class OooO implements OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Deprecated
    public final O0000000 f32795OooO00o;

    @Deprecated
    public OooO() {
        com.code.android.util.OooO0O0.OooO0O0();
        if (this.f32795OooO00o == null) {
            o0O00O0o.OooO00o().getClass();
            this.f32795OooO00o = new O0000000();
        }
    }

    @Override // com.yalla.yalla.util.Function.OooO0o
    public final void OooO00o(String str) {
        OooO0O0(str, "");
    }

    @Override // com.yalla.yalla.util.Function.OooO0o
    public final void OooO0O0(String str, String str2) {
        OooOOO0.OooO0O0("OkHttpCallback ,OkHttpCallback = , onError");
        OooOOO0.OooO0O0("onError code = " + str + ", message = " + str2);
        int i = Integer.parseInt(str);
        if (str2 == null) {
            str2 = "";
        }
        ApiError error = new ApiError(i, str2, "");
        Intrinsics.checkNotNullParameter(error, "error");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
    }

    @Override // com.yalla.yalla.util.Function.OooO0o
    public final void OooO0OO() {
        OooOOO0.OooO0O0("OkHttpCallback ,OkHttpCallback = , onResponseLog");
    }

    @Override // com.yalla.yalla.util.Function.OooO0o
    public final void OooO0Oo() {
        OooOOO0.OooO0O0("OkHttpCallback ,OkHttpCallback = , afterRequest");
    }

    public final void OooO0o() {
        OooOOO0.OooO0O0("OkHttpCallback ,OkHttpCallback = , beforeRequest");
    }

    @Override // com.yalla.yalla.util.Function.OooO0o
    public void OooO0o0(String str) {
        throw null;
    }
}

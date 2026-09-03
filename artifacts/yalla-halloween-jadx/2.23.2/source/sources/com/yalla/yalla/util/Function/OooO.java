package com.yalla.yalla.util.Function;

import com.yalla.yalla.model.http.ApiError;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import p381o0OOoOo0.Oooo000;
import p598o0oo00Oo.o0000O00;
import p650o0ooo.a;
import p650o0ooo.o00O0OO0;

/* JADX INFO: loaded from: classes4.dex */
public class OooO implements OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Deprecated
    public final a f32259OooO00o;

    @Deprecated
    public OooO() {
        com.code.android.util.OooO0O0.OooO0O0();
        if (this.f32259OooO00o == null) {
            o00O0OO0.OooO00o().getClass();
            this.f32259OooO00o = new a();
        }
    }

    @Override // com.yalla.yalla.util.Function.OooO0o
    public final void OooO00o(String str) {
        OooO0O0(str, "");
    }

    @Override // com.yalla.yalla.util.Function.OooO0o
    public final void OooO0O0(String str, String str2) {
        o0000O00.OooO0O0("OkHttpCallback ,OkHttpCallback = , onError");
        o0000O00.OooO0O0("onError code = " + str + ", message = " + str2);
        int i = Integer.parseInt(str);
        if (str2 == null) {
            str2 = "";
        }
        ApiError error = new ApiError(i, str2, "");
        Intrinsics.checkNotNullParameter(error, "error");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo000(error, null), 3, null);
    }

    @Override // com.yalla.yalla.util.Function.OooO0o
    public final void OooO0OO() {
        o0000O00.OooO0O0("OkHttpCallback ,OkHttpCallback = , onResponseLog");
    }

    @Override // com.yalla.yalla.util.Function.OooO0o
    public final void OooO0Oo() {
        o0000O00.OooO0O0("OkHttpCallback ,OkHttpCallback = , afterRequest");
    }

    public final void OooO0o() {
        o0000O00.OooO0O0("OkHttpCallback ,OkHttpCallback = , beforeRequest");
    }

    @Override // com.yalla.yalla.util.Function.OooO0o
    public void OooO0o0(String str) {
        throw null;
    }
}
